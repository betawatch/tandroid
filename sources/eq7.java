// default package

import android.view.View;
import android.widget.TextView;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class eq7 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iq7 b;

    public /* synthetic */ eq7(iq7 iq7Var, byte b) {
        this.a = b;
        this.b = iq7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        iq7 iq7Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                TextView textView = iq7Var.u1;
                cs5 G = cs5.G(iq7Var.c, iq7Var.J0, textView);
                int[] iArr = iq7.z1;
                for (int i = 0; i < 6; i++) {
                    int i2 = iArr[i];
                    G.h(new on7(iq7Var, i2, b2), k96.G(i2 / 3600, "GiftOfferHours", new Object[0]), i2 == iq7Var.x1);
                }
                G.W(5);
                iq7Var.B0(textView, G, true);
                break;
            case 1:
                iq7 iq7Var2 = this.b;
                u41 u41Var = iq7Var2.v1;
                if (u41Var.e0 && !u41Var.R) {
                    if (na7.q1(iq7Var2.a).t2()) {
                        h5.b(iq7Var2.a);
                        break;
                    } else {
                        gl.t1(iq7Var2.r1);
                        long j = iq7Var2.w1;
                        int i3 = iq7Var2.x1;
                        u41Var.setLoading(true);
                        int i4 = iq7Var2.a;
                        String str = iq7Var2.l1.slug;
                        gq7 gq7Var = new gq7(iq7Var2, j, i3, (byte) 0);
                        HashMap hashMap = vp7.a;
                        z3a.B(i4);
                        long D = z3a.D();
                        ad7 Y = ad7.Y(i4);
                        Y.a.c(new sb2(Y, D, str, j, i3, gq7Var));
                        break;
                    }
                }
                break;
            default:
                hmc.L0(iq7Var.a, iq7Var.J0, iq7Var.getContext());
                break;
        }
    }
}
