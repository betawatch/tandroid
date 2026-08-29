package l3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class z extends y {
    public int[] i;
    public int[] j;

    @Override // l3.j
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

    @Override // l3.y
    public final h f(h hVar) {
        int[] iArr = this.i;
        if (iArr == null) {
            return h.e;
        }
        int i10 = hVar.c;
        int i11 = hVar.b;
        if (i10 != 2) {
            throw new i(hVar);
        }
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new i(hVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
        return z10 ? new h(hVar.a, iArr.length, 2) : h.e;
    }

    @Override // l3.y
    public final void g() {
        this.j = this.i;
    }

    @Override // l3.y
    public final void i() {
        this.j = null;
        this.i = null;
    }
}
