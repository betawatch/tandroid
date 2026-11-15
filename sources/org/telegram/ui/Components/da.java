package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class da extends ab0 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ boolean n0;
    public final /* synthetic */ ja o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(ja jaVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.o0 = jaVar;
        this.m0 = z10;
        this.n0 = z11;
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ja jaVar = this.o0;
        jaVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        jaVar.V0(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            ja jaVar = this.o0;
            if (y10 < jaVar.s0.getBounds().top) {
                jaVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.n0) {
            this.o0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.ab0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        ja jaVar = this.o0;
        jaVar.r1 = size;
        jaVar.S0(i7, i10);
        if (this.m0) {
            i10 = View.MeasureSpec.makeMeasureSpec(jaVar.r1, TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }
}
