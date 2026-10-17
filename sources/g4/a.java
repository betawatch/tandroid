package g4;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import d2.b;
import e2.j;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.telegram.tgnet.TLObject;
import r.c;
import v7.u6;
import z3.d;
import z3.l;
import z3.m;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        int i10 = bArr[25] * 20;
        this.h = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.b = z10;
        if (z10) {
            this.f = m0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    @Override // z3.m
    public final /* synthetic */ d a(int i10, int i11, byte[] bArr) {
        return c.a(this, bArr, i11);
    }

    @Override // z3.m
    public final int c() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z3.m
    public final void g(byte[] bArr, int i10, int i11, l lVar, j jVar) {
        String y3;
        int i12;
        int i13;
        x xVar = this.a;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        int i14 = 1;
        int i15 = 0;
        int i16 = 2;
        u6.g(xVar.a() >= 2);
        int H = xVar.H();
        if (H == 0) {
            y3 = "";
        } else {
            int i17 = xVar.b;
            Charset J = xVar.J();
            int i18 = H - (xVar.b - i17);
            if (J == null) {
                J = StandardCharsets.UTF_8;
            }
            y3 = xVar.y(i18, J);
        }
        if (y3.isEmpty()) {
            l0 l0Var = n0.b;
            jVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, x1.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y3);
        d(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f7 = this.f;
        while (xVar.a() >= 8) {
            int i19 = xVar.b;
            int m10 = xVar.m();
            int m11 = xVar.m();
            if (m11 == 1937013100) {
                u6.g(xVar.a() >= i16 ? i14 : i15);
                int H2 = xVar.H();
                int i20 = i15;
                while (i20 < H2) {
                    u6.g(xVar.a() >= 12 ? i14 : i15);
                    int H3 = xVar.H();
                    int H4 = xVar.H();
                    xVar.O(i16);
                    int i21 = i20;
                    int A = xVar.A();
                    xVar.O(i14);
                    int m12 = xVar.m();
                    if (H4 > spannableStringBuilder.length()) {
                        StringBuilder l4 = i0.a.l(H4, "Truncating styl end (", ") to cueText.length() (");
                        l4.append(spannableStringBuilder.length());
                        l4.append(").");
                        e2.a.l("Tx3gParser", l4.toString());
                        H4 = spannableStringBuilder.length();
                    }
                    if (H3 >= H4) {
                        e2.a.l("Tx3gParser", "Ignoring styl with start (" + H3 + ") >= end (" + H4 + ").");
                        i13 = i21;
                    } else {
                        i13 = i21;
                        int i22 = H4;
                        d(spannableStringBuilder, A, this.c, H3, i22, 0);
                        b(spannableStringBuilder, m12, this.d, H3, i22, 0);
                    }
                    i20 = i13 + 1;
                    i14 = 1;
                    i15 = 0;
                    i16 = 2;
                }
                i12 = i16;
            } else if (m11 == 1952608120 && this.b) {
                i12 = 2;
                u6.g(xVar.a() >= 2);
                f7 = m0.h(xVar.H() / this.h, 0.0f, 0.95f);
            } else {
                i12 = 2;
            }
            xVar.N(i19 + m10);
            i16 = i12;
            i14 = 1;
            i15 = 0;
        }
        jVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, n0.y(new b(spannableStringBuilder, null, null, null, f7, 0, 0, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f, 0))));
    }

    @Override // z3.m
    public final /* synthetic */ void reset() {
    }
}
