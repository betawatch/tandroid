package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xw;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ux;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class w4 extends org.telegram.ui.ActionBar.f2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4(Object obj, int i7) {
        super(null);
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public View createView(Context context) {
        switch (this.a) {
            case 8:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            case 9:
                this.actionBar.setAllowOverlayTitle(true);
                int i7 = 16;
                this.actionBar.setActionBarMenuOnItemClick(new ux(this, i7));
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                w80 w80Var = (w80) this.b;
                kVar.setTitle(org.telegram.messenger.hd.M0(w80Var.a ? 2131744437 : 2131748634, null));
                org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, R.drawable.outline_header_search);
                a10.N();
                a10.H = new kg.v1(this, i7);
                a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.f2 f2Var = w80Var.g;
                if (w80Var.m == null) {
                    FrameLayout frameLayout = new FrameLayout(f2Var.getParentActivity());
                    w80Var.m = frameLayout;
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, f2Var.getResourceProvider());
                    lz b10 = w80Var.b();
                    w80Var.q = b10;
                    w80Var.m.addView(b10, -1, -1);
                    av0 c10 = w80Var.c();
                    w80Var.o = c10;
                    w80Var.m.addView(c10, -1, -1);
                    av0 a11 = w80Var.a();
                    w80Var.n = a11;
                    w80Var.m.addView(a11, c8.ha.c(-1.0f, -1));
                    f2Var.getParentActivity();
                    v4.b0 b0Var = new v4.b0();
                    pj0 pj0Var = new pj0(f2Var.getParentActivity(), null);
                    w80Var.p = pj0Var;
                    pj0Var.setAdapter(w80Var.f);
                    w80Var.p.r1();
                    w80Var.p.setLayoutManager(b0Var);
                    w80Var.p.setOnItemClickListener(new ai.k(w80Var, 24));
                    w80Var.p.setOnScrollListener(w80Var.D);
                    org.telegram.ui.ActionBar.r6.K(w80Var.p, org.telegram.ui.ActionBar.k6.i6, f2Var.getResourceProvider());
                    w80Var.m.addView(w80Var.p, -1, -1);
                    v4.k kVar2 = new v4.k();
                    kVar2.n(350L);
                    kVar2.o(xq.h);
                    kVar2.C = false;
                    kVar2.m = false;
                    w80Var.p.setItemAnimator(kVar2);
                }
                FrameLayout frameLayout2 = w80Var.m;
                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                pj0 pj0Var2 = w80Var.p;
                kVar3.getClass();
                kVar3.B(pj0Var2, org.telegram.ui.ActionBar.k6.a7, org.telegram.ui.ActionBar.k6.s8);
                w80Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public Context getContext() {
        switch (this.a) {
            case 0:
                return ((k7) this.b).getContext();
            case 1:
            case 3:
            default:
                return super.getContext();
            case 2:
                return ((di.u4) this.b).b.getContext();
            case 4:
                return ((fi.o5) this.b).getContext();
            case 5:
                return ((ht) this.b).a.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public int getCurrentAccount() {
        switch (this.a) {
            case 0:
                return this.currentAccount;
            case 1:
            case 3:
            case 8:
            case 9:
            case 10:
            default:
                return super.getCurrentAccount();
            case 2:
                return this.currentAccount;
            case 4:
                return this.currentAccount;
            case 5:
                return this.currentAccount;
            case 6:
                return this.currentAccount;
            case 7:
                return ((xw) this.b).G.c1;
            case 11:
                return this.currentAccount;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public View getFragmentView() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 6:
                qu quVar = ((mu) obj).y;
                Pattern pattern = qu.M1;
                return quVar.b;
            case 7:
                return ((xw) obj).G.r;
            case 11:
                return ((ug.f1) obj).b;
            default:
                return super.getFragmentView();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public FrameLayout getLayoutContainer() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 6:
                qu quVar = ((mu) obj).y;
                Pattern pattern = qu.M1;
                return (FrameLayout) quVar.b;
            case 7:
                return ((xw) obj).G.r;
            case 11:
                return ((ug.f1) obj).E2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                for (Context context = ((k7) this.b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 1:
                Activity W = org.telegram.messenger.g0.W(((di.i4) this.b).getContext());
                return W == null ? LaunchActivity.G1 : W;
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                return super.getParentActivity();
            case 3:
                return LaunchActivity.G1;
            case 4:
                return org.telegram.messenger.g0.W(((fi.o5) this.b).getContext());
            case 5:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 10:
                return ((org.telegram.ui.web.x0) this.b).W;
            case 11:
                org.telegram.ui.ActionBar.f2 f2Var = ((ug.f1) this.b).l2;
                if (f2Var == null) {
                    return null;
                }
                return f2Var.getParentActivity();
            case 12:
                return ((org.telegram.ui.ActionBar.f2) this.b).getParentActivity();
            case 13:
                zh.b4 b4Var = (zh.b4) this.b;
                Activity ownerActivity = b4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.G1;
                }
                return ownerActivity == null ? org.telegram.messenger.g0.W(b4Var.getContext()) : ownerActivity;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 1:
                return new di.m2(0, ((di.i4) obj).k0);
            case 2:
                return ((di.u4) obj).b.s;
            case 3:
                return new di.m2(5, ((fi.c5) obj).I0);
            case 4:
                return ((fi.o5) obj).p1;
            case 5:
            case 8:
            case 9:
            case 11:
            default:
                return super.getResourceProvider();
            case 6:
                qu quVar = ((mu) obj).y;
                Pattern pattern = qu.M1;
                return quVar.I0;
            case 7:
                return ((xw) obj).G.Z1;
            case 10:
                return new di.m2(9, ((org.telegram.ui.web.x0) obj).e);
            case 12:
                return new fi.g5(2, new di.b());
            case 13:
                return ((zh.b4) obj).I0;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 5:
                return new gt(this, ((ht) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public boolean isLightStatusBar() {
        switch (this.a) {
            case 1:
                return false;
            case 3:
                return false;
            case 10:
                return false;
            case 12:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public boolean onBackPressed(boolean z9) {
        switch (this.a) {
            case 9:
                yh.l lVar = ((w80) this.b).s;
                if (lVar == null) {
                    return true;
                }
                if (!z9) {
                    return false;
                }
                lVar.e(false);
                return false;
            default:
                return super.onBackPressed(z9);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public void onTransitionAnimationEnd(boolean z9, boolean z10) {
        switch (this.a) {
            case 8:
                if (z9 && z10) {
                    ((mb0) this.b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z9, z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public boolean presentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        switch (this.a) {
            case 1:
                di.p9 p9Var = ((di.i4) this.b).s0;
                if (p9Var == null) {
                    return true;
                }
                p9Var.N(f2Var);
                return true;
            case 4:
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                d2Var.a = true;
                Q.showAsSheet(f2Var, d2Var);
                return true;
            case 12:
                return false;
            default:
                return super.presentFragment(f2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 0:
                dialog.show();
                return dialog;
            case 1:
                di.p9 p9Var = ((di.i4) this.b).s0;
                if (p9Var != null) {
                    p9Var.t(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 3:
                dialog.show();
                return dialog;
            case 10:
                dialog.show();
                return dialog;
            case 11:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(long j3) {
        super(null);
        this.a = 9;
        this.b = new w80(this, this, getLayoutContainer(), j3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(org.telegram.ui.ActionBar.f2 f2Var) {
        super(null);
        this.a = 12;
        this.b = f2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(fi.c5 c5Var) {
        super(null);
        this.a = 3;
        this.b = c5Var;
        this.currentAccount = c5Var.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(org.telegram.ui.web.x0 x0Var) {
        super(null);
        this.a = 10;
        this.b = x0Var;
        this.currentAccount = x0Var.M;
    }
}
