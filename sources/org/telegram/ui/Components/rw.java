package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class rw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ lz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(lz lzVar, Context context, boolean z10) {
        super(context);
        this.b = lzVar;
        this.a = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lz lzVar = this.b;
        xw xwVar = lzVar.B0;
        tw twVar = lzVar.D0;
        ww wwVar = lzVar.G0;
        if (this.a || !(view == twVar || view == wwVar)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = xwVar.getY() + xwVar.getMeasuredHeight() + 1.0f;
        if (view == twVar) {
            y3 = Math.max(y3, wwVar.getY() + wwVar.getMeasuredHeight() + 1.0f);
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
