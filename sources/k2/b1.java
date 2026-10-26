package k2;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.s81;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b1 extends c2.p {
    public final r81 i;

    public b1(r81 r81Var) {
        this.i = r81Var;
    }

    @Override // c2.o
    public final void b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = e2.n0.a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        r81 r81Var = this.i;
        float[] fArr = r81Var.b;
        ByteBuffer byteBuffer2 = r81Var.c;
        FourierTransform.FFT fft = r81Var.a;
        s81 s81Var = r81Var.f;
        l81 l81Var = s81Var.K;
        Handler handler = s81Var.a0;
        if (l81Var != null) {
            if (order == c2.o.a || !s81Var.I) {
                handler.postDelayed(new s51(r81Var, 7), 80L);
            } else if (l81Var.needUpdate()) {
                int limit = order.limit();
                int i10 = 0;
                if (limit > 8192) {
                    handler.removeCallbacksAndMessages(null);
                    s81Var.K.onVisualizerUpdate(false, true, null);
                } else {
                    byteBuffer2.put(order);
                    int i11 = r81Var.d + limit;
                    r81Var.d = i11;
                    if (i11 >= 1024) {
                        byteBuffer2.position(0);
                        for (int i12 = 0; i12 < 1024; i12++) {
                            fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                        }
                        byteBuffer2.rewind();
                        r81Var.d = 0;
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
                        if (System.currentTimeMillis() - r81Var.e >= 64) {
                            r81Var.e = System.currentTimeMillis();
                            handler.postDelayed(new c71(3, r81Var, fArr2), 130L);
                        }
                    }
                }
            }
        }
        l(remaining).put(byteBuffer).flip();
    }

    @Override // c2.p
    public final void i() {
        m();
    }

    @Override // c2.p
    public final void j() {
        m();
    }

    @Override // c2.p
    public final void k() {
        m();
    }

    public final void m() {
        if (isActive()) {
            int i10 = this.b.a;
            this.i.getClass();
        }
    }

    @Override // c2.p
    public final c2.l h(c2.l lVar) {
        return lVar;
    }
}
