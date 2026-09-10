package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dx extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ rz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(rz rzVar, Context context) {
        super(context);
        this.b = rzVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        rz rzVar = this.b;
        cx cxVar = rzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * rzVar.t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = rzVar.z(org.telegram.ui.ActionBar.j6.He);
        Paint paint = this.a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), cxVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (cxVar.s != null) {
            canvas.save();
            float f7 = cxVar.c0 - cxVar.d0;
            float f10 = cxVar.v;
            if (f10 > 0.0f) {
                f7 = ((cxVar.s.getX() - cxVar.getScrollX()) * cxVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            cxVar.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.b.a0();
    }
}
