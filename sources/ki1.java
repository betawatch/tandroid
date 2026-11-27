// default package

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ki1 extends ef0 {
    public lo5 i;
    public lo5 j;

    @Override // q20
    public final void d(ByteBuffer byteBuffer) {
        lo5 lo5Var = this.j;
        lo5Var.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l = l(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i = 0; i < lo5Var.b; i++) {
                int u = (gcc.u(this.b.c) * lo5Var.b(i)) + position;
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
                                                            p3d.e(this.b.c, "Unexpected encoding: ");
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
                            yve.h(((-16777216) & i3) == 0 || (i3 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i3));
                            yve.f(l.remaining() >= 3);
                            l.put((byte) (l.order() == byteOrder ? (i3 & 16711680) >> 16 : i3 & jn7.d4)).put((byte) ((65280 & i3) >> 8)).put((byte) (l.order() == byteOrder ? i3 & jn7.d4 : (i3 & 16711680) >> 16));
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

    @Override // ef0
    public final m20 h(m20 m20Var) {
        int i = m20Var.c;
        lo5 lo5Var = this.i;
        if (lo5Var == null) {
            return m20.e;
        }
        int i2 = m20Var.b;
        if (!gcc.N(i)) {
            throw new p20(m20Var);
        }
        int i3 = lo5Var.b;
        boolean z = i2 != i3;
        int i4 = 0;
        while (i4 < i3) {
            int b = lo5Var.b(i4);
            if (b >= i2) {
                throw new p20("Channel map (" + lo5Var + ") trying to access non-existent input channel.", m20Var);
            }
            z |= b != i4;
            i4++;
        }
        return z ? new m20(m20Var.a, i3, i) : m20.e;
    }

    @Override // ef0
    public final void i() {
        this.j = this.i;
    }

    @Override // ef0
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
