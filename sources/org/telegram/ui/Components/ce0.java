package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ce0 extends View {
    public boolean E;
    public long F;
    public float G;
    public float H;
    public float I;
    public gb0 J;
    public TextPaint a;
    public TextPaint b;
    public StaticLayout c;
    public float d;
    public float e;
    public StaticLayout f;
    public float h;
    public float n;
    public boolean r;
    public c6 s;
    public boolean w;
    public de0 x;
    public hi.s8 y;

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
        canvas.translate(((getWidth() - this.h) / 2.0f) - this.n, (getHeight() * 0.22f) + org.telegram.messenger.g0.L(60.0f));
        this.f.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        TextPaint textPaint = this.a;
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(org.telegram.messenger.g0.L(34.0f));
        TextPaint textPaint2 = this.b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(org.telegram.messenger.g0.L(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(58.0f));
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.gd.M0(2131751115, null), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineCount() > 0 ? this.c.getLineWidth(0) : 0.0f;
            this.e = this.c.getLineCount() > 0 ? this.c.getLineLeft(0) : 0.0f;
        }
    }

    public void setAllowTouch(boolean z10) {
        this.w = z10;
    }

    public void setFilterView(de0 de0Var) {
        this.x = de0Var;
    }
}
