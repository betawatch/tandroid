package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ga extends ua0 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ boolean n0;
    public final /* synthetic */ ma o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(ma maVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.o0 = maVar;
        this.m0 = z10;
        this.n0 = z11;
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ma maVar = this.o0;
        maVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        maVar.V0(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y9 = motionEvent.getY();
            ma maVar = this.o0;
            if (y9 < maVar.s0.getBounds().top) {
                maVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.n0) {
            this.o0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.ua0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        ma maVar = this.o0;
        maVar.o1 = size;
        maVar.S0(i3, i10);
        if (this.m0) {
            i10 = View.MeasureSpec.makeMeasureSpec(maVar.o1, TLObject.FLAG_30);
        }
        super.onMeasure(i3, i10);
    }
}
