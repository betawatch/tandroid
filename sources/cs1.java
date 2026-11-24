// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cs1 implements ws1 {
    public final /* synthetic */ mu1 a;
    public final /* synthetic */ mu1 b;

    public cs1(mu1 mu1Var, mu1 mu1Var2) {
        this.b = mu1Var;
        this.a = mu1Var2;
    }

    @Override // ws1
    public final void l(boolean z, boolean z2) {
        h11 h11Var;
        int i;
        mu1 mu1Var = this.b;
        if (!z) {
            k27 k27Var = (k27) mu1Var.X4.get(Integer.valueOf(mu1Var.Z4));
            if (k27Var == null) {
                k27Var = (k27) mu1Var.G6[0].get(mu1Var.Z4);
            }
            mu1Var.xc(k27Var);
            return;
        }
        ArrayList arrayList = new ArrayList(mu1Var.V4);
        ArrayList arrayList2 = new ArrayList(mu1Var.X4.values());
        m21 m21Var = null;
        if (z2) {
            i = ((d) mu1Var).currentAccount;
            SharedPreferences sharedPreferences = na7.q1(i).W3;
            if (mu1Var.V4.isEmpty()) {
                sharedPreferences.edit().remove("pin_" + mu1Var.l6).commit();
            } else {
                sharedPreferences.edit().putInt("pin_" + mu1Var.l6, ((Integer) mu1Var.V4.get(0)).intValue()).commit();
            }
            mu1Var.Uc(0, true);
        } else {
            mu1Var.getNotificationCenter().k(kk7.s0, Long.valueOf(mu1Var.l6), arrayList, Boolean.FALSE, null, null, 0, 0, Boolean.TRUE);
        }
        m21 m21Var2 = mu1Var.P3;
        if (m21Var2 != null) {
            m21Var2.b();
        }
        mu1Var.Q3 = true;
        int i2 = mu1Var.R3 + 1;
        mu1Var.R3 = i2;
        boolean z3 = mu1Var.x4;
        mu1 mu1Var2 = this.a;
        int U6 = z3 ? mu1Var2.U6() : mu1Var.U6();
        if (!mu1Var.x4) {
            mu1Var2 = mu1Var;
        }
        ArrayList arrayList3 = new ArrayList(mu1Var2.V4);
        m1a m1aVar = new m1a(this, z2, arrayList, arrayList2, U6, i2);
        bs1 bs1Var = new bs1(this, z2, arrayList3, i2);
        ku1 ku1Var = mu1Var.Ba;
        if (mu1Var.getParentActivity() == null) {
            bs1Var.run();
        } else {
            if (z2) {
                j21 j21Var = new j21(mu1Var.getParentActivity(), ku1Var);
                j21Var.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                j21Var.b.setText(k96.M0(2131747031, null));
                j21Var.c.setText(k96.M0(2131747030, null));
                h11Var = j21Var;
            } else {
                t11 t11Var = new t11(mu1Var.getParentActivity(), ku1Var);
                t11Var.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                t11Var.b.setText(k96.G(U6, "MessagesUnpinned", new Object[0]));
                h11Var = t11Var;
            }
            k21 k21Var = new k21(ku1Var, mu1Var.getParentActivity(), true);
            k21Var.b = m1aVar;
            k21Var.c = bs1Var;
            h11Var.setButton(k21Var);
            m21Var = m21.g(mu1Var, h11Var, 5000);
        }
        mu1Var.P3 = m21Var;
    }

    @Override // ws1
    public final void m(String str) {
        this.b.ia(str, false);
    }

    @Override // ws1
    public final void p(int i) {
        this.b.J(i, 0, 0, 0, true, true);
    }
}
