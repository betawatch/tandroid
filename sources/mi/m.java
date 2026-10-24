package mi;

import com.google.android.gms.internal.play_billing.s0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
