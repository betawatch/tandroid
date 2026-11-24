// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ci8 extends ri8 {
    public final /* synthetic */ di8 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci8(di8 di8Var, Context context) {
        super(context);
        this.O = di8Var;
    }

    @Override // ri8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ei8 ei8Var = this.O.d;
        if (this.r.getVisibility() == 0) {
            RectF rectF = gl.P;
            rectF.set(r1.getLeft(), r1.getTop(), r1.getRight(), r1.getBottom());
            ei8Var.n.o0.d(0, 0.0f, 0, getMeasuredWidth(), -this.n.h, ei8Var.n.P);
            canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), ei8Var.n.o0.f);
        }
        super.dispatchDraw(canvas);
    }
}
