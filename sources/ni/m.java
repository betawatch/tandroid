package ni;

import com.google.android.gms.internal.play_billing.s0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m {
    public final m4.c a;
    public final long b;

    public m(o oVar, m4.c cVar) {
        long length;
        this.a = cVar;
        long length2 = ((oVar.b.length() + oVar.a.length()) * 2) + 128;
        s0 s0Var = (s0) cVar.b;
        if (s0Var == null) {
            length = 1024;
        } else {
            length = (((int[]) s0Var.b) == null ? 0L : ((int[]) s0Var.b).length * 4) + (((int[]) s0Var.c).length * 4) + 64;
        }
        this.b = length2 + length;
    }
}
