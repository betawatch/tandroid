package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class va extends gd0 {
    public final /* synthetic */ boolean D0;
    public final /* synthetic */ boolean E0;
    public final /* synthetic */ bb F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(bb bbVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.F0 = bbVar;
        this.D0 = z10;
        this.E0 = z11;
    }

    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        bb bbVar = this.F0;
        bbVar.J(canvas, this);
        super.dispatchDraw(canvas);
        bbVar.I(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            bb bbVar = this.F0;
            drawable = ((org.telegram.ui.ActionBar.f3) bbVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                bbVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.E0) {
            this.F0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.gd0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        bb bbVar = this.F0;
        bbVar.h = size;
        bbVar.F(i10, i11);
        if (this.D0) {
            i11 = View.MeasureSpec.makeMeasureSpec(bbVar.h, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
