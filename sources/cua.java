// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cua implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iua b;

    public /* synthetic */ cua(iua iuaVar, byte b) {
        this.a = b;
        this.b = iuaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        iua iuaVar = this.b;
        switch (b) {
            case 0:
                iuaVar.b();
                break;
            case 1:
                sua suaVar = iuaVar.a;
                if (!iuaVar.u) {
                    iuaVar.v = false;
                    if (iuaVar.o) {
                        iuaVar.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - iuaVar.m) / 1000.0f, 0.25f);
                        float f = iuaVar.n + min;
                        iuaVar.n = f;
                        float f2 = iuaVar.j.f(f > hl.R1(0.1f, 1.0f, iuaVar.t), min);
                        float f3 = iuaVar.k.f(iuaVar.n > hl.R1(0.1f, 1.0f, iuaVar.t), min);
                        float f4 = iuaVar.i.f(iuaVar.j.b(0.5f), min);
                        float f5 = iuaVar.h.f(iuaVar.j.b(0.5f) && iuaVar.i.b(0.5f), min);
                        iuaVar.m = currentTimeMillis;
                        if (iuaVar.j.c() && iuaVar.i.c() && iuaVar.h.c() && !iuaVar.p) {
                            iuaVar.p = true;
                            hl.c3(new cua(iuaVar, (byte) 2));
                        }
                        if (iuaVar.j.c() && iuaVar.i.c() && iuaVar.h.b(0.25f) && !iuaVar.q) {
                            iuaVar.q = true;
                            hl.c3(new cua(iuaVar, (byte) 3));
                        }
                        nua nuaVar = iuaVar.b;
                        if (nuaVar != null) {
                            eua euaVar = iuaVar.h;
                            dua duaVar = euaVar.b;
                            float f6 = euaVar.e - f5;
                            float f7 = f6 - 1.0f;
                            dua duaVar2 = euaVar.i;
                            boolean z = duaVar == duaVar2;
                            dua duaVar3 = euaVar.c;
                            boolean z2 = duaVar3 == duaVar2;
                            dua duaVar4 = euaVar.d;
                            nuaVar.a(duaVar, f7, z, duaVar3, f6, z2, duaVar4, f6 + 1.0f, duaVar4 == duaVar2);
                        }
                        nua nuaVar2 = iuaVar.c;
                        if (nuaVar2 != null) {
                            eua euaVar2 = iuaVar.i;
                            dua duaVar5 = euaVar2.b;
                            float f8 = euaVar2.e - f4;
                            float f9 = f8 - 1.0f;
                            dua duaVar6 = euaVar2.i;
                            boolean z3 = duaVar5 == duaVar6;
                            dua duaVar7 = euaVar2.c;
                            boolean z4 = duaVar7 == duaVar6;
                            dua duaVar8 = euaVar2.d;
                            nuaVar2.a(duaVar5, f9, z3, duaVar7, f8, z4, duaVar8, f8 + 1.0f, duaVar8 == duaVar6);
                        }
                        nua nuaVar3 = iuaVar.d;
                        if (nuaVar3 != null) {
                            eua euaVar3 = iuaVar.k;
                            dua duaVar9 = euaVar3.b;
                            float f10 = euaVar3.e - f3;
                            float f11 = f10 - 1.0f;
                            dua duaVar10 = euaVar3.i;
                            boolean z5 = duaVar9 == duaVar10;
                            dua duaVar11 = euaVar3.c;
                            boolean z6 = duaVar11 == duaVar10;
                            dua duaVar12 = euaVar3.d;
                            nuaVar3.a(duaVar9, f11, z5, duaVar11, f10, z6, duaVar12, f10 + 1.0f, duaVar12 == duaVar10);
                        }
                        suaVar.g(0, ((hua) iuaVar.i.c).c, true);
                        lua luaVar = suaVar.c;
                        eua euaVar4 = iuaVar.h;
                        dua duaVar13 = euaVar4.b;
                        gua guaVar = (gua) duaVar13;
                        float f12 = euaVar4.e - f5;
                        float f13 = f12 - 1.0f;
                        dua duaVar14 = euaVar4.i;
                        boolean z7 = duaVar13 == duaVar14;
                        dua duaVar15 = euaVar4.c;
                        gua guaVar2 = (gua) duaVar15;
                        boolean z8 = duaVar15 == duaVar14;
                        dua duaVar16 = euaVar4.d;
                        gua guaVar3 = (gua) duaVar16;
                        float f14 = f12 + 1.0f;
                        boolean z9 = duaVar16 == duaVar14;
                        eua euaVar5 = iuaVar.j;
                        fua fuaVar = (fua) euaVar5.b;
                        float f15 = euaVar5.e - f2;
                        fua fuaVar2 = (fua) euaVar5.c;
                        fua fuaVar3 = (fua) euaVar5.d;
                        luaVar.a = guaVar;
                        luaVar.b = guaVar2;
                        luaVar.c = guaVar3;
                        luaVar.d = f13;
                        luaVar.e = f12;
                        luaVar.f = f14;
                        luaVar.h = z7;
                        luaVar.n = z8;
                        luaVar.r = z9;
                        luaVar.s = fuaVar;
                        luaVar.w = fuaVar2;
                        luaVar.x = fuaVar3;
                        luaVar.y = f15 - 1.0f;
                        luaVar.E = f15;
                        luaVar.F = f15 + 1.0f;
                        luaVar.invalidate();
                        iuaVar.u = false;
                        iuaVar.b();
                        break;
                    }
                }
                break;
            case 2:
                iuaVar.o = false;
                iuaVar.a.c.c();
                jra jraVar = iuaVar.r;
                if (jraVar != null) {
                    jraVar.run();
                    break;
                }
                break;
            default:
                jra jraVar2 = iuaVar.s;
                if (jraVar2 != null) {
                    jraVar2.run();
                    break;
                }
                break;
        }
    }
}
