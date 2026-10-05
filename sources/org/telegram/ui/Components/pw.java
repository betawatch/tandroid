package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class pw extends FrameLayout {
    public final /* synthetic */ nz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(nz nzVar, Context context) {
        super(context);
        this.a = nzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        nz nzVar = this.a;
        sw swVar = nzVar.o0;
        if (view != nzVar.h0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, swVar.getY() + swVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
