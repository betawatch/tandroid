package di;

import com.google.android.gms.internal.play_billing.s0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class o {
    public final n4.q a;
    public final long b;

    public o(q qVar, n4.q qVar2) {
        long length;
        this.a = qVar2;
        long length2 = ((qVar.b.length() + qVar.a.length()) * 2) + 128;
        s0 s0Var = (s0) qVar2.a;
        if (s0Var == null) {
            length = 1024;
        } else {
            length = (((int[]) s0Var.c) == null ? 0L : ((int[]) s0Var.c).length * 4) + (((int[]) s0Var.a).length * 4) + 64;
        }
        this.b = length2 + length;
    }
}
