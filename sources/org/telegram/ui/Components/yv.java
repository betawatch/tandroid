package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yv extends FrameLayout {
    public final /* synthetic */ wy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(wy wyVar, Context context) {
        super(context);
        this.a = wyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wy wyVar = this.a;
        cw cwVar = wyVar.k0;
        if (view != wyVar.d0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0.0f, cwVar.getY() + cwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
