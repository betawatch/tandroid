package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class o {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final com.google.firebase.messaging.s b;
    public volatile int c = 0;

    public o(com.google.firebase.messaging.s sVar, int i10) {
        this.b = sVar;
        this.a = i10;
    }

    public final int a(int i10) {
        p1.a b10 = b();
        int a2 = b10.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b10.d;
        int i11 = a2 + b10.a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
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
            int i10 = a2 + bVar.a;
            int i11 = (this.a * 4) + ((ByteBuffer) bVar.d).getInt(i10) + i10 + 4;
            int i12 = ((ByteBuffer) bVar.d).getInt(i11) + i11;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.d;
            aVar.d = byteBuffer;
            if (byteBuffer != null) {
                aVar.a = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.b = i13;
                aVar.c = ((ByteBuffer) aVar.d).getShort(i13);
                return aVar;
            }
            aVar.a = 0;
            aVar.b = 0;
            aVar.c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        p1.a b10 = b();
        int a2 = b10.a(4);
        sb2.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) b10.d).getInt(a2 + b10.a) : 0));
        sb2.append(", codepoints:");
        p1.a b11 = b();
        int a10 = b11.a(16);
        if (a10 != 0) {
            int i11 = a10 + b11.a;
            i10 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(Integer.toHexString(a(i12)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
