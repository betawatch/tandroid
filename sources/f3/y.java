package f3;

import a8.ia;
import a8.p0;
import e2.q0;
import h2.m0;
import java.io.EOFException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class y implements c4.m {
    public final h2.x a;

    public y(int i7) {
        switch (i7) {
            case 1:
                this.a = new h2.x();
                break;
            default:
                this.a = new h2.x(10);
                break;
        }
    }

    @Override // c4.m
    public int P() {
        return 2;
    }

    public q0 a(p pVar, t3.g gVar, int i7) {
        q0 q0Var = null;
        int i10 = 0;
        loop0: while (true) {
            int i11 = 0;
            do {
                int i12 = i11 % 10;
                int i13 = i12 + 10;
                h2.x xVar = this.a;
                if (i12 == 0 && i11 != 0) {
                    byte[] bArr = xVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i14 = i11 == 0 ? 10 : 1;
                try {
                    pVar.b(i13 - i14, i14, xVar.a);
                    xVar.N(i12);
                    xVar.M(i13);
                    if (xVar.a() < 3) {
                        throw new IndexOutOfBoundsException("position=" + xVar.b + ", limit=" + xVar.c);
                    }
                    int D = xVar.D();
                    int i15 = xVar.b - 3;
                    xVar.b = i15;
                    if (D != 4801587) {
                        if (b.h(xVar.i()) != -1) {
                            break loop0;
                        }
                        if (i11 == 0) {
                            xVar.c(20);
                        }
                        i11++;
                    } else {
                        xVar.O(6);
                        int z9 = xVar.z();
                        int i16 = z9 + 10;
                        if (q0Var == null) {
                            byte[] bArr2 = new byte[i16];
                            System.arraycopy(xVar.a, i15, bArr2, 0, 10);
                            pVar.b(10, z9, bArr2);
                            q0Var = new t3.h(gVar).c(i16, bArr2);
                        } else {
                            pVar.m(z9);
                        }
                        i10 += i16;
                    }
                } catch (EOFException unused) {
                }
            } while (i11 <= i7);
        }
        pVar.q();
        pVar.m(i10);
        return q0Var;
    }

    @Override // c4.m
    public /* synthetic */ c4.d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override // c4.m
    public void z(byte[] bArr, int i7, int i10, c4.l lVar, h2.j jVar) {
        g2.b a10;
        h2.x xVar = this.a;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            ia.e("Incomplete Mp4Webvtt Top Level box header found.", xVar.a() >= 8);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i11 = m10 - 8;
                CharSequence charSequence = null;
                g2.a aVar = null;
                while (i11 > 0) {
                    ia.e("Incomplete vtt cue box header found.", i11 >= 8);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i12 = m11 - 8;
                    byte[] bArr2 = xVar.a;
                    int i13 = xVar.b;
                    String str = m0.a;
                    String str2 = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    xVar.O(i12);
                    i11 = (i11 - 8) - i12;
                    if (m12 == 1937011815) {
                        l4.g gVar = new l4.g();
                        l4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = l4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.a = charSequence;
                    aVar.b = null;
                    a10 = aVar.a();
                } else {
                    Pattern pattern = l4.h.a;
                    l4.g gVar2 = new l4.g();
                    gVar2.c = charSequence;
                    a10 = gVar2.a().a();
                }
                arrayList.add(a10);
            } else {
                xVar.O(m10 - 8);
            }
        }
        jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // c4.m
    public /* synthetic */ void reset() {
    }
}
