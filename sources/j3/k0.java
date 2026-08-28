package j3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k0 extends x {
    public static final int i = Float.floatToIntBits(Float.NaN);

    @Override // j3.j
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer j10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        int i10 = this.b.c;
        int i11 = i;
        if (i10 == 536870912) {
            j10 = j((i9 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits == i11) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                j10.putInt(floatToIntBits);
                position += 3;
            }
        } else {
            if (i10 != 805306368) {
                throw new IllegalStateException();
            }
            j10 = j(i9);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i11) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                j10.putInt(floatToIntBits2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j10.flip();
    }

    @Override // j3.x
    public final h f(h hVar) {
        int i9 = hVar.c;
        if (i9 == 536870912 || i9 == 805306368 || i9 == 4) {
            return i9 != 4 ? new h(hVar.a, hVar.b, 4) : h.e;
        }
        throw new i(hVar);
    }
}
