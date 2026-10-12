package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class v8 extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ w8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(w8 w8Var, Context context) {
        super(context);
        this.e = w8Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        w8 w8Var = this.e;
        FrameLayout frameLayout = i10 <= -1 ? w8Var.b : i10 >= 1 ? w8Var.f : w8Var.d;
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        w8 w8Var = this.e;
        int floor = (int) Math.floor(w8Var.r);
        RectF rectF = this.a;
        a(rectF, floor);
        int ceil = (int) Math.ceil(w8Var.r);
        RectF rectF2 = this.b;
        a(rectF2, ceil);
        float f7 = w8Var.r;
        float floor2 = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.c;
        AndroidUtilities.lerp(rectF, rectF2, floor2, rectF3);
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.15f, i0.a.d(w8Var.n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(m12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
