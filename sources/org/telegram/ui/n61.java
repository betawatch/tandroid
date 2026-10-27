package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n61 extends View {
    public final Paint a;
    public int b;
    public LinearGradient c;
    public final /* synthetic */ p61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(p61 p61Var, Context context) {
        super(context);
        this.d = p61Var;
        this.a = new Paint(1);
        this.b = p61Var.getThemedColor(org.telegram.ui.ActionBar.y6.h5);
        this.c = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(68.0f), new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, this.b), this.b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.h5);
        if (themedColor != this.b) {
            this.b = themedColor;
            this.c = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(68.0f), new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.c;
        Paint paint = this.a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
