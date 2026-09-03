package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        this.e = new z8((f6) null);
        p9 p9Var = new p9(getContext());
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        t1 t1Var = new t1(context);
        Paint paint2 = new Paint(1);
        t1Var.a = paint2;
        t1Var.b = t1Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = j6.h5;
        paint2.setColor(j6.w0(null, i10, false));
        this.b = t1Var;
        t1Var.setAlpha(0.0f);
        addView(p9Var, b6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(t1Var, b6.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }
}
