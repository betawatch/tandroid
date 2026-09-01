package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pw extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ mz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(mz mzVar, Context context, boolean z4) {
        super(context);
        this.b = mzVar;
        this.a = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        mz mzVar = this.b;
        vw vwVar = mzVar.y0;
        rw rwVar = mzVar.A0;
        uw uwVar = mzVar.D0;
        if (this.a || !(view == rwVar || view == uwVar)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = vwVar.getY() + vwVar.getMeasuredHeight() + 1.0f;
        if (view == rwVar) {
            y10 = Math.max(y10, uwVar.getY() + uwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * mzVar.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mz mzVar = this.b;
        mzVar.H0 = true;
        mzVar.a0();
        bx bxVar = mzVar.Q0;
        if (bxVar != null) {
            bxVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mz mzVar = this.b;
        mzVar.H0 = false;
        mzVar.a0();
        bx bxVar = mzVar.Q0;
        if (bxVar != null) {
            bxVar.a();
        }
    }
}
