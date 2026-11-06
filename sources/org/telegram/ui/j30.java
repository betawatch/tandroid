package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class j30 extends org.telegram.ui.ActionBar.k5 {
    public LinearGradient M0;
    public int N0;
    public final Matrix O0;
    public float P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public long U0;
    public final /* synthetic */ c40 V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V0 = c40Var;
        this.O0 = new Matrix();
        this.P0 = -1.0f;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void d(int i7) {
        super.d(i7);
        int textWidth = getTextWidth();
        if (textWidth != this.N0) {
            float f10 = textWidth;
            this.T0 = 1.3f * f10;
            float textHeight = getTextHeight();
            float f11 = f10 * 2.0f;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wh, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false);
            int i10 = org.telegram.ui.ActionBar.k6.Xh;
            this.M0 = new LinearGradient(0.0f, textHeight, f11, 0.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.M0);
            this.N0 = textWidth;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    @Override // org.telegram.ui.ActionBar.k5, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        long j3;
        float f11;
        float d;
        float f12;
        if (this.M0 != null) {
            c40 c40Var = this.V0;
            org.telegram.messenger.r3 r3Var = c40Var.R2;
            if (r3Var != null && r3Var.j()) {
                long currentTimeMillis = (c40Var.R2.b.schedule_date * 1000) - ConnectionsManager.getInstance(c40Var.k1.a).getCurrentTimeMillis();
                if (currentTimeMillis < 0) {
                    f10 = 1.0f;
                } else if (currentTimeMillis < 5000) {
                    f10 = 1.0f - (currentTimeMillis / 5000.0f);
                }
                Matrix matrix = this.O0;
                matrix.reset();
                matrix.postTranslate((-this.N0) * 0.7f * f10, 0.0f);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j3 = elapsedRealtime - this.U0;
                if (j3 > 20) {
                    j3 = 17;
                }
                this.U0 = elapsedRealtime;
                f11 = this.R0;
                if (f11 != 0.0f || this.S0 >= f11) {
                    SecureRandom secureRandom = Utilities.b;
                    this.R0 = secureRandom.nextInt(org.telegram.messenger.qs.e3) + 1500;
                    this.S0 = 0.0f;
                    if (this.P0 == -1.0f) {
                        this.P0 = ((secureRandom.nextInt(100) - 50) * 0.2f) / 50.0f;
                    }
                    this.Q0 = this.P0;
                    this.P0 = ((secureRandom.nextInt(100) - 50) * 0.2f) / 50.0f;
                }
                float f13 = j3;
                d = rf.b.d(f13 * 0.02f, c40Var.F2, 1.0f * f13, this.S0);
                this.S0 = d;
                f12 = this.R0;
                if (d > f12) {
                    this.S0 = f12;
                }
                float interpolation = org.telegram.ui.Components.xq.g.getInterpolation(this.S0 / f12);
                float f14 = this.T0;
                float f15 = this.Q0;
                matrix.postTranslate(((((this.P0 - f15) * interpolation) + f15) * f14) - (f14 / 2.0f), 0.0f);
                this.M0.setLocalMatrix(matrix);
                invalidate();
            }
            f10 = 0.0f;
            Matrix matrix2 = this.O0;
            matrix2.reset();
            matrix2.postTranslate((-this.N0) * 0.7f * f10, 0.0f);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            j3 = elapsedRealtime2 - this.U0;
            if (j3 > 20) {
            }
            this.U0 = elapsedRealtime2;
            f11 = this.R0;
            if (f11 != 0.0f) {
            }
            SecureRandom secureRandom2 = Utilities.b;
            this.R0 = secureRandom2.nextInt(org.telegram.messenger.qs.e3) + 1500;
            this.S0 = 0.0f;
            if (this.P0 == -1.0f) {
            }
            this.Q0 = this.P0;
            this.P0 = ((secureRandom2.nextInt(100) - 50) * 0.2f) / 50.0f;
            float f132 = j3;
            d = rf.b.d(f132 * 0.02f, c40Var.F2, 1.0f * f132, this.S0);
            this.S0 = d;
            f12 = this.R0;
            if (d > f12) {
            }
            float interpolation2 = org.telegram.ui.Components.xq.g.getInterpolation(this.S0 / f12);
            float f142 = this.T0;
            float f152 = this.Q0;
            matrix2.postTranslate(((((this.P0 - f152) * interpolation2) + f152) * f142) - (f142 / 2.0f), 0.0f);
            this.M0.setLocalMatrix(matrix2);
            invalidate();
        }
        super.onDraw(canvas);
    }
}
