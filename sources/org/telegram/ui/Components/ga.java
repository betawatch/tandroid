package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ga extends za0 {
    public final /* synthetic */ boolean l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ ma n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(ma maVar, Context context, boolean z9, boolean z10) {
        super(context);
        this.n0 = maVar;
        this.l0 = z9;
        this.m0 = z10;
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ma maVar = this.n0;
        maVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        maVar.V0(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            ma maVar = this.n0;
            if (y10 < maVar.r0.getBounds().top) {
                maVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.m0) {
            this.n0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.za0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        ma maVar = this.n0;
        maVar.q1 = size;
        maVar.S0(i7, i10);
        if (this.l0) {
            i10 = View.MeasureSpec.makeMeasureSpec(maVar.q1, TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }
}
