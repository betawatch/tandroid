package ag;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import gh.m6;
import hh.i5;
import jh.e4;
import jh.i9;
import jh.m4;
import lh.f6;
import lh.o5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.xu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r2 extends org.telegram.ui.ActionBar.n2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(Object obj, int i10) {
        super(null);
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public Context getContext() {
        switch (this.a) {
            case 3:
                return ((i5) this.b).getContext();
            case 4:
            case 6:
            default:
                return super.getContext();
            case 5:
                return ((m4) this.b).b.getContext();
            case 7:
                return ((f6) this.b).getContext();
            case 8:
                return ((rt) this.b).a.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
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
                return ((ox) this.b).A.Y0;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 0:
                viewGroup = ((org.telegram.ui.ActionBar.e3) ((y2) this.b)).containerView;
                return viewGroup;
            case 9:
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) ((xu) this.b).x).containerView;
                return viewGroup2;
            case 10:
                return ((ox) this.b).A.r;
            default:
                return super.getFragmentView();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                return ((y2) this.b).I0;
            case 9:
                viewGroup = ((org.telegram.ui.ActionBar.e3) ((xu) this.b).x).containerView;
                return (FrameLayout) viewGroup;
            case 10:
                return ((ox) this.b).A.r;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = ((y2) this.b).p0;
                if (n2Var == null) {
                    return null;
                }
                return n2Var.getParentActivity();
            case 1:
                return ((org.telegram.ui.ActionBar.n2) this.b).getParentActivity();
            case 2:
                m6 m6Var = (m6) this.b;
                Activity ownerActivity = m6Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.C1;
                }
                return ownerActivity == null ? AndroidUtilities.findActivity(m6Var.getContext()) : ownerActivity;
            case 3:
                for (Context context = ((i5) this.b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 4:
                Activity findActivity = AndroidUtilities.findActivity(((e4) this.b).getContext());
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
                return AndroidUtilities.findActivity(((f6) this.b).getContext());
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

    @Override // org.telegram.ui.ActionBar.n2
    public c6 getResourceProvider() {
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        switch (this.a) {
            case 1:
                return new i6(new jh.b());
            case 2:
                c6Var = ((org.telegram.ui.ActionBar.e3) ((m6) this.b)).resourcesProvider;
                return c6Var;
            case 3:
            case 8:
            case 11:
            default:
                return super.getResourceProvider();
            case 4:
                return new jh.m2(0, ((e4) this.b).x0);
            case 5:
                return ((m4) this.b).b.s;
            case 6:
                c6Var2 = ((org.telegram.ui.ActionBar.e3) ((o5) this.b)).resourcesProvider;
                return new jh.m2(5, c6Var2);
            case 7:
                return ((f6) this.b).C1;
            case 9:
                c6Var3 = ((org.telegram.ui.ActionBar.e3) ((xu) this.b).x).resourcesProvider;
                return c6Var3;
            case 10:
                return ((ox) this.b).A.V1;
            case 12:
                return new jh.m2(9, ((org.telegram.ui.web.z0) this.b).e);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 8:
                return new qt(this, ((rt) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.a) {
            case 11:
                if (z10 && z11) {
                    ((kc0) this.b).dismiss();
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
                return false;
            case 4:
                i9 i9Var = ((e4) this.b).F0;
                if (i9Var == null) {
                    return true;
                }
                i9Var.H(n2Var);
                return true;
            case 7:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                R.showAsSheet(n2Var, l2Var);
                return true;
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
            case 3:
                dialog.show();
                return dialog;
            case 4:
                i9 i9Var = ((e4) this.b).F0;
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
    public r2(org.telegram.ui.ActionBar.n2 n2Var) {
        super(null);
        this.a = 1;
        this.b = n2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(o5 o5Var) {
        super(null);
        int i10;
        this.a = 6;
        this.b = o5Var;
        i10 = ((org.telegram.ui.ActionBar.e3) o5Var).currentAccount;
        this.currentAccount = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(org.telegram.ui.web.z0 z0Var) {
        super(null);
        this.a = 12;
        this.b = z0Var;
        this.currentAccount = z0Var.I;
    }
}
