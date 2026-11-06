package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ha extends za0 {
    public final /* synthetic */ boolean l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ na n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(na naVar, Context context, boolean z9, boolean z10) {
        super(context);
        this.n0 = naVar;
        this.l0 = z9;
        this.m0 = z10;
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        na naVar = this.n0;
        naVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        naVar.V0(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            na naVar = this.n0;
            if (y10 < naVar.r0.getBounds().top) {
                naVar.dismiss();
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
        na naVar = this.n0;
        naVar.n1 = size;
        naVar.S0(i7, i10);
        if (this.l0) {
            i10 = View.MeasureSpec.makeMeasureSpec(naVar.n1, TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }
}
