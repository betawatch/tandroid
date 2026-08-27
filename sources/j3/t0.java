package j3;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.m61;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t0 extends y {
    public final l61 i;

    public t0(l61 l61Var) {
        this.i = l61Var;
    }

    @Override // j3.j
    public final void b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        l61 l61Var = this.i;
        float[] fArr = l61Var.b;
        ByteBuffer byteBuffer2 = l61Var.c;
        FourierTransform.FFT fft = l61Var.a;
        m61 m61Var = l61Var.f;
        f61 f61Var = m61Var.G;
        Handler handler = m61Var.W;
        if (f61Var != null) {
            if (asReadOnlyBuffer == j.a || !m61Var.E) {
                handler.postDelayed(new d61(l61Var, 1), 80L);
            } else if (f61Var.needUpdate()) {
                int limit = asReadOnlyBuffer.limit();
                int i10 = 0;
                if (limit > 8192) {
                    handler.removeCallbacksAndMessages(null);
                    m61Var.G.onVisualizerUpdate(false, true, null);
                } else {
                    byteBuffer2.put(asReadOnlyBuffer);
                    int i11 = l61Var.d + limit;
                    l61Var.d = i11;
                    if (i11 >= 1024) {
                        byteBuffer2.position(0);
                        for (int i12 = 0; i12 < 1024; i12++) {
                            fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                        }
                        byteBuffer2.rewind();
                        l61Var.d = 0;
                        fft.forward(fArr);
                        int i13 = 0;
                        float f10 = 0.0f;
                        while (true) {
                            float f11 = 1.0f;
                            if (i13 >= 1024) {
                                break;
                            }
                            float f12 = fft.getSpectrumReal()[i13];
                            float f13 = fft.getSpectrumImaginary()[i13];
                            float sqrt = ((float) Math.sqrt((f13 * f13) + (f12 * f12))) / 30.0f;
                            if (sqrt <= 1.0f) {
                                f11 = sqrt < 0.0f ? 0.0f : sqrt;
                            }
                            f10 += f11 * f11;
                            i13++;
                        }
                        float sqrt2 = (float) Math.sqrt(f10 / 1024);
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
                                float f14 = fft.getSpectrumReal()[i14];
                                float f15 = fft.getSpectrumImaginary()[i14];
                                float sqrt3 = (float) (Math.sqrt((f15 * f15) + (f14 * f14)) / 30.0d);
                                fArr2[i10] = sqrt3;
                                if (sqrt3 > 1.0f) {
                                    fArr2[i10] = 1.0f;
                                } else if (sqrt3 < 0.0f) {
                                    fArr2[i10] = 0.0f;
                                }
                                i10++;
                            }
                        }
                        if (System.currentTimeMillis() - l61Var.e >= 64) {
                            l61Var.e = System.currentTimeMillis();
                            handler.postDelayed(new lg0(29, l61Var, fArr2), 130L);
                        }
                    }
                }
            }
        }
        j(remaining).put(byteBuffer).flip();
    }

    @Override // j3.y
    public final void g() {
        k();
    }

    @Override // j3.y
    public final void h() {
        k();
    }

    @Override // j3.y
    public final void i() {
        k();
    }

    public final void k() {
        if (isActive()) {
            int i10 = this.b.a;
            this.i.getClass();
        }
    }

    @Override // j3.y
    public final h f(h hVar) {
        return hVar;
    }
}
