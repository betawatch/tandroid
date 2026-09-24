package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class sw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ lz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(lz lzVar, Context context, boolean z10) {
        super(context);
        this.b = lzVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lz lzVar = this.b;
        yw ywVar = lzVar.B0;
        uw uwVar = lzVar.D0;
        xw xwVar = lzVar.G0;
        if (this.a || !(view == uwVar || view == xwVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = ywVar.getY() + ywVar.getMeasuredHeight() + 1.0f;
        if (view == uwVar) {
            y3 = Math.max(y3, xwVar.getY() + xwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * lzVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lz lzVar = this.b;
        lzVar.K0 = true;
        lzVar.Y();
        gg.g1 g1Var = lzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lz lzVar = this.b;
        lzVar.K0 = false;
        lzVar.Y();
        gg.g1 g1Var = lzVar.T0;
        if (g1Var != null) {
            g1Var.a();
        }
    }
}
