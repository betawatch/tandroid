package mi;

import com.google.android.gms.internal.play_billing.s0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class m {
    public final q a;
    public final long b;

    public m(o oVar, q qVar) {
        long length;
        this.a = qVar;
        long length2 = ((oVar.b.length() + oVar.a.length()) * 2) + 128;
        s0 s0Var = (s0) qVar.b;
        if (s0Var == null) {
            length = 1024;
        } else {
            length = (((int[]) s0Var.b) == null ? 0L : ((int[]) s0Var.b).length * 4) + (((int[]) s0Var.c).length * 4) + 64;
        }
        this.b = length2 + length;
    }
}
