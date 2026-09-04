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
import com.google.android.gms.internal.vision.e2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;
import m.g3;
import m.j1;
import m.k1;
import m.l3;
import m.s3;
import org.webrtc.MediaStreamTrack;
import r0.i0;
import r0.l0;
import v7.k7;
import w7.v6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class s extends h implements l.j, LayoutInflater.Factory2 {
    public static final a0.l q0 = new a0.l(0);
    public static final int[] r0 = {R.attr.windowBackground};
    public static final boolean s0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow E;
    public i F;
    public l0 G;
    public final boolean H;
    public boolean I;
    public ViewGroup J;
    public TextView K;
    public View L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public r[] U;
    public r V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public Configuration a0;
    public final int b0;
    public int c0;
    public final u d;
    public int d0;
    public final Context e;
    public boolean e0;
    public Window f;
    public o f0;
    public o g0;
    public n h;
    public boolean h0;
    public int i0;
    public final i j0;
    public boolean k0;
    public Rect l0;
    public Rect m0;
    public b0 n;
    public w n0;
    public OnBackInvokedDispatcher o0;
    public OnBackInvokedCallback p0;
    public CharSequence r;
    public j1 s;
    public xa.c v;
    public a6.i w;
    public k.a x;
    public ActionBarContextView y;

    public s(u uVar, u uVar2) {
        Context context = uVar.getContext();
        Window window = uVar.getWindow();
        this.G = null;
        this.H = true;
        this.b0 = -100;
        this.j0 = new i(this, 0);
        this.e = context;
        this.d = uVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.b0 == -100) {
            String name = this.d.getClass().getName();
            a0.l lVar = q0;
            Integer num = (Integer) lVar.get(name);
            if (num != null) {
                this.b0 = num.intValue();
                lVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        m.q.c();
    }

    @Override // g.h
    public final void a() {
        this.X = true;
        d(false);
        l();
        this.a0 = new Configuration(this.e.getResources().getConfiguration());
        this.Y = true;
    }

    @Override // g.h
    public final boolean c(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.S && i10 == 108) {
            return false;
        }
        if (this.O && i10 == 1) {
            this.O = false;
        }
        if (i10 == 1) {
            x();
            this.S = true;
            return true;
        }
        if (i10 == 2) {
            x();
            this.M = true;
            return true;
        }
        if (i10 == 5) {
            x();
            this.N = true;
            return true;
        }
        if (i10 == 10) {
            x();
            this.Q = true;
            return true;
        }
        if (i10 == 108) {
            x();
            this.O = true;
            return true;
        }
        if (i10 != 109) {
            return this.f.requestFeature(i10);
        }
        x();
        this.P = true;
        return true;
    }

    public final boolean d(boolean z10) {
        Object obj;
        boolean z11 = false;
        if (this.Z) {
            return false;
        }
        int i10 = this.b0;
        if (i10 == -100) {
            i10 = h.a;
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
                        if (this.g0 == null) {
                            this.g0 = new o(this, context);
                        }
                        i11 = this.g0.e();
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
        this.e0 = true;
        int i13 = this.d0;
        Configuration configuration2 = this.a0;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i14 = configuration2.uiMode & 48;
        int i15 = configuration.uiMode & 48;
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            l.b(configuration2);
        } else {
            n0.c.b(k.a(configuration2.locale));
        }
        int i17 = i14 != i15 ? 512 : 0;
        if (((~i13) & i17) != 0 && z10 && this.X && !s0) {
            boolean z12 = this.Y;
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
                    if (!k7.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            k7.g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e7) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e7);
                        }
                        k7.h = true;
                    }
                    Field field = k7.g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!k7.b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    k7.a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e11) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                                }
                                k7.b = true;
                            }
                            Field field2 = k7.a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                }
                            }
                            if (obj2 != null) {
                                k7.a(obj2);
                            }
                        }
                    }
                } else if (i16 >= 23) {
                    if (!k7.b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            k7.a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e13) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e13);
                        }
                        k7.b = true;
                    }
                    Field field3 = k7.a;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e14);
                        }
                    }
                    if (obj3 != null) {
                        k7.a(obj3);
                    }
                } else {
                    if (!k7.b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            k7.a = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e15);
                        }
                        k7.b = true;
                    }
                    Field field4 = k7.a;
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
            int i18 = this.c0;
            if (i18 != 0) {
                context.setTheme(i18);
                if (Build.VERSION.SDK_INT >= 23) {
                    context.getTheme().applyStyle(this.c0, true);
                }
            }
            z11 = true;
        }
        if (i10 == 0) {
            o(context).l();
        } else {
            o oVar = this.f0;
            if (oVar != null) {
                oVar.c();
            }
        }
        if (i10 == 3) {
            if (this.g0 == null) {
                this.g0 = new o(this, context);
            }
            this.g0.l();
        } else {
            o oVar2 = this.g0;
            if (oVar2 != null) {
                oVar2.c();
            }
        }
        return z11;
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
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(this, callback);
        this.h = nVar;
        window.setCallback(nVar);
        Context context = this.e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, r0);
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
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.o0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.p0) != null) {
            m.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.p0 = null;
        }
        this.o0 = null;
        y();
    }

    public final void f(int i10, r rVar, l.l lVar) {
        if (lVar == null) {
            if (rVar == null && i10 >= 0) {
                r[] rVarArr = this.U;
                if (i10 < rVarArr.length) {
                    rVar = rVarArr[i10];
                }
            }
            if (rVar != null) {
                lVar = rVar.h;
            }
        }
        if ((rVar == null || rVar.m) && !this.Z) {
            n nVar = this.h;
            Window.Callback callback = this.f.getCallback();
            nVar.getClass();
            try {
                nVar.d = true;
                callback.onPanelClosed(i10, lVar);
            } finally {
                nVar.d = false;
            }
        }
    }

    public final void g(l.l lVar) {
        m.h hVar;
        if (this.T) {
            return;
        }
        this.T = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.s;
        actionBarOverlayLayout.f();
        ActionMenuView actionMenuView = ((l3) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (hVar = actionMenuView.J) != null) {
            hVar.f();
            m.d dVar = hVar.J;
            if (dVar != null && dVar.b()) {
                dVar.i.dismiss();
            }
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.Z) {
            callback.onPanelClosed(108, lVar);
        }
        this.T = false;
    }

    public final void h(r rVar, boolean z10) {
        q qVar;
        j1 j1Var;
        m.h hVar;
        if (z10 && rVar.a == 0 && (j1Var = this.s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.f();
            ActionMenuView actionMenuView = ((l3) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (hVar = actionMenuView.J) != null && hVar.g()) {
                g(rVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && rVar.m && (qVar = rVar.e) != null) {
            windowManager.removeView(qVar);
            if (z10) {
                f(rVar.a, rVar, null);
            }
        }
        rVar.k = false;
        rVar.l = false;
        rVar.m = false;
        rVar.f = null;
        rVar.n = true;
        if (this.V == rVar) {
            this.V = null;
        }
        if (rVar.a == 0) {
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
        boolean z10;
        boolean z11;
        ActionMenuView actionMenuView;
        m.h hVar;
        u uVar = this.d;
        if ((!(uVar instanceof r0.j) && !e2.u(uVar)) || (decorView = this.f.getDecorView()) == null || !v6.a(decorView, keyEvent)) {
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
                    this.W = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        r p5 = p(0);
                        if (!p5.m) {
                            w(p5, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.x == null) {
                        r p10 = p(0);
                        j1 j1Var = this.s;
                        Context context = this.e;
                        if (j1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
                            actionBarOverlayLayout.f();
                            Toolbar toolbar = ((l3) actionBarOverlayLayout.e).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.I && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                                actionBarOverlayLayout2.f();
                                ActionMenuView actionMenuView2 = ((l3) actionBarOverlayLayout2.e).a.a;
                                if (actionMenuView2 == null || (hVar = actionMenuView2.J) == null || !hVar.g()) {
                                    if (!this.Z && w(p10, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s;
                                        actionBarOverlayLayout3.f();
                                        ActionMenuView actionMenuView3 = ((l3) actionBarOverlayLayout3.e).a.a;
                                        if (actionMenuView3 != null) {
                                            m.h hVar2 = actionMenuView3.J;
                                            if (hVar2 != null) {
                                            }
                                        }
                                    }
                                    z10 = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s;
                                    actionBarOverlayLayout4.f();
                                    ActionMenuView actionMenuView4 = ((l3) actionBarOverlayLayout4.e).a.a;
                                    if (actionMenuView4 != null) {
                                        m.h hVar3 = actionMenuView4.J;
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
                        boolean z12 = p10.m;
                        if (z12 || p10.l) {
                            h(p10, true);
                            z10 = z12;
                            if (z10) {
                            }
                        } else {
                            if (p10.k) {
                                if (p10.o) {
                                    p10.k = false;
                                    z11 = w(p10, keyEvent);
                                } else {
                                    z11 = true;
                                }
                                if (z11) {
                                    u(p10, keyEvent);
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
            if (!t()) {
                return false;
            }
        }
        return true;
    }

    public final void j(int i10) {
        r p5 = p(i10);
        if (p5.h != null) {
            Bundle bundle = new Bundle();
            p5.h.t(bundle);
            if (bundle.size() > 0) {
                p5.p = bundle;
            }
            p5.h.w();
            p5.h.clear();
        }
        p5.o = true;
        p5.n = true;
        if ((i10 == 108 || i10 == 0) && this.s != null) {
            r p10 = p(0);
            p10.k = false;
            w(p10, null);
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        if (this.I) {
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
        this.R = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        l();
        this.f.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.S) {
            viewGroup = this.Q ? (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.R) {
            viewGroup = (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.P = false;
            this.O = false;
        } else if (this.O) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new k.c(context, typedValue.resourceId) : context).inflate(org.telegram.messenger.beta.R.layout.abc_screen_toolbar, (ViewGroup) null);
            j1 j1Var = (j1) viewGroup.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
            this.s = j1Var;
            j1Var.setWindowCallback(this.f.getCallback());
            if (this.P) {
                ((ActionBarOverlayLayout) this.s).e(109);
            }
            if (this.M) {
                ((ActionBarOverlayLayout) this.s).e(2);
            }
            if (this.N) {
                ((ActionBarOverlayLayout) this.s).e(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.O + ", windowActionBarOverlay: " + this.P + ", android:windowIsFloating: " + this.R + ", windowActionModeOverlay: " + this.Q + ", windowNoTitle: " + this.S + " }");
        }
        a4.m mVar = new a4.m(this, 20);
        WeakHashMap weakHashMap = i0.a;
        r0.a0.j(viewGroup, mVar);
        if (this.s == null) {
            this.K = (TextView) viewGroup.findViewById(org.telegram.messenger.beta.R.id.title);
        }
        Method method = s3.a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e7) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
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
        contentFrameLayout.setAttachListener(new a6.m(this, 18));
        this.J = viewGroup;
        CharSequence charSequence = this.r;
        if (!TextUtils.isEmpty(charSequence)) {
            j1 j1Var2 = this.s;
            if (j1Var2 != null) {
                j1Var2.setWindowTitle(charSequence);
            } else {
                b0 b0Var = this.n;
                if (b0Var != null) {
                    l3 l3Var = (l3) b0Var.e;
                    if (!l3Var.g) {
                        Toolbar toolbar = l3Var.a;
                        l3Var.h = charSequence;
                        if ((l3Var.b & 8) != 0) {
                            toolbar.setTitle(charSequence);
                            if (l3Var.g) {
                                i0.l(toolbar.getRootView(), charSequence);
                            }
                        }
                    }
                } else {
                    TextView textView = this.K;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.J.findViewById(R.id.content);
        View decorView = this.f.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = i0.a;
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
        this.I = true;
        r p5 = p(0);
        if (this.Z || p5.h != null) {
            return;
        }
        r(108);
    }

    public final void l() {
        if (this.f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context m() {
        Context context;
        b0 q6 = q();
        if (q6 != null) {
            if (q6.b == null) {
                TypedValue typedValue = new TypedValue();
                q6.a.getTheme().resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarWidgetTheme, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    q6.b = new ContextThemeWrapper(q6.a, i10);
                } else {
                    q6.b = q6.a;
                }
            }
            context = q6.b;
        } else {
            context = null;
        }
        return context == null ? this.e : context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.g() != false) goto L20;
     */
    @Override // l.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(l.l lVar) {
        ActionMenuView actionMenuView;
        m.h hVar;
        m.h hVar2;
        m.h hVar3;
        j1 j1Var = this.s;
        if (j1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.f();
            Toolbar toolbar = ((l3) actionBarOverlayLayout.e).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.I) {
                if (ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout2.f();
                    ActionMenuView actionMenuView2 = ((l3) actionBarOverlayLayout2.e).a.a;
                    if (actionMenuView2 != null) {
                        m.h hVar4 = actionMenuView2.J;
                        if (hVar4 != null) {
                            if (hVar4.K == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s;
                actionBarOverlayLayout3.f();
                ActionMenuView actionMenuView3 = ((l3) actionBarOverlayLayout3.e).a.a;
                if (actionMenuView3 != null && (hVar2 = actionMenuView3.J) != null && hVar2.g()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout4.f();
                    ActionMenuView actionMenuView4 = ((l3) actionBarOverlayLayout4.e).a.a;
                    if (actionMenuView4 != null && (hVar3 = actionMenuView4.J) != null) {
                        hVar3.f();
                    }
                    if (this.Z) {
                        return;
                    }
                    callback.onPanelClosed(108, p(0).h);
                    return;
                }
                if (callback == null || this.Z) {
                    return;
                }
                if (this.h0 && (1 & this.i0) != 0) {
                    View decorView = this.f.getDecorView();
                    i iVar = this.j0;
                    decorView.removeCallbacks(iVar);
                    iVar.run();
                }
                r p5 = p(0);
                l.l lVar2 = p5.h;
                if (lVar2 == null || p5.o || !callback.onPreparePanel(0, p5.g, lVar2)) {
                    return;
                }
                callback.onMenuOpened(108, p5.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.s;
                actionBarOverlayLayout5.f();
                ActionMenuView actionMenuView5 = ((l3) actionBarOverlayLayout5.e).a.a;
                if (actionMenuView5 == null || (hVar = actionMenuView5.J) == null) {
                    return;
                }
                hVar.l();
                return;
            }
        }
        r p10 = p(0);
        p10.n = true;
        h(p10, false);
        u(p10, null);
    }

    public final p o(Context context) {
        if (this.f0 == null) {
            if (aa.a.e == null) {
                Context applicationContext = context.getApplicationContext();
                aa.a.e = new aa.a(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f0 = new o(this, aa.a.e);
        }
        return this.f0;
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

    public final r p(int i10) {
        r[] rVarArr = this.U;
        if (rVarArr == null || rVarArr.length <= i10) {
            r[] rVarArr2 = new r[i10 + 1];
            if (rVarArr != null) {
                System.arraycopy(rVarArr, 0, rVarArr2, 0, rVarArr.length);
            }
            this.U = rVarArr2;
            rVarArr = rVarArr2;
        }
        r rVar = rVarArr[i10];
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r();
        rVar2.a = i10;
        rVar2.n = false;
        rVarArr[i10] = rVar2;
        return rVar2;
    }

    public final b0 q() {
        k();
        if (this.O && this.n == null) {
            u uVar = this.d;
            if (e2.u(uVar)) {
                this.n = new b0(uVar);
            }
            b0 b0Var = this.n;
            if (b0Var != null) {
                b0Var.c(this.k0);
            }
        }
        return this.n;
    }

    public final void r(int i10) {
        this.i0 = (1 << i10) | this.i0;
        if (this.h0) {
            return;
        }
        View decorView = this.f.getDecorView();
        WeakHashMap weakHashMap = i0.a;
        decorView.postOnAnimation(this.j0);
        this.h0 = true;
    }

    @Override // l.j
    public final boolean s(l.l lVar, MenuItem menuItem) {
        r rVar;
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.Z) {
            l.l k10 = lVar.k();
            r[] rVarArr = this.U;
            int length = rVarArr != null ? rVarArr.length : 0;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    rVar = rVarArr[i10];
                    if (rVar != null && rVar.h == k10) {
                        break;
                    }
                    i10++;
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

    public final boolean t() {
        k1 k1Var;
        g3 g3Var;
        boolean z10 = this.W;
        this.W = false;
        r p5 = p(0);
        if (!p5.m) {
            k.a aVar = this.x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            b0 q6 = q();
            if (q6 == null || (k1Var = q6.e) == null || (g3Var = ((l3) k1Var).a.e0) == null || g3Var.b == null) {
                return false;
            }
            g3 g3Var2 = ((l3) k1Var).a.e0;
            l.n nVar = g3Var2 == null ? null : g3Var2.b;
            if (nVar != null) {
                nVar.collapseActionView();
            }
        } else if (!z10) {
            h(p5, true);
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
    public final void u(r rVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        boolean z10 = rVar.m;
        int i11 = rVar.a;
        if (z10 || this.Z) {
            return;
        }
        Context context = this.e;
        if (i11 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !callback.onMenuOpened(i11, rVar.h)) {
            h(rVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !w(rVar, keyEvent)) {
            return;
        }
        q qVar = rVar.e;
        if (qVar == null || rVar.n) {
            if (qVar == null) {
                Context m10 = m();
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = m10.getResources().newTheme();
                newTheme.setTo(m10.getTheme());
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
                k.c cVar = new k.c(m10, 0);
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
                    if (this.w == null) {
                        this.w = new a6.i(this, 21);
                    }
                    a6.i iVar = this.w;
                    if (rVar.i == null) {
                        l.h hVar = new l.h(rVar.j);
                        rVar.i = hVar;
                        hVar.e = iVar;
                        l.l lVar = rVar.h;
                        lVar.b(hVar, lVar.a);
                    }
                    l.h hVar2 = rVar.i;
                    q qVar2 = rVar.e;
                    if (hVar2.d == null) {
                        hVar2.d = (ExpandedMenuView) hVar2.b.inflate(org.telegram.messenger.beta.R.layout.abc_expanded_menu_layout, (ViewGroup) qVar2, false);
                        if (hVar2.f == null) {
                            hVar2.f = new l.g(hVar2);
                        }
                        hVar2.d.setAdapter((ListAdapter) hVar2.f);
                        hVar2.d.setOnItemClickListener(hVar2);
                    }
                    ExpandedMenuView expandedMenuView = hVar2.d;
                    rVar.f = expandedMenuView;
                }
                rVar.n = true;
                return;
            }
            rVar.f = view;
            if (rVar.f != null) {
                if (rVar.g == null) {
                    l.h hVar3 = rVar.i;
                    if (hVar3.f == null) {
                        hVar3.f = new l.g(hVar3);
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
            i10 = -1;
            rVar.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = rVar.c;
            layoutParams3.windowAnimations = rVar.d;
            windowManager.addView(rVar.e, layoutParams3);
            rVar.m = true;
            if (i11 != 0) {
                y();
                return;
            }
            return;
        }
        i10 = -2;
        rVar.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = rVar.c;
        layoutParams32.windowAnimations = rVar.d;
        windowManager.addView(rVar.e, layoutParams32);
        rVar.m = true;
        if (i11 != 0) {
        }
    }

    public final boolean v(r rVar, int i10, KeyEvent keyEvent) {
        l.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((rVar.k || w(rVar, keyEvent)) && (lVar = rVar.h) != null) {
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
    public final boolean w(r rVar, KeyEvent keyEvent) {
        j1 j1Var;
        j1 j1Var2;
        Resources.Theme theme;
        j1 j1Var3;
        j1 j1Var4;
        if (!this.Z) {
            boolean z10 = rVar.k;
            int i10 = rVar.a;
            if (z10) {
                return true;
            }
            r rVar2 = this.V;
            if (rVar2 != null && rVar2 != rVar) {
                h(rVar2, false);
            }
            Window.Callback callback = this.f.getCallback();
            if (callback != null) {
                rVar.g = callback.onCreatePanelView(i10);
            }
            boolean z11 = i10 == 0 || i10 == 108;
            if (z11 && (j1Var4 = this.s) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var4;
                actionBarOverlayLayout.f();
                ((l3) actionBarOverlayLayout.e).l = true;
            }
            if (rVar.g == null) {
                l.l lVar = rVar.h;
                if (lVar == null || rVar.o) {
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
                        l.l lVar3 = rVar.h;
                        if (lVar2 != lVar3) {
                            if (lVar3 != null) {
                                lVar3.r(rVar.i);
                            }
                            rVar.h = lVar2;
                            l.h hVar = rVar.i;
                            if (hVar != null) {
                                lVar2.b(hVar, lVar2.a);
                            }
                        }
                    }
                    if (z11 && (j1Var2 = this.s) != null) {
                        if (this.v == null) {
                            this.v = new xa.c(this, 18);
                        }
                        ((ActionBarOverlayLayout) j1Var2).g(rVar.h, this.v);
                    }
                    rVar.h.w();
                    if (callback.onCreatePanelMenu(i10, rVar.h)) {
                        rVar.o = false;
                    } else {
                        l.l lVar4 = rVar.h;
                        if (lVar4 != null) {
                            if (lVar4 != null) {
                                lVar4.r(rVar.i);
                            }
                            rVar.h = null;
                        }
                        if (z11 && (j1Var = this.s) != null) {
                            ((ActionBarOverlayLayout) j1Var).g(null, this.v);
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
                        ((ActionBarOverlayLayout) j1Var3).g(null, this.v);
                    }
                    rVar.h.v();
                    return false;
                }
                rVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                rVar.h.v();
            }
            rVar.k = true;
            rVar.l = false;
            this.V = rVar;
            return true;
        }
        return false;
    }

    public final void x() {
        if (this.I) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.o0 != null && (p(0).m || this.x != null)) {
                z10 = true;
            }
            if (z10 && this.p0 == null) {
                this.p0 = m.b(this.o0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.p0) == null) {
                    return;
                }
                m.c(this.o0, onBackInvokedCallback);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
