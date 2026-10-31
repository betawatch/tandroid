package ef;

import com.google.android.gms.common.api.internal.o1;
import java.io.EOFException;
import java.io.InputStream;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e {
    public static final o1 e = new o1(1);
    public final ff.b a;
    public final h b;
    public final f c;
    public final k6.h d;

    public e(InputStream inputStream, long j10, int i10, h hVar, f fVar) {
        ff.b bVar = new ff.b(inputStream, j10, i10);
        this.a = bVar;
        this.d = new k6.h(bVar, 22);
        this.b = hVar;
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
        byte v = this.d.v();
        if (v == 0) {
            return b.c;
        }
        if (v == 1) {
            return b.d;
        }
        if (v == 2) {
            return b.e;
        }
        if (v == 3) {
            return b.f;
        }
        throw new c(i0.a.i(v, "Invalid encoding: "));
    }

    public final String c(int i10, b bVar) {
        if (i10 > this.a.e()) {
            throw new c(i0.a.i(i10, "Could not read fixed-length string of length: "));
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
            k6.h hVar = this.d;
            if (i11 >= i10) {
                hVar.getClass();
                return a(bArr2, i10, bVar, true);
            }
            int read = ((ff.a) hVar.b).read(bArr2, i11, i10 - i11);
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
            byte v = this.d.v();
            bArr2[i12] = v;
            if (v != 0 || (bVar == b.d && i11 == 0 && i12 % 2 != 0)) {
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
        ff.b bVar = this.a;
        sb2.append(bVar.b);
        sb2.append(", ");
        sb2.append(bVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
