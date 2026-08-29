package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m1 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final t9 a;
    public final l1 b;
    public final Paint c;
    public boolean d;
    public final e9 e;

    public m1(Context context, float f9) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new e9((c6) null);
        t9 t9Var = new t9(getContext());
        this.a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(f9));
        l1 l1Var = new l1(context);
        TextPaint textPaint = new TextPaint(1);
        l1Var.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = g6.a7;
        textPaint.setColor(g6.w0(null, i10, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.b = l1Var;
        l1Var.setAlpha(0.0f);
        addView(t9Var, f6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(l1Var, f6.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
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
