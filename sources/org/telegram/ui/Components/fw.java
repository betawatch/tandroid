package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fw extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ qy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(qy qyVar, Context context) {
        super(context);
        this.b = qyVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        qy qyVar = this.b;
        ew ewVar = qyVar.C0;
        float L = org.telegram.messenger.g0.L(50.0f) * qyVar.u1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = qyVar.z(org.telegram.ui.ActionBar.n6.zf);
        Paint paint = this.a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ewVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (ewVar.s != null) {
            canvas.save();
            float f10 = ewVar.d0 - ewVar.e0;
            float f11 = ewVar.w;
            if (f11 > 0.0f) {
                f10 = ((ewVar.s.getX() - ewVar.getScrollX()) * ewVar.w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            ewVar.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.b.Z();
    }
}
