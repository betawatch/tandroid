package n2;

import android.os.Handler;
import ci.b1;
import java.nio.ByteBuffer;
import oi.b6;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class y0 extends f2.o {
    public final b6 i;

    public y0(b6 b6Var) {
        this.i = b6Var;
    }

    @Override // f2.n
    public final void c(ByteBuffer byteBuffer) {
        float f10;
        float f11;
        float[] fArr;
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = h2.l0.a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        b6 b6Var = this.i;
        float[] fArr2 = (float[]) b6Var.d;
        b1 b1Var = (b1) b6Var.c;
        ByteBuffer byteBuffer2 = (ByteBuffer) b6Var.e;
        i61 i61Var = (i61) b6Var.f;
        c61 c61Var = i61Var.L;
        Handler handler = i61Var.b0;
        if (c61Var != null) {
            if (order == f2.n.a || !i61Var.J) {
                handler.postDelayed(new w51(b6Var, 2), 80L);
            } else if (c61Var.t()) {
                int limit = order.limit();
                int i7 = 0;
                if (limit > 8192) {
                    handler.removeCallbacksAndMessages(null);
                    i61Var.L.x(false, null);
                } else {
                    byteBuffer2.put(order);
                    int i10 = b6Var.a + limit;
                    b6Var.a = i10;
                    if (i10 >= 1024) {
                        byteBuffer2.position(0);
                        for (int i11 = 0; i11 < 1024; i11++) {
                            fArr2[i11] = byteBuffer2.getShort() / 32768.0f;
                        }
                        byteBuffer2.rewind();
                        b6Var.a = 0;
                        b1Var.getClass();
                        float f12 = 0.0f;
                        if (fArr2.length != 1024) {
                            f10 = 0.0f;
                            f11 = 1.0f;
                        } else {
                            for (int i12 = 0; i12 < 1024; i12++) {
                                ((float[]) b1Var.b)[i12] = fArr2[((int[]) b1Var.f)[i12]];
                                ((float[]) b1Var.c)[i12] = 0.0f;
                            }
                            int i13 = 1;
                            while (i13 < ((float[]) b1Var.b).length) {
                                float f13 = ((float[]) b1Var.h)[i13];
                                float f14 = ((float[]) b1Var.g)[i13];
                                float f15 = f12;
                                int i14 = i7;
                                float f16 = 1.0f;
                                while (i14 < i13) {
                                    float f17 = f12;
                                    int i15 = i14;
                                    while (true) {
                                        float[] fArr3 = (float[]) b1Var.b;
                                        if (i15 < fArr3.length) {
                                            int i16 = i15 + i13;
                                            float f18 = fArr3[i16];
                                            float[] fArr4 = (float[]) b1Var.c;
                                            float f19 = fArr4[i16];
                                            float f20 = (f16 * f18) - (f15 * f19);
                                            float f21 = (f18 * f15) + (f19 * f16);
                                            fArr3[i16] = fArr3[i15] - f20;
                                            fArr4[i16] = fArr4[i15] - f21;
                                            fArr3[i15] = fArr3[i15] + f20;
                                            fArr4[i15] = fArr4[i15] + f21;
                                            i15 += i13 * 2;
                                        }
                                    }
                                    float f22 = (f16 * f13) - (f15 * f14);
                                    f15 = (f15 * f13) + (f16 * f14);
                                    i14++;
                                    f16 = f22;
                                    f12 = f17;
                                }
                                i13 *= 2;
                                i7 = 0;
                            }
                            f10 = f12;
                            f11 = 1.0f;
                            int i17 = 0;
                            while (true) {
                                fArr = (float[]) b1Var.d;
                                if (i17 >= fArr.length) {
                                    break;
                                }
                                float f23 = ((float[]) b1Var.b)[i17];
                                float f24 = ((float[]) b1Var.c)[i17];
                                fArr[i17] = (float) Math.sqrt((f24 * f24) + (f23 * f23));
                                i17++;
                            }
                            if (b1Var.a == 1) {
                                int length = fArr.length / ((float[]) b1Var.e).length;
                                for (int i18 = 0; i18 < ((float[]) b1Var.e).length; i18++) {
                                    float f25 = f10;
                                    int i19 = 0;
                                    while (i19 < length) {
                                        int i20 = (i18 * length) + i19;
                                        float[] fArr5 = (float[]) b1Var.d;
                                        if (i20 < fArr5.length) {
                                            f25 += fArr5[i20];
                                            i19++;
                                        }
                                    }
                                    ((float[]) b1Var.e)[i18] = f25 / (i19 + 1);
                                }
                            }
                        }
                        float f26 = f10;
                        for (int i21 = 0; i21 < 1024; i21++) {
                            float f27 = ((float[]) b1Var.b)[i21];
                            float f28 = ((float[]) b1Var.c)[i21];
                            float sqrt = ((float) Math.sqrt((f28 * f28) + (f27 * f27))) / 30.0f;
                            if (sqrt > f11) {
                                sqrt = f11;
                            } else if (sqrt < f10) {
                                sqrt = f10;
                            }
                            f26 += sqrt * sqrt;
                        }
                        float sqrt2 = (float) Math.sqrt(f26 / 1024);
                        float[] fArr6 = new float[7];
                        fArr6[6] = sqrt2;
                        if (sqrt2 < 0.4f) {
                            for (int i22 = 0; i22 < 7; i22++) {
                                fArr6[i22] = f10;
                            }
                        } else {
                            for (int i23 = 0; i23 < 6; i23++) {
                                int i24 = ls.A2 * i23;
                                float f29 = ((float[]) b1Var.b)[i24];
                                float f30 = ((float[]) b1Var.c)[i24];
                                float sqrt3 = (float) (Math.sqrt((f30 * f30) + (f29 * f29)) / 30.0d);
                                fArr6[i23] = sqrt3;
                                if (sqrt3 > f11) {
                                    fArr6[i23] = f11;
                                } else if (sqrt3 < f10) {
                                    fArr6[i23] = f10;
                                }
                            }
                        }
                        if (System.currentTimeMillis() - b6Var.b >= 64) {
                            b6Var.b = System.currentTimeMillis();
                            handler.postDelayed(new fm0(23, b6Var, fArr6), 130L);
                        }
                    }
                }
            }
        }
        l(remaining).put(byteBuffer).flip();
    }

    @Override // f2.o
    public final void i() {
        m();
    }

    @Override // f2.o
    public final void j() {
        m();
    }

    @Override // f2.o
    public final void k() {
        m();
    }

    public final void m() {
        if (isActive()) {
            f2.k kVar = this.b;
            int i7 = kVar.a;
            int i10 = kVar.b;
            int i11 = kVar.c;
            this.i.getClass();
        }
    }

    @Override // f2.o
    public final f2.k h(f2.k kVar) {
        return kVar;
    }
}
