package bg;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fh.u6;
import gh.k5;
import ih.i4;
import ih.m9;
import ih.q4;
import kh.g6;
import kh.p5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.yu;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i1 extends org.telegram.ui.ActionBar.o2 {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(Object obj, int i9) {
        super(null);
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public View createView(Context context) {
        switch (this.a) {
            case 10:
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
            case 2:
                return ((k5) this.b).getContext();
            case 3:
            case 5:
            default:
                return super.getContext();
            case 4:
                return ((q4) this.b).b.getContext();
            case 6:
                return ((g6) this.b).getContext();
            case 7:
                return ((st) this.b).a.getContext();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public int getCurrentAccount() {
        switch (this.a) {
            case 2:
                return this.currentAccount;
            case 3:
            case 5:
            case 10:
            case 11:
            default:
                return super.getCurrentAccount();
            case 4:
                return this.currentAccount;
            case 6:
                return this.currentAccount;
            case 7:
                return this.currentAccount;
            case 8:
                return this.currentAccount;
            case 9:
                return ((nx) this.b).A.Y0;
            case 12:
                return this.currentAccount;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.a) {
            case 8:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((yu) this.b).x).containerView;
                return viewGroup;
            case 9:
                return ((nx) this.b).A.r;
            case 10:
            case 11:
            default:
                return super.getFragmentView();
            case 12:
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((zf.k1) this.b)).containerView;
                return viewGroup2;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 8:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((yu) this.b).x).containerView;
                return (FrameLayout) viewGroup;
            case 9:
                return ((nx) this.b).A.r;
            case 10:
            case 11:
            default:
                return super.getLayoutContainer();
            case 12:
                return ((zf.k1) this.b).I0;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public Activity getParentActivity() {
        switch (this.a) {
            case 0:
                return ((org.telegram.ui.ActionBar.o2) this.b).getParentActivity();
            case 1:
                u6 u6Var = (u6) this.b;
                Activity ownerActivity = u6Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.C1;
                }
                return ownerActivity == null ? AndroidUtilities.findActivity(u6Var.getContext()) : ownerActivity;
            case 2:
                for (Context context = ((k5) this.b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 3:
                Activity findActivity = AndroidUtilities.findActivity(((i4) this.b).getContext());
                return findActivity == null ? LaunchActivity.C1 : findActivity;
            case 4:
            case 8:
            case 9:
            case 10:
            default:
                return super.getParentActivity();
            case 5:
                return LaunchActivity.C1;
            case 6:
                return AndroidUtilities.findActivity(((g6) this.b).getContext());
            case 7:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 11:
                return ((org.telegram.ui.web.y0) this.b).S;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var = ((zf.k1) this.b).p0;
                if (o2Var == null) {
                    return null;
                }
                return o2Var.getParentActivity();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public b6 getResourceProvider() {
        b6 b6Var;
        b6 b6Var2;
        b6 b6Var3;
        switch (this.a) {
            case 0:
                return new org.telegram.ui.Cells.e3(new ih.b());
            case 1:
                b6Var = ((org.telegram.ui.ActionBar.f3) ((u6) this.b)).resourcesProvider;
                return b6Var;
            case 2:
            case 7:
            case 10:
            default:
                return super.getResourceProvider();
            case 3:
                return new ih.n2(0, ((i4) this.b).x0);
            case 4:
                return ((q4) this.b).b.s;
            case 5:
                b6Var2 = ((org.telegram.ui.ActionBar.f3) ((p5) this.b)).resourcesProvider;
                return new ih.n2(5, b6Var2);
            case 6:
                return ((g6) this.b).C1;
            case 8:
                b6Var3 = ((org.telegram.ui.ActionBar.f3) ((yu) this.b).x).resourcesProvider;
                return b6Var3;
            case 9:
                return ((nx) this.b).A.V1;
            case 11:
                return new ih.n2(9, ((org.telegram.ui.web.y0) this.b).e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public Dialog getVisibleDialog() {
        switch (this.a) {
            case 7:
                return new rt(this, ((st) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public boolean isLightStatusBar() {
        switch (this.a) {
            case 0:
                return false;
            case 3:
                return false;
            case 5:
                return false;
            case 11:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.a) {
            case 10:
                if (z10 && z11) {
                    ((gc0) this.b).dismiss();
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
            case 0:
                return false;
            case 3:
                m9 m9Var = ((i4) this.b).F0;
                if (m9Var == null) {
                    return true;
                }
                m9Var.H(o2Var);
                return true;
            case 6:
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
            case 2:
                dialog.show();
                return dialog;
            case 3:
                m9 m9Var = ((i4) this.b).F0;
                if (m9Var != null) {
                    m9Var.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 5:
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
    public i1(org.telegram.ui.ActionBar.o2 o2Var) {
        super(null);
        this.a = 0;
        this.b = o2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(p5 p5Var) {
        super(null);
        int i9;
        this.a = 5;
        this.b = p5Var;
        i9 = ((org.telegram.ui.ActionBar.f3) p5Var).currentAccount;
        this.currentAccount = i9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(org.telegram.ui.web.y0 y0Var) {
        super(null);
        this.a = 11;
        this.b = y0Var;
        this.currentAccount = y0Var.I;
    }
}
