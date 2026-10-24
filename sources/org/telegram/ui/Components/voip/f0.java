package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yr;
import org.telegram.ui.k30;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class f0 extends View {
    public final /* synthetic */ org.telegram.ui.Cells.y a;
    public final /* synthetic */ k30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(k30 k30Var, Context context, org.telegram.ui.Cells.y yVar) {
        super(context);
        this.b = k30Var;
        this.a = yVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        k30 k30Var = this.b;
        float measuredWidth = k30Var.d0.getMeasuredWidth();
        yr yrVar = k30Var.c0;
        float measuredWidth2 = (k30Var.e0.getMeasuredWidth() * yrVar.g) + ((1.0f - yrVar.g) * measuredWidth);
        canvas.save();
        int dp = AndroidUtilities.dp(50.0f) + ((int) measuredWidth2);
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Cells.y yVar = this.a;
        yVar.setBounds(0, 0, dp, measuredHeight);
        yVar.draw(canvas);
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
