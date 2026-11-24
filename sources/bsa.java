// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bsa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hsa b;

    public /* synthetic */ bsa(hsa hsaVar, byte b) {
        this.a = b;
        this.b = hsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hsa hsaVar = this.b;
        switch (b) {
            case 0:
                hsaVar.b();
                break;
            case 1:
                ssa ssaVar = hsaVar.a;
                if (!hsaVar.u) {
                    hsaVar.v = false;
                    if (hsaVar.o) {
                        hsaVar.u = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        float min = Math.min((currentTimeMillis - hsaVar.m) / 1000.0f, 0.25f);
                        float f = hsaVar.n + min;
                        hsaVar.n = f;
                        float f2 = hsaVar.j.f(f > gm.R1(0.1f, 1.0f, hsaVar.t), min);
                        float f3 = hsaVar.k.f(hsaVar.n > gm.R1(0.1f, 1.0f, hsaVar.t), min);
                        float f4 = hsaVar.i.f(hsaVar.j.b(0.5f), min);
                        float f5 = hsaVar.h.f(hsaVar.j.b(0.5f) && hsaVar.i.b(0.5f), min);
                        hsaVar.m = currentTimeMillis;
                        if (hsaVar.j.c() && hsaVar.i.c() && hsaVar.h.c() && !hsaVar.p) {
                            hsaVar.p = true;
                            gm.c3(new bsa(hsaVar, (byte) 2));
                        }
                        if (hsaVar.j.c() && hsaVar.i.c() && hsaVar.h.b(0.25f) && !hsaVar.q) {
                            hsaVar.q = true;
                            gm.c3(new bsa(hsaVar, (byte) 3));
                        }
                        msa msaVar = hsaVar.b;
                        if (msaVar != null) {
                            dsa dsaVar = hsaVar.h;
                            csa csaVar = dsaVar.b;
                            float f6 = dsaVar.e - f5;
                            float f7 = f6 - 1.0f;
                            csa csaVar2 = dsaVar.i;
                            boolean z = csaVar == csaVar2;
                            csa csaVar3 = dsaVar.c;
                            boolean z2 = csaVar3 == csaVar2;
                            csa csaVar4 = dsaVar.d;
                            msaVar.a(csaVar, f7, z, csaVar3, f6, z2, csaVar4, f6 + 1.0f, csaVar4 == csaVar2);
                        }
                        msa msaVar2 = hsaVar.c;
                        if (msaVar2 != null) {
                            dsa dsaVar2 = hsaVar.i;
                            csa csaVar5 = dsaVar2.b;
                            float f8 = dsaVar2.e - f4;
                            float f9 = f8 - 1.0f;
                            csa csaVar6 = dsaVar2.i;
                            boolean z3 = csaVar5 == csaVar6;
                            csa csaVar7 = dsaVar2.c;
                            boolean z4 = csaVar7 == csaVar6;
                            csa csaVar8 = dsaVar2.d;
                            msaVar2.a(csaVar5, f9, z3, csaVar7, f8, z4, csaVar8, f8 + 1.0f, csaVar8 == csaVar6);
                        }
                        msa msaVar3 = hsaVar.d;
                        if (msaVar3 != null) {
                            dsa dsaVar3 = hsaVar.k;
                            csa csaVar9 = dsaVar3.b;
                            float f10 = dsaVar3.e - f3;
                            float f11 = f10 - 1.0f;
                            csa csaVar10 = dsaVar3.i;
                            boolean z5 = csaVar9 == csaVar10;
                            csa csaVar11 = dsaVar3.c;
                            boolean z6 = csaVar11 == csaVar10;
                            csa csaVar12 = dsaVar3.d;
                            msaVar3.a(csaVar9, f11, z5, csaVar11, f10, z6, csaVar12, f10 + 1.0f, csaVar12 == csaVar10);
                        }
                        ssaVar.g(0, ((gsa) hsaVar.i.c).c, true);
                        ksa ksaVar = ssaVar.c;
                        dsa dsaVar4 = hsaVar.h;
                        csa csaVar13 = dsaVar4.b;
                        fsa fsaVar = (fsa) csaVar13;
                        float f12 = dsaVar4.e - f5;
                        float f13 = f12 - 1.0f;
                        csa csaVar14 = dsaVar4.i;
                        boolean z7 = csaVar13 == csaVar14;
                        csa csaVar15 = dsaVar4.c;
                        fsa fsaVar2 = (fsa) csaVar15;
                        boolean z8 = csaVar15 == csaVar14;
                        csa csaVar16 = dsaVar4.d;
                        fsa fsaVar3 = (fsa) csaVar16;
                        float f14 = f12 + 1.0f;
                        boolean z9 = csaVar16 == csaVar14;
                        dsa dsaVar5 = hsaVar.j;
                        esa esaVar = (esa) dsaVar5.b;
                        float f15 = dsaVar5.e - f2;
                        esa esaVar2 = (esa) dsaVar5.c;
                        esa esaVar3 = (esa) dsaVar5.d;
                        ksaVar.a = fsaVar;
                        ksaVar.b = fsaVar2;
                        ksaVar.c = fsaVar3;
                        ksaVar.d = f13;
                        ksaVar.e = f12;
                        ksaVar.f = f14;
                        ksaVar.h = z7;
                        ksaVar.n = z8;
                        ksaVar.r = z9;
                        ksaVar.s = esaVar;
                        ksaVar.w = esaVar2;
                        ksaVar.x = esaVar3;
                        ksaVar.y = f15 - 1.0f;
                        ksaVar.E = f15;
                        ksaVar.F = f15 + 1.0f;
                        ksaVar.invalidate();
                        hsaVar.u = false;
                        hsaVar.b();
                        break;
                    }
                }
                break;
            case 2:
                hsaVar.o = false;
                hsaVar.a.c.c();
                npa npaVar = hsaVar.r;
                if (npaVar != null) {
                    npaVar.run();
                    break;
                }
                break;
            default:
                npa npaVar2 = hsaVar.s;
                if (npaVar2 != null) {
                    npaVar2.run();
                    break;
                }
                break;
        }
    }
}
