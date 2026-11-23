package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class iw extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ ty b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(ty tyVar, Context context) {
        super(context);
        this.b = tyVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ty tyVar = this.b;
        hw hwVar = tyVar.C0;
        float L = org.telegram.messenger.g0.L(50.0f) * tyVar.u1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = tyVar.z(org.telegram.ui.ActionBar.m6.zf);
        Paint paint = this.a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), hwVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (hwVar.s != null) {
            canvas.save();
            float f10 = hwVar.d0 - hwVar.e0;
            float f11 = hwVar.w;
            if (f11 > 0.0f) {
                f10 = ((hwVar.s.getX() - hwVar.getScrollX()) * hwVar.w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            hwVar.s.draw(canvas);
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
