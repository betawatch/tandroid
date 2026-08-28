package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s1 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final o9 a;
    public final r1 b;
    public final Paint c;
    public boolean d;
    public final z8 e;

    public s1(Context context, float f10) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new z8((b6) null);
        o9 o9Var = new o9(getContext());
        this.a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(f10));
        r1 r1Var = new r1(context);
        TextPaint textPaint = new TextPaint(1);
        r1Var.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i9 = f6.a7;
        textPaint.setColor(f6.w0(null, i9, false));
        textPaint.setTextSize(AndroidUtilities.dp(11.5f));
        textPaint.setTypeface(AndroidUtilities.bold());
        this.b = r1Var;
        r1Var.setAlpha(0.0f);
        addView(o9Var, e6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(r1Var, e6.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(f6.w0(null, i9, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }
}
