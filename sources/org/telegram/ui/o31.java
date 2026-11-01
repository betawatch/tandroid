package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o31 extends View {
    public final Paint a;
    public int b;
    public LinearGradient c;
    public final /* synthetic */ q31 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(q31 q31Var, Context context) {
        super(context);
        this.d = q31Var;
        this.a = new Paint(1);
        this.b = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, q31Var.I0);
        this.c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(68.0f), new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, this.b), this.b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.d.I0);
        if (w02 != this.b) {
            this.b = w02;
            this.c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(68.0f), new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, w02), w02}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.c;
        Paint paint = this.a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
