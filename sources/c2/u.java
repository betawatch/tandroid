package c2;

import e2.m0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class u extends o {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117 A[ADDED_TO_REGION, LOOP:7: B:48:0x0117->B:49:0x0119, LOOP_START, PHI: r0
      0x0117: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:15:0x0044, B:49:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c2.n
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
                                    if (i12 != 1879048192) {
                                        throw new IllegalStateException();
                                    }
                                    i11 /= 4;
                                }
                            }
                        }
                        ByteBuffer l4 = l(i11);
                        i10 = this.b.c;
                        if (i10 == 3) {
                            while (position < limit) {
                                l4.put((byte) 0);
                                l4.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i10 == 4) {
                            while (position < limit) {
                                short h = (short) (m0.h(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                                l4.put((byte) (h & 255));
                                l4.put((byte) ((h >> 8) & 255));
                                position += 4;
                            }
                        } else if (i10 == 21) {
                            while (position < limit) {
                                l4.put(byteBuffer.get(position + 1));
                                l4.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i10 == 22) {
                            while (position < limit) {
                                l4.put(byteBuffer.get(position + 2));
                                l4.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i10 == 268435456) {
                            while (position < limit) {
                                l4.put(byteBuffer.get(position + 1));
                                l4.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i10 == 1342177280) {
                            while (position < limit) {
                                l4.put(byteBuffer.get(position + 1));
                                l4.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else if (i10 == 1610612736) {
                            while (position < limit) {
                                l4.put(byteBuffer.get(position + 1));
                                l4.put(byteBuffer.get(position));
                                position += 4;
                            }
                        } else {
                            if (i10 != 1879048192) {
                                throw new IllegalStateException();
                            }
                            while (position < limit) {
                                short max = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(position), 1.0d)) * 32767.0d);
                                l4.put((byte) (max & 255));
                                l4.put((byte) ((max >> 8) & 255));
                                position += 8;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        l4.flip();
                    }
                }
                i11 /= 3;
            }
            i11 /= 2;
            ByteBuffer l42 = l(i11);
            i10 = this.b.c;
            if (i10 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            l42.flip();
        }
        i11 *= 2;
        ByteBuffer l422 = l(i11);
        i10 = this.b.c;
        if (i10 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        l422.flip();
    }

    @Override // c2.o
    public final k h(k kVar) {
        int i10 = kVar.c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4 || i10 == 1879048192) {
            return i10 != 2 ? new k(kVar.a, kVar.b, 2) : k.e;
        }
        throw new m(kVar);
    }
}
