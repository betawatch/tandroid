package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class la extends kb0 {
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ boolean n0;
    public final /* synthetic */ sa o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(sa saVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.o0 = saVar;
        this.m0 = z10;
        this.n0 = z11;
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sa saVar = this.o0;
        saVar.X0(canvas, this);
        super.dispatchDraw(canvas);
        saVar.W0(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            sa saVar = this.o0;
            if (y10 < saVar.s0.getBounds().top) {
                saVar.dismiss();
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

    @Override // org.telegram.ui.Components.kb0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        sa saVar = this.o0;
        saVar.r1 = size;
        saVar.T0(i7, i10);
        if (this.m0) {
            i10 = View.MeasureSpec.makeMeasureSpec(saVar.r1, TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
    }
}
