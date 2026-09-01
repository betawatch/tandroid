package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j50 extends org.telegram.ui.ActionBar.l5 {
    public LinearGradient J0;
    public int K0;
    public final Matrix L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    public long R0;
    public final /* synthetic */ d60 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.S0 = d60Var;
        this.L0 = new Matrix();
        this.M0 = -1.0f;
    }

    @Override // org.telegram.ui.ActionBar.l5
    public final void d(int i10) {
        super.d(i10);
        int textWidth = getTextWidth();
        if (textWidth != this.K0) {
            float f10 = textWidth;
            this.Q0 = 1.3f * f10;
            float textHeight = getTextHeight();
            float f11 = f10 * 2.0f;
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ih, false);
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.kh, false);
            int i11 = org.telegram.ui.ActionBar.k6.jh;
            this.J0 = new LinearGradient(0.0f, textHeight, f11, 0.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.k6.w0(null, i11, false), org.telegram.ui.ActionBar.k6.w0(null, i11, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.J0);
            this.K0 = textWidth;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    @Override // org.telegram.ui.ActionBar.l5, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        long j10;
        float f11;
        float A;
        float f12;
        if (this.J0 != null) {
            d60 d60Var = this.S0;
            ChatObject.Call call = d60Var.X0;
            if (call != null && call.isScheduled()) {
                long currentTimeMillis = (d60Var.X0.call.schedule_date * 1000) - d60Var.d.getConnectionsManager().getCurrentTimeMillis();
                if (currentTimeMillis < 0) {
                    f10 = 1.0f;
                } else if (currentTimeMillis < 5000) {
                    f10 = 1.0f - (currentTimeMillis / 5000.0f);
                }
                Matrix matrix = this.L0;
                matrix.reset();
                matrix.postTranslate((-this.K0) * 0.7f * f10, 0.0f);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j10 = elapsedRealtime - this.R0;
                if (j10 > 20) {
                    j10 = 17;
                }
                this.R0 = elapsedRealtime;
                f11 = this.O0;
                if (f11 != 0.0f || this.P0 >= f11) {
                    this.O0 = Utilities.random.nextInt(200) + 1500;
                    this.P0 = 0.0f;
                    if (this.M0 == -1.0f) {
                        this.M0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                    }
                    this.N0 = this.M0;
                    this.M0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                }
                float f13 = j10;
                A = e2.c.A(f13 * 0.02f, d60Var.L0, 1.0f * f13, this.P0);
                this.P0 = A;
                f12 = this.O0;
                if (A > f12) {
                    this.P0 = f12;
                }
                float interpolation = org.telegram.ui.Components.pr.g.getInterpolation(this.P0 / f12);
                float f14 = this.Q0;
                float f15 = this.N0;
                matrix.postTranslate(((((this.M0 - f15) * interpolation) + f15) * f14) - (f14 / 2.0f), 0.0f);
                this.J0.setLocalMatrix(matrix);
                invalidate();
            }
            f10 = 0.0f;
            Matrix matrix2 = this.L0;
            matrix2.reset();
            matrix2.postTranslate((-this.K0) * 0.7f * f10, 0.0f);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            j10 = elapsedRealtime2 - this.R0;
            if (j10 > 20) {
            }
            this.R0 = elapsedRealtime2;
            f11 = this.O0;
            if (f11 != 0.0f) {
            }
            this.O0 = Utilities.random.nextInt(200) + 1500;
            this.P0 = 0.0f;
            if (this.M0 == -1.0f) {
            }
            this.N0 = this.M0;
            this.M0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
            float f132 = j10;
            A = e2.c.A(f132 * 0.02f, d60Var.L0, 1.0f * f132, this.P0);
            this.P0 = A;
            f12 = this.O0;
            if (A > f12) {
            }
            float interpolation2 = org.telegram.ui.Components.pr.g.getInterpolation(this.P0 / f12);
            float f142 = this.Q0;
            float f152 = this.N0;
            matrix2.postTranslate(((((this.M0 - f152) * interpolation2) + f152) * f142) - (f142 / 2.0f), 0.0f);
            this.J0.setLocalMatrix(matrix2);
            invalidate();
        }
        super.onDraw(canvas);
    }
}
