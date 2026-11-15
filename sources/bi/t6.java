package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import fi.i9;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.z80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t6 extends org.telegram.ui.ActionBar.e2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6(Object obj, int i7) {
        super(null);
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.e2
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
                this.actionBar.setActionBarMenuOnItemClick(new lx(this, 17));
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                z80 z80Var = (z80) this.b;
                kVar.setTitle(hd.M0(z80Var.a ? 2131744436 : 2131748635, null));
                org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, R.drawable.outline_header_search);
                a10.O();
                a10.I = new kg.x1(this, 16);
                a10.setSearchFieldHint(hd.M0(2131745836, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.e2 e2Var = z80Var.g;
                if (z80Var.m == null) {
                    FrameLayout frameLayout = new FrameLayout(e2Var.getParentActivity());
                    z80Var.m = frameLayout;
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, frameLayout, e2Var.getResourceProvider());
                    pz b10 = z80Var.b();
                    z80Var.q = b10;
                    z80Var.m.addView(b10, -1, -1);
                    cv0 c10 = z80Var.c();
                    z80Var.o = c10;
                    z80Var.m.addView(c10, -1, -1);
                    cv0 a11 = z80Var.a();
                    z80Var.n = a11;
                    z80Var.m.addView(a11, ja.c(-1.0f, -1));
                    e2Var.getParentActivity();
                    v4.b0 b0Var = new v4.b0();
                    uj0 uj0Var = new uj0(e2Var.getParentActivity(), null);
                    z80Var.p = uj0Var;
                    uj0Var.setAdapter(z80Var.f);
                    z80Var.p.r1();
                    z80Var.p.setLayoutManager(b0Var);
                    z80Var.p.setOnItemClickListener(new b6(z80Var, 25));
                    z80Var.p.setOnScrollListener(z80Var.D);
                    org.telegram.ui.ActionBar.q6.J(z80Var.p, org.telegram.ui.ActionBar.j6.i6, e2Var.getResourceProvider());
                    z80Var.m.addView(z80Var.p, -1, -1);
                    v4.k kVar2 = new v4.k();
                    kVar2.n(350L);
                    kVar2.o(er.h);
                    kVar2.C = false;
                    kVar2.m = false;
                    z80Var.p.setItemAnimator(kVar2);
                }
                FrameLayout frameLayout2 = z80Var.m;
                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                uj0 uj0Var2 = z80Var.p;
                kVar3.getClass();
                kVar3.D(uj0Var2, org.telegram.ui.ActionBar.j6.a7, org.telegram.ui.ActionBar.j6.s8);
                z80Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public Context getContext() {
        switch (this.a) {
            case 1:
                return ((di.c6) this.b).getContext();
            case 2:
            case 4:
            default:
                return super.getContext();
            case 3:
                return ((fi.m4) this.b).b.getContext();
            case 5:
                return ((hi.m5) this.b).getContext();
            case 6:
                return ((pt) this.b).a.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
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
                return ((dx) this.b).H.d1;
            case 12:
                return this.currentAccount;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public View getFragmentView() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 7:
                wu wuVar = ((su) obj).y;
                Pattern pattern = wu.Q1;
                return wuVar.b;
            case 8:
                return ((dx) obj).H.r;
            case 12:
                return ((ug.g1) obj).b;
            default:
                return super.getFragmentView();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public FrameLayout getLayoutContainer() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 7:
                wu wuVar = ((su) obj).y;
                Pattern pattern = wu.Q1;
                return (FrameLayout) wuVar.b;
            case 8:
                return ((dx) obj).H.r;
            case 12:
                return ((ug.g1) obj).I2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                u6 u6Var = (u6) this.b;
                Activity ownerActivity = u6Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.H1;
                }
                return ownerActivity == null ? org.telegram.messenger.g0.W(u6Var.getContext()) : ownerActivity;
            case 1:
                for (Context context = ((di.c6) this.b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 2:
                Activity W = org.telegram.messenger.g0.W(((fi.b4) this.b).getContext());
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
                return org.telegram.messenger.g0.W(((hi.m5) this.b).getContext());
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
                org.telegram.ui.ActionBar.e2 e2Var = ((ug.g1) this.b).p2;
                if (e2Var == null) {
                    return null;
                }
                return e2Var.getParentActivity();
            case 13:
                return ((org.telegram.ui.ActionBar.e2) this.b).getParentActivity();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                return ((u6) obj).J0;
            case 1:
            case 6:
            case 9:
            case 10:
            case 12:
            default:
                return super.getResourceProvider();
            case 2:
                return new fi.i2(0, ((fi.b4) obj).l0);
            case 3:
                return ((fi.m4) obj).b.s;
            case 4:
                return new fi.i2(5, ((hi.a5) obj).J0);
            case 5:
                return ((hi.m5) obj).q1;
            case 7:
                wu wuVar = ((su) obj).y;
                Pattern pattern = wu.Q1;
                return wuVar.J0;
            case 8:
                return ((dx) obj).H.a2;
            case 11:
                return new fi.i2(9, ((org.telegram.ui.web.v0) obj).e);
            case 13:
                return new hi.e5(2, new fi.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 6:
                return new ot(this, ((pt) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
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

    @Override // org.telegram.ui.ActionBar.e2
    public boolean onBackPressed(boolean z10) {
        switch (this.a) {
            case 10:
                zh.k kVar = ((z80) this.b).s;
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

    @Override // org.telegram.ui.ActionBar.e2
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.a) {
            case 9:
                if (z10 && z11) {
                    ((nb0) this.b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public boolean presentFragment(org.telegram.ui.ActionBar.e2 e2Var) {
        switch (this.a) {
            case 2:
                i9 i9Var = ((fi.b4) this.b).t0;
                if (i9Var == null) {
                    return true;
                }
                i9Var.N(e2Var);
                return true;
            case 5:
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
                c2Var.a = true;
                Q.showAsSheet(e2Var, c2Var);
                return true;
            case 13:
                return false;
            default:
                return super.presentFragment(e2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 1:
                dialog.show();
                return dialog;
            case 2:
                i9 i9Var = ((fi.b4) this.b).t0;
                if (i9Var != null) {
                    i9Var.t(dialog);
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
    public t6(long j3) {
        super(null);
        this.a = 10;
        this.b = new z80(this, this, getLayoutContainer(), j3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(org.telegram.ui.ActionBar.e2 e2Var) {
        super(null);
        this.a = 13;
        this.b = e2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(hi.a5 a5Var) {
        super(null);
        this.a = 4;
        this.b = a5Var;
        this.currentAccount = a5Var.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(org.telegram.ui.web.v0 v0Var) {
        super(null);
        this.a = 11;
        this.b = v0Var;
        this.currentAccount = v0Var.N;
    }
}
