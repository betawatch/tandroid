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
import r0.i0;
import r0.l0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

    public final boolean b(int i7, Menu menu) {
        return this.a.onMenuOpened(i7, menu);
    }

    public final void c(int i7, Menu menu) {
        this.a.onPanelClosed(i7, menu);
    }

    public final void d(List list, Menu menu, int i7) {
        k.k.a(this.a, list, menu, i7);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z9 = this.c;
        Window.Callback callback = this.a;
        return z9 ? callback.dispatchKeyEvent(keyEvent) : this.e.i(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        boolean z9;
        l.k kVar;
        boolean performShortcut;
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            s sVar = this.e;
            b0 p10 = sVar.p();
            if (p10 != null) {
                a0 a0Var = p10.i;
                if (a0Var == null || (kVar = a0Var.d) == null) {
                    performShortcut = false;
                } else {
                    kVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = kVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            r rVar = sVar.V;
            if (rVar == null || !sVar.t(rVar, keyEvent.getKeyCode(), keyEvent)) {
                if (sVar.V == null) {
                    r o4 = sVar.o(0);
                    sVar.u(o4, keyEvent);
                    boolean t6 = sVar.t(o4, keyEvent.getKeyCode(), keyEvent);
                    o4.k = false;
                }
                z9 = false;
                if (z9) {
                    return false;
                }
            } else {
                r rVar2 = sVar.V;
                if (rVar2 != null) {
                    rVar2.l = true;
                }
            }
            z9 = true;
            if (z9) {
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
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0 || (menu instanceof l.k)) {
            return this.a.onCreatePanelMenu(i7, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i7) {
        return this.a.onCreatePanelView(i7);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i7, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i7, Menu menu) {
        b0 p10;
        b(i7, menu);
        if (i7 == 108 && (p10 = this.e.p()) != null) {
            ArrayList arrayList = p10.m;
            if (true != p10.l) {
                p10.l = true;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        if (this.d) {
            this.a.onPanelClosed(i7, menu);
            return;
        }
        c(i7, menu);
        s sVar = this.e;
        if (i7 != 108) {
            if (i7 == 0) {
                r o4 = sVar.o(i7);
                if (o4.m) {
                    sVar.h(o4, false);
                    return;
                }
                return;
            }
            return;
        }
        b0 p10 = sVar.p();
        if (p10 != null) {
            ArrayList arrayList = p10.m;
            if (p10.l) {
                p10.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z9) {
        k.l.a(this.a, z9);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        l.k kVar = menu instanceof l.k ? (l.k) menu : null;
        if (i7 == 0 && kVar == null) {
            return false;
        }
        if (kVar != null) {
            kVar.x = true;
        }
        boolean onPreparePanel = this.a.onPreparePanel(i7, view, menu);
        if (kVar != null) {
            kVar.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
        l.k kVar = this.e.o(0).h;
        if (kVar != null) {
            d(list, kVar, i7);
        } else {
            d(list, menu, i7);
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
    public final void onWindowFocusChanged(boolean z9) {
        this.a.onWindowFocusChanged(z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        ViewGroup viewGroup;
        s sVar = this.e;
        if (!sVar.H || i7 != 0) {
            return k.j.b(this.a, callback, i7);
        }
        Context context = sVar.e;
        ui.e eVar = new ui.e(context, callback);
        k.a aVar = sVar.y;
        if (aVar != null) {
            aVar.b();
        }
        q4.q qVar = new q4.q(23, sVar, eVar);
        b0 p10 = sVar.p();
        if (p10 != null) {
            a0 a0Var = p10.i;
            if (a0Var != null) {
                a0Var.b();
            }
            p10.c.setHideOnContentScrollEnabled(false);
            p10.f.e();
            a0 a0Var2 = new a0(p10, p10.f.getContext(), qVar);
            l.k kVar = a0Var2.d;
            kVar.w();
            try {
                if (((ui.e) a0Var2.e.b).O(a0Var2, kVar)) {
                    p10.i = a0Var2;
                    a0Var2.h();
                    p10.f.c(a0Var2);
                    p10.a(true);
                } else {
                    a0Var2 = null;
                }
                sVar.y = a0Var2;
            } finally {
                kVar.v();
            }
        }
        if (sVar.y == null) {
            l0 l0Var = sVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            k.a aVar2 = sVar.y;
            if (aVar2 != null) {
                aVar2.b();
            }
            if (sVar.D == null) {
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
                    sVar.D = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    sVar.E = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    sVar.E.setContentView(sVar.D);
                    sVar.E.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    sVar.D.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    sVar.E.setHeight(-2);
                    sVar.F = new h(sVar, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) sVar.J.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(sVar.m()));
                        sVar.D = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (sVar.D != null) {
                l0 l0Var2 = sVar.G;
                if (l0Var2 != null) {
                    l0Var2.b();
                }
                sVar.D.e();
                Context context2 = sVar.D.getContext();
                ActionBarContextView actionBarContextView = sVar.D;
                k.d dVar = new k.d();
                dVar.c = context2;
                dVar.d = actionBarContextView;
                dVar.e = qVar;
                l.k kVar2 = new l.k(actionBarContextView.getContext());
                kVar2.l = 1;
                dVar.n = kVar2;
                kVar2.e = dVar;
                if (eVar.O(dVar, kVar2)) {
                    dVar.h();
                    sVar.D.c(dVar);
                    sVar.y = dVar;
                    if (sVar.I && (viewGroup = sVar.J) != null) {
                        WeakHashMap weakHashMap = i0.a;
                        if (viewGroup.isLaidOut()) {
                            sVar.D.setAlpha(0.0f);
                            l0 a10 = i0.a(sVar.D);
                            a10.a(1.0f);
                            sVar.G = a10;
                            a10.d(new j(sVar, 1));
                            if (sVar.E != null) {
                                sVar.f.getDecorView().post(sVar.F);
                            }
                        }
                    }
                    sVar.D.setAlpha(1.0f);
                    sVar.D.setVisibility(0);
                    if (sVar.D.getParent() instanceof View) {
                        View view = (View) sVar.D.getParent();
                        WeakHashMap weakHashMap2 = i0.a;
                        r0.y.c(view);
                    }
                    if (sVar.E != null) {
                    }
                } else {
                    sVar.y = null;
                }
            }
            sVar.w();
            sVar.y = sVar.y;
        }
        sVar.w();
        k.a aVar3 = sVar.y;
        if (aVar3 != null) {
            return eVar.r(aVar3);
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
