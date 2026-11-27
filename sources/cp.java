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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class cp extends qo implements d27, LayoutInflater.Factory2 {
    public static final vla r0 = new vla(0);
    public static final int[] s0 = {R.attr.windowBackground};
    public static final boolean t0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView E;
    public PopupWindow F;
    public ro G;
    public zic H;
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
    public bp[] V;
    public bp W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public Configuration b0;
    public final int c0;
    public final ep d;
    public int d0;
    public final Context e;
    public int e0;
    public Window f;
    public boolean f0;
    public yo g0;
    public xo h;
    public yo h0;
    public boolean i0;
    public int j0;
    public final ro k0;
    public boolean l0;
    public Rect m0;
    public p1d n;
    public Rect n0;
    public dr o0;
    public OnBackInvokedDispatcher p0;
    public OnBackInvokedCallback q0;
    public CharSequence r;
    public ActionBarOverlayLayout s;
    public zm9 w;
    public wz4 x;
    public g9 y;

    public cp(ep epVar, ep epVar2) {
        Context context = epVar.getContext();
        Window window = epVar.getWindow();
        this.H = null;
        this.I = true;
        this.c0 = -100;
        this.k0 = new ro(this, (byte) 0);
        this.e = context;
        this.d = epVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.c0 == -100) {
            String name = this.d.getClass().getName();
            vla vlaVar = r0;
            Integer num = (Integer) vlaVar.get(name);
            if (num != null) {
                this.c0 = num.intValue();
                vlaVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        gp.c();
    }

    @Override // d27
    public final boolean B(f27 f27Var, MenuItem menuItem) {
        bp bpVar;
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.a0) {
            f27 k = f27Var.k();
            bp[] bpVarArr = this.V;
            int length = bpVarArr != null ? bpVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    bpVar = bpVarArr[i];
                    if (bpVar != null && bpVar.h == k) {
                        break;
                    }
                    i++;
                } else {
                    bpVar = null;
                    break;
                }
            }
            if (bpVar != null) {
                return callback.onMenuItemSelected(bpVar.a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.g() != false) goto L20;
     */
    @Override // d27
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q1(f27 f27Var) {
        ActionMenuView actionMenuView;
        c9 c9Var;
        c9 c9Var2;
        c9 c9Var3;
        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.e();
            Toolbar toolbar = ((jxb) actionBarOverlayLayout.e).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.J) {
                if (ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
                    actionBarOverlayLayout2.e();
                    ActionMenuView actionMenuView2 = ((jxb) actionBarOverlayLayout2.e).a.a;
                    if (actionMenuView2 != null) {
                        c9 c9Var4 = actionMenuView2.K;
                        if (c9Var4 != null) {
                            if (c9Var4.L == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.s;
                actionBarOverlayLayout3.e();
                ActionMenuView actionMenuView3 = ((jxb) actionBarOverlayLayout3.e).a.a;
                if (actionMenuView3 != null && (c9Var2 = actionMenuView3.K) != null && c9Var2.g()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.s;
                    actionBarOverlayLayout4.e();
                    ActionMenuView actionMenuView4 = ((jxb) actionBarOverlayLayout4.e).a.a;
                    if (actionMenuView4 != null && (c9Var3 = actionMenuView4.K) != null) {
                        c9Var3.d();
                    }
                    if (this.a0) {
                        return;
                    }
                    callback.onPanelClosed(jn7.s1, o(0).h);
                    return;
                }
                if (callback == null || this.a0) {
                    return;
                }
                if (this.i0 && (this.j0 & 1) != 0) {
                    View decorView = this.f.getDecorView();
                    ro roVar = this.k0;
                    decorView.removeCallbacks(roVar);
                    roVar.run();
                }
                bp o = o(0);
                f27 f27Var2 = o.h;
                if (f27Var2 == null || o.o || !callback.onPreparePanel(0, o.g, f27Var2)) {
                    return;
                }
                callback.onMenuOpened(jn7.s1, o.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.s;
                actionBarOverlayLayout5.e();
                ActionMenuView actionMenuView5 = ((jxb) actionBarOverlayLayout5.e).a.a;
                if (actionMenuView5 == null || (c9Var = actionMenuView5.K) == null) {
                    return;
                }
                c9Var.l();
                return;
            }
        }
        bp o2 = o(0);
        o2.n = true;
        h(o2, false);
        s(o2, null);
    }

    @Override // qo
    public final void a() {
        this.Y = true;
        d(false);
        l();
        this.b0 = new Configuration(this.e.getResources().getConfiguration());
        this.Z = true;
    }

    @Override // qo
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
            i = qo.a;
        }
        Context context = this.e;
        int i2 = -1;
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            grb.i("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return false;
                        }
                        yo yoVar = this.h0;
                        if (yoVar == null) {
                            yoVar = new yo(this, context);
                            this.h0 = yoVar;
                        }
                        i2 = yoVar.e();
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
            uo.b(configuration2);
        } else {
            qb6.b(to.a(configuration2.locale));
        }
        if ((i4 != i5 ? (char) 512 : (char) 0) != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i5 | (resources.getConfiguration().uiMode & (-49));
            Object obj2 = null;
            resources.updateConfiguration(configuration3, null);
            if (i6 < 26 && i6 < 28) {
                if (i6 >= 24) {
                    if (!fxe.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            fxe.g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                        }
                        fxe.h = true;
                    }
                    Field field = fxe.g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e2) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!fxe.b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    fxe.a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e3) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                                }
                                fxe.b = true;
                            }
                            Field field2 = fxe.a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e4) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                                }
                            }
                            if (obj2 != null) {
                                fxe.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!fxe.b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            fxe.a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e5) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e5);
                        }
                        fxe.b = true;
                    }
                    Field field3 = fxe.a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e6) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e6);
                        }
                    }
                    if (obj2 != null) {
                        fxe.a(obj2);
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
            yo yoVar2 = this.g0;
            if (yoVar2 != null) {
                yoVar2.c();
            }
        }
        yo yoVar3 = this.h0;
        if (i == 3) {
            if (yoVar3 == null) {
                yoVar3 = new yo(this, context);
                this.h0 = yoVar3;
            }
            yoVar3.l();
        } else if (yoVar3 != null) {
            yoVar3.c();
        }
        return z2;
    }

    public final void e(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f != null) {
            grb.i("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof xo) {
            grb.i("AppCompat has already installed itself into the Window");
            return;
        }
        xo xoVar = new xo(this, callback);
        this.h = xoVar;
        window.setCallback(xoVar);
        Context context = this.e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, s0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            gp a = gp.a();
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
            wo.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.q0 = null;
        }
        this.p0 = null;
        w();
    }

    public final void f(int i, bp bpVar, f27 f27Var) {
        if (f27Var == null) {
            if (bpVar == null && i >= 0) {
                bp[] bpVarArr = this.V;
                if (i < bpVarArr.length) {
                    bpVar = bpVarArr[i];
                }
            }
            if (bpVar != null) {
                f27Var = bpVar.h;
            }
        }
        if ((bpVar == null || bpVar.m) && !this.a0) {
            xo xoVar = this.h;
            Window.Callback callback = this.f.getCallback();
            xoVar.getClass();
            try {
                xoVar.d = true;
                callback.onPanelClosed(i, f27Var);
            } finally {
                xoVar.d = false;
            }
        }
    }

    public final void g(f27 f27Var) {
        c9 c9Var;
        if (this.U) {
            return;
        }
        this.U = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((jxb) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (c9Var = actionMenuView.K) != null) {
            c9Var.d();
            z8 z8Var = c9Var.K;
            if (z8Var != null && z8Var.b()) {
                z8Var.i.dismiss();
            }
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.a0) {
            callback.onPanelClosed(jn7.s1, f27Var);
        }
        this.U = false;
    }

    public final void h(bp bpVar, boolean z) {
        ap apVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        c9 c9Var;
        if (z && bpVar.a == 0 && (actionBarOverlayLayout = this.s) != null) {
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((jxb) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (c9Var = actionMenuView.K) != null && c9Var.g()) {
                g(bpVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && bpVar.m && (apVar = bpVar.e) != null) {
            windowManager.removeView(apVar);
            if (z) {
                f(bpVar.a, bpVar, null);
            }
        }
        bpVar.k = false;
        bpVar.l = false;
        bpVar.m = false;
        bpVar.f = null;
        bpVar.n = true;
        if (this.W == bpVar) {
            this.W = null;
        }
        if (bpVar.a == 0) {
            w();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cf, code lost:
    
        if (r6.d() != false) goto L85;
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
        c9 c9Var;
        ep epVar = this.d;
        if ((!(epVar instanceof px5) && !ik8.A(epVar)) || (decorView = this.f.getDecorView()) == null || !ihc.d(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                xo xoVar = this.h;
                Window.Callback callback = this.f.getCallback();
                xoVar.getClass();
                try {
                    xoVar.c = true;
                } finally {
                    xoVar.c = false;
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
                        bp o = o(0);
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
                        bp o2 = o(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
                        Context context = this.e;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.e();
                            Toolbar toolbar = ((jxb) actionBarOverlayLayout.e).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.J && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
                                actionBarOverlayLayout2.e();
                                ActionMenuView actionMenuView2 = ((jxb) actionBarOverlayLayout2.e).a.a;
                                if (actionMenuView2 == null || (c9Var = actionMenuView2.K) == null || !c9Var.g()) {
                                    if (!this.a0 && u(o2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = this.s;
                                        actionBarOverlayLayout3.e();
                                        ActionMenuView actionMenuView3 = ((jxb) actionBarOverlayLayout3.e).a.a;
                                        if (actionMenuView3 != null) {
                                            c9 c9Var2 = actionMenuView3.K;
                                            if (c9Var2 != null) {
                                            }
                                        }
                                    }
                                    z = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.s;
                                    actionBarOverlayLayout4.e();
                                    ActionMenuView actionMenuView4 = ((jxb) actionBarOverlayLayout4.e).a.a;
                                    if (actionMenuView4 != null) {
                                        c9 c9Var3 = actionMenuView4.K;
                                        if (c9Var3 != null) {
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
        bp o = o(i);
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
            bp o2 = o(0);
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
        int[] iArr = w19.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(jn7.B1)) {
            obtainStyledAttributes.recycle();
            grb.i("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (obtainStyledAttributes.getBoolean(jn7.J1, false)) {
            c(1);
        } else if (obtainStyledAttributes.getBoolean(jn7.B1, false)) {
            c(jn7.s1);
        }
        if (obtainStyledAttributes.getBoolean(jn7.C1, false)) {
            c(jn7.t1);
        }
        if (obtainStyledAttributes.getBoolean(jn7.D1, false)) {
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
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new yw2(context, typedValue.resourceId) : context).inflate(org.telegram.messenger.beta.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
            this.s = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.f.getCallback());
            if (this.Q) {
                this.s.d(jn7.t1);
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
        ri6 ri6Var = new ri6(this, (byte) 4);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(viewGroup, ri6Var);
        if (this.s == null) {
            this.L = (TextView) viewGroup.findViewById(org.telegram.messenger.beta.R.id.title);
        }
        Method method = fjc.a;
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
        contentFrameLayout.setAttachListener(new z8d(this, b));
        this.K = viewGroup;
        CharSequence charSequence = this.r;
        if (!TextUtils.isEmpty(charSequence)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(charSequence);
            } else {
                p1d p1dVar = this.n;
                if (p1dVar != null) {
                    jxb jxbVar = (jxb) p1dVar.e;
                    if (!jxbVar.g) {
                        Toolbar toolbar = jxbVar.a;
                        jxbVar.h = charSequence;
                        if ((jxbVar.b & 8) != 0) {
                            toolbar.setTitle(charSequence);
                            if (jxbVar.g) {
                                ihc.m(toolbar.getRootView(), charSequence);
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
        WeakHashMap weakHashMap2 = ihc.a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(jn7.H1, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(jn7.I1, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(jn7.F1)) {
            obtainStyledAttributes2.getValue(jn7.F1, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(jn7.G1)) {
            obtainStyledAttributes2.getValue(jn7.G1, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(jn7.E1)) {
            obtainStyledAttributes2.getValue(jn7.E1, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.J = true;
        bp o = o(0);
        if (this.a0 || o.h != null) {
            return;
        }
        q(jn7.s1);
    }

    public final void l() {
        if (this.f != null) {
            return;
        }
        grb.i("We have not been given a Window");
    }

    public final Context m() {
        Context context;
        p1d p = p();
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

    public final zo n(Context context) {
        yo yoVar = this.g0;
        if (yoVar == null) {
            ko9 ko9Var = ko9.e;
            if (ko9Var == null) {
                Context applicationContext = context.getApplicationContext();
                ko9Var = new ko9(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                ko9.e = ko9Var;
            }
            yoVar = new yo(this, ko9Var);
            this.g0 = yoVar;
        }
        return yoVar;
    }

    public final bp o(int i) {
        bp[] bpVarArr = this.V;
        if (bpVarArr == null || bpVarArr.length <= i) {
            bp[] bpVarArr2 = new bp[i + 1];
            if (bpVarArr != null) {
                System.arraycopy(bpVarArr, 0, bpVarArr2, 0, bpVarArr.length);
            }
            this.V = bpVarArr2;
            bpVarArr = bpVarArr2;
        }
        bp bpVar = bpVarArr[i];
        if (bpVar != null) {
            return bpVar;
        }
        bp bpVar2 = new bp();
        bpVar2.a = i;
        bpVar2.n = false;
        bpVarArr[i] = bpVar2;
        return bpVar2;
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
        View qpVar;
        dr drVar = this.o0;
        View view2 = null;
        if (drVar == null) {
            int[] iArr = w19.j;
            Context context2 = this.e;
            String string = context2.obtainStyledAttributes(iArr).getString(jn7.A1);
            if (string == null) {
                drVar = new dr();
                this.o0 = drVar;
            } else {
                try {
                    dr drVar2 = (dr) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.o0 = drVar2;
                    drVar = drVar2;
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    drVar = new dr();
                    this.o0 = drVar;
                }
            }
        }
        int i = sdc.a;
        drVar.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w19.y, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Context yw2Var = (resourceId == 0 || ((context instanceof yw2) && ((yw2) context).a == resourceId)) ? context : new yw2(context, resourceId);
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
                qpVar = new qp(yw2Var, attributeSet);
                break;
            case 1:
                qpVar = new oo(yw2Var, attributeSet);
                break;
            case 2:
                qpVar = new np(yw2Var, attributeSet);
                break;
            case 3:
                qpVar = new tq(yw2Var, attributeSet);
                break;
            case 4:
                qpVar = new kp(yw2Var, attributeSet, org.telegram.messenger.beta.R.attr.imageButtonStyle);
                break;
            case 5:
                qpVar = new sp(yw2Var, attributeSet);
                break;
            case 6:
                qpVar = new gq(yw2Var, attributeSet);
                break;
            case 7:
                qpVar = new pp(yw2Var, attributeSet);
                break;
            case '\b':
                qpVar = new br(yw2Var, attributeSet);
                break;
            case '\t':
                qpVar = new mp(yw2Var, attributeSet, 0);
                break;
            case '\n':
                qpVar = new ko(yw2Var, attributeSet);
                break;
            case 11:
                qpVar = new no(yw2Var, attributeSet);
                break;
            case '\f':
                qpVar = new ip(yw2Var, attributeSet);
                break;
            case '\r':
                qpVar = new mo(yw2Var, attributeSet);
                break;
            default:
                qpVar = null;
                break;
        }
        if (qpVar == null && context != yw2Var) {
            Object[] objArr = drVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = yw2Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = dr.g;
                        if (i2 < 3) {
                            View a = drVar.a(yw2Var, str, strArr[i2]);
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
                    View a2 = drVar.a(yw2Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = a2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            qpVar = view2;
        }
        if (qpVar != null) {
            Context context3 = qpVar.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = ihc.a;
                if (qpVar.hasOnClickListeners()) {
                    TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, dr.c);
                    String string2 = obtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        qpVar.setOnClickListener(new cr(qpVar, string2));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes3 = yw2Var.obtainStyledAttributes(attributeSet, dr.d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    boolean z = obtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = ihc.a;
                    new wgc(org.telegram.messenger.beta.R.id.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 2).a(qpVar, Boolean.valueOf(z));
                }
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = yw2Var.obtainStyledAttributes(attributeSet, dr.e);
                if (obtainStyledAttributes4.hasValue(0)) {
                    ihc.m(qpVar, obtainStyledAttributes4.getString(0));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = yw2Var.obtainStyledAttributes(attributeSet, dr.f);
                if (obtainStyledAttributes5.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap3 = ihc.a;
                    new wgc(org.telegram.messenger.beta.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, (byte) 0).a(qpVar, Boolean.valueOf(z2));
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return qpVar;
    }

    public final p1d p() {
        p1d p1dVar;
        k();
        if (this.P && (p1dVar = this.n) == null) {
            ep epVar = this.d;
            if (ik8.A(epVar)) {
                p1dVar = new p1d(epVar);
                this.n = p1dVar;
            }
            if (p1dVar != null) {
                p1dVar.c(this.l0);
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
        WeakHashMap weakHashMap = ihc.a;
        decorView.postOnAnimation(this.k0);
        this.i0 = true;
    }

    public final boolean r() {
        z93 z93Var;
        exb exbVar;
        boolean z = this.X;
        this.X = false;
        bp o = o(0);
        if (!o.m) {
            g9 g9Var = this.y;
            if (g9Var != null) {
                g9Var.b();
                return true;
            }
            p1d p = p();
            if (p == null || (z93Var = p.e) == null || (exbVar = ((jxb) z93Var).a.f0) == null || exbVar.b == null) {
                return false;
            }
            exb exbVar2 = ((jxb) z93Var).a.f0;
            j27 j27Var = exbVar2 == null ? null : exbVar2.b;
            if (j27Var != null) {
                j27Var.collapseActionView();
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
    public final void s(bp bpVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = bpVar.m;
        int i2 = bpVar.a;
        if (z || this.a0) {
            return;
        }
        Context context = this.e;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, bpVar.h)) {
            h(bpVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !u(bpVar, keyEvent)) {
            return;
        }
        ap apVar = bpVar.e;
        if (apVar != null) {
            boolean z2 = bpVar.n;
            if (!z2) {
                View view = bpVar.g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                    bpVar.l = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams2.gravity = bpVar.c;
                    layoutParams2.windowAnimations = bpVar.d;
                    windowManager.addView(bpVar.e, layoutParams2);
                    bpVar.m = true;
                    if (i2 == 0) {
                        w();
                        return;
                    }
                    return;
                }
                i = -2;
                bpVar.l = false;
                WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams22.gravity = bpVar.c;
                layoutParams22.windowAnimations = bpVar.d;
                windowManager.addView(bpVar.e, layoutParams22);
                bpVar.m = true;
                if (i2 == 0) {
                }
            } else if (z2 && apVar.getChildCount() > 0) {
                bpVar.e.removeAllViews();
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
            yw2 yw2Var = new yw2(m, 0);
            yw2Var.getTheme().setTo(newTheme);
            bpVar.j = yw2Var;
            TypedArray obtainStyledAttributes = yw2Var.obtainStyledAttributes(w19.j);
            bpVar.b = obtainStyledAttributes.getResourceId(86, 0);
            bpVar.d = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
            bpVar.e = new ap(this, bpVar.j);
            bpVar.c = (byte) 81;
        }
        View view2 = bpVar.g;
        if (view2 == null) {
            if (bpVar.h != null) {
                wz4 wz4Var = this.x;
                if (wz4Var == null) {
                    wz4Var = new wz4(this);
                    this.x = wz4Var;
                }
                if (bpVar.i == null) {
                    m76 m76Var = new m76(bpVar.j);
                    bpVar.i = m76Var;
                    m76Var.e = wz4Var;
                    f27 f27Var = bpVar.h;
                    f27Var.b(m76Var, f27Var.a);
                }
                m76 m76Var2 = bpVar.i;
                ap apVar2 = bpVar.e;
                if (m76Var2.d == null) {
                    m76Var2.d = (ExpandedMenuView) m76Var2.b.inflate(org.telegram.messenger.beta.R.layout.abc_expanded_menu_layout, (ViewGroup) apVar2, false);
                    l76 l76Var = m76Var2.f;
                    if (l76Var == null) {
                        l76Var = new l76(m76Var2);
                        m76Var2.f = l76Var;
                    }
                    m76Var2.d.setAdapter((ListAdapter) l76Var);
                    m76Var2.d.setOnItemClickListener(m76Var2);
                }
                ExpandedMenuView expandedMenuView = m76Var2.d;
                bpVar.f = expandedMenuView;
            }
            bpVar.n = true;
        }
        bpVar.f = view2;
        if (bpVar.f != null) {
            if (bpVar.g == null) {
                m76 m76Var3 = bpVar.i;
                l76 l76Var2 = m76Var3.f;
                if (l76Var2 == null) {
                    l76Var2 = new l76(m76Var3);
                    m76Var3.f = l76Var2;
                }
            }
            ViewGroup.LayoutParams layoutParams3 = bpVar.f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            bpVar.e.setBackgroundResource(bpVar.b);
            ViewParent parent = bpVar.f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(bpVar.f);
            }
            bpVar.e.addView(bpVar.f, layoutParams3);
            if (!bpVar.f.hasFocus()) {
                bpVar.f.requestFocus();
            }
            i = -2;
            bpVar.l = false;
            WindowManager.LayoutParams layoutParams222 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams222.gravity = bpVar.c;
            layoutParams222.windowAnimations = bpVar.d;
            windowManager.addView(bpVar.e, layoutParams222);
            bpVar.m = true;
            if (i2 == 0) {
            }
        }
        bpVar.n = true;
    }

    public final boolean t(bp bpVar, int i, KeyEvent keyEvent) {
        f27 f27Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((bpVar.k || u(bpVar, keyEvent)) && (f27Var = bpVar.h) != null) {
            return f27Var.performShortcut(i, keyEvent, 1);
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
    public final boolean u(bp bpVar, KeyEvent keyEvent) {
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.a0) {
            boolean z = bpVar.k;
            int i = bpVar.a;
            if (z) {
                return true;
            }
            bp bpVar2 = this.W;
            if (bpVar2 != null && bpVar2 != bpVar) {
                h(bpVar2, false);
            }
            Window.Callback callback = this.f.getCallback();
            if (callback != null) {
                bpVar.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.s) != null) {
                actionBarOverlayLayout4.e();
                ((jxb) actionBarOverlayLayout4.e).l = true;
            }
            if (bpVar.g == null) {
                f27 f27Var = bpVar.h;
                if (f27Var == null) {
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
                            yw2 yw2Var = new yw2(context, 0);
                            yw2Var.getTheme().setTo(theme);
                            context = yw2Var;
                        }
                    }
                    f27 f27Var2 = new f27(context);
                    f27Var2.e = this;
                    f27 f27Var3 = bpVar.h;
                    if (f27Var2 != f27Var3) {
                        if (f27Var3 != null) {
                            f27Var3.r(bpVar.i);
                        }
                        bpVar.h = f27Var2;
                        m76 m76Var = bpVar.i;
                        if (m76Var != null) {
                            f27Var2.b(m76Var, f27Var2.a);
                        }
                    }
                    f27Var = bpVar.h;
                }
                if (z2 && (actionBarOverlayLayout2 = this.s) != null) {
                    zm9 zm9Var = this.w;
                    if (zm9Var == null) {
                        zm9Var = new zm9((Object) this, (byte) 5);
                        this.w = zm9Var;
                    }
                    actionBarOverlayLayout2.f(f27Var, zm9Var);
                }
                bpVar.h.w();
                if (callback.onCreatePanelMenu(i, bpVar.h)) {
                    bpVar.o = false;
                    bpVar.h.w();
                    Bundle bundle = bpVar.p;
                    if (bundle != null) {
                        bpVar.h.s(bundle);
                        bpVar.p = null;
                    }
                    if (!callback.onPreparePanel(0, bpVar.g, bpVar.h)) {
                        if (z2 && (actionBarOverlayLayout3 = this.s) != null) {
                            actionBarOverlayLayout3.f(null, this.w);
                        }
                        bpVar.h.v();
                        return false;
                    }
                    bpVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                    bpVar.h.v();
                } else {
                    f27 f27Var4 = bpVar.h;
                    if (f27Var4 != null) {
                        if (f27Var4 != null) {
                            f27Var4.r(bpVar.i);
                        }
                        bpVar.h = null;
                    }
                    if (z2 && (actionBarOverlayLayout = this.s) != null) {
                        actionBarOverlayLayout.f(null, this.w);
                    }
                }
            }
            bpVar.k = true;
            bpVar.l = false;
            this.W = bpVar;
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
                    this.q0 = wo.b(this.p0, this);
                }
            } else if (onBackInvokedCallback != null) {
                wo.c(this.p0, onBackInvokedCallback);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
