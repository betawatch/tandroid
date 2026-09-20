package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ua extends uc0 {
    public final /* synthetic */ boolean C0;
    public final /* synthetic */ boolean D0;
    public final /* synthetic */ ab E0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(ab abVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.E0 = abVar;
        this.C0 = z10;
        this.D0 = z11;
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ab abVar = this.E0;
        abVar.I(canvas, this);
        super.dispatchDraw(canvas);
        abVar.H(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            ab abVar = this.E0;
            drawable = ((org.telegram.ui.ActionBar.f3) abVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                abVar.dismiss();
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

    @Override // org.telegram.ui.Components.uc0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        ab abVar = this.E0;
        abVar.h = size;
        abVar.E(i10, i11);
        if (this.C0) {
            i11 = View.MeasureSpec.makeMeasureSpec(abVar.h, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
