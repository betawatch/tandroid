package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.as;
import org.telegram.ui.m30;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class f0 extends View {
    public final /* synthetic */ org.telegram.ui.Cells.y a;
    public final /* synthetic */ m30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(m30 m30Var, Context context, org.telegram.ui.Cells.y yVar) {
        super(context);
        this.b = m30Var;
        this.a = yVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        m30 m30Var = this.b;
        float measuredWidth = m30Var.d0.getMeasuredWidth();
        as asVar = m30Var.c0;
        float measuredWidth2 = (m30Var.e0.getMeasuredWidth() * asVar.g) + ((1.0f - asVar.g) * measuredWidth);
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
