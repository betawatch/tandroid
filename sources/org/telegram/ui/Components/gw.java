package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class gw extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ ry b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(ry ryVar, Context context) {
        super(context);
        this.b = ryVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ry ryVar = this.b;
        fw fwVar = ryVar.C0;
        float L = org.telegram.messenger.g0.L(50.0f) * ryVar.u1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = ryVar.z(org.telegram.ui.ActionBar.n6.zf);
        Paint paint = this.a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), fwVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (fwVar.s != null) {
            canvas.save();
            float f10 = fwVar.d0 - fwVar.e0;
            float f11 = fwVar.w;
            if (f11 > 0.0f) {
                f10 = ((fwVar.s.getX() - fwVar.getScrollX()) * fwVar.w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            fwVar.s.draw(canvas);
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
