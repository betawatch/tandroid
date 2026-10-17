package bi;

import a4.g;
import f2.r;
import f2.s;
import f2.t;
import java.nio.ByteBuffer;
import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class a {
    public boolean a;

    public a(t tVar, s sVar) {
        int i10 = sVar.a;
        ByteBuffer byteBuffer = sVar.b;
        u6.g(i10 == 6 || i10 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        g gVar = new g(bArr, min);
        if (tVar.a) {
            throw new r();
        }
        if (gVar.f()) {
            this.a = false;
            return;
        }
        int g10 = gVar.g(2);
        boolean f7 = gVar.f();
        if (tVar.b) {
            throw new r();
        }
        if (!f7) {
            this.a = true;
            return;
        }
        boolean f10 = (g10 == 3 || g10 == 0) ? true : gVar.f();
        gVar.n();
        if (!tVar.d) {
            throw new r();
        }
        if (gVar.f()) {
            if (!tVar.e) {
                throw new r();
            }
            gVar.n();
        }
        if (tVar.c) {
            throw new r();
        }
        if (g10 != 3) {
            gVar.n();
        }
        gVar.o(tVar.f);
        if (g10 != 2 && g10 != 0 && !f10) {
            gVar.o(3);
        }
        this.a = ((g10 == 3 || g10 == 0) ? 255 : gVar.g(8)) != 0;
    }

    public void a(boolean z10) {
        if (this.a == z10) {
            return;
        }
        this.a = z10;
    }
}
