package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
import org.telegram.ui.w30;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f0 extends View {
    public final /* synthetic */ org.telegram.ui.Cells.z a;
    public final /* synthetic */ w30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(w30 w30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.b = w30Var;
        this.a = zVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        w30 w30Var = this.b;
        float measuredWidth = w30Var.a0.getMeasuredWidth();
        mr mrVar = w30Var.W;
        float measuredWidth2 = (w30Var.b0.getMeasuredWidth() * mrVar.g) + ((1.0f - mrVar.g) * measuredWidth);
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
