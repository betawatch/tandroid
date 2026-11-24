// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i0a extends View {
    public final Paint a;
    public int b;
    public LinearGradient c;
    public final /* synthetic */ k0a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0a(k0a k0aVar, Context context) {
        super(context);
        this.d = k0aVar;
        this.a = new Paint(1);
        this.b = cmb.v0(cmb.g5, k0aVar.J0);
        this.c = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(68.0f), new int[]{cmb.p1(0.0f, this.b), this.b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int v0 = cmb.v0(cmb.g5, this.d.J0);
        if (v0 != this.b) {
            this.b = v0;
            this.c = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(68.0f), new int[]{cmb.p1(0.0f, v0), v0}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.c;
        Paint paint = this.a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
