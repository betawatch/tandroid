package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final ui.f b;
    public volatile int c = 0;

    public p(ui.f fVar, int i3) {
        this.b = fVar;
        this.a = i3;
    }

    public final int a(int i3) {
        r1.a b10 = b();
        int a10 = b10.a(16);
        if (a10 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b10.d;
        int i10 = a10 + b10.a;
        return byteBuffer.getInt((i3 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final r1.a b() {
        ThreadLocal threadLocal = d;
        r1.a aVar = (r1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new r1.a();
            threadLocal.set(aVar);
        }
        r1.b bVar = (r1.b) this.b.b;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i3 = a10 + bVar.a;
            int i10 = (this.a * 4) + ((ByteBuffer) bVar.d).getInt(i3) + i3 + 4;
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
        int i3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        r1.a b10 = b();
        int a10 = b10.a(4);
        sb2.append(Integer.toHexString(a10 != 0 ? ((ByteBuffer) b10.d).getInt(a10 + b10.a) : 0));
        sb2.append(", codepoints:");
        r1.a b11 = b();
        int a11 = b11.a(16);
        if (a11 != 0) {
            int i10 = a11 + b11.a;
            i3 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i10) + i10);
        } else {
            i3 = 0;
        }
        for (int i11 = 0; i11 < i3; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
