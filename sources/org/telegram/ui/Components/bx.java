package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class bx extends FrameLayout {
    public final /* synthetic */ a00 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(a00 a00Var, Context context) {
        super(context);
        this.a = a00Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        a00 a00Var = this.a;
        fx fxVar = a00Var.o0;
        if (view != a00Var.h0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, fxVar.getY() + fxVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
