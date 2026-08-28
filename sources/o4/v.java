package o4;

import android.text.TextUtils;
import d5.e0;
import d5.y;
import h3.s0;
import h3.t0;
import h3.t1;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v implements m3.k {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final e0 b;
    public m3.m d;
    public int f;
    public final y c = new y();
    public byte[] e = new byte[1024];

    public v(String str, e0 e0Var) {
        this.a = str;
        this.b = e0Var;
    }

    public final w a(long j10) {
        w I = this.d.I(0, 3);
        s0 s0Var = new s0();
        s0Var.o = "text/vtt";
        s0Var.c = this.a;
        s0Var.s = j10;
        I.c(new t0(s0Var));
        this.d.B();
        return I;
    }

    @Override // m3.k
    public final int b(m3.l lVar, m3.n nVar) {
        String f10;
        this.d.getClass();
        int i9 = (int) ((m3.h) lVar).c;
        int i10 = this.f;
        byte[] bArr = this.e;
        if (i10 == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((i9 != -1 ? i9 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i11 = this.f;
        int read = ((m3.h) lVar).read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.f + read;
            this.f = i12;
            if (i9 == -1 || i12 != i9) {
                return 0;
            }
        }
        y yVar = new y(this.e);
        a5.l.d(yVar);
        String f11 = yVar.f(n8.d.c);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(f11)) {
                while (true) {
                    String f12 = yVar.f(n8.d.c);
                    if (f12 == null) {
                        break;
                    }
                    if (a5.l.a.matcher(f12).matches()) {
                        do {
                            f10 = yVar.f(n8.d.c);
                            if (f10 != null) {
                            }
                        } while (!f10.isEmpty());
                    } else {
                        Matcher matcher2 = a5.j.a.matcher(f12);
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
                long c10 = a5.l.c(group);
                long b10 = this.b.b(((((j10 + c10) - j11) * 90000) / 1000000) % 8589934592L);
                w a2 = a(b10 - c10);
                byte[] bArr3 = this.e;
                int i13 = this.f;
                y yVar2 = this.c;
                yVar2.A(i13, bArr3);
                a2.a(this.f, yVar2);
                a2.e(b10, 1, this.f, 0, null);
                return -1;
            }
            if (f11.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = g.matcher(f11);
                if (!matcher3.find()) {
                    throw t1.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(f11), null);
                }
                Matcher matcher4 = h.matcher(f11);
                if (!matcher4.find()) {
                    throw t1.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(f11), null);
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j11 = a5.l.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                j10 = (Long.parseLong(group3) * 1000000) / 90000;
            }
            f11 = yVar.f(n8.d.c);
        }
    }

    @Override // m3.k
    public final void c(m3.m mVar) {
        this.d = mVar;
        mVar.y(new m3.o(-9223372036854775807L));
    }

    @Override // m3.k
    public final boolean f(m3.l lVar) {
        m3.h hVar = (m3.h) lVar;
        hVar.g(this.e, 0, 6, false);
        byte[] bArr = this.e;
        y yVar = this.c;
        yVar.A(6, bArr);
        if (a5.l.a(yVar)) {
            return true;
        }
        hVar.g(this.e, 6, 3, false);
        yVar.A(9, this.e);
        return a5.l.a(yVar);
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // m3.k
    public final void release() {
    }
}
