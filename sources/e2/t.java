package e2;

import g2.n0;
import java.nio.ByteBuffer;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t extends n {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117 A[ADDED_TO_REGION, LOOP:7: B:48:0x0117->B:49:0x0119, LOOP_START, PHI: r0
      0x0117: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:15:0x0044, B:49:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // e2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ByteBuffer byteBuffer) {
        int i3;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.b.c;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 21) {
                    if (i11 != 22) {
                        if (i11 != 268435456) {
                            if (i11 != 1342177280) {
                                if (i11 != 1610612736) {
                                    if (i11 != 1879048192) {
                                        throw new IllegalStateException();
                                    }
                                    i10 /= 4;
                                }
                            }
                        }
                        ByteBuffer l10 = l(i10);
                        i3 = this.b.c;
                        if (i3 == 3) {
                            while (position < limit) {
                                l10.put((byte) 0);
                                l10.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i3 == 4) {
                            while (position < limit) {
                                short h = (short) (n0.h(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                                l10.put((byte) (h & 255));
                                l10.put((byte) ((h >> 8) & hs.e4));
                                position += 4;
                            }
                        } else if (i3 == 21) {
                            while (position < limit) {
                                l10.put(byteBuffer.get(position + 1));
                                l10.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i3 == 22) {
                            while (position < limit) {
                                l10.put(byteBuffer.get(position + 2));
                                l10.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i3 == 268435456) {
                            while (position < limit) {
                                l10.put(byteBuffer.get(position + 1));
                                l10.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i3 == 1342177280) {
                            while (position < limit) {
                                l10.put(byteBuffer.get(position + 1));
                                l10.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else if (i3 == 1610612736) {
                            while (position < limit) {
                                l10.put(byteBuffer.get(position + 1));
                                l10.put(byteBuffer.get(position));
                                position += 4;
                            }
                        } else {
                            if (i3 != 1879048192) {
                                throw new IllegalStateException();
                            }
                            while (position < limit) {
                                short max = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(position), 1.0d)) * 32767.0d);
                                l10.put((byte) (max & 255));
                                l10.put((byte) ((max >> 8) & hs.e4));
                                position += 8;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        l10.flip();
                    }
                }
                i10 /= 3;
            }
            i10 /= 2;
            ByteBuffer l102 = l(i10);
            i3 = this.b.c;
            if (i3 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            l102.flip();
        }
        i10 *= 2;
        ByteBuffer l1022 = l(i10);
        i3 = this.b.c;
        if (i3 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        l1022.flip();
    }

    @Override // e2.n
    public final j h(j jVar) {
        int i3 = jVar.c;
        if (i3 == 3 || i3 == 2 || i3 == 268435456 || i3 == 21 || i3 == 1342177280 || i3 == 22 || i3 == 1610612736 || i3 == 4 || i3 == 1879048192) {
            return i3 != 2 ? new j(jVar.a, jVar.b, 2) : j.e;
        }
        throw new l(jVar);
    }
}
