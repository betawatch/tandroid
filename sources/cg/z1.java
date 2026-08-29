package cg;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ih.e6;
import jh.h5;
import lh.d4;
import lh.i9;
import lh.m4;
import nh.c5;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.yt;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z1 extends org.telegram.ui.ActionBar.o2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(Object obj, int i10) {
        super(null);
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public View createView(Context context) {
        switch (this.a) {
            case 11:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            default:
                return super.createView(context);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public Context getContext() {
        switch (this.a) {
            case 3:
                return ((h5) this.b).getContext();
            case 4:
            case 6:
            default:
                return super.getContext();
            case 5:
                return ((m4) this.b).b.getContext();
            case 7:
                return ((t5) this.b).getContext();
            case 8:
                return ((yt) this.b).a.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public int getCurrentAccount() {
        switch (this.a) {
            case 0:
                return this.currentAccount;
            case 1:
            case 2:
            case 4:
            case 6:
            default:
                return super.getCurrentAccount();
            case 3:
                return this.currentAccount;
            case 5:
                return this.currentAccount;
            case 7:
                return this.currentAccount;
            case 8:
                return this.currentAccount;
            case 9:
                return this.currentAccount;
            case 10:
                return ((vx) this.b).A.Y0;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                viewGroup = ((f3) ((f2) this.b)).containerView;
                return viewGroup;
            case 9:
                viewGroup2 = ((f3) ((ev) this.b).x).containerView;
                return viewGroup2;
            case 10:
                return ((vx) this.b).A.r;
            default:
                return super.getFragmentView();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                return ((f2) this.b).I0;
            case 9:
                viewGroup = ((f3) ((ev) this.b).x).containerView;
                return (FrameLayout) viewGroup;
            case 10:
                return ((vx) this.b).A.r;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.l50
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.o2 o2Var = ((f2) this.b).p0;
                if (o2Var == null) {
                    return null;
                }
                return o2Var.getParentActivity();
            case 1:
                return ((org.telegram.ui.ActionBar.o2) this.b).getParentActivity();
            case 2:
                e6 e6Var = (e6) this.b;
                Activity ownerActivity = e6Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.C1;
                }
                return ownerActivity == null ? AndroidUtilities.findActivity(e6Var.getContext()) : ownerActivity;
            case 3:
                for (Context context = ((h5) this.b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 4:
                Activity findActivity = AndroidUtilities.findActivity(((d4) this.b).getContext());
                return findActivity == null ? LaunchActivity.C1 : findActivity;
            case 5:
            case 9:
            case 10:
            case 11:
            default:
                return super.getParentActivity();
            case 6:
                return LaunchActivity.C1;
            case 7:
                return AndroidUtilities.findActivity(((t5) this.b).getContext());
            case 8:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 12:
                return ((org.telegram.ui.web.z0) this.b).S;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public c6 getResourceProvider() {
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        switch (this.a) {
            case 1:
                return new oc.i(new lh.b());
            case 2:
                c6Var = ((f3) ((e6) this.b)).resourcesProvider;
                return c6Var;
            case 3:
            case 8:
            case 11:
            default:
                return super.getResourceProvider();
            case 4:
                return new lh.l2(0, ((d4) this.b).x0);
            case 5:
                return ((m4) this.b).b.s;
            case 6:
                c6Var2 = ((f3) ((c5) this.b)).resourcesProvider;
                return new lh.l2(5, c6Var2);
            case 7:
                return ((t5) this.b).C1;
            case 9:
                c6Var3 = ((f3) ((ev) this.b).x).resourcesProvider;
                return c6Var3;
            case 10:
                return ((vx) this.b).A.V1;
            case 12:
                return new lh.l2(9, ((org.telegram.ui.web.z0) this.b).e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 8:
                return new xt(this, ((yt) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public boolean isLightStatusBar() {
        switch (this.a) {
            case 1:
                return false;
            case 4:
                return false;
            case 6:
                return false;
            case 12:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.a) {
            case 11:
                if (z10 && z11) {
                    ((vc0) this.b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        switch (this.a) {
            case 1:
                return false;
            case 4:
                i9 i9Var = ((d4) this.b).F0;
                if (i9Var == null) {
                    return true;
                }
                i9Var.H(o2Var);
                return true;
            case 7:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                R.showAsSheet(o2Var, m2Var);
                return true;
            default:
                return super.presentFragment(o2Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 0:
                dialog.show();
                return dialog;
            case 3:
                dialog.show();
                return dialog;
            case 4:
                i9 i9Var = ((d4) this.b).F0;
                if (i9Var != null) {
                    i9Var.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 6:
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
    public z1(org.telegram.ui.ActionBar.o2 o2Var) {
        super(null);
        this.a = 1;
        this.b = o2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(c5 c5Var) {
        super(null);
        int i10;
        this.a = 6;
        this.b = c5Var;
        i10 = ((f3) c5Var).currentAccount;
        this.currentAccount = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(org.telegram.ui.web.z0 z0Var) {
        super(null);
        this.a = 12;
        this.b = z0Var;
        this.currentAccount = z0Var.I;
    }
}
