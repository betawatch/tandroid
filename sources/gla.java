// default package

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class gla extends fue {
    public final xu7 a = new xu7();
    public final qd1 b = new qd1();
    public uob c;

    @Override // fue
    public final ld7 b(nd7 nd7Var, ByteBuffer byteBuffer) {
        jd7 ilaVar;
        long j;
        uob uobVar = this.c;
        if (uobVar == null || nd7Var.r != uobVar.e()) {
            uob uobVar2 = new uob(nd7Var.e);
            this.c = uobVar2;
            uobVar2.a(nd7Var.e - nd7Var.r);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        xu7 xu7Var = this.a;
        xu7Var.L(limit, array);
        qd1 qd1Var = this.b;
        qd1Var.j(limit, array);
        qd1Var.n(39);
        long f = (qd1Var.f(1) << 32) | qd1Var.f(32);
        qd1Var.n(20);
        int f2 = qd1Var.f(12);
        int f3 = qd1Var.f(8);
        xu7Var.O(14);
        if (f3 == 0) {
            ilaVar = new ila();
        } else if (f3 == 255) {
            long C = xu7Var.C();
            int i = f2 - 4;
            xu7Var.k(0, i, new byte[i]);
            ilaVar = new hk8(C, f, (byte) 0);
        } else if (f3 == 4) {
            int A = xu7Var.A();
            ArrayList arrayList = new ArrayList(A);
            for (int i2 = 0; i2 < A; i2++) {
                xu7Var.C();
                boolean z = (xu7Var.A() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int A2 = xu7Var.A();
                    boolean z2 = (A2 & 64) != 0;
                    boolean z3 = (A2 & 32) != 0;
                    if (z2) {
                        xu7Var.C();
                    } else {
                        int A3 = xu7Var.A();
                        ArrayList arrayList3 = new ArrayList(A3);
                        for (int i3 = 0; i3 < A3; i3++) {
                            xu7Var.A();
                            xu7Var.C();
                            arrayList3.add(new ize((byte) 26));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        xu7Var.A();
                        xu7Var.C();
                    }
                    xu7Var.H();
                    xu7Var.A();
                    xu7Var.A();
                }
                arrayList.add(new ln8(arrayList2));
            }
            ilaVar = new jla(arrayList);
        } else if (f3 == 5) {
            uob uobVar3 = this.c;
            xu7Var.C();
            boolean z4 = (xu7Var.A() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int A4 = xu7Var.A();
                boolean z5 = (A4 & 64) != 0;
                boolean z6 = (A4 & 32) != 0;
                boolean z7 = (A4 & 16) != 0;
                long d = (!z5 || z7) ? -9223372036854775807L : hk8.d(f, xu7Var);
                if (!z5) {
                    int A5 = xu7Var.A();
                    ArrayList arrayList4 = new ArrayList(A5);
                    for (int i4 = 0; i4 < A5; i4++) {
                        xu7Var.A();
                        uobVar3.b(!z7 ? hk8.d(f, xu7Var) : -9223372036854775807L);
                        arrayList4.add(new c6e());
                    }
                    list = arrayList4;
                }
                if (z6) {
                    xu7Var.A();
                    xu7Var.C();
                }
                xu7Var.H();
                xu7Var.A();
                xu7Var.A();
                j = d;
            }
            ilaVar = new hla(j, uobVar3.b(j), list);
        } else if (f3 != 6) {
            ilaVar = null;
        } else {
            uob uobVar4 = this.c;
            long d2 = hk8.d(f, xu7Var);
            ilaVar = new hk8(d2, uobVar4.b(d2), (byte) 1);
        }
        return ilaVar == null ? new ld7(new jd7[0]) : new ld7(ilaVar);
    }
}
