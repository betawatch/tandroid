package l4;

import h5.c0;
import h5.v;
import h5.w;
import j7.c7;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c extends c7 {
    public final w a = new w();
    public final v b = new v();
    public c0 c;

    @Override // j7.c7
    public final e4.c b(e4.e eVar, ByteBuffer byteBuffer) {
        int i10;
        e4.b fVar;
        int i11;
        long j10;
        long j11;
        boolean z4;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        long j12;
        boolean z12;
        long j13;
        long j14;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i15;
        int i16;
        int i17;
        char c3;
        long j15;
        boolean z17;
        c0 c0Var = this.c;
        if (c0Var == null || eVar.s != c0Var.d()) {
            c0 c0Var2 = new c0(eVar.f);
            this.c = c0Var2;
            c0Var2.a(eVar.f - eVar.s);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        w wVar = this.a;
        wVar.D(limit, array);
        v vVar = this.b;
        vVar.n(limit, array);
        vVar.s(39);
        long i18 = (vVar.i(1) << 32) | vVar.i(32);
        vVar.s(20);
        int i19 = vVar.i(12);
        int i20 = vVar.i(8);
        wVar.G(14);
        if (i20 == 0) {
            i10 = 0;
            fVar = new f();
        } else if (i20 != 255) {
            long j16 = -9223372036854775807L;
            if (i20 == 4) {
                int u10 = wVar.u();
                ArrayList arrayList = new ArrayList(u10);
                int i21 = 0;
                while (i21 < u10) {
                    long v = wVar.v();
                    boolean z18 = (wVar.u() & 128) != 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (z18) {
                        i11 = u10;
                        j10 = -9223372036854775807L;
                        j11 = -9223372036854775807L;
                        z4 = false;
                        z10 = false;
                        z11 = false;
                        i12 = 0;
                        i13 = 0;
                        i14 = 0;
                    } else {
                        int u11 = wVar.u();
                        boolean z19 = (u11 & 128) != 0;
                        boolean z20 = (u11 & 64) != 0;
                        boolean z21 = (u11 & 32) != 0;
                        long v10 = z20 ? wVar.v() : -9223372036854775807L;
                        if (!z20) {
                            int u12 = wVar.u();
                            ArrayList arrayList3 = new ArrayList(u12);
                            int i22 = 0;
                            while (i22 < u12) {
                                arrayList3.add(new g(wVar.u(), wVar.v()));
                                i22++;
                                u10 = u10;
                            }
                            arrayList2 = arrayList3;
                        }
                        i11 = u10;
                        if (z21) {
                            long u13 = wVar.u();
                            z12 = (u13 & 128) != 0;
                            j12 = ((((u13 & 1) << 32) | wVar.v()) * 1000) / 90;
                        } else {
                            j12 = -9223372036854775807L;
                            z12 = false;
                        }
                        j11 = j12;
                        z11 = z12;
                        i12 = wVar.z();
                        z4 = z19;
                        z10 = z20;
                        j10 = v10;
                        i13 = wVar.u();
                        i14 = wVar.u();
                    }
                    arrayList.add(new h(v, z18, z4, z10, arrayList2, j10, z11, j11, i12, i13, i14));
                    i21++;
                    u10 = i11;
                }
                fVar = new i(arrayList);
            } else if (i20 == 5) {
                c0 c0Var3 = this.c;
                long v11 = wVar.v();
                boolean z22 = (wVar.u() & 128) != 0;
                List list = Collections.EMPTY_LIST;
                if (z22) {
                    j13 = -9223372036854775807L;
                    j14 = -9223372036854775807L;
                    z13 = false;
                    z14 = false;
                    z15 = false;
                    z16 = false;
                    i15 = 0;
                    i16 = 0;
                    i17 = 0;
                } else {
                    int u14 = wVar.u();
                    boolean z23 = (u14 & 128) != 0;
                    boolean z24 = (u14 & 64) != 0;
                    boolean z25 = (u14 & 32) != 0;
                    boolean z26 = (u14 & 16) != 0;
                    long a2 = (!z24 || z26) ? -9223372036854775807L : k.a(i18, wVar);
                    if (z24) {
                        c3 = ' ';
                        j15 = 90;
                    } else {
                        int u15 = wVar.u();
                        c3 = ' ';
                        ArrayList arrayList4 = new ArrayList(u15);
                        j15 = 90;
                        for (int i23 = 0; i23 < u15; i23++) {
                            int u16 = wVar.u();
                            long a10 = !z26 ? k.a(i18, wVar) : -9223372036854775807L;
                            arrayList4.add(new d(u16, a10, c0Var3.b(a10)));
                        }
                        list = arrayList4;
                    }
                    if (z25) {
                        long u17 = wVar.u();
                        z17 = (u17 & 128) != 0;
                        j16 = ((((u17 & 1) << c3) | wVar.v()) * 1000) / j15;
                    } else {
                        z17 = false;
                    }
                    int z27 = wVar.z();
                    int u18 = wVar.u();
                    z16 = z17;
                    i17 = wVar.u();
                    z15 = z26;
                    i15 = z27;
                    i16 = u18;
                    j14 = j16;
                    j13 = a2;
                    z13 = z23;
                    z14 = z24;
                }
                fVar = new e(v11, z22, z13, z14, z15, j13, c0Var3.b(j13), list, z16, j14, i15, i16, i17);
            } else if (i20 != 6) {
                fVar = null;
            } else {
                c0 c0Var4 = this.c;
                long a11 = k.a(i18, wVar);
                fVar = new k(a11, c0Var4.b(a11));
            }
            i10 = 0;
        } else {
            long v12 = wVar.v();
            int i24 = i19 - 4;
            byte[] bArr = new byte[i24];
            i10 = 0;
            wVar.e(0, i24, bArr);
            fVar = new a(v12, i18, bArr);
        }
        if (fVar == null) {
            return new e4.c(new e4.b[i10]);
        }
        e4.b[] bVarArr = new e4.b[1];
        bVarArr[i10] = fVar;
        return new e4.c(bVarArr);
    }
}
