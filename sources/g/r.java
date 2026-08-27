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
import g7.b7;
import h7.r6;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;
import m.k1;
import m.k3;
import m.l1;
import m.p3;
import m.w3;
import org.webrtc.MediaStreamTrack;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r extends h implements l.j, LayoutInflater.Factory2 {
    public static final a0.k m0 = new a0.k(0);
    public static final int[] n0 = {R.attr.windowBackground};
    public static final boolean o0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow A;
    public i B;
    public m0 C;
    public final boolean D;
    public boolean E;
    public ViewGroup F;
    public TextView G;
    public View H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public q[] Q;
    public q R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Configuration W;
    public final int X;
    public int Y;
    public int Z;
    public boolean a0;
    public o b0;
    public o c0;
    public final t d;
    public boolean d0;
    public final Context e;
    public int e0;
    public Window f;
    public final i f0;
    public boolean g0;
    public n h;
    public Rect h0;
    public Rect i0;
    public v j0;
    public OnBackInvokedDispatcher k0;
    public OnBackInvokedCallback l0;
    public b0 n;
    public CharSequence r;
    public k1 s;
    public ga.c v;
    public k5.i w;
    public k.a x;
    public ActionBarContextView y;

    public r(t tVar, t tVar2) {
        Context context = tVar.getContext();
        Window window = tVar.getWindow();
        this.C = null;
        this.D = true;
        this.X = -100;
        this.f0 = new i(this, 0);
        this.e = context;
        this.d = tVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.X == -100) {
            String name = this.d.getClass().getName();
            a0.k kVar = m0;
            Integer num = (Integer) kVar.get(name);
            if (num != null) {
                this.X = num.intValue();
                kVar.remove(this.d.getClass().getName());
            }
        }
        if (window != null) {
            e(window);
        }
        m.r.c();
    }

    @Override // g.h
    public final void a() {
        this.T = true;
        d(false);
        m();
        this.W = new Configuration(this.e.getResources().getConfiguration());
        this.U = true;
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
        if (this.O && i10 == 108) {
            return false;
        }
        if (this.K && i10 == 1) {
            this.K = false;
        }
        if (i10 == 1) {
            x();
            this.O = true;
            return true;
        }
        if (i10 == 2) {
            x();
            this.I = true;
            return true;
        }
        if (i10 == 5) {
            x();
            this.J = true;
            return true;
        }
        if (i10 == 10) {
            x();
            this.M = true;
            return true;
        }
        if (i10 == 108) {
            x();
            this.K = true;
            return true;
        }
        if (i10 != 109) {
            return this.f.requestFeature(i10);
        }
        x();
        this.L = true;
        return true;
    }

    public final boolean d(boolean z10) {
        Object obj;
        boolean z11 = false;
        if (this.V) {
            return false;
        }
        int i10 = this.X;
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
                        if (this.c0 == null) {
                            this.c0 = new o(this, context);
                        }
                        i11 = this.c0.e();
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
        this.a0 = true;
        int i13 = this.Z;
        Configuration configuration2 = this.W;
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
        if (((~i13) & i17) != 0 && z10 && this.T && !o0) {
            boolean z12 = this.U;
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
                    if (!b7.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            b7.g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e9) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e9);
                        }
                        b7.h = true;
                    }
                    Field field = b7.g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!b7.b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    b7.a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e11) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                                }
                                b7.b = true;
                            }
                            Field field2 = b7.a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                }
                            }
                            if (obj2 != null) {
                                b7.a(obj2);
                            }
                        }
                    }
                } else if (i16 >= 23) {
                    if (!b7.b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            b7.a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e13) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e13);
                        }
                        b7.b = true;
                    }
                    Field field3 = b7.a;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e14);
                        }
                    }
                    if (obj3 != null) {
                        b7.a(obj3);
                    }
                } else {
                    if (!b7.b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            b7.a = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e15);
                        }
                        b7.b = true;
                    }
                    Field field4 = b7.a;
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
            int i18 = this.Y;
            if (i18 != 0) {
                context.setTheme(i18);
                if (Build.VERSION.SDK_INT >= 23) {
                    context.getTheme().applyStyle(this.Y, true);
                }
            }
            z11 = true;
        }
        if (i10 == 0) {
            o(context).l();
        } else {
            o oVar = this.b0;
            if (oVar != null) {
                oVar.c();
            }
        }
        if (i10 == 3) {
            if (this.c0 == null) {
                this.c0 = new o(this, context);
            }
            this.c0.l();
        } else {
            o oVar2 = this.c0;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, n0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            m.r a2 = m.r.a();
            synchronized (a2) {
                drawable = a2.a.f(resourceId, context, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.k0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.l0) != null) {
            m.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.l0 = null;
        }
        this.k0 = null;
        y();
    }

    public final void f(int i10, q qVar, l.l lVar) {
        if (lVar == null) {
            if (qVar == null && i10 >= 0) {
                q[] qVarArr = this.Q;
                if (i10 < qVarArr.length) {
                    qVar = qVarArr[i10];
                }
            }
            if (qVar != null) {
                lVar = qVar.h;
            }
        }
        if ((qVar == null || qVar.m) && !this.V) {
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
        m.i iVar;
        if (this.P) {
            return;
        }
        this.P = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.s;
        actionBarOverlayLayout.f();
        ActionMenuView actionMenuView = ((p3) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (iVar = actionMenuView.F) != null) {
            iVar.f();
            m.e eVar = iVar.F;
            if (eVar != null && eVar.b()) {
                eVar.i.dismiss();
            }
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, lVar);
        }
        this.P = false;
    }

    public final void h(q qVar, boolean z10) {
        p pVar;
        k1 k1Var;
        m.i iVar;
        if (z10 && qVar.a == 0 && (k1Var = this.s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.f();
            ActionMenuView actionMenuView = ((p3) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (iVar = actionMenuView.F) != null && iVar.g()) {
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
        if (this.R == qVar) {
            this.R = null;
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
        m.i iVar;
        t tVar = this.d;
        if ((!(tVar instanceof r0.k) && !com.google.android.recaptcha.internal.a.u(tVar)) || (decorView = this.f.getDecorView()) == null || !r6.a(decorView, keyEvent)) {
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
                    this.S = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        q p6 = p(0);
                        if (!p6.m) {
                            w(p6, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.x == null) {
                        q p9 = p(0);
                        k1 k1Var = this.s;
                        Context context = this.e;
                        if (k1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
                            actionBarOverlayLayout.f();
                            Toolbar toolbar = ((p3) actionBarOverlayLayout.e).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.E && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                                actionBarOverlayLayout2.f();
                                ActionMenuView actionMenuView2 = ((p3) actionBarOverlayLayout2.e).a.a;
                                if (actionMenuView2 == null || (iVar = actionMenuView2.F) == null || !iVar.g()) {
                                    if (!this.V && w(p9, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s;
                                        actionBarOverlayLayout3.f();
                                        ActionMenuView actionMenuView3 = ((p3) actionBarOverlayLayout3.e).a.a;
                                        if (actionMenuView3 != null) {
                                            m.i iVar2 = actionMenuView3.F;
                                            if (iVar2 != null) {
                                            }
                                        }
                                    }
                                    z10 = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s;
                                    actionBarOverlayLayout4.f();
                                    ActionMenuView actionMenuView4 = ((p3) actionBarOverlayLayout4.e).a.a;
                                    if (actionMenuView4 != null) {
                                        m.i iVar3 = actionMenuView4.F;
                                        if (iVar3 != null) {
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
                        boolean z12 = p9.m;
                        if (z12 || p9.l) {
                            h(p9, true);
                            z10 = z12;
                            if (z10) {
                            }
                        } else {
                            if (p9.k) {
                                if (p9.o) {
                                    p9.k = false;
                                    z11 = w(p9, keyEvent);
                                } else {
                                    z11 = true;
                                }
                                if (z11) {
                                    u(p9, keyEvent);
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
        q p6 = p(i10);
        if (p6.h != null) {
            Bundle bundle = new Bundle();
            p6.h.t(bundle);
            if (bundle.size() > 0) {
                p6.p = bundle;
            }
            p6.h.w();
            p6.h.clear();
        }
        p6.o = true;
        p6.n = true;
        if ((i10 == 108 || i10 == 0) && this.s != null) {
            q p9 = p(0);
            p9.k = false;
            w(p9, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.g() != false) goto L20;
     */
    @Override // l.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(l.l lVar) {
        ActionMenuView actionMenuView;
        m.i iVar;
        m.i iVar2;
        m.i iVar3;
        k1 k1Var = this.s;
        if (k1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.f();
            Toolbar toolbar = ((p3) actionBarOverlayLayout.e).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.E) {
                if (ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout2.f();
                    ActionMenuView actionMenuView2 = ((p3) actionBarOverlayLayout2.e).a.a;
                    if (actionMenuView2 != null) {
                        m.i iVar4 = actionMenuView2.F;
                        if (iVar4 != null) {
                            if (iVar4.G == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s;
                actionBarOverlayLayout3.f();
                ActionMenuView actionMenuView3 = ((p3) actionBarOverlayLayout3.e).a.a;
                if (actionMenuView3 != null && (iVar2 = actionMenuView3.F) != null && iVar2.g()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout4.f();
                    ActionMenuView actionMenuView4 = ((p3) actionBarOverlayLayout4.e).a.a;
                    if (actionMenuView4 != null && (iVar3 = actionMenuView4.F) != null) {
                        iVar3.f();
                    }
                    if (this.V) {
                        return;
                    }
                    callback.onPanelClosed(108, p(0).h);
                    return;
                }
                if (callback == null || this.V) {
                    return;
                }
                if (this.d0 && (1 & this.e0) != 0) {
                    View decorView = this.f.getDecorView();
                    i iVar5 = this.f0;
                    decorView.removeCallbacks(iVar5);
                    iVar5.run();
                }
                q p6 = p(0);
                l.l lVar2 = p6.h;
                if (lVar2 == null || p6.o || !callback.onPreparePanel(0, p6.g, lVar2)) {
                    return;
                }
                callback.onMenuOpened(108, p6.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.s;
                actionBarOverlayLayout5.f();
                ActionMenuView actionMenuView5 = ((p3) actionBarOverlayLayout5.e).a.a;
                if (actionMenuView5 == null || (iVar = actionMenuView5.F) == null) {
                    return;
                }
                iVar.l();
                return;
            }
        }
        q p9 = p(0);
        p9.n = true;
        h(p9, false);
        u(p9, null);
    }

    public final void l() {
        ViewGroup viewGroup;
        if (this.E) {
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
        this.N = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        m();
        this.f.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.O) {
            viewGroup = this.M ? (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) from.inflate(org.telegram.messenger.beta.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new k.c(context, typedValue.resourceId) : context).inflate(org.telegram.messenger.beta.R.layout.abc_screen_toolbar, (ViewGroup) null);
            k1 k1Var = (k1) viewGroup.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
            this.s = k1Var;
            k1Var.setWindowCallback(this.f.getCallback());
            if (this.L) {
                ((ActionBarOverlayLayout) this.s).e(109);
            }
            if (this.I) {
                ((ActionBarOverlayLayout) this.s).e(2);
            }
            if (this.J) {
                ((ActionBarOverlayLayout) this.s).e(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
        }
        int i10 = 15;
        a9.i iVar = new a9.i(this, i10);
        WeakHashMap weakHashMap = j0.a;
        r0.b0.j(viewGroup, iVar);
        if (this.s == null) {
            this.G = (TextView) viewGroup.findViewById(org.telegram.messenger.beta.R.id.title);
        }
        Method method = w3.a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e9) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e9);
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
        contentFrameLayout.setAttachListener(new ae.b(this, i10));
        this.F = viewGroup;
        CharSequence charSequence = this.r;
        if (!TextUtils.isEmpty(charSequence)) {
            k1 k1Var2 = this.s;
            if (k1Var2 != null) {
                k1Var2.setWindowTitle(charSequence);
            } else {
                b0 b0Var = this.n;
                if (b0Var != null) {
                    p3 p3Var = (p3) b0Var.e;
                    if (!p3Var.g) {
                        Toolbar toolbar = p3Var.a;
                        p3Var.h = charSequence;
                        if ((p3Var.b & 8) != 0) {
                            toolbar.setTitle(charSequence);
                            if (p3Var.g) {
                                j0.l(toolbar.getRootView(), charSequence);
                            }
                        }
                    }
                } else {
                    TextView textView = this.G;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.F.findViewById(R.id.content);
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
        this.E = true;
        q p6 = p(0);
        if (this.V || p6.h != null) {
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

    public final f2.w o(Context context) {
        if (this.b0 == null) {
            if (a5.n.e == null) {
                Context applicationContext = context.getApplicationContext();
                a5.n.e = new a5.n(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.b0 = new o(this, a5.n.e);
        }
        return this.b0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:68:0x01e4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.r.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final q p(int i10) {
        q[] qVarArr = this.Q;
        if (qVarArr == null || qVarArr.length <= i10) {
            q[] qVarArr2 = new q[i10 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.Q = qVarArr2;
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

    public final b0 q() {
        l();
        if (this.K && this.n == null) {
            t tVar = this.d;
            if (com.google.android.recaptcha.internal.a.u(tVar)) {
                this.n = new b0(tVar);
            }
            b0 b0Var = this.n;
            if (b0Var != null) {
                b0Var.c(this.g0);
            }
        }
        return this.n;
    }

    public final void r(int i10) {
        this.e0 = (1 << i10) | this.e0;
        if (this.d0) {
            return;
        }
        View decorView = this.f.getDecorView();
        WeakHashMap weakHashMap = j0.a;
        decorView.postOnAnimation(this.f0);
        this.d0 = true;
    }

    public final boolean s() {
        l1 l1Var;
        k3 k3Var;
        boolean z10 = this.S;
        this.S = false;
        q p6 = p(0);
        if (!p6.m) {
            k.a aVar = this.x;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            b0 q6 = q();
            if (q6 == null || (l1Var = q6.e) == null || (k3Var = ((p3) l1Var).a.a0) == null || k3Var.b == null) {
                return false;
            }
            k3 k3Var2 = ((p3) l1Var).a.a0;
            l.n nVar = k3Var2 == null ? null : k3Var2.b;
            if (nVar != null) {
                nVar.collapseActionView();
            }
        } else if (!z10) {
            h(p6, true);
            return true;
        }
        return true;
    }

    @Override // l.j
    public final boolean t(l.l lVar, MenuItem menuItem) {
        q qVar;
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.V) {
            l.l k10 = lVar.k();
            q[] qVarArr = this.Q;
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
    public final void u(q qVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        boolean z10 = qVar.m;
        int i11 = qVar.a;
        if (z10 || this.V) {
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
                        this.w = new k5.i(this, 14);
                    }
                    k5.i iVar = this.w;
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
        k1 k1Var;
        k1 k1Var2;
        Resources.Theme theme;
        k1 k1Var3;
        k1 k1Var4;
        if (!this.V) {
            boolean z10 = qVar.k;
            int i10 = qVar.a;
            if (z10) {
                return true;
            }
            q qVar2 = this.R;
            if (qVar2 != null && qVar2 != qVar) {
                h(qVar2, false);
            }
            Window.Callback callback = this.f.getCallback();
            if (callback != null) {
                qVar.g = callback.onCreatePanelView(i10);
            }
            boolean z11 = i10 == 0 || i10 == 108;
            if (z11 && (k1Var4 = this.s) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var4;
                actionBarOverlayLayout.f();
                ((p3) actionBarOverlayLayout.e).l = true;
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
                    if (z11 && (k1Var2 = this.s) != null) {
                        if (this.v == null) {
                            this.v = new ga.c(this, 14);
                        }
                        ((ActionBarOverlayLayout) k1Var2).g(qVar.h, this.v);
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
                        if (z11 && (k1Var = this.s) != null) {
                            ((ActionBarOverlayLayout) k1Var).g(null, this.v);
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
                    if (z11 && (k1Var3 = this.s) != null) {
                        ((ActionBarOverlayLayout) k1Var3).g(null, this.v);
                    }
                    qVar.h.v();
                    return false;
                }
                qVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                qVar.h.v();
            }
            qVar.k = true;
            qVar.l = false;
            this.R = qVar;
            return true;
        }
        return false;
    }

    public final void x() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void y() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.k0 != null && (p(0).m || this.x != null)) {
                z10 = true;
            }
            if (z10 && this.l0 == null) {
                this.l0 = m.b(this.k0, this);
            } else {
                if (z10 || (onBackInvokedCallback = this.l0) == null) {
                    return;
                }
                m.c(this.k0, onBackInvokedCallback);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
