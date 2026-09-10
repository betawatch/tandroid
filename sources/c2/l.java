package c2;

import e2.d0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class l extends i {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e5->B:43:0x00e7, LOOP_START, PHI: r0
      0x00e5: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003e, B:43:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ByteBuffer byteBuffer) {
        int i10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        int i12 = this.b.c;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 != 21) {
                    if (i12 != 22) {
                        if (i12 != 268435456) {
                            if (i12 != 1342177280) {
                                if (i12 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                        ByteBuffer j3 = j(i11);
                        i10 = this.b.c;
                        if (i10 == 3) {
                            while (position < limit) {
                                j3.put((byte) 0);
                                j3.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i10 == 4) {
                            while (position < limit) {
                                short g10 = (short) (d0.g(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                                j3.put((byte) (g10 & 255));
                                j3.put((byte) ((g10 >> 8) & 255));
                                position += 4;
                            }
                        } else if (i10 == 21) {
                            while (position < limit) {
                                j3.put(byteBuffer.get(position + 1));
                                j3.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i10 == 22) {
                            while (position < limit) {
                                j3.put(byteBuffer.get(position + 2));
                                j3.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i10 == 268435456) {
                            while (position < limit) {
                                j3.put(byteBuffer.get(position + 1));
                                j3.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i10 == 1342177280) {
                            while (position < limit) {
                                j3.put(byteBuffer.get(position + 1));
                                j3.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else {
                            if (i10 != 1610612736) {
                                throw new IllegalStateException();
                            }
                            while (position < limit) {
                                j3.put(byteBuffer.get(position + 1));
                                j3.put(byteBuffer.get(position));
                                position += 4;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        j3.flip();
                    }
                }
                i11 /= 3;
            }
            i11 /= 2;
            ByteBuffer j32 = j(i11);
            i10 = this.b.c;
            if (i10 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            j32.flip();
        }
        i11 *= 2;
        ByteBuffer j322 = j(i11);
        i10 = this.b.c;
        if (i10 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        j322.flip();
    }

    @Override // c2.i
    public final f f(f fVar) {
        int i10 = fVar.c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4) {
            return i10 != 2 ? new f(fVar.a, fVar.b, 2) : f.e;
        }
        throw new g(fVar);
    }
}
