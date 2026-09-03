package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jx extends FrameLayout {
    public final /* synthetic */ mz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(mz mzVar, Context context) {
        super(context);
        this.a = mzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        mz mzVar = this.a;
        hw hwVar = mzVar.F;
        iw iwVar = mzVar.S;
        kx kxVar = mzVar.M;
        if (view != kxVar && view != iwVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = hwVar.getY() + hwVar.getMeasuredHeight() + 1.0f;
        if (view == kxVar && iwVar != null) {
            y10 = Math.max(y10, iwVar.getY() + iwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * mzVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
