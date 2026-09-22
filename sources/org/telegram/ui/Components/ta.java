package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ta extends mc0 {
    public final /* synthetic */ boolean D0;
    public final /* synthetic */ boolean E0;
    public final /* synthetic */ za F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(za zaVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.F0 = zaVar;
        this.D0 = z10;
        this.E0 = z11;
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        za zaVar = this.F0;
        zaVar.I(canvas, this);
        super.dispatchDraw(canvas);
        zaVar.H(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            za zaVar = this.F0;
            drawable = ((org.telegram.ui.ActionBar.f3) zaVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                zaVar.dismiss();
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

    @Override // org.telegram.ui.Components.mc0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        za zaVar = this.F0;
        zaVar.h = size;
        zaVar.E(i10, i11);
        if (this.D0) {
            i11 = View.MeasureSpec.makeMeasureSpec(zaVar.h, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
