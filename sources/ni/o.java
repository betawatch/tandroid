package ni;

import com.google.android.gms.internal.play_billing.s0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class o {
    public final j2.n a;
    public final long b;

    public o(q qVar, j2.n nVar) {
        long length;
        this.a = nVar;
        long length2 = ((qVar.b.length() + qVar.a.length()) * 2) + 128;
        s0 s0Var = (s0) nVar.b;
        if (s0Var == null) {
            length = 1024;
        } else {
            length = (((int[]) s0Var.b) == null ? 0L : ((int[]) s0Var.b).length * 4) + (((int[]) s0Var.c).length * 4) + 64;
        }
        this.b = length2 + length;
    }
}
