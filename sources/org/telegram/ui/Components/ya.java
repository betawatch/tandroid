package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ya extends md0 {
    public final /* synthetic */ boolean D0;
    public final /* synthetic */ boolean E0;
    public final /* synthetic */ eb F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(eb ebVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.F0 = ebVar;
        this.D0 = z10;
        this.E0 = z11;
    }

    @Override // org.telegram.ui.Components.sw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        eb ebVar = this.F0;
        ebVar.J(canvas, this);
        super.dispatchDraw(canvas);
        ebVar.I(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            eb ebVar = this.F0;
            drawable = ((org.telegram.ui.ActionBar.f3) ebVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                ebVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.E0) {
            this.F0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.md0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        eb ebVar = this.F0;
        ebVar.h = size;
        ebVar.F(i10, i11);
        if (this.D0) {
            i11 = View.MeasureSpec.makeMeasureSpec(ebVar.h, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
