package n2;

import android.os.Handler;
import ci.b1;
import java.nio.ByteBuffer;
import oi.z5;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class y0 extends f2.n {
    public final z5 i;

    public y0(z5 z5Var) {
        this.i = z5Var;
    }

    @Override // f2.m
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
        z5 z5Var = this.i;
        float[] fArr2 = (float[]) z5Var.d;
        b1 b1Var = (b1) z5Var.c;
        ByteBuffer byteBuffer2 = (ByteBuffer) z5Var.e;
        u51 u51Var = (u51) z5Var.f;
        o51 o51Var = u51Var.L;
        Handler handler = u51Var.b0;
        if (o51Var != null) {
            if (order == f2.m.a || !u51Var.J) {
                handler.postDelayed(new w41(z5Var, 3), 80L);
            } else if (o51Var.v()) {
                int limit = order.limit();
                int i7 = 0;
                if (limit > 8192) {
                    handler.removeCallbacksAndMessages(null);
                    u51Var.L.A(false, null);
                } else {
                    byteBuffer2.put(order);
                    int i10 = z5Var.a + limit;
                    z5Var.a = i10;
                    if (i10 >= 1024) {
                        byteBuffer2.position(0);
                        for (int i11 = 0; i11 < 1024; i11++) {
                            fArr2[i11] = byteBuffer2.getShort() / 32768.0f;
                        }
                        byteBuffer2.rewind();
                        z5Var.a = 0;
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
                                int i24 = ns.A2 * i23;
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
                        if (System.currentTimeMillis() - z5Var.b >= 64) {
                            z5Var.b = System.currentTimeMillis();
                            handler.postDelayed(new hh0(26, z5Var, fArr6), 130L);
                        }
                    }
                }
            }
        }
        l(remaining).put(byteBuffer).flip();
    }

    @Override // f2.n
    public final void i() {
        m();
    }

    @Override // f2.n
    public final void j() {
        m();
    }

    @Override // f2.n
    public final void k() {
        m();
    }

    public final void m() {
        if (isActive()) {
            f2.j jVar = this.b;
            int i7 = jVar.a;
            int i10 = jVar.b;
            int i11 = jVar.c;
            this.i.getClass();
        }
    }

    @Override // f2.n
    public final f2.j h(f2.j jVar) {
        return jVar;
    }
}
