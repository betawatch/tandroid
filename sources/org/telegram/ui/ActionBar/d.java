package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.qv0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d extends z {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, Context context, k kVar2) {
        super(context, kVar2);
        this.h = kVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        k kVar = this.h;
        Paint paint = kVar.I0;
        if (kVar.H0 && this.a && kVar.w != 0) {
            kVar.J0.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            paint.setColor(kVar.w);
            canvas2 = canvas;
            kVar.G0.J(canvas2, 0.0f, kVar.J0, paint, true);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qv0 qv0Var = this.h.G0;
        if (qv0Var != null) {
            qv0Var.Q.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qv0 qv0Var = this.h.G0;
        if (qv0Var != null) {
            qv0Var.Q.remove(this);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        k kVar = this.h;
        kVar.invalidate();
        Runnable runnable = kVar.Q0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        k kVar = this.h;
        kVar.w = i10;
        if (kVar.H0) {
            return;
        }
        super.setBackgroundColor(i10);
    }
}
