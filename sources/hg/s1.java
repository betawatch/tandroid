package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s1 extends FrameLayout {
    public final p9 a;
    public final t1 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final z8 e;

    public s1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new z8((g6) null);
        p9 p9Var = new p9(getContext());
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        t1 t1Var = new t1(context);
        Paint paint2 = new Paint(1);
        t1Var.a = paint2;
        t1Var.b = t1Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = k6.h5;
        paint2.setColor(k6.w0(null, i10, false));
        this.b = t1Var;
        t1Var.setAlpha(0.0f);
        addView(p9Var, c6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(t1Var, c6.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(k6.w0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }
}
