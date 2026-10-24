package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class j61 extends View {
    public final Paint a;
    public int b;
    public LinearGradient c;
    public final /* synthetic */ l61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j61(l61 l61Var, Context context) {
        super(context);
        this.d = l61Var;
        this.a = new Paint(1);
        this.b = l61Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5);
        this.c = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(68.0f), new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, this.b), this.b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.k6.h5);
        if (themedColor != this.b) {
            this.b = themedColor;
            this.c = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(68.0f), new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.c;
        Paint paint = this.a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
