// default package

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ly3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t14 b;

    public /* synthetic */ ly3(t14 t14Var, byte b) {
        this.a = b;
        this.b = t14Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t14 t14Var = this.b;
        switch (b) {
            case 0:
                t14Var.Y(false);
                t14Var.C();
                break;
            case 1:
                d04 d04Var = t14Var.S;
                if (d04Var != null) {
                    d04Var.F(true);
                    break;
                }
                break;
            case 2:
                u04 u04Var = t14Var.u1;
                if (u04Var != null) {
                    u04Var.s(t14Var.S.h);
                    break;
                }
                break;
            case 3:
                u04 u04Var2 = t14Var.u1;
                if (u04Var2 != null) {
                    u04Var2.p();
                    break;
                }
                break;
            case 4:
                t14Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", y6c.h(t14Var.d1).e());
                t14Var.Z1.presentFragment(new sz3(bundle));
                break;
            default:
                ArrayList<h04> emojipacks = t14Var.getEmojipacks();
                for (int i = 0; i < emojipacks.size(); i++) {
                    if (emojipacks.get(i).i) {
                        SparseIntArray sparseIntArray = t14Var.S.s;
                        char[] cArr = ow3.a;
                        int i2 = sparseIntArray.get(i + 8);
                        t14Var.Q.D0();
                        t14Var.V(i2);
                        t14Var.E(i2, gl.L(-9.0f));
                        t14Var.j(0, null);
                    }
                }
                break;
        }
    }
}
