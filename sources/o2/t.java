package o2;

import android.text.TextUtils;
import b2.v;
import b2.v0;
import b2.w0;
import c3.j0;
import e2.k0;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class t implements c3.o {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final k0 b;
    public final z3.k d;
    public final boolean e;
    public c3.q f;
    public int h;
    public final x c = new x();
    public byte[] g = new byte[1024];

    public t(String str, k0 k0Var, z3.k kVar, boolean z10) {
        this.a = str;
        this.b = k0Var;
        this.d = kVar;
        this.e = z10;
    }

    @Override // c3.o
    public final boolean a(c3.p pVar) {
        c3.l lVar = (c3.l) pVar;
        lVar.j(this.g, 0, 6, false);
        byte[] bArr = this.g;
        x xVar = this.c;
        xVar.L(6, bArr);
        if (i4.i.a(xVar)) {
            return true;
        }
        lVar.j(this.g, 6, 3, false);
        xVar.L(9, this.g);
        return i4.i.a(xVar);
    }

    @Override // c3.o
    public final void c(c3.q qVar) {
        if (this.e) {
            qVar = new c2.b(qVar, this.d);
        }
        this.f = qVar;
        qVar.g0(new c3.t(-9223372036854775807L));
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // c3.o
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    @Override // c3.o
    public final int f(c3.p pVar, c3.s sVar) {
        String n10;
        this.f.getClass();
        int length = (int) pVar.getLength();
        int i10 = this.h;
        byte[] bArr = this.g;
        if (i10 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i11 = this.h;
        int read = pVar.read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.h + read;
            this.h = i12;
            if (length == -1 || i12 != length) {
                return 0;
            }
        }
        x xVar = new x(this.g);
        i4.i.d(xVar);
        String n11 = xVar.n(StandardCharsets.UTF_8);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(n11)) {
                while (true) {
                    String n12 = xVar.n(StandardCharsets.UTF_8);
                    if (n12 == null) {
                        break;
                    }
                    if (i4.i.a.matcher(n12).matches()) {
                        do {
                            n10 = xVar.n(StandardCharsets.UTF_8);
                            if (n10 != null) {
                            }
                        } while (!n10.isEmpty());
                    } else {
                        Matcher matcher2 = i4.h.a.matcher(n12);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    g(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c10 = i4.i.c(group);
                String str = m0.a;
                long b10 = this.b.b(m0.a0((j10 + c10) - j11, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                j0 g10 = g(b10 - c10);
                byte[] bArr3 = this.g;
                int i13 = this.h;
                x xVar2 = this.c;
                xVar2.L(i13, bArr3);
                g10.d(this.h, xVar2);
                g10.c(b10, 1, this.h, 0, null);
                return -1;
            }
            if (n11.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(n11);
                if (!matcher3.find()) {
                    throw w0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n11));
                }
                Matcher matcher4 = j.matcher(n11);
                if (!matcher4.find()) {
                    throw w0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n11));
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j11 = i4.i.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                String str2 = m0.a;
                j10 = m0.a0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
            n11 = xVar.n(StandardCharsets.UTF_8);
        }
    }

    public final j0 g(long j10) {
        j0 j02 = this.f.j0(0, 3);
        v vVar = new v();
        vVar.r = v0.n("text/vtt");
        vVar.d = this.a;
        vVar.w = j10;
        i2.e.u(vVar, j02);
        this.f.H();
        return j02;
    }

    @Override // c3.o
    public final c3.o b() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
