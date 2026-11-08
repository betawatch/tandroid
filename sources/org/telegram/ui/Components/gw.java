package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class gw extends FrameLayout {
    public final /* synthetic */ hy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(hy hyVar, Context context) {
        super(context);
        this.a = hyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        hy hyVar = this.a;
        lw lwVar = hyVar.I;
        iv ivVar = hyVar.V;
        tw twVar = hyVar.P;
        if (view != twVar && view != ivVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = lwVar.getY() + lwVar.getMeasuredHeight() + 1.0f;
        if (view == twVar && ivVar != null) {
            y10 = Math.max(y10, ivVar.getY() + ivVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * hyVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
