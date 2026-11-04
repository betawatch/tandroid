package oi;

import com.google.android.gms.internal.play_billing.s0;
import mi.h0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class m {
    public final h0 a;
    public final long b;

    public m(o oVar, h0 h0Var) {
        long length;
        this.a = h0Var;
        long length2 = ((oVar.b.length() + oVar.a.length()) * 2) + 128;
        s0 s0Var = (s0) h0Var.b;
        if (s0Var == null) {
            length = 1024;
        } else {
            length = (((int[]) s0Var.b) == null ? 0L : ((int[]) s0Var.b).length * 4) + (((int[]) s0Var.c).length * 4) + 64;
        }
        this.b = length2 + length;
    }
}
