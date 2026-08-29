package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qw extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ fz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(fz fzVar, Context context) {
        super(context);
        this.b = fzVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fz fzVar = this.b;
        pw pwVar = fzVar.x0;
        float dp = AndroidUtilities.dp(50.0f) * fzVar.p1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = fzVar.A(org.telegram.ui.ActionBar.g6.He);
        Paint paint = this.a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), pwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (pwVar.s != null) {
            canvas.save();
            float f9 = pwVar.V - pwVar.W;
            float f10 = pwVar.v;
            if (f10 > 0.0f) {
                f9 = ((pwVar.s.getX() - pwVar.getScrollX()) * pwVar.v) + ((1.0f - f10) * f9);
            }
            canvas.translate(f9, 0.0f);
            pwVar.s.draw(canvas);
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
