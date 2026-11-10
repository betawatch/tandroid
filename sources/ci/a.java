package ci;

import a8.ia;
import d4.f;
import i2.p;
import i2.q;
import i2.r;
import java.nio.ByteBuffer;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a {
    public boolean a;

    public a(r rVar, q qVar) {
        int i7 = qVar.a;
        ByteBuffer byteBuffer = qVar.b;
        ia.f(i7 == 6 || i7 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        f fVar = new f(bArr, min);
        if (rVar.a) {
            throw new p();
        }
        if (fVar.i()) {
            this.a = false;
            return;
        }
        int j3 = fVar.j(2);
        boolean i10 = fVar.i();
        if (rVar.b) {
            throw new p();
        }
        if (!i10) {
            this.a = true;
            return;
        }
        boolean i11 = (j3 == 3 || j3 == 0) ? true : fVar.i();
        fVar.K();
        if (!rVar.d) {
            throw new p();
        }
        if (fVar.i()) {
            if (!rVar.e) {
                throw new p();
            }
            fVar.K();
        }
        if (rVar.c) {
            throw new p();
        }
        if (j3 != 3) {
            fVar.K();
        }
        fVar.L(rVar.f);
        if (j3 != 2 && j3 != 0 && !i11) {
            fVar.L(3);
        }
        this.a = ((j3 == 3 || j3 == 0) ? qs.e4 : fVar.j(8)) != 0;
    }

    public void a(boolean z9) {
        if (this.a == z9) {
            return;
        }
        this.a = z9;
    }
}
