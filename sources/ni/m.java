package ni;

import com.google.android.gms.internal.play_billing.s0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
