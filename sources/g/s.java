package g;

import a8.da;
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
import c8.tb;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.h3;
import m.k1;
import m.l1;
import m.m3;
import m.t3;
import org.telegram.messenger.qs;
import org.webrtc.MediaStreamTrack;
import r0.i0;
import r0.l0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class s extends g implements l.i, LayoutInflater.Factory2 {
    public static final a0.l q0 = new a0.l(0);
    public static final int[] r0 = {R.attr.windowBackground};
    public static final boolean s0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView D;
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
    public final h j0;
    public boolean k0;
    public Rect l0;
    public Rect m0;
    public b0 n;
    public w n0;
    public OnBackInvokedDispatcher o0;
    public OnBackInvokedCallback p0;
    public CharSequence r;
    public k1 s;
    public cb.c w;
    public i x;
    public k.a y;

    public s(u uVar, u uVar2) {
        Context context = uVar.getContext();
        Window window = uVar.getWindow();
        this.G = null;
        this.H = true;
        this.b0 = -100;
        this.j0 = new h(this, 0);
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
        m.r.c();
    }

    @Override // l.i
    public final boolean F0(l.k kVar, MenuItem menuItem) {
        r rVar;
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.Z) {
            l.k k10 = kVar.k();
            r[] rVarArr = this.U;
            int length = rVarArr != null ? rVarArr.length : 0;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    rVar = rVarArr[i7];
                    if (rVar != null && rVar.h == k10) {
                        break;
                    }
                    i7++;
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
        this.X = true;
        d(false);
        l();
        this.a0 = new Configuration(this.e.getResources().getConfiguration());
        this.Y = true;
    }

    @Override // g.g
    public final boolean c(int i7) {
        if (i7 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i7 = 108;
        } else if (i7 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i7 = 109;
        }
        if (this.S && i7 == 108) {
            return false;
        }
        if (this.O && i7 == 1) {
            this.O = false;
        }
        if (i7 == 1) {
            v();
            this.S = true;
            return true;
        }
        if (i7 == 2) {
            v();
            this.M = true;
            return true;
        }
        if (i7 == 5) {
            v();
            this.N = true;
            return true;
        }
        if (i7 == 10) {
            v();
            this.Q = true;
            return true;
        }
        if (i7 == 108) {
            v();
            this.O = true;
            return true;
        }
        if (i7 != 109) {
            return this.f.requestFeature(i7);
        }
        v();
        this.P = true;
        return true;
    }

    public final boolean d(boolean z9) {
        Object obj;
        boolean z10 = false;
        if (this.Z) {
            return false;
        }
        int i7 = this.b0;
        if (i7 == -100) {
            i7 = g.a;
        }
        Context context = this.e;
        int i10 = -1;
        if (i7 != -100) {
            if (i7 != -1) {
                if (i7 != 0) {
                    if (i7 != 1 && i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.g0 == null) {
                            this.g0 = new o(this, context);
                        }
                        i10 = this.g0.e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    i10 = n(context).e();
                }
            }
            i10 = i7;
        }
        int i11 = i10 != 1 ? i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        configuration.uiMode = i11 | (configuration.uiMode & (-49));
        this.e0 = true;
        int i12 = this.d0;
        Configuration configuration2 = this.a0;
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
        if (((~i12) & i16) != 0 && z9 && this.X && !s0) {
            boolean z11 = this.Y;
        }
        if (i16 != 0) {
            Resources resources = context.getResources();
            Configuration configuration3 = new Configuration(resources.getConfiguration());
            configuration3.uiMode = i14 | (resources.getConfiguration().uiMode & (-49));
            Object obj2 = null;
            resources.updateConfiguration(configuration3, null);
            if (i15 < 26 && i15 < 28) {
                if (i15 >= 24) {
                    if (!da.h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            da.g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
                        }
                        da.h = true;
                    }
                    Field field = da.g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e11) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!da.b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    da.a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e12) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
                                }
                                da.b = true;
                            }
                            Field field2 = da.a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e13) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
                                }
                            }
                            if (obj2 != null) {
                                da.a(obj2);
                            }
                        }
                    }
                } else {
                    if (!da.b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            da.a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e14) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e14);
                        }
                        da.b = true;
                    }
                    Field field3 = da.a;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException e15) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e15);
                        }
                    }
                    if (obj2 != null) {
                        da.a(obj2);
                    }
                }
            }
            int i17 = this.c0;
            if (i17 != 0) {
                context.setTheme(i17);
                context.getTheme().applyStyle(this.c0, true);
            }
            z10 = true;
        }
        if (i7 == 0) {
            n(context).l();
        } else {
            o oVar = this.f0;
            if (oVar != null) {
                oVar.c();
            }
        }
        if (i7 == 3) {
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
            m.r a10 = m.r.a();
            synchronized (a10) {
                drawable = a10.a.f(resourceId, context, true);
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
        w();
    }

    public final void f(int i7, r rVar, l.k kVar) {
        if (kVar == null) {
            if (rVar == null && i7 >= 0) {
                r[] rVarArr = this.U;
                if (i7 < rVarArr.length) {
                    rVar = rVarArr[i7];
                }
            }
            if (rVar != null) {
                kVar = rVar.h;
            }
        }
        if ((rVar == null || rVar.m) && !this.Z) {
            n nVar = this.h;
            Window.Callback callback = this.f.getCallback();
            nVar.getClass();
            try {
                nVar.d = true;
                callback.onPanelClosed(i7, kVar);
            } finally {
                nVar.d = false;
            }
        }
    }

    public final void g(l.k kVar) {
        m.i iVar;
        if (this.T) {
            return;
        }
        this.T = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.s;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((m3) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (iVar = actionMenuView.J) != null) {
            iVar.f();
            m.e eVar = iVar.J;
            if (eVar != null && eVar.b()) {
                eVar.i.dismiss();
            }
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !this.Z) {
            callback.onPanelClosed(qs.t1, kVar);
        }
        this.T = false;
    }

    public final void h(r rVar, boolean z9) {
        q qVar;
        k1 k1Var;
        m.i iVar;
        if (z9 && rVar.a == 0 && (k1Var = this.s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.e();
            ActionMenuView actionMenuView = ((m3) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (iVar = actionMenuView.J) != null && iVar.g()) {
                g(rVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && rVar.m && (qVar = rVar.e) != null) {
            windowManager.removeView(qVar);
            if (z9) {
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
            w();
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
        boolean z9;
        boolean z10;
        ActionMenuView actionMenuView;
        m.i iVar;
        u uVar = this.d;
        if ((!(uVar instanceof r0.i) && !com.google.android.recaptcha.internal.a.u(uVar)) || (decorView = this.f.getDecorView()) == null || !tb.a(decorView, keyEvent)) {
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
                        r o4 = o(0);
                        if (!o4.m) {
                            u(o4, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.y == null) {
                        r o10 = o(0);
                        k1 k1Var = this.s;
                        Context context = this.e;
                        if (k1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
                            actionBarOverlayLayout.e();
                            Toolbar toolbar = ((m3) actionBarOverlayLayout.e).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.I && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                                actionBarOverlayLayout2.e();
                                ActionMenuView actionMenuView2 = ((m3) actionBarOverlayLayout2.e).a.a;
                                if (actionMenuView2 == null || (iVar = actionMenuView2.J) == null || !iVar.g()) {
                                    if (!this.Z && u(o10, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s;
                                        actionBarOverlayLayout3.e();
                                        ActionMenuView actionMenuView3 = ((m3) actionBarOverlayLayout3.e).a.a;
                                        if (actionMenuView3 != null) {
                                            m.i iVar2 = actionMenuView3.J;
                                            if (iVar2 != null) {
                                            }
                                        }
                                    }
                                    z9 = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s;
                                    actionBarOverlayLayout4.e();
                                    ActionMenuView actionMenuView4 = ((m3) actionBarOverlayLayout4.e).a.a;
                                    if (actionMenuView4 != null) {
                                        m.i iVar3 = actionMenuView4.J;
                                        if (iVar3 != null) {
                                        }
                                    }
                                    z9 = false;
                                }
                                if (z9) {
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
                        boolean z11 = o10.m;
                        if (z11 || o10.l) {
                            h(o10, true);
                            z9 = z11;
                            if (z9) {
                            }
                        } else {
                            if (o10.k) {
                                if (o10.o) {
                                    o10.k = false;
                                    z10 = u(o10, keyEvent);
                                } else {
                                    z10 = true;
                                }
                                if (z10) {
                                    s(o10, keyEvent);
                                    z9 = true;
                                    if (z9) {
                                    }
                                }
                            }
                            z9 = false;
                            if (z9) {
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

    public final void j(int i7) {
        r o4 = o(i7);
        if (o4.h != null) {
            Bundle bundle = new Bundle();
            o4.h.t(bundle);
            if (bundle.size() > 0) {
                o4.p = bundle;
            }
            o4.h.w();
            o4.h.clear();
        }
        o4.o = true;
        o4.n = true;
        if ((i7 == 108 || i7 == 0) && this.s != null) {
            r o10 = o(0);
            o10.k = false;
            u(o10, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.g() != false) goto L20;
     */
    @Override // l.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(l.k kVar) {
        ActionMenuView actionMenuView;
        m.i iVar;
        m.i iVar2;
        m.i iVar3;
        k1 k1Var = this.s;
        if (k1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
            actionBarOverlayLayout.e();
            Toolbar toolbar = ((m3) actionBarOverlayLayout.e).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.I) {
                if (ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout2.e();
                    ActionMenuView actionMenuView2 = ((m3) actionBarOverlayLayout2.e).a.a;
                    if (actionMenuView2 != null) {
                        m.i iVar4 = actionMenuView2.J;
                        if (iVar4 != null) {
                            if (iVar4.K == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.s;
                actionBarOverlayLayout3.e();
                ActionMenuView actionMenuView3 = ((m3) actionBarOverlayLayout3.e).a.a;
                if (actionMenuView3 != null && (iVar2 = actionMenuView3.J) != null && iVar2.g()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.s;
                    actionBarOverlayLayout4.e();
                    ActionMenuView actionMenuView4 = ((m3) actionBarOverlayLayout4.e).a.a;
                    if (actionMenuView4 != null && (iVar3 = actionMenuView4.J) != null) {
                        iVar3.f();
                    }
                    if (this.Z) {
                        return;
                    }
                    callback.onPanelClosed(qs.t1, o(0).h);
                    return;
                }
                if (callback == null || this.Z) {
                    return;
                }
                if (this.h0 && (1 & this.i0) != 0) {
                    View decorView = this.f.getDecorView();
                    h hVar = this.j0;
                    decorView.removeCallbacks(hVar);
                    hVar.run();
                }
                r o4 = o(0);
                l.k kVar2 = o4.h;
                if (kVar2 == null || o4.o || !callback.onPreparePanel(0, o4.g, kVar2)) {
                    return;
                }
                callback.onMenuOpened(qs.t1, o4.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.s;
                actionBarOverlayLayout5.e();
                ActionMenuView actionMenuView5 = ((m3) actionBarOverlayLayout5.e).a.a;
                if (actionMenuView5 == null || (iVar = actionMenuView5.J) == null) {
                    return;
                }
                iVar.l();
                return;
            }
        }
        r o10 = o(0);
        o10.n = true;
        h(o10, false);
        s(o10, null);
    }

    public final void k() {
        ViewGroup viewGroup;
        if (this.I) {
            return;
        }
        Context context = this.e;
        int[] iArr = f.a.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(qs.C1)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(qs.K1, false)) {
            c(1);
        } else if (obtainStyledAttributes.getBoolean(qs.C1, false)) {
            c(qs.t1);
        }
        if (obtainStyledAttributes.getBoolean(qs.D1, false)) {
            c(qs.u1);
        }
        if (obtainStyledAttributes.getBoolean(qs.E1, false)) {
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
            k1 k1Var = (k1) viewGroup.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
            this.s = k1Var;
            k1Var.setWindowCallback(this.f.getCallback());
            if (this.P) {
                ((ActionBarOverlayLayout) this.s).d(qs.u1);
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
        i iVar = new i(this);
        WeakHashMap weakHashMap = i0.a;
        r0.a0.i(viewGroup, iVar);
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
        contentFrameLayout.setAttachListener(new aa.n(this, 24));
        this.J = viewGroup;
        CharSequence charSequence = this.r;
        if (!TextUtils.isEmpty(charSequence)) {
            k1 k1Var2 = this.s;
            if (k1Var2 != null) {
                k1Var2.setWindowTitle(charSequence);
            } else {
                b0 b0Var = this.n;
                if (b0Var != null) {
                    m3 m3Var = (m3) b0Var.e;
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
        obtainStyledAttributes2.getValue(qs.I1, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(qs.J1, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(qs.G1)) {
            obtainStyledAttributes2.getValue(qs.G1, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(qs.H1)) {
            obtainStyledAttributes2.getValue(qs.H1, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(qs.F1)) {
            obtainStyledAttributes2.getValue(qs.F1, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.I = true;
        r o4 = o(0);
        if (this.Z || o4.h != null) {
            return;
        }
        q(qs.t1);
    }

    public final void l() {
        if (this.f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context m() {
        Context context;
        b0 p10 = p();
        if (p10 != null) {
            if (p10.b == null) {
                TypedValue typedValue = new TypedValue();
                p10.a.getTheme().resolveAttribute(org.telegram.messenger.beta.R.attr.actionBarWidgetTheme, typedValue, true);
                int i7 = typedValue.resourceId;
                if (i7 != 0) {
                    p10.b = new ContextThemeWrapper(p10.a, i7);
                } else {
                    p10.b = p10.a;
                }
            }
            context = p10.b;
        } else {
            context = null;
        }
        return context == null ? this.e : context;
    }

    public final p n(Context context) {
        if (this.f0 == null) {
            if (android.support.v4.media.session.a0.f == null) {
                Context applicationContext = context.getApplicationContext();
                android.support.v4.media.session.a0.f = new android.support.v4.media.session.a0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f0 = new o(this, android.support.v4.media.session.a0.f);
        }
        return this.f0;
    }

    public final r o(int i7) {
        r[] rVarArr = this.U;
        if (rVarArr == null || rVarArr.length <= i7) {
            r[] rVarArr2 = new r[i7 + 1];
            if (rVarArr != null) {
                System.arraycopy(rVarArr, 0, rVarArr2, 0, rVarArr.length);
            }
            this.U = rVarArr2;
            rVarArr = rVarArr2;
        }
        r rVar = rVarArr[i7];
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r();
        rVar2.a = i7;
        rVar2.n = false;
        rVarArr[i7] = rVar2;
        return rVar2;
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

    public final b0 p() {
        k();
        if (this.O && this.n == null) {
            u uVar = this.d;
            if (com.google.android.recaptcha.internal.a.u(uVar)) {
                this.n = new b0(uVar);
            }
            b0 b0Var = this.n;
            if (b0Var != null) {
                b0Var.c(this.k0);
            }
        }
        return this.n;
    }

    public final void q(int i7) {
        this.i0 = (1 << i7) | this.i0;
        if (this.h0) {
            return;
        }
        View decorView = this.f.getDecorView();
        WeakHashMap weakHashMap = i0.a;
        decorView.postOnAnimation(this.j0);
        this.h0 = true;
    }

    public final boolean r() {
        l1 l1Var;
        h3 h3Var;
        boolean z9 = this.W;
        this.W = false;
        r o4 = o(0);
        if (!o4.m) {
            k.a aVar = this.y;
            if (aVar != null) {
                aVar.b();
                return true;
            }
            b0 p10 = p();
            if (p10 == null || (l1Var = p10.e) == null || (h3Var = ((m3) l1Var).a.e0) == null || h3Var.b == null) {
                return false;
            }
            h3 h3Var2 = ((m3) l1Var).a.e0;
            l.m mVar = h3Var2 == null ? null : h3Var2.b;
            if (mVar != null) {
                mVar.collapseActionView();
            }
        } else if (!z9) {
            h(o4, true);
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
    public final void s(r rVar, KeyEvent keyEvent) {
        int i7;
        ViewGroup.LayoutParams layoutParams;
        boolean z9 = rVar.m;
        int i10 = rVar.a;
        if (z9 || this.Z) {
            return;
        }
        Context context = this.e;
        if (i10 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f.getCallback();
        if (callback != null && !callback.onMenuOpened(i10, rVar.h)) {
            h(rVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !u(rVar, keyEvent)) {
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
            i7 = -1;
            rVar.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i7, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = rVar.c;
            layoutParams3.windowAnimations = rVar.d;
            windowManager.addView(rVar.e, layoutParams3);
            rVar.m = true;
            if (i10 != 0) {
                w();
                return;
            }
            return;
        }
        i7 = -2;
        rVar.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i7, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = rVar.c;
        layoutParams32.windowAnimations = rVar.d;
        windowManager.addView(rVar.e, layoutParams32);
        rVar.m = true;
        if (i10 != 0) {
        }
    }

    public final boolean t(r rVar, int i7, KeyEvent keyEvent) {
        l.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((rVar.k || u(rVar, keyEvent)) && (kVar = rVar.h) != null) {
            return kVar.performShortcut(i7, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(r rVar, KeyEvent keyEvent) {
        k1 k1Var;
        k1 k1Var2;
        Resources.Theme theme;
        k1 k1Var3;
        k1 k1Var4;
        if (!this.Z) {
            boolean z9 = rVar.k;
            int i7 = rVar.a;
            if (z9) {
                return true;
            }
            r rVar2 = this.V;
            if (rVar2 != null && rVar2 != rVar) {
                h(rVar2, false);
            }
            Window.Callback callback = this.f.getCallback();
            if (callback != null) {
                rVar.g = callback.onCreatePanelView(i7);
            }
            boolean z10 = i7 == 0 || i7 == 108;
            if (z10 && (k1Var4 = this.s) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var4;
                actionBarOverlayLayout.e();
                ((m3) actionBarOverlayLayout.e).l = true;
            }
            if (rVar.g == null) {
                l.k kVar = rVar.h;
                if (kVar == null || rVar.o) {
                    if (kVar == null) {
                        Context context = this.e;
                        if ((i7 == 0 || i7 == 108) && this.s != null) {
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
                    if (z10 && (k1Var2 = this.s) != null) {
                        if (this.w == null) {
                            this.w = new cb.c(this, 28);
                        }
                        ((ActionBarOverlayLayout) k1Var2).f(rVar.h, this.w);
                    }
                    rVar.h.w();
                    if (callback.onCreatePanelMenu(i7, rVar.h)) {
                        rVar.o = false;
                    } else {
                        l.k kVar4 = rVar.h;
                        if (kVar4 != null) {
                            if (kVar4 != null) {
                                kVar4.r(rVar.i);
                            }
                            rVar.h = null;
                        }
                        if (z10 && (k1Var = this.s) != null) {
                            ((ActionBarOverlayLayout) k1Var).f(null, this.w);
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
                    if (z10 && (k1Var3 = this.s) != null) {
                        ((ActionBarOverlayLayout) k1Var3).f(null, this.w);
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

    public final void v() {
        if (this.I) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void w() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z9 = false;
            if (this.o0 != null && (o(0).m || this.y != null)) {
                z9 = true;
            }
            if (z9 && this.p0 == null) {
                this.p0 = m.b(this.o0, this);
            } else {
                if (z9 || (onBackInvokedCallback = this.p0) == null) {
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
