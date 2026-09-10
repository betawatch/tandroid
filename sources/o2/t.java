package o2;

import android.text.TextUtils;
import b2.r0;
import b2.s0;
import c3.h0;
import e2.b0;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class t implements c3.o {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final b0 b;
    public final z3.k d;
    public final boolean e;
    public c3.q f;
    public int h;
    public final v c = new v();
    public byte[] g = new byte[1024];

    public t(String str, b0 b0Var, z3.k kVar, boolean z10) {
        this.a = str;
        this.b = b0Var;
        this.d = kVar;
        this.e = z10;
    }

    public final h0 a(long j3) {
        h0 I = this.f.I(0, 3);
        b2.r rVar = new b2.r();
        rVar.q = r0.n("text/vtt");
        rVar.d = this.a;
        rVar.v = j3;
        hc.b.u(rVar, I);
        this.f.B();
        return I;
    }

    @Override // c3.o
    public final boolean b(c3.p pVar) {
        c3.l lVar = (c3.l) pVar;
        lVar.g(this.g, 0, 6, false);
        byte[] bArr = this.g;
        v vVar = this.c;
        vVar.H(6, bArr);
        if (i4.i.a(vVar)) {
            return true;
        }
        lVar.g(this.g, 6, 3, false);
        vVar.H(9, this.g);
        return i4.i.a(vVar);
    }

    @Override // c3.o
    public final void g(c3.q qVar) {
        if (this.e) {
            qVar = new com.google.firebase.messaging.m(qVar, this.d);
        }
        this.f = qVar;
        qVar.G(new c3.t(-9223372036854775807L));
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        throw new IllegalStateException();
    }

    @Override // c3.o
    public final List i() {
        g0 g0Var = i0.b;
        return a1.e;
    }

    @Override // c3.o
    public final int m(c3.p pVar, c3.s sVar) {
        String k10;
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
        v vVar = new v(this.g);
        i4.i.d(vVar);
        String k11 = vVar.k(StandardCharsets.UTF_8);
        long j3 = 0;
        long j10 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(k11)) {
                while (true) {
                    String k12 = vVar.k(StandardCharsets.UTF_8);
                    if (k12 == null) {
                        break;
                    }
                    if (i4.i.a.matcher(k12).matches()) {
                        do {
                            k10 = vVar.k(StandardCharsets.UTF_8);
                            if (k10 != null) {
                            }
                        } while (!k10.isEmpty());
                    } else {
                        Matcher matcher2 = i4.h.a.matcher(k12);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c10 = i4.i.c(group);
                String str = d0.a;
                long b10 = this.b.b(d0.Y((j3 + c10) - j10, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                h0 a2 = a(b10 - c10);
                byte[] bArr3 = this.g;
                int i13 = this.h;
                v vVar2 = this.c;
                vVar2.H(i13, bArr3);
                a2.d(this.h, vVar2);
                a2.c(b10, 1, this.h, 0, null);
                return -1;
            }
            if (k11.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(k11);
                if (!matcher3.find()) {
                    throw s0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(k11));
                }
                Matcher matcher4 = j.matcher(k11);
                if (!matcher4.find()) {
                    throw s0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(k11));
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j10 = i4.i.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                String str2 = d0.a;
                j3 = d0.Y(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
            k11 = vVar.k(StandardCharsets.UTF_8);
        }
    }

    @Override // c3.o
    public final c3.o c() {
        return this;
    }

    @Override // c3.o
    public final void release() {
    }
}
