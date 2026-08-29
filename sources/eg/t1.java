package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t1 extends FrameLayout {
    public final t9 a;
    public final u1 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final e9 e;

    public t1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new e9((c6) null);
        t9 t9Var = new t9(getContext());
        this.a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        u1 u1Var = new u1(context);
        Paint paint2 = new Paint(1);
        u1Var.a = paint2;
        u1Var.b = u1Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = g6.h5;
        paint2.setColor(g6.w0(null, i10, false));
        this.b = u1Var;
        u1Var.setAlpha(0.0f);
        addView(t9Var, f6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(u1Var, f6.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(g6.w0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }
}
