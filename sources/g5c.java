// default package

import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class g5c {
    public final ta0 a;
    public final String b;
    public final n34 c;
    public final y2c d;
    public final h5c e;

    public g5c(ta0 ta0Var, String str, n34 n34Var, y2c y2cVar, h5c h5cVar) {
        this.a = ta0Var;
        this.b = str;
        this.c = n34Var;
        this.d = y2cVar;
        this.e = h5cVar;
    }

    public final void a(p90 p90Var, i5c i5cVar) {
        y2c y2cVar = this.d;
        if (y2cVar == null) {
            p3d.h("Null transformer");
            return;
        }
        h5c h5cVar = this.e;
        rc3 rc3Var = h5cVar.c;
        ta0 b = this.a.b(p90Var.c);
        q90 q90Var = new q90();
        q90Var.h = new HashMap();
        q90Var.f = Long.valueOf(h5cVar.a.e());
        q90Var.g = Long.valueOf(h5cVar.b.e());
        q90Var.a = this.b;
        q90Var.e = new j34(this.c, (byte[]) y2cVar.apply(p90Var.b));
        q90Var.c = p90Var.a;
        ja0 ja0Var = p90Var.d;
        if (ja0Var != null) {
            q90Var.d = ja0Var.a;
        }
        rc3Var.b.execute(new ao1(rc3Var, b, i5cVar, q90Var.b(), (byte) 12));
    }
}
