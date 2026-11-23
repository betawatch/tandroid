package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class m7 extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ n7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(n7 n7Var, Context context) {
        super(context);
        this.e = n7Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i7) {
        n7 n7Var = this.e;
        FrameLayout frameLayout = i7 <= -1 ? n7Var.b : i7 >= 1 ? n7Var.f : n7Var.d;
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - org.telegram.messenger.g0.L(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n7 n7Var = this.e;
        int floor = (int) Math.floor(n7Var.r);
        RectF rectF = this.a;
        a(rectF, floor);
        int ceil = (int) Math.ceil(n7Var.r);
        RectF rectF2 = this.b;
        a(rectF2, ceil);
        float f10 = n7Var.r;
        float floor2 = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.c;
        org.telegram.messenger.g0.Z1(rectF, rectF2, floor2, rectF3);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.15f, i0.a.f(n7Var.n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(r12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
