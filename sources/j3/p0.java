package j3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p0 extends y {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[ADDED_TO_REGION, LOOP:4: B:33:0x00af->B:34:0x00b1, LOOP_START, PHI: r0
      0x00af: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0036, B:34:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // j3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        int i12 = this.b.c;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 != 268435456) {
                    if (i12 == 536870912) {
                        i11 /= 3;
                    } else if (i12 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer j10 = j(i11);
                i10 = this.b.c;
                if (i10 == 3) {
                    while (position < limit) {
                        j10.put((byte) 0);
                        j10.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i10 == 4) {
                    while (position < limit) {
                        short g10 = (short) (d5.g0.g(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                        j10.put((byte) (g10 & 255));
                        j10.put((byte) ((g10 >> 8) & 255));
                        position += 4;
                    }
                } else if (i10 == 268435456) {
                    while (position < limit) {
                        j10.put(byteBuffer.get(position + 1));
                        j10.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i10 == 536870912) {
                    while (position < limit) {
                        j10.put(byteBuffer.get(position + 1));
                        j10.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else {
                    if (i10 != 805306368) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        j10.put(byteBuffer.get(position + 2));
                        j10.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                j10.flip();
            }
            i11 /= 2;
            ByteBuffer j102 = j(i11);
            i10 = this.b.c;
            if (i10 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            j102.flip();
        }
        i11 *= 2;
        ByteBuffer j1022 = j(i11);
        i10 = this.b.c;
        if (i10 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        j1022.flip();
    }

    @Override // j3.y
    public final h f(h hVar) {
        int i10 = hVar.c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 2 ? new h(hVar.a, hVar.b, 2) : h.e;
        }
        throw new i(hVar);
    }
}
