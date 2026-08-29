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
import h7.m7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lh.d5;
import m.l1;
import m.o3;
import org.telegram.messenger.BuildConfig;
import r0.b0;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a0 extends m7 implements m.c {
    public static final AccelerateInterpolator x = new AccelerateInterpolator();
    public static final DecelerateInterpolator y = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public l1 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public z i;
    public z j;
    public ze.b k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public k.j s;
    public boolean t;
    public final y u;
    public final y v;
    public final za.c w;

    public a0(Activity activity, boolean z10) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new y(this, 0);
        this.v = new y(this, 1);
        this.w = new za.c(this, 16);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z10) {
        m0 i10;
        m0 m0Var;
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
        WeakHashMap weakHashMap = j0.a;
        if (!actionBarContainer.isLaidOut()) {
            if (z10) {
                ((o3) this.e).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((o3) this.e).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            o3 o3Var = (o3) this.e;
            i10 = j0.a(o3Var.a);
            i10.a(0.0f);
            i10.c(100L);
            i10.d(new k.i(o3Var, 4));
            m0Var = this.f.i(0, 200L);
        } else {
            o3 o3Var2 = (o3) this.e;
            m0 a2 = j0.a(o3Var2.a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new k.i(o3Var2, 0));
            i10 = this.f.i(8, 100L);
            m0Var = a2;
        }
        k.j jVar = new k.j();
        ArrayList arrayList = (ArrayList) jVar.c;
        arrayList.add(i10);
        View view = (View) i10.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) m0Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(m0Var);
        jVar.b();
    }

    public final void b(View view) {
        l1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(org.telegram.messenger.beta.R.id.action_bar);
        if (findViewById instanceof l1) {
            wrapper = (l1) findViewById;
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
        l1 l1Var = this.e;
        if (l1Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(a0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((o3) l1Var).a.getContext();
        this.a = context;
        if ((((o3) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        if (context.getResources().getBoolean(org.telegram.messenger.beta.R.bool.abc_action_bar_embed_tabs)) {
            this.d.setTabContainer(null);
            ((o3) this.e).getClass();
        } else {
            ((o3) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((o3) this.e).a.setCollapsible(false);
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
            WeakHashMap weakHashMap = j0.a;
            b0.i(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void c(boolean z10) {
        if (this.h) {
            return;
        }
        int i10 = z10 ? 4 : 0;
        o3 o3Var = (o3) this.e;
        int i11 = o3Var.b;
        this.h = true;
        o3Var.a((i10 & 4) | (i11 & (-5)));
    }

    public final void d(boolean z10) {
        boolean z11 = this.p;
        boolean z12 = this.q;
        za.c cVar = this.w;
        View view = this.g;
        if (!z12 && z11) {
            if (this.r) {
                this.r = false;
                k.j jVar = this.s;
                if (jVar != null) {
                    jVar.a();
                }
                int i10 = this.n;
                y yVar = this.u;
                if (i10 != 0 || !z10) {
                    yVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                k.j jVar2 = new k.j();
                ArrayList arrayList = (ArrayList) jVar2.c;
                float f9 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f9 -= r12[1];
                }
                m0 a2 = j0.a(this.d);
                a2.e(f9);
                View view2 = (View) a2.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new d5(cVar, view2) : null);
                }
                if (!jVar2.b) {
                    arrayList.add(a2);
                }
                if (this.o && view != null) {
                    m0 a10 = j0.a(view);
                    a10.e(f9);
                    if (!jVar2.b) {
                        arrayList.add(a10);
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
                    jVar2.e = yVar;
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
        y yVar2 = this.v;
        if (i11 == 0 && z10) {
            this.d.setTranslationY(0.0f);
            float f10 = -this.d.getHeight();
            if (z10) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f10 -= r12[1];
            }
            this.d.setTranslationY(f10);
            k.j jVar4 = new k.j();
            ArrayList arrayList2 = (ArrayList) jVar4.c;
            m0 a11 = j0.a(this.d);
            a11.e(0.0f);
            View view3 = (View) a11.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new d5(cVar, view3) : null);
            }
            if (!jVar4.b) {
                arrayList2.add(a11);
            }
            if (this.o && view != null) {
                view.setTranslationY(f10);
                m0 a12 = j0.a(view);
                a12.e(0.0f);
                if (!jVar4.b) {
                    arrayList2.add(a12);
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
                jVar4.e = yVar2;
            }
            this.s = jVar4;
            jVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            yVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = j0.a;
            r0.z.c(actionBarOverlayLayout);
        }
    }

    public a0(s sVar) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new y(this, 0);
        this.v = new y(this, 1);
        this.w = new za.c(this, 16);
        b(sVar.getWindow().getDecorView());
    }
}
