package k2;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.y61;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class m0 extends c2.i {
    public final g71 i;

    public m0(g71 g71Var) {
        this.i = g71Var;
    }

    @Override // c2.h
    public final void c(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = e2.d0.a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        g71 g71Var = this.i;
        float[] fArr = g71Var.b;
        ByteBuffer byteBuffer2 = g71Var.c;
        FourierTransform.FFT fft = g71Var.a;
        h71 h71Var = g71Var.f;
        a71 a71Var = h71Var.K;
        Handler handler = h71Var.a0;
        if (a71Var != null) {
            if (order == c2.h.a || !h71Var.I) {
                handler.postDelayed(new y61(g71Var, 1), 80L);
            } else if (a71Var.needUpdate()) {
                int limit = order.limit();
                int i10 = 0;
                if (limit > 8192) {
                    handler.removeCallbacksAndMessages(null);
                    h71Var.K.onVisualizerUpdate(false, true, null);
                } else {
                    byteBuffer2.put(order);
                    int i11 = g71Var.d + limit;
                    g71Var.d = i11;
                    if (i11 >= 1024) {
                        byteBuffer2.position(0);
                        for (int i12 = 0; i12 < 1024; i12++) {
                            fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                        }
                        byteBuffer2.rewind();
                        g71Var.d = 0;
                        fft.forward(fArr);
                        int i13 = 0;
                        float f7 = 0.0f;
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
                        if (System.currentTimeMillis() - g71Var.e >= 64) {
                            g71Var.e = System.currentTimeMillis();
                            handler.postDelayed(new br0(17, g71Var, fArr2), 130L);
                        }
                    }
                }
            }
        }
        j(remaining).put(byteBuffer).flip();
    }

    @Override // c2.i
    public final void g() {
        k();
    }

    @Override // c2.i
    public final void h() {
        k();
    }

    @Override // c2.i
    public final void i() {
        k();
    }

    public final void k() {
        if (isActive()) {
            int i10 = this.b.a;
            this.i.getClass();
        }
    }

    @Override // c2.i
    public final c2.f f(c2.f fVar) {
        return fVar;
    }
}
