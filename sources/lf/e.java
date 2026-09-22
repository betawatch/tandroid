package lf;

import com.google.android.gms.common.api.internal.n1;
import java.io.EOFException;
import java.io.InputStream;
import k2.c0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class e {
    public static final n1 e = new n1(1);
    public final mf.a a;
    public final j b;
    public final f c;
    public final c0 d;

    public e(InputStream inputStream, long j3, int i10, j jVar, f fVar) {
        mf.a aVar = new mf.a(inputStream, j3, i10);
        this.a = aVar;
        this.d = new c0(aVar, 3);
        this.b = jVar;
        this.c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z10) {
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.d || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.b;
                    if (i11 == i13) {
                        i10 = (i12 + 1) - i13;
                        break;
                    }
                } else {
                    i11 = 0;
                }
            }
        }
        try {
            String str = new String(bArr, 0, i10, bVar.a.name());
            return (str.length() <= 0 || str.charAt(0) != 65279) ? str : str.substring(1);
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte o9 = this.d.o();
        if (o9 == 0) {
            return b.c;
        }
        if (o9 == 1) {
            return b.d;
        }
        if (o9 == 2) {
            return b.e;
        }
        if (o9 == 3) {
            return b.f;
        }
        throw new c(hg.c.i(o9, "Invalid encoding: "));
    }

    public final String c(int i10, b bVar) {
        if (i10 > this.a.e()) {
            throw new c(hg.c.i(i10, "Could not read fixed-length string of length: "));
        }
        d dVar = (d) e.get();
        byte[] bArr = dVar.a;
        if (i10 > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (i10 > length);
            dVar.a = new byte[length];
        }
        byte[] bArr2 = dVar.a;
        int i11 = 0;
        while (true) {
            c0 c0Var = this.d;
            if (i11 >= i10) {
                c0Var.getClass();
                return a(bArr2, i10, bVar, true);
            }
            int read = ((com.google.firebase.messaging.d) c0Var.b).read(bArr2, i11, i10 - i11);
            if (read <= 0) {
                throw new EOFException();
            }
            i11 += read;
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.a.e());
        d dVar = (d) e.get();
        byte[] bArr = dVar.a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.a = new byte[length];
        }
        byte[] bArr2 = dVar.a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte o9 = this.d.o();
            bArr2[i12] = o9;
            if (o9 != 0 || (bVar == b.d && i11 == 0 && i12 % 2 != 0)) {
                i11 = 0;
            } else {
                i11++;
                int i13 = bVar.b;
                if (i11 == i13) {
                    return a(bArr2, (i12 + 1) - i13, bVar, false);
                }
            }
        }
        throw new c("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("id3v2frame[pos=");
        mf.a aVar = this.a;
        sb2.append(aVar.b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
