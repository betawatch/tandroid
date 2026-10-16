package ai;

import a4.g;
import f2.q;
import f2.r;
import f2.s;
import java.nio.ByteBuffer;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class a {
    public boolean a;

    public a(s sVar, r rVar) {
        int i10 = rVar.a;
        ByteBuffer byteBuffer = rVar.b;
        u6.g(i10 == 6 || i10 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        g gVar = new g(bArr, min);
        if (sVar.a) {
            throw new q();
        }
        if (gVar.f()) {
            this.a = false;
            return;
        }
        int g10 = gVar.g(2);
        boolean f7 = gVar.f();
        if (sVar.b) {
            throw new q();
        }
        if (!f7) {
            this.a = true;
            return;
        }
        boolean f10 = (g10 == 3 || g10 == 0) ? true : gVar.f();
        gVar.n();
        if (!sVar.d) {
            throw new q();
        }
        if (gVar.f()) {
            if (!sVar.e) {
                throw new q();
            }
            gVar.n();
        }
        if (sVar.c) {
            throw new q();
        }
        if (g10 != 3) {
            gVar.n();
        }
        gVar.o(sVar.f);
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
