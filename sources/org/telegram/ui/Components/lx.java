package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class lx extends FrameLayout {
    public final /* synthetic */ mz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(mz mzVar, Context context) {
        super(context);
        this.a = mzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        mz mzVar = this.a;
        qx qxVar = mzVar.I;
        mw mwVar = mzVar.V;
        yx yxVar = mzVar.P;
        if (view != yxVar && view != mwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = qxVar.getY() + qxVar.getMeasuredHeight() + 1.0f;
        if (view == yxVar && mwVar != null) {
            y3 = Math.max(y3, mwVar.getY() + mwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * mzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
