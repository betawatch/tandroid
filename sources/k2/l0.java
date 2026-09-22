package k2;

import android.os.Handler;
import java.nio.ByteBuffer;
import org.telegram.messenger.FourierTransform;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.yn0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class l0 extends c2.i {
    public final u71 i;

    public l0(u71 u71Var) {
        this.i = u71Var;
    }

    @Override // c2.h
    public final void c(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        String str = e2.d0.a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        u71 u71Var = this.i;
        float[] fArr = u71Var.b;
        ByteBuffer byteBuffer2 = u71Var.c;
        FourierTransform.FFT fft = u71Var.a;
        v71 v71Var = u71Var.f;
        o71 o71Var = v71Var.K;
        Handler handler = v71Var.a0;
        if (o71Var != null) {
            if (order == c2.h.a || !v71Var.I) {
                handler.postDelayed(new j71(u71Var, 2), 80L);
            } else if (o71Var.needUpdate()) {
                int limit = order.limit();
                int i10 = 0;
                if (limit > 8192) {
                    handler.removeCallbacksAndMessages(null);
                    v71Var.K.onVisualizerUpdate(false, true, null);
                } else {
                    byteBuffer2.put(order);
                    int i11 = u71Var.d + limit;
                    u71Var.d = i11;
                    if (i11 >= 1024) {
                        byteBuffer2.position(0);
                        for (int i12 = 0; i12 < 1024; i12++) {
                            fArr[i12] = byteBuffer2.getShort() / 32768.0f;
                        }
                        byteBuffer2.rewind();
                        u71Var.d = 0;
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
                        if (System.currentTimeMillis() - u71Var.e >= 64) {
                            u71Var.e = System.currentTimeMillis();
                            handler.postDelayed(new yn0(23, u71Var, fArr2), 130L);
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
