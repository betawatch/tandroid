package c3;

import a8.yb;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class m0 {
    public boolean a;

    public m0(f2.t tVar, f2.s sVar) {
        int i10 = sVar.a;
        ByteBuffer byteBuffer = sVar.b;
        yb.g(i10 == 6 || i10 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.g gVar = new a4.g(bArr, min);
        if (tVar.a) {
            throw new f2.r();
        }
        if (gVar.f()) {
            this.a = false;
            return;
        }
        int g7 = gVar.g(2);
        boolean f7 = gVar.f();
        if (tVar.b) {
            throw new f2.r();
        }
        if (!f7) {
            this.a = true;
            return;
        }
        boolean f10 = (g7 == 3 || g7 == 0) ? true : gVar.f();
        gVar.n();
        if (!tVar.d) {
            throw new f2.r();
        }
        if (gVar.f()) {
            if (!tVar.e) {
                throw new f2.r();
            }
            gVar.n();
        }
        if (tVar.c) {
            throw new f2.r();
        }
        if (g7 != 3) {
            gVar.n();
        }
        gVar.o(tVar.f);
        if (g7 != 2 && g7 != 0 && !f10) {
            gVar.o(3);
        }
        this.a = ((g7 == 3 || g7 == 0) ? 255 : gVar.g(8)) != 0;
    }

    public void a(boolean z10) {
        if (this.a == z10) {
            return;
        }
        this.a = z10;
    }
}
