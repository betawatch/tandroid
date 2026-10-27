package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.as;
import org.telegram.ui.o30;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f0 extends View {
    public final /* synthetic */ org.telegram.ui.Cells.y a;
    public final /* synthetic */ o30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(o30 o30Var, Context context, org.telegram.ui.Cells.y yVar) {
        super(context);
        this.b = o30Var;
        this.a = yVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o30 o30Var = this.b;
        float measuredWidth = o30Var.d0.getMeasuredWidth();
        as asVar = o30Var.c0;
        float measuredWidth2 = (o30Var.e0.getMeasuredWidth() * asVar.g) + ((1.0f - asVar.g) * measuredWidth);
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
