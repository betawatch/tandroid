package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class fw extends FrameLayout {
    public final /* synthetic */ gy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(gy gyVar, Context context) {
        super(context);
        this.a = gyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        gy gyVar = this.a;
        kw kwVar = gyVar.I;
        hv hvVar = gyVar.V;
        sw swVar = gyVar.P;
        if (view != swVar && view != hvVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = kwVar.getY() + kwVar.getMeasuredHeight() + 1.0f;
        if (view == swVar && hvVar != null) {
            y10 = Math.max(y10, hvVar.getY() + hvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * gyVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
