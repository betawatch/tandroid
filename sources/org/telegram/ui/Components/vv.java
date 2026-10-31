package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vv extends FrameLayout {
    public final /* synthetic */ vy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(vy vyVar, Context context) {
        super(context);
        this.a = vyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        vy vyVar = this.a;
        yv yvVar = vyVar.o0;
        if (view != vyVar.h0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, yvVar.getY() + yvVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
