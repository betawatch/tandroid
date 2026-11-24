// default package

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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bq extends pp implements w17, LayoutInflater.Factory2 {
    public static final cka r0 = new cka(0);
    public static final int[] s0 = {R.attr.windowBackground};
    public static final boolean t0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView E;
    public PopupWindow F;
    public qp G;
    public ahc H;
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
    public aq[] V;
    public aq W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public Configuration b0;
    public final int c0;
    public final dq d;
    public int d0;
    public final Context e;
    public int e0;
    public Window f;
    public boolean f0;
    public xp g0;
    public wp h;
    public xp h0;
    public boolean i0;
    public int j0;
    public final qp k0;
    public boolean l0;
    public Rect m0;
    public azc n;
    public Rect n0;
    public cs o0;
    public OnBackInvokedDispatcher p0;
    public OnBackInvokedCallback q0;
    public CharSequence r;
    public ActionBarOverlayLayout s;
    public nl9 w;
    public sz4 x;
    public f9 y;

    public bq(dq dqVar, dq dqVar2) {
        Context context = dqVar.getContext();
        Window window = dqVar.getWindow();
        this.H = null;
        this.I = true;
        this.c0 = -100;
        this.k0 = new qp(this, (byte) 0);
        this.e = context;
        this.d = dqVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.c0 == -100) {
            String name = this.d.getClass().getName();
            cka ckaVar = r0;
            Integer num = (Integer) ckaVar.get(name);
            if (num != null) {
                this.c0 = num.intValue();
                ckaVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        fq.c();
    }

    @Override // w17
    public final boolean B(y17 y17Var, MenuItem menuItem) {
        aq aqVar;
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.a0) {
            y17 k = y17Var.k();
            aq[] aqVarArr = this.V;
            int length = aqVarArr != null ? aqVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    aqVar = aqVarArr[i];
                    if (aqVar != null && aqVar.h == k) {
                        break;
                    }
                    i++;
                } else {
                    aqVar = null;
                    break;
                }
            }
            if (aqVar != null) {
                return callback.onMenuItemSelected(aqVar.a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.f() != false) goto L20;
     */
    @Override // w17
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T1(y17 y17Var) {
        ActionMenuView actionMenuView;
        b9 b9Var;
        b9 b9Var2;
        b9 b9Var3;
        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.e();
            Toolbar toolbar = ((jvb) actionBarOverlayLayout.e).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.J) {
                if (ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
                    actionBarOverlayLayout2.e();
                    ActionMenuView actionMenuView2 = ((jvb) actionBarOverlayLayout2.e).a.a;
                    if (actionMenuView2 != null) {
                        b9 b9Var4 = actionMenuView2.K;
                        if (b9Var4 != null) {
                            if (b9Var4.L == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.s;
                actionBarOverlayLayout3.e();
                ActionMenuView actionMenuView3 = ((jvb) actionBarOverlayLayout3.e).a.a;
                if (actionMenuView3 != null && (b9Var2 = actionMenuView3.K) != null && b9Var2.f()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.s;
                    actionBarOverlayLayout4.e();
                    ActionMenuView actionMenuView4 = ((jvb) actionBarOverlayLayout4.e).a.a;
                    if (actionMenuView4 != null && (b9Var3 = actionMenuView4.K) != null) {
                        b9Var3.e();
                    }
                    if (this.a0) {
                        return;
                    }
                    callback.onPanelClosed(nm7.s1, o(0).h);
                    return;
                }
                if (callback == null || this.a0) {
                    return;
                }
                if (this.i0 && (this.j0 & 1) != 0) {
                    View decorView = this.f.getDecorView();
                    qp qpVar = this.k0;
                    decorView.removeCallbacks(qpVar);
                    qpVar.run();
                }
                aq o = o(0);
                y17 y17Var2 = o.h;
                if (y17Var2 == null || o.o || !callback.onPreparePanel(0, o.g, y17Var2)) {
                    return;
                }
                callback.onMenuOpened(nm7.s1, o.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.s;
                actionBarOverlayLayout5.e();
                ActionMenuView actionMenuView5 = ((jvb) actionBarOverlayLayout5.e).a.a;
                if (actionMenuView5 == null || (b9Var = actionMenuView5.K) == null) {
                    return;
                }
                b9Var.l();
                return;
            }
        }
        aq o2 = o(0);
        o2.n = true;
        h(o2, false);
        s(o2, null);
    }

    @Override // pp
    public final void a() {
        this.Y = true;
        d(false);
        l();
        this.b0 = new Configuration(this.e.getResources().getConfiguration());
        this.Z = true;
    }

    @Override // pp
    public final boolean c(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.T && i == 108) {
            return false;
        }
        if (this.P && i == 1) {
            this.P = false;
        }
        if (i == 1) {
            v();
            this.T = true;
            return true;
        }
        if (i == 2) {
            v();
            this.N = true;
            return true;
        }
        if (i == 5) {
            v();
            this.O = true;
            return true;
        }
        if (i == 10) {
            v();
            this.R = true;
            return true;
        }
        if (i == 108) {
            v();
            this.P = true;
            return true;
        }
        if (i != 109) {
            return this.f.requestFeature(i);
        }
        v();
        this.Q = true;
        return true;
    }

    public final boolean d(boolean z) {
        Object obj;
        boolean z2 = false;
        if (this.a0) {
            return false;
        }
        int i = this.c0;
        if (i == -100) {
            i = pp.a;
        }
        Context context = this.e;
        int i2 = -1;
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            dq9.m("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return false;
                        }
                        xp xpVar = this.h0;
                        if (xpVar == null) {
                            xpVar = new xp(this, context);
                            this.h0 = xpVar;
                        }
                        i2 = xpVar.e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    i2 = n(context).e();
                }
            }
            i2 = i;
        }
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i3 | (configuration.uiMode & (-49));
        this.f0 = true;
        Configuration configuration2 = this.b0;
        if (configuration2 == null) {
            configuration2 = context.getResources().getConfiguration();
        }
        int i4 = configuration2.uiMode & 48;
        int i5 = configuration.uiMode & 48;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 24) {
            tp.b(configuration2);
        } else {
            lb6.b(sp.a(configuration2.locale));
        }
        if ((i4 != i5 ? (char) 512 : (char) 0) != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i5 | (resources.getConfiguration().uiMode & (-49));
            Object obj2 = null;
            resources.updateConfiguration(configuration3, null);
            if (i6 < 26 && i6 < 28) {
                if (i6 >= 24) {
                    if (!pue.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            pue.g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                        }
                        pue.h = true;
                    }
                    Field field = pue.g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e2) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!pue.b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    pue.a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e3) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                                }
                                pue.b = true;
                            }
                            Field field2 = pue.a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e4) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                                }
                            }
                            if (obj2 != null) {
                                pue.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!pue.b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            pue.a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e5) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e5);
                        }
                        pue.b = true;
                    }
                    Field field3 = pue.a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e6) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e6);
                        }
                    }
                    if (obj2 != null) {
                        pue.a(obj2);
                    }
                }
            }
            int i7 = this.d0;
            if (i7 != 0) {
                context.setTheme(i7);
                context.getTheme().applyStyle(this.d0, true);
            }
            z2 = true;
        }
        if (i == 0) {
            n(context).l();
        } else {
            xp xpVar2 = this.g0;
            if (xpVar2 != null) {
                xpVar2.c();
            }
        }
        xp xpVar3 = this.h0;
        if (i == 3) {
            if (xpVar3 == null) {
                xpVar3 = new xp(this, context);
                this.h0 = xpVar3;
            }
            xpVar3.l();
        } else if (xpVar3 != null) {
            xpVar3.c();
        }
        return z2;
    }

    public final void e(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f != null) {
            dq9.m("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof wp) {
            dq9.m("AppCompat has already installed itself into the Window");
            return;
        }
        wp wpVar = new wp(this, callback);
        this.h = wpVar;
        window.setCallback(wpVar);
        Context context = this.e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, s0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            fq a = fq.a();
            synchronized (a) {
                drawable = a.a.f(resourceId, context, true);
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
            vp.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.q0 = null;
        }
        this.p0 = null;
        w();
    }

    public final void f(int i, aq aqVar, y17 y17Var) {
        if (y17Var == null) {
            if (aqVar == null && i >= 0) {
                aq[] aqVarArr = this.V;
                if (i < aqVarArr.length) {
                    aqVar = aqVarArr[i];
                }
            }
            if (aqVar != null) {
                y17Var = aqVar.h;
            }
        }
        if ((aqVar == null || aqVar.m) && !this.a0) {
            wp wpVar = this.h;
            Window.Callback callback = this.f.getCallback();
            wpVar.getClass();
            try {
                wpVar.d = true;
                callback.onPanelClosed(i, y17Var);
            } finally {
                wpVar.d = false;
            }
        }
    }

    public final void g(y17 y17Var) {
        b9 b9Var;
        if (this.U) {
            return;
        }
        this.U = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((jvb) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (b9Var = actionMenuView.K) != null) {
            b9Var.e();
            y8 y8Var = b9Var.K;
            if (y8Var != null && y8Var.b()) {
                y8Var.i.dismiss();
            }
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.a0) {
            callback.onPanelClosed(nm7.s1, y17Var);
        }
        this.U = false;
    }

    public final void h(aq aqVar, boolean z) {
        zp zpVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        b9 b9Var;
        if (z && aqVar.a == 0 && (actionBarOverlayLayout = this.s) != null) {
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((jvb) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (b9Var = actionMenuView.K) != null && b9Var.f()) {
                g(aqVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && aqVar.m && (zpVar = aqVar.e) != null) {
            windowManager.removeView(zpVar);
            if (z) {
                f(aqVar.a, aqVar, null);
            }
        }
        aqVar.k = false;
        aqVar.l = false;
        aqVar.m = false;
        aqVar.f = null;
        aqVar.n = true;
        if (this.W == aqVar) {
            this.W = null;
        }
        if (aqVar.a == 0) {
            w();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cf, code lost:
    
        if (r6.e() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f3, code lost:
    
        if (r6.l() != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        ActionMenuView actionMenuView;
        b9 b9Var;
        dq dqVar = this.d;
        if ((!(dqVar instanceof kx5) && !wi8.A(dqVar)) || (decorView = this.f.getDecorView()) == null || !kfc.d(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                wp wpVar = this.h;
                Window.Callback callback = this.f.getCallback();
                wpVar.getClass();
                try {
                    wpVar.c = true;
                } finally {
                    wpVar.c = false;
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
                        aq o = o(0);
                        if (!o.m) {
                            u(o, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.y == null) {
                        aq o2 = o(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
                        Context context = this.e;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.e();
                            Toolbar toolbar = ((jvb) actionBarOverlayLayout.e).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.J && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
                                actionBarOverlayLayout2.e();
                                ActionMenuView actionMenuView2 = ((jvb) actionBarOverlayLayout2.e).a.a;
                                if (actionMenuView2 == null || (b9Var = actionMenuView2.K) == null || !b9Var.f()) {
                                    if (!this.a0 && u(o2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = this.s;
                                        actionBarOverlayLayout3.e();
                                        ActionMenuView actionMenuView3 = ((jvb) actionBarOverlayLayout3.e).a.a;
                                        if (actionMenuView3 != null) {
                                            b9 b9Var2 = actionMenuView3.K;
                                            if (b9Var2 != null) {
                                            }
                                        }
                                    }
                                    z = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.s;
                                    actionBarOverlayLayout4.e();
                                    ActionMenuView actionMenuView4 = ((jvb) actionBarOverlayLayout4.e).a.a;
                                    if (actionMenuView4 != null) {
                                        b9 b9Var3 = actionMenuView4.K;
                                        if (b9Var3 != null) {
                                        }
                                    }
                                    z = false;
                                }
                                if (z) {
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
                        boolean z3 = o2.m;
                        if (z3 || o2.l) {
                            h(o2, true);
                            z = z3;
                            if (z) {
                            }
                        } else {
                            if (o2.k) {
                                if (o2.o) {
                                    o2.k = false;
                                    z2 = u(o2, keyEvent);
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    s(o2, keyEvent);
                                    z = true;
                                    if (z) {
                                    }
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!r()) {
                return false;
            }
        }
        return true;
    }

    public final void j(int i) {
        aq o = o(i);
        if (o.h != null) {
            Bundle bundle = new Bundle();
            o.h.t(bundle);
            if (bundle.size() > 0) {
                o.p = bundle;
            }
            o.h.w();
            o.h.clear();
        }
        o.o = true;
        o.n = true;
        if ((i == 108 || i == 0) && this.s != null) {
            aq o2 = o(0);
            o2.k = false;
            u(o2, null);
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        if (this.J) {
            return;
        }
        Context context = this.e;
        int[] iArr = k09.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(nm7.B1)) {
            obtainStyledAttributes.recycle();
            dq9.m("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (obtainStyledAttributes.getBoolean(nm7.J1, false)) {
            c(1);
        } else if (obtainStyledAttributes.getBoolean(nm7.B1, false)) {
            c(nm7.s1);
        }
        if (obtainStyledAttributes.getBoolean(nm7.C1, false)) {
            c(nm7.t1);
        }
        if (obtainStyledAttributes.getBoolean(nm7.D1, false)) {
            c(10);
        }
        this.S = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        l();
        this.f.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        byte b = 5;
        if (this.T) {
            viewGroup = this.R ? (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.S) {
            viewGroup = (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.Q = false;
            this.P = false;
        } else if (this.P) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ox2(context, typedValue.resourceId) : context).inflate(org.telegram.messenger.beta.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
            this.s = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.f.getCallback());
            if (this.Q) {
                this.s.d(nm7.t1);
            }
            if (this.N) {
                this.s.d(2);
            }
            if (this.O) {
                this.s.d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.P + ", windowActionBarOverlay: " + this.Q + ", android:windowIsFloating: " + this.S + ", windowActionModeOverlay: " + this.R + ", windowNoTitle: " + this.T + " }");
        }
        ni6 ni6Var = new ni6(this, (byte) 4);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(viewGroup, ni6Var);
        if (this.s == null) {
            this.L = (TextView) viewGroup.findViewById(org.telegram.messenger.beta.R.id.title);
        }
        Method method = ghc.a;
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
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
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
        contentFrameLayout.setAttachListener(new k6d(this, b));
        this.K = viewGroup;
        CharSequence charSequence = this.r;
        if (!TextUtils.isEmpty(charSequence)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(charSequence);
            } else {
                azc azcVar = this.n;
                if (azcVar != null) {
                    jvb jvbVar = (jvb) azcVar.e;
                    if (!jvbVar.g) {
                        Toolbar toolbar = jvbVar.a;
                        jvbVar.h = charSequence;
                        if ((jvbVar.b & 8) != 0) {
                            toolbar.setTitle(charSequence);
                            if (jvbVar.g) {
                                kfc.l(toolbar.getRootView(), charSequence);
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
        WeakHashMap weakHashMap2 = kfc.a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(nm7.H1, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(nm7.I1, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(nm7.F1)) {
            obtainStyledAttributes2.getValue(nm7.F1, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(nm7.G1)) {
            obtainStyledAttributes2.getValue(nm7.G1, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(nm7.E1)) {
            obtainStyledAttributes2.getValue(nm7.E1, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.J = true;
        aq o = o(0);
        if (this.a0 || o.h != null) {
            return;
        }
        q(nm7.s1);
    }

    public final void l() {
        if (this.f != null) {
            return;
        }
        dq9.m("We have not been given a Window");
    }

    public final Context m() {
        Context context;
        azc p = p();
        if (p != null) {
            if (p.b == null) {
                TypedValue typedValue = new TypedValue();
                p.a.getTheme().resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarWidgetTheme, typedValue, true);
                int i = typedValue.resourceId;
                if (i != 0) {
                    p.b = new ContextThemeWrapper(p.a, i);
                } else {
                    p.b = p.a;
                }
            }
            context = p.b;
        } else {
            context = null;
        }
        return context == null ? this.e : context;
    }

    public final yp n(Context context) {
        xp xpVar = this.g0;
        if (xpVar == null) {
            wm9 wm9Var = wm9.e;
            if (wm9Var == null) {
                Context applicationContext = context.getApplicationContext();
                wm9Var = new wm9(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                wm9.e = wm9Var;
            }
            xpVar = new xp(this, wm9Var);
            this.g0 = xpVar;
        }
        return xpVar;
    }

    public final aq o(int i) {
        aq[] aqVarArr = this.V;
        if (aqVarArr == null || aqVarArr.length <= i) {
            aq[] aqVarArr2 = new aq[i + 1];
            if (aqVarArr != null) {
                System.arraycopy(aqVarArr, 0, aqVarArr2, 0, aqVarArr.length);
            }
            this.V = aqVarArr2;
            aqVarArr = aqVarArr2;
        }
        aq aqVar = aqVarArr[i];
        if (aqVar != null) {
            return aqVar;
        }
        aq aqVar2 = new aq();
        aqVar2.a = i;
        aqVar2.n = false;
        aqVarArr[i] = aqVar2;
        return aqVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00fd, code lost:
    
        if (r10.equals("ImageButton") == false) goto L66;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View pqVar;
        cs csVar = this.o0;
        View view2 = null;
        if (csVar == null) {
            int[] iArr = k09.j;
            Context context2 = this.e;
            String string = context2.obtainStyledAttributes(iArr).getString(nm7.A1);
            if (string == null) {
                csVar = new cs();
                this.o0 = csVar;
            } else {
                try {
                    cs csVar2 = (cs) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.o0 = csVar2;
                    csVar = csVar2;
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    csVar = new cs();
                    this.o0 = csVar;
                }
            }
        }
        int i = tbc.a;
        csVar.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k09.y, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Context ox2Var = (resourceId == 0 || ((context instanceof ox2) && ((ox2) context).a == resourceId)) ? context : new ox2(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                pqVar = new pq(ox2Var, attributeSet);
                break;
            case 1:
                pqVar = new np(ox2Var, attributeSet);
                break;
            case 2:
                pqVar = new mq(ox2Var, attributeSet);
                break;
            case 3:
                pqVar = new sr(ox2Var, attributeSet);
                break;
            case 4:
                pqVar = new jq(ox2Var, attributeSet, org.telegram.messenger.beta.R.attr.imageButtonStyle);
                break;
            case 5:
                pqVar = new rq(ox2Var, attributeSet);
                break;
            case 6:
                pqVar = new fr(ox2Var, attributeSet);
                break;
            case 7:
                pqVar = new oq(ox2Var, attributeSet);
                break;
            case '\b':
                pqVar = new as(ox2Var, attributeSet);
                break;
            case '\t':
                pqVar = new lq(ox2Var, attributeSet, 0);
                break;
            case '\n':
                pqVar = new jp(ox2Var, attributeSet);
                break;
            case 11:
                pqVar = new mp(ox2Var, attributeSet);
                break;
            case '\f':
                pqVar = new hq(ox2Var, attributeSet);
                break;
            case '\r':
                pqVar = new lp(ox2Var, attributeSet);
                break;
            default:
                pqVar = null;
                break;
        }
        if (pqVar == null && context != ox2Var) {
            Object[] objArr = csVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = ox2Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = cs.g;
                        if (i2 < 3) {
                            View a = csVar.a(ox2Var, str, strArr[i2]);
                            if (a != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = a;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    View a2 = csVar.a(ox2Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = a2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            pqVar = view2;
        }
        if (pqVar != null) {
            Context context3 = pqVar.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = kfc.a;
                if (pqVar.hasOnClickListeners()) {
                    TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, cs.c);
                    String string2 = obtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        pqVar.setOnClickListener(new bs(pqVar, string2));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes3 = ox2Var.obtainStyledAttributes(attributeSet, cs.d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    boolean z = obtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = kfc.a;
                    new yec(org.telegram.messenger.beta.R.id.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 2).a(pqVar, Boolean.valueOf(z));
                }
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = ox2Var.obtainStyledAttributes(attributeSet, cs.e);
                if (obtainStyledAttributes4.hasValue(0)) {
                    kfc.l(pqVar, obtainStyledAttributes4.getString(0));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = ox2Var.obtainStyledAttributes(attributeSet, cs.f);
                if (obtainStyledAttributes5.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap3 = kfc.a;
                    new yec(org.telegram.messenger.beta.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, (byte) 0).a(pqVar, Boolean.valueOf(z2));
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return pqVar;
    }

    public final azc p() {
        azc azcVar;
        k();
        if (this.P && (azcVar = this.n) == null) {
            dq dqVar = this.d;
            if (wi8.A(dqVar)) {
                azcVar = new azc(dqVar);
                this.n = azcVar;
            }
            if (azcVar != null) {
                azcVar.c(this.l0);
            }
        }
        return this.n;
    }

    public final void q(int i) {
        this.j0 |= 1 << i;
        if (this.i0) {
            return;
        }
        View decorView = this.f.getDecorView();
        WeakHashMap weakHashMap = kfc.a;
        decorView.postOnAnimation(this.k0);
        this.i0 = true;
    }

    public final boolean r() {
        sa3 sa3Var;
        evb evbVar;
        boolean z = this.X;
        this.X = false;
        aq o = o(0);
        if (!o.m) {
            f9 f9Var = this.y;
            if (f9Var != null) {
                f9Var.b();
                return true;
            }
            azc p = p();
            if (p == null || (sa3Var = p.e) == null || (evbVar = ((jvb) sa3Var).a.f0) == null || evbVar.b == null) {
                return false;
            }
            evb evbVar2 = ((jvb) sa3Var).a.f0;
            c27 c27Var = evbVar2 == null ? null : evbVar2.b;
            if (c27Var != null) {
                c27Var.collapseActionView();
            }
        } else if (!z) {
            h(o, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x014d, code lost:
    
        if (r5.getCount() > 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0132, code lost:
    
        if (r15 != null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(aq aqVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = aqVar.m;
        int i2 = aqVar.a;
        if (z || this.a0) {
            return;
        }
        Context context = this.e;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, aqVar.h)) {
            h(aqVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !u(aqVar, keyEvent)) {
            return;
        }
        zp zpVar = aqVar.e;
        if (zpVar != null) {
            boolean z2 = aqVar.n;
            if (!z2) {
                View view = aqVar.g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                    aqVar.l = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams2.gravity = aqVar.c;
                    layoutParams2.windowAnimations = aqVar.d;
                    windowManager.addView(aqVar.e, layoutParams2);
                    aqVar.m = true;
                    if (i2 == 0) {
                        w();
                        return;
                    }
                    return;
                }
                i = -2;
                aqVar.l = false;
                WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams22.gravity = aqVar.c;
                layoutParams22.windowAnimations = aqVar.d;
                windowManager.addView(aqVar.e, layoutParams22);
                aqVar.m = true;
                if (i2 == 0) {
                }
            } else if (z2 && zpVar.getChildCount() > 0) {
                aqVar.e.removeAllViews();
            }
        } else {
            Context m = m();
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = m.getResources().newTheme();
            newTheme.setTo(m.getTheme());
            newTheme.resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarPopupTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                newTheme.applyStyle(i3, true);
            }
            newTheme.resolveAttribute(org.telegram.messenger.beta.R.attr.panelMenuListTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                newTheme.applyStyle(i4, true);
            } else {
                newTheme.applyStyle(org.telegram.messenger.beta.R.style.Theme_AppCompat_CompactMenu, true);
            }
            ox2 ox2Var = new ox2(m, 0);
            ox2Var.getTheme().setTo(newTheme);
            aqVar.j = ox2Var;
            TypedArray obtainStyledAttributes = ox2Var.obtainStyledAttributes(k09.j);
            aqVar.b = obtainStyledAttributes.getResourceId(86, 0);
            aqVar.d = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
            aqVar.e = new zp(this, aqVar.j);
            aqVar.c = (byte) 81;
        }
        View view2 = aqVar.g;
        if (view2 == null) {
            if (aqVar.h != null) {
                sz4 sz4Var = this.x;
                if (sz4Var == null) {
                    sz4Var = new sz4(this);
                    this.x = sz4Var;
                }
                if (aqVar.i == null) {
                    i76 i76Var = new i76(aqVar.j);
                    aqVar.i = i76Var;
                    i76Var.e = sz4Var;
                    y17 y17Var = aqVar.h;
                    y17Var.b(i76Var, y17Var.a);
                }
                i76 i76Var2 = aqVar.i;
                zp zpVar2 = aqVar.e;
                if (i76Var2.d == null) {
                    i76Var2.d = (ExpandedMenuView) i76Var2.b.inflate(org.telegram.messenger.beta.R.layout.abc_expanded_menu_layout, (ViewGroup) zpVar2, false);
                    h76 h76Var = i76Var2.f;
                    if (h76Var == null) {
                        h76Var = new h76(i76Var2);
                        i76Var2.f = h76Var;
                    }
                    i76Var2.d.setAdapter((ListAdapter) h76Var);
                    i76Var2.d.setOnItemClickListener(i76Var2);
                }
                ExpandedMenuView expandedMenuView = i76Var2.d;
                aqVar.f = expandedMenuView;
            }
            aqVar.n = true;
        }
        aqVar.f = view2;
        if (aqVar.f != null) {
            if (aqVar.g == null) {
                i76 i76Var3 = aqVar.i;
                h76 h76Var2 = i76Var3.f;
                if (h76Var2 == null) {
                    h76Var2 = new h76(i76Var3);
                    i76Var3.f = h76Var2;
                }
            }
            ViewGroup.LayoutParams layoutParams3 = aqVar.f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            aqVar.e.setBackgroundResource(aqVar.b);
            ViewParent parent = aqVar.f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(aqVar.f);
            }
            aqVar.e.addView(aqVar.f, layoutParams3);
            if (!aqVar.f.hasFocus()) {
                aqVar.f.requestFocus();
            }
            i = -2;
            aqVar.l = false;
            WindowManager.LayoutParams layoutParams222 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams222.gravity = aqVar.c;
            layoutParams222.windowAnimations = aqVar.d;
            windowManager.addView(aqVar.e, layoutParams222);
            aqVar.m = true;
            if (i2 == 0) {
            }
        }
        aqVar.n = true;
    }

    public final boolean t(aq aqVar, int i, KeyEvent keyEvent) {
        y17 y17Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((aqVar.k || u(aqVar, keyEvent)) && (y17Var = aqVar.h) != null) {
            return y17Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r13.o != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c7, code lost:
    
        if (r6 != null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(aq aqVar, KeyEvent keyEvent) {
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.a0) {
            boolean z = aqVar.k;
            int i = aqVar.a;
            if (z) {
                return true;
            }
            aq aqVar2 = this.W;
            if (aqVar2 != null && aqVar2 != aqVar) {
                h(aqVar2, false);
            }
            Window.Callback callback = this.f.getCallback();
            if (callback != null) {
                aqVar.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.s) != null) {
                actionBarOverlayLayout4.e();
                ((jvb) actionBarOverlayLayout4.e).l = true;
            }
            if (aqVar.g == null) {
                y17 y17Var = aqVar.h;
                if (y17Var == null) {
                    Context context = this.e;
                    if ((i == 0 || i == 108) && this.s != null) {
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
                            ox2 ox2Var = new ox2(context, 0);
                            ox2Var.getTheme().setTo(theme);
                            context = ox2Var;
                        }
                    }
                    y17 y17Var2 = new y17(context);
                    y17Var2.e = this;
                    y17 y17Var3 = aqVar.h;
                    if (y17Var2 != y17Var3) {
                        if (y17Var3 != null) {
                            y17Var3.r(aqVar.i);
                        }
                        aqVar.h = y17Var2;
                        i76 i76Var = aqVar.i;
                        if (i76Var != null) {
                            y17Var2.b(i76Var, y17Var2.a);
                        }
                    }
                    y17Var = aqVar.h;
                }
                if (z2 && (actionBarOverlayLayout2 = this.s) != null) {
                    nl9 nl9Var = this.w;
                    if (nl9Var == null) {
                        nl9Var = new nl9((Object) this, (byte) 5);
                        this.w = nl9Var;
                    }
                    actionBarOverlayLayout2.f(y17Var, nl9Var);
                }
                aqVar.h.w();
                if (callback.onCreatePanelMenu(i, aqVar.h)) {
                    aqVar.o = false;
                    aqVar.h.w();
                    Bundle bundle = aqVar.p;
                    if (bundle != null) {
                        aqVar.h.s(bundle);
                        aqVar.p = null;
                    }
                    if (!callback.onPreparePanel(0, aqVar.g, aqVar.h)) {
                        if (z2 && (actionBarOverlayLayout3 = this.s) != null) {
                            actionBarOverlayLayout3.f(null, this.w);
                        }
                        aqVar.h.v();
                        return false;
                    }
                    aqVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                    aqVar.h.v();
                } else {
                    y17 y17Var4 = aqVar.h;
                    if (y17Var4 != null) {
                        if (y17Var4 != null) {
                            y17Var4.r(aqVar.i);
                        }
                        aqVar.h = null;
                    }
                    if (z2 && (actionBarOverlayLayout = this.s) != null) {
                        actionBarOverlayLayout.f(null, this.w);
                    }
                }
            }
            aqVar.k = true;
            aqVar.l = false;
            this.W = aqVar;
            return true;
        }
        return false;
    }

    public final void v() {
        if (this.J) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void w() {
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.p0 != null && (o(0).m || this.y != null)) {
                z = true;
            }
            OnBackInvokedCallback onBackInvokedCallback = this.q0;
            if (z) {
                if (onBackInvokedCallback == null) {
                    this.q0 = vp.b(this.p0, this);
                }
            } else if (onBackInvokedCallback != null) {
                vp.c(this.p0, onBackInvokedCallback);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
