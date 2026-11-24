// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class eq3 extends View {
    public final Paint a;
    public final TextPaint b;
    public final StaticLayout c;
    public final float d;
    public final float e;
    public final Path f;
    public li3 h;
    public boolean n;
    public final lm r;

    public eq3(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        this.f = new Path();
        lm lmVar = new lm(this);
        this.r = lmVar;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(gl.L(6.0f)));
        textPaint.setTextSize(gl.L(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(k96.N0("StoryDraftSaved"), textPaint, r1.x, TextUtils.TruncateAt.END), textPaint, gl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.c = staticLayout;
        this.d = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.e = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        lmVar.e(true, 0.0f);
    }

    public final void a(boolean z) {
        li3 li3Var;
        if (!z && (li3Var = this.h) != null) {
            gl.r(li3Var);
            this.h = null;
        }
        this.n = z;
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float d = this.r.d(this.n);
        if (d <= 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, (this.n ? s33.k.getInterpolation(d) : 1.0f) * gl.L(12.0f));
        float interpolation = s33.h.getInterpolation(d);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float L = gl.L(22.0f) + this.d;
        float min = (measuredWidth / 2.0f) - Math.min(gl.L(135.0f), 0.35f * measuredWidth);
        float max = Math.max(gl.L(8.0f), min - (L / 2.0f));
        Path path = this.f;
        path.rewind();
        path.moveTo(max, 0.0f);
        float f = L + max;
        path.lineTo(f, 0.0f);
        path.lineTo(f, measuredHeight - gl.L(18.0f));
        path.lineTo(gl.L(7.0f) + min, measuredHeight - gl.L(18.0f));
        path.lineTo(gl.L(1.0f) + min, measuredHeight - gl.L(12.0f));
        path.lineTo(min - gl.L(1.0f), measuredHeight - gl.L(12.0f));
        path.lineTo(min - gl.L(7.0f), measuredHeight - gl.L(18.0f));
        path.lineTo(max, measuredHeight - gl.L(18.0f));
        path.close();
        Paint paint = this.a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        StaticLayout staticLayout = this.c;
        canvas.translate((max + gl.L(11.0f)) - this.e, ((measuredHeight - gl.L(18.0f)) - staticLayout.getHeight()) / 2.0f);
        this.b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(50.0f));
    }
}
