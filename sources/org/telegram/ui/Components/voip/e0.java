package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dr;
import org.telegram.ui.g30;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e0 extends View {
    public final /* synthetic */ org.telegram.ui.Cells.z a;
    public final /* synthetic */ g30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g30 g30Var, Context context, org.telegram.ui.Cells.z zVar) {
        super(context);
        this.b = g30Var;
        this.a = zVar;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g30 g30Var = this.b;
        float measuredWidth = g30Var.W.getMeasuredWidth();
        dr drVar = g30Var.V;
        float measuredWidth2 = (g30Var.a0.getMeasuredWidth() * drVar.g) + ((1.0f - drVar.g) * measuredWidth);
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
