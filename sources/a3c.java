// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class a3c extends n39 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public a3c(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 0;
    }

    @Override // w39
    public final int b() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.H || twoStepVerificationActivity.J == null) {
            return 0;
        }
        return twoStepVerificationActivity.U;
    }

    @Override // w39
    public final int d(int i) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i == twoStepVerificationActivity.Q || i == twoStepVerificationActivity.T) ? 1 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3;
        int i4 = s49Var.f;
        View view = s49Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i4 != 0) {
            if (i4 == 1) {
                mhb mhbVar = (mhb) view;
                if (i == twoStepVerificationActivity.Q) {
                    mhbVar.setText(k96.M0(2131745356, null));
                    return;
                } else {
                    if (i == twoStepVerificationActivity.T) {
                        mhbVar.setText(k96.M0(2131751130, null));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        uib uibVar = (uib) view;
        int i5 = bkb.F6;
        uibVar.setTag(Integer.valueOf(i5));
        zkb.X(uibVar.getTextView(), i5, null);
        i2 = twoStepVerificationActivity.changePasswordRow;
        if (i == i2) {
            uibVar.b(k96.M0(2131752529, null), true);
            return;
        }
        if (i == twoStepVerificationActivity.P) {
            uibVar.b(k96.M0(2131745357, null), true);
            return;
        }
        i3 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i == i3) {
            uibVar.b(k96.M0(2131743703, null), true);
        } else if (i == twoStepVerificationActivity.S) {
            uibVar.b(k96.M0(2131752519, null), false);
        } else if (i == twoStepVerificationActivity.R) {
            uibVar.b(k96.M0(2131745323, null), false);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View uibVar;
        Context context = this.c;
        if (i != 0) {
            uibVar = new mhb(context);
        } else {
            uibVar = new uib(context);
            zkb.h(bkb.c6, null, uibVar);
        }
        return new y29(uibVar);
    }
}
