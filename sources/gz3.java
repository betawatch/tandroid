// default package

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gz3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o24 b;

    public /* synthetic */ gz3(o24 o24Var, byte b) {
        this.a = b;
        this.b = o24Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        o24 o24Var = this.b;
        switch (b) {
            case 0:
                o24Var.X(false);
                o24Var.C();
                break;
            case 1:
                y04 y04Var = o24Var.S;
                if (y04Var != null) {
                    y04Var.F(true);
                    break;
                }
                break;
            case 2:
                p14 p14Var = o24Var.u1;
                if (p14Var != null) {
                    p14Var.s(o24Var.S.h);
                    break;
                }
                break;
            case 3:
                ArrayList<c14> emojipacks = o24Var.getEmojipacks();
                for (int i = 0; i < emojipacks.size(); i++) {
                    if (emojipacks.get(i).i) {
                        SparseIntArray sparseIntArray = o24Var.S.s;
                        char[] cArr = jx3.a;
                        int i2 = sparseIntArray.get(i + 8);
                        o24Var.Q.E0();
                        o24Var.U(i2);
                        o24Var.E(i2, hl.L(-9.0f));
                        o24Var.j(0, null);
                    }
                }
                break;
            case 4:
                p14 p14Var2 = o24Var.u1;
                if (p14Var2 != null) {
                    p14Var2.p();
                    break;
                }
                break;
            default:
                o24Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", yac.h(o24Var.d1).e());
                o24Var.Z1.presentFragment(new n04(bundle));
                break;
        }
    }
}
