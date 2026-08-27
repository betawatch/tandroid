package o4;

import android.text.TextUtils;
import d5.f0;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.w;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v implements m3.k {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final f0 b;
    public m3.m d;
    public int f;
    public final z c = new z();
    public byte[] e = new byte[1024];

    public v(String str, f0 f0Var) {
        this.a = str;
        this.b = f0Var;
    }

    public final w a(long j10) {
        w C = this.d.C(0, 3);
        s0 s0Var = new s0();
        s0Var.o = "text/vtt";
        s0Var.c = this.a;
        s0Var.s = j10;
        C.c(new t0(s0Var));
        this.d.A();
        return C;
    }

    @Override // m3.k
    public final int b(m3.l lVar, m3.n nVar) {
        String f10;
        this.d.getClass();
        int i10 = (int) ((m3.h) lVar).c;
        int i11 = this.f;
        byte[] bArr = this.e;
        if (i11 == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i12 = this.f;
        int read = ((m3.h) lVar).read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f + read;
            this.f = i13;
            if (i10 == -1 || i13 != i10) {
                return 0;
            }
        }
        z zVar = new z(this.e);
        a5.m.d(zVar);
        String f11 = zVar.f(o8.d.c);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(f11)) {
                while (true) {
                    String f12 = zVar.f(o8.d.c);
                    if (f12 == null) {
                        break;
                    }
                    if (a5.m.a.matcher(f12).matches()) {
                        do {
                            f10 = zVar.f(o8.d.c);
                            if (f10 != null) {
                            }
                        } while (!f10.isEmpty());
                    } else {
                        Matcher matcher2 = a5.k.a.matcher(f12);
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
                long c10 = a5.m.c(group);
                long b10 = this.b.b(((((j10 + c10) - j11) * 90000) / 1000000) % 8589934592L);
                w a2 = a(b10 - c10);
                byte[] bArr3 = this.e;
                int i14 = this.f;
                z zVar2 = this.c;
                zVar2.A(i14, bArr3);
                a2.a(this.f, zVar2);
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
                j11 = a5.m.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                j10 = (Long.parseLong(group3) * 1000000) / 90000;
            }
            f11 = zVar.f(o8.d.c);
        }
    }

    @Override // m3.k
    public final void c(m3.m mVar) {
        this.d = mVar;
        mVar.n(new m3.o(-9223372036854775807L));
    }

    @Override // m3.k
    public final boolean f(m3.l lVar) {
        m3.h hVar = (m3.h) lVar;
        hVar.g(this.e, 0, 6, false);
        byte[] bArr = this.e;
        z zVar = this.c;
        zVar.A(6, bArr);
        if (a5.m.a(zVar)) {
            return true;
        }
        hVar.g(this.e, 6, 3, false);
        zVar.A(9, this.e);
        return a5.m.a(zVar);
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // m3.k
    public final void release() {
    }
}
