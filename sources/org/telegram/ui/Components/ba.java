package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ba extends sb0 {
    public final /* synthetic */ boolean l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ ha n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(ha haVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.n0 = haVar;
        this.l0 = z10;
        this.m0 = z11;
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ha haVar = this.n0;
        haVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        haVar.V0(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            ha haVar = this.n0;
            if (y3 < haVar.r0.getBounds().top) {
                haVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.m0) {
            this.n0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.sb0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        ha haVar = this.n0;
        haVar.n1 = size;
        haVar.S0(i10, i11);
        if (this.l0) {
            i11 = View.MeasureSpec.makeMeasureSpec(haVar.n1, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
