// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class li8 extends FrameLayout implements tjb {
    public static final /* synthetic */ int f = 0;
    public final be0 a;
    public final ki8 b;
    public final Paint c;
    public boolean d;
    public final pb0 e;

    public li8(Context context, float f2) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = true;
        this.e = new pb0((wjb) null);
        be0 be0Var = new be0(getContext());
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(f2));
        ki8 ki8Var = new ki8(context);
        TextPaint textPaint = new TextPaint(1);
        ki8Var.a = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        int i = bkb.Z6;
        textPaint.setColor(bkb.w0(null, i, false));
        de9.p(textPaint, gl.L(11.5f));
        this.b = ki8Var;
        ki8Var.setAlpha(0.0f);
        addView(be0Var, nme.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(ki8Var, nme.d(26, 26.0f, 85, 0.0f, 0.0f, 1.0f, 3.0f));
        paint.setColor(bkb.w0(null, i, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - gl.L(2.0f), this.c);
        }
        super.dispatchDraw(canvas);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.c.setColor(bkb.w0(null, bkb.Z6, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
