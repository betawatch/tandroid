package ei;

import a8.ja;
import d4.f;
import i2.p;
import i2.q;
import i2.r;
import java.nio.ByteBuffer;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a {
    public boolean a;

    public a(r rVar, q qVar) {
        int i7 = qVar.a;
        ByteBuffer byteBuffer = qVar.b;
        ja.f(i7 == 6 || i7 == 3);
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
        this.a = ((j3 == 3 || j3 == 0) ? ns.e4 : fVar.j(8)) != 0;
    }

    public void a(boolean z10) {
        if (this.a == z10) {
            return;
        }
        this.a = z10;
    }
}
