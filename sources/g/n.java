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
import org.telegram.messenger.beta.R;
import r0.i0;
import r0.l0;
import w7.p7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ s e;

    public n(s sVar, Window.Callback callback) {
        this.e = sVar;
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
        k.k.a(this.a, list, menu, i10);
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
            s sVar = this.e;
            c0 q6 = sVar.q();
            if (q6 != null) {
                b0 b0Var = q6.i;
                if (b0Var == null || (lVar = b0Var.d) == null) {
                    performShortcut = false;
                } else {
                    lVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = lVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            r rVar = sVar.V;
            if (rVar == null || !sVar.u(rVar, keyEvent.getKeyCode(), keyEvent)) {
                if (sVar.V == null) {
                    r p5 = sVar.p(0);
                    sVar.v(p5, keyEvent);
                    boolean u10 = sVar.u(p5, keyEvent.getKeyCode(), keyEvent);
                    p5.k = false;
                }
                z10 = false;
                if (z10) {
                    return false;
                }
            } else {
                r rVar2 = sVar.V;
                if (rVar2 != null) {
                    rVar2.l = true;
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
        s sVar = this.e;
        Context context = sVar.e;
        com.google.firebase.messaging.s sVar2 = new com.google.firebase.messaging.s(context, callback);
        k.a aVar = sVar.x;
        if (aVar != null) {
            aVar.a();
        }
        of.b bVar = new of.b(13, sVar, sVar2);
        c0 q6 = sVar.q();
        int i10 = 1;
        if (q6 != null) {
            b0 b0Var = q6.i;
            if (b0Var != null) {
                b0Var.a();
            }
            q6.c.setHideOnContentScrollEnabled(false);
            q6.f.e();
            b0 b0Var2 = new b0(q6, q6.f.getContext(), bVar);
            l.l lVar = b0Var2.d;
            lVar.w();
            try {
                if (((com.google.firebase.messaging.s) b0Var2.e.b).h(b0Var2, lVar)) {
                    q6.i = b0Var2;
                    b0Var2.g();
                    q6.f.c(b0Var2);
                    q6.a(true);
                } else {
                    b0Var2 = null;
                }
                sVar.x = b0Var2;
            } finally {
                lVar.v();
            }
        }
        if (sVar.x == null) {
            l0 l0Var = sVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            k.a aVar2 = sVar.x;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (sVar.y == null) {
                if (sVar.R) {
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
                    sVar.y = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    sVar.E = popupWindow;
                    p7.b(popupWindow, 2);
                    sVar.E.setContentView(sVar.y);
                    sVar.E.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    sVar.y.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    sVar.E.setHeight(-2);
                    sVar.F = new i(sVar, i10);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) sVar.J.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(sVar.m()));
                        sVar.y = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (sVar.y != null) {
                l0 l0Var2 = sVar.G;
                if (l0Var2 != null) {
                    l0Var2.b();
                }
                sVar.y.e();
                Context context2 = sVar.y.getContext();
                ActionBarContextView actionBarContextView = sVar.y;
                k.d dVar = new k.d();
                dVar.c = context2;
                dVar.d = actionBarContextView;
                dVar.e = bVar;
                l.l lVar2 = new l.l(actionBarContextView.getContext());
                lVar2.l = 1;
                dVar.n = lVar2;
                lVar2.e = dVar;
                if (sVar2.h(dVar, lVar2)) {
                    dVar.g();
                    sVar.y.c(dVar);
                    sVar.x = dVar;
                    if (sVar.I && (viewGroup = sVar.J) != null) {
                        WeakHashMap weakHashMap = i0.a;
                        if (viewGroup.isLaidOut()) {
                            sVar.y.setAlpha(0.0f);
                            l0 a2 = i0.a(sVar.y);
                            a2.a(1.0f);
                            sVar.G = a2;
                            a2.d(new j(sVar, i10));
                            if (sVar.E != null) {
                                sVar.f.getDecorView().post(sVar.F);
                            }
                        }
                    }
                    sVar.y.setAlpha(1.0f);
                    sVar.y.setVisibility(0);
                    if (sVar.y.getParent() instanceof View) {
                        View view = (View) sVar.y.getParent();
                        WeakHashMap weakHashMap2 = i0.a;
                        r0.y.c(view);
                    }
                    if (sVar.E != null) {
                    }
                } else {
                    sVar.x = null;
                }
            }
            sVar.x();
            sVar.x = sVar.x;
        }
        sVar.x();
        k.a aVar3 = sVar.x;
        if (aVar3 != null) {
            return sVar2.c(aVar3);
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
        c0 q6;
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
        s sVar = this.e;
        if (i10 != 108) {
            if (i10 == 0) {
                r p5 = sVar.p(i10);
                if (p5.m) {
                    sVar.h(p5, false);
                    return;
                }
                return;
            }
            return;
        }
        c0 q6 = sVar.q();
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
        k.l.a(this.a, z10);
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
        return k.j.a(this.a, searchEvent);
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
        return this.e.H ? e(callback) : this.a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        if (this.e.H && i10 == 0) {
            return e(callback);
        }
        return k.j.b(this.a, callback, i10);
    }
}
