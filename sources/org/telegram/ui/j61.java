package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j61 extends View {
    public final Paint a;
    public final LinearGradient b;

    public j61(l61 l61Var, Context context) {
        super(context);
        this.a = new Paint(1);
        float dp = AndroidUtilities.dp(68.0f);
        int i9 = org.telegram.ui.ActionBar.f6.h5;
        this.b = new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{org.telegram.ui.ActionBar.f6.l1(0.0f, l61Var.getThemedColor(i9)), l61Var.getThemedColor(i9)}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        LinearGradient linearGradient = this.b;
        Paint paint = this.a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
