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
import java.util.WeakHashMap;
import m.h3;
import m.j1;
import m.k1;
import m.m3;
import m.t3;
import org.webrtc.MediaStreamTrack;
import r0.i0;
import r0.l0;
import v7.i7;
import w7.x6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class r extends g implements l.i, LayoutInflater.Factory2 {
    public static final a0.m q0 = new a0.m(0);
    public static final int[] r0 = {R.attr.windowBackground};
    public static final boolean s0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow E;
    public h F;
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
    public a0 n;
    public v n0;
    public OnBackInvokedDispatcher o0;
    public OnBackInvokedCallback p0;
    public CharSequence r;
    public j1 s;
    public xa.d v;
    public a6.i w;
    public k.a x;
    public ActionBarContextView y;

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
            a0.m mVar = q0;
            Integer num = (Integer) mVar.get(name);
            if (num != null) {
                this.b0 = num.intValue();
                mVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        m.q.c();
    }

    @Override // l.i
    public final boolean A(l.k kVar, MenuItem menuItem) {
        q qVar;
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.Z) {
            l.k k10 = kVar.k();
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
            w();
            this.S = true;
            return true;
        }
        if (i10 == 2) {
            w();
            this.M = true;
            return true;
        }
        if (i10 == 5) {
            w();
            this.N = true;
            return true;
        }
        if (i10 == 10) {
            w();
            this.Q = true;
            return true;
        }
        if (i10 == 108) {
            w();
            this.O = true;
            return true;
        }
        if (i10 != 109) {
            return this.f.requestFeature(i10);
        }
        w();
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
                    if (!i7.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            i7.g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e7) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e7);
                        }
                        i7.h = true;
                    }
                    Field field = i7.g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!i7.b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    i7.a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e11) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                                }
                                i7.b = true;
                            }
                            Field field2 = i7.a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                }
                            }
                            if (obj2 != null) {
                                i7.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!i7.b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            i7.a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e13) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e13);
                        }
                        i7.b = true;
                    }
                    Field field3 = i7.a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e14);
                        }
                    }
                    if (obj2 != null) {
                        i7.a(obj2);
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
            o(context).l();
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
        x();
    }

    public final void f(int i10, q qVar, l.k kVar) {
        if (kVar == null) {
            if (qVar == null && i10 >= 0) {
                q[] qVarArr = this.U;
                if (i10 < qVarArr.length) {
                    qVar = qVarArr[i10];
                }
            }
            if (qVar != null) {
                kVar = qVar.h;
            }
        }
        if ((qVar == null || qVar.m) && !this.Z) {
            m mVar = this.h;
            Window.Callback callback = this.f.getCallback();
            mVar.getClass();
            try {
                mVar.d = true;
                callback.onPanelClosed(i10, kVar);
            } finally {
                mVar.d = false;
            }
        }
    }

    public final void g(l.k kVar) {
        m.h hVar;
        if (this.T) {
            return;
        }
        this.T = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.s;
        actionBarOverlayLayout.f();
        ActionMenuView actionMenuView = ((m3) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (hVar = actionMenuView.J) != null) {
            hVar.f();
            m.d dVar = hVar.J;
            if (dVar != null && dVar.b()) {
                dVar.i.dismiss();
            }
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.Z) {
            callback.onPanelClosed(108, kVar);
        }
        this.T = false;
    }

    public final void h(q qVar, boolean z10) {
        p pVar;
        j1 j1Var;
        m.h hVar;
        if (z10 && qVar.a == 0 && (j1Var = this.s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.f();
            ActionMenuView actionMenuView = ((m3) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (hVar = actionMenuView.J) != null && hVar.g()) {
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
    public final boolean i(KeyEvent keyEvent) {
        View decorView;
        boolean z10;
        boolean z11;
        ActionMenuView actionMenuView;
        m.h hVar;
        t tVar = this.d;
        if ((!(tVar instanceof r0.j) && !e2.t(tVar)) || (decorView = this.f.getDecorView()) == null || !x6.a(decorView, keyEvent)) {
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
                        q p5 = p(0);
                        if (!p5.m) {
                            v(p5, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.x == null) {
                        q p10 = p(0);
                        j1 j1Var = this.s;
                        Context context = this.e;
                        if (j1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
                            actionBarOverlayLayout.f();
                            Toolbar toolbar = ((m3) actionBarOverlayLayout.e).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.I && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                                actionBarOverlayLayout2.f();
                                ActionMenuView actionMenuView2 = ((m3) actionBarOverlayLayout2.e).a.a;
                                if (actionMenuView2 == null || (hVar = actionMenuView2.J) == null || !hVar.g()) {
                                    if (!this.Z && v(p10, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s;
                                        actionBarOverlayLayout3.f();
                                        ActionMenuView actionMenuView3 = ((m3) actionBarOverlayLayout3.e).a.a;
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
                                    ActionMenuView actionMenuView4 = ((m3) actionBarOverlayLayout4.e).a.a;
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
                                    z11 = v(p10, keyEvent);
                                } else {
                                    z11 = true;
                                }
                                if (z11) {
                                    t(p10, keyEvent);
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
        q p5 = p(i10);
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
            q p10 = p(0);
            p10.k = false;
            v(p10, null);
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
        a4.l lVar = new a4.l(this, 16);
        WeakHashMap weakHashMap = i0.a;
        r0.a0.i(viewGroup, lVar);
        if (this.s == null) {
            this.K = (TextView) viewGroup.findViewById(org.telegram.messenger.beta.R.id.title);
        }
        Method method = t3.a;
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
        contentFrameLayout.setAttachListener(new pb.c(this, 20));
        this.J = viewGroup;
        CharSequence charSequence = this.r;
        if (!TextUtils.isEmpty(charSequence)) {
            j1 j1Var2 = this.s;
            if (j1Var2 != null) {
                j1Var2.setWindowTitle(charSequence);
            } else {
                a0 a0Var = this.n;
                if (a0Var != null) {
                    m3 m3Var = (m3) a0Var.e;
                    if (!m3Var.g) {
                        Toolbar toolbar = m3Var.a;
                        m3Var.h = charSequence;
                        if ((m3Var.b & 8) != 0) {
                            toolbar.setTitle(charSequence);
                            if (m3Var.g) {
                                i0.k(toolbar.getRootView(), charSequence);
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
        q p5 = p(0);
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
        a0 q6 = q();
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
    @Override // l.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(l.k kVar) {
        ActionMenuView actionMenuView;
        m.h hVar;
        m.h hVar2;
        m.h hVar3;
        j1 j1Var = this.s;
        if (j1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) j1Var;
            actionBarOverlayLayout.f();
            Toolbar toolbar = ((m3) actionBarOverlayLayout.e).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.I) {
                if (ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout2.f();
                    ActionMenuView actionMenuView2 = ((m3) actionBarOverlayLayout2.e).a.a;
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
                ActionMenuView actionMenuView3 = ((m3) actionBarOverlayLayout3.e).a.a;
                if (actionMenuView3 != null && (hVar2 = actionMenuView3.J) != null && hVar2.g()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout4.f();
                    ActionMenuView actionMenuView4 = ((m3) actionBarOverlayLayout4.e).a.a;
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
                    h hVar5 = this.j0;
                    decorView.removeCallbacks(hVar5);
                    hVar5.run();
                }
                q p5 = p(0);
                l.k kVar2 = p5.h;
                if (kVar2 == null || p5.o || !callback.onPreparePanel(0, p5.g, kVar2)) {
                    return;
                }
                callback.onMenuOpened(108, p5.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.s;
                actionBarOverlayLayout5.f();
                ActionMenuView actionMenuView5 = ((m3) actionBarOverlayLayout5.e).a.a;
                if (actionMenuView5 == null || (hVar = actionMenuView5.J) == null) {
                    return;
                }
                hVar.l();
                return;
            }
        }
        q p10 = p(0);
        p10.n = true;
        h(p10, false);
        t(p10, null);
    }

    public final o o(Context context) {
        if (this.f0 == null) {
            if (aa.a.e == null) {
                Context applicationContext = context.getApplicationContext();
                aa.a.e = new aa.a(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f0 = new n(this, aa.a.e);
        }
        return this.f0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:68:0x01eb
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.r.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final q p(int i10) {
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

    public final a0 q() {
        k();
        if (this.O && this.n == null) {
            t tVar = this.d;
            if (e2.t(tVar)) {
                this.n = new a0(tVar);
            }
            a0 a0Var = this.n;
            if (a0Var != null) {
                a0Var.c(this.k0);
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

    public final boolean s() {
        k1 k1Var;
        h3 h3Var;
        boolean z10 = this.W;
        this.W = false;
        q p5 = p(0);
        if (!p5.m) {
            k.a aVar = this.x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            a0 q6 = q();
            if (q6 == null || (k1Var = q6.e) == null || (h3Var = ((m3) k1Var).a.e0) == null || h3Var.b == null) {
                return false;
            }
            h3 h3Var2 = ((m3) k1Var).a.e0;
            l.m mVar = h3Var2 == null ? null : h3Var2.b;
            if (mVar != null) {
                mVar.collapseActionView();
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
        if (windowManager == null || !v(qVar, keyEvent)) {
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
                    if (this.w == null) {
                        this.w = new a6.i(this, 21);
                    }
                    a6.i iVar = this.w;
                    if (qVar.i == null) {
                        l.g gVar = new l.g(qVar.j);
                        qVar.i = gVar;
                        gVar.e = iVar;
                        l.k kVar = qVar.h;
                        kVar.b(gVar, kVar.a);
                    }
                    l.g gVar2 = qVar.i;
                    p pVar2 = qVar.e;
                    if (gVar2.d == null) {
                        gVar2.d = (ExpandedMenuView) gVar2.b.inflate(org.telegram.messenger.beta.R.layout.abc_expanded_menu_layout, (ViewGroup) pVar2, false);
                        if (gVar2.f == null) {
                            gVar2.f = new l.f(gVar2);
                        }
                        gVar2.d.setAdapter((ListAdapter) gVar2.f);
                        gVar2.d.setOnItemClickListener(gVar2);
                    }
                    ExpandedMenuView expandedMenuView = gVar2.d;
                    qVar.f = expandedMenuView;
                }
                qVar.n = true;
                return;
            }
            qVar.f = view;
            if (qVar.f != null) {
                if (qVar.g == null) {
                    l.g gVar3 = qVar.i;
                    if (gVar3.f == null) {
                        gVar3.f = new l.f(gVar3);
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
                x();
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

    public final boolean u(q qVar, int i10, KeyEvent keyEvent) {
        l.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.k || v(qVar, keyEvent)) && (kVar = qVar.h) != null) {
            return kVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(q qVar, KeyEvent keyEvent) {
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
                actionBarOverlayLayout.f();
                ((m3) actionBarOverlayLayout.e).l = true;
            }
            if (qVar.g == null) {
                l.k kVar = qVar.h;
                if (kVar == null || qVar.o) {
                    if (kVar == null) {
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
                        l.k kVar2 = new l.k(context);
                        kVar2.e = this;
                        l.k kVar3 = qVar.h;
                        if (kVar2 != kVar3) {
                            if (kVar3 != null) {
                                kVar3.r(qVar.i);
                            }
                            qVar.h = kVar2;
                            l.g gVar = qVar.i;
                            if (gVar != null) {
                                kVar2.b(gVar, kVar2.a);
                            }
                        }
                    }
                    if (z11 && (j1Var2 = this.s) != null) {
                        if (this.v == null) {
                            this.v = new xa.d(this, 18);
                        }
                        ((ActionBarOverlayLayout) j1Var2).g(qVar.h, this.v);
                    }
                    qVar.h.w();
                    if (callback.onCreatePanelMenu(i10, qVar.h)) {
                        qVar.o = false;
                    } else {
                        l.k kVar4 = qVar.h;
                        if (kVar4 != null) {
                            if (kVar4 != null) {
                                kVar4.r(qVar.i);
                            }
                            qVar.h = null;
                        }
                        if (z11 && (j1Var = this.s) != null) {
                            ((ActionBarOverlayLayout) j1Var).g(null, this.v);
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
                        ((ActionBarOverlayLayout) j1Var3).g(null, this.v);
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

    public final void w() {
        if (this.I) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void x() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.o0 != null && (p(0).m || this.x != null)) {
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
