// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fd3 {
    public final String a;
    public int b;
    public long c;
    public final rz6 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ gd3 g;

    public fd3(gd3 gd3Var, String str, int i, rz6 rz6Var) {
        this.g = gd3Var;
        this.a = str;
        this.b = i;
        this.c = rz6Var == null ? -1L : rz6Var.d;
        if (rz6Var == null || !rz6Var.c()) {
            return;
        }
        this.d = rz6Var;
    }

    public final boolean a(tk tkVar) {
        rz6 rz6Var = tkVar.d;
        bqb bqbVar = tkVar.b;
        if (rz6Var == null) {
            return this.b != tkVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (rz6Var.d > j) {
            return true;
        }
        rz6 rz6Var2 = this.d;
        if (rz6Var2 == null) {
            return false;
        }
        int i = rz6Var2.b;
        int b = bqbVar.b(rz6Var.a);
        int b2 = bqbVar.b(rz6Var2.a);
        if (rz6Var.d < rz6Var2.d || b < b2) {
            return false;
        }
        if (b > b2) {
            return true;
        }
        if (!rz6Var.c()) {
            int i2 = rz6Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = rz6Var.b;
        int i4 = rz6Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > rz6Var2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(bqb bqbVar, bqb bqbVar2) {
        rz6 rz6Var;
        int i = this.b;
        if (i < bqbVar.o()) {
            gd3 gd3Var = this.g;
            aqb aqbVar = gd3Var.a;
            bqbVar.n(i, aqbVar);
            for (int i2 = aqbVar.m; i2 <= aqbVar.n; i2++) {
                int b = bqbVar2.b(bqbVar.l(i2));
                if (b != -1) {
                    i = bqbVar2.f(b, gd3Var.b, false).c;
                    break;
                }
            }
            i = -1;
        }
        this.b = i;
        return i != -1 && ((rz6Var = this.d) == null || bqbVar2.b(rz6Var.a) != -1);
    }
}
