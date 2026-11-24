// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ek8 extends tk8 {
    public final /* synthetic */ fk8 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek8(fk8 fk8Var, Context context) {
        super(context);
        this.O = fk8Var;
    }

    @Override // tk8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        gk8 gk8Var = this.O.d;
        if (this.r.getVisibility() == 0) {
            RectF rectF = gm.P;
            rectF.set(r1.getLeft(), r1.getTop(), r1.getRight(), r1.getBottom());
            gk8Var.n.o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, gk8Var.n.P);
            canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), gk8Var.n.o0.f);
        }
        super.dispatchDraw(canvas);
    }
}
