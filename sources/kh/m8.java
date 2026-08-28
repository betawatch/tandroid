package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class m8 extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ n8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(n8 n8Var, Context context) {
        super(context);
        this.e = n8Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i9) {
        n8 n8Var = this.e;
        FrameLayout frameLayout = i9 <= -1 ? n8Var.b : i9 >= 1 ? n8Var.f : n8Var.d;
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n8 n8Var = this.e;
        int floor = (int) Math.floor(n8Var.r);
        RectF rectF = this.a;
        a(rectF, floor);
        int ceil = (int) Math.ceil(n8Var.r);
        RectF rectF2 = this.b;
        a(rectF2, ceil);
        float f10 = n8Var.r;
        float floor2 = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.c;
        AndroidUtilities.lerp(rectF, rectF2, floor2, rectF3);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.15f, i0.a.d(n8Var.n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
