package kg;

import ag.l3;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x4;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.yu;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t60;
import ph.g4;
import rh.e4;
import th.j3;
import th.o7;
import th.z2;
import vh.b4;
import vh.q3;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q1 extends org.telegram.ui.ActionBar.k2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(Object obj, int i10) {
        super(null);
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public View createView(Context context) {
        switch (this.a) {
            case 5:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            case 6:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new t60(this, 7));
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                o90 o90Var = (o90) this.b;
                lVar.setTitle(cd.L0(o90Var.a ? 2131744462 : 2131748650, null));
                org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, R.drawable.outline_header_search);
                a2.N();
                a2.H = new l3(this, 16);
                a2.setSearchFieldHint(cd.L0(2131745853, null));
                a2.setVisibility(8);
                org.telegram.ui.ActionBar.k2 k2Var = o90Var.g;
                if (o90Var.m == null) {
                    FrameLayout frameLayout = new FrameLayout(k2Var.getParentActivity());
                    o90Var.m = frameLayout;
                    a7.i(t6.a7, frameLayout, k2Var.getResourceProvider());
                    zz b10 = o90Var.b();
                    o90Var.q = b10;
                    o90Var.m.addView(b10, -1, -1);
                    dw0 c10 = o90Var.c();
                    o90Var.o = c10;
                    o90Var.m.addView(c10, -1, -1);
                    dw0 a10 = o90Var.a();
                    o90Var.n = a10;
                    o90Var.m.addView(a10, b6.c(-1.0f, -1));
                    k2Var.getParentActivity();
                    s4.a0 a0Var = new s4.a0();
                    tk0 tk0Var = new tk0(k2Var.getParentActivity(), null);
                    o90Var.p = tk0Var;
                    tk0Var.setAdapter(o90Var.f);
                    o90Var.p.r1();
                    o90Var.p.setLayoutManager(a0Var);
                    o90Var.p.setOnItemClickListener(new ag.y0(o90Var, 9));
                    o90Var.p.setOnScrollListener(o90Var.D);
                    a7.K(o90Var.p, t6.i6, k2Var.getResourceProvider());
                    o90Var.m.addView(o90Var.p, -1, -1);
                    s4.j jVar = new s4.j();
                    jVar.n(350L);
                    jVar.o(gr.h);
                    jVar.C = false;
                    jVar.m = false;
                    o90Var.p.setItemAnimator(jVar);
                }
                FrameLayout frameLayout2 = o90Var.m;
                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                tk0 tk0Var2 = o90Var.p;
                lVar2.getClass();
                lVar2.B(tk0Var2, t6.a7, t6.s8);
                o90Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public Context getContext() {
        switch (this.a) {
            case 2:
                return ((ut) this.b).a.getContext();
            case 9:
                return ((e4) this.b).getContext();
            case 11:
                return ((j3) this.b).b.getContext();
            case 13:
                return ((b4) this.b).getContext();
            default:
                return super.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public int getCurrentAccount() {
        switch (this.a) {
            case 0:
                return this.currentAccount;
            case 2:
                return this.currentAccount;
            case 3:
                return this.currentAccount;
            case 4:
                return ((mx) this.b).G.c1;
            case 9:
                return this.currentAccount;
            case 11:
                return this.currentAccount;
            case 13:
                return this.currentAccount;
            default:
                return super.getCurrentAccount();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public View getFragmentView() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                return ((v1) obj).b;
            case 1:
            case 2:
            default:
                return super.getFragmentView();
            case 3:
                cv cvVar = ((yu) obj).y;
                Pattern pattern = cv.M1;
                return cvVar.b;
            case 4:
                return ((mx) obj).G.r;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public FrameLayout getLayoutContainer() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                return ((v1) obj).E2;
            case 1:
            case 2:
            default:
                return super.getLayoutContainer();
            case 3:
                cv cvVar = ((yu) obj).y;
                Pattern pattern = cv.M1;
                return (FrameLayout) cvVar.b;
            case 4:
                return ((mx) obj).G.r;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2, org.telegram.ui.Components.s40
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = ((v1) this.b).l2;
                if (k2Var == null) {
                    return null;
                }
                return k2Var.getParentActivity();
            case 1:
                return ((org.telegram.ui.ActionBar.k2) this.b).getParentActivity();
            case 2:
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 3:
            case 4:
            case 5:
            case 6:
            case 11:
            default:
                return super.getParentActivity();
            case 7:
                return ((org.telegram.ui.web.z0) this.b).W;
            case 8:
                g4 g4Var = (g4) this.b;
                Activity ownerActivity = g4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.I1;
                }
                return ownerActivity == null ? org.telegram.messenger.i0.W(g4Var.getContext()) : ownerActivity;
            case 9:
                for (Context context2 = ((e4) this.b).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 10:
                Activity W = org.telegram.messenger.i0.W(((z2) this.b).getContext());
                return W == null ? LaunchActivity.I1 : W;
            case 12:
                return LaunchActivity.I1;
            case 13:
                return org.telegram.messenger.i0.W(((b4) this.b).getContext());
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public p6 getResourceProvider() {
        int i10 = this.a;
        int i11 = 1;
        Object obj = this.b;
        switch (i10) {
            case 1:
                return new x4(1, new th.b());
            case 2:
            case 5:
            case 6:
            case 9:
            default:
                return super.getResourceProvider();
            case 3:
                cv cvVar = ((yu) obj).y;
                Pattern pattern = cv.M1;
                return cvVar.I0;
            case 4:
                return ((mx) obj).G.Z1;
            case 7:
                return new org.telegram.ui.web.a0(0, ((org.telegram.ui.web.z0) obj).e);
            case 8:
                return ((g4) obj).I0;
            case 10:
                return new org.telegram.ui.web.a0(i11, ((z2) obj).k0);
            case 11:
                return ((j3) obj).b.s;
            case 12:
                return new org.telegram.ui.web.a0(6, ((q3) obj).I0);
            case 13:
                return ((b4) obj).p1;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 2:
                return new tt(this, ((ut) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public boolean isLightStatusBar() {
        switch (this.a) {
            case 1:
                return false;
            case 7:
                return false;
            case 10:
                return false;
            case 12:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public boolean onBackPressed(boolean z10) {
        switch (this.a) {
            case 6:
                oh.p pVar = ((o90) this.b).s;
                if (pVar == null) {
                    return true;
                }
                if (!z10) {
                    return false;
                }
                pVar.e(false);
                return false;
            default:
                return super.onBackPressed(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.a) {
            case 5:
                if (z10 && z11) {
                    ((fc0) this.b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public boolean presentFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        switch (this.a) {
            case 1:
                return false;
            case 10:
                o7 o7Var = ((z2) this.b).s0;
                if (o7Var == null) {
                    return true;
                }
                o7Var.V(k2Var);
                return true;
            case 13:
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                i2Var.a = true;
                Q.showAsSheet(k2Var, i2Var);
                return true;
            default:
                return super.presentFragment(k2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 0:
                dialog.show();
                return dialog;
            case 7:
                dialog.show();
                return dialog;
            case 9:
                dialog.show();
                return dialog;
            case 10:
                o7 o7Var = ((z2) this.b).s0;
                if (o7Var != null) {
                    o7Var.t(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 12:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(long j10) {
        super(null);
        this.a = 6;
        this.b = new o90(this, this, getLayoutContainer(), j10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(org.telegram.ui.ActionBar.k2 k2Var) {
        super(null);
        this.a = 1;
        this.b = k2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(q3 q3Var) {
        super(null);
        this.a = 12;
        this.b = q3Var;
        this.currentAccount = q3Var.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(org.telegram.ui.web.z0 z0Var) {
        super(null);
        this.a = 7;
        this.b = z0Var;
        this.currentAccount = z0Var.M;
    }
}
