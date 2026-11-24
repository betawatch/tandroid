// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class my implements hf3 {
    public final char a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public my(byte b) {
        this('*');
        switch (b) {
            case 1:
                this('_');
                break;
            default:
                break;
        }
    }

    @Override // hf3
    public final void a(vib vibVar, vib vibVar2, int i) {
        String.valueOf(this.a);
        f34 f34Var = i == 1 ? new f34((byte) 0) : new f34((byte) 3);
        ui6 ui6Var = (ui6) vibVar.f;
        while (ui6Var != null && ui6Var != vibVar2) {
            ui6 ui6Var2 = (ui6) ui6Var.f;
            f34Var.b(ui6Var);
            ui6Var = ui6Var2;
        }
        f34Var.g();
        ui6 ui6Var3 = (ui6) vibVar.f;
        f34Var.f = ui6Var3;
        if (ui6Var3 != null) {
            ui6Var3.e = f34Var;
        }
        f34Var.e = vibVar;
        vibVar.f = f34Var;
        ui6 ui6Var4 = (ui6) vibVar.b;
        f34Var.b = ui6Var4;
        if (((ui6) f34Var.f) == null) {
            ui6Var4.d = f34Var;
        }
    }

    @Override // hf3
    public final char b() {
        return this.a;
    }

    @Override // hf3
    public final int c() {
        return 1;
    }

    @Override // hf3
    public final int d(gf3 gf3Var, gf3 gf3Var2) {
        if (gf3Var.d || gf3Var2.c) {
            int i = gf3Var2.h;
            if (i % 3 != 0 && (gf3Var.h + i) % 3 == 0) {
                return 0;
            }
        }
        return (gf3Var.g < 2 || gf3Var2.g < 2) ? 1 : 2;
    }

    @Override // hf3
    public final char e() {
        return this.a;
    }

    public my(char c) {
        this.a = c;
    }
}
