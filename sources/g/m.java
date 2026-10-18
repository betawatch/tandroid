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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        return z10 ? callback.dispatchKeyEvent(keyEvent) : this.e.j(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
        l.k kVar;
        boolean performShortcut;
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            r rVar = this.e;
            a0 r10 = rVar.r();
            if (r10 != null) {
                z zVar = r10.i;
                if (zVar == null || (kVar = zVar.d) == null) {
                    performShortcut = false;
                } else {
                    kVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = kVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            q qVar = rVar.V;
            if (qVar == null || !rVar.v(qVar, keyEvent.getKeyCode(), keyEvent)) {
                if (rVar.V == null) {
                    q q6 = rVar.q(0);
                    rVar.w(q6, keyEvent);
                    boolean v = rVar.v(q6, keyEvent.getKeyCode(), keyEvent);
                    q6.k = false;
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
        r rVar = this.e;
        if (i10 != 108) {
            if (i10 == 0) {
                q q6 = rVar.q(i10);
                if (q6.m) {
                    rVar.i(q6, false);
                    return;
                }
                return;
            }
            return;
        }
        a0 r10 = rVar.r();
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
    public final void onPointerCaptureChanged(boolean z10) {
        k.l.a(this.a, z10);
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

    /* JADX WARN: Removed duplicated region for block: B:60:0x01cb  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        ViewGroup viewGroup;
        r rVar = this.e;
        if (!rVar.H || i10 != 0) {
            return k.j.b(this.a, callback, i10);
        }
        Context context = rVar.e;
        qi.e eVar = new qi.e();
        eVar.b = context;
        eVar.a = callback;
        eVar.c = new ArrayList();
        boolean z10 = false;
        eVar.d = new a0.l(0);
        k.a aVar = rVar.x;
        if (aVar != null) {
            aVar.a();
        }
        n4.s sVar = new n4.s(rVar, eVar, z10, 18);
        a0 r10 = rVar.r();
        int i11 = 1;
        if (r10 != null) {
            z zVar = r10.i;
            if (zVar != null) {
                zVar.a();
            }
            r10.c.setHideOnContentScrollEnabled(false);
            r10.f.e();
            z zVar2 = new z(r10, r10.f.getContext(), sVar);
            l.k kVar = zVar2.d;
            kVar.w();
            try {
                if (((qi.e) zVar2.e.b).B(zVar2, kVar)) {
                    r10.i = zVar2;
                    zVar2.h();
                    r10.f.c(zVar2);
                    r10.a(true);
                } else {
                    zVar2 = null;
                }
                rVar.x = zVar2;
            } finally {
                kVar.v();
            }
        }
        if (rVar.x == null) {
            l0 l0Var = rVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            k.a aVar2 = rVar.x;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (rVar.y == null) {
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
                    rVar.y = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    rVar.E = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    rVar.E.setContentView(rVar.y);
                    rVar.E.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    rVar.y.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    rVar.E.setHeight(-2);
                    rVar.F = new h(rVar, i11);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) rVar.J.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(rVar.n()));
                        rVar.y = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (rVar.y != null) {
                l0 l0Var2 = rVar.G;
                if (l0Var2 != null) {
                    l0Var2.b();
                }
                rVar.y.e();
                Context context2 = rVar.y.getContext();
                ActionBarContextView actionBarContextView = rVar.y;
                k.d dVar = new k.d();
                dVar.c = context2;
                dVar.d = actionBarContextView;
                dVar.e = sVar;
                l.k kVar2 = new l.k(actionBarContextView.getContext());
                kVar2.l = 1;
                dVar.n = kVar2;
                kVar2.e = dVar;
                if (eVar.B(dVar, kVar2)) {
                    dVar.h();
                    rVar.y.c(dVar);
                    rVar.x = dVar;
                    if (rVar.I && (viewGroup = rVar.J) != null) {
                        WeakHashMap weakHashMap = i0.a;
                        if (viewGroup.isLaidOut()) {
                            rVar.y.setAlpha(0.0f);
                            l0 a2 = i0.a(rVar.y);
                            a2.a(1.0f);
                            rVar.G = a2;
                            a2.d(new i(rVar, i11));
                            if (rVar.E != null) {
                                rVar.f.getDecorView().post(rVar.F);
                            }
                        }
                    }
                    rVar.y.setAlpha(1.0f);
                    rVar.y.setVisibility(0);
                    if (rVar.y.getParent() instanceof View) {
                        View view = (View) rVar.y.getParent();
                        WeakHashMap weakHashMap2 = i0.a;
                        r0.y.c(view);
                    }
                    if (rVar.E != null) {
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
            return eVar.n(aVar3);
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
