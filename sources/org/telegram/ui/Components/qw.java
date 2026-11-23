package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class qw extends FrameLayout {
    public final /* synthetic */ qy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(qy qyVar, Context context) {
        super(context);
        this.a = qyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        qy qyVar = this.a;
        vw vwVar = qyVar.J;
        sv svVar = qyVar.W;
        dx dxVar = qyVar.Q;
        if (view != dxVar && view != svVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y10 = vwVar.getY() + vwVar.getMeasuredHeight() + 1.0f;
        if (view == dxVar && svVar != null) {
            y10 = Math.max(y10, svVar.getY() + svVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (org.telegram.messenger.g0.L(16.0f) * qyVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
