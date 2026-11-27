// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class mx implements pe3 {
    public final char a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mx(byte b) {
        this('*');
        switch (b) {
            case 1:
                this('_');
                break;
            default:
                break;
        }
    }

    @Override // pe3
    public final void a(qkb qkbVar, qkb qkbVar2, int i) {
        String.valueOf(this.a);
        p24 p24Var = i == 1 ? new p24((byte) 0) : new p24((byte) 3);
        yi6 yi6Var = (yi6) qkbVar.f;
        while (yi6Var != null && yi6Var != qkbVar2) {
            yi6 yi6Var2 = (yi6) yi6Var.f;
            p24Var.b(yi6Var);
            yi6Var = yi6Var2;
        }
        p24Var.g();
        yi6 yi6Var3 = (yi6) qkbVar.f;
        p24Var.f = yi6Var3;
        if (yi6Var3 != null) {
            yi6Var3.e = p24Var;
        }
        p24Var.e = qkbVar;
        qkbVar.f = p24Var;
        yi6 yi6Var4 = (yi6) qkbVar.b;
        p24Var.b = yi6Var4;
        if (((yi6) p24Var.f) == null) {
            yi6Var4.d = p24Var;
        }
    }

    @Override // pe3
    public final char b() {
        return this.a;
    }

    @Override // pe3
    public final int c() {
        return 1;
    }

    @Override // pe3
    public final int d(oe3 oe3Var, oe3 oe3Var2) {
        if (oe3Var.d || oe3Var2.c) {
            int i = oe3Var2.h;
            if (i % 3 != 0 && (oe3Var.h + i) % 3 == 0) {
                return 0;
            }
        }
        return (oe3Var.g < 2 || oe3Var2.g < 2) ? 1 : 2;
    }

    @Override // pe3
    public final char e() {
        return this.a;
    }

    public mx(char c) {
        this.a = c;
    }
}
