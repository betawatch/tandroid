package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u1 extends FrameLayout {
    public final n9 a;
    public final v1 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final y8 e;

    public u1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new y8((c6) null);
        n9 n9Var = new n9(getContext());
        this.a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        v1 v1Var = new v1(context);
        Paint paint2 = new Paint(1);
        v1Var.a = paint2;
        v1Var.b = v1Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = g6.h5;
        paint2.setColor(g6.w0(null, i10, false));
        this.b = v1Var;
        v1Var.setAlpha(0.0f);
        addView(n9Var, z5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(v1Var, z5.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(g6.w0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }
}
