package g4;

import d5.e0;
import d5.x;
import d5.y;
import g7.y8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends y8 {
    public final y a = new y();
    public final x b = new x();
    public e0 c;

    @Override // g7.y8
    public final z3.c b(z3.e eVar, ByteBuffer byteBuffer) {
        int i9;
        z3.b fVar;
        int i10;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        int i13;
        long j12;
        boolean z13;
        long j13;
        long j14;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i14;
        int i15;
        int i16;
        char c10;
        long j15;
        boolean z18;
        e0 e0Var = this.c;
        if (e0Var == null || eVar.n != e0Var.d()) {
            e0 e0Var2 = new e0(eVar.d);
            this.c = e0Var2;
            e0Var2.a(eVar.d - eVar.n);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        y yVar = this.a;
        yVar.A(limit, array);
        x xVar = this.b;
        xVar.n(limit, array);
        xVar.s(39);
        long i17 = (xVar.i(1) << 32) | xVar.i(32);
        xVar.s(20);
        int i18 = xVar.i(12);
        int i19 = xVar.i(8);
        yVar.D(14);
        if (i19 == 0) {
            i9 = 0;
            fVar = new f();
        } else if (i19 != 255) {
            long j16 = -9223372036854775807L;
            if (i19 == 4) {
                int r10 = yVar.r();
                ArrayList arrayList = new ArrayList(r10);
                int i20 = 0;
                while (i20 < r10) {
                    long s10 = yVar.s();
                    boolean z19 = (yVar.r() & 128) != 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (z19) {
                        i10 = r10;
                        j10 = -9223372036854775807L;
                        j11 = -9223372036854775807L;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        i11 = 0;
                        i12 = 0;
                        i13 = 0;
                    } else {
                        int r11 = yVar.r();
                        boolean z20 = (r11 & 128) != 0;
                        boolean z21 = (r11 & 64) != 0;
                        boolean z22 = (r11 & 32) != 0;
                        long s11 = z21 ? yVar.s() : -9223372036854775807L;
                        if (!z21) {
                            int r12 = yVar.r();
                            ArrayList arrayList3 = new ArrayList(r12);
                            int i21 = 0;
                            while (i21 < r12) {
                                arrayList3.add(new g(yVar.r(), yVar.s()));
                                i21++;
                                r10 = r10;
                            }
                            arrayList2 = arrayList3;
                        }
                        i10 = r10;
                        if (z22) {
                            long r13 = yVar.r();
                            z13 = (r13 & 128) != 0;
                            j12 = ((((r13 & 1) << 32) | yVar.s()) * 1000) / 90;
                        } else {
                            j12 = -9223372036854775807L;
                            z13 = false;
                        }
                        j11 = j12;
                        z12 = z13;
                        i11 = yVar.w();
                        z10 = z20;
                        z11 = z21;
                        j10 = s11;
                        i12 = yVar.r();
                        i13 = yVar.r();
                    }
                    arrayList.add(new h(s10, z19, z10, z11, arrayList2, j10, z12, j11, i11, i12, i13));
                    i20++;
                    r10 = i10;
                }
                fVar = new i(arrayList);
            } else if (i19 == 5) {
                e0 e0Var3 = this.c;
                long s12 = yVar.s();
                boolean z23 = (yVar.r() & 128) != 0;
                List list = Collections.EMPTY_LIST;
                if (z23) {
                    j13 = -9223372036854775807L;
                    j14 = -9223372036854775807L;
                    z14 = false;
                    z15 = false;
                    z16 = false;
                    z17 = false;
                    i14 = 0;
                    i15 = 0;
                    i16 = 0;
                } else {
                    int r14 = yVar.r();
                    boolean z24 = (r14 & 128) != 0;
                    boolean z25 = (r14 & 64) != 0;
                    boolean z26 = (r14 & 32) != 0;
                    boolean z27 = (r14 & 16) != 0;
                    long a2 = (!z25 || z27) ? -9223372036854775807L : j.a(i17, yVar);
                    if (z25) {
                        c10 = ' ';
                        j15 = 90;
                    } else {
                        int r15 = yVar.r();
                        c10 = ' ';
                        ArrayList arrayList4 = new ArrayList(r15);
                        j15 = 90;
                        for (int i22 = 0; i22 < r15; i22++) {
                            int r16 = yVar.r();
                            long a3 = !z27 ? j.a(i17, yVar) : -9223372036854775807L;
                            arrayList4.add(new d(r16, a3, e0Var3.b(a3)));
                        }
                        list = arrayList4;
                    }
                    if (z26) {
                        long r17 = yVar.r();
                        z18 = (r17 & 128) != 0;
                        j16 = ((((r17 & 1) << c10) | yVar.s()) * 1000) / j15;
                    } else {
                        z18 = false;
                    }
                    int w8 = yVar.w();
                    int r18 = yVar.r();
                    z17 = z18;
                    i16 = yVar.r();
                    z16 = z27;
                    i14 = w8;
                    i15 = r18;
                    j14 = j16;
                    j13 = a2;
                    z14 = z24;
                    z15 = z25;
                }
                fVar = new e(s12, z23, z14, z15, z16, j13, e0Var3.b(j13), list, z17, j14, i14, i15, i16);
            } else if (i19 != 6) {
                fVar = null;
            } else {
                e0 e0Var4 = this.c;
                long a10 = j.a(i17, yVar);
                fVar = new j(a10, e0Var4.b(a10));
            }
            i9 = 0;
        } else {
            long s13 = yVar.s();
            int i23 = i18 - 4;
            byte[] bArr = new byte[i23];
            i9 = 0;
            yVar.c(0, i23, bArr);
            fVar = new a(s13, i17, bArr);
        }
        if (fVar == null) {
            return new z3.c(new z3.b[i9]);
        }
        z3.b[] bVarArr = new z3.b[1];
        bVarArr[i9] = fVar;
        return new z3.c(bVarArr);
    }
}
