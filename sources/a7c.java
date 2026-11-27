// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class a7c extends c79 {
    public final Context c;
    public final /* synthetic */ TwoStepVerificationActivity d;

    public a7c(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 0;
    }

    @Override // j79
    public final int b() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (twoStepVerificationActivity.H || twoStepVerificationActivity.J == null) {
            return 0;
        }
        return twoStepVerificationActivity.U;
    }

    @Override // j79
    public final int d(int i) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        return (i == twoStepVerificationActivity.Q || i == twoStepVerificationActivity.T) ? 1 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3;
        int i4 = f89Var.f;
        View view = f89Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i4 != 0) {
            if (i4 == 1) {
                ilb ilbVar = (ilb) view;
                if (i == twoStepVerificationActivity.Q) {
                    ilbVar.setText(ob6.M0(2131745276, null));
                    return;
                } else {
                    if (i == twoStepVerificationActivity.T) {
                        ilbVar.setText(ob6.M0(2131751107, null));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        qmb qmbVar = (qmb) view;
        int i5 = aob.G6;
        qmbVar.setTag(Integer.valueOf(i5));
        yob.X(qmbVar.getTextView(), i5, null);
        i2 = twoStepVerificationActivity.changePasswordRow;
        if (i == i2) {
            qmbVar.b(ob6.M0(2131752522, null), true);
            return;
        }
        if (i == twoStepVerificationActivity.P) {
            qmbVar.b(ob6.M0(2131745277, null), true);
            return;
        }
        i3 = twoStepVerificationActivity.turnPasswordOffRow;
        if (i == i3) {
            qmbVar.b(ob6.M0(2131743597, null), true);
        } else if (i == twoStepVerificationActivity.S) {
            qmbVar.b(ob6.M0(2131752512, null), false);
        } else if (i == twoStepVerificationActivity.R) {
            qmbVar.b(ob6.M0(2131745243, null), false);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View qmbVar;
        Context context = this.c;
        if (i != 0) {
            qmbVar = new ilb(context);
        } else {
            qmbVar = new qmb(context);
            yob.h(aob.d6, null, qmbVar);
        }
        return new n69(qmbVar);
    }
}
