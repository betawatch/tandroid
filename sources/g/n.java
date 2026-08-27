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
import h7.o7;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ r e;

    public n(r rVar, Window.Callback callback) {
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
            q qVar = rVar.R;
            if (qVar == null || !rVar.v(qVar, keyEvent.getKeyCode(), keyEvent)) {
                if (rVar.R == null) {
                    q p6 = rVar.p(0);
                    rVar.w(p6, keyEvent);
                    boolean v = rVar.v(p6, keyEvent.getKeyCode(), keyEvent);
                    p6.k = false;
                }
                z10 = false;
                if (z10) {
                    return false;
                }
            } else {
                q qVar2 = rVar.R;
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

    /* JADX WARN: Removed duplicated region for block: B:57:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k.e e(ActionMode.Callback callback) {
        ViewGroup viewGroup;
        r rVar = this.e;
        Context context = rVar.e;
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(context, callback);
        k.a aVar = rVar.x;
        if (aVar != null) {
            aVar.a();
        }
        xe.b bVar = new xe.b(29, rVar, tVar);
        b0 q6 = rVar.q();
        int i10 = 1;
        if (q6 != null) {
            a0 a0Var = q6.i;
            if (a0Var != null) {
                a0Var.a();
            }
            q6.c.setHideOnContentScrollEnabled(false);
            q6.f.e();
            a0 a0Var2 = new a0(q6, q6.f.getContext(), bVar);
            l.l lVar = a0Var2.d;
            lVar.w();
            try {
                if (((com.google.firebase.messaging.t) a0Var2.e.b).G(a0Var2, lVar)) {
                    q6.i = a0Var2;
                    a0Var2.g();
                    q6.f.c(a0Var2);
                    q6.a(true);
                } else {
                    a0Var2 = null;
                }
                rVar.x = a0Var2;
            } finally {
                lVar.v();
            }
        }
        if (rVar.x == null) {
            m0 m0Var = rVar.C;
            if (m0Var != null) {
                m0Var.b();
            }
            k.a aVar2 = rVar.x;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (rVar.y == null) {
                if (rVar.N) {
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
                    rVar.y = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    rVar.A = popupWindow;
                    o7.b(popupWindow, 2);
                    rVar.A.setContentView(rVar.y);
                    rVar.A.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    rVar.y.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    rVar.A.setHeight(-2);
                    rVar.B = new i(rVar, i10);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) rVar.F.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(rVar.n()));
                        rVar.y = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (rVar.y != null) {
                m0 m0Var2 = rVar.C;
                if (m0Var2 != null) {
                    m0Var2.b();
                }
                rVar.y.e();
                Context context2 = rVar.y.getContext();
                ActionBarContextView actionBarContextView = rVar.y;
                k.d dVar = new k.d();
                dVar.c = context2;
                dVar.d = actionBarContextView;
                dVar.e = bVar;
                l.l lVar2 = new l.l(actionBarContextView.getContext());
                lVar2.l = 1;
                dVar.n = lVar2;
                lVar2.e = dVar;
                if (tVar.G(dVar, lVar2)) {
                    dVar.g();
                    rVar.y.c(dVar);
                    rVar.x = dVar;
                    if (rVar.E && (viewGroup = rVar.F) != null) {
                        WeakHashMap weakHashMap = j0.a;
                        if (viewGroup.isLaidOut()) {
                            rVar.y.setAlpha(0.0f);
                            m0 a2 = j0.a(rVar.y);
                            a2.a(1.0f);
                            rVar.C = a2;
                            a2.d(new j(rVar, i10));
                            if (rVar.A != null) {
                                rVar.f.getDecorView().post(rVar.B);
                            }
                        }
                    }
                    rVar.y.setAlpha(1.0f);
                    rVar.y.setVisibility(0);
                    if (rVar.y.getParent() instanceof View) {
                        View view = (View) rVar.y.getParent();
                        WeakHashMap weakHashMap2 = j0.a;
                        r0.z.c(view);
                    }
                    if (rVar.A != null) {
                    }
                } else {
                    rVar.x = null;
                }
            }
            rVar.y();
            rVar.x = rVar.x;
        }
        rVar.y();
        k.a aVar3 = rVar.x;
        if (aVar3 != null) {
            return tVar.r(aVar3);
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
                q p6 = rVar.p(i10);
                if (p6.m) {
                    rVar.h(p6, false);
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
        l.l lVar = this.e.p(0).h;
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

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        return this.e.D ? e(callback) : this.a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        if (this.e.D && i10 == 0) {
            return e(callback);
        }
        return k.k.b(this.a, callback, i10);
    }
}
