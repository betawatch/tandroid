// default package

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ci1 extends cf0 {
    public im5 i;
    public im5 j;

    @Override // p20
    public final void d(ByteBuffer byteBuffer) {
        im5 im5Var = this.j;
        im5Var.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l = l(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i = 0; i < im5Var.b; i++) {
                int u = (g8c.u(this.b.c) * im5Var.b(i)) + position;
                int i2 = this.b.c;
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 21) {
                                if (i2 != 22) {
                                    if (i2 != 268435456) {
                                        if (i2 != 1342177280) {
                                            if (i2 != 1610612736) {
                                                if (i2 != 1879048192) {
                                                    if (i2 != 1895825408) {
                                                        if (i2 != 1912602624) {
                                                            fvc.d(this.b.c, "Unexpected encoding: ");
                                                            return;
                                                        }
                                                    }
                                                }
                                                l.putDouble(byteBuffer.getDouble(u));
                                            }
                                        }
                                    }
                                }
                                l.putInt(byteBuffer.getInt(u));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            byte b = byteBuffer.get(order == byteOrder ? u : u + 2);
                            byte b2 = byteBuffer.get(u + 1);
                            if (byteBuffer.order() == byteOrder) {
                                u += 2;
                            }
                            int i3 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(u) << 8) & 65280)) >> 8;
                            gre.h(((-16777216) & i3) == 0 || (i3 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i3));
                            gre.f(l.remaining() >= 3);
                            l.put((byte) (l.order() == byteOrder ? (i3 & 16711680) >> 16 : i3 & kk7.d4)).put((byte) ((65280 & i3) >> 8)).put((byte) (l.order() == byteOrder ? i3 & kk7.d4 : (i3 & 16711680) >> 16));
                        }
                        l.putFloat(byteBuffer.getFloat(u));
                    } else {
                        l.put(byteBuffer.get(u));
                    }
                }
                l.putShort(byteBuffer.getShort(u));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        l.flip();
    }

    @Override // cf0
    public final l20 h(l20 l20Var) {
        int i = l20Var.c;
        im5 im5Var = this.i;
        if (im5Var == null) {
            return l20.e;
        }
        int i2 = l20Var.b;
        if (!g8c.N(i)) {
            throw new o20(l20Var);
        }
        int i3 = im5Var.b;
        boolean z = i2 != i3;
        int i4 = 0;
        while (i4 < i3) {
            int b = im5Var.b(i4);
            if (b >= i2) {
                throw new o20("Channel map (" + im5Var + ") trying to access non-existent input channel.", l20Var);
            }
            z |= b != i4;
            i4++;
        }
        return z ? new l20(l20Var.a, i3, i) : l20.e;
    }

    @Override // cf0
    public final void i() {
        this.j = this.i;
    }

    @Override // cf0
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
