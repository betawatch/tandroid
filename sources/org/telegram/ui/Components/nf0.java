package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class nf0 extends View {
    public long B;
    public float C;
    public float D;
    public float E;
    public ec0 F;
    public TextPaint a;
    public TextPaint b;
    public StaticLayout c;
    public float d;
    public float e;
    public StaticLayout f;
    public float h;
    public float n;
    public boolean r;
    public z5 s;
    public boolean v;
    public pf0 w;
    public qh.f8 x;
    public boolean y;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float e6 = this.s.e(this.r);
        if (e6 <= 0.0f || this.c == null || this.f == null) {
            return;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e6 * 255.0f), 31);
        canvas.save();
        canvas.translate(((getWidth() - this.d) / 2.0f) - this.e, getHeight() * 0.22f);
        this.c.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(((getWidth() - this.h) / 2.0f) - this.n, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
        this.f.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        TextPaint textPaint = this.a;
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
        textPaint.setTextSize(AndroidUtilities.dp(34.0f));
        TextPaint textPaint2 = this.b;
        textPaint2.setColor(-1);
        textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
        textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineCount() > 0 ? this.c.getLineWidth(0) : 0.0f;
            this.e = this.c.getLineCount() > 0 ? this.c.getLineLeft(0) : 0.0f;
        }
    }

    public void setAllowTouch(boolean z4) {
        this.v = z4;
    }

    public void setFilterView(pf0 pf0Var) {
        this.w = pf0Var;
    }
}
