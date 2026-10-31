package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e1 extends FrameLayout implements k6 {
    public static final /* synthetic */ int f = 0;
    public final g9 a;
    public final d1 b;
    public final Paint c;
    public boolean d;
    public final r8 e;

    public e1(Context context, float f7) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new r8((p6) null);
        g9 g9Var = new g9(getContext());
        this.a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(f7));
        d1 d1Var = new d1(context);
        TextPaint textPaint = new TextPaint(1);
        d1Var.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i10 = t6.a7;
        textPaint.setColor(t6.x0(null, i10, false));
        textPaint.setTextSize(org.telegram.messenger.i0.L(11.5f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        this.b = d1Var;
        d1Var.setAlpha(0.0f);
        addView(g9Var, b6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(d1Var, b6.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(t6.x0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.c.setColor(t6.x0(null, t6.a7, false));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
