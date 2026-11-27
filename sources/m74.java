// default package

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class m74 extends r4 {
    public static final Rect n = new Rect(ConnectionsManager.DEFAULT_DATACENTER_ID, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, TLObject.FLAG_31);
    public final AccessibilityManager h;
    public final View i;
    public l74 j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = TLObject.FLAG_31;
    public int l = TLObject.FLAG_31;
    public int m = TLObject.FLAG_31;

    public m74(View view) {
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = ihc.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // r4
    public final ri6 a(View view) {
        l74 l74Var = this.j;
        if (l74Var != null) {
            return l74Var;
        }
        l74 l74Var2 = new l74(this);
        this.j = l74Var2;
        return l74Var2;
    }

    @Override // r4
    public final void c(View view, v4 v4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, v4Var.a);
    }

    public final AccessibilityEvent e(int i, int i2) {
        View view = this.i;
        if (i == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        v4 j = j(i);
        obtain2.getText().add(j.g());
        AccessibilityNodeInfo accessibilityNodeInfo = j.a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            xi4.l("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        obtain2.setSource(view, i);
        obtain2.setPackageName(view.getContext().getPackageName());
        return obtain2;
    }

    public final boolean f(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int g = g(motionEvent.getX(), motionEvent.getY());
            int i2 = this.m;
            if (i2 != g) {
                this.m = g;
                m(g, 128);
                m(i2, 256);
            }
            if (g == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.m = TLObject.FLAG_31;
                m(TLObject.FLAG_31, 128);
                m(i, 256);
                return true;
            }
        }
        return true;
    }

    public abstract int g(float f, float f2);

    public abstract void h(ArrayList arrayList);

    public final void i() {
        View view;
        ViewParent parent;
        if (!this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        AccessibilityEvent e = e(-1, 2048);
        e.setContentChangeTypes(1);
        parent.requestSendAccessibilityEvent(view, e);
    }

    public final v4 j(int i) {
        View view = this.i;
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            v4 v4Var = new v4(obtain);
            WeakHashMap weakHashMap = ihc.a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            h(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                xi4.l("Views cannot have both real and virtual children");
                return null;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                v4Var.a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
            }
            return v4Var;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
        v4 v4Var2 = new v4(obtain2);
        obtain2.setEnabled(true);
        obtain2.setFocusable(true);
        v4Var2.i("android.view.View");
        Rect rect = n;
        v4Var2.h(rect);
        obtain2.setBoundsInScreen(rect);
        obtain2.setParent(view);
        l(i, v4Var2);
        if (v4Var2.g() == null && obtain2.getContentDescription() == null) {
            xi4.l("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        obtain2.getBoundsInParent(rect2);
        if (rect2.equals(rect)) {
            xi4.l("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = obtain2.getActions();
        if ((actions & 64) != 0) {
            xi4.l("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            xi4.l("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        v4Var2.b = i;
        obtain2.setSource(view, i);
        if (this.k == i) {
            obtain2.setAccessibilityFocused(true);
            v4Var2.a(128);
        } else {
            obtain2.setAccessibilityFocused(false);
            v4Var2.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            v4Var2.a(2);
        } else if (obtain2.isFocusable()) {
            v4Var2.a(1);
        }
        obtain2.setFocused(z);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        obtain2.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            obtain2.getBoundsInParent(rect3);
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                obtain2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            v4Var2.p(true);
                        }
                    }
                }
            }
        }
        return v4Var2;
    }

    public boolean k(int i, int i2) {
        return false;
    }

    public abstract void l(int i, v4 v4Var);

    public final void m(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, e(i, i2));
    }
}
