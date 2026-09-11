package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class o50 extends org.telegram.ui.ActionBar.j5 {
    public LinearGradient M0;
    public int N0;
    public final Matrix O0;
    public float P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public long U0;
    public final /* synthetic */ j60 V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o50(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V0 = j60Var;
        this.O0 = new Matrix();
        this.P0 = -1.0f;
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final void d(int i10) {
        super.d(i10);
        int textWidth = getTextWidth();
        if (textWidth != this.N0) {
            float f7 = textWidth;
            this.T0 = 1.3f * f7;
            float textHeight = getTextHeight();
            float f10 = f7 * 2.0f;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ih, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kh, false);
            int i11 = org.telegram.ui.ActionBar.j6.jh;
            this.M0 = new LinearGradient(0.0f, textHeight, f10, 0.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.j6.w0(null, i11, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.M0);
            this.N0 = textWidth;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    @Override // org.telegram.ui.ActionBar.j5, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f7;
        long j3;
        float f10;
        float a2;
        float f11;
        if (this.M0 != null) {
            j60 j60Var = this.V0;
            ChatObject.Call call = j60Var.a1;
            if (call != null && call.isScheduled()) {
                long currentTimeMillis = (j60Var.a1.call.schedule_date * 1000) - j60Var.d.getConnectionsManager().getCurrentTimeMillis();
                if (currentTimeMillis < 0) {
                    f7 = 1.0f;
                } else if (currentTimeMillis < 5000) {
                    f7 = 1.0f - (currentTimeMillis / 5000.0f);
                }
                Matrix matrix = this.O0;
                matrix.reset();
                matrix.postTranslate((-this.N0) * 0.7f * f7, 0.0f);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j3 = elapsedRealtime - this.U0;
                if (j3 > 20) {
                    j3 = 17;
                }
                this.U0 = elapsedRealtime;
                f10 = this.R0;
                if (f10 != 0.0f || this.S0 >= f10) {
                    this.R0 = Utilities.random.nextInt(200) + 1500;
                    this.S0 = 0.0f;
                    if (this.P0 == -1.0f) {
                        this.P0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                    }
                    this.Q0 = this.P0;
                    this.P0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                }
                float f12 = j3;
                a2 = org.telegram.ui.Cells.p6.a(f12 * 0.02f, j60Var.O0, 1.0f * f12, this.S0);
                this.S0 = a2;
                f11 = this.R0;
                if (a2 > f11) {
                    this.S0 = f11;
                }
                float interpolation = org.telegram.ui.Components.pr.g.getInterpolation(this.S0 / f11);
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
            j3 = elapsedRealtime2 - this.U0;
            if (j3 > 20) {
            }
            this.U0 = elapsedRealtime2;
            f10 = this.R0;
            if (f10 != 0.0f) {
            }
            this.R0 = Utilities.random.nextInt(200) + 1500;
            this.S0 = 0.0f;
            if (this.P0 == -1.0f) {
            }
            this.Q0 = this.P0;
            this.P0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
            float f122 = j3;
            a2 = org.telegram.ui.Cells.p6.a(f122 * 0.02f, j60Var.O0, 1.0f * f122, this.S0);
            this.S0 = a2;
            f11 = this.R0;
            if (a2 > f11) {
            }
            float interpolation2 = org.telegram.ui.Components.pr.g.getInterpolation(this.S0 / f11);
            float f132 = this.T0;
            float f142 = this.Q0;
            matrix2.postTranslate(((((this.P0 - f142) * interpolation2) + f142) * f132) - (f132 / 2.0f), 0.0f);
            this.M0.setLocalMatrix(matrix2);
            invalidate();
        }
        super.onDraw(canvas);
    }
}
