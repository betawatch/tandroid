// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class btb extends ef0 {
    public final /* synthetic */ byte i;

    public /* synthetic */ btb(byte b) {
        this.i = b;
    }

    public static void m(int i, ByteBuffer byteBuffer) {
        float f = (float) (i * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f) ? 0 : Float.floatToIntBits(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0180 A[ADDED_TO_REGION, LOOP:9: B:62:0x0180->B:63:0x0182, LOOP_START, PHI: r2
      0x0180: PHI (r2v24 int) = (r2v23 int), (r2v25 int) binds: [B:19:0x0056, B:63:0x0182] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // q20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ByteBuffer byteBuffer) {
        ByteBuffer l;
        int i;
        switch (this.i) {
            case 0:
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                int i2 = limit - position;
                int i3 = this.b.c;
                if (i3 == 2) {
                    l = l(i2 << 1);
                    while (position < limit) {
                        m(byteBuffer.getShort(position) << 16, l);
                        position += 2;
                    }
                } else if (i3 == 3) {
                    l = l(i2 << 2);
                    while (position < limit) {
                        m(((byteBuffer.get(position) & 255) - 128) << 24, l);
                        position++;
                    }
                } else if (i3 == 21) {
                    l = l((i2 / 3) << 2);
                    while (position < limit) {
                        m(ype.c(byteBuffer.get(position + 2), byteBuffer.get(position + 1), byteBuffer.get(position), (byte) 0), l);
                        position += 3;
                    }
                } else if (i3 == 22) {
                    l = l(i2);
                    while (position < limit) {
                        m(byteBuffer.getInt(position), l);
                        position += 4;
                    }
                } else if (i3 == 268435456) {
                    l = l(i2 << 1);
                    while (position < limit) {
                        m(Short.reverseBytes(byteBuffer.getShort(position)) << 16, l);
                        position += 2;
                    }
                } else if (i3 == 1342177280) {
                    l = l((i2 / 3) << 2);
                    while (position < limit) {
                        m(ype.c(byteBuffer.get(position), byteBuffer.get(position + 1), byteBuffer.get(position + 2), (byte) 0), l);
                        position += 3;
                    }
                } else if (i3 == 1610612736) {
                    l = l(i2);
                    while (position < limit) {
                        m(Integer.reverseBytes(byteBuffer.getInt(position)), l);
                        position += 4;
                    }
                } else if (i3 == 1879048192) {
                    l = l(i2 / 2);
                    while (position < limit) {
                        l.putFloat((float) byteBuffer.getDouble(position));
                        position += 8;
                    }
                } else if (i3 == 1895825408) {
                    l = l(i2);
                    while (position < limit) {
                        l.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position))));
                        position += 4;
                    }
                } else if (i3 != 1912602624) {
                    grb.g();
                    break;
                } else {
                    l = l(i2 / 2);
                    while (position < limit) {
                        l.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position))));
                        position += 8;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                l.flip();
                break;
            default:
                int position2 = byteBuffer.position();
                int limit2 = byteBuffer.limit();
                int i4 = limit2 - position2;
                int i5 = this.b.c;
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 21) {
                            if (i5 != 22) {
                                if (i5 != 268435456) {
                                    if (i5 != 1342177280) {
                                        if (i5 != 1610612736) {
                                            if (i5 != 1879048192) {
                                                if (i5 != 1895825408) {
                                                    if (i5 != 1912602624) {
                                                        grb.g();
                                                        break;
                                                    }
                                                }
                                            }
                                            i4 /= 4;
                                        }
                                    }
                                }
                                ByteBuffer l2 = l(i4);
                                i = this.b.c;
                                if (i == 3) {
                                    while (position2 < limit2) {
                                        l2.put((byte) 0);
                                        l2.put((byte) ((byteBuffer.get(position2) & 255) - 128));
                                        position2++;
                                    }
                                } else if (i == 4) {
                                    while (position2 < limit2) {
                                        short h = (short) (gcc.h(byteBuffer.getFloat(position2), -1.0f, 1.0f) * 32767.0f);
                                        l2.put((byte) (h & 255));
                                        l2.put((byte) ((h >> 8) & jn7.d4));
                                        position2 += 4;
                                    }
                                } else if (i == 21) {
                                    while (position2 < limit2) {
                                        l2.put(byteBuffer.get(position2 + 1));
                                        l2.put(byteBuffer.get(position2 + 2));
                                        position2 += 3;
                                    }
                                } else if (i == 22) {
                                    while (position2 < limit2) {
                                        l2.put(byteBuffer.get(position2 + 2));
                                        l2.put(byteBuffer.get(position2 + 3));
                                        position2 += 4;
                                    }
                                } else if (i == 268435456) {
                                    while (position2 < limit2) {
                                        l2.put(byteBuffer.get(position2 + 1));
                                        l2.put(byteBuffer.get(position2));
                                        position2 += 2;
                                    }
                                } else if (i == 1342177280) {
                                    while (position2 < limit2) {
                                        l2.put(byteBuffer.get(position2 + 1));
                                        l2.put(byteBuffer.get(position2));
                                        position2 += 3;
                                    }
                                } else if (i == 1610612736) {
                                    while (position2 < limit2) {
                                        l2.put(byteBuffer.get(position2 + 1));
                                        l2.put(byteBuffer.get(position2));
                                        position2 += 4;
                                    }
                                } else if (i == 1879048192) {
                                    while (position2 < limit2) {
                                        short max = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(position2), 1.0d)) * 32767.0d);
                                        l2.put((byte) (max & 255));
                                        l2.put((byte) ((max >> 8) & jn7.d4));
                                        position2 += 8;
                                    }
                                } else if (i == 1895825408) {
                                    while (position2 < limit2) {
                                        short h2 = (short) (gcc.h(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position2))), -1.0f, 1.0f) * 32767.0f);
                                        l2.put((byte) (h2 & 255));
                                        l2.put((byte) ((h2 >> 8) & jn7.d4));
                                        position2 += 4;
                                    }
                                } else if (i != 1912602624) {
                                    grb.g();
                                    break;
                                } else {
                                    while (position2 < limit2) {
                                        short max2 = (short) (Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position2))), 1.0d)) * 32767.0d);
                                        l2.put((byte) (max2 & 255));
                                        l2.put((byte) ((max2 >> 8) & jn7.d4));
                                        position2 += 8;
                                    }
                                }
                                byteBuffer.position(byteBuffer.limit());
                                l2.flip();
                                break;
                            }
                        }
                        i4 /= 3;
                    }
                    i4 /= 2;
                    ByteBuffer l22 = l(i4);
                    i = this.b.c;
                    if (i == 3) {
                    }
                    byteBuffer.position(byteBuffer.limit());
                    l22.flip();
                }
                i4 <<= 1;
                ByteBuffer l222 = l(i4);
                i = this.b.c;
                if (i == 3) {
                }
                byteBuffer.position(byteBuffer.limit());
                l222.flip();
        }
    }

    @Override // ef0
    public final m20 h(m20 m20Var) {
        switch (this.i) {
            case 0:
                int i = m20Var.c;
                if (gcc.N(i)) {
                    return i != 4 ? new m20(m20Var.a, m20Var.b, 4) : m20.e;
                }
                throw new p20(m20Var);
            default:
                int i2 = m20Var.c;
                if (gcc.N(i2)) {
                    return i2 != 2 ? new m20(m20Var.a, m20Var.b, 2) : m20.e;
                }
                throw new p20(m20Var);
        }
    }
}
