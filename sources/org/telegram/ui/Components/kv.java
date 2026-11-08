package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class kv extends FrameLayout {
    public final /* synthetic */ hy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(hy hyVar, Context context) {
        super(context);
        this.a = hyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        hy hyVar = this.a;
        nv nvVar = hyVar.o0;
        if (view != hyVar.h0) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0.0f, nvVar.getY() + nvVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
