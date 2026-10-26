package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.vv;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class v4 extends org.telegram.ui.ActionBar.r2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4(Object obj, int i10) {
        super(null);
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public View createView(Context context) {
        switch (this.a) {
            case 8:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            default:
                return super.createView(context);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public Context getContext() {
        switch (this.a) {
            case 0:
                return ((h7) this.b).getContext();
            case 1:
            case 3:
            default:
                return super.getContext();
            case 2:
                return ((di.c5) this.b).b.getContext();
            case 4:
                return ((fi.e6) this.b).getContext();
            case 5:
                return ((pu) this.b).a.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public int getCurrentAccount() {
        switch (this.a) {
            case 0:
                return this.currentAccount;
            case 1:
            case 3:
            case 8:
            case 9:
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
                return ((iy) this.b).G.c1;
            case 10:
                return this.currentAccount;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 6:
                viewGroup = ((org.telegram.ui.ActionBar.k3) ((vv) this.b).x).containerView;
                return viewGroup;
            case 7:
                return ((iy) this.b).G.r;
            case 8:
            case 9:
            default:
                return super.getFragmentView();
            case 10:
                viewGroup2 = ((org.telegram.ui.ActionBar.k3) ((tg.m1) this.b)).containerView;
                return viewGroup2;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 6:
                viewGroup = ((org.telegram.ui.ActionBar.k3) ((vv) this.b).x).containerView;
                return (FrameLayout) viewGroup;
            case 7:
                return ((iy) this.b).G.r;
            case 8:
            case 9:
            default:
                return super.getLayoutContainer();
            case 10:
                return ((tg.m1) this.b).M0;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                for (Context context = ((h7) this.b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(((di.q4) this.b).getContext());
                return findActivity == null ? LaunchActivity.I1 : findActivity;
            case 2:
            case 6:
            case 7:
            case 8:
            default:
                return super.getParentActivity();
            case 3:
                return LaunchActivity.I1;
            case 4:
                return AndroidUtilities.findActivity(((fi.e6) this.b).getContext());
            case 5:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 9:
                return ((org.telegram.ui.web.a1) this.b).W;
            case 10:
                org.telegram.ui.ActionBar.r2 r2Var = ((tg.m1) this.b).t0;
                if (r2Var == null) {
                    return null;
                }
                return r2Var.getParentActivity();
            case 11:
                return ((org.telegram.ui.ActionBar.r2) this.b).getParentActivity();
            case 12:
                zh.y4 y4Var = (zh.y4) this.b;
                Activity ownerActivity = y4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.I1;
                }
                return ownerActivity == null ? AndroidUtilities.findActivity(y4Var.getContext()) : ownerActivity;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public org.telegram.ui.ActionBar.u6 getResourceProvider() {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        switch (this.a) {
            case 1:
                return new di.s2(0, ((di.q4) this.b).q0);
            case 2:
                return ((di.c5) this.b).b.s;
            case 3:
                u6Var = ((org.telegram.ui.ActionBar.k3) ((fi.n5) this.b)).resourcesProvider;
                return new di.s2(5, u6Var);
            case 4:
                return ((fi.e6) this.b).v1;
            case 5:
            case 8:
            case 10:
            default:
                return super.getResourceProvider();
            case 6:
                u6Var2 = ((org.telegram.ui.ActionBar.k3) ((vv) this.b).x).resourcesProvider;
                return u6Var2;
            case 7:
                return ((iy) this.b).G.Z1;
            case 9:
                return new di.s2(9, ((org.telegram.ui.web.a1) this.b).e);
            case 11:
                return new org.telegram.ui.ActionBar.h5(new di.b());
            case 12:
                u6Var3 = ((org.telegram.ui.ActionBar.k3) ((zh.y4) this.b)).resourcesProvider;
                return u6Var3;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 5:
                return new ou(this, ((pu) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public boolean isLightStatusBar() {
        switch (this.a) {
            case 1:
                return false;
            case 3:
                return false;
            case 9:
                return false;
            case 11:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.a) {
            case 8:
                if (z10 && z11) {
                    ((sd0) this.b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public boolean presentFragment(org.telegram.ui.ActionBar.r2 r2Var) {
        switch (this.a) {
            case 1:
                di.y9 y9Var = ((di.q4) this.b).y0;
                if (y9Var == null) {
                    return true;
                }
                y9Var.H(r2Var);
                return true;
            case 4:
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                p2Var.a = true;
                R.showAsSheet(r2Var, p2Var);
                return true;
            case 11:
                return false;
            default:
                return super.presentFragment(r2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 0:
                dialog.show();
                return dialog;
            case 1:
                di.y9 y9Var = ((di.q4) this.b).y0;
                if (y9Var != null) {
                    y9Var.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 3:
                dialog.show();
                return dialog;
            case 9:
                dialog.show();
                return dialog;
            case 10:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(org.telegram.ui.ActionBar.r2 r2Var) {
        super(null);
        this.a = 11;
        this.b = r2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(fi.n5 n5Var) {
        super(null);
        int i10;
        this.a = 3;
        this.b = n5Var;
        i10 = ((org.telegram.ui.ActionBar.k3) n5Var).currentAccount;
        this.currentAccount = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(org.telegram.ui.web.a1 a1Var) {
        super(null);
        this.a = 9;
        this.b = a1Var;
        this.currentAccount = a1Var.M;
    }
}
