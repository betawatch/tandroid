package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ka extends ib0 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ boolean n0;
    public final /* synthetic */ ra o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(ra raVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.o0 = raVar;
        this.m0 = z10;
        this.n0 = z11;
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ra raVar = this.o0;
        raVar.X0(canvas, this);
        super.dispatchDraw(canvas);
        raVar.W0(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            ra raVar = this.o0;
            if (y10 < raVar.s0.getBounds().top) {
                raVar.dismiss();
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

    @Override // org.telegram.ui.Components.ib0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        ra raVar = this.o0;
        raVar.r1 = size;
        raVar.T0(i7, i10);
        if (this.m0) {
            i10 = View.MeasureSpec.makeMeasureSpec(raVar.r1, TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }
}
