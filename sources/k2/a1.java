package k2;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.z71;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class a1 extends c2.o {
    public final z71 i;

    public a1(z71 z71Var) {
        this.i = z71Var;
    }

    @Override // c2.n
    public final void c(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = e2.m0.a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        z71 z71Var = this.i;
        float[] fArr = z71Var.b;
        ByteBuffer byteBuffer2 = z71Var.c;
        FourierTransform.FFT fft = z71Var.a;
        a81 a81Var = z71Var.f;
        t71 t71Var = a81Var.K;
        Handler handler = a81Var.a0;
        if (t71Var != null) {
            if (order == c2.n.a || !a81Var.I) {
                handler.postDelayed(new s71(z71Var, 1), 80L);
            } else if (t71Var.needUpdate()) {
                int limit = order.limit();
                int i10 = 0;
                if (limit > 8192) {
                    handler.removeCallbacksAndMessages(null);
                    a81Var.K.onVisualizerUpdate(false, true, null);
                } else {
                    byteBuffer2.put(order);
                    int i11 = z71Var.d + limit;
                    z71Var.d = i11;
                    if (i11 >= 1024) {
                        byteBuffer2.position(0);
                        for (int i12 = 0; i12 < 1024; i12++) {
                            fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                        }
                        byteBuffer2.rewind();
                        z71Var.d = 0;
                        fft.forward(fArr);
                        float f7 = 0.0f;
                        int i13 = 0;
                        while (true) {
                            float f10 = 1.0f;
                            if (i13 >= 1024) {
                                break;
                            }
                            float f11 = fft.getSpectrumReal()[i13];
                            float f12 = fft.getSpectrumImaginary()[i13];
                            float sqrt = ((float) Math.sqrt((f12 * f12) + (f11 * f11))) / 30.0f;
                            if (sqrt <= 1.0f) {
                                f10 = sqrt < 0.0f ? 0.0f : sqrt;
                            }
                            f7 += f10 * f10;
                            i13++;
                        }
                        float sqrt2 = (float) Math.sqrt(f7 / 1024);
                        float[] fArr2 = new float[7];
                        fArr2[6] = sqrt2;
                        if (sqrt2 < 0.4f) {
                            while (i10 < 7) {
                                fArr2[i10] = 0.0f;
                                i10++;
                            }
                        } else {
                            while (i10 < 6) {
                                int i14 = 170 * i10;
                                float f13 = fft.getSpectrumReal()[i14];
                                float f14 = fft.getSpectrumImaginary()[i14];
                                float sqrt3 = (float) (Math.sqrt((f14 * f14) + (f13 * f13)) / 30.0d);
                                fArr2[i10] = sqrt3;
                                if (sqrt3 > 1.0f) {
                                    fArr2[i10] = 1.0f;
                                } else if (sqrt3 < 0.0f) {
                                    fArr2[i10] = 0.0f;
                                }
                                i10++;
                            }
                        }
                        if (System.currentTimeMillis() - z71Var.e >= 64) {
                            z71Var.e = System.currentTimeMillis();
                            handler.postDelayed(new go0(22, z71Var, fArr2), 130L);
                        }
                    }
                }
            }
        }
        l(remaining).put(byteBuffer).flip();
    }

    @Override // c2.o
    public final void i() {
        m();
    }

    @Override // c2.o
    public final void j() {
        m();
    }

    @Override // c2.o
    public final void k() {
        m();
    }

    public final void m() {
        if (isActive()) {
            int i10 = this.b.a;
            this.i.getClass();
        }
    }

    @Override // c2.o
    public final c2.k h(c2.k kVar) {
        return kVar;
    }
}
