package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class va extends vc0 {
    public final /* synthetic */ boolean C0;
    public final /* synthetic */ boolean D0;
    public final /* synthetic */ bb E0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(bb bbVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.E0 = bbVar;
        this.C0 = z10;
        this.D0 = z11;
    }

    @Override // org.telegram.ui.Components.bw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        bb bbVar = this.E0;
        bbVar.I(canvas, this);
        super.dispatchDraw(canvas);
        bbVar.H(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            bb bbVar = this.E0;
            drawable = ((org.telegram.ui.ActionBar.f3) bbVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                bbVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.D0) {
            this.E0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.vc0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        bb bbVar = this.E0;
        bbVar.h = size;
        bbVar.E(i10, i11);
        if (this.C0) {
            i11 = View.MeasureSpec.makeMeasureSpec(bbVar.h, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
