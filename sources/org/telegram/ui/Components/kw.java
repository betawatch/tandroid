package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kw extends FrameLayout {
    public final /* synthetic */ mz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(mz mzVar, Context context) {
        super(context);
        this.a = mzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        mz mzVar = this.a;
        ow owVar = mzVar.l0;
        if (view != mzVar.e0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, owVar.getY() + owVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
