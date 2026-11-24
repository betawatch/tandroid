// default package

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o85 extends lka {
    public LinearGradient N0;
    public int O0;
    public final Matrix P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public float U0;
    public long V0;
    public final /* synthetic */ g95 W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o85(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.W0 = g95Var;
        this.P0 = new Matrix();
        this.Q0 = -1.0f;
    }

    @Override // lka
    public final void d(int i) {
        super.d(i);
        int textWidth = getTextWidth();
        if (textWidth != this.O0) {
            float f = textWidth;
            this.U0 = 1.3f * f;
            float textHeight = getTextHeight();
            float f2 = f * 2.0f;
            int w0 = cmb.w0(null, cmb.Yh, false);
            int w02 = cmb.w0(null, cmb.ai, false);
            int i2 = cmb.Zh;
            this.N0 = new LinearGradient(0.0f, textHeight, f2, 0.0f, new int[]{w0, w02, cmb.w0(null, i2, false), cmb.w0(null, i2, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.N0);
            this.O0 = textWidth;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    @Override // lka, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        long j;
        float f2;
        float f3;
        float i;
        float f4;
        if (this.N0 != null) {
            g95 g95Var = this.W0;
            qd2 qd2Var = g95Var.T2;
            if (qd2Var != null && qd2Var.k()) {
                long currentTimeMillis = (g95Var.T2.b.schedule_date * 1000) - ConnectionsManager.getInstance(g95Var.n1.a).getCurrentTimeMillis();
                if (currentTimeMillis < 0) {
                    f = 1.0f;
                } else if (currentTimeMillis < 5000) {
                    f = 1.0f - (currentTimeMillis / 5000.0f);
                }
                Matrix matrix = this.P0;
                matrix.reset();
                matrix.postTranslate((-this.O0) * 0.7f * f, 0.0f);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j = elapsedRealtime - this.V0;
                if (j > 20) {
                    j = 17;
                }
                this.V0 = elapsedRealtime;
                f2 = this.S0;
                if (f2 != 0.0f || this.T0 >= f2) {
                    SecureRandom secureRandom = Utilities.b;
                    this.S0 = secureRandom.nextInt(nm7.d3) + 1500;
                    this.T0 = 0.0f;
                    f3 = this.Q0;
                    if (f3 == -1.0f) {
                        f3 = ((secureRandom.nextInt(100) - 50) * 0.2f) / 50.0f;
                        this.Q0 = f3;
                    }
                    this.R0 = f3;
                    this.Q0 = ((secureRandom.nextInt(100) - 50) * 0.2f) / 50.0f;
                }
                float f5 = j;
                i = ts2.i(f5 * 0.02f, g95Var.I2, 1.0f * f5, this.T0);
                this.T0 = i;
                f4 = this.S0;
                if (i > f4) {
                    this.T0 = f4;
                    i = f4;
                }
                float interpolation = d53.g.getInterpolation(i / f4);
                float f6 = this.U0;
                float f7 = this.R0;
                matrix.postTranslate(((((this.Q0 - f7) * interpolation) + f7) * f6) - (f6 / 2.0f), 0.0f);
                this.N0.setLocalMatrix(matrix);
                invalidate();
            }
            f = 0.0f;
            Matrix matrix2 = this.P0;
            matrix2.reset();
            matrix2.postTranslate((-this.O0) * 0.7f * f, 0.0f);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            j = elapsedRealtime2 - this.V0;
            if (j > 20) {
            }
            this.V0 = elapsedRealtime2;
            f2 = this.S0;
            if (f2 != 0.0f) {
            }
            SecureRandom secureRandom2 = Utilities.b;
            this.S0 = secureRandom2.nextInt(nm7.d3) + 1500;
            this.T0 = 0.0f;
            f3 = this.Q0;
            if (f3 == -1.0f) {
            }
            this.R0 = f3;
            this.Q0 = ((secureRandom2.nextInt(100) - 50) * 0.2f) / 50.0f;
            float f52 = j;
            i = ts2.i(f52 * 0.02f, g95Var.I2, 1.0f * f52, this.T0);
            this.T0 = i;
            f4 = this.S0;
            if (i > f4) {
            }
            float interpolation2 = d53.g.getInterpolation(i / f4);
            float f62 = this.U0;
            float f72 = this.R0;
            matrix2.postTranslate(((((this.Q0 - f72) * interpolation2) + f72) * f62) - (f62 / 2.0f), 0.0f);
            this.N0.setLocalMatrix(matrix2);
            invalidate();
        }
        super.onDraw(canvas);
    }
}
