package j4;

import a8.ia;
import a8.p0;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c4.d;
import c4.l;
import c4.m;
import g2.b;
import h2.j;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import jg.g;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a implements m {
    public final x a = new x();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int h;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.h = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.h = i7;
        boolean z9 = (bArr[0] & 32) != 0;
        this.b = z9;
        if (z9) {
            this.f = m0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i7, int i10, int i11, int i12, int i13) {
        if (i7 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & qs.e4) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i7, int i10, int i11, int i12, int i13) {
        if (i7 != i10) {
            int i14 = i13 | 33;
            boolean z9 = (i7 & 1) != 0;
            boolean z10 = (i7 & 2) != 0;
            if (z9) {
                if (z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                }
            } else if (z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            }
            boolean z11 = (i7 & 4) != 0;
            if (z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (z11 || z9 || z10) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
        }
    }

    @Override // c4.m
    public final int P() {
        return 2;
    }

    @Override // c4.m
    public final /* synthetic */ d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c4.m
    public final void z(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        String y10;
        int i11;
        int i12;
        x xVar = this.a;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        int i13 = 1;
        int i14 = 0;
        int i15 = 2;
        ia.f(xVar.a() >= 2);
        int H = xVar.H();
        if (H == 0) {
            y10 = "";
        } else {
            int i16 = xVar.b;
            Charset J = xVar.J();
            int i17 = H - (xVar.b - i16);
            if (J == null) {
                J = StandardCharsets.UTF_8;
            }
            y10 = xVar.y(i17, J);
        }
        if (y10.isEmpty()) {
            g0 g0Var = i0.b;
            jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, t1.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y10);
        b(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f10 = this.f;
        while (xVar.a() >= 8) {
            int i18 = xVar.b;
            int m10 = xVar.m();
            int m11 = xVar.m();
            if (m11 == 1937013100) {
                ia.f(xVar.a() >= i15 ? i13 : i14);
                int H2 = xVar.H();
                int i19 = i14;
                while (i19 < H2) {
                    ia.f(xVar.a() >= 12 ? i13 : i14);
                    int H3 = xVar.H();
                    int H4 = xVar.H();
                    xVar.O(i15);
                    int i20 = i19;
                    int A = xVar.A();
                    xVar.O(i13);
                    int m12 = xVar.m();
                    if (H4 > spannableStringBuilder.length()) {
                        StringBuilder n10 = g.n(H4, "Truncating styl end (", ") to cueText.length() (");
                        n10.append(spannableStringBuilder.length());
                        n10.append(").");
                        h2.a.l("Tx3gParser", n10.toString());
                        H4 = spannableStringBuilder.length();
                    }
                    if (H3 >= H4) {
                        h2.a.l("Tx3gParser", "Ignoring styl with start (" + H3 + ") >= end (" + H4 + ").");
                        i12 = i20;
                    } else {
                        i12 = i20;
                        int i21 = H4;
                        b(spannableStringBuilder, A, this.c, H3, i21, 0);
                        a(spannableStringBuilder, m12, this.d, H3, i21, 0);
                    }
                    i19 = i12 + 1;
                    i13 = 1;
                    i14 = 0;
                    i15 = 2;
                }
                i11 = i15;
            } else if (m11 == 1952608120 && this.b) {
                i11 = 2;
                ia.f(xVar.a() >= 2);
                f10 = m0.h(xVar.H() / this.h, 0.0f, 0.95f);
            } else {
                i11 = 2;
            }
            xVar.N(i18 + m10);
            i15 = i11;
            i13 = 1;
            i14 = 0;
        }
        jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, i0.u(new b(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, 0))));
    }

    @Override // c4.m
    public final /* synthetic */ void reset() {
    }
}
