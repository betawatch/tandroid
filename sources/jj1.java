// default package

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jj1 extends cg0 {
    public io5 i;
    public io5 j;

    @Override // p30
    public final void d(ByteBuffer byteBuffer) {
        io5 io5Var = this.j;
        io5Var.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l = l(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i = 0; i < io5Var.b; i++) {
                int u = (hac.u(this.b.c) * io5Var.b(i)) + position;
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
                                                            i2d.e(this.b.c, "Unexpected encoding: ");
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
                            jte.h(((-16777216) & i3) == 0 || (i3 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i3));
                            jte.f(l.remaining() >= 3);
                            l.put((byte) (l.order() == byteOrder ? (i3 & 16711680) >> 16 : i3 & nm7.d4)).put((byte) ((65280 & i3) >> 8)).put((byte) (l.order() == byteOrder ? i3 & nm7.d4 : (i3 & 16711680) >> 16));
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

    @Override // cg0
    public final l30 h(l30 l30Var) {
        int i = l30Var.c;
        io5 io5Var = this.i;
        if (io5Var == null) {
            return l30.e;
        }
        int i2 = l30Var.b;
        if (!hac.N(i)) {
            throw new o30(l30Var);
        }
        int i3 = io5Var.b;
        boolean z = i2 != i3;
        int i4 = 0;
        while (i4 < i3) {
            int b = io5Var.b(i4);
            if (b >= i2) {
                throw new o30("Channel map (" + io5Var + ") trying to access non-existent input channel.", l30Var);
            }
            z |= b != i4;
            i4++;
        }
        return z ? new l30(l30Var.a, i3, i) : l30.e;
    }

    @Override // cg0
    public final void i() {
        this.j = this.i;
    }

    @Override // cg0
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
