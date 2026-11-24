// default package

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fq1 implements xb2 {
    public final /* synthetic */ mu1 a;

    public fq1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override // xb2
    public final void dismiss() {
        this.a.j0.U(null, null);
    }

    @Override // xb2
    public final void i() {
        mu1 mu1Var = this.a;
        mu1Var.tc(true);
        u21.A(mu1Var, mu1Var.getMessagesController().n2(mu1Var.l6, mu1Var.d(), null), mu1Var.Ba).j();
    }

    @Override // xb2
    public final void l() {
        mu1 mu1Var = this.a;
        if (mu1Var.l6 == 0 || mu1Var.g4 == 3) {
            return;
        }
        if (mu1Var.f != null) {
            mu1Var.getMessagesController().Z3(mu1Var.f, true, false);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", mu1Var.l6);
        if (mu1Var.d() != 0) {
            bundle.putLong("topic_id", mu1Var.d());
        }
        mu1Var.presentFragment(new pr8(bundle, mu1Var.Ba));
    }

    @Override // xb2
    public final void n() {
        int i;
        mu1 mu1Var = this.a;
        i = ((d) mu1Var).currentAccount;
        SharedPreferences sharedPreferences = na7.q1(i).W3;
        boolean z = sharedPreferences.getBoolean("sound_enabled_" + im7.p(mu1Var.l6, mu1Var.d(), false), true);
        boolean z2 = !z;
        sharedPreferences.edit().putBoolean("sound_enabled_" + im7.p(mu1Var.l6, mu1Var.d(), false), z2).apply();
        if (u21.a(mu1Var)) {
            u21.S(z ? 1 : 0, mu1Var.getResourceProvider(), mu1Var).j();
        }
        mu1Var.kd(false);
    }

    @Override // xb2
    public final void p(int i) {
        mu1 mu1Var = this.a;
        if (i != 0) {
            mu1Var.getNotificationsController().H(mu1Var.l6, i, mu1Var.d());
            if (u21.a(mu1Var)) {
                u21.z(mu1Var, 5, i, mu1Var.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (mu1Var.getMessagesController().n2(mu1Var.l6, mu1Var.d(), null)) {
            mu1Var.tc(true);
        }
        if (u21.a(mu1Var)) {
            u21.z(mu1Var, 4, i, mu1Var.getResourceProvider()).j();
        }
    }

    @Override // xb2
    public final void a() {
    }
}
