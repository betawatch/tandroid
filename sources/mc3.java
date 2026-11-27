// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mc3 {
    public final String a;
    public int b;
    public long c;
    public final vz6 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ nc3 g;

    public mc3(nc3 nc3Var, String str, int i, vz6 vz6Var) {
        this.g = nc3Var;
        this.a = str;
        this.b = i;
        this.c = vz6Var == null ? -1L : vz6Var.d;
        if (vz6Var == null || !vz6Var.c()) {
            return;
        }
        this.d = vz6Var;
    }

    public final boolean a(uj ujVar) {
        vz6 vz6Var = ujVar.d;
        asb asbVar = ujVar.b;
        if (vz6Var == null) {
            return this.b != ujVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (vz6Var.d > j) {
            return true;
        }
        vz6 vz6Var2 = this.d;
        if (vz6Var2 == null) {
            return false;
        }
        int i = vz6Var2.b;
        int b = asbVar.b(vz6Var.a);
        int b2 = asbVar.b(vz6Var2.a);
        if (vz6Var.d < vz6Var2.d || b < b2) {
            return false;
        }
        if (b > b2) {
            return true;
        }
        if (!vz6Var.c()) {
            int i2 = vz6Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = vz6Var.b;
        int i4 = vz6Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > vz6Var2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(asb asbVar, asb asbVar2) {
        vz6 vz6Var;
        int i = this.b;
        if (i < asbVar.o()) {
            nc3 nc3Var = this.g;
            zrb zrbVar = nc3Var.a;
            asbVar.n(i, zrbVar);
            for (int i2 = zrbVar.m; i2 <= zrbVar.n; i2++) {
                int b = asbVar2.b(asbVar.l(i2));
                if (b != -1) {
                    i = asbVar2.f(b, nc3Var.b, false).c;
                    break;
                }
            }
            i = -1;
        }
        this.b = i;
        return i != -1 && ((vz6Var = this.d) == null || asbVar2.b(vz6Var.a) != -1);
    }
}
