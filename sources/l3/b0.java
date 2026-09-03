package l3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b0 extends a0 {
    public int[] i;
    public int[] j;

    @Override // l3.n
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j10 = j(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i10 : iArr) {
                j10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        j10.flip();
    }

    @Override // l3.a0
    public final l f(l lVar) {
        int[] iArr = this.i;
        if (iArr == null) {
            return l.e;
        }
        int i10 = lVar.c;
        int i11 = lVar.b;
        if (i10 != 2) {
            throw new m(lVar);
        }
        boolean z4 = i11 != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new m(lVar);
            }
            z4 |= i13 != i12;
            i12++;
        }
        return z4 ? new l(lVar.a, iArr.length, 2) : l.e;
    }

    @Override // l3.a0
    public final void g() {
        this.j = this.i;
    }

    @Override // l3.a0
    public final void i() {
        this.j = null;
        this.i = null;
    }
}
