package di;

import b8.zb;
import c4.f;
import h2.p;
import h2.q;
import h2.r;
import java.nio.ByteBuffer;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a {
    public boolean a;

    public a(r rVar, q qVar) {
        int i3 = qVar.a;
        ByteBuffer byteBuffer = qVar.b;
        zb.f(i3 == 6 || i3 == 3);
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
        int j10 = fVar.j(2);
        boolean i10 = fVar.i();
        if (rVar.b) {
            throw new p();
        }
        if (!i10) {
            this.a = true;
            return;
        }
        boolean i11 = (j10 == 3 || j10 == 0) ? true : fVar.i();
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
        if (j10 != 3) {
            fVar.K();
        }
        fVar.L(rVar.f);
        if (j10 != 2 && j10 != 0 && !i11) {
            fVar.L(3);
        }
        this.a = ((j10 == 3 || j10 == 0) ? hs.e4 : fVar.j(8)) != 0;
    }

    public void a(boolean z10) {
        if (this.a == z10) {
            return;
        }
        this.a = z10;
    }
}
