package ni;

import com.google.android.gms.internal.play_billing.s0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
