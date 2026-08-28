package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a2 extends FrameLayout {
    public final o9 a;
    public final b2 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final z8 e;

    public a2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new z8((b6) null);
        o9 o9Var = new o9(getContext());
        this.a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        b2 b2Var = new b2(context);
        Paint paint2 = new Paint(1);
        b2Var.a = paint2;
        b2Var.b = b2Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i9 = f6.h5;
        paint2.setColor(f6.w0(null, i9, false));
        this.b = b2Var;
        b2Var.setAlpha(0.0f);
        addView(o9Var, e6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(b2Var, e6.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(f6.w0(null, i9, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }
}
