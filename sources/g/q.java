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
import androidx.biometric.f0;
import j7.p7;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;
import k7.q6;
import m.i3;
import m.j1;
import m.k1;
import m.n3;
import m.u3;
import org.webrtc.MediaStreamTrack;
import r0.b0;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class q extends g implements l.j, LayoutInflater.Factory2 {
    public static final a0.k n0 = new a0.k(0);
    public static final int[] o0 = {R.attr.windowBackground};
    public static final boolean p0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow B;
    public h C;
    public m0 D;
    public final boolean E;
    public boolean F;
    public ViewGroup G;
    public TextView H;
    public View I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public p[] R;
    public p S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public Configuration X;
    public final int Y;
    public int Z;
    public int a0;
    public boolean b0;
    public n c0;
    public final s d;
    public n d0;
    public final Context e;
    public boolean e0;
    public Window f;
    public int f0;
    public final h g0;
    public m h;
    public boolean h0;
    public Rect i0;
    public Rect j0;
    public u k0;
    public OnBackInvokedDispatcher l0;
    public OnBackInvokedCallback m0;
    public a0 n;
    public CharSequence r;
    public j1 s;
    public y5.h v;
    public f0 w;
    public k.a x;
    public ActionBarContextView y;

    public q(s sVar, s sVar2) {
        Context context = sVar.getContext();
        Window window = sVar.getWindow();
        this.D = null;
        this.E = true;
        this.Y = -100;
        this.g0 = new h(this, 0);
        this.e = context;
        this.d = sVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.Y == -100) {
            String name = this.d.getClass().getName();
            a0.k kVar = n0;
            Integer num = (Integer) kVar.get(name);
            if (num != null) {
                this.Y = num.intValue();
                kVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        m.q.c();
    }

    @Override // g.g
    public final void a() {
        this.U = true;
        d(false);
        m();
        this.X = new Configuration(this.e.getResources().getConfiguration());
        this.V = true;
    }

    @Override // g.g
    public final boolean c(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.P && i10 == 108) {
            return false;
        }
        if (this.L && i10 == 1) {
            this.L = false;
        }
        if (i10 == 1) {
            x();
            this.P = true;
            return true;
        }
        if (i10 == 2) {
            x();
            this.J = true;
            return true;
        }
        if (i10 == 5) {
            x();
            this.K = true;
            return true;
        }
        if (i10 == 10) {
            x();
            this.N = true;
            return true;
        }
        if (i10 == 108) {
            x();
            this.L = true;
            return true;
        }
        if (i10 != 109) {
            return this.f.requestFeature(i10);
        }
        x();
        this.M = true;
        return true;
    }

    public final boolean d(boolean z4) {
        Object obj;
        boolean z10 = false;
        if (this.W) {
            return false;
        }
        int i10 = this.Y;
        if (i10 == -100) {
            i10 = g.a;
        }
        Context context = this.e;
        int i11 = -1;
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.d0 == null) {
                            this.d0 = new n(this, context);
                        }
                        i11 = this.d0.e();
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    i11 = o(context).e();
                }
            }
            i11 = i10;
        }
        int i12 = i11 != 1 ? i11 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i12 | (configuration.uiMode & (-49));
        this.b0 = true;
        int i13 = this.a0;
        Configuration configuration2 = this.X;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i14 = configuration2.uiMode & 48;
        int i15 = configuration.uiMode & 48;
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            k.b(configuration2);
        } else {
            n0.c.b(j.a(configuration2.locale));
        }
        int i17 = i14 != i15 ? 512 : 0;
        if (((~i13) & i17) != 0 && z4 && this.U && !p0) {
            boolean z11 = this.V;
        }
        if (i17 != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i15 | (resources.getConfiguration().uiMode & (-49));
            Map map = null;
            r5 = null;
            r5 = null;
            Object obj2 = null;
            Object obj3 = null;
            resources.updateConfiguration(configuration3, null);
            if (i16 < 26 && i16 < 28) {
                if (i16 >= 24) {
                    if (!p7.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            p7.g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e6) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e6);
                        }
                        p7.h = true;
                    }
                    Field field = p7.g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!p7.b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    p7.a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e11) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                                }
                                p7.b = true;
                            }
                            Field field2 = p7.a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                }
                            }
                            if (obj2 != null) {
                                p7.a(obj2);
                            }
                        }
                    }
                } else if (i16 >= 23) {
                    if (!p7.b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            p7.a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e13) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e13);
                        }
                        p7.b = true;
                    }
                    Field field3 = p7.a;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e14);
                        }
                    }
                    if (obj3 != null) {
                        p7.a(obj3);
                    }
                } else {
                    if (!p7.b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            p7.a = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e15);
                        }
                        p7.b = true;
                    }
                    Field field4 = p7.a;
                    if (field4 != null) {
                        try {
                            map = (Map) field4.get(resources);
                        } catch (IllegalAccessException e16) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e16);
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
            int i18 = this.Z;
            if (i18 != 0) {
                context.setTheme(i18);
                if (Build.VERSION.SDK_INT >= 23) {
                    context.getTheme().applyStyle(this.Z, true);
                }
            }
            z10 = true;
        }
        if (i10 == 0) {
            o(context).l();
        } else {
            n nVar = this.c0;
            if (nVar != null) {
                nVar.c();
            }
        }
        if (i10 == 3) {
            if (this.d0 == null) {
                this.d0 = new n(this, context);
            }
            this.d0.l();
        } else {
            n nVar2 = this.d0;
            if (nVar2 != null) {
                nVar2.c();
            }
        }
        return z10;
    }

    public final void e(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof m) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        m mVar = new m(this, callback);
        this.h = mVar;
        window.setCallback(mVar);
        Context context = this.e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, o0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            m.q a2 = m.q.a();
            synchronized (a2) {
                drawable = a2.a.f(resourceId, context, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.l0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.m0) != null) {
            l.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.m0 = null;
        }
        this.l0 = null;
        y();
    }

    public final void f(int i10, p pVar, l.l lVar) {
        if (lVar == null) {
            if (pVar == null && i10 >= 0) {
                p[] pVarArr = this.R;
                if (i10 < pVarArr.length) {
                    pVar = pVarArr[i10];
                }
            }
            if (pVar != null) {
                lVar = pVar.h;
            }
        }
        if ((pVar == null || pVar.m) && !this.W) {
            m mVar = this.h;
            Window.Callback callback = this.f.getCallback();
            mVar.getClass();
            try {
                mVar.d = true;
                callback.onPanelClosed(i10, lVar);
            } finally {
                mVar.d = false;
            }
        }
    }

    public final void g(l.l lVar) {
        m.h hVar;
        if (this.Q) {
            return;
        }
        this.Q = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.s;
        actionBarOverlayLayout.f();
        ActionMenuView actionMenuView = ((n3) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (hVar = actionMenuView.G) != null) {
            hVar.f();
            m.d dVar = hVar.G;
            if (dVar != null && dVar.b()) {
                dVar.i.dismiss();
            }
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.W) {
            callback.onPanelClosed(108, lVar);
        }
        this.Q = false;
    }

    public final void h(p pVar, boolean z4) {
        o oVar;
        j1 j1Var;
        m.h hVar;
        if (z4 && pVar.a == 0 && (j1Var = this.s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.f();
            ActionMenuView actionMenuView = ((n3) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (hVar = actionMenuView.G) != null && hVar.g()) {
                g(pVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && pVar.m && (oVar = pVar.e) != null) {
            windowManager.removeView(oVar);
            if (z4) {
                f(pVar.a, pVar, null);
            }
        }
        pVar.k = false;
        pVar.l = false;
        pVar.m = false;
        pVar.f = null;
        pVar.n = true;
        if (this.S == pVar) {
            this.S = null;
        }
        if (pVar.a == 0) {
            y();
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
    public final boolean i(KeyEvent keyEvent) {
        View decorView;
        boolean z4;
        boolean z10;
        ActionMenuView actionMenuView;
        m.h hVar;
        s sVar = this.d;
        if ((!(sVar instanceof r0.k) && !e2.c.s(sVar)) || (decorView = this.f.getDecorView()) == null || !q6.a(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                m mVar = this.h;
                Window.Callback callback = this.f.getCallback();
                mVar.getClass();
                try {
                    mVar.c = true;
                } finally {
                    mVar.c = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.T = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        p p10 = p(0);
                        if (!p10.m) {
                            w(p10, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.x == null) {
                        p p11 = p(0);
                        j1 j1Var = this.s;
                        Context context = this.e;
                        if (j1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
                            actionBarOverlayLayout.f();
                            Toolbar toolbar = ((n3) actionBarOverlayLayout.e).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.F && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                                actionBarOverlayLayout2.f();
                                ActionMenuView actionMenuView2 = ((n3) actionBarOverlayLayout2.e).a.a;
                                if (actionMenuView2 == null || (hVar = actionMenuView2.G) == null || !hVar.g()) {
                                    if (!this.W && w(p11, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s;
                                        actionBarOverlayLayout3.f();
                                        ActionMenuView actionMenuView3 = ((n3) actionBarOverlayLayout3.e).a.a;
                                        if (actionMenuView3 != null) {
                                            m.h hVar2 = actionMenuView3.G;
                                            if (hVar2 != null) {
                                            }
                                        }
                                    }
                                    z4 = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s;
                                    actionBarOverlayLayout4.f();
                                    ActionMenuView actionMenuView4 = ((n3) actionBarOverlayLayout4.e).a.a;
                                    if (actionMenuView4 != null) {
                                        m.h hVar3 = actionMenuView4.G;
                                        if (hVar3 != null) {
                                        }
                                    }
                                    z4 = false;
                                }
                                if (z4) {
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
                        boolean z11 = p11.m;
                        if (z11 || p11.l) {
                            h(p11, true);
                            z4 = z11;
                            if (z4) {
                            }
                        } else {
                            if (p11.k) {
                                if (p11.o) {
                                    p11.k = false;
                                    z10 = w(p11, keyEvent);
                                } else {
                                    z10 = true;
                                }
                                if (z10) {
                                    u(p11, keyEvent);
                                    z4 = true;
                                    if (z4) {
                                    }
                                }
                            }
                            z4 = false;
                            if (z4) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!t()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.g() != false) goto L20;
     */
    @Override // l.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(l.l lVar) {
        ActionMenuView actionMenuView;
        m.h hVar;
        m.h hVar2;
        m.h hVar3;
        j1 j1Var = this.s;
        if (j1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.f();
            Toolbar toolbar = ((n3) actionBarOverlayLayout.e).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.F) {
                if (ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout2.f();
                    ActionMenuView actionMenuView2 = ((n3) actionBarOverlayLayout2.e).a.a;
                    if (actionMenuView2 != null) {
                        m.h hVar4 = actionMenuView2.G;
                        if (hVar4 != null) {
                            if (hVar4.H == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s;
                actionBarOverlayLayout3.f();
                ActionMenuView actionMenuView3 = ((n3) actionBarOverlayLayout3.e).a.a;
                if (actionMenuView3 != null && (hVar2 = actionMenuView3.G) != null && hVar2.g()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout4.f();
                    ActionMenuView actionMenuView4 = ((n3) actionBarOverlayLayout4.e).a.a;
                    if (actionMenuView4 != null && (hVar3 = actionMenuView4.G) != null) {
                        hVar3.f();
                    }
                    if (this.W) {
                        return;
                    }
                    callback.onPanelClosed(108, p(0).h);
                    return;
                }
                if (callback == null || this.W) {
                    return;
                }
                if (this.e0 && (1 & this.f0) != 0) {
                    View decorView = this.f.getDecorView();
                    h hVar5 = this.g0;
                    decorView.removeCallbacks(hVar5);
                    hVar5.run();
                }
                p p10 = p(0);
                l.l lVar2 = p10.h;
                if (lVar2 == null || p10.o || !callback.onPreparePanel(0, p10.g, lVar2)) {
                    return;
                }
                callback.onMenuOpened(108, p10.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.s;
                actionBarOverlayLayout5.f();
                ActionMenuView actionMenuView5 = ((n3) actionBarOverlayLayout5.e).a.a;
                if (actionMenuView5 == null || (hVar = actionMenuView5.G) == null) {
                    return;
                }
                hVar.l();
                return;
            }
        }
        p p11 = p(0);
        p11.n = true;
        h(p11, false);
        u(p11, null);
    }

    public final void k(int i10) {
        p p10 = p(i10);
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
        if ((i10 == 108 || i10 == 0) && this.s != null) {
            p p11 = p(0);
            p11.k = false;
            w(p11, null);
        }
    }

    public final void l() {
        ViewGroup viewGroup;
        if (this.F) {
            return;
        }
        Context context = this.e;
        int[] iArr = f.a.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            c(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            c(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            c(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            c(10);
        }
        this.O = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        m();
        this.f.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.P) {
            viewGroup = this.N ? (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.O) {
            viewGroup = (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.M = false;
            this.L = false;
        } else if (this.L) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new k.c(context, typedValue.resourceId) : context).inflate(org.telegram.messenger.beta.R.layout.abc_screen_toolbar, (ViewGroup) null);
            j1 j1Var = (j1) viewGroup.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
            this.s = j1Var;
            j1Var.setWindowCallback(this.f.getCallback());
            if (this.M) {
                ((ActionBarOverlayLayout) this.s).e(109);
            }
            if (this.J) {
                ((ActionBarOverlayLayout) this.s).e(2);
            }
            if (this.K) {
                ((ActionBarOverlayLayout) this.s).e(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.L + ", windowActionBarOverlay: " + this.M + ", android:windowIsFloating: " + this.O + ", windowActionModeOverlay: " + this.N + ", windowNoTitle: " + this.P + " }");
        }
        ja.c cVar = new ja.c(this);
        WeakHashMap weakHashMap = j0.a;
        b0.j(viewGroup, cVar);
        if (this.s == null) {
            this.H = (TextView) viewGroup.findViewById(org.telegram.messenger.beta.R.id.title);
        }
        Method method = u3.a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e6) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
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
        contentFrameLayout.setAttachListener(new o5.i(this, 14));
        this.G = viewGroup;
        CharSequence charSequence = this.r;
        if (!TextUtils.isEmpty(charSequence)) {
            j1 j1Var2 = this.s;
            if (j1Var2 != null) {
                j1Var2.setWindowTitle(charSequence);
            } else {
                a0 a0Var = this.n;
                if (a0Var != null) {
                    n3 n3Var = (n3) a0Var.e;
                    if (!n3Var.g) {
                        Toolbar toolbar = n3Var.a;
                        n3Var.h = charSequence;
                        if ((n3Var.b & 8) != 0) {
                            toolbar.setTitle(charSequence);
                            if (n3Var.g) {
                                j0.l(toolbar.getRootView(), charSequence);
                            }
                        }
                    }
                } else {
                    TextView textView = this.H;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.G.findViewById(R.id.content);
        View decorView = this.f.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = j0.a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.F = true;
        p p10 = p(0);
        if (this.W || p10.h != null) {
            return;
        }
        r(108);
    }

    public final void m() {
        if (this.f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context n() {
        Context context;
        a0 q10 = q();
        if (q10 != null) {
            if (q10.b == null) {
                TypedValue typedValue = new TypedValue();
                q10.a.getTheme().resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarWidgetTheme, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    q10.b = new ContextThemeWrapper(q10.a, i10);
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

    public final f2.v o(Context context) {
        if (this.c0 == null) {
            if (androidx.biometric.e.e == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.biometric.e.e = new androidx.biometric.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.c0 = new n(this, androidx.biometric.e.e);
        }
        return this.c0;
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
        throw new UnsupportedOperationException("Method not decompiled: g.q.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final p p(int i10) {
        p[] pVarArr = this.R;
        if (pVarArr == null || pVarArr.length <= i10) {
            p[] pVarArr2 = new p[i10 + 1];
            if (pVarArr != null) {
                System.arraycopy(pVarArr, 0, pVarArr2, 0, pVarArr.length);
            }
            this.R = pVarArr2;
            pVarArr = pVarArr2;
        }
        p pVar = pVarArr[i10];
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p();
        pVar2.a = i10;
        pVar2.n = false;
        pVarArr[i10] = pVar2;
        return pVar2;
    }

    public final a0 q() {
        l();
        if (this.L && this.n == null) {
            s sVar = this.d;
            if (e2.c.s(sVar)) {
                this.n = new a0(sVar);
            }
            a0 a0Var = this.n;
            if (a0Var != null) {
                a0Var.c(this.h0);
            }
        }
        return this.n;
    }

    public final void r(int i10) {
        this.f0 = (1 << i10) | this.f0;
        if (this.e0) {
            return;
        }
        View decorView = this.f.getDecorView();
        WeakHashMap weakHashMap = j0.a;
        decorView.postOnAnimation(this.g0);
        this.e0 = true;
    }

    @Override // l.j
    public final boolean s(l.l lVar, MenuItem menuItem) {
        p pVar;
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.W) {
            l.l k10 = lVar.k();
            p[] pVarArr = this.R;
            int length = pVarArr != null ? pVarArr.length : 0;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    pVar = pVarArr[i10];
                    if (pVar != null && pVar.h == k10) {
                        break;
                    }
                    i10++;
                } else {
                    pVar = null;
                    break;
                }
            }
            if (pVar != null) {
                return callback.onMenuItemSelected(pVar.a, menuItem);
            }
        }
        return false;
    }

    public final boolean t() {
        k1 k1Var;
        i3 i3Var;
        boolean z4 = this.T;
        this.T = false;
        p p10 = p(0);
        if (!p10.m) {
            k.a aVar = this.x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            a0 q10 = q();
            if (q10 == null || (k1Var = q10.e) == null || (i3Var = ((n3) k1Var).a.b0) == null || i3Var.b == null) {
                return false;
            }
            i3 i3Var2 = ((n3) k1Var).a.b0;
            l.n nVar = i3Var2 == null ? null : i3Var2.b;
            if (nVar != null) {
                nVar.collapseActionView();
            }
        } else if (!z4) {
            h(p10, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0167, code lost:
    
        if (r15.f.getCount() > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0147, code lost:
    
        if (r15 != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(p pVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        boolean z4 = pVar.m;
        int i11 = pVar.a;
        if (z4 || this.W) {
            return;
        }
        Context context = this.e;
        if (i11 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !callback.onMenuOpened(i11, pVar.h)) {
            h(pVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !w(pVar, keyEvent)) {
            return;
        }
        o oVar = pVar.e;
        if (oVar == null || pVar.n) {
            if (oVar == null) {
                Context n10 = n();
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = n10.getResources().newTheme();
                newTheme.setTo(n10.getTheme());
                newTheme.resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarPopupTheme, typedValue, true);
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    newTheme.applyStyle(i12, true);
                }
                newTheme.resolveAttribute(org.telegram.messenger.beta.R.attr.panelMenuListTheme, typedValue, true);
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    newTheme.applyStyle(i13, true);
                } else {
                    newTheme.applyStyle(org.telegram.messenger.beta.R.style.Theme_AppCompat_CompactMenu, true);
                }
                k.c cVar = new k.c(n10, 0);
                cVar.getTheme().setTo(newTheme);
                pVar.j = cVar;
                TypedArray obtainStyledAttributes = cVar.obtainStyledAttributes(f.a.j);
                pVar.b = obtainStyledAttributes.getResourceId(86, 0);
                pVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                pVar.e = new o(this, pVar.j);
                pVar.c = 81;
            } else if (pVar.n && oVar.getChildCount() > 0) {
                pVar.e.removeAllViews();
            }
            View view = pVar.g;
            if (view == null) {
                if (pVar.h != null) {
                    if (this.w == null) {
                        this.w = new f0(this, 14);
                    }
                    f0 f0Var = this.w;
                    if (pVar.i == null) {
                        l.h hVar = new l.h(pVar.j);
                        pVar.i = hVar;
                        hVar.e = f0Var;
                        l.l lVar = pVar.h;
                        lVar.b(hVar, lVar.a);
                    }
                    l.h hVar2 = pVar.i;
                    o oVar2 = pVar.e;
                    if (hVar2.d == null) {
                        hVar2.d = (ExpandedMenuView) hVar2.b.inflate(org.telegram.messenger.beta.R.layout.abc_expanded_menu_layout, (ViewGroup) oVar2, false);
                        if (hVar2.f == null) {
                            hVar2.f = new l.g(hVar2);
                        }
                        hVar2.d.setAdapter((ListAdapter) hVar2.f);
                        hVar2.d.setOnItemClickListener(hVar2);
                    }
                    ExpandedMenuView expandedMenuView = hVar2.d;
                    pVar.f = expandedMenuView;
                }
                pVar.n = true;
                return;
            }
            pVar.f = view;
            if (pVar.f != null) {
                if (pVar.g == null) {
                    l.h hVar3 = pVar.i;
                    if (hVar3.f == null) {
                        hVar3.f = new l.g(hVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = pVar.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                pVar.e.setBackgroundResource(pVar.b);
                ViewParent parent = pVar.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(pVar.f);
                }
                pVar.e.addView(pVar.f, layoutParams2);
                if (!pVar.f.hasFocus()) {
                    pVar.f.requestFocus();
                }
            }
            pVar.n = true;
            return;
        }
        View view2 = pVar.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i10 = -1;
            pVar.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = pVar.c;
            layoutParams3.windowAnimations = pVar.d;
            windowManager.addView(pVar.e, layoutParams3);
            pVar.m = true;
            if (i11 != 0) {
                y();
                return;
            }
            return;
        }
        i10 = -2;
        pVar.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = pVar.c;
        layoutParams32.windowAnimations = pVar.d;
        windowManager.addView(pVar.e, layoutParams32);
        pVar.m = true;
        if (i11 != 0) {
        }
    }

    public final boolean v(p pVar, int i10, KeyEvent keyEvent) {
        l.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((pVar.k || w(pVar, keyEvent)) && (lVar = pVar.h) != null) {
            return lVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(p pVar, KeyEvent keyEvent) {
        j1 j1Var;
        j1 j1Var2;
        Resources.Theme theme;
        j1 j1Var3;
        j1 j1Var4;
        if (!this.W) {
            boolean z4 = pVar.k;
            int i10 = pVar.a;
            if (z4) {
                return true;
            }
            p pVar2 = this.S;
            if (pVar2 != null && pVar2 != pVar) {
                h(pVar2, false);
            }
            Window.Callback callback = this.f.getCallback();
            if (callback != null) {
                pVar.g = callback.onCreatePanelView(i10);
            }
            boolean z10 = i10 == 0 || i10 == 108;
            if (z10 && (j1Var4 = this.s) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var4;
                actionBarOverlayLayout.f();
                ((n3) actionBarOverlayLayout.e).l = true;
            }
            if (pVar.g == null) {
                l.l lVar = pVar.h;
                if (lVar == null || pVar.o) {
                    if (lVar == null) {
                        Context context = this.e;
                        if ((i10 == 0 || i10 == 108) && this.s != null) {
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
                        l.l lVar2 = new l.l(context);
                        lVar2.e = this;
                        l.l lVar3 = pVar.h;
                        if (lVar2 != lVar3) {
                            if (lVar3 != null) {
                                lVar3.r(pVar.i);
                            }
                            pVar.h = lVar2;
                            l.h hVar = pVar.i;
                            if (hVar != null) {
                                lVar2.b(hVar, lVar2.a);
                            }
                        }
                    }
                    if (z10 && (j1Var2 = this.s) != null) {
                        if (this.v == null) {
                            this.v = new y5.h(this, 17);
                        }
                        ((ActionBarOverlayLayout) j1Var2).g(pVar.h, this.v);
                    }
                    pVar.h.w();
                    if (callback.onCreatePanelMenu(i10, pVar.h)) {
                        pVar.o = false;
                    } else {
                        l.l lVar4 = pVar.h;
                        if (lVar4 != null) {
                            if (lVar4 != null) {
                                lVar4.r(pVar.i);
                            }
                            pVar.h = null;
                        }
                        if (z10 && (j1Var = this.s) != null) {
                            ((ActionBarOverlayLayout) j1Var).g(null, this.v);
                        }
                    }
                }
                pVar.h.w();
                Bundle bundle = pVar.p;
                if (bundle != null) {
                    pVar.h.s(bundle);
                    pVar.p = null;
                }
                if (!callback.onPreparePanel(0, pVar.g, pVar.h)) {
                    if (z10 && (j1Var3 = this.s) != null) {
                        ((ActionBarOverlayLayout) j1Var3).g(null, this.v);
                    }
                    pVar.h.v();
                    return false;
                }
                pVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                pVar.h.v();
            }
            pVar.k = true;
            pVar.l = false;
            this.S = pVar;
            return true;
        }
        return false;
    }

    public final void x() {
        if (this.F) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z4 = false;
            if (this.l0 != null && (p(0).m || this.x != null)) {
                z4 = true;
            }
            if (z4 && this.m0 == null) {
                this.m0 = l.b(this.l0, this);
            } else {
                if (z4 || (onBackInvokedCallback = this.m0) == null) {
                    return;
                }
                l.c(this.l0, onBackInvokedCallback);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
