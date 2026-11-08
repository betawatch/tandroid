package androidx.emoji2.text;

import ab.b0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class o {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final b0 b;
    public volatile int c = 0;

    public o(b0 b0Var, int i7) {
        this.b = b0Var;
        this.a = i7;
    }

    public final int a(int i7) {
        s1.a b10 = b();
        int a10 = b10.a(16);
        if (a10 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b10.d;
        int i10 = a10 + b10.a;
        return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final s1.a b() {
        ThreadLocal threadLocal = d;
        s1.a aVar = (s1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new s1.a();
            threadLocal.set(aVar);
        }
        s1.b bVar = (s1.b) this.b.b;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i7 = a10 + bVar.a;
            int i10 = (this.a * 4) + ((ByteBuffer) bVar.d).getInt(i7) + i7 + 4;
            int i11 = ((ByteBuffer) bVar.d).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.d;
            aVar.d = byteBuffer;
            if (byteBuffer != null) {
                aVar.a = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar.b = i12;
                aVar.c = ((ByteBuffer) aVar.d).getShort(i12);
                return aVar;
            }
            aVar.a = 0;
            aVar.b = 0;
            aVar.c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i7;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        s1.a b10 = b();
        int a10 = b10.a(4);
        sb2.append(Integer.toHexString(a10 != 0 ? ((ByteBuffer) b10.d).getInt(a10 + b10.a) : 0));
        sb2.append(", codepoints:");
        s1.a b11 = b();
        int a11 = b11.a(16);
        if (a11 != 0) {
            int i10 = a11 + b11.a;
            i7 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i10) + i10);
        } else {
            i7 = 0;
        }
        for (int i11 = 0; i11 < i7; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
