package g;

import android.R;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import b8.gc;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.f3;
import m.j1;
import m.k1;
import m.k3;
import m.r3;
import org.telegram.messenger.hs;
import org.webrtc.MediaStreamTrack;
import r0.i0;
import r0.l0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s extends g implements l.i, LayoutInflater.Factory2 {
    public static final a0.l r0 = new a0.l(0);
    public static final int[] s0 = {R.attr.windowBackground};
    public static final boolean t0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView E;
    public PopupWindow F;
    public h G;
    public l0 H;
    public final boolean I;
    public boolean J;
    public ViewGroup K;
    public TextView L;
    public View M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public r[] V;
    public r W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public Configuration b0;
    public final int c0;
    public final u d;
    public int d0;
    public final Context e;
    public int e0;
    public Window f;
    public boolean f0;
    public o g0;
    public n h;
    public o h0;
    public boolean i0;
    public int j0;
    public final h k0;
    public boolean l0;
    public Rect m0;
    public b0 n;
    public Rect n0;
    public w o0;
    public OnBackInvokedDispatcher p0;
    public OnBackInvokedCallback q0;
    public CharSequence r;
    public j1 s;
    public c6.i w;
    public i x;
    public k.a y;

    public s(u uVar, u uVar2) {
        Context context = uVar.getContext();
        Window window = uVar.getWindow();
        this.H = null;
        this.I = true;
        this.c0 = -100;
        this.k0 = new h(this, 0);
        this.e = context;
        this.d = uVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.c0 == -100) {
            String name = this.d.getClass().getName();
            a0.l lVar = r0;
            Integer num = (Integer) lVar.get(name);
            if (num != null) {
                this.c0 = num.intValue();
                lVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            f(window);
        }
        m.q.c();
    }

    @Override // l.i
    public final boolean U0(l.k kVar, MenuItem menuItem) {
        r rVar;
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.a0) {
            l.k k10 = kVar.k();
            r[] rVarArr = this.V;
            int length = rVarArr != null ? rVarArr.length : 0;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    rVar = rVarArr[i3];
                    if (rVar != null && rVar.h == k10) {
                        break;
                    }
                    i3++;
                } else {
                    rVar = null;
                    break;
                }
            }
            if (rVar != null) {
                return callback.onMenuItemSelected(rVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // g.g
    public final void a() {
        this.Y = true;
        e(false);
        m();
        this.b0 = new Configuration(this.e.getResources().getConfiguration());
        this.Z = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.g() != false) goto L20;
     */
    @Override // l.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(l.k kVar) {
        ActionMenuView actionMenuView;
        m.h hVar;
        m.h hVar2;
        m.h hVar3;
        j1 j1Var = this.s;
        if (j1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.e();
            Toolbar toolbar = ((k3) actionBarOverlayLayout.e).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.J) {
                if (ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout2.e();
                    ActionMenuView actionMenuView2 = ((k3) actionBarOverlayLayout2.e).a.a;
                    if (actionMenuView2 != null) {
                        m.h hVar4 = actionMenuView2.K;
                        if (hVar4 != null) {
                            if (hVar4.L == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s;
                actionBarOverlayLayout3.e();
                ActionMenuView actionMenuView3 = ((k3) actionBarOverlayLayout3.e).a.a;
                if (actionMenuView3 != null && (hVar2 = actionMenuView3.K) != null && hVar2.g()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout4.e();
                    ActionMenuView actionMenuView4 = ((k3) actionBarOverlayLayout4.e).a.a;
                    if (actionMenuView4 != null && (hVar3 = actionMenuView4.K) != null) {
                        hVar3.f();
                    }
                    if (this.a0) {
                        return;
                    }
                    callback.onPanelClosed(hs.t1, p(0).h);
                    return;
                }
                if (callback == null || this.a0) {
                    return;
                }
                if (this.i0 && (1 & this.j0) != 0) {
                    View decorView = this.f.getDecorView();
                    h hVar5 = this.k0;
                    decorView.removeCallbacks(hVar5);
                    hVar5.run();
                }
                r p10 = p(0);
                l.k kVar2 = p10.h;
                if (kVar2 == null || p10.o || !callback.onPreparePanel(0, p10.g, kVar2)) {
                    return;
                }
                callback.onMenuOpened(hs.t1, p10.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.s;
                actionBarOverlayLayout5.e();
                ActionMenuView actionMenuView5 = ((k3) actionBarOverlayLayout5.e).a.a;
                if (actionMenuView5 == null || (hVar = actionMenuView5.K) == null) {
                    return;
                }
                hVar.l();
                return;
            }
        }
        r p11 = p(0);
        p11.n = true;
        i(p11, false);
        t(p11, null);
    }

    @Override // g.g
    public final boolean d(int i3) {
        if (i3 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i3 = 108;
        } else if (i3 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i3 = 109;
        }
        if (this.T && i3 == 108) {
            return false;
        }
        if (this.P && i3 == 1) {
            this.P = false;
        }
        if (i3 == 1) {
            w();
            this.T = true;
            return true;
        }
        if (i3 == 2) {
            w();
            this.N = true;
            return true;
        }
        if (i3 == 5) {
            w();
            this.O = true;
            return true;
        }
        if (i3 == 10) {
            w();
            this.R = true;
            return true;
        }
        if (i3 == 108) {
            w();
            this.P = true;
            return true;
        }
        if (i3 != 109) {
            return this.f.requestFeature(i3);
        }
        w();
        this.Q = true;
        return true;
    }

    public final boolean e(boolean z10) {
        Object obj;
        boolean z11 = false;
        if (this.a0) {
            return false;
        }
        int i3 = this.c0;
        if (i3 == -100) {
            i3 = g.a;
        }
        Context context = this.e;
        int i10 = -1;
        if (i3 != -100) {
            if (i3 != -1) {
                if (i3 != 0) {
                    if (i3 != 1 && i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.h0 == null) {
                            this.h0 = new o(this, context);
                        }
                        i10 = this.h0.e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    i10 = o(context).e();
                }
            }
            i10 = i3;
        }
        int i11 = i10 != 1 ? i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i11 | (configuration.uiMode & (-49));
        this.f0 = true;
        int i12 = this.e0;
        Configuration configuration2 = this.b0;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i13 = configuration2.uiMode & 48;
        int i14 = configuration.uiMode & 48;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 24) {
            l.b(configuration2);
        } else {
            n0.c.b(k.a(configuration2.locale));
        }
        int i16 = i13 != i14 ? 512 : 0;
        if (((~i12) & i16) != 0 && z10 && this.Y && !t0) {
            boolean z12 = this.Z;
        }
        if (i16 != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i14 | (resources.getConfiguration().uiMode & (-49));
            Object obj2 = null;
            resources.updateConfiguration(configuration3, null);
            if (i15 < 26 && i15 < 28) {
                if (i15 >= 24) {
                    if (!gc.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            gc.g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                        }
                        gc.h = true;
                    }
                    Field field = gc.g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e11) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!gc.b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    gc.a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                                }
                                gc.b = true;
                            }
                            Field field2 = gc.a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e13) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                }
                            }
                            if (obj2 != null) {
                                gc.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!gc.b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            gc.a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e14);
                        }
                        gc.b = true;
                    }
                    Field field3 = gc.a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e15);
                        }
                    }
                    if (obj2 != null) {
                        gc.a(obj2);
                    }
                }
            }
            int i17 = this.d0;
            if (i17 != 0) {
                context.setTheme(i17);
                context.getTheme().applyStyle(this.d0, true);
            }
            z11 = true;
        }
        if (i3 == 0) {
            o(context).l();
        } else {
            o oVar = this.g0;
            if (oVar != null) {
                oVar.c();
            }
        }
        if (i3 == 3) {
            if (this.h0 == null) {
                this.h0 = new o(this, context);
            }
            this.h0.l();
        } else {
            o oVar2 = this.h0;
            if (oVar2 != null) {
                oVar2.c();
            }
        }
        return z11;
    }

    public final void f(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(this, callback);
        this.h = nVar;
        window.setCallback(nVar);
        Context context = this.e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, s0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            m.q a10 = m.q.a();
            synchronized (a10) {
                drawable = a10.a.f(resourceId, context, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.p0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.q0) != null) {
            m.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.q0 = null;
        }
        this.p0 = null;
        x();
    }

    public final void g(int i3, r rVar, l.k kVar) {
        if (kVar == null) {
            if (rVar == null && i3 >= 0) {
                r[] rVarArr = this.V;
                if (i3 < rVarArr.length) {
                    rVar = rVarArr[i3];
                }
            }
            if (rVar != null) {
                kVar = rVar.h;
            }
        }
        if ((rVar == null || rVar.m) && !this.a0) {
            n nVar = this.h;
            Window.Callback callback = this.f.getCallback();
            nVar.getClass();
            try {
                nVar.d = true;
                callback.onPanelClosed(i3, kVar);
            } finally {
                nVar.d = false;
            }
        }
    }

    public final void h(l.k kVar) {
        m.h hVar;
        if (this.U) {
            return;
        }
        this.U = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.s;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((k3) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (hVar = actionMenuView.K) != null) {
            hVar.f();
            m.d dVar = hVar.K;
            if (dVar != null && dVar.b()) {
                dVar.i.dismiss();
            }
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.a0) {
            callback.onPanelClosed(hs.t1, kVar);
        }
        this.U = false;
    }

    public final void i(r rVar, boolean z10) {
        q qVar;
        j1 j1Var;
        m.h hVar;
        if (z10 && rVar.a == 0 && (j1Var = this.s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((k3) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (hVar = actionMenuView.K) != null && hVar.g()) {
                h(rVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && rVar.m && (qVar = rVar.e) != null) {
            windowManager.removeView(qVar);
            if (z10) {
                g(rVar.a, rVar, null);
            }
        }
        rVar.k = false;
        rVar.l = false;
        rVar.m = false;
        rVar.f = null;
        rVar.n = true;
        if (this.W == rVar) {
            this.W = null;
        }
        if (rVar.a == 0) {
            x();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00de, code lost:
    
        if (r7.f() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0104, code lost:
    
        if (r7.l() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(KeyEvent keyEvent) {
        View decorView;
        boolean z10;
        boolean z11;
        ActionMenuView actionMenuView;
        m.h hVar;
        u uVar = this.d;
        if ((!(uVar instanceof r0.i) && !com.google.android.recaptcha.internal.a.u(uVar)) || (decorView = this.f.getDecorView()) == null || !x7.k.a(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                n nVar = this.h;
                Window.Callback callback = this.f.getCallback();
                nVar.getClass();
                try {
                    nVar.c = true;
                } finally {
                    nVar.c = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.X = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        r p10 = p(0);
                        if (!p10.m) {
                            v(p10, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.y == null) {
                        r p11 = p(0);
                        j1 j1Var = this.s;
                        Context context = this.e;
                        if (j1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
                            actionBarOverlayLayout.e();
                            Toolbar toolbar = ((k3) actionBarOverlayLayout.e).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.J && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                                actionBarOverlayLayout2.e();
                                ActionMenuView actionMenuView2 = ((k3) actionBarOverlayLayout2.e).a.a;
                                if (actionMenuView2 == null || (hVar = actionMenuView2.K) == null || !hVar.g()) {
                                    if (!this.a0 && v(p11, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s;
                                        actionBarOverlayLayout3.e();
                                        ActionMenuView actionMenuView3 = ((k3) actionBarOverlayLayout3.e).a.a;
                                        if (actionMenuView3 != null) {
                                            m.h hVar2 = actionMenuView3.K;
                                            if (hVar2 != null) {
                                            }
                                        }
                                    }
                                    z10 = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s;
                                    actionBarOverlayLayout4.e();
                                    ActionMenuView actionMenuView4 = ((k3) actionBarOverlayLayout4.e).a.a;
                                    if (actionMenuView4 != null) {
                                        m.h hVar3 = actionMenuView4.K;
                                        if (hVar3 != null) {
                                        }
                                    }
                                    z10 = false;
                                }
                                if (z10) {
                                    AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                                    if (audioManager != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                    return true;
                                }
                            }
                        }
                        boolean z12 = p11.m;
                        if (z12 || p11.l) {
                            i(p11, true);
                            z10 = z12;
                            if (z10) {
                            }
                        } else {
                            if (p11.k) {
                                if (p11.o) {
                                    p11.k = false;
                                    z11 = v(p11, keyEvent);
                                } else {
                                    z11 = true;
                                }
                                if (z11) {
                                    t(p11, keyEvent);
                                    z10 = true;
                                    if (z10) {
                                    }
                                }
                            }
                            z10 = false;
                            if (z10) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!s()) {
                return false;
            }
        }
        return true;
    }

    public final void k(int i3) {
        r p10 = p(i3);
        if (p10.h != null) {
            Bundle bundle = new Bundle();
            p10.h.t(bundle);
            if (bundle.size() > 0) {
                p10.p = bundle;
            }
            p10.h.w();
            p10.h.clear();
        }
        p10.o = true;
        p10.n = true;
        if ((i3 == 108 || i3 == 0) && this.s != null) {
            r p11 = p(0);
            p11.k = false;
            v(p11, null);
        }
    }

    public final void l() {
        ViewGroup viewGroup;
        if (this.J) {
            return;
        }
        Context context = this.e;
        int[] iArr = f.a.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(hs.C1)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(hs.K1, false)) {
            d(1);
        } else if (obtainStyledAttributes.getBoolean(hs.C1, false)) {
            d(hs.t1);
        }
        if (obtainStyledAttributes.getBoolean(hs.D1, false)) {
            d(hs.u1);
        }
        if (obtainStyledAttributes.getBoolean(hs.E1, false)) {
            d(10);
        }
        this.S = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        m();
        this.f.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.T) {
            viewGroup = this.R ? (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.S) {
            viewGroup = (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.Q = false;
            this.P = false;
        } else if (this.P) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new k.c(context, typedValue.resourceId) : context).inflate(org.telegram.messenger.beta.R.layout.abc_screen_toolbar, (ViewGroup) null);
            j1 j1Var = (j1) viewGroup.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
            this.s = j1Var;
            j1Var.setWindowCallback(this.f.getCallback());
            if (this.Q) {
                ((ActionBarOverlayLayout) this.s).d(hs.u1);
            }
            if (this.N) {
                ((ActionBarOverlayLayout) this.s).d(2);
            }
            if (this.O) {
                ((ActionBarOverlayLayout) this.s).d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.P + ", windowActionBarOverlay: " + this.Q + ", android:windowIsFloating: " + this.S + ", windowActionModeOverlay: " + this.R + ", windowNoTitle: " + this.T + " }");
        }
        i iVar = new i(this);
        WeakHashMap weakHashMap = i0.a;
        r0.a0.i(viewGroup, iVar);
        if (this.s == null) {
            this.L = (TextView) viewGroup.findViewById(org.telegram.messenger.beta.R.id.title);
        }
        Method method = r3.a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e11) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(org.telegram.messenger.beta.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new bb.c(this, 25));
        this.K = viewGroup;
        CharSequence charSequence = this.r;
        if (!TextUtils.isEmpty(charSequence)) {
            j1 j1Var2 = this.s;
            if (j1Var2 != null) {
                j1Var2.setWindowTitle(charSequence);
            } else {
                b0 b0Var = this.n;
                if (b0Var != null) {
                    k3 k3Var = (k3) b0Var.e;
                    if (!k3Var.g) {
                        Toolbar toolbar = k3Var.a;
                        k3Var.h = charSequence;
                        if ((k3Var.b & 8) != 0) {
                            toolbar.setTitle(charSequence);
                            if (k3Var.g) {
                                i0.k(toolbar.getRootView(), charSequence);
                            }
                        }
                    }
                } else {
                    TextView textView = this.L;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.K.findViewById(R.id.content);
        View decorView = this.f.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = i0.a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(hs.I1, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(hs.J1, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(hs.G1)) {
            obtainStyledAttributes2.getValue(hs.G1, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(hs.H1)) {
            obtainStyledAttributes2.getValue(hs.H1, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(hs.F1)) {
            obtainStyledAttributes2.getValue(hs.F1, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.J = true;
        r p10 = p(0);
        if (this.a0 || p10.h != null) {
            return;
        }
        r(hs.t1);
    }

    public final void m() {
        if (this.f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context n() {
        Context context;
        b0 q10 = q();
        if (q10 != null) {
            if (q10.b == null) {
                TypedValue typedValue = new TypedValue();
                q10.a.getTheme().resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarWidgetTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    q10.b = new ContextThemeWrapper(q10.a, i3);
                } else {
                    q10.b = q10.a;
                }
            }
            context = q10.b;
        } else {
            context = null;
        }
        return context == null ? this.e : context;
    }

    public final p o(Context context) {
        if (this.g0 == null) {
            if (android.support.v4.media.session.a0.f == null) {
                Context applicationContext = context.getApplicationContext();
                android.support.v4.media.session.a0.f = new android.support.v4.media.session.a0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.g0 = new o(this, android.support.v4.media.session.a0.f);
        }
        return this.g0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:68:0x01ea
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.s.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final r p(int i3) {
        r[] rVarArr = this.V;
        if (rVarArr == null || rVarArr.length <= i3) {
            r[] rVarArr2 = new r[i3 + 1];
            if (rVarArr != null) {
                System.arraycopy(rVarArr, 0, rVarArr2, 0, rVarArr.length);
            }
            this.V = rVarArr2;
            rVarArr = rVarArr2;
        }
        r rVar = rVarArr[i3];
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r();
        rVar2.a = i3;
        rVar2.n = false;
        rVarArr[i3] = rVar2;
        return rVar2;
    }

    public final b0 q() {
        l();
        if (this.P && this.n == null) {
            u uVar = this.d;
            if (com.google.android.recaptcha.internal.a.u(uVar)) {
                this.n = new b0(uVar);
            }
            b0 b0Var = this.n;
            if (b0Var != null) {
                b0Var.c(this.l0);
            }
        }
        return this.n;
    }

    public final void r(int i3) {
        this.j0 = (1 << i3) | this.j0;
        if (this.i0) {
            return;
        }
        View decorView = this.f.getDecorView();
        WeakHashMap weakHashMap = i0.a;
        decorView.postOnAnimation(this.k0);
        this.i0 = true;
    }

    public final boolean s() {
        k1 k1Var;
        f3 f3Var;
        boolean z10 = this.X;
        this.X = false;
        r p10 = p(0);
        if (!p10.m) {
            k.a aVar = this.y;
            if (aVar != null) {
                aVar.c();
                return true;
            }
            b0 q10 = q();
            if (q10 == null || (k1Var = q10.e) == null || (f3Var = ((k3) k1Var).a.f0) == null || f3Var.b == null) {
                return false;
            }
            f3 f3Var2 = ((k3) k1Var).a.f0;
            l.m mVar = f3Var2 == null ? null : f3Var2.b;
            if (mVar != null) {
                mVar.collapseActionView();
            }
        } else if (!z10) {
            i(p10, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0164, code lost:
    
        if (r15.f.getCount() > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0144, code lost:
    
        if (r15 != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(r rVar, KeyEvent keyEvent) {
        int i3;
        ViewGroup.LayoutParams layoutParams;
        boolean z10 = rVar.m;
        int i10 = rVar.a;
        if (z10 || this.a0) {
            return;
        }
        Context context = this.e;
        if (i10 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !callback.onMenuOpened(i10, rVar.h)) {
            i(rVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !v(rVar, keyEvent)) {
            return;
        }
        q qVar = rVar.e;
        if (qVar == null || rVar.n) {
            if (qVar == null) {
                Context n4 = n();
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = n4.getResources().newTheme();
                newTheme.setTo(n4.getTheme());
                newTheme.resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarPopupTheme, typedValue, true);
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    newTheme.applyStyle(i11, true);
                }
                newTheme.resolveAttribute(org.telegram.messenger.beta.R.attr.panelMenuListTheme, typedValue, true);
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    newTheme.applyStyle(i12, true);
                } else {
                    newTheme.applyStyle(org.telegram.messenger.beta.R.style.Theme_AppCompat_CompactMenu, true);
                }
                k.c cVar = new k.c(n4, 0);
                cVar.getTheme().setTo(newTheme);
                rVar.j = cVar;
                TypedArray obtainStyledAttributes = cVar.obtainStyledAttributes(f.a.j);
                rVar.b = obtainStyledAttributes.getResourceId(86, 0);
                rVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                rVar.e = new q(this, rVar.j);
                rVar.c = 81;
            } else if (rVar.n && qVar.getChildCount() > 0) {
                rVar.e.removeAllViews();
            }
            View view = rVar.g;
            if (view == null) {
                if (rVar.h != null) {
                    if (this.x == null) {
                        this.x = new i(this);
                    }
                    i iVar = this.x;
                    if (rVar.i == null) {
                        l.g gVar = new l.g(rVar.j);
                        rVar.i = gVar;
                        gVar.e = iVar;
                        l.k kVar = rVar.h;
                        kVar.b(gVar, kVar.a);
                    }
                    l.g gVar2 = rVar.i;
                    q qVar2 = rVar.e;
                    if (gVar2.d == null) {
                        gVar2.d = (ExpandedMenuView) gVar2.b.inflate(org.telegram.messenger.beta.R.layout.abc_expanded_menu_layout, (ViewGroup) qVar2, false);
                        if (gVar2.f == null) {
                            gVar2.f = new l.f(gVar2);
                        }
                        gVar2.d.setAdapter((ListAdapter) gVar2.f);
                        gVar2.d.setOnItemClickListener(gVar2);
                    }
                    ExpandedMenuView expandedMenuView = gVar2.d;
                    rVar.f = expandedMenuView;
                }
                rVar.n = true;
                return;
            }
            rVar.f = view;
            if (rVar.f != null) {
                if (rVar.g == null) {
                    l.g gVar3 = rVar.i;
                    if (gVar3.f == null) {
                        gVar3.f = new l.f(gVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = rVar.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                rVar.e.setBackgroundResource(rVar.b);
                ViewParent parent = rVar.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(rVar.f);
                }
                rVar.e.addView(rVar.f, layoutParams2);
                if (!rVar.f.hasFocus()) {
                    rVar.f.requestFocus();
                }
            }
            rVar.n = true;
            return;
        }
        View view2 = rVar.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i3 = -1;
            rVar.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i3, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = rVar.c;
            layoutParams3.windowAnimations = rVar.d;
            windowManager.addView(rVar.e, layoutParams3);
            rVar.m = true;
            if (i10 != 0) {
                x();
                return;
            }
            return;
        }
        i3 = -2;
        rVar.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i3, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = rVar.c;
        layoutParams32.windowAnimations = rVar.d;
        windowManager.addView(rVar.e, layoutParams32);
        rVar.m = true;
        if (i10 != 0) {
        }
    }

    public final boolean u(r rVar, int i3, KeyEvent keyEvent) {
        l.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((rVar.k || v(rVar, keyEvent)) && (kVar = rVar.h) != null) {
            return kVar.performShortcut(i3, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(r rVar, KeyEvent keyEvent) {
        j1 j1Var;
        j1 j1Var2;
        Resources.Theme theme;
        j1 j1Var3;
        j1 j1Var4;
        if (!this.a0) {
            boolean z10 = rVar.k;
            int i3 = rVar.a;
            if (z10) {
                return true;
            }
            r rVar2 = this.W;
            if (rVar2 != null && rVar2 != rVar) {
                i(rVar2, false);
            }
            Window.Callback callback = this.f.getCallback();
            if (callback != null) {
                rVar.g = callback.onCreatePanelView(i3);
            }
            boolean z11 = i3 == 0 || i3 == 108;
            if (z11 && (j1Var4 = this.s) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var4;
                actionBarOverlayLayout.e();
                ((k3) actionBarOverlayLayout.e).l = true;
            }
            if (rVar.g == null) {
                l.k kVar = rVar.h;
                if (kVar == null || rVar.o) {
                    if (kVar == null) {
                        Context context = this.e;
                        if ((i3 == 0 || i3 == 108) && this.s != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                k.c cVar = new k.c(context, 0);
                                cVar.getTheme().setTo(theme);
                                context = cVar;
                            }
                        }
                        l.k kVar2 = new l.k(context);
                        kVar2.e = this;
                        l.k kVar3 = rVar.h;
                        if (kVar2 != kVar3) {
                            if (kVar3 != null) {
                                kVar3.r(rVar.i);
                            }
                            rVar.h = kVar2;
                            l.g gVar = rVar.i;
                            if (gVar != null) {
                                kVar2.b(gVar, kVar2.a);
                            }
                        }
                    }
                    if (z11 && (j1Var2 = this.s) != null) {
                        if (this.w == null) {
                            this.w = new c6.i(this, 25);
                        }
                        ((ActionBarOverlayLayout) j1Var2).f(rVar.h, this.w);
                    }
                    rVar.h.w();
                    if (callback.onCreatePanelMenu(i3, rVar.h)) {
                        rVar.o = false;
                    } else {
                        l.k kVar4 = rVar.h;
                        if (kVar4 != null) {
                            if (kVar4 != null) {
                                kVar4.r(rVar.i);
                            }
                            rVar.h = null;
                        }
                        if (z11 && (j1Var = this.s) != null) {
                            ((ActionBarOverlayLayout) j1Var).f(null, this.w);
                        }
                    }
                }
                rVar.h.w();
                Bundle bundle = rVar.p;
                if (bundle != null) {
                    rVar.h.s(bundle);
                    rVar.p = null;
                }
                if (!callback.onPreparePanel(0, rVar.g, rVar.h)) {
                    if (z11 && (j1Var3 = this.s) != null) {
                        ((ActionBarOverlayLayout) j1Var3).f(null, this.w);
                    }
                    rVar.h.v();
                    return false;
                }
                rVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                rVar.h.v();
            }
            rVar.k = true;
            rVar.l = false;
            this.W = rVar;
            return true;
        }
        return false;
    }

    public final void w() {
        if (this.J) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void x() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.p0 != null && (p(0).m || this.y != null)) {
                z10 = true;
            }
            if (z10 && this.q0 == null) {
                this.q0 = m.b(this.p0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.q0) == null) {
                    return;
                }
                m.c(this.p0, onBackInvokedCallback);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
