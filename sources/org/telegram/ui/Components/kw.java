package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kw extends FrameLayout {
    public final Paint a;
    public final /* synthetic */ wy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(wy wyVar, Context context) {
        super(context);
        this.b = wyVar;
        this.a = new Paint();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wy wyVar = this.b;
        jw jwVar = wyVar.x0;
        float dp = AndroidUtilities.dp(50.0f) * wyVar.p1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int z10 = wyVar.z(org.telegram.ui.ActionBar.f6.He);
        Paint paint = this.a;
        paint.setColor(z10);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), jwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (jwVar.s != null) {
            canvas.save();
            float f10 = jwVar.V - jwVar.W;
            float f11 = jwVar.v;
            if (f11 > 0.0f) {
                f10 = ((jwVar.s.getX() - jwVar.getScrollX()) * jwVar.v) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            jwVar.s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.b.Z();
    }
}
