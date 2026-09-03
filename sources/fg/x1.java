package fg;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import lh.e6;
import mh.g5;
import n7.qa;
import oh.f4;
import oh.i9;
import oh.o4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.jv;
import org.telegram.ui.LaunchActivity;
import qh.a5;
import qh.k4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x1 extends org.telegram.ui.ActionBar.p2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, int i10) {
        super(null);
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public View createView(Context context) {
        switch (this.a) {
            case 9:
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
            case 3:
                return ((g5) this.b).getContext();
            case 5:
                return ((o4) this.b).b.getContext();
            case 6:
                return ((du) this.b).a.getContext();
            case 12:
                return ((a5) this.b).getContext();
            default:
                return super.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public int getCurrentAccount() {
        switch (this.a) {
            case 0:
                return this.currentAccount;
            case 1:
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
                return ((cy) this.b).B.Z0;
            case 12:
                return this.currentAccount;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                viewGroup = ((h3) ((d2) this.b)).containerView;
                return viewGroup;
            case 7:
                viewGroup2 = ((h3) ((jv) this.b).x).containerView;
                return viewGroup2;
            case 8:
                return ((cy) this.b).B.r;
            default:
                return super.getFragmentView();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                return ((d2) this.b).J0;
            case 7:
                viewGroup = ((h3) ((jv) this.b).x).containerView;
                return (FrameLayout) viewGroup;
            case 8:
                return ((cy) this.b).B.r;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.s50
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.p2 p2Var = ((d2) this.b).q0;
                if (p2Var == null) {
                    return null;
                }
                return p2Var.getParentActivity();
            case 1:
                return ((org.telegram.ui.ActionBar.p2) this.b).getParentActivity();
            case 2:
                e6 e6Var = (e6) this.b;
                Activity ownerActivity = e6Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.D1;
                }
                return ownerActivity == null ? AndroidUtilities.findActivity(e6Var.getContext()) : ownerActivity;
            case 3:
                for (Context context = ((g5) this.b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 4:
                Activity findActivity = AndroidUtilities.findActivity(((f4) this.b).getContext());
                return findActivity == null ? LaunchActivity.D1 : findActivity;
            case 5:
            case 7:
            case 8:
            case 9:
            default:
                return super.getParentActivity();
            case 6:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 10:
                return ((org.telegram.ui.web.a1) this.b).T;
            case 11:
                return LaunchActivity.D1;
            case 12:
                return AndroidUtilities.findActivity(((a5) this.b).getContext());
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public g6 getResourceProvider() {
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        switch (this.a) {
            case 1:
                return new qa(new oh.b());
            case 2:
                g6Var = ((h3) ((e6) this.b)).resourcesProvider;
                return g6Var;
            case 3:
            case 6:
            case 9:
            default:
                return super.getResourceProvider();
            case 4:
                return new oh.n2(0, ((f4) this.b).y0);
            case 5:
                return ((o4) this.b).b.s;
            case 7:
                g6Var2 = ((h3) ((jv) this.b).x).resourcesProvider;
                return g6Var2;
            case 8:
                return ((cy) this.b).B.W1;
            case 10:
                return new oh.n2(5, ((org.telegram.ui.web.a1) this.b).e);
            case 11:
                g6Var3 = ((h3) ((k4) this.b)).resourcesProvider;
                return new oh.n2(6, g6Var3);
            case 12:
                return ((a5) this.b).D1;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 6:
                return new cu(this, ((du) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public boolean isLightStatusBar() {
        switch (this.a) {
            case 1:
                return false;
            case 4:
                return false;
            case 10:
                return false;
            case 11:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public void onTransitionAnimationEnd(boolean z4, boolean z10) {
        switch (this.a) {
            case 9:
                if (z4 && z10) {
                    ((dd0) this.b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z4, z10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        switch (this.a) {
            case 1:
                return false;
            case 4:
                i9 i9Var = ((f4) this.b).G0;
                if (i9Var == null) {
                    return true;
                }
                i9Var.H(p2Var);
                return true;
            case 12:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                R.showAsSheet(p2Var, n2Var);
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
            case 3:
                dialog.show();
                return dialog;
            case 4:
                i9 i9Var = ((f4) this.b).G0;
                if (i9Var != null) {
                    i9Var.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
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
    public x1(org.telegram.ui.ActionBar.p2 p2Var) {
        super(null);
        this.a = 1;
        this.b = p2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(k4 k4Var) {
        super(null);
        int i10;
        this.a = 11;
        this.b = k4Var;
        i10 = ((h3) k4Var).currentAccount;
        this.currentAccount = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(org.telegram.ui.web.a1 a1Var) {
        super(null);
        this.a = 10;
        this.b = a1Var;
        this.currentAccount = a1Var.J;
    }
}
