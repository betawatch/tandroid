package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class xa extends md0 {
    public final /* synthetic */ boolean D0;
    public final /* synthetic */ boolean E0;
    public final /* synthetic */ db F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(db dbVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.F0 = dbVar;
        this.D0 = z10;
        this.E0 = z11;
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        db dbVar = this.F0;
        dbVar.J(canvas, this);
        super.dispatchDraw(canvas);
        dbVar.I(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            db dbVar = this.F0;
            drawable = ((org.telegram.ui.ActionBar.e3) dbVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                dbVar.dismiss();
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

    @Override // org.telegram.ui.Components.md0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        db dbVar = this.F0;
        dbVar.h = size;
        dbVar.F(i10, i11);
        if (this.D0) {
            i11 = View.MeasureSpec.makeMeasureSpec(dbVar.h, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
