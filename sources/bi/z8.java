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
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z8 extends org.telegram.ui.ActionBar.h2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8(Object obj, int i7) {
        super(null);
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.h2
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
                j90 j90Var = (j90) this.b;
                kVar.setTitle(gd.M0(j90Var.a ? 2131744201 : 2131748443, null));
                org.telegram.ui.ActionBar.r0 a10 = this.actionBar.t().a(0, R.drawable.outline_header_search);
                a10.O();
                a10.I = new s1(this, 17);
                a10.setSearchFieldHint(gd.M0(2131745641, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.h2 h2Var = j90Var.g;
                if (j90Var.m == null) {
                    FrameLayout frameLayout = new FrameLayout(h2Var.getParentActivity());
                    j90Var.m = frameLayout;
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, frameLayout, h2Var.getResourceProvider());
                    wz b10 = j90Var.b();
                    j90Var.q = b10;
                    j90Var.m.addView(b10, -1, -1);
                    kv0 c10 = j90Var.c();
                    j90Var.o = c10;
                    j90Var.m.addView(c10, -1, -1);
                    kv0 a11 = j90Var.a();
                    j90Var.n = a11;
                    j90Var.m.addView(a11, ma.c(-1.0f, -1));
                    h2Var.getParentActivity();
                    v4.c0 c0Var = new v4.c0();
                    ck0 ck0Var = new ck0(h2Var.getParentActivity(), null);
                    j90Var.p = ck0Var;
                    ck0Var.setAdapter(j90Var.f);
                    j90Var.p.r1();
                    j90Var.p.setLayoutManager(c0Var);
                    j90Var.p.setOnItemClickListener(new i8(j90Var, 25));
                    j90Var.p.setOnScrollListener(j90Var.D);
                    org.telegram.ui.ActionBar.u6.J(j90Var.p, org.telegram.ui.ActionBar.n6.i6, h2Var.getResourceProvider());
                    j90Var.m.addView(j90Var.p, -1, -1);
                    v4.k kVar2 = new v4.k();
                    kVar2.n(350L);
                    kVar2.o(lr.h);
                    kVar2.C = false;
                    kVar2.m = false;
                    j90Var.p.setItemAnimator(kVar2);
                }
                FrameLayout frameLayout2 = j90Var.m;
                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                ck0 ck0Var2 = j90Var.p;
                kVar3.getClass();
                kVar3.F(ck0Var2, org.telegram.ui.ActionBar.n6.a7, org.telegram.ui.ActionBar.n6.s8);
                j90Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
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
                return ((hi.l5) this.b).getContext();
            case 6:
                return ((ut) this.b).a.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
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
                return ((jx) this.b).H.d1;
            case 12:
                return this.currentAccount;
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public View getFragmentView() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 7:
                bv bvVar = ((xu) obj).y;
                Pattern pattern = bv.Q1;
                return bvVar.b;
            case 8:
                return ((jx) obj).H.r;
            case 12:
                return ((ug.i1) obj).b;
            default:
                return super.getFragmentView();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public FrameLayout getLayoutContainer() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 7:
                bv bvVar = ((xu) obj).y;
                Pattern pattern = bv.Q1;
                return (FrameLayout) bvVar.b;
            case 8:
                return ((jx) obj).H.r;
            case 12:
                return ((ug.i1) obj).I2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                a9 a9Var = (a9) this.b;
                Activity ownerActivity = a9Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.H1;
                }
                return ownerActivity == null ? org.telegram.messenger.g0.W(a9Var.getContext()) : ownerActivity;
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
                return org.telegram.messenger.g0.W(((hi.l5) this.b).getContext());
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
                org.telegram.ui.ActionBar.h2 h2Var = ((ug.i1) this.b).p2;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getParentActivity();
            case 13:
                return ((org.telegram.ui.ActionBar.h2) this.b).getParentActivity();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public org.telegram.ui.ActionBar.i6 getResourceProvider() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                return ((a9) obj).J0;
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
                return new fi.g2(5, ((hi.z4) obj).J0);
            case 5:
                return ((hi.l5) obj).q1;
            case 7:
                bv bvVar = ((xu) obj).y;
                Pattern pattern = bv.Q1;
                return bvVar.J0;
            case 8:
                return ((jx) obj).H.a2;
            case 11:
                return new fi.g2(9, ((org.telegram.ui.web.v0) obj).e);
            case 13:
                return new hi.d5(2, new fi.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 6:
                return new tt(this, ((ut) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
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

    @Override // org.telegram.ui.ActionBar.h2
    public boolean onBackPressed(boolean z10) {
        switch (this.a) {
            case 10:
                zh.k kVar = ((j90) this.b).s;
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

    @Override // org.telegram.ui.ActionBar.h2
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.a) {
            case 9:
                if (z10 && z11) {
                    ((yb0) this.b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public boolean presentFragment(org.telegram.ui.ActionBar.h2 h2Var) {
        switch (this.a) {
            case 2:
                f9 f9Var = ((fi.z3) this.b).t0;
                if (f9Var == null) {
                    return true;
                }
                f9Var.N(h2Var);
                return true;
            case 5:
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2();
                f2Var.a = true;
                Q.showAsSheet(h2Var, f2Var);
                return true;
            case 13:
                return false;
            default:
                return super.presentFragment(h2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
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
    public z8(long j3) {
        super(null);
        this.a = 10;
        this.b = new j90(this, this, getLayoutContainer(), j3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(org.telegram.ui.ActionBar.h2 h2Var) {
        super(null);
        this.a = 13;
        this.b = h2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(hi.z4 z4Var) {
        super(null);
        this.a = 4;
        this.b = z4Var;
        this.currentAccount = z4Var.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(org.telegram.ui.web.v0 v0Var) {
        super(null);
        this.a = 11;
        this.b = v0Var;
        this.currentAccount = v0Var.N;
    }
}
