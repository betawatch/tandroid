package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ua extends xc0 {
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

    @Override // org.telegram.ui.Components.cw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ab abVar = this.E0;
        abVar.I(canvas, this);
        super.dispatchDraw(canvas);
        abVar.G(canvas, this);
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

    @Override // org.telegram.ui.Components.xc0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        ab abVar = this.E0;
        abVar.h = size;
        abVar.D(i10, i11);
        if (this.C0) {
            i11 = View.MeasureSpec.makeMeasureSpec(abVar.h, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
