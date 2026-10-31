package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uw extends FrameLayout {
    public final /* synthetic */ vy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(vy vyVar, Context context) {
        super(context);
        this.a = vyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        vy vyVar = this.a;
        zw zwVar = vyVar.I;
        tv tvVar = vyVar.V;
        hx hxVar = vyVar.P;
        if (view != hxVar && view != tvVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y3 = zwVar.getY() + zwVar.getMeasuredHeight() + 1.0f;
        if (view == hxVar && tvVar != null) {
            y3 = Math.max(y3, tvVar.getY() + tvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (org.telegram.messenger.i0.L(16.0f) * vyVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
