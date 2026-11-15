package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class pv extends FrameLayout {
    public final /* synthetic */ ly a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(ly lyVar, Context context) {
        super(context);
        this.a = lyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ly lyVar = this.a;
        sv svVar = lyVar.p0;
        if (view != lyVar.i0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, svVar.getY() + svVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
