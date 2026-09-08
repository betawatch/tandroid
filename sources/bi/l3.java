package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.mv;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class l3 extends org.telegram.ui.ActionBar.n2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(Object obj, int i10) {
        super(null);
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        switch (this.a) {
            case 7:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            default:
                return super.createView(context);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public Context getContext() {
        switch (this.a) {
            case 1:
                return ((b6) this.b).b.getContext();
            case 3:
                return ((di.q6) this.b).getContext();
            case 4:
                return ((fu) this.b).a.getContext();
            case 12:
                return ((zh.w3) this.b).getContext();
            default:
                return super.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public int getCurrentAccount() {
        switch (this.a) {
            case 1:
                return this.currentAccount;
            case 2:
            case 7:
            case 8:
            case 10:
            case 11:
            default:
                return super.getCurrentAccount();
            case 3:
                return this.currentAccount;
            case 4:
                return this.currentAccount;
            case 5:
                return this.currentAccount;
            case 6:
                return ((cy) this.b).E.c1;
            case 9:
                return this.currentAccount;
            case 12:
                return this.currentAccount;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((mv) this.b).x).containerView;
                return viewGroup;
            case 6:
                return ((cy) this.b).E.r;
            case 7:
            case 8:
            default:
                return super.getFragmentView();
            case 9:
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((sg.o1) this.b)).containerView;
                return viewGroup2;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((mv) this.b).x).containerView;
                return (FrameLayout) viewGroup;
            case 6:
                return ((cy) this.b).E.r;
            case 7:
            case 8:
            default:
                return super.getLayoutContainer();
            case 9:
                return ((sg.o1) this.b).M0;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                Activity findActivity = AndroidUtilities.findActivity(((o5) this.b).getContext());
                return findActivity == null ? LaunchActivity.G1 : findActivity;
            case 1:
            case 5:
            case 6:
            case 7:
            default:
                return super.getParentActivity();
            case 2:
                return LaunchActivity.G1;
            case 3:
                return AndroidUtilities.findActivity(((di.q6) this.b).getContext());
            case 4:
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 8:
                return ((org.telegram.ui.web.d1) this.b).W;
            case 9:
                org.telegram.ui.ActionBar.n2 n2Var = ((sg.o1) this.b).t0;
                if (n2Var == null) {
                    return null;
                }
                return n2Var.getParentActivity();
            case 10:
                return ((org.telegram.ui.ActionBar.n2) this.b).getParentActivity();
            case 11:
                yh.x4 x4Var = (yh.x4) this.b;
                Activity ownerActivity = x4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.G1;
                }
                return ownerActivity == null ? AndroidUtilities.findActivity(x4Var.getContext()) : ownerActivity;
            case 12:
                for (Context context2 = ((zh.w3) this.b).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        switch (this.a) {
            case 0:
                return new k3(0, ((o5) this.b).B0);
            case 1:
                return ((b6) this.b).b.s;
            case 2:
                f6Var = ((org.telegram.ui.ActionBar.f3) ((di.z5) this.b)).resourcesProvider;
                return new k3(5, f6Var);
            case 3:
                return ((di.q6) this.b).G1;
            case 4:
            case 7:
            case 9:
            default:
                return super.getResourceProvider();
            case 5:
                f6Var2 = ((org.telegram.ui.ActionBar.f3) ((mv) this.b).x).resourcesProvider;
                return f6Var2;
            case 6:
                return ((cy) this.b).E.Z1;
            case 8:
                return new k3(9, ((org.telegram.ui.web.d1) this.b).e);
            case 10:
                return new o0.a(new b());
            case 11:
                f6Var3 = ((org.telegram.ui.ActionBar.f3) ((yh.x4) this.b)).resourcesProvider;
                return f6Var3;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 4:
                return new eu(this, ((fu) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean isLightStatusBar() {
        switch (this.a) {
            case 0:
                return false;
            case 2:
                return false;
            case 8:
                return false;
            case 10:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.a) {
            case 7:
                if (z10 && z11) {
                    ((ad0) this.b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.a) {
            case 0:
                pb pbVar = ((o5) this.b).J0;
                if (pbVar == null) {
                    return true;
                }
                pbVar.H(n2Var);
                return true;
            case 3:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                R.showAsSheet(n2Var, l2Var);
                return true;
            case 10:
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 0:
                pb pbVar = ((o5) this.b).J0;
                if (pbVar != null) {
                    pbVar.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 2:
                dialog.show();
                return dialog;
            case 8:
                dialog.show();
                return dialog;
            case 9:
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
    public l3(org.telegram.ui.ActionBar.n2 n2Var) {
        super(null);
        this.a = 10;
        this.b = n2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(di.z5 z5Var) {
        super(null);
        int i10;
        this.a = 2;
        this.b = z5Var;
        i10 = ((org.telegram.ui.ActionBar.f3) z5Var).currentAccount;
        this.currentAccount = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(org.telegram.ui.web.d1 d1Var) {
        super(null);
        this.a = 8;
        this.b = d1Var;
        this.currentAccount = d1Var.M;
    }
}
