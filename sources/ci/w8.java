package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class w8 extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ x8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(x8 x8Var, Context context) {
        super(context);
        this.e = x8Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        x8 x8Var = this.e;
        FrameLayout frameLayout = i10 <= -1 ? x8Var.b : i10 >= 1 ? x8Var.f : x8Var.d;
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x8 x8Var = this.e;
        int floor = (int) Math.floor(x8Var.r);
        RectF rectF = this.a;
        a(rectF, floor);
        int ceil = (int) Math.ceil(x8Var.r);
        RectF rectF2 = this.b;
        a(rectF2, ceil);
        float f7 = x8Var.r;
        float floor2 = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.c;
        AndroidUtilities.lerp(rectF, rectF2, floor2, rectF3);
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.15f, i0.a.d(x8Var.n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
