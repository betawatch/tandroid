package ai;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import ei.r9;
import java.util.regex.Pattern;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.ww;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hx;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c7 extends org.telegram.ui.ActionBar.d2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7(Object obj, int i3) {
        super(null);
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.d2
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
                this.actionBar.setActionBarMenuOnItemClick(new hx(this, 17));
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                s80 s80Var = (s80) this.b;
                kVar.setTitle(bd.M0(s80Var.a ? 2131744446 : 2131748643, null));
                org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(0, R.drawable.outline_header_search);
                a10.N();
                a10.I = new lg.w1(this, 16);
                a10.setSearchFieldHint(bd.M0(2131745846, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.d2 d2Var = s80Var.g;
                if (s80Var.m == null) {
                    FrameLayout frameLayout = new FrameLayout(d2Var.getParentActivity());
                    s80Var.m = frameLayout;
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, d2Var.getResourceProvider());
                    iz b10 = s80Var.b();
                    s80Var.q = b10;
                    s80Var.m.addView(b10, -1, -1);
                    zu0 c2 = s80Var.c();
                    s80Var.o = c2;
                    s80Var.m.addView(c2, -1, -1);
                    zu0 a11 = s80Var.a();
                    s80Var.n = a11;
                    s80Var.m.addView(a11, mf.c(-1.0f, -1));
                    d2Var.getParentActivity();
                    u4.b0 b0Var = new u4.b0();
                    tj0 tj0Var = new tj0(d2Var.getParentActivity(), null);
                    s80Var.p = tj0Var;
                    tj0Var.setAdapter(s80Var.f);
                    s80Var.p.r1();
                    s80Var.p.setLayoutManager(b0Var);
                    s80Var.p.setOnItemClickListener(new j6(s80Var, 25));
                    s80Var.p.setOnScrollListener(s80Var.D);
                    org.telegram.ui.ActionBar.r6.K(s80Var.p, org.telegram.ui.ActionBar.k6.i6, d2Var.getResourceProvider());
                    s80Var.m.addView(s80Var.p, -1, -1);
                    u4.k kVar2 = new u4.k();
                    kVar2.n(350L);
                    kVar2.o(xq.h);
                    kVar2.C = false;
                    kVar2.m = false;
                    s80Var.p.setItemAnimator(kVar2);
                }
                FrameLayout frameLayout2 = s80Var.m;
                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                tj0 tj0Var2 = s80Var.p;
                kVar3.getClass();
                kVar3.B(tj0Var2, org.telegram.ui.ActionBar.k6.a7, org.telegram.ui.ActionBar.k6.s8);
                s80Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public Context getContext() {
        switch (this.a) {
            case 1:
                return ((ci.l6) this.b).getContext();
            case 2:
            case 4:
            default:
                return super.getContext();
            case 3:
                return ((ei.u4) this.b).b.getContext();
            case 5:
                return ((gi.m5) this.b).getContext();
            case 6:
                return ((gt) this.b).a.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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
                return ((ww) this.b).H.d1;
            case 12:
                return this.currentAccount;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public View getFragmentView() {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 7:
                pu puVar = ((lu) obj).y;
                Pattern pattern = pu.N1;
                return puVar.b;
            case 8:
                return ((ww) obj).H.r;
            case 12:
                return ((vg.h1) obj).b;
            default:
                return super.getFragmentView();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public FrameLayout getLayoutContainer() {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 7:
                pu puVar = ((lu) obj).y;
                Pattern pattern = pu.N1;
                return (FrameLayout) puVar.b;
            case 8:
                return ((ww) obj).H.r;
            case 12:
                return ((vg.h1) obj).F2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                d7 d7Var = (d7) this.b;
                Activity ownerActivity = d7Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.K1;
                }
                return ownerActivity == null ? org.telegram.messenger.g0.W(d7Var.getContext()) : ownerActivity;
            case 1:
                for (Context context = ((ci.l6) this.b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 2:
                Activity W = org.telegram.messenger.g0.W(((ei.j4) this.b).getContext());
                return W == null ? LaunchActivity.K1 : W;
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return super.getParentActivity();
            case 4:
                return LaunchActivity.K1;
            case 5:
                return org.telegram.messenger.g0.W(((gi.m5) this.b).getContext());
            case 6:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 11:
                return ((org.telegram.ui.web.w0) this.b).a0;
            case 12:
                org.telegram.ui.ActionBar.d2 d2Var = ((vg.h1) this.b).m2;
                if (d2Var == null) {
                    return null;
                }
                return d2Var.getParentActivity();
            case 13:
                return ((org.telegram.ui.ActionBar.d2) this.b).getParentActivity();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                return ((d7) obj).J0;
            case 1:
            case 6:
            case 9:
            case 10:
            case 12:
            default:
                return super.getResourceProvider();
            case 2:
                return new ei.q2(0, ((ei.j4) obj).l0);
            case 3:
                return ((ei.u4) obj).b.s;
            case 4:
                return new ei.q2(5, ((gi.a5) obj).J0);
            case 5:
                return ((gi.m5) obj).q1;
            case 7:
                pu puVar = ((lu) obj).y;
                Pattern pattern = pu.N1;
                return puVar.J0;
            case 8:
                return ((ww) obj).H.a2;
            case 11:
                return new ei.q2(9, ((org.telegram.ui.web.w0) obj).e);
            case 13:
                return new gi.e5(2, new ei.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 6:
                return new ft(this, ((gt) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public boolean onBackPressed(boolean z10) {
        switch (this.a) {
            case 10:
                zh.j jVar = ((s80) this.b).s;
                if (jVar == null) {
                    return true;
                }
                if (!z10) {
                    return false;
                }
                jVar.e(false);
                return false;
            default:
                return super.onBackPressed(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.a) {
            case 9:
                if (z10 && z11) {
                    ((hb0) this.b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public boolean presentFragment(org.telegram.ui.ActionBar.d2 d2Var) {
        switch (this.a) {
            case 2:
                r9 r9Var = ((ei.j4) this.b).t0;
                if (r9Var == null) {
                    return true;
                }
                r9Var.V(d2Var);
                return true;
            case 5:
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
                b2Var.a = true;
                Q.showAsSheet(d2Var, b2Var);
                return true;
            case 13:
                return false;
            default:
                return super.presentFragment(d2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 1:
                dialog.show();
                return dialog;
            case 2:
                r9 r9Var = ((ei.j4) this.b).t0;
                if (r9Var != null) {
                    r9Var.t(dialog);
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
    public c7(long j10) {
        super(null);
        this.a = 10;
        this.b = new s80(this, this, getLayoutContainer(), j10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(org.telegram.ui.ActionBar.d2 d2Var) {
        super(null);
        this.a = 13;
        this.b = d2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(gi.a5 a5Var) {
        super(null);
        this.a = 4;
        this.b = a5Var;
        this.currentAccount = a5Var.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(org.telegram.ui.web.w0 w0Var) {
        super(null);
        this.a = 11;
        this.b = w0Var;
        this.currentAccount = w0Var.N;
    }
}
