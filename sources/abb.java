// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class abb implements hf3 {
    @Override // hf3
    public final void a(vib vibVar, vib vibVar2, int i) {
        zab zabVar = new zab();
        ui6 ui6Var = (ui6) vibVar.f;
        while (ui6Var != null && ui6Var != vibVar2) {
            ui6 ui6Var2 = (ui6) ui6Var.f;
            zabVar.b(ui6Var);
            ui6Var = ui6Var2;
        }
        zabVar.g();
        ui6 ui6Var3 = (ui6) vibVar.f;
        zabVar.f = ui6Var3;
        if (ui6Var3 != null) {
            ui6Var3.e = zabVar;
        }
        zabVar.e = vibVar;
        vibVar.f = zabVar;
        ui6 ui6Var4 = (ui6) vibVar.b;
        zabVar.b = ui6Var4;
        if (((ui6) zabVar.f) == null) {
            ui6Var4.d = zabVar;
        }
    }

    @Override // hf3
    public final char b() {
        return '~';
    }

    @Override // hf3
    public final int c() {
        return 2;
    }

    @Override // hf3
    public final int d(gf3 gf3Var, gf3 gf3Var2) {
        return (gf3Var.g < 2 || gf3Var2.g < 2) ? 0 : 2;
    }

    @Override // hf3
    public final char e() {
        return '~';
    }
}
