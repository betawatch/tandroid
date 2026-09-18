package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g0 extends View {
    public final /* synthetic */ org.telegram.ui.Cells.z a;
    public final /* synthetic */ c40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(c40 c40Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.b = c40Var;
        this.a = zVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c40 c40Var = this.b;
        float measuredWidth = c40Var.d0.getMeasuredWidth();
        nr nrVar = c40Var.c0;
        float measuredWidth2 = (c40Var.e0.getMeasuredWidth() * nrVar.g) + ((1.0f - nrVar.g) * measuredWidth);
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) measuredWidth2);
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.z zVar = this.a;
        zVar.setBounds(0, 0, dp, measuredHeight);
        zVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.setState(getDrawableState());
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.jumpToCurrentState();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
    }
}
