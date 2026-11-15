package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class aw extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ ly b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(ly lyVar, Context context) {
        super(context);
        this.b = lyVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ly lyVar = this.b;
        zv zvVar = lyVar.C0;
        float L = org.telegram.messenger.g0.L(50.0f) * lyVar.u1.p();
        if (L > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (L != 0.0f) {
            canvas.clipRect(0.0f, L, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = lyVar.z(org.telegram.ui.ActionBar.j6.zf);
        Paint paint = this.a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), zvVar.getExpandedOffset() + org.telegram.messenger.g0.L(36.0f), paint);
        super.dispatchDraw(canvas);
        if (zvVar.s != null) {
            canvas.save();
            float f10 = zvVar.d0 - zvVar.e0;
            float f11 = zvVar.w;
            if (f11 > 0.0f) {
                f10 = ((zvVar.s.getX() - zvVar.getScrollX()) * zvVar.w) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            zvVar.s.draw(canvas);
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
