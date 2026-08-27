package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class la extends xb0 {
    public final /* synthetic */ boolean A0;
    public final /* synthetic */ qa B0;
    public final /* synthetic */ boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(qa qaVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.B0 = qaVar;
        this.z0 = z10;
        this.A0 = z11;
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        qa qaVar = this.B0;
        qaVar.I(canvas, this);
        super.dispatchDraw(canvas);
        qaVar.H(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            qa qaVar = this.B0;
            drawable = ((org.telegram.ui.ActionBar.e3) qaVar).shadowDrawable;
            if (y10 < drawable.getBounds().top) {
                qaVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.A0) {
            this.B0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.xb0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        qa qaVar = this.B0;
        qaVar.h = size;
        qaVar.E(i10, i11);
        if (this.z0) {
            i11 = View.MeasureSpec.makeMeasureSpec(qaVar.h, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
