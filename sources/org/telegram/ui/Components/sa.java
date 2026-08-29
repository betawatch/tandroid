package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sa extends ic0 {
    public final /* synthetic */ boolean A0;
    public final /* synthetic */ xa B0;
    public final /* synthetic */ boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(xa xaVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.B0 = xaVar;
        this.z0 = z10;
        this.A0 = z11;
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xa xaVar = this.B0;
        xaVar.H(canvas, this);
        super.dispatchDraw(canvas);
        xaVar.G(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y8 = motionEvent.getY();
            xa xaVar = this.B0;
            drawable = ((org.telegram.ui.ActionBar.f3) xaVar).shadowDrawable;
            if (y8 < drawable.getBounds().top) {
                xaVar.dismiss();
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

    @Override // org.telegram.ui.Components.ic0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        xa xaVar = this.B0;
        xaVar.h = size;
        xaVar.D(i10, i11);
        if (this.z0) {
            i11 = View.MeasureSpec.makeMeasureSpec(xaVar.h, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
