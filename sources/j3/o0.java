package j3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o0 extends x {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[ADDED_TO_REGION, LOOP:4: B:33:0x00af->B:34:0x00b1, LOOP_START, PHI: r0
      0x00af: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0036, B:34:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // j3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ByteBuffer byteBuffer) {
        int i9;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.b.c;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 268435456) {
                    if (i11 == 536870912) {
                        i10 /= 3;
                    } else if (i11 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer j10 = j(i10);
                i9 = this.b.c;
                if (i9 == 3) {
                    while (position < limit) {
                        j10.put((byte) 0);
                        j10.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i9 == 4) {
                    while (position < limit) {
                        short g10 = (short) (d5.f0.g(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                        j10.put((byte) (g10 & 255));
                        j10.put((byte) ((g10 >> 8) & 255));
                        position += 4;
                    }
                } else if (i9 == 268435456) {
                    while (position < limit) {
                        j10.put(byteBuffer.get(position + 1));
                        j10.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i9 == 536870912) {
                    while (position < limit) {
                        j10.put(byteBuffer.get(position + 1));
                        j10.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else {
                    if (i9 != 805306368) {
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
            i10 /= 2;
            ByteBuffer j102 = j(i10);
            i9 = this.b.c;
            if (i9 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            j102.flip();
        }
        i10 *= 2;
        ByteBuffer j1022 = j(i10);
        i9 = this.b.c;
        if (i9 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        j1022.flip();
    }

    @Override // j3.x
    public final h f(h hVar) {
        int i9 = hVar.c;
        if (i9 == 3 || i9 == 2 || i9 == 268435456 || i9 == 536870912 || i9 == 805306368 || i9 == 4) {
            return i9 != 2 ? new h(hVar.a, hVar.b, 2) : h.e;
        }
        throw new i(hVar);
    }
}
