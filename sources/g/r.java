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
import c3.i0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.g3;
import m.j1;
import m.k1;
import m.l3;
import m.s3;
import org.telegram.messenger.zs;
import org.webrtc.MediaStreamTrack;
import r0.h0;
import r0.k0;
import v7.k7;
import w7.v6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r extends g implements l.j, LayoutInflater.Factory2 {
    public static final a0.l q0 = new a0.l(0);
    public static final int[] r0 = {R.attr.windowBackground};
    public static final boolean s0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView D;
    public PopupWindow E;
    public h F;
    public k0 G;
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
    public q[] U;
    public q V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public Configuration a0;
    public final int b0;
    public int c0;
    public final t d;
    public int d0;
    public final Context e;
    public boolean e0;
    public Window f;
    public n f0;
    public n g0;
    public m h;
    public boolean h0;
    public int i0;
    public final h j0;
    public boolean k0;
    public Rect l0;
    public Rect m0;
    public b0 n;
    public v n0;
    public OnBackInvokedDispatcher o0;
    public OnBackInvokedCallback p0;
    public CharSequence r;
    public j1 s;
    public za.c w;
    public a6.i x;
    public k.a y;

    public r(t tVar, t tVar2) {
        Context context = tVar.getContext();
        Window window = tVar.getWindow();
        this.G = null;
        this.H = true;
        this.b0 = -100;
        this.j0 = new h(this, 0);
        this.e = context;
        this.d = tVar;
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

    @Override // g.g
    public final void a() {
        this.X = true;
        d(false);
        l();
        this.a0 = new Configuration(this.e.getResources().getConfiguration());
        this.Y = true;
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
                        if (this.g0 == null) {
                            this.g0 = new n(this, context);
                        }
                        i11 = this.g0.e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    i11 = n(context).e();
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
            k.b(configuration2);
        } else {
            n0.c.b(j.a(configuration2.locale));
        }
        int i17 = i14 != i15 ? 512 : 0;
        if (((~i13) & i17) != 0 && z10 && this.X && !s0) {
            boolean z12 = this.Y;
        }
        if (i17 != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i15 | (resources.getConfiguration().uiMode & (-49));
            Object obj2 = null;
            resources.updateConfiguration(configuration3, null);
            if (i16 < 26 && i16 < 28) {
                if (i16 >= 24) {
                    if (!k7.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            k7.g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                        }
                        k7.h = true;
                    }
                    Field field = k7.g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e7) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e7);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!k7.b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    k7.a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e10) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
                                }
                                k7.b = true;
                            }
                            Field field2 = k7.a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e11) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
                                }
                            }
                            if (obj2 != null) {
                                k7.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!k7.b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            k7.a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e12) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e12);
                        }
                        k7.b = true;
                    }
                    Field field3 = k7.a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e13) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e13);
                        }
                    }
                    if (obj2 != null) {
                        k7.a(obj2);
                    }
                }
            }
            int i18 = this.c0;
            if (i18 != 0) {
                context.setTheme(i18);
                context.getTheme().applyStyle(this.c0, true);
            }
            z11 = true;
        }
        if (i10 == 0) {
            n(context).l();
        } else {
            n nVar = this.f0;
            if (nVar != null) {
                nVar.c();
            }
        }
        if (i10 == 3) {
            if (this.g0 == null) {
                this.g0 = new n(this, context);
            }
            this.g0.l();
        } else {
            n nVar2 = this.g0;
            if (nVar2 != null) {
                nVar2.c();
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
        if (callback instanceof m) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        m mVar = new m(this, callback);
        this.h = mVar;
        window.setCallback(mVar);
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
            l.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.p0 = null;
        }
        this.o0 = null;
        y();
    }

    public final void f(int i10, q qVar, l.l lVar) {
        if (lVar == null) {
            if (qVar == null && i10 >= 0) {
                q[] qVarArr = this.U;
                if (i10 < qVarArr.length) {
                    qVar = qVarArr[i10];
                }
            }
            if (qVar != null) {
                lVar = qVar.h;
            }
        }
        if ((qVar == null || qVar.m) && !this.Z) {
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
        if (this.T) {
            return;
        }
        this.T = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.s;
        actionBarOverlayLayout.e();
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
            callback.onPanelClosed(zs.t1, lVar);
        }
        this.T = false;
    }

    public final void h(q qVar, boolean z10) {
        p pVar;
        j1 j1Var;
        m.h hVar;
        if (z10 && qVar.a == 0 && (j1Var = this.s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((l3) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (hVar = actionMenuView.J) != null && hVar.h()) {
                g(qVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && qVar.m && (pVar = qVar.e) != null) {
            windowManager.removeView(pVar);
            if (z10) {
                f(qVar.a, qVar, null);
            }
        }
        qVar.k = false;
        qVar.l = false;
        qVar.m = false;
        qVar.f = null;
        qVar.n = true;
        if (this.V == qVar) {
            this.V = null;
        }
        if (qVar.a == 0) {
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
        t tVar = this.d;
        if ((!(tVar instanceof r0.i) && !i0.t(tVar)) || (decorView = this.f.getDecorView()) == null || !v6.a(decorView, keyEvent)) {
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
                    this.W = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        q o10 = o(0);
                        if (!o10.m) {
                            w(o10, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.y == null) {
                        q o11 = o(0);
                        j1 j1Var = this.s;
                        Context context = this.e;
                        if (j1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
                            actionBarOverlayLayout.e();
                            Toolbar toolbar = ((l3) actionBarOverlayLayout.e).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.I && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                                actionBarOverlayLayout2.e();
                                ActionMenuView actionMenuView2 = ((l3) actionBarOverlayLayout2.e).a.a;
                                if (actionMenuView2 == null || (hVar = actionMenuView2.J) == null || !hVar.h()) {
                                    if (!this.Z && w(o11, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s;
                                        actionBarOverlayLayout3.e();
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
                                    actionBarOverlayLayout4.e();
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
                        boolean z12 = o11.m;
                        if (z12 || o11.l) {
                            h(o11, true);
                            z10 = z12;
                            if (z10) {
                            }
                        } else {
                            if (o11.k) {
                                if (o11.o) {
                                    o11.k = false;
                                    z11 = w(o11, keyEvent);
                                } else {
                                    z11 = true;
                                }
                                if (z11) {
                                    t(o11, keyEvent);
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

    public final void j(int i10) {
        q o10 = o(i10);
        if (o10.h != null) {
            Bundle bundle = new Bundle();
            o10.h.t(bundle);
            if (bundle.size() > 0) {
                o10.p = bundle;
            }
            o10.h.w();
            o10.h.clear();
        }
        o10.o = true;
        o10.n = true;
        if ((i10 == 108 || i10 == 0) && this.s != null) {
            q o11 = o(0);
            o11.k = false;
            w(o11, null);
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
        if (!obtainStyledAttributes.hasValue(zs.C1)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(zs.K1, false)) {
            c(1);
        } else if (obtainStyledAttributes.getBoolean(zs.C1, false)) {
            c(zs.t1);
        }
        if (obtainStyledAttributes.getBoolean(zs.D1, false)) {
            c(zs.u1);
        }
        if (obtainStyledAttributes.getBoolean(zs.E1, false)) {
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
                ((ActionBarOverlayLayout) this.s).d(zs.u1);
            }
            if (this.M) {
                ((ActionBarOverlayLayout) this.s).d(2);
            }
            if (this.N) {
                ((ActionBarOverlayLayout) this.s).d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.O + ", windowActionBarOverlay: " + this.P + ", android:windowIsFloating: " + this.R + ", windowActionModeOverlay: " + this.Q + ", windowNoTitle: " + this.S + " }");
        }
        a4.l lVar = new a4.l(this, 16);
        WeakHashMap weakHashMap = h0.a;
        r0.z.i(viewGroup, lVar);
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
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e7) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
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
        contentFrameLayout.setAttachListener(new k6.h(this, 24));
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
                                h0.k(toolbar.getRootView(), charSequence);
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
        WeakHashMap weakHashMap2 = h0.a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(zs.I1, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(zs.J1, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(zs.G1)) {
            obtainStyledAttributes2.getValue(zs.G1, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(zs.H1)) {
            obtainStyledAttributes2.getValue(zs.H1, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(zs.F1)) {
            obtainStyledAttributes2.getValue(zs.F1, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.I = true;
        q o10 = o(0);
        if (this.Z || o10.h != null) {
            return;
        }
        r(zs.t1);
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

    public final o n(Context context) {
        if (this.f0 == null) {
            if (android.support.v4.media.session.a0.f == null) {
                Context applicationContext = context.getApplicationContext();
                android.support.v4.media.session.a0.f = new android.support.v4.media.session.a0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f0 = new n(this, android.support.v4.media.session.a0.f);
        }
        return this.f0;
    }

    public final q o(int i10) {
        q[] qVarArr = this.U;
        if (qVarArr == null || qVarArr.length <= i10) {
            q[] qVarArr2 = new q[i10 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.U = qVarArr2;
            qVarArr = qVarArr2;
        }
        q qVar = qVarArr[i10];
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q();
        qVar2.a = i10;
        qVar2.n = false;
        qVarArr[i10] = qVar2;
        return qVar2;
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
        throw new UnsupportedOperationException("Method not decompiled: g.r.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // l.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(l.l lVar) {
        ActionMenuView actionMenuView;
        m.h hVar;
        m.h hVar2;
        m.h hVar3;
        j1 j1Var = this.s;
        if (j1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.e();
            Toolbar toolbar = ((l3) actionBarOverlayLayout.e).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.I) {
                if (ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout2.e();
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
                actionBarOverlayLayout3.e();
                ActionMenuView actionMenuView3 = ((l3) actionBarOverlayLayout3.e).a.a;
                if (actionMenuView3 != null && (hVar2 = actionMenuView3.J) != null && hVar2.h()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout4.e();
                    ActionMenuView actionMenuView4 = ((l3) actionBarOverlayLayout4.e).a.a;
                    if (actionMenuView4 != null && (hVar3 = actionMenuView4.J) != null) {
                        hVar3.f();
                    }
                    if (this.Z) {
                        return;
                    }
                    callback.onPanelClosed(zs.t1, o(0).h);
                    return;
                }
                if (callback == null || this.Z) {
                    return;
                }
                if (this.h0 && (1 & this.i0) != 0) {
                    View decorView = this.f.getDecorView();
                    h hVar5 = this.j0;
                    decorView.removeCallbacks(hVar5);
                    hVar5.run();
                }
                q o10 = o(0);
                l.l lVar2 = o10.h;
                if (lVar2 == null || o10.o || !callback.onPreparePanel(0, o10.g, lVar2)) {
                    return;
                }
                callback.onMenuOpened(zs.t1, o10.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.s;
                actionBarOverlayLayout5.e();
                ActionMenuView actionMenuView5 = ((l3) actionBarOverlayLayout5.e).a.a;
                if (actionMenuView5 == null || (hVar = actionMenuView5.J) == null) {
                    return;
                }
                hVar.l();
                return;
            }
        }
        q o11 = o(0);
        o11.n = true;
        h(o11, false);
        t(o11, null);
    }

    public final b0 q() {
        k();
        if (this.O && this.n == null) {
            t tVar = this.d;
            if (i0.t(tVar)) {
                this.n = new b0(tVar);
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
        WeakHashMap weakHashMap = h0.a;
        decorView.postOnAnimation(this.j0);
        this.h0 = true;
    }

    public final boolean s() {
        k1 k1Var;
        g3 g3Var;
        boolean z10 = this.W;
        this.W = false;
        q o10 = o(0);
        if (!o10.m) {
            k.a aVar = this.y;
            if (aVar != null) {
                aVar.b();
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
            h(o10, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0166, code lost:
    
        if (r15.f.getCount() > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0146, code lost:
    
        if (r15 != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(q qVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        boolean z10 = qVar.m;
        int i11 = qVar.a;
        if (z10 || this.Z) {
            return;
        }
        Context context = this.e;
        if (i11 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !callback.onMenuOpened(i11, qVar.h)) {
            h(qVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !w(qVar, keyEvent)) {
            return;
        }
        p pVar = qVar.e;
        if (pVar == null || qVar.n) {
            if (pVar == null) {
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
                qVar.j = cVar;
                TypedArray obtainStyledAttributes = cVar.obtainStyledAttributes(f.a.j);
                qVar.b = obtainStyledAttributes.getResourceId(86, 0);
                qVar.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                qVar.e = new p(this, qVar.j);
                qVar.c = 81;
            } else if (qVar.n && pVar.getChildCount() > 0) {
                qVar.e.removeAllViews();
            }
            View view = qVar.g;
            if (view == null) {
                if (qVar.h != null) {
                    if (this.x == null) {
                        this.x = new a6.i(this, 23);
                    }
                    a6.i iVar = this.x;
                    if (qVar.i == null) {
                        l.h hVar = new l.h(qVar.j);
                        qVar.i = hVar;
                        hVar.e = iVar;
                        l.l lVar = qVar.h;
                        lVar.b(hVar, lVar.a);
                    }
                    l.h hVar2 = qVar.i;
                    p pVar2 = qVar.e;
                    if (hVar2.d == null) {
                        hVar2.d = (ExpandedMenuView) hVar2.b.inflate(org.telegram.messenger.beta.R.layout.abc_expanded_menu_layout, (ViewGroup) pVar2, false);
                        if (hVar2.f == null) {
                            hVar2.f = new l.g(hVar2);
                        }
                        hVar2.d.setAdapter((ListAdapter) hVar2.f);
                        hVar2.d.setOnItemClickListener(hVar2);
                    }
                    ExpandedMenuView expandedMenuView = hVar2.d;
                    qVar.f = expandedMenuView;
                }
                qVar.n = true;
                return;
            }
            qVar.f = view;
            if (qVar.f != null) {
                if (qVar.g == null) {
                    l.h hVar3 = qVar.i;
                    if (hVar3.f == null) {
                        hVar3.f = new l.g(hVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = qVar.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                qVar.e.setBackgroundResource(qVar.b);
                ViewParent parent = qVar.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(qVar.f);
                }
                qVar.e.addView(qVar.f, layoutParams2);
                if (!qVar.f.hasFocus()) {
                    qVar.f.requestFocus();
                }
            }
            qVar.n = true;
            return;
        }
        View view2 = qVar.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i10 = -1;
            qVar.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = qVar.c;
            layoutParams3.windowAnimations = qVar.d;
            windowManager.addView(qVar.e, layoutParams3);
            qVar.m = true;
            if (i11 != 0) {
                y();
                return;
            }
            return;
        }
        i10 = -2;
        qVar.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = qVar.c;
        layoutParams32.windowAnimations = qVar.d;
        windowManager.addView(qVar.e, layoutParams32);
        qVar.m = true;
        if (i11 != 0) {
        }
    }

    @Override // l.j
    public final boolean u(l.l lVar, MenuItem menuItem) {
        q qVar;
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.Z) {
            l.l k10 = lVar.k();
            q[] qVarArr = this.U;
            int length = qVarArr != null ? qVarArr.length : 0;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    qVar = qVarArr[i10];
                    if (qVar != null && qVar.h == k10) {
                        break;
                    }
                    i10++;
                } else {
                    qVar = null;
                    break;
                }
            }
            if (qVar != null) {
                return callback.onMenuItemSelected(qVar.a, menuItem);
            }
        }
        return false;
    }

    public final boolean v(q qVar, int i10, KeyEvent keyEvent) {
        l.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.k || w(qVar, keyEvent)) && (lVar = qVar.h) != null) {
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
    public final boolean w(q qVar, KeyEvent keyEvent) {
        j1 j1Var;
        j1 j1Var2;
        Resources.Theme theme;
        j1 j1Var3;
        j1 j1Var4;
        if (!this.Z) {
            boolean z10 = qVar.k;
            int i10 = qVar.a;
            if (z10) {
                return true;
            }
            q qVar2 = this.V;
            if (qVar2 != null && qVar2 != qVar) {
                h(qVar2, false);
            }
            Window.Callback callback = this.f.getCallback();
            if (callback != null) {
                qVar.g = callback.onCreatePanelView(i10);
            }
            boolean z11 = i10 == 0 || i10 == 108;
            if (z11 && (j1Var4 = this.s) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var4;
                actionBarOverlayLayout.e();
                ((l3) actionBarOverlayLayout.e).l = true;
            }
            if (qVar.g == null) {
                l.l lVar = qVar.h;
                if (lVar == null || qVar.o) {
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
                        l.l lVar3 = qVar.h;
                        if (lVar2 != lVar3) {
                            if (lVar3 != null) {
                                lVar3.r(qVar.i);
                            }
                            qVar.h = lVar2;
                            l.h hVar = qVar.i;
                            if (hVar != null) {
                                lVar2.b(hVar, lVar2.a);
                            }
                        }
                    }
                    if (z11 && (j1Var2 = this.s) != null) {
                        if (this.w == null) {
                            this.w = new za.c(this, 20);
                        }
                        ((ActionBarOverlayLayout) j1Var2).f(qVar.h, this.w);
                    }
                    qVar.h.w();
                    if (callback.onCreatePanelMenu(i10, qVar.h)) {
                        qVar.o = false;
                    } else {
                        l.l lVar4 = qVar.h;
                        if (lVar4 != null) {
                            if (lVar4 != null) {
                                lVar4.r(qVar.i);
                            }
                            qVar.h = null;
                        }
                        if (z11 && (j1Var = this.s) != null) {
                            ((ActionBarOverlayLayout) j1Var).f(null, this.w);
                        }
                    }
                }
                qVar.h.w();
                Bundle bundle = qVar.p;
                if (bundle != null) {
                    qVar.h.s(bundle);
                    qVar.p = null;
                }
                if (!callback.onPreparePanel(0, qVar.g, qVar.h)) {
                    if (z11 && (j1Var3 = this.s) != null) {
                        ((ActionBarOverlayLayout) j1Var3).f(null, this.w);
                    }
                    qVar.h.v();
                    return false;
                }
                qVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                qVar.h.v();
            }
            qVar.k = true;
            qVar.l = false;
            this.V = qVar;
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
            if (this.o0 != null && (o(0).m || this.y != null)) {
                z10 = true;
            }
            if (z10 && this.p0 == null) {
                this.p0 = l.b(this.o0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.p0) == null) {
                    return;
                }
                l.c(this.o0, onBackInvokedCallback);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
