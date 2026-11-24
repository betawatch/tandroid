// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hna extends iwe {
    public final yw7 a = new yw7();
    public final ye1 b = new ye1();
    public vqb c;

    @Override // iwe
    public final nf7 b(pf7 pf7Var, ByteBuffer byteBuffer) {
        lf7 jnaVar;
        long j;
        vqb vqbVar = this.c;
        if (vqbVar == null || pf7Var.r != vqbVar.e()) {
            vqb vqbVar2 = new vqb(pf7Var.e);
            this.c = vqbVar2;
            vqbVar2.a(pf7Var.e - pf7Var.r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        yw7 yw7Var = this.a;
        yw7Var.L(limit, array);
        ye1 ye1Var = this.b;
        ye1Var.j(limit, array);
        ye1Var.n(39);
        long f = (ye1Var.f(1) << 32) | ye1Var.f(32);
        ye1Var.n(20);
        int f2 = ye1Var.f(12);
        int f3 = ye1Var.f(8);
        yw7Var.O(14);
        if (f3 == 0) {
            jnaVar = new jna();
        } else if (f3 == 255) {
            long C = yw7Var.C();
            int i = f2 - 4;
            yw7Var.k(0, i, new byte[i]);
            jnaVar = new lm8(C, f, (byte) 0);
        } else if (f3 == 4) {
            int A = yw7Var.A();
            ArrayList arrayList = new ArrayList(A);
            for (int i2 = 0; i2 < A; i2++) {
                yw7Var.C();
                boolean z = (yw7Var.A() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int A2 = yw7Var.A();
                    boolean z2 = (A2 & 64) != 0;
                    boolean z3 = (A2 & 32) != 0;
                    if (z2) {
                        yw7Var.C();
                    } else {
                        int A3 = yw7Var.A();
                        ArrayList arrayList3 = new ArrayList(A3);
                        for (int i3 = 0; i3 < A3; i3++) {
                            yw7Var.A();
                            yw7Var.C();
                            arrayList3.add(new k1f((byte) 26));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        yw7Var.A();
                        yw7Var.C();
                    }
                    yw7Var.H();
                    yw7Var.A();
                    yw7Var.A();
                }
                arrayList.add(new cf9(arrayList2));
            }
            jnaVar = new kna(arrayList);
        } else if (f3 == 5) {
            vqb vqbVar3 = this.c;
            yw7Var.C();
            boolean z4 = (yw7Var.A() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int A4 = yw7Var.A();
                boolean z5 = (A4 & 64) != 0;
                boolean z6 = (A4 & 32) != 0;
                boolean z7 = (A4 & 16) != 0;
                long d = (!z5 || z7) ? -9223372036854775807L : lm8.d(f, yw7Var);
                if (!z5) {
                    int A5 = yw7Var.A();
                    ArrayList arrayList4 = new ArrayList(A5);
                    for (int i4 = 0; i4 < A5; i4++) {
                        yw7Var.A();
                        vqbVar3.b(!z7 ? lm8.d(f, yw7Var) : -9223372036854775807L);
                        arrayList4.add(new f8e());
                    }
                    list = arrayList4;
                }
                if (z6) {
                    yw7Var.A();
                    yw7Var.C();
                }
                yw7Var.H();
                yw7Var.A();
                yw7Var.A();
                j = d;
            }
            jnaVar = new ina(j, vqbVar3.b(j), list);
        } else if (f3 != 6) {
            jnaVar = null;
        } else {
            vqb vqbVar4 = this.c;
            long d2 = lm8.d(f, yw7Var);
            jnaVar = new lm8(d2, vqbVar4.b(d2), (byte) 1);
        }
        return jnaVar == null ? new nf7(new lf7[0]) : new nf7(jnaVar);
    }
}
