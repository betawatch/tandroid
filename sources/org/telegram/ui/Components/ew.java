package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ew extends FrameLayout {
    public final /* synthetic */ ey a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(ey eyVar, Context context) {
        super(context);
        this.a = eyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ey eyVar = this.a;
        jw jwVar = eyVar.J;
        gv gvVar = eyVar.W;
        rw rwVar = eyVar.Q;
        if (view != rwVar && view != gvVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y9 = jwVar.getY() + jwVar.getMeasuredHeight() + 1.0f;
        if (view == rwVar && gvVar != null) {
            y9 = Math.max(y9, gvVar.getY() + gvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y9 - (org.telegram.messenger.g0.L(16.0f) * eyVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
