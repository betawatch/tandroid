package j1;

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
import org.telegram.ui.Cells.f1;
import r0.j0;
import s0.d;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class b extends r0.b {
    public static final Rect n = new Rect(ConnectionsManager.DEFAULT_DATACENTER_ID, ConnectionsManager.DEFAULT_DATACENTER_ID, TLObject.FLAG_31, TLObject.FLAG_31);
    public final AccessibilityManager h;
    public final View i;
    public a j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = TLObject.FLAG_31;
    public int l = TLObject.FLAG_31;
    public int m = TLObject.FLAG_31;

    public b(View view) {
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = j0.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // r0.b
    public final f1 a(View view) {
        if (this.j == null) {
            this.j = new a(this);
        }
        return this.j;
    }

    @Override // r0.b
    public final void c(View view, d dVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
    }

    public final AccessibilityEvent e(int i10, int i11) {
        View view = this.i;
        if (i10 == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i11);
        d j10 = j(i10);
        obtain2.getText().add(j10.g());
        AccessibilityNodeInfo accessibilityNodeInfo = j10.a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        obtain2.setSource(view, i10);
        obtain2.setPackageName(view.getContext().getPackageName());
        return obtain2;
    }

    public final boolean f(MotionEvent motionEvent) {
        int i10;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int g10 = g(motionEvent.getX(), motionEvent.getY());
            int i11 = this.m;
            if (i11 != g10) {
                this.m = g10;
                m(g10, 128);
                m(i11, 256);
            }
            if (g10 == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i10 = this.m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.m = TLObject.FLAG_31;
                m(TLObject.FLAG_31, 128);
                m(i10, 256);
                return true;
            }
        }
        return true;
    }

    public abstract int g(float f10, float f11);

    public abstract void h(ArrayList arrayList);

    public final void i() {
        View view;
        ViewParent parent;
        if (!this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        AccessibilityEvent e6 = e(-1, 2048);
        e6.setContentChangeTypes(1);
        parent.requestSendAccessibilityEvent(view, e6);
    }

    public final d j(int i10) {
        View view = this.i;
        if (i10 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            d dVar = new d(obtain);
            WeakHashMap weakHashMap = j0.a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            h(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                dVar.a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
            }
            return dVar;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
        d dVar2 = new d(obtain2);
        obtain2.setEnabled(true);
        obtain2.setFocusable(true);
        dVar2.i("android.view.View");
        Rect rect = n;
        dVar2.h(rect);
        obtain2.setBoundsInScreen(rect);
        obtain2.setParent(view);
        l(i10, dVar2);
        if (dVar2.g() == null && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        obtain2.getBoundsInParent(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain2.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        dVar2.b = i10;
        obtain2.setSource(view, i10);
        if (this.k == i10) {
            obtain2.setAccessibilityFocused(true);
            dVar2.a(128);
        } else {
            obtain2.setAccessibilityFocused(false);
            dVar2.a(64);
        }
        boolean z4 = this.l == i10;
        if (z4) {
            dVar2.a(2);
        } else if (obtain2.isFocusable()) {
            dVar2.a(1);
        }
        obtain2.setFocused(z4);
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
                            dVar2.p(true);
                        }
                    }
                }
            }
        }
        return dVar2;
    }

    public abstract boolean k(int i10, int i11);

    public abstract void l(int i10, d dVar);

    public final void m(int i10, int i11) {
        View view;
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, e(i10, i11));
    }
}
