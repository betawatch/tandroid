package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class va extends fd0 {
    public final /* synthetic */ boolean r0;
    public final /* synthetic */ boolean s0;
    public final /* synthetic */ bb t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(bb bbVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.t0 = bbVar;
        this.r0 = z10;
        this.s0 = z11;
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        bb bbVar = this.t0;
        bbVar.I(canvas, this);
        super.dispatchDraw(canvas);
        bbVar.H(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            bb bbVar = this.t0;
            drawable = ((org.telegram.ui.ActionBar.k3) bbVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                bbVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.s0) {
            this.t0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.fd0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        bb bbVar = this.t0;
        bbVar.h = size;
        bbVar.D(i10, i11);
        if (this.r0) {
            i11 = View.MeasureSpec.makeMeasureSpec(bbVar.h, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
