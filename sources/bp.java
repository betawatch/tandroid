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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class bp extends po implements wz6, LayoutInflater.Factory2 {
    public static final aia r0 = new aia(0);
    public static final int[] s0 = {R.attr.windowBackground};
    public static final boolean t0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView E;
    public PopupWindow F;
    public qo G;
    public afc H;
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
    public ap[] V;
    public ap W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public Configuration b0;
    public final int c0;
    public final dp d;
    public int d0;
    public final Context e;
    public int e0;
    public Window f;
    public boolean f0;
    public xo g0;
    public wo h;
    public xo h0;
    public boolean i0;
    public int j0;
    public final qo k0;
    public boolean l0;
    public Rect m0;
    public zwc n;
    public Rect n0;
    public cr o0;
    public OnBackInvokedDispatcher p0;
    public OnBackInvokedCallback q0;
    public CharSequence r;
    public ActionBarOverlayLayout s;
    public lj9 w;
    public qx4 x;
    public f9 y;

    public bp(dp dpVar, dp dpVar2) {
        Context context = dpVar.getContext();
        Window window = dpVar.getWindow();
        this.H = null;
        this.I = true;
        this.c0 = -100;
        this.k0 = new qo(this, (byte) 0);
        this.e = context;
        this.d = dpVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.c0 == -100) {
            String name = this.d.getClass().getName();
            aia aiaVar = r0;
            Integer num = (Integer) aiaVar.get(name);
            if (num != null) {
                this.c0 = num.intValue();
                aiaVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        fp.c();
    }

    @Override // wz6
    public final boolean B(yz6 yz6Var, MenuItem menuItem) {
        ap apVar;
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.a0) {
            yz6 k = yz6Var.k();
            ap[] apVarArr = this.V;
            int length = apVarArr != null ? apVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    apVar = apVarArr[i];
                    if (apVar != null && apVar.h == k) {
                        break;
                    }
                    i++;
                } else {
                    apVar = null;
                    break;
                }
            }
            if (apVar != null) {
                return callback.onMenuItemSelected(apVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // po
    public final void a() {
        this.Y = true;
        d(false);
        l();
        this.b0 = new Configuration(this.e.getResources().getConfiguration());
        this.Z = true;
    }

    @Override // po
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
            i = po.a;
        }
        Context context = this.e;
        int i2 = -1;
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            sc8.j("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return false;
                        }
                        xo xoVar = this.h0;
                        if (xoVar == null) {
                            xoVar = new xo(this, context);
                            this.h0 = xoVar;
                        }
                        i2 = xoVar.e();
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
            to.b(configuration2);
        } else {
            m96.b(so.a(configuration2.locale));
        }
        if ((i4 != i5 ? (char) 512 : (char) 0) != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i5 | (resources.getConfiguration().uiMode & (-49));
            Object obj2 = null;
            resources.updateConfiguration(configuration3, null);
            if (i6 < 26 && i6 < 28) {
                if (i6 >= 24) {
                    if (!mse.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            mse.g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                        }
                        mse.h = true;
                    }
                    Field field = mse.g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e2) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!mse.b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    mse.a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e3) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                                }
                                mse.b = true;
                            }
                            Field field2 = mse.a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e4) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                                }
                            }
                            if (obj2 != null) {
                                mse.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!mse.b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            mse.a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e5) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e5);
                        }
                        mse.b = true;
                    }
                    Field field3 = mse.a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e6) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e6);
                        }
                    }
                    if (obj2 != null) {
                        mse.a(obj2);
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
            xo xoVar2 = this.g0;
            if (xoVar2 != null) {
                xoVar2.c();
            }
        }
        xo xoVar3 = this.h0;
        if (i == 3) {
            if (xoVar3 == null) {
                xoVar3 = new xo(this, context);
                this.h0 = xoVar3;
            }
            xoVar3.l();
        } else if (xoVar3 != null) {
            xoVar3.c();
        }
        return z2;
    }

    public final void e(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f != null) {
            sc8.j("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof wo) {
            sc8.j("AppCompat has already installed itself into the Window");
            return;
        }
        wo woVar = new wo(this, callback);
        this.h = woVar;
        window.setCallback(woVar);
        Context context = this.e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, s0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            fp a = fp.a();
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
            vo.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.q0 = null;
        }
        this.p0 = null;
        w();
    }

    public final void f(int i, ap apVar, yz6 yz6Var) {
        if (yz6Var == null) {
            if (apVar == null && i >= 0) {
                ap[] apVarArr = this.V;
                if (i < apVarArr.length) {
                    apVar = apVarArr[i];
                }
            }
            if (apVar != null) {
                yz6Var = apVar.h;
            }
        }
        if ((apVar == null || apVar.m) && !this.a0) {
            wo woVar = this.h;
            Window.Callback callback = this.f.getCallback();
            woVar.getClass();
            try {
                woVar.d = true;
                callback.onPanelClosed(i, yz6Var);
            } finally {
                woVar.d = false;
            }
        }
    }

    public final void g(yz6 yz6Var) {
        b9 b9Var;
        if (this.U) {
            return;
        }
        this.U = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((itb) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (b9Var = actionMenuView.K) != null) {
            b9Var.e();
            y8 y8Var = b9Var.K;
            if (y8Var != null && y8Var.b()) {
                y8Var.i.dismiss();
            }
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.a0) {
            callback.onPanelClosed(kk7.s1, yz6Var);
        }
        this.U = false;
    }

    public final void h(ap apVar, boolean z) {
        zo zoVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        b9 b9Var;
        if (z && apVar.a == 0 && (actionBarOverlayLayout = this.s) != null) {
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((itb) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (b9Var = actionMenuView.K) != null && b9Var.f()) {
                g(apVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && apVar.m && (zoVar = apVar.e) != null) {
            windowManager.removeView(zoVar);
            if (z) {
                f(apVar.a, apVar, null);
            }
        }
        apVar.k = false;
        apVar.l = false;
        apVar.m = false;
        apVar.f = null;
        apVar.n = true;
        if (this.W == apVar) {
            this.W = null;
        }
        if (apVar.a == 0) {
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
        dp dpVar = this.d;
        if ((!(dpVar instanceof kv5) && !ug8.A(dpVar)) || (decorView = this.f.getDecorView()) == null || !jdc.d(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                wo woVar = this.h;
                Window.Callback callback = this.f.getCallback();
                woVar.getClass();
                try {
                    woVar.c = true;
                } finally {
                    woVar.c = false;
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
                        ap o = o(0);
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
                        ap o2 = o(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
                        Context context = this.e;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.e();
                            Toolbar toolbar = ((itb) actionBarOverlayLayout.e).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.J && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
                                actionBarOverlayLayout2.e();
                                ActionMenuView actionMenuView2 = ((itb) actionBarOverlayLayout2.e).a.a;
                                if (actionMenuView2 == null || (b9Var = actionMenuView2.K) == null || !b9Var.f()) {
                                    if (!this.a0 && u(o2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = this.s;
                                        actionBarOverlayLayout3.e();
                                        ActionMenuView actionMenuView3 = ((itb) actionBarOverlayLayout3.e).a.a;
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
                                    ActionMenuView actionMenuView4 = ((itb) actionBarOverlayLayout4.e).a.a;
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
        ap o = o(i);
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
            ap o2 = o(0);
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
        int[] iArr = jy8.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(kk7.B1)) {
            obtainStyledAttributes.recycle();
            sc8.j("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (obtainStyledAttributes.getBoolean(kk7.J1, false)) {
            c(1);
        } else if (obtainStyledAttributes.getBoolean(kk7.B1, false)) {
            c(kk7.s1);
        }
        if (obtainStyledAttributes.getBoolean(kk7.C1, false)) {
            c(kk7.t1);
        }
        if (obtainStyledAttributes.getBoolean(kk7.D1, false)) {
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
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ew2(context, typedValue.resourceId) : context).inflate(org.telegram.messenger.beta.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
            this.s = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.f.getCallback());
            if (this.Q) {
                this.s.d(kk7.t1);
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
        l69 l69Var = new l69(this, b);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(viewGroup, l69Var);
        if (this.s == null) {
            this.L = (TextView) viewGroup.findViewById(org.telegram.messenger.beta.R.id.title);
        }
        Method method = gfc.a;
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
        contentFrameLayout.setAttachListener(new i4d(this));
        this.K = viewGroup;
        CharSequence charSequence = this.r;
        if (!TextUtils.isEmpty(charSequence)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(charSequence);
            } else {
                zwc zwcVar = this.n;
                if (zwcVar != null) {
                    itb itbVar = (itb) zwcVar.e;
                    if (!itbVar.g) {
                        Toolbar toolbar = itbVar.a;
                        itbVar.h = charSequence;
                        if ((itbVar.b & 8) != 0) {
                            toolbar.setTitle(charSequence);
                            if (itbVar.g) {
                                jdc.l(toolbar.getRootView(), charSequence);
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
        WeakHashMap weakHashMap2 = jdc.a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(kk7.H1, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(kk7.I1, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(kk7.F1)) {
            obtainStyledAttributes2.getValue(kk7.F1, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(kk7.G1)) {
            obtainStyledAttributes2.getValue(kk7.G1, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(kk7.E1)) {
            obtainStyledAttributes2.getValue(kk7.E1, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.J = true;
        ap o = o(0);
        if (this.a0 || o.h != null) {
            return;
        }
        q(kk7.s1);
    }

    public final void l() {
        if (this.f != null) {
            return;
        }
        sc8.j("We have not been given a Window");
    }

    public final Context m() {
        Context context;
        zwc p = p();
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

    public final yo n(Context context) {
        xo xoVar = this.g0;
        if (xoVar == null) {
            vk9 vk9Var = vk9.e;
            if (vk9Var == null) {
                Context applicationContext = context.getApplicationContext();
                vk9Var = new vk9(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                vk9.e = vk9Var;
            }
            xoVar = new xo(this, vk9Var);
            this.g0 = xoVar;
        }
        return xoVar;
    }

    public final ap o(int i) {
        ap[] apVarArr = this.V;
        if (apVarArr == null || apVarArr.length <= i) {
            ap[] apVarArr2 = new ap[i + 1];
            if (apVarArr != null) {
                System.arraycopy(apVarArr, 0, apVarArr2, 0, apVarArr.length);
            }
            this.V = apVarArr2;
            apVarArr = apVarArr2;
        }
        ap apVar = apVarArr[i];
        if (apVar != null) {
            return apVar;
        }
        ap apVar2 = new ap();
        apVar2.a = i;
        apVar2.n = false;
        apVarArr[i] = apVar2;
        return apVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.f() != false) goto L20;
     */
    @Override // wz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o1(yz6 yz6Var) {
        ActionMenuView actionMenuView;
        b9 b9Var;
        b9 b9Var2;
        b9 b9Var3;
        ActionBarOverlayLayout actionBarOverlayLayout = this.s;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.e();
            Toolbar toolbar = ((itb) actionBarOverlayLayout.e).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.J) {
                if (ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.s;
                    actionBarOverlayLayout2.e();
                    ActionMenuView actionMenuView2 = ((itb) actionBarOverlayLayout2.e).a.a;
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
                ActionMenuView actionMenuView3 = ((itb) actionBarOverlayLayout3.e).a.a;
                if (actionMenuView3 != null && (b9Var2 = actionMenuView3.K) != null && b9Var2.f()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.s;
                    actionBarOverlayLayout4.e();
                    ActionMenuView actionMenuView4 = ((itb) actionBarOverlayLayout4.e).a.a;
                    if (actionMenuView4 != null && (b9Var3 = actionMenuView4.K) != null) {
                        b9Var3.e();
                    }
                    if (this.a0) {
                        return;
                    }
                    callback.onPanelClosed(kk7.s1, o(0).h);
                    return;
                }
                if (callback == null || this.a0) {
                    return;
                }
                if (this.i0 && (this.j0 & 1) != 0) {
                    View decorView = this.f.getDecorView();
                    qo qoVar = this.k0;
                    decorView.removeCallbacks(qoVar);
                    qoVar.run();
                }
                ap o = o(0);
                yz6 yz6Var2 = o.h;
                if (yz6Var2 == null || o.o || !callback.onPreparePanel(0, o.g, yz6Var2)) {
                    return;
                }
                callback.onMenuOpened(kk7.s1, o.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.s;
                actionBarOverlayLayout5.e();
                ActionMenuView actionMenuView5 = ((itb) actionBarOverlayLayout5.e).a.a;
                if (actionMenuView5 == null || (b9Var = actionMenuView5.K) == null) {
                    return;
                }
                b9Var.l();
                return;
            }
        }
        ap o2 = o(0);
        o2.n = true;
        h(o2, false);
        s(o2, null);
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
        View ppVar;
        cr crVar = this.o0;
        View view2 = null;
        if (crVar == null) {
            int[] iArr = jy8.j;
            Context context2 = this.e;
            String string = context2.obtainStyledAttributes(iArr).getString(kk7.A1);
            if (string == null) {
                crVar = new cr();
                this.o0 = crVar;
            } else {
                try {
                    cr crVar2 = (cr) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.o0 = crVar2;
                    crVar = crVar2;
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    crVar = new cr();
                    this.o0 = crVar;
                }
            }
        }
        int i = s9c.a;
        crVar.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jy8.y, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Context ew2Var = (resourceId == 0 || ((context instanceof ew2) && ((ew2) context).a == resourceId)) ? context : new ew2(context, resourceId);
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
                ppVar = new pp(ew2Var, attributeSet);
                break;
            case 1:
                ppVar = new no(ew2Var, attributeSet);
                break;
            case 2:
                ppVar = new mp(ew2Var, attributeSet);
                break;
            case 3:
                ppVar = new sq(ew2Var, attributeSet);
                break;
            case 4:
                ppVar = new jp(ew2Var, attributeSet, org.telegram.messenger.beta.R.attr.imageButtonStyle);
                break;
            case 5:
                ppVar = new rp(ew2Var, attributeSet);
                break;
            case 6:
                ppVar = new fq(ew2Var, attributeSet);
                break;
            case 7:
                ppVar = new op(ew2Var, attributeSet);
                break;
            case '\b':
                ppVar = new ar(ew2Var, attributeSet);
                break;
            case '\t':
                ppVar = new lp(ew2Var, attributeSet, 0);
                break;
            case '\n':
                ppVar = new jo(ew2Var, attributeSet);
                break;
            case 11:
                ppVar = new mo(ew2Var, attributeSet);
                break;
            case '\f':
                ppVar = new hp(ew2Var, attributeSet);
                break;
            case '\r':
                ppVar = new lo(ew2Var, attributeSet);
                break;
            default:
                ppVar = null;
                break;
        }
        if (ppVar == null && context != ew2Var) {
            Object[] objArr = crVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = ew2Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = cr.g;
                        if (i2 < 3) {
                            View a = crVar.a(ew2Var, str, strArr[i2]);
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
                    View a2 = crVar.a(ew2Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = a2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            ppVar = view2;
        }
        if (ppVar != null) {
            Context context3 = ppVar.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = jdc.a;
                if (ppVar.hasOnClickListeners()) {
                    TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, cr.c);
                    String string2 = obtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        ppVar.setOnClickListener(new br(ppVar, string2));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes3 = ew2Var.obtainStyledAttributes(attributeSet, cr.d);
                if (obtainStyledAttributes3.hasValue(0)) {
                    boolean z = obtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = jdc.a;
                    new xcc(org.telegram.messenger.beta.R.id.tag_accessibility_heading, Boolean.class, 0, 28, (byte) 2).a(ppVar, Boolean.valueOf(z));
                }
                obtainStyledAttributes3.recycle();
                TypedArray obtainStyledAttributes4 = ew2Var.obtainStyledAttributes(attributeSet, cr.e);
                if (obtainStyledAttributes4.hasValue(0)) {
                    jdc.l(ppVar, obtainStyledAttributes4.getString(0));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = ew2Var.obtainStyledAttributes(attributeSet, cr.f);
                if (obtainStyledAttributes5.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap3 = jdc.a;
                    new xcc(org.telegram.messenger.beta.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, (byte) 0).a(ppVar, Boolean.valueOf(z2));
                }
                obtainStyledAttributes5.recycle();
            }
        }
        return ppVar;
    }

    public final zwc p() {
        zwc zwcVar;
        k();
        if (this.P && (zwcVar = this.n) == null) {
            dp dpVar = this.d;
            if (ug8.A(dpVar)) {
                zwcVar = new zwc(dpVar);
                this.n = zwcVar;
            }
            if (zwcVar != null) {
                zwcVar.c(this.l0);
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
        WeakHashMap weakHashMap = jdc.a;
        decorView.postOnAnimation(this.k0);
        this.i0 = true;
    }

    public final boolean r() {
        g93 g93Var;
        dtb dtbVar;
        boolean z = this.X;
        this.X = false;
        ap o = o(0);
        if (!o.m) {
            f9 f9Var = this.y;
            if (f9Var != null) {
                f9Var.b();
                return true;
            }
            zwc p = p();
            if (p == null || (g93Var = p.e) == null || (dtbVar = ((itb) g93Var).a.f0) == null || dtbVar.b == null) {
                return false;
            }
            dtb dtbVar2 = ((itb) g93Var).a.f0;
            c07 c07Var = dtbVar2 == null ? null : dtbVar2.b;
            if (c07Var != null) {
                c07Var.collapseActionView();
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
    public final void s(ap apVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = apVar.m;
        int i2 = apVar.a;
        if (z || this.a0) {
            return;
        }
        Context context = this.e;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, apVar.h)) {
            h(apVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !u(apVar, keyEvent)) {
            return;
        }
        zo zoVar = apVar.e;
        if (zoVar != null) {
            boolean z2 = apVar.n;
            if (!z2) {
                View view = apVar.g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                    apVar.l = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams2.gravity = apVar.c;
                    layoutParams2.windowAnimations = apVar.d;
                    windowManager.addView(apVar.e, layoutParams2);
                    apVar.m = true;
                    if (i2 == 0) {
                        w();
                        return;
                    }
                    return;
                }
                i = -2;
                apVar.l = false;
                WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams22.gravity = apVar.c;
                layoutParams22.windowAnimations = apVar.d;
                windowManager.addView(apVar.e, layoutParams22);
                apVar.m = true;
                if (i2 == 0) {
                }
            } else if (z2 && zoVar.getChildCount() > 0) {
                apVar.e.removeAllViews();
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
            ew2 ew2Var = new ew2(m, 0);
            ew2Var.getTheme().setTo(newTheme);
            apVar.j = ew2Var;
            TypedArray obtainStyledAttributes = ew2Var.obtainStyledAttributes(jy8.j);
            apVar.b = obtainStyledAttributes.getResourceId(86, 0);
            apVar.d = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
            apVar.e = new zo(this, apVar.j);
            apVar.c = (byte) 81;
        }
        View view2 = apVar.g;
        if (view2 == null) {
            if (apVar.h != null) {
                qx4 qx4Var = this.x;
                if (qx4Var == null) {
                    qx4Var = new qx4(this);
                    this.x = qx4Var;
                }
                if (apVar.i == null) {
                    i56 i56Var = new i56(apVar.j);
                    apVar.i = i56Var;
                    i56Var.e = qx4Var;
                    yz6 yz6Var = apVar.h;
                    yz6Var.b(i56Var, yz6Var.a);
                }
                i56 i56Var2 = apVar.i;
                zo zoVar2 = apVar.e;
                if (i56Var2.d == null) {
                    i56Var2.d = (ExpandedMenuView) i56Var2.b.inflate(org.telegram.messenger.beta.R.layout.abc_expanded_menu_layout, (ViewGroup) zoVar2, false);
                    h56 h56Var = i56Var2.f;
                    if (h56Var == null) {
                        h56Var = new h56(i56Var2);
                        i56Var2.f = h56Var;
                    }
                    i56Var2.d.setAdapter((ListAdapter) h56Var);
                    i56Var2.d.setOnItemClickListener(i56Var2);
                }
                ExpandedMenuView expandedMenuView = i56Var2.d;
                apVar.f = expandedMenuView;
            }
            apVar.n = true;
        }
        apVar.f = view2;
        if (apVar.f != null) {
            if (apVar.g == null) {
                i56 i56Var3 = apVar.i;
                h56 h56Var2 = i56Var3.f;
                if (h56Var2 == null) {
                    h56Var2 = new h56(i56Var3);
                    i56Var3.f = h56Var2;
                }
            }
            ViewGroup.LayoutParams layoutParams3 = apVar.f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            apVar.e.setBackgroundResource(apVar.b);
            ViewParent parent = apVar.f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(apVar.f);
            }
            apVar.e.addView(apVar.f, layoutParams3);
            if (!apVar.f.hasFocus()) {
                apVar.f.requestFocus();
            }
            i = -2;
            apVar.l = false;
            WindowManager.LayoutParams layoutParams222 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams222.gravity = apVar.c;
            layoutParams222.windowAnimations = apVar.d;
            windowManager.addView(apVar.e, layoutParams222);
            apVar.m = true;
            if (i2 == 0) {
            }
        }
        apVar.n = true;
    }

    public final boolean t(ap apVar, int i, KeyEvent keyEvent) {
        yz6 yz6Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((apVar.k || u(apVar, keyEvent)) && (yz6Var = apVar.h) != null) {
            return yz6Var.performShortcut(i, keyEvent, 1);
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
    public final boolean u(ap apVar, KeyEvent keyEvent) {
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.a0) {
            boolean z = apVar.k;
            int i = apVar.a;
            if (z) {
                return true;
            }
            ap apVar2 = this.W;
            if (apVar2 != null && apVar2 != apVar) {
                h(apVar2, false);
            }
            Window.Callback callback = this.f.getCallback();
            if (callback != null) {
                apVar.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.s) != null) {
                actionBarOverlayLayout4.e();
                ((itb) actionBarOverlayLayout4.e).l = true;
            }
            if (apVar.g == null) {
                yz6 yz6Var = apVar.h;
                if (yz6Var == null) {
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
                            ew2 ew2Var = new ew2(context, 0);
                            ew2Var.getTheme().setTo(theme);
                            context = ew2Var;
                        }
                    }
                    yz6 yz6Var2 = new yz6(context);
                    yz6Var2.e = this;
                    yz6 yz6Var3 = apVar.h;
                    if (yz6Var2 != yz6Var3) {
                        if (yz6Var3 != null) {
                            yz6Var3.r(apVar.i);
                        }
                        apVar.h = yz6Var2;
                        i56 i56Var = apVar.i;
                        if (i56Var != null) {
                            yz6Var2.b(i56Var, yz6Var2.a);
                        }
                    }
                    yz6Var = apVar.h;
                }
                if (z2 && (actionBarOverlayLayout2 = this.s) != null) {
                    lj9 lj9Var = this.w;
                    if (lj9Var == null) {
                        lj9Var = new lj9((Object) this, (byte) 5);
                        this.w = lj9Var;
                    }
                    actionBarOverlayLayout2.f(yz6Var, lj9Var);
                }
                apVar.h.w();
                if (callback.onCreatePanelMenu(i, apVar.h)) {
                    apVar.o = false;
                    apVar.h.w();
                    Bundle bundle = apVar.p;
                    if (bundle != null) {
                        apVar.h.s(bundle);
                        apVar.p = null;
                    }
                    if (!callback.onPreparePanel(0, apVar.g, apVar.h)) {
                        if (z2 && (actionBarOverlayLayout3 = this.s) != null) {
                            actionBarOverlayLayout3.f(null, this.w);
                        }
                        apVar.h.v();
                        return false;
                    }
                    apVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                    apVar.h.v();
                } else {
                    yz6 yz6Var4 = apVar.h;
                    if (yz6Var4 != null) {
                        if (yz6Var4 != null) {
                            yz6Var4.r(apVar.i);
                        }
                        apVar.h = null;
                    }
                    if (z2 && (actionBarOverlayLayout = this.s) != null) {
                        actionBarOverlayLayout.f(null, this.w);
                    }
                }
            }
            apVar.k = true;
            apVar.l = false;
            this.W = apVar;
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
                    this.q0 = vo.b(this.p0, this);
                }
            } else if (onBackInvokedCallback != null) {
                vo.c(this.p0, onBackInvokedCallback);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
