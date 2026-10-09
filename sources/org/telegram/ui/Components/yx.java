package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yx extends FrameLayout {
    public final /* synthetic */ a00 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(a00 a00Var, Context context) {
        super(context);
        this.a = a00Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        a00 a00Var = this.a;
        ey eyVar = a00Var.I;
        zw zwVar = a00Var.V;
        my myVar = a00Var.P;
        if (view != myVar && view != zwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = eyVar.getY() + eyVar.getMeasuredHeight() + 1.0f;
        if (view == myVar && zwVar != null) {
            y3 = Math.max(y3, zwVar.getY() + zwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * a00Var.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
