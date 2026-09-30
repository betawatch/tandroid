package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class p30 extends TextView {
    public final RectF a;
    public final /* synthetic */ d60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(d60 d60Var, Context context) {
        super(context);
        this.b = d60Var;
        this.a = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.b.g1);
        super.onDraw(canvas);
    }
}
