package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o2 extends TextView {
    public final RectF a;
    public final /* synthetic */ r1 b;
    public final /* synthetic */ q2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(q2 q2Var, Activity activity, r1 r1Var) {
        super(activity);
        this.c = q2Var;
        this.b = r1Var;
        this.a = new RectF();
        r1Var.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, width, height);
        float x9 = ((View) getParent()).getX() + getX();
        q2 q2Var = this.c;
        float x10 = ((View) q2Var.getParent()).getX() + q2Var.getX() + x9;
        float y3 = ((View) q2Var.getParent()).getY() + q2Var.getY() + ((View) getParent()).getY() + getY();
        r1 r1Var = this.b;
        r1Var.d(x10, y3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), r1Var.b());
        super.onDraw(canvas);
    }
}
