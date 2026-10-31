package k2;

import android.os.Handler;
import bi.r6;
import java.nio.ByteBuffer;
import org.telegram.messenger.k9;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d1 extends c2.n {
    public final r6 i;

    public d1(r6 r6Var) {
        this.i = r6Var;
    }

    @Override // c2.m
    public final void b(ByteBuffer byteBuffer) {
        float f7;
        float f10;
        float[] fArr;
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = e2.l0.a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        r6 r6Var = this.i;
        float[] fArr2 = (float[]) r6Var.d;
        k9 k9Var = (k9) r6Var.c;
        ByteBuffer byteBuffer2 = (ByteBuffer) r6Var.e;
        u61 u61Var = (u61) r6Var.f;
        o61 o61Var = u61Var.K;
        Handler handler = u61Var.a0;
        if (o61Var != null) {
            if (order == c2.m.a || !u61Var.I) {
                handler.postDelayed(new j51(r6Var, 4), 80L);
            } else if (o61Var.k()) {
                int limit = order.limit();
                int i10 = 0;
                if (limit > 8192) {
                    handler.removeCallbacksAndMessages(null);
                    u61Var.K.B(false, null);
                } else {
                    byteBuffer2.put(order);
                    int i11 = r6Var.a + limit;
                    r6Var.a = i11;
                    if (i11 >= 1024) {
                        byteBuffer2.position(0);
                        for (int i12 = 0; i12 < 1024; i12++) {
                            fArr2[i12] = byteBuffer2.getShort() / 32768.0f;
                        }
                        byteBuffer2.rewind();
                        r6Var.a = 0;
                        k9Var.getClass();
                        float f11 = 0.0f;
                        if (fArr2.length != 1024) {
                            f7 = 0.0f;
                            f10 = 1.0f;
                        } else {
                            for (int i13 = 0; i13 < 1024; i13++) {
                                ((float[]) k9Var.b)[i13] = fArr2[((int[]) k9Var.h)[i13]];
                                ((float[]) k9Var.c)[i13] = 0.0f;
                            }
                            int i14 = 1;
                            while (i14 < ((float[]) k9Var.b).length) {
                                float f12 = ((float[]) k9Var.g)[i14];
                                float f13 = ((float[]) k9Var.f)[i14];
                                float f14 = f11;
                                int i15 = i10;
                                float f15 = 1.0f;
                                while (i15 < i14) {
                                    float f16 = f11;
                                    int i16 = i15;
                                    while (true) {
                                        float[] fArr3 = (float[]) k9Var.b;
                                        if (i16 < fArr3.length) {
                                            int i17 = i16 + i14;
                                            float f17 = fArr3[i17];
                                            float[] fArr4 = (float[]) k9Var.c;
                                            float f18 = fArr4[i17];
                                            float f19 = (f15 * f17) - (f14 * f18);
                                            float f20 = (f17 * f14) + (f18 * f15);
                                            fArr3[i17] = fArr3[i16] - f19;
                                            fArr4[i17] = fArr4[i16] - f20;
                                            fArr3[i16] = fArr3[i16] + f19;
                                            fArr4[i16] = fArr4[i16] + f20;
                                            i16 += i14 * 2;
                                        }
                                    }
                                    float f21 = (f15 * f12) - (f14 * f13);
                                    f14 = (f14 * f12) + (f15 * f13);
                                    i15++;
                                    f15 = f21;
                                    f11 = f16;
                                }
                                i14 *= 2;
                                i10 = 0;
                            }
                            f7 = f11;
                            f10 = 1.0f;
                            int i18 = 0;
                            while (true) {
                                fArr = (float[]) k9Var.d;
                                if (i18 >= fArr.length) {
                                    break;
                                }
                                float f22 = ((float[]) k9Var.b)[i18];
                                float f23 = ((float[]) k9Var.c)[i18];
                                fArr[i18] = (float) Math.sqrt((f23 * f23) + (f22 * f22));
                                i18++;
                            }
                            if (k9Var.a == 1) {
                                int length = fArr.length / ((float[]) k9Var.e).length;
                                for (int i19 = 0; i19 < ((float[]) k9Var.e).length; i19++) {
                                    float f24 = f7;
                                    int i20 = 0;
                                    while (i20 < length) {
                                        int i21 = (i19 * length) + i20;
                                        float[] fArr5 = (float[]) k9Var.d;
                                        if (i21 < fArr5.length) {
                                            f24 += fArr5[i21];
                                            i20++;
                                        }
                                    }
                                    ((float[]) k9Var.e)[i19] = f24 / (i20 + 1);
                                }
                            }
                        }
                        float f25 = f7;
                        for (int i22 = 0; i22 < 1024; i22++) {
                            float f26 = ((float[]) k9Var.b)[i22];
                            float f27 = ((float[]) k9Var.c)[i22];
                            float sqrt = ((float) Math.sqrt((f27 * f27) + (f26 * f26))) / 30.0f;
                            if (sqrt > f10) {
                                sqrt = f10;
                            } else if (sqrt < f7) {
                                sqrt = f7;
                            }
                            f25 += sqrt * sqrt;
                        }
                        float sqrt2 = (float) Math.sqrt(f25 / 1024);
                        float[] fArr6 = new float[7];
                        fArr6[6] = sqrt2;
                        if (sqrt2 < 0.4f) {
                            for (int i23 = 0; i23 < 7; i23++) {
                                fArr6[i23] = f7;
                            }
                        } else {
                            for (int i24 = 0; i24 < 6; i24++) {
                                int i25 = zs.A2 * i24;
                                float f28 = ((float[]) k9Var.b)[i25];
                                float f29 = ((float[]) k9Var.c)[i25];
                                float sqrt3 = (float) (Math.sqrt((f29 * f29) + (f28 * f28)) / 30.0d);
                                fArr6[i24] = sqrt3;
                                if (sqrt3 > f10) {
                                    fArr6[i24] = f10;
                                } else if (sqrt3 < f7) {
                                    fArr6[i24] = f7;
                                }
                            }
                        }
                        if (System.currentTimeMillis() - r6Var.b >= 64) {
                            r6Var.b = System.currentTimeMillis();
                            handler.postDelayed(new gi0(24, r6Var, fArr6), 130L);
                        }
                    }
                }
            }
        }
        l(remaining).put(byteBuffer).flip();
    }

    @Override // c2.n
    public final void i() {
        m();
    }

    @Override // c2.n
    public final void j() {
        m();
    }

    @Override // c2.n
    public final void k() {
        m();
    }

    public final void m() {
        if (isActive()) {
            c2.j jVar = this.b;
            int i10 = jVar.a;
            int i11 = jVar.b;
            int i12 = jVar.c;
            this.i.getClass();
        }
    }

    @Override // c2.n
    public final c2.j h(c2.j jVar) {
        return jVar;
    }
}
