// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o61 extends r51 {
    public final /* synthetic */ p61 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(p61 p61Var, Context context) {
        super(context, 11, r51.a0, 0, r51.b0);
        this.f0 = p61Var;
    }

    @Override // r51
    public final void c(int i, boolean z) {
        r61 r61Var = (r61) this.f0.f;
        if (!z) {
            r61Var.b.m1();
            return;
        }
        int i2 = -1;
        if (i == 8) {
            i = -1;
        }
        int i3 = 0;
        while (true) {
            if (i3 < r61Var.g0.size()) {
                n61 n61Var = (n61) r61Var.g0.get(i3);
                if (n61Var != null && n61Var.a == 11 && n61Var.f == i) {
                    i2 = i3;
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        if (i2 >= 0) {
            r61Var.b.f1(new pf(i2, (byte) 2), 0, true);
        } else {
            r61Var.b.m1();
        }
    }
}
