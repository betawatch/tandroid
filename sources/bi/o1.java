package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.rv;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class o1 extends org.telegram.ui.ActionBar.p2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Object obj, int i10) {
        super(null);
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public View createView(Context context) {
        switch (this.a) {
            case 5:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            default:
                return super.createView(context);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public Context getContext() {
        switch (this.a) {
            case 1:
                return ((r7) this.b).getContext();
            case 2:
                return ((lu) this.b).a.getContext();
            case 10:
                return ((xh.x3) this.b).getContext();
            case 12:
                return ((zh.k3) this.b).b.getContext();
            default:
                return super.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public int getCurrentAccount() {
        switch (this.a) {
            case 1:
                return this.currentAccount;
            case 2:
                return this.currentAccount;
            case 3:
                return this.currentAccount;
            case 4:
                return ((iy) this.b).E.c1;
            case 5:
            case 6:
            case 8:
            case 9:
            case 11:
            default:
                return super.getCurrentAccount();
            case 7:
                return this.currentAccount;
            case 10:
                return this.currentAccount;
            case 12:
                return this.currentAccount;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 3:
                viewGroup = ((org.telegram.ui.ActionBar.h3) ((rv) this.b).x).containerView;
                return viewGroup;
            case 4:
                return ((iy) this.b).E.r;
            case 5:
            case 6:
            default:
                return super.getFragmentView();
            case 7:
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) ((qg.m1) this.b)).containerView;
                return viewGroup2;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 3:
                viewGroup = ((org.telegram.ui.ActionBar.h3) ((rv) this.b).x).containerView;
                return (FrameLayout) viewGroup;
            case 4:
                return ((iy) this.b).E.r;
            case 5:
            case 6:
            default:
                return super.getLayoutContainer();
            case 7:
                return ((qg.m1) this.b).M0;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                return LaunchActivity.G1;
            case 1:
                return AndroidUtilities.findActivity(((r7) this.b).getContext());
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
            default:
                return super.getParentActivity();
            case 6:
                return ((org.telegram.ui.web.c1) this.b).W;
            case 7:
                org.telegram.ui.ActionBar.p2 p2Var = ((qg.m1) this.b).t0;
                if (p2Var == null) {
                    return null;
                }
                return p2Var.getParentActivity();
            case 8:
                return ((org.telegram.ui.ActionBar.p2) this.b).getParentActivity();
            case 9:
                wh.y4 y4Var = (wh.y4) this.b;
                Activity ownerActivity = y4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.G1;
                }
                return ownerActivity == null ? AndroidUtilities.findActivity(y4Var.getContext()) : ownerActivity;
            case 10:
                for (Context context2 = ((xh.x3) this.b).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 11:
                Activity findActivity = AndroidUtilities.findActivity(((zh.a3) this.b).getContext());
                return findActivity == null ? LaunchActivity.G1 : findActivity;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        switch (this.a) {
            case 0:
                f6Var = ((org.telegram.ui.ActionBar.h3) ((y6) this.b)).resourcesProvider;
                return new n1(0, f6Var);
            case 1:
                return ((r7) this.b).G1;
            case 2:
            case 5:
            case 7:
            case 10:
            default:
                return super.getResourceProvider();
            case 3:
                f6Var2 = ((org.telegram.ui.ActionBar.h3) ((rv) this.b).x).resourcesProvider;
                return f6Var2;
            case 4:
                return ((iy) this.b).E.Z1;
            case 6:
                return new n1(4, ((org.telegram.ui.web.c1) this.b).e);
            case 8:
                return new n7.a1(new zh.b());
            case 9:
                f6Var3 = ((org.telegram.ui.ActionBar.h3) ((wh.y4) this.b)).resourcesProvider;
                return f6Var3;
            case 11:
                return new n1(5, ((zh.a3) this.b).B0);
            case 12:
                return ((zh.k3) this.b).b.s;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 2:
                return new ku(this, ((lu) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public boolean isLightStatusBar() {
        switch (this.a) {
            case 0:
                return false;
            case 6:
                return false;
            case 8:
                return false;
            case 11:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.a) {
            case 5:
                if (z10 && z11) {
                    ((id0) this.b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                R.showAsSheet(p2Var, n2Var);
                return true;
            case 8:
                return false;
            case 11:
                zh.u7 u7Var = ((zh.a3) this.b).J0;
                if (u7Var == null) {
                    return true;
                }
                u7Var.H(p2Var);
                return true;
            default:
                return super.presentFragment(p2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 0:
                dialog.show();
                return dialog;
            case 6:
                dialog.show();
                return dialog;
            case 7:
                dialog.show();
                return dialog;
            case 10:
                dialog.show();
                return dialog;
            case 11:
                zh.u7 u7Var = ((zh.a3) this.b).J0;
                if (u7Var != null) {
                    u7Var.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(org.telegram.ui.ActionBar.p2 p2Var) {
        super(null);
        this.a = 8;
        this.b = p2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(y6 y6Var) {
        super(null);
        int i10;
        this.a = 0;
        this.b = y6Var;
        i10 = ((org.telegram.ui.ActionBar.h3) y6Var).currentAccount;
        this.currentAccount = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(org.telegram.ui.web.c1 c1Var) {
        super(null);
        this.a = 6;
        this.b = c1Var;
        this.currentAccount = c1Var.M;
    }
}
