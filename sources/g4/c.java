package g4;

import d5.f0;
import d5.y;
import d5.z;
import h7.p8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends p8 {
    public final z a = new z();
    public final y b = new y();
    public f0 c;

    @Override // h7.p8
    public final z3.c b(z3.e eVar, ByteBuffer byteBuffer) {
        int i10;
        z3.b fVar;
        int i11;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        long j12;
        boolean z13;
        long j13;
        long j14;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i15;
        int i16;
        int i17;
        char c10;
        long j15;
        boolean z18;
        f0 f0Var = this.c;
        if (f0Var == null || eVar.n != f0Var.d()) {
            f0 f0Var2 = new f0(eVar.d);
            this.c = f0Var2;
            f0Var2.a(eVar.d - eVar.n);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        z zVar = this.a;
        zVar.A(limit, array);
        y yVar = this.b;
        yVar.n(limit, array);
        yVar.s(39);
        long i18 = (yVar.i(1) << 32) | yVar.i(32);
        yVar.s(20);
        int i19 = yVar.i(12);
        int i20 = yVar.i(8);
        zVar.D(14);
        if (i20 == 0) {
            i10 = 0;
            fVar = new f();
        } else if (i20 != 255) {
            long j16 = -9223372036854775807L;
            if (i20 == 4) {
                int r10 = zVar.r();
                ArrayList arrayList = new ArrayList(r10);
                int i21 = 0;
                while (i21 < r10) {
                    long s10 = zVar.s();
                    boolean z19 = (zVar.r() & 128) != 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (z19) {
                        i11 = r10;
                        j10 = -9223372036854775807L;
                        j11 = -9223372036854775807L;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                    } else {
                        int r11 = zVar.r();
                        boolean z20 = (r11 & 128) != 0;
                        boolean z21 = (r11 & 64) != 0;
                        boolean z22 = (r11 & 32) != 0;
                        long s11 = z21 ? zVar.s() : -9223372036854775807L;
                        if (!z21) {
                            int r12 = zVar.r();
                            ArrayList arrayList3 = new ArrayList(r12);
                            int i22 = 0;
                            while (i22 < r12) {
                                arrayList3.add(new g(zVar.r(), zVar.s()));
                                i22++;
                                r10 = r10;
                            }
                            arrayList2 = arrayList3;
                        }
                        i11 = r10;
                        if (z22) {
                            long r13 = zVar.r();
                            z13 = (r13 & 128) != 0;
                            j12 = ((((r13 & 1) << 32) | zVar.s()) * 1000) / 90;
                        } else {
                            j12 = -9223372036854775807L;
                            z13 = false;
                        }
                        j11 = j12;
                        z12 = z13;
                        i12 = zVar.w();
                        z10 = z20;
                        z11 = z21;
                        j10 = s11;
                        i13 = zVar.r();
                        i14 = zVar.r();
                    }
                    arrayList.add(new h(s10, z19, z10, z11, arrayList2, j10, z12, j11, i12, i13, i14));
                    i21++;
                    r10 = i11;
                }
                fVar = new i(arrayList);
            } else if (i20 == 5) {
                f0 f0Var3 = this.c;
                long s12 = zVar.s();
                boolean z23 = (zVar.r() & 128) != 0;
                List list = Collections.EMPTY_LIST;
                if (z23) {
                    j13 = -9223372036854775807L;
                    j14 = -9223372036854775807L;
                    z14 = false;
                    z15 = false;
                    z16 = false;
                    z17 = false;
                    i15 = 0;
                    i16 = 0;
                    i17 = 0;
                } else {
                    int r14 = zVar.r();
                    boolean z24 = (r14 & 128) != 0;
                    boolean z25 = (r14 & 64) != 0;
                    boolean z26 = (r14 & 32) != 0;
                    boolean z27 = (r14 & 16) != 0;
                    long a2 = (!z25 || z27) ? -9223372036854775807L : j.a(i18, zVar);
                    if (z25) {
                        c10 = ' ';
                        j15 = 90;
                    } else {
                        int r15 = zVar.r();
                        c10 = ' ';
                        ArrayList arrayList4 = new ArrayList(r15);
                        j15 = 90;
                        for (int i23 = 0; i23 < r15; i23++) {
                            int r16 = zVar.r();
                            long a3 = !z27 ? j.a(i18, zVar) : -9223372036854775807L;
                            arrayList4.add(new d(r16, a3, f0Var3.b(a3)));
                        }
                        list = arrayList4;
                    }
                    if (z26) {
                        long r17 = zVar.r();
                        z18 = (r17 & 128) != 0;
                        j16 = ((((r17 & 1) << c10) | zVar.s()) * 1000) / j15;
                    } else {
                        z18 = false;
                    }
                    int w10 = zVar.w();
                    int r18 = zVar.r();
                    z17 = z18;
                    i17 = zVar.r();
                    z16 = z27;
                    i15 = w10;
                    i16 = r18;
                    j14 = j16;
                    j13 = a2;
                    z14 = z24;
                    z15 = z25;
                }
                fVar = new e(s12, z23, z14, z15, z16, j13, f0Var3.b(j13), list, z17, j14, i15, i16, i17);
            } else if (i20 != 6) {
                fVar = null;
            } else {
                f0 f0Var4 = this.c;
                long a10 = j.a(i18, zVar);
                fVar = new j(a10, f0Var4.b(a10));
            }
            i10 = 0;
        } else {
            long s13 = zVar.s();
            int i24 = i19 - 4;
            byte[] bArr = new byte[i24];
            i10 = 0;
            zVar.c(0, i24, bArr);
            fVar = new a(s13, i18, bArr);
        }
        if (fVar == null) {
            return new z3.c(new z3.b[i10]);
        }
        z3.b[] bVarArr = new z3.b[1];
        bVarArr[i10] = fVar;
        return new z3.c(bVarArr);
    }
}
