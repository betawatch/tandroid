package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j1 extends FrameLayout implements k6 {
    public final g9 a;
    public final k1 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final r8 e;

    public j1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new r8((p6) null);
        g9 g9Var = new g9(getContext());
        this.a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
        k1 k1Var = new k1(context);
        Paint paint2 = new Paint(1);
        k1Var.b = paint2;
        k1Var.c = k1Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = t6.h5;
        paint2.setColor(t6.x0(null, i10, false));
        this.b = k1Var;
        k1Var.setAlpha(0.0f);
        addView(g9Var, b6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(k1Var, b6.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(t6.x0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(2.0f), this.c);
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        this.c.setColor(t6.x0(null, t6.h5, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
