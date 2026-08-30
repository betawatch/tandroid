package g;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k7.w7;
import org.telegram.messenger.beta.R;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class m implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ q e;

    public m(q qVar, Window.Callback callback) {
        this.e = qVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.b = true;
            callback.onContentChanged();
        } finally {
            this.b = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.a.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.a.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        k.l.a(this.a, list, menu, i10);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4 = this.c;
        Window.Callback callback = this.a;
        return z4 ? callback.dispatchKeyEvent(keyEvent) : this.e.j(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006d A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z4;
        l.k kVar;
        boolean performShortcut;
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            q qVar = this.e;
            a0 r10 = qVar.r();
            if (r10 != null) {
                z zVar = r10.i;
                if (zVar == null || (kVar = zVar.d) == null) {
                    performShortcut = false;
                } else {
                    kVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = kVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            p pVar = qVar.S;
            if (pVar == null || !qVar.v(pVar, keyEvent.getKeyCode(), keyEvent)) {
                if (qVar.S == null) {
                    p q10 = qVar.q(0);
                    qVar.w(q10, keyEvent);
                    boolean v = qVar.v(q10, keyEvent.getKeyCode(), keyEvent);
                    q10.k = false;
                }
                z4 = false;
                if (z4) {
                    return false;
                }
            } else {
                p pVar2 = qVar.S;
                if (pVar2 != null) {
                    pVar2.l = true;
                }
            }
            z4 = true;
            if (z4) {
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k.e e(ActionMode.Callback callback) {
        ViewGroup viewGroup;
        q qVar = this.e;
        Context context = qVar.e;
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(context, callback);
        k.a aVar = qVar.x;
        if (aVar != null) {
            aVar.a();
        }
        f7.b bVar = new f7.b(qVar, rVar, false, 2);
        a0 r10 = qVar.r();
        int i10 = 1;
        if (r10 != null) {
            z zVar = r10.i;
            if (zVar != null) {
                zVar.a();
            }
            r10.c.setHideOnContentScrollEnabled(false);
            r10.f.e();
            z zVar2 = new z(r10, r10.f.getContext(), bVar);
            l.k kVar = zVar2.d;
            kVar.w();
            try {
                if (((com.google.firebase.messaging.r) zVar2.e.b).L(zVar2, kVar)) {
                    r10.i = zVar2;
                    zVar2.g();
                    r10.f.c(zVar2);
                    r10.a(true);
                } else {
                    zVar2 = null;
                }
                qVar.x = zVar2;
            } finally {
                kVar.v();
            }
        }
        if (qVar.x == null) {
            m0 m0Var = qVar.D;
            if (m0Var != null) {
                m0Var.b();
            }
            k.a aVar2 = qVar.x;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (qVar.y == null) {
                if (qVar.O) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        k.c cVar = new k.c(context, 0);
                        cVar.getTheme().setTo(newTheme);
                        context = cVar;
                    }
                    qVar.y = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    qVar.B = popupWindow;
                    w7.b(popupWindow, 2);
                    qVar.B.setContentView(qVar.y);
                    qVar.B.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    qVar.y.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    qVar.B.setHeight(-2);
                    qVar.C = new h(qVar, i10);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) qVar.G.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(qVar.n()));
                        qVar.y = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (qVar.y != null) {
                m0 m0Var2 = qVar.D;
                if (m0Var2 != null) {
                    m0Var2.b();
                }
                qVar.y.e();
                Context context2 = qVar.y.getContext();
                ActionBarContextView actionBarContextView = qVar.y;
                k.d dVar = new k.d();
                dVar.c = context2;
                dVar.d = actionBarContextView;
                dVar.e = bVar;
                l.k kVar2 = new l.k(actionBarContextView.getContext());
                kVar2.l = 1;
                dVar.n = kVar2;
                kVar2.e = dVar;
                if (rVar.L(dVar, kVar2)) {
                    dVar.g();
                    qVar.y.c(dVar);
                    qVar.x = dVar;
                    if (qVar.F && (viewGroup = qVar.G) != null) {
                        WeakHashMap weakHashMap = j0.a;
                        if (viewGroup.isLaidOut()) {
                            qVar.y.setAlpha(0.0f);
                            m0 a2 = j0.a(qVar.y);
                            a2.a(1.0f);
                            qVar.D = a2;
                            a2.d(new i(qVar, i10));
                            if (qVar.B != null) {
                                qVar.f.getDecorView().post(qVar.C);
                            }
                        }
                    }
                    qVar.y.setAlpha(1.0f);
                    qVar.y.setVisibility(0);
                    if (qVar.y.getParent() instanceof View) {
                        View view = (View) qVar.y.getParent();
                        WeakHashMap weakHashMap2 = j0.a;
                        r0.z.c(view);
                    }
                    if (qVar.B != null) {
                    }
                } else {
                    qVar.x = null;
                }
            }
            qVar.y();
            qVar.x = qVar.x;
        }
        qVar.y();
        k.a aVar3 = qVar.x;
        if (aVar3 != null) {
            return rVar.w(aVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.b) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0 || (menu instanceof l.k)) {
            return this.a.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        return this.a.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        a0 r10;
        b(i10, menu);
        if (i10 == 108 && (r10 = this.e.r()) != null) {
            ArrayList arrayList = r10.m;
            if (true != r10.l) {
                r10.l = true;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.d) {
            this.a.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        q qVar = this.e;
        if (i10 != 108) {
            if (i10 == 0) {
                p q10 = qVar.q(i10);
                if (q10.m) {
                    qVar.h(q10, false);
                    return;
                }
                return;
            }
            return;
        }
        a0 r10 = qVar.r();
        if (r10 != null) {
            ArrayList arrayList = r10.m;
            if (r10.l) {
                r10.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z4) {
        k.m.a(this.a, z4);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        l.k kVar = menu instanceof l.k ? (l.k) menu : null;
        if (i10 == 0 && kVar == null) {
            return false;
        }
        if (kVar != null) {
            kVar.x = true;
        }
        boolean onPreparePanel = this.a.onPreparePanel(i10, view, menu);
        if (kVar != null) {
            kVar.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.k kVar = this.e.q(0).h;
        if (kVar != null) {
            d(list, kVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.k.a(this.a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        this.a.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        return this.e.E ? e(callback) : this.a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        if (this.e.E && i10 == 0) {
            return e(callback);
        }
        return k.k.b(this.a, callback, i10);
    }
}
