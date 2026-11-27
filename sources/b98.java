// default package

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class b98 extends View {
    public boolean E;
    public long F;
    public float G;
    public float H;
    public float I;
    public x38 J;
    public TextPaint a;
    public TextPaint b;
    public StaticLayout c;
    public float d;
    public float e;
    public StaticLayout f;
    public float h;
    public float n;
    public boolean r;
    public mm s;
    public boolean w;
    public c98 x;
    public bab y;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float d = this.s.d(this.r);
        if (d <= 0.0f || this.c == null || this.f == null) {
            return;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
        canvas.save();
        canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
        this.c.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(((getWidth() - this.h) / 2.0f) - this.n, (getHeight() * 0.22f) + hl.L(60.0f));
        this.f.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        TextPaint textPaint = this.a;
        textPaint.setColor(-1);
        textPaint.setShadowLayer(hl.L(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(hl.L(34.0f));
        TextPaint textPaint2 = this.b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(hl.L(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(hl.L(58.0f));
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(ob6.M0(2131751091, null), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineCount() > 0 ? this.c.getLineWidth(0) : 0.0f;
            this.e = this.c.getLineCount() > 0 ? this.c.getLineLeft(0) : 0.0f;
        }
    }

    public void setAllowTouch(boolean z) {
        this.w = z;
    }

    public void setFilterView(c98 c98Var) {
        this.x = c98Var;
    }
}
