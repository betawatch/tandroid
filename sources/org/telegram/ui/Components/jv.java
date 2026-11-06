package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class jv extends FrameLayout {
    public final /* synthetic */ gy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(gy gyVar, Context context) {
        super(context);
        this.a = gyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        gy gyVar = this.a;
        mv mvVar = gyVar.o0;
        if (view != gyVar.h0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, mvVar.getY() + mvVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
