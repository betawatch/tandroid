package g;

import ah.l0;
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
import m.m3;
import org.telegram.messenger.BuildConfig;
import r0.b0;
import r0.j0;
import r0.m0;
import v7.i7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class a0 extends i7 implements m.b {
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
    public z i;
    public z j;
    public n4.s k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public cc.d s;
    public boolean t;
    public final y u;
    public final y v;
    public final k6.h w;

    public a0(Activity activity, boolean z10) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new y(this, 0);
        this.v = new y(this, 1);
        this.w = new k6.h(this, 23);
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
                ((m3) this.e).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((m3) this.e).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            m3 m3Var = (m3) this.e;
            i10 = j0.a(m3Var.a);
            i10.a(0.0f);
            i10.c(100L);
            i10.d(new k.i(m3Var, 4));
            m0Var = this.f.i(0, 200L);
        } else {
            m3 m3Var2 = (m3) this.e;
            m0 a2 = j0.a(m3Var2.a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new k.i(m3Var2, 0));
            i10 = this.f.i(8, 100L);
            m0Var = a2;
        }
        cc.d dVar = new cc.d();
        ArrayList arrayList = (ArrayList) dVar.c;
        arrayList.add(i10);
        View view = (View) i10.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) m0Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(m0Var);
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
            throw new IllegalStateException(a0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((m3) k1Var).a.getContext();
        this.a = context;
        if ((((m3) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        if (context.getResources().getBoolean(org.telegram.messenger.beta.R.bool.abc_action_bar_embed_tabs)) {
            this.d.setTabContainer(null);
            ((m3) this.e).getClass();
        } else {
            ((m3) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((m3) this.e).a.setCollapsible(false);
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
            b0.h(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void c(boolean z10) {
        if (this.h) {
            return;
        }
        int i10 = z10 ? 4 : 0;
        m3 m3Var = (m3) this.e;
        int i11 = m3Var.b;
        this.h = true;
        m3Var.a((i10 & 4) | (i11 & (-5)));
    }

    public final void d(boolean z10) {
        boolean z11 = this.p;
        boolean z12 = this.q;
        int i10 = 27;
        k6.h hVar = this.w;
        View view = this.g;
        if (!z12 && z11) {
            if (this.r) {
                this.r = false;
                cc.d dVar = this.s;
                if (dVar != null) {
                    dVar.a();
                }
                int i11 = this.n;
                y yVar = this.u;
                if (i11 != 0 || !z10) {
                    yVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                cc.d dVar2 = new cc.d();
                ArrayList arrayList = (ArrayList) dVar2.c;
                float f7 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f7 -= r13[1];
                }
                m0 a2 = j0.a(this.d);
                a2.e(f7);
                View view2 = (View) a2.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(hVar != null ? new l0(i10, hVar, view2) : null);
                }
                if (!dVar2.b) {
                    arrayList.add(a2);
                }
                if (this.o && view != null) {
                    m0 a10 = j0.a(view);
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
                    dVar2.e = yVar;
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
        cc.d dVar3 = this.s;
        if (dVar3 != null) {
            dVar3.a();
        }
        this.d.setVisibility(0);
        int i12 = this.n;
        y yVar2 = this.v;
        if (i12 == 0 && z10) {
            this.d.setTranslationY(0.0f);
            float f10 = -this.d.getHeight();
            if (z10) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f10 -= r13[1];
            }
            this.d.setTranslationY(f10);
            cc.d dVar4 = new cc.d();
            ArrayList arrayList2 = (ArrayList) dVar4.c;
            m0 a11 = j0.a(this.d);
            a11.e(0.0f);
            View view3 = (View) a11.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(hVar != null ? new l0(i10, hVar, view3) : null);
            }
            if (!dVar4.b) {
                arrayList2.add(a11);
            }
            if (this.o && view != null) {
                view.setTranslationY(f10);
                m0 a12 = j0.a(view);
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
                dVar4.e = yVar2;
            }
            this.s = dVar4;
            dVar4.b();
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

    public a0(t tVar) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new y(this, 0);
        this.v = new y(this, 1);
        this.w = new k6.h(this, 23);
        b(tVar.getWindow().getDecorView());
    }
}
