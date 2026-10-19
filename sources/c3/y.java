package c3;

import b2.t0;
import e2.m0;
import java.io.EOFException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class y implements z3.m {
    public final e2.x a;

    public y(int i10) {
        switch (i10) {
            case 1:
                this.a = new e2.x();
                break;
            default:
                this.a = new e2.x(10);
                break;
        }
    }

    @Override // z3.m
    public /* synthetic */ z3.d a(int i10, int i11, byte[] bArr) {
        return r4.c.a(this, bArr, i11);
    }

    public t0 b(p pVar, q3.g gVar, int i10) {
        t0 t0Var = null;
        int i11 = 0;
        loop0: while (true) {
            int i12 = 0;
            do {
                int i13 = i12 % 10;
                int i14 = i13 + 10;
                e2.x xVar = this.a;
                if (i13 == 0 && i12 != 0) {
                    byte[] bArr = xVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i15 = i12 == 0 ? 10 : 1;
                try {
                    pVar.b(i14 - i15, i15, xVar.a);
                    xVar.N(i13);
                    xVar.M(i14);
                    if (xVar.a() < 3) {
                        throw new IndexOutOfBoundsException("position=" + xVar.b + ", limit=" + xVar.c);
                    }
                    int D = xVar.D();
                    int i16 = xVar.b - 3;
                    xVar.b = i16;
                    if (D != 4801587) {
                        if (b.h(xVar.i()) != -1) {
                            break loop0;
                        }
                        if (i12 == 0) {
                            xVar.c(20);
                        }
                        i12++;
                    } else {
                        xVar.O(6);
                        int z10 = xVar.z();
                        int i17 = z10 + 10;
                        if (t0Var == null) {
                            byte[] bArr2 = new byte[i17];
                            System.arraycopy(xVar.a, i16, bArr2, 0, 10);
                            pVar.b(10, z10, bArr2);
                            t0Var = new q3.h(gVar).c(i17, bArr2);
                        } else {
                            pVar.l(z10);
                        }
                        i11 += i17;
                    }
                } catch (EOFException unused) {
                }
            } while (i12 <= i10);
        }
        pVar.q();
        pVar.l(i11);
        return t0Var;
    }

    @Override // z3.m
    public int c() {
        return 2;
    }

    @Override // z3.m
    public void f(byte[] bArr, int i10, int i11, z3.l lVar, e2.j jVar) {
        d2.b a2;
        e2.x xVar = this.a;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            u6.f("Incomplete Mp4Webvtt Top Level box header found.", xVar.a() >= 8);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i12 = m10 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    u6.f("Incomplete vtt cue box header found.", i12 >= 8);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i13 = m11 - 8;
                    byte[] bArr2 = xVar.a;
                    int i14 = xVar.b;
                    String str = m0.a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    xVar.O(i13);
                    i12 = (i12 - 8) - i13;
                    if (m12 == 1937011815) {
                        i4.g gVar = new i4.g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = i4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.a = charSequence;
                    aVar.b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = i4.h.a;
                    i4.g gVar2 = new i4.g();
                    gVar2.c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                xVar.O(m10 - 8);
            }
        }
        jVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }
}
