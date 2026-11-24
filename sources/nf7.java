// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nf7 implements fv9 {
    public final long a;
    public final of7[] b;
    public final int c;

    public nf7(long j, of7[] of7VarArr, int i) {
        this.a = j;
        this.b = of7VarArr;
        this.c = i;
    }

    @Override // fv9
    public final boolean c() {
        return true;
    }

    @Override // fv9
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ab  */
    @Override // fv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ev9 f(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        int b;
        of7[] of7VarArr = this.b;
        int length = of7VarArr.length;
        hv9 hv9Var = hv9.c;
        if (length == 0) {
            return new ev9(hv9Var, hv9Var);
        }
        int i2 = this.c;
        if (i2 != -1) {
            xxb xxbVar = of7VarArr[i2].b;
            int a = xxbVar.a(j);
            if (a == -1) {
                a = xxbVar.b(j);
            }
            long[] jArr = xxbVar.c;
            long[] jArr2 = xxbVar.f;
            if (a == -1) {
                return new ev9(hv9Var, hv9Var);
            }
            j3 = jArr2[a];
            j2 = jArr[a];
            if (j3 < j && a < xxbVar.b - 1 && (b = xxbVar.b(j)) != -1 && b != a) {
                j5 = jArr2[b];
                j4 = jArr[b];
                long j6 = j2;
                for (i = 0; i < of7VarArr.length; i++) {
                    if (i != i2) {
                        xxb xxbVar2 = of7VarArr[i].b;
                        long[] jArr3 = xxbVar2.c;
                        int a2 = xxbVar2.a(j3);
                        if (a2 == -1) {
                            a2 = xxbVar2.b(j3);
                        }
                        if (a2 != -1) {
                            j6 = Math.min(jArr3[a2], j6);
                        }
                        if (j5 != -9223372036854775807L) {
                            int a3 = xxbVar2.a(j5);
                            if (a3 == -1) {
                                a3 = xxbVar2.b(j5);
                            }
                            if (a3 != -1) {
                                j4 = Math.min(jArr3[a3], j4);
                            }
                        }
                    }
                }
                hv9 hv9Var2 = new hv9(j3, j6);
                return j5 != -9223372036854775807L ? new ev9(hv9Var2, hv9Var2) : new ev9(hv9Var2, new hv9(j5, j4));
            }
        } else {
            j2 = Long.MAX_VALUE;
            j3 = j;
        }
        j4 = -1;
        j5 = -9223372036854775807L;
        long j62 = j2;
        while (i < of7VarArr.length) {
        }
        hv9 hv9Var22 = new hv9(j3, j62);
        if (j5 != -9223372036854775807L) {
        }
    }

    @Override // fv9
    public final long h() {
        return this.a;
    }
}
