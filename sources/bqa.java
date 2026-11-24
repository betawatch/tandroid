// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class bqa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hqa b;

    public /* synthetic */ bqa(hqa hqaVar, byte b) {
        this.a = b;
        this.b = hqaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hqa hqaVar = this.b;
        switch (b) {
            case 0:
                hqaVar.b();
                break;
            case 1:
                rqa rqaVar = hqaVar.a;
                if (!hqaVar.u) {
                    hqaVar.v = false;
                    if (hqaVar.o) {
                        hqaVar.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - hqaVar.m) / 1000.0f, 0.25f);
                        float f = hqaVar.n + min;
                        hqaVar.n = f;
                        float f2 = hqaVar.j.f(f > gl.R1(0.1f, 1.0f, hqaVar.t), min);
                        float f3 = hqaVar.k.f(hqaVar.n > gl.R1(0.1f, 1.0f, hqaVar.t), min);
                        float f4 = hqaVar.i.f(hqaVar.j.b(0.5f), min);
                        float f5 = hqaVar.h.f(hqaVar.j.b(0.5f) && hqaVar.i.b(0.5f), min);
                        hqaVar.m = currentTimeMillis;
                        if (hqaVar.j.c() && hqaVar.i.c() && hqaVar.h.c() && !hqaVar.p) {
                            hqaVar.p = true;
                            gl.c3(new bqa(hqaVar, (byte) 2));
                        }
                        if (hqaVar.j.c() && hqaVar.i.c() && hqaVar.h.b(0.25f) && !hqaVar.q) {
                            hqaVar.q = true;
                            gl.c3(new bqa(hqaVar, (byte) 3));
                        }
                        mqa mqaVar = hqaVar.b;
                        if (mqaVar != null) {
                            dqa dqaVar = hqaVar.h;
                            cqa cqaVar = dqaVar.b;
                            float f6 = dqaVar.e - f5;
                            float f7 = f6 - 1.0f;
                            cqa cqaVar2 = dqaVar.i;
                            boolean z = cqaVar == cqaVar2;
                            cqa cqaVar3 = dqaVar.c;
                            boolean z2 = cqaVar3 == cqaVar2;
                            cqa cqaVar4 = dqaVar.d;
                            mqaVar.a(cqaVar, f7, z, cqaVar3, f6, z2, cqaVar4, f6 + 1.0f, cqaVar4 == cqaVar2);
                        }
                        mqa mqaVar2 = hqaVar.c;
                        if (mqaVar2 != null) {
                            dqa dqaVar2 = hqaVar.i;
                            cqa cqaVar5 = dqaVar2.b;
                            float f8 = dqaVar2.e - f4;
                            float f9 = f8 - 1.0f;
                            cqa cqaVar6 = dqaVar2.i;
                            boolean z3 = cqaVar5 == cqaVar6;
                            cqa cqaVar7 = dqaVar2.c;
                            boolean z4 = cqaVar7 == cqaVar6;
                            cqa cqaVar8 = dqaVar2.d;
                            mqaVar2.a(cqaVar5, f9, z3, cqaVar7, f8, z4, cqaVar8, f8 + 1.0f, cqaVar8 == cqaVar6);
                        }
                        mqa mqaVar3 = hqaVar.d;
                        if (mqaVar3 != null) {
                            dqa dqaVar3 = hqaVar.k;
                            cqa cqaVar9 = dqaVar3.b;
                            float f10 = dqaVar3.e - f3;
                            float f11 = f10 - 1.0f;
                            cqa cqaVar10 = dqaVar3.i;
                            boolean z5 = cqaVar9 == cqaVar10;
                            cqa cqaVar11 = dqaVar3.c;
                            boolean z6 = cqaVar11 == cqaVar10;
                            cqa cqaVar12 = dqaVar3.d;
                            mqaVar3.a(cqaVar9, f11, z5, cqaVar11, f10, z6, cqaVar12, f10 + 1.0f, cqaVar12 == cqaVar10);
                        }
                        rqaVar.g(0, ((gqa) hqaVar.i.c).c, true);
                        kqa kqaVar = rqaVar.c;
                        dqa dqaVar4 = hqaVar.h;
                        cqa cqaVar13 = dqaVar4.b;
                        fqa fqaVar = (fqa) cqaVar13;
                        float f12 = dqaVar4.e - f5;
                        float f13 = f12 - 1.0f;
                        cqa cqaVar14 = dqaVar4.i;
                        boolean z7 = cqaVar13 == cqaVar14;
                        cqa cqaVar15 = dqaVar4.c;
                        fqa fqaVar2 = (fqa) cqaVar15;
                        boolean z8 = cqaVar15 == cqaVar14;
                        cqa cqaVar16 = dqaVar4.d;
                        fqa fqaVar3 = (fqa) cqaVar16;
                        float f14 = f12 + 1.0f;
                        boolean z9 = cqaVar16 == cqaVar14;
                        dqa dqaVar5 = hqaVar.j;
                        eqa eqaVar = (eqa) dqaVar5.b;
                        float f15 = dqaVar5.e - f2;
                        eqa eqaVar2 = (eqa) dqaVar5.c;
                        eqa eqaVar3 = (eqa) dqaVar5.d;
                        kqaVar.a = fqaVar;
                        kqaVar.b = fqaVar2;
                        kqaVar.c = fqaVar3;
                        kqaVar.d = f13;
                        kqaVar.e = f12;
                        kqaVar.f = f14;
                        kqaVar.h = z7;
                        kqaVar.n = z8;
                        kqaVar.r = z9;
                        kqaVar.s = eqaVar;
                        kqaVar.w = eqaVar2;
                        kqaVar.x = eqaVar3;
                        kqaVar.y = f15 - 1.0f;
                        kqaVar.E = f15;
                        kqaVar.F = f15 + 1.0f;
                        kqaVar.invalidate();
                        hqaVar.u = false;
                        hqaVar.b();
                        break;
                    }
                }
                break;
            case 2:
                hqaVar.o = false;
                hqaVar.a.c.c();
                nna nnaVar = hqaVar.r;
                if (nnaVar != null) {
                    nnaVar.run();
                    break;
                }
                break;
            default:
                nna nnaVar2 = hqaVar.s;
                if (nnaVar2 != null) {
                    nnaVar2.run();
                    break;
                }
                break;
        }
    }
}
