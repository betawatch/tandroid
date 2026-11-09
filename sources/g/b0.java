package g;

import a8.ca;
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
import bi.de;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.l1;
import m.m3;
import r0.i0;
import r0.l0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class b0 extends ca implements m.c {
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
    public a0 i;
    public a0 j;
    public q4.q k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public ac.d s;
    public boolean t;
    public final z u;
    public final z v;
    public final aa.n w;

    public b0(Activity activity, boolean z9) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new z(this, 0);
        this.v = new z(this, 1);
        this.w = new aa.n(this, 25);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z9) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z9) {
        l0 i7;
        l0 l0Var;
        if (z9) {
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
            if (z9) {
                ((m3) this.e).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((m3) this.e).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z9) {
            m3 m3Var = (m3) this.e;
            i7 = i0.a(m3Var.a);
            i7.a(0.0f);
            i7.c(100L);
            i7.d(new k.i(m3Var, 4));
            l0Var = this.f.i(0, 200L);
        } else {
            m3 m3Var2 = (m3) this.e;
            l0 a10 = i0.a(m3Var2.a);
            a10.a(1.0f);
            a10.c(200L);
            a10.d(new k.i(m3Var2, 0));
            i7 = this.f.i(8, 100L);
            l0Var = a10;
        }
        ac.d dVar = new ac.d();
        ArrayList arrayList = (ArrayList) dVar.c;
        arrayList.add(i7);
        View view = (View) i7.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) l0Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(l0Var);
        dVar.b();
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
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(org.telegram.messenger.beta.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(org.telegram.messenger.beta.R.id.action_bar_container);
        this.d = actionBarContainer;
        l1 l1Var = this.e;
        if (l1Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(b0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((m3) l1Var).a.getContext();
        this.a = context;
        if ((((m3) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i7 = context.getApplicationInfo().targetSdkVersion;
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
            WeakHashMap weakHashMap = i0.a;
            r0.a0.h(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void c(boolean z9) {
        if (this.h) {
            return;
        }
        int i7 = z9 ? 4 : 0;
        m3 m3Var = (m3) this.e;
        int i10 = m3Var.b;
        this.h = true;
        m3Var.a((i7 & 4) | (i10 & (-5)));
    }

    public final void d(boolean z9) {
        boolean z10 = this.p;
        boolean z11 = this.q;
        int i7 = 27;
        aa.n nVar = this.w;
        View view = this.g;
        if (!z11 && z10) {
            if (this.r) {
                this.r = false;
                ac.d dVar = this.s;
                if (dVar != null) {
                    dVar.a();
                }
                int i10 = this.n;
                z zVar = this.u;
                if (i10 != 0 || !z9) {
                    zVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                ac.d dVar2 = new ac.d();
                ArrayList arrayList = (ArrayList) dVar2.c;
                float f10 = -this.d.getHeight();
                if (z9) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f10 -= r13[1];
                }
                l0 a10 = i0.a(this.d);
                a10.e(f10);
                View view2 = (View) a10.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(nVar != null ? new de(i7, nVar, view2) : null);
                }
                if (!dVar2.b) {
                    arrayList.add(a10);
                }
                if (this.o && view != null) {
                    l0 a11 = i0.a(view);
                    a11.e(f10);
                    if (!dVar2.b) {
                        arrayList.add(a11);
                    }
                }
                boolean z12 = dVar2.b;
                if (!z12) {
                    dVar2.d = x;
                }
                if (!z12) {
                    dVar2.a = 250L;
                }
                if (!z12) {
                    dVar2.e = zVar;
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
        ac.d dVar3 = this.s;
        if (dVar3 != null) {
            dVar3.a();
        }
        this.d.setVisibility(0);
        int i11 = this.n;
        z zVar2 = this.v;
        if (i11 == 0 && z9) {
            this.d.setTranslationY(0.0f);
            float f11 = -this.d.getHeight();
            if (z9) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f11 -= r13[1];
            }
            this.d.setTranslationY(f11);
            ac.d dVar4 = new ac.d();
            ArrayList arrayList2 = (ArrayList) dVar4.c;
            l0 a12 = i0.a(this.d);
            a12.e(0.0f);
            View view3 = (View) a12.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(nVar != null ? new de(i7, nVar, view3) : null);
            }
            if (!dVar4.b) {
                arrayList2.add(a12);
            }
            if (this.o && view != null) {
                view.setTranslationY(f11);
                l0 a13 = i0.a(view);
                a13.e(0.0f);
                if (!dVar4.b) {
                    arrayList2.add(a13);
                }
            }
            boolean z13 = dVar4.b;
            if (!z13) {
                dVar4.d = y;
            }
            if (!z13) {
                dVar4.a = 250L;
            }
            if (!z13) {
                dVar4.e = zVar2;
            }
            this.s = dVar4;
            dVar4.b();
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
        this.w = new aa.n(this, 25);
        b(uVar.getWindow().getDecorView());
    }
}
