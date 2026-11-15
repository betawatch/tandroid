package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.li0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class z2 implements li0 {
    public final /* synthetic */ b4 a;

    public z2(b4 b4Var) {
        this.a = b4Var;
    }

    @Override // org.telegram.ui.Components.li0
    public final boolean B() {
        return this.a.L0();
    }

    @Override // org.telegram.ui.Components.li0
    public final void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
        b4 b4Var = this.a;
        Paint paint = b4Var.X1;
        a8.b8 b8Var = b4Var.z1;
        float f13 = -f11;
        float f14 = -f12;
        b8Var.k(f13, f14, b4Var.getMeasuredWidth() + f13, b4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) b8Var.a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, (Paint) b8Var.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.li0
    public final void K() {
        ((z8) this.a.A1).b(false);
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ boolean L() {
        return false;
    }

    @Override // org.telegram.ui.Components.li0
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        b4 b4Var = this.a;
        if (z10) {
            org.telegram.ui.Components.t4.X(b4Var.m2, 1, b4Var.l1, new y2(this, z10, p0Var, view));
        } else {
            b4Var.l0(new aa.c0(this, view, p0Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.li0
    public final /* synthetic */ boolean r() {
        return true;
    }
}
