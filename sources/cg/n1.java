package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n1 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final n9 a;
    public final m1 b;
    public final Paint c;
    public boolean d;
    public final y8 e;

    public n1(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new y8((c6) null);
        n9 n9Var = new n9(getContext());
        this.a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(f10));
        m1 m1Var = new m1(context);
        TextPaint textPaint = new TextPaint(1);
        m1Var.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = g6.a7;
        textPaint.setColor(g6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.b = m1Var;
        m1Var.setAlpha(0.0f);
        addView(n9Var, z5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(m1Var, z5.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(g6.w0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }
}
