package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ne0 extends View {
    public boolean D;
    public long E;
    public float F;
    public float G;
    public float H;
    public eb0 I;
    public TextPaint a;
    public TextPaint b;
    public StaticLayout c;
    public float d;
    public float e;
    public StaticLayout f;
    public float h;
    public float n;
    public boolean r;
    public t5 s;
    public boolean w;
    public oe0 x;
    public vh.y6 y;

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
        canvas.translate(((getWidth() - this.h) / 2.0f) - this.n, (getHeight() * 0.22f) + org.telegram.messenger.i0.L(60.0f));
        this.f.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.a;
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.i0.L(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(org.telegram.messenger.i0.L(34.0f));
        TextPaint textPaint2 = this.b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(org.telegram.messenger.i0.L(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(org.telegram.messenger.i0.L(58.0f));
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.cd.L0(2131751127, null), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineCount() > 0 ? this.c.getLineWidth(0) : 0.0f;
            this.e = this.c.getLineCount() > 0 ? this.c.getLineLeft(0) : 0.0f;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.w = z10;
    }

    public void setFilterView(oe0 oe0Var) {
        this.x = oe0Var;
    }
}
