package j3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y extends x {
    public int[] i;
    public int[] j;

    @Override // j3.j
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j10 = j(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i9 : iArr) {
                j10.putShort(byteBuffer.getShort((i9 * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        j10.flip();
    }

    @Override // j3.x
    public final h f(h hVar) {
        int[] iArr = this.i;
        if (iArr == null) {
            return h.e;
        }
        int i9 = hVar.c;
        int i10 = hVar.b;
        if (i9 != 2) {
            throw new i(hVar);
        }
        boolean z10 = i10 != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= i10) {
                throw new i(hVar);
            }
            z10 |= i12 != i11;
            i11++;
        }
        return z10 ? new h(hVar.a, iArr.length, 2) : h.e;
    }

    @Override // j3.x
    public final void g() {
        this.j = this.i;
    }

    @Override // j3.x
    public final void i() {
        this.j = null;
        this.i = null;
    }
}
