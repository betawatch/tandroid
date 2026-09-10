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
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.k1;
import m.n3;
import org.telegram.messenger.BuildConfig;
import r0.i0;
import r0.l0;
import v7.k7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c0 extends k7 implements m.b {
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
    public b0 i;
    public b0 j;
    public of.b k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public bc.d s;
    public boolean t;
    public final a0 u;
    public final a0 v;
    public final a6.i w;

    public c0(Activity activity, boolean z10) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new a0(this, 0);
        this.v = new a0(this, 1);
        this.w = new a6.i(this, 19);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z10) {
        l0 i10;
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
                ((n3) this.e).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((n3) this.e).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            n3 n3Var = (n3) this.e;
            i10 = i0.a(n3Var.a);
            i10.a(0.0f);
            i10.c(100L);
            i10.d(new k.i(n3Var, 4));
            l0Var = this.f.i(0, 200L);
        } else {
            n3 n3Var2 = (n3) this.e;
            l0 a2 = i0.a(n3Var2.a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new k.i(n3Var2, 0));
            i10 = this.f.i(8, 100L);
            l0Var = a2;
        }
        bc.d dVar = new bc.d();
        ArrayList arrayList = (ArrayList) dVar.c;
        arrayList.add(i10);
        View view = (View) i10.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) l0Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(l0Var);
        dVar.b();
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
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : BuildConfig.BETA_URL));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(org.telegram.messenger.beta.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(org.telegram.messenger.beta.R.id.action_bar_container);
        this.d = actionBarContainer;
        k1 k1Var = this.e;
        if (k1Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(c0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((n3) k1Var).a.getContext();
        this.a = context;
        if ((((n3) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        if (context.getResources().getBoolean(org.telegram.messenger.beta.R.bool.abc_action_bar_embed_tabs)) {
            this.d.setTabContainer(null);
            ((n3) this.e).getClass();
        } else {
            ((n3) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((n3) this.e).a.setCollapsible(false);
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
            r0.a0.i(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void c(boolean z10) {
        if (this.h) {
            return;
        }
        int i10 = z10 ? 4 : 0;
        n3 n3Var = (n3) this.e;
        int i11 = n3Var.b;
        this.h = true;
        n3Var.a((i10 & 4) | (i11 & (-5)));
    }

    public final void d(boolean z10) {
        boolean z11 = this.p;
        boolean z12 = this.q;
        a6.i iVar = this.w;
        View view = this.g;
        if (!z12 && z11) {
            if (this.r) {
                this.r = false;
                bc.d dVar = this.s;
                if (dVar != null) {
                    dVar.a();
                }
                int i10 = this.n;
                a0 a0Var = this.u;
                if (i10 != 0 || !z10) {
                    a0Var.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                bc.d dVar2 = new bc.d();
                ArrayList arrayList = (ArrayList) dVar2.c;
                float f7 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f7 -= r12[1];
                }
                l0 a2 = i0.a(this.d);
                a2.e(f7);
                View view2 = (View) a2.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(iVar != null ? new qg.o(iVar, view2) : null);
                }
                if (!dVar2.b) {
                    arrayList.add(a2);
                }
                if (this.o && view != null) {
                    l0 a10 = i0.a(view);
                    a10.e(f7);
                    if (!dVar2.b) {
                        arrayList.add(a10);
                    }
                }
                boolean z13 = dVar2.b;
                if (!z13) {
                    dVar2.d = x;
                }
                if (!z13) {
                    dVar2.a = 250L;
                }
                if (!z13) {
                    dVar2.e = a0Var;
                }
                this.s = dVar2;
                dVar2.b();
                return;
            }
            return;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        bc.d dVar3 = this.s;
        if (dVar3 != null) {
            dVar3.a();
        }
        this.d.setVisibility(0);
        int i11 = this.n;
        a0 a0Var2 = this.v;
        if (i11 == 0 && z10) {
            this.d.setTranslationY(0.0f);
            float f10 = -this.d.getHeight();
            if (z10) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f10 -= r12[1];
            }
            this.d.setTranslationY(f10);
            bc.d dVar4 = new bc.d();
            ArrayList arrayList2 = (ArrayList) dVar4.c;
            l0 a11 = i0.a(this.d);
            a11.e(0.0f);
            View view3 = (View) a11.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(iVar != null ? new qg.o(iVar, view3) : null);
            }
            if (!dVar4.b) {
                arrayList2.add(a11);
            }
            if (this.o && view != null) {
                view.setTranslationY(f10);
                l0 a12 = i0.a(view);
                a12.e(0.0f);
                if (!dVar4.b) {
                    arrayList2.add(a12);
                }
            }
            boolean z14 = dVar4.b;
            if (!z14) {
                dVar4.d = y;
            }
            if (!z14) {
                dVar4.a = 250L;
            }
            if (!z14) {
                dVar4.e = a0Var2;
            }
            this.s = dVar4;
            dVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            a0Var2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = i0.a;
            r0.y.c(actionBarOverlayLayout);
        }
    }

    public c0(u uVar) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new a0(this, 0);
        this.v = new a0(this, 1);
        this.w = new a6.i(this, 19);
        b(uVar.getWindow().getDecorView());
    }
}
