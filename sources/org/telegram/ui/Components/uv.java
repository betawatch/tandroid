package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class uv extends FrameLayout {
    public final /* synthetic */ ry a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(ry ryVar, Context context) {
        super(context);
        this.a = ryVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ry ryVar = this.a;
        xv xvVar = ryVar.p0;
        if (view != ryVar.i0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, xvVar.getY() + xvVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
