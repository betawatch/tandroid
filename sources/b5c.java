// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b5c extends q59 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public b5c(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 0;
    }

    @Override // y59
    public final int b() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.H || twoStepVerificationActivity.J == null) {
            return 0;
        }
        return twoStepVerificationActivity.U;
    }

    @Override // y59
    public final int d(int i) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i == twoStepVerificationActivity.Q || i == twoStepVerificationActivity.T) ? 1 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3;
        int i4 = u69Var.f;
        View view = u69Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i4 != 0) {
            if (i4 == 1) {
                njb njbVar = (njb) view;
                if (i == twoStepVerificationActivity.Q) {
                    njbVar.setText(jb6.M0(2131745282, null));
                    return;
                } else {
                    if (i == twoStepVerificationActivity.T) {
                        njbVar.setText(jb6.M0(2131751079, null));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        vkb vkbVar = (vkb) view;
        int i5 = cmb.F6;
        vkbVar.setTag(Integer.valueOf(i5));
        anb.X(vkbVar.getTextView(), i5, null);
        i2 = twoStepVerificationActivity.changePasswordRow;
        if (i == i2) {
            vkbVar.b(jb6.M0(2131752494, null), true);
            return;
        }
        if (i == twoStepVerificationActivity.P) {
            vkbVar.b(jb6.M0(2131745283, null), true);
            return;
        }
        i3 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i == i3) {
            vkbVar.b(jb6.M0(2131743629, null), true);
        } else if (i == twoStepVerificationActivity.S) {
            vkbVar.b(jb6.M0(2131752484, null), false);
        } else if (i == twoStepVerificationActivity.R) {
            vkbVar.b(jb6.M0(2131745249, null), false);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View vkbVar;
        Context context = this.c;
        if (i != 0) {
            vkbVar = new njb(context);
        } else {
            vkbVar = new vkb(context);
            anb.h(cmb.c6, null, vkbVar);
        }
        return new b59(vkbVar);
    }
}
