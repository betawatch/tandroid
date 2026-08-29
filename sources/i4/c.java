package i4;

import f5.c0;
import f5.v;
import f5.w;
import h7.h5;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends h5 {
    public final w a = new w();
    public final v b = new v();
    public c0 c;

    @Override // h7.h5
    public final b4.c b(b4.e eVar, ByteBuffer byteBuffer) {
        int i10;
        b4.b fVar;
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
        char c3;
        long j15;
        boolean z18;
        c0 c0Var = this.c;
        if (c0Var == null || eVar.n != c0Var.d()) {
            c0 c0Var2 = new c0(eVar.d);
            this.c = c0Var2;
            c0Var2.a(eVar.d - eVar.n);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        w wVar = this.a;
        wVar.A(limit, array);
        v vVar = this.b;
        vVar.n(limit, array);
        vVar.s(39);
        long i18 = (vVar.i(1) << 32) | vVar.i(32);
        vVar.s(20);
        int i19 = vVar.i(12);
        int i20 = vVar.i(8);
        wVar.D(14);
        if (i20 == 0) {
            i10 = 0;
            fVar = new f();
        } else if (i20 != 255) {
            long j16 = -9223372036854775807L;
            if (i20 == 4) {
                int r6 = wVar.r();
                ArrayList arrayList = new ArrayList(r6);
                int i21 = 0;
                while (i21 < r6) {
                    long s10 = wVar.s();
                    boolean z19 = (wVar.r() & 128) != 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (z19) {
                        i11 = r6;
                        j10 = -9223372036854775807L;
                        j11 = -9223372036854775807L;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                    } else {
                        int r9 = wVar.r();
                        boolean z20 = (r9 & 128) != 0;
                        boolean z21 = (r9 & 64) != 0;
                        boolean z22 = (r9 & 32) != 0;
                        long s11 = z21 ? wVar.s() : -9223372036854775807L;
                        if (!z21) {
                            int r10 = wVar.r();
                            ArrayList arrayList3 = new ArrayList(r10);
                            int i22 = 0;
                            while (i22 < r10) {
                                arrayList3.add(new h(wVar.r(), wVar.s()));
                                i22++;
                                r6 = r6;
                            }
                            arrayList2 = arrayList3;
                        }
                        i11 = r6;
                        if (z22) {
                            long r11 = wVar.r();
                            z13 = (r11 & 128) != 0;
                            j12 = ((((r11 & 1) << 32) | wVar.s()) * 1000) / 90;
                        } else {
                            j12 = -9223372036854775807L;
                            z13 = false;
                        }
                        j11 = j12;
                        z12 = z13;
                        i12 = wVar.w();
                        z10 = z20;
                        z11 = z21;
                        j10 = s11;
                        i13 = wVar.r();
                        i14 = wVar.r();
                    }
                    arrayList.add(new i(s10, z19, z10, z11, arrayList2, j10, z12, j11, i12, i13, i14));
                    i21++;
                    r6 = i11;
                }
                fVar = new j(arrayList);
            } else if (i20 == 5) {
                c0 c0Var3 = this.c;
                long s12 = wVar.s();
                boolean z23 = (wVar.r() & 128) != 0;
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
                    int r12 = wVar.r();
                    boolean z24 = (r12 & 128) != 0;
                    boolean z25 = (r12 & 64) != 0;
                    boolean z26 = (r12 & 32) != 0;
                    boolean z27 = (r12 & 16) != 0;
                    long a2 = (!z25 || z27) ? -9223372036854775807L : k.a(i18, wVar);
                    if (z25) {
                        c3 = ' ';
                        j15 = 90;
                    } else {
                        int r13 = wVar.r();
                        c3 = ' ';
                        ArrayList arrayList4 = new ArrayList(r13);
                        j15 = 90;
                        for (int i23 = 0; i23 < r13; i23++) {
                            int r14 = wVar.r();
                            long a10 = !z27 ? k.a(i18, wVar) : -9223372036854775807L;
                            arrayList4.add(new d(r14, a10, c0Var3.b(a10)));
                        }
                        list = arrayList4;
                    }
                    if (z26) {
                        long r15 = wVar.r();
                        z18 = (r15 & 128) != 0;
                        j16 = ((((r15 & 1) << c3) | wVar.s()) * 1000) / j15;
                    } else {
                        z18 = false;
                    }
                    int w10 = wVar.w();
                    int r16 = wVar.r();
                    z17 = z18;
                    i17 = wVar.r();
                    z16 = z27;
                    i15 = w10;
                    i16 = r16;
                    j14 = j16;
                    j13 = a2;
                    z14 = z24;
                    z15 = z25;
                }
                fVar = new e(s12, z23, z14, z15, z16, j13, c0Var3.b(j13), list, z17, j14, i15, i16, i17);
            } else if (i20 != 6) {
                fVar = null;
            } else {
                c0 c0Var4 = this.c;
                long a11 = k.a(i18, wVar);
                fVar = new k(a11, c0Var4.b(a11));
            }
            i10 = 0;
        } else {
            long s13 = wVar.s();
            int i24 = i19 - 4;
            byte[] bArr = new byte[i24];
            i10 = 0;
            wVar.c(0, i24, bArr);
            fVar = new a(s13, i18, bArr);
        }
        if (fVar == null) {
            return new b4.c(new b4.b[i10]);
        }
        b4.b[] bVarArr = new b4.b[1];
        bVarArr[i10] = fVar;
        return new b4.c(bVarArr);
    }
}
