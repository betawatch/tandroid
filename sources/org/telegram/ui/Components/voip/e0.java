package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e0 extends View {
    public final /* synthetic */ org.telegram.ui.Cells.z a;
    public final /* synthetic */ x30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(x30 x30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.b = x30Var;
        this.a = zVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x30 x30Var = this.b;
        float measuredWidth = x30Var.a0.getMeasuredWidth();
        jr jrVar = x30Var.W;
        float measuredWidth2 = (x30Var.b0.getMeasuredWidth() * jrVar.g) + ((1.0f - jrVar.g) * measuredWidth);
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
