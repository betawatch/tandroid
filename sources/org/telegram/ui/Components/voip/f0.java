package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yr;
import org.telegram.ui.j30;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class f0 extends View {
    public final /* synthetic */ org.telegram.ui.Cells.z a;
    public final /* synthetic */ j30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(j30 j30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.b = j30Var;
        this.a = zVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j30 j30Var = this.b;
        float measuredWidth = j30Var.d0.getMeasuredWidth();
        yr yrVar = j30Var.c0;
        float measuredWidth2 = (j30Var.e0.getMeasuredWidth() * yrVar.g) + ((1.0f - yrVar.g) * measuredWidth);
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
