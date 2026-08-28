package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a30 extends TextView {
    public final RectF a;
    public final /* synthetic */ o50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(o50 o50Var, Context context) {
        super(context);
        this.b = o50Var;
        this.a = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.b.c1);
        super.onDraw(canvas);
    }
}
