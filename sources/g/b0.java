package g;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import b8.fc;
import ci.uc;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.k1;
import m.k3;
import r0.i0;
import r0.l0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 extends fc implements m.b {
    public static final AccelerateInterpolator x = new AccelerateInterpolator();
    public static final DecelerateInterpolator y = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public k1 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public a0 i;
    public a0 j;
    public tf.b k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public k.j s;
    public boolean t;
    public final z u;
    public final z v;
    public final bb.c w;

    public b0(Activity activity, boolean z10) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new z(this, 0);
        this.v = new z(this, 1);
        this.w = new bb.c(this, 26);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z10) {
        l0 i3;
        l0 l0Var;
        if (z10) {
            if (!this.q) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.q) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = i0.a;
        if (!actionBarContainer.isLaidOut()) {
            if (z10) {
                ((k3) this.e).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((k3) this.e).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            k3 k3Var = (k3) this.e;
            i3 = i0.a(k3Var.a);
            i3.a(0.0f);
            i3.c(100L);
            i3.d(new k.i(k3Var, 4));
            l0Var = this.f.i(0, 200L);
        } else {
            k3 k3Var2 = (k3) this.e;
            l0 a10 = i0.a(k3Var2.a);
            a10.a(1.0f);
            a10.c(200L);
            a10.d(new k.i(k3Var2, 0));
            i3 = this.f.i(8, 100L);
            l0Var = a10;
        }
        k.j jVar = new k.j();
        ArrayList arrayList = (ArrayList) jVar.c;
        arrayList.add(i3);
        View view = (View) i3.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) l0Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(l0Var);
        jVar.b();
    }

    public final void b(View view) {
        k1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(org.telegram.messenger.beta.R.id.action_bar);
        if (findViewById instanceof k1) {
            wrapper = (k1) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(org.telegram.messenger.beta.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(org.telegram.messenger.beta.R.id.action_bar_container);
        this.d = actionBarContainer;
        k1 k1Var = this.e;
        if (k1Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(b0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((k3) k1Var).a.getContext();
        this.a = context;
        if ((((k3) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i3 = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        if (context.getResources().getBoolean(org.telegram.messenger.beta.R.bool.abc_action_bar_embed_tabs)) {
            this.d.setTabContainer(null);
            ((k3) this.e).getClass();
        } else {
            ((k3) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((k3) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, f.a.a, org.telegram.messenger.beta.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.n) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.t = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = i0.a;
            r0.a0.h(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void c(boolean z10) {
        if (this.h) {
            return;
        }
        int i3 = z10 ? 4 : 0;
        k3 k3Var = (k3) this.e;
        int i10 = k3Var.b;
        this.h = true;
        k3Var.a((i3 & 4) | (i10 & (-5)));
    }

    public final void d(boolean z10) {
        boolean z11 = this.p;
        boolean z12 = this.q;
        int i3 = 26;
        bb.c cVar = this.w;
        View view = this.g;
        if (!z12 && z11) {
            if (this.r) {
                this.r = false;
                k.j jVar = this.s;
                if (jVar != null) {
                    jVar.a();
                }
                int i10 = this.n;
                z zVar = this.u;
                if (i10 != 0 || !z10) {
                    zVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                k.j jVar2 = new k.j();
                ArrayList arrayList = (ArrayList) jVar2.c;
                float f10 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f10 -= r13[1];
                }
                l0 a10 = i0.a(this.d);
                a10.e(f10);
                View view2 = (View) a10.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new uc(i3, cVar, view2) : null);
                }
                if (!jVar2.b) {
                    arrayList.add(a10);
                }
                if (this.o && view != null) {
                    l0 a11 = i0.a(view);
                    a11.e(f10);
                    if (!jVar2.b) {
                        arrayList.add(a11);
                    }
                }
                boolean z13 = jVar2.b;
                if (!z13) {
                    jVar2.d = x;
                }
                if (!z13) {
                    jVar2.a = 250L;
                }
                if (!z13) {
                    jVar2.e = zVar;
                }
                this.s = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        k.j jVar3 = this.s;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.d.setVisibility(0);
        int i11 = this.n;
        z zVar2 = this.v;
        if (i11 == 0 && z10) {
            this.d.setTranslationY(0.0f);
            float f11 = -this.d.getHeight();
            if (z10) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f11 -= r13[1];
            }
            this.d.setTranslationY(f11);
            k.j jVar4 = new k.j();
            ArrayList arrayList2 = (ArrayList) jVar4.c;
            l0 a12 = i0.a(this.d);
            a12.e(0.0f);
            View view3 = (View) a12.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new uc(i3, cVar, view3) : null);
            }
            if (!jVar4.b) {
                arrayList2.add(a12);
            }
            if (this.o && view != null) {
                view.setTranslationY(f11);
                l0 a13 = i0.a(view);
                a13.e(0.0f);
                if (!jVar4.b) {
                    arrayList2.add(a13);
                }
            }
            boolean z14 = jVar4.b;
            if (!z14) {
                jVar4.d = y;
            }
            if (!z14) {
                jVar4.a = 250L;
            }
            if (!z14) {
                jVar4.e = zVar2;
            }
            this.s = jVar4;
            jVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            zVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = i0.a;
            r0.y.c(actionBarOverlayLayout);
        }
    }

    public b0(u uVar) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new z(this, 0);
        this.v = new z(this, 1);
        this.w = new bb.c(this, 26);
        b(uVar.getWindow().getDecorView());
    }
}
