package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h40 extends org.telegram.ui.ActionBar.u5 {
    public LinearGradient M0;
    public int N0;
    public final Matrix O0;
    public float P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public long U0;
    public final /* synthetic */ b50 V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h40(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V0 = b50Var;
        this.O0 = new Matrix();
        this.P0 = -1.0f;
    }

    @Override // org.telegram.ui.ActionBar.u5
    public final void d(int i10) {
        super.d(i10);
        int textWidth = getTextWidth();
        if (textWidth != this.N0) {
            float f7 = textWidth;
            this.T0 = 1.3f * f7;
            float textHeight = getTextHeight();
            float f10 = f7 * 2.0f;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wh, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yh, false);
            int i11 = org.telegram.ui.ActionBar.t6.Xh;
            this.M0 = new LinearGradient(0.0f, textHeight, f10, 0.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.M0);
            this.N0 = textWidth;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    @Override // org.telegram.ui.ActionBar.u5, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f7;
        long j10;
        float f10;
        float d;
        float f11;
        if (this.M0 != null) {
            b50 b50Var = this.V0;
            org.telegram.messenger.u3 u3Var = b50Var.R2;
            if (u3Var != null && u3Var.j()) {
                long currentTimeMillis = (b50Var.R2.b.schedule_date * 1000) - ConnectionsManager.getInstance(b50Var.k1.a).getCurrentTimeMillis();
                if (currentTimeMillis < 0) {
                    f7 = 1.0f;
                } else if (currentTimeMillis < 5000) {
                    f7 = 1.0f - (currentTimeMillis / 5000.0f);
                }
                Matrix matrix = this.O0;
                matrix.reset();
                matrix.postTranslate((-this.N0) * 0.7f * f7, 0.0f);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j10 = elapsedRealtime - this.U0;
                if (j10 > 20) {
                    j10 = 17;
                }
                this.U0 = elapsedRealtime;
                f10 = this.R0;
                if (f10 != 0.0f || this.S0 >= f10) {
                    SecureRandom secureRandom = Utilities.b;
                    this.R0 = secureRandom.nextInt(org.telegram.messenger.zs.e3) + 1500;
                    this.S0 = 0.0f;
                    if (this.P0 == -1.0f) {
                        this.P0 = ((secureRandom.nextInt(100) - 50) * 0.2f) / 50.0f;
                    }
                    this.Q0 = this.P0;
                    this.P0 = ((secureRandom.nextInt(100) - 50) * 0.2f) / 50.0f;
                }
                float f12 = j10;
                d = sc.e.d(f12 * 0.02f, b50Var.F2, 1.0f * f12, this.S0);
                this.S0 = d;
                f11 = this.R0;
                if (d > f11) {
                    this.S0 = f11;
                }
                float interpolation = org.telegram.ui.Components.gr.g.getInterpolation(this.S0 / f11);
                float f13 = this.T0;
                float f14 = this.Q0;
                matrix.postTranslate(((((this.P0 - f14) * interpolation) + f14) * f13) - (f13 / 2.0f), 0.0f);
                this.M0.setLocalMatrix(matrix);
                invalidate();
            }
            f7 = 0.0f;
            Matrix matrix2 = this.O0;
            matrix2.reset();
            matrix2.postTranslate((-this.N0) * 0.7f * f7, 0.0f);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            j10 = elapsedRealtime2 - this.U0;
            if (j10 > 20) {
            }
            this.U0 = elapsedRealtime2;
            f10 = this.R0;
            if (f10 != 0.0f) {
            }
            SecureRandom secureRandom2 = Utilities.b;
            this.R0 = secureRandom2.nextInt(org.telegram.messenger.zs.e3) + 1500;
            this.S0 = 0.0f;
            if (this.P0 == -1.0f) {
            }
            this.Q0 = this.P0;
            this.P0 = ((secureRandom2.nextInt(100) - 50) * 0.2f) / 50.0f;
            float f122 = j10;
            d = sc.e.d(f122 * 0.02f, b50Var.F2, 1.0f * f122, this.S0);
            this.S0 = d;
            f11 = this.R0;
            if (d > f11) {
            }
            float interpolation2 = org.telegram.ui.Components.gr.g.getInterpolation(this.S0 / f11);
            float f132 = this.T0;
            float f142 = this.Q0;
            matrix2.postTranslate(((((this.P0 - f142) * interpolation2) + f142) * f132) - (f132 / 2.0f), 0.0f);
            this.M0.setLocalMatrix(matrix2);
            invalidate();
        }
        super.onDraw(canvas);
    }
}
