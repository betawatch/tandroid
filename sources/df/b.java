package df;

import a1.g;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends c {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ff.a aVar, c cVar, String str, int i10) {
        super(aVar, cVar, str);
        this.g = i10;
    }

    public static void h(StringBuffer stringBuffer, c cVar) {
        c cVar2 = (c) cVar.c;
        if (cVar2 != null) {
            h(stringBuffer, cVar2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) cVar.d);
    }

    public long i() {
        return ((ff.b) ((ff.a) this.b)).e();
    }

    public boolean j() {
        b bVar = (b) this.f;
        return (bVar != null ? bVar.i() : 0L) < i();
    }

    public b k(String str) {
        while (i() > 0) {
            b c10 = c();
            if (((String) c10.d).matches(str)) {
                return c10;
            }
        }
        throw new IOException("atom type mismatch, not found: ".concat(str));
    }

    public short l() {
        return ((DataInputStream) this.e).readShort();
    }

    public String m() {
        byte[] bArr = new byte[(int) i()];
        ((DataInputStream) this.e).readFully(bArr);
        String str = new String(bArr, "UTF-8");
        int indexOf = str.indexOf(0);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public void n(int i10) {
        int i11 = 0;
        while (i11 < i10) {
            int skipBytes = ((DataInputStream) this.e).skipBytes(i10 - i11);
            if (skipBytes <= 0) {
                throw new EOFException();
            }
            i11 += skipBytes;
        }
    }

    @Override // df.c
    public final String toString() {
        switch (this.g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j10 = ((ff.a) ((c) this.c).b).b;
                ff.a aVar = (ff.a) this.b;
                stringBuffer.append(j10 - aVar.b);
                stringBuffer.append(",pos=");
                stringBuffer.append(aVar.b);
                stringBuffer.append(",len=");
                ff.b bVar = (ff.b) aVar;
                stringBuffer.append(bVar.e() + bVar.b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return g.q(new StringBuilder("mp4[pos="), ((ff.a) this.b).b, "]");
        }
    }
}
