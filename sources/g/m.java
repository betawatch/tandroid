package g;

import android.content.Context;
import android.content.res.Resources;
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
import org.telegram.messenger.beta.R;
import r0.h0;
import r0.k0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ r e;

    public m(r rVar, Window.Callback callback) {
        this.e = rVar;
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
        boolean z10 = this.c;
        Window.Callback callback = this.a;
        return z10 ? callback.dispatchKeyEvent(keyEvent) : this.e.i(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        boolean z10;
        l.l lVar;
        boolean performShortcut;
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            r rVar = this.e;
            b0 q6 = rVar.q();
            if (q6 != null) {
                a0 a0Var = q6.i;
                if (a0Var == null || (lVar = a0Var.d) == null) {
                    performShortcut = false;
                } else {
                    lVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = lVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            q qVar = rVar.V;
            if (qVar == null || !rVar.v(qVar, keyEvent.getKeyCode(), keyEvent)) {
                if (rVar.V == null) {
                    q o10 = rVar.o(0);
                    rVar.w(o10, keyEvent);
                    boolean v = rVar.v(o10, keyEvent.getKeyCode(), keyEvent);
                    o10.k = false;
                }
                z10 = false;
                if (z10) {
                    return false;
                }
            } else {
                q qVar2 = rVar.V;
                if (qVar2 != null) {
                    qVar2.l = true;
                }
            }
            z10 = true;
            if (z10) {
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
        if (i10 != 0 || (menu instanceof l.l)) {
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
        b0 q6;
        b(i10, menu);
        if (i10 == 108 && (q6 = this.e.q()) != null) {
            ArrayList arrayList = q6.m;
            if (true != q6.l) {
                q6.l = true;
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
        r rVar = this.e;
        if (i10 != 108) {
            if (i10 == 0) {
                q o10 = rVar.o(i10);
                if (o10.m) {
                    rVar.h(o10, false);
                    return;
                }
                return;
            }
            return;
        }
        b0 q6 = rVar.q();
        if (q6 != null) {
            ArrayList arrayList = q6.m;
            if (q6.l) {
                q6.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z10) {
        k.m.a(this.a, z10);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        l.l lVar = menu instanceof l.l ? (l.l) menu : null;
        if (i10 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.x = true;
        }
        boolean onPreparePanel = this.a.onPreparePanel(i10, view, menu);
        if (lVar != null) {
            lVar.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l.l lVar = this.e.o(0).h;
        if (lVar != null) {
            d(list, lVar, i10);
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
    public final void onWindowFocusChanged(boolean z10) {
        this.a.onWindowFocusChanged(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01c9  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        ViewGroup viewGroup;
        r rVar = this.e;
        if (!rVar.H || i10 != 0) {
            return k.k.b(this.a, callback, i10);
        }
        Context context = rVar.e;
        xa.n nVar = new xa.n();
        nVar.b = context;
        nVar.a = callback;
        nVar.c = new ArrayList();
        boolean z10 = false;
        nVar.d = new a0.l(0);
        k.a aVar = rVar.y;
        if (aVar != null) {
            aVar.b();
        }
        n4.q qVar = new n4.q(rVar, nVar, z10);
        b0 q6 = rVar.q();
        if (q6 != null) {
            a0 a0Var = q6.i;
            if (a0Var != null) {
                a0Var.b();
            }
            q6.c.setHideOnContentScrollEnabled(false);
            q6.f.e();
            a0 a0Var2 = new a0(q6, q6.f.getContext(), qVar);
            l.l lVar = a0Var2.d;
            lVar.w();
            try {
                if (((xa.n) a0Var2.e.a).S(a0Var2, lVar)) {
                    q6.i = a0Var2;
                    a0Var2.h();
                    q6.f.c(a0Var2);
                    q6.a(true);
                } else {
                    a0Var2 = null;
                }
                rVar.y = a0Var2;
            } finally {
                lVar.v();
            }
        }
        if (rVar.y == null) {
            k0 k0Var = rVar.G;
            if (k0Var != null) {
                k0Var.b();
            }
            k.a aVar2 = rVar.y;
            if (aVar2 != null) {
                aVar2.b();
            }
            if (rVar.D == null) {
                if (rVar.R) {
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
                    rVar.D = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    rVar.E = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    rVar.E.setContentView(rVar.D);
                    rVar.E.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    rVar.D.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    rVar.E.setHeight(-2);
                    rVar.F = new h(rVar, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) rVar.J.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(rVar.m()));
                        rVar.D = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (rVar.D != null) {
                k0 k0Var2 = rVar.G;
                if (k0Var2 != null) {
                    k0Var2.b();
                }
                rVar.D.e();
                Context context2 = rVar.D.getContext();
                ActionBarContextView actionBarContextView = rVar.D;
                k.d dVar = new k.d();
                dVar.c = context2;
                dVar.d = actionBarContextView;
                dVar.e = qVar;
                l.l lVar2 = new l.l(actionBarContextView.getContext());
                lVar2.l = 1;
                dVar.n = lVar2;
                lVar2.e = dVar;
                if (nVar.S(dVar, lVar2)) {
                    dVar.h();
                    rVar.D.c(dVar);
                    rVar.y = dVar;
                    if (rVar.I && (viewGroup = rVar.J) != null) {
                        WeakHashMap weakHashMap = h0.a;
                        if (viewGroup.isLaidOut()) {
                            rVar.D.setAlpha(0.0f);
                            k0 a2 = h0.a(rVar.D);
                            a2.a(1.0f);
                            rVar.G = a2;
                            a2.d(new i(rVar, 1));
                            if (rVar.E != null) {
                                rVar.f.getDecorView().post(rVar.F);
                            }
                        }
                    }
                    rVar.D.setAlpha(1.0f);
                    rVar.D.setVisibility(0);
                    if (rVar.D.getParent() instanceof View) {
                        View view = (View) rVar.D.getParent();
                        WeakHashMap weakHashMap2 = h0.a;
                        r0.x.c(view);
                    }
                    if (rVar.E != null) {
                    }
                } else {
                    rVar.y = null;
                }
            }
            rVar.y();
            rVar.y = rVar.y;
        }
        rVar.y();
        k.a aVar3 = rVar.y;
        if (aVar3 != null) {
            return nVar.v(aVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
