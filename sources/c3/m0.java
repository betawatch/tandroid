package c3;

import java.nio.ByteBuffer;
import org.telegram.messenger.zs;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m0 {
    public boolean a;

    public m0(f2.t tVar, f2.s sVar) {
        int i10 = sVar.a;
        ByteBuffer byteBuffer = sVar.b;
        t6.f(i10 == 6 || i10 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.g gVar = new a4.g(bArr, min);
        if (tVar.a) {
            throw new f2.r();
        }
        if (gVar.h()) {
            this.a = false;
            return;
        }
        int i11 = gVar.i(2);
        boolean h = gVar.h();
        if (tVar.b) {
            throw new f2.r();
        }
        if (!h) {
            this.a = true;
            return;
        }
        boolean h10 = (i11 == 3 || i11 == 0) ? true : gVar.h();
        gVar.e0();
        if (!tVar.d) {
            throw new f2.r();
        }
        if (gVar.h()) {
            if (!tVar.e) {
                throw new f2.r();
            }
            gVar.e0();
        }
        if (tVar.c) {
            throw new f2.r();
        }
        if (i11 != 3) {
            gVar.e0();
        }
        gVar.f0(tVar.f);
        if (i11 != 2 && i11 != 0 && !h10) {
            gVar.f0(3);
        }
        this.a = ((i11 == 3 || i11 == 0) ? zs.e4 : gVar.i(8)) != 0;
    }

    public void a(boolean z10) {
        if (this.a == z10) {
            return;
        }
        this.a = z10;
    }
}
