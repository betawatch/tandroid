// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lx implements vd3 {
    public final char a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lx(byte b) {
        this('*');
        switch (b) {
            case 1:
                this('_');
                break;
            default:
                break;
        }
    }

    @Override // vd3
    public final void a(ugb ugbVar, ugb ugbVar2, int i) {
        String.valueOf(this.a);
        u14 u14Var = i == 1 ? new u14((byte) 0) : new u14((byte) 3);
        tg6 tg6Var = (tg6) ugbVar.f;
        while (tg6Var != null && tg6Var != ugbVar2) {
            tg6 tg6Var2 = (tg6) tg6Var.f;
            u14Var.b(tg6Var);
            tg6Var = tg6Var2;
        }
        u14Var.g();
        tg6 tg6Var3 = (tg6) ugbVar.f;
        u14Var.f = tg6Var3;
        if (tg6Var3 != null) {
            tg6Var3.e = u14Var;
        }
        u14Var.e = ugbVar;
        ugbVar.f = u14Var;
        tg6 tg6Var4 = (tg6) ugbVar.b;
        u14Var.b = tg6Var4;
        if (((tg6) u14Var.f) == null) {
            tg6Var4.d = u14Var;
        }
    }

    @Override // vd3
    public final char b() {
        return this.a;
    }

    @Override // vd3
    public final int c() {
        return 1;
    }

    @Override // vd3
    public final int d(ud3 ud3Var, ud3 ud3Var2) {
        if (ud3Var.d || ud3Var2.c) {
            int i = ud3Var2.h;
            if (i % 3 != 0 && (ud3Var.h + i) % 3 == 0) {
                return 0;
            }
        }
        return (ud3Var.g < 2 || ud3Var2.g < 2) ? 1 : 2;
    }

    @Override // vd3
    public final char e() {
        return this.a;
    }

    public lx(char c) {
        this.a = c;
    }
}
