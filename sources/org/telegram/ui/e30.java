package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e30 extends org.telegram.ui.ActionBar.k5 {
    public LinearGradient N0;
    public int O0;
    public final Matrix P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public float U0;
    public long V0;
    public final /* synthetic */ x30 W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e30(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.W0 = x30Var;
        this.P0 = new Matrix();
        this.Q0 = -1.0f;
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void d(int i3) {
        super.d(i3);
        int textWidth = getTextWidth();
        if (textWidth != this.O0) {
            float f10 = textWidth;
            this.U0 = 1.3f * f10;
            float textHeight = getTextHeight();
            float f11 = f10 * 2.0f;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wh, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false);
            int i10 = org.telegram.ui.ActionBar.k6.Xh;
            this.N0 = new LinearGradient(0.0f, textHeight, f11, 0.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.N0);
            this.O0 = textWidth;
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
        long j10;
        float f11;
        float c2;
        float f12;
        if (this.N0 != null) {
            x30 x30Var = this.W0;
            org.telegram.messenger.r3 r3Var = x30Var.S2;
            if (r3Var != null && r3Var.j()) {
                long currentTimeMillis = (x30Var.S2.b.schedule_date * 1000) - ConnectionsManager.getInstance(x30Var.l1.a).getCurrentTimeMillis();
                if (currentTimeMillis < 0) {
                    f10 = 1.0f;
                } else if (currentTimeMillis < 5000) {
                    f10 = 1.0f - (currentTimeMillis / 5000.0f);
                }
                Matrix matrix = this.P0;
                matrix.reset();
                matrix.postTranslate((-this.O0) * 0.7f * f10, 0.0f);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j10 = elapsedRealtime - this.V0;
                if (j10 > 20) {
                    j10 = 17;
                }
                this.V0 = elapsedRealtime;
                f11 = this.S0;
                if (f11 != 0.0f || this.T0 >= f11) {
                    SecureRandom secureRandom = Utilities.b;
                    this.S0 = secureRandom.nextInt(org.telegram.messenger.hs.e3) + 1500;
                    this.T0 = 0.0f;
                    if (this.Q0 == -1.0f) {
                        this.Q0 = ((secureRandom.nextInt(100) - 50) * 0.2f) / 50.0f;
                    }
                    this.R0 = this.Q0;
                    this.Q0 = ((secureRandom.nextInt(100) - 50) * 0.2f) / 50.0f;
                }
                float f13 = j10;
                c2 = t4.c.c(f13 * 0.02f, x30Var.G2, 1.0f * f13, this.T0);
                this.T0 = c2;
                f12 = this.S0;
                if (c2 > f12) {
                    this.T0 = f12;
                }
                float interpolation = org.telegram.ui.Components.xq.g.getInterpolation(this.T0 / f12);
                float f14 = this.U0;
                float f15 = this.R0;
                matrix.postTranslate(((((this.Q0 - f15) * interpolation) + f15) * f14) - (f14 / 2.0f), 0.0f);
                this.N0.setLocalMatrix(matrix);
                invalidate();
            }
            f10 = 0.0f;
            Matrix matrix2 = this.P0;
            matrix2.reset();
            matrix2.postTranslate((-this.O0) * 0.7f * f10, 0.0f);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            j10 = elapsedRealtime2 - this.V0;
            if (j10 > 20) {
            }
            this.V0 = elapsedRealtime2;
            f11 = this.S0;
            if (f11 != 0.0f) {
            }
            SecureRandom secureRandom2 = Utilities.b;
            this.S0 = secureRandom2.nextInt(org.telegram.messenger.hs.e3) + 1500;
            this.T0 = 0.0f;
            if (this.Q0 == -1.0f) {
            }
            this.R0 = this.Q0;
            this.Q0 = ((secureRandom2.nextInt(100) - 50) * 0.2f) / 50.0f;
            float f132 = j10;
            c2 = t4.c.c(f132 * 0.02f, x30Var.G2, 1.0f * f132, this.T0);
            this.T0 = c2;
            f12 = this.S0;
            if (c2 > f12) {
            }
            float interpolation2 = org.telegram.ui.Components.xq.g.getInterpolation(this.T0 / f12);
            float f142 = this.U0;
            float f152 = this.R0;
            matrix2.postTranslate(((((this.Q0 - f152) * interpolation2) + f152) * f142) - (f142 / 2.0f), 0.0f);
            this.N0.setLocalMatrix(matrix2);
            invalidate();
        }
        super.onDraw(canvas);
    }
}
