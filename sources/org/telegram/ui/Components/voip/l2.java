package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class l2 extends TextView {
    public final RectF a;
    public final /* synthetic */ o1 b;
    public final /* synthetic */ n2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(n2 n2Var, Activity activity, o1 o1Var) {
        super(activity);
        this.c = n2Var;
        this.b = o1Var;
        this.a = new RectF();
        o1Var.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, width, height);
        float x10 = ((View) getParent()).getX() + getX();
        n2 n2Var = this.c;
        float x11 = ((View) n2Var.getParent()).getX() + n2Var.getX() + x10;
        float y3 = ((View) n2Var.getParent()).getY() + n2Var.getY() + ((View) getParent()).getY() + getY();
        o1 o1Var = this.b;
        o1Var.d(x11, y3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), o1Var.b());
        super.onDraw(canvas);
    }
}
