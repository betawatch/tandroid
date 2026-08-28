package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class na extends tb0 {
    public final /* synthetic */ boolean A0;
    public final /* synthetic */ sa B0;
    public final /* synthetic */ boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(sa saVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.B0 = saVar;
        this.z0 = z10;
        this.A0 = z11;
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sa saVar = this.B0;
        saVar.H(canvas, this);
        super.dispatchDraw(canvas);
        saVar.G(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            sa saVar = this.B0;
            drawable = ((org.telegram.ui.ActionBar.f3) saVar).shadowDrawable;
            if (y10 < drawable.getBounds().top) {
                saVar.dismiss();
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

    @Override // org.telegram.ui.Components.tb0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        sa saVar = this.B0;
        saVar.h = size;
        saVar.D(i9, i10);
        if (this.z0) {
            i10 = View.MeasureSpec.makeMeasureSpec(saVar.h, TLObject.FLAG_30);
        }
        super.onMeasure(i9, i10);
    }
}
