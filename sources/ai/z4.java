package ai;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.vv;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class z4 extends org.telegram.ui.ActionBar.n2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4(Object obj, int i10) {
        super(null);
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public Context getContext() {
        switch (this.a) {
            case 0:
                return ((k7) this.b).getContext();
            case 1:
            case 3:
            default:
                return super.getContext();
            case 2:
                return ((ci.d5) this.b).b.getContext();
            case 4:
                return ((ei.f6) this.b).getContext();
            case 5:
                return ((ou) this.b).a.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
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
                return ((jy) this.b).E.c1;
            case 10:
                return this.currentAccount;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 6:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((vv) this.b).x).containerView;
                return viewGroup;
            case 7:
                return ((jy) this.b).E.r;
            case 8:
            case 9:
            default:
                return super.getFragmentView();
            case 10:
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((sg.l1) this.b)).containerView;
                return viewGroup2;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 6:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((vv) this.b).x).containerView;
                return (FrameLayout) viewGroup;
            case 7:
                return ((jy) this.b).E.r;
            case 8:
            case 9:
            default:
                return super.getLayoutContainer();
            case 10:
                return ((sg.l1) this.b).M0;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
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
                Activity findActivity = AndroidUtilities.findActivity(((ci.q4) this.b).getContext());
                return findActivity == null ? LaunchActivity.H1 : findActivity;
            case 2:
            case 6:
            case 7:
            case 8:
            default:
                return super.getParentActivity();
            case 3:
                return LaunchActivity.H1;
            case 4:
                return AndroidUtilities.findActivity(((ei.f6) this.b).getContext());
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
                org.telegram.ui.ActionBar.n2 n2Var = ((sg.l1) this.b).t0;
                if (n2Var == null) {
                    return null;
                }
                return n2Var.getParentActivity();
            case 11:
                return ((org.telegram.ui.ActionBar.n2) this.b).getParentActivity();
            case 12:
                yh.y4 y4Var = (yh.y4) this.b;
                Activity ownerActivity = y4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.H1;
                }
                return ownerActivity == null ? AndroidUtilities.findActivity(y4Var.getContext()) : ownerActivity;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public org.telegram.ui.ActionBar.d6 getResourceProvider() {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        switch (this.a) {
            case 1:
                return new ci.t2(0, ((ci.q4) this.b).B0);
            case 2:
                return ((ci.d5) this.b).b.s;
            case 3:
                d6Var = ((org.telegram.ui.ActionBar.f3) ((ei.o5) this.b)).resourcesProvider;
                return new ci.t2(5, d6Var);
            case 4:
                return ((ei.f6) this.b).G1;
            case 5:
            case 8:
            case 10:
            default:
                return super.getResourceProvider();
            case 6:
                d6Var2 = ((org.telegram.ui.ActionBar.f3) ((vv) this.b).x).resourcesProvider;
                return d6Var2;
            case 7:
                return ((jy) this.b).E.Z1;
            case 9:
                return new ci.t2(9, ((org.telegram.ui.web.a1) this.b).e);
            case 11:
                return new mi.q((org.telegram.ui.ActionBar.d6) new ci.b());
            case 12:
                d6Var3 = ((org.telegram.ui.ActionBar.f3) ((yh.y4) this.b)).resourcesProvider;
                return d6Var3;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 5:
                return new nu(this, ((ou) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.a) {
            case 8:
                if (z10 && z11) {
                    ((td0) this.b).dismiss();
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
            case 1:
                ci.aa aaVar = ((ci.q4) this.b).J0;
                if (aaVar == null) {
                    return true;
                }
                aaVar.H(n2Var);
                return true;
            case 4:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                R.showAsSheet(n2Var, l2Var);
                return true;
            case 11:
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 0:
                dialog.show();
                return dialog;
            case 1:
                ci.aa aaVar = ((ci.q4) this.b).J0;
                if (aaVar != null) {
                    aaVar.showDialog(dialog);
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
    public z4(org.telegram.ui.ActionBar.n2 n2Var) {
        super(null);
        this.a = 11;
        this.b = n2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(ei.o5 o5Var) {
        super(null);
        int i10;
        this.a = 3;
        this.b = o5Var;
        i10 = ((org.telegram.ui.ActionBar.f3) o5Var).currentAccount;
        this.currentAccount = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(org.telegram.ui.web.a1 a1Var) {
        super(null);
        this.a = 9;
        this.b = a1Var;
        this.currentAccount = a1Var.M;
    }
}
