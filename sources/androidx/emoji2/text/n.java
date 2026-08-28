package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final com.google.firebase.messaging.t b;
    public volatile int c = 0;

    public n(com.google.firebase.messaging.t tVar, int i9) {
        this.b = tVar;
        this.a = i9;
    }

    public final int a(int i9) {
        p1.a b10 = b();
        int a2 = b10.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b10.d;
        int i10 = a2 + b10.a;
        return byteBuffer.getInt((i9 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final p1.a b() {
        ThreadLocal threadLocal = d;
        p1.a aVar = (p1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new p1.a();
            threadLocal.set(aVar);
        }
        p1.b bVar = (p1.b) this.b.b;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i9 = a2 + bVar.a;
            int i10 = (this.a * 4) + ((ByteBuffer) bVar.d).getInt(i9) + i9 + 4;
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
        int i9;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        p1.a b10 = b();
        int a2 = b10.a(4);
        sb2.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) b10.d).getInt(a2 + b10.a) : 0));
        sb2.append(", codepoints:");
        p1.a b11 = b();
        int a3 = b11.a(16);
        if (a3 != 0) {
            int i10 = a3 + b11.a;
            i9 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i10) + i10);
        } else {
            i9 = 0;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
