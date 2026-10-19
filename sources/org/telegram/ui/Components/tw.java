package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class tw extends FrameLayout {
    public final /* synthetic */ tz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(tz tzVar, Context context) {
        super(context);
        this.a = tzVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        tz tzVar = this.a;
        xw xwVar = tzVar.o0;
        if (view != tzVar.h0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, xwVar.getY() + xwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
