package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import fi.f9;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dv;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class c9 extends org.telegram.ui.ActionBar.g2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9(Object obj, int i7) {
        super(null);
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public View createView(Context context) {
        switch (this.a) {
            case 9:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            case 10:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new dv(this, 19));
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                l90 l90Var = (l90) this.b;
                kVar.setTitle(gd.N0(l90Var.a ? 2131744195 : 2131748442, null));
                org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, R.drawable.outline_header_search);
                a10.O();
                a10.I = new w1(this, 17);
                a10.setSearchFieldHint(gd.N0(2131745640, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.g2 g2Var = l90Var.g;
                if (l90Var.m == null) {
                    FrameLayout frameLayout = new FrameLayout(g2Var.getParentActivity());
                    l90Var.m = frameLayout;
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, frameLayout, g2Var.getResourceProvider());
                    yz b10 = l90Var.b();
                    l90Var.q = b10;
                    l90Var.m.addView(b10, -1, -1);
                    nv0 c10 = l90Var.c();
                    l90Var.o = c10;
                    l90Var.m.addView(c10, -1, -1);
                    nv0 a11 = l90Var.a();
                    l90Var.n = a11;
                    l90Var.m.addView(a11, ma.c(-1.0f, -1));
                    g2Var.getParentActivity();
                    v4.c0 c0Var = new v4.c0();
                    ek0 ek0Var = new ek0(g2Var.getParentActivity(), null);
                    l90Var.p = ek0Var;
                    ek0Var.setAdapter(l90Var.f);
                    l90Var.p.r1();
                    l90Var.p.setLayoutManager(c0Var);
                    l90Var.p.setOnItemClickListener(new l8(l90Var, 25));
                    l90Var.p.setOnScrollListener(l90Var.D);
                    org.telegram.ui.ActionBar.t6.J(l90Var.p, org.telegram.ui.ActionBar.m6.i6, g2Var.getResourceProvider());
                    l90Var.m.addView(l90Var.p, -1, -1);
                    v4.k kVar2 = new v4.k();
                    kVar2.n(350L);
                    kVar2.o(nr.h);
                    kVar2.C = false;
                    kVar2.m = false;
                    l90Var.p.setItemAnimator(kVar2);
                }
                FrameLayout frameLayout2 = l90Var.m;
                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                ek0 ek0Var2 = l90Var.p;
                kVar3.getClass();
                kVar3.E(ek0Var2, org.telegram.ui.ActionBar.m6.a7, org.telegram.ui.ActionBar.m6.s8);
                l90Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public Context getContext() {
        switch (this.a) {
            case 1:
                return ((di.f6) this.b).getContext();
            case 2:
            case 4:
            default:
                return super.getContext();
            case 3:
                return ((fi.k4) this.b).b.getContext();
            case 5:
                return ((hi.k5) this.b).getContext();
            case 6:
                return ((wt) this.b).a.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public int getCurrentAccount() {
        switch (this.a) {
            case 1:
                return this.currentAccount;
            case 2:
            case 4:
            case 9:
            case 10:
            case 11:
            default:
                return super.getCurrentAccount();
            case 3:
                return this.currentAccount;
            case 5:
                return this.currentAccount;
            case 6:
                return this.currentAccount;
            case 7:
                return this.currentAccount;
            case 8:
                return ((lx) this.b).H.d1;
            case 12:
                return this.currentAccount;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public View getFragmentView() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 7:
                ev evVar = ((av) obj).y;
                Pattern pattern = ev.Q1;
                return evVar.b;
            case 8:
                return ((lx) obj).H.r;
            case 12:
                return ((ug.h1) obj).b;
            default:
                return super.getFragmentView();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public FrameLayout getLayoutContainer() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 7:
                ev evVar = ((av) obj).y;
                Pattern pattern = ev.Q1;
                return (FrameLayout) evVar.b;
            case 8:
                return ((lx) obj).H.r;
            case 12:
                return ((ug.h1) obj).I2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                d9 d9Var = (d9) this.b;
                Activity ownerActivity = d9Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.H1;
                }
                return ownerActivity == null ? org.telegram.messenger.g0.W(d9Var.getContext()) : ownerActivity;
            case 1:
                for (Context context = ((di.f6) this.b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 2:
                Activity W = org.telegram.messenger.g0.W(((fi.z3) this.b).getContext());
                return W == null ? LaunchActivity.H1 : W;
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return super.getParentActivity();
            case 4:
                return LaunchActivity.H1;
            case 5:
                return org.telegram.messenger.g0.W(((hi.k5) this.b).getContext());
            case 6:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 11:
                return ((org.telegram.ui.web.v0) this.b).a0;
            case 12:
                org.telegram.ui.ActionBar.g2 g2Var = ((ug.h1) this.b).p2;
                if (g2Var == null) {
                    return null;
                }
                return g2Var.getParentActivity();
            case 13:
                return ((org.telegram.ui.ActionBar.g2) this.b).getParentActivity();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public org.telegram.ui.ActionBar.h6 getResourceProvider() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                return ((d9) obj).J0;
            case 1:
            case 6:
            case 9:
            case 10:
            case 12:
            default:
                return super.getResourceProvider();
            case 2:
                return new fi.g2(0, ((fi.z3) obj).l0);
            case 3:
                return ((fi.k4) obj).b.s;
            case 4:
                return new fi.g2(5, ((hi.y4) obj).J0);
            case 5:
                return ((hi.k5) obj).q1;
            case 7:
                ev evVar = ((av) obj).y;
                Pattern pattern = ev.Q1;
                return evVar.J0;
            case 8:
                return ((lx) obj).H.a2;
            case 11:
                return new fi.g2(9, ((org.telegram.ui.web.v0) obj).e);
            case 13:
                return new hi.c5(2, new fi.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 6:
                return new vt(this, ((wt) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public boolean isLightStatusBar() {
        switch (this.a) {
            case 2:
                return false;
            case 4:
                return false;
            case 11:
                return false;
            case 13:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public boolean onBackPressed(boolean z10) {
        switch (this.a) {
            case 10:
                zh.k kVar = ((l90) this.b).s;
                if (kVar == null) {
                    return true;
                }
                if (!z10) {
                    return false;
                }
                kVar.e(false);
                return false;
            default:
                return super.onBackPressed(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.a) {
            case 9:
                if (z10 && z11) {
                    ((zb0) this.b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public boolean presentFragment(org.telegram.ui.ActionBar.g2 g2Var) {
        switch (this.a) {
            case 2:
                f9 f9Var = ((fi.z3) this.b).t0;
                if (f9Var == null) {
                    return true;
                }
                f9Var.N(g2Var);
                return true;
            case 5:
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                e2Var.a = true;
                Q.showAsSheet(g2Var, e2Var);
                return true;
            case 13:
                return false;
            default:
                return super.presentFragment(g2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 1:
                dialog.show();
                return dialog;
            case 2:
                f9 f9Var = ((fi.z3) this.b).t0;
                if (f9Var != null) {
                    f9Var.t(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 4:
                dialog.show();
                return dialog;
            case 11:
                dialog.show();
                return dialog;
            case 12:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(long j3) {
        super(null);
        this.a = 10;
        this.b = new l90(this, this, getLayoutContainer(), j3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(org.telegram.ui.ActionBar.g2 g2Var) {
        super(null);
        this.a = 13;
        this.b = g2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(hi.y4 y4Var) {
        super(null);
        this.a = 4;
        this.b = y4Var;
        this.currentAccount = y4Var.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(org.telegram.ui.web.v0 v0Var) {
        super(null);
        this.a = 11;
        this.b = v0Var;
        this.currentAccount = v0Var.N;
    }
}
