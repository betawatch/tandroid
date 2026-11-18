package ch;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b extends ReplacementSpan {
    public final TextPaint a;
    public final RectF b;
    public StaticLayout c;
    public float d;
    public float e;
    public int f;
    public final i6 h;

    public b(i6 i6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = new RectF();
        this.h = i6Var;
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setColor(n6.w0(n6.C6, i6Var));
    }

    public final void a() {
        if (this.c == null) {
            StaticLayout staticLayout = new StaticLayout(gd.M0(2131746213, null), this.a, org.telegram.messenger.g0.q.x, gd.a0 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.c.getHeight();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        a();
        this.a.setColor(n6.w0(n6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f, 31);
        canvas.translate(f10 + org.telegram.messenger.g0.L(4.0f), (((i13 - i11) / 2.0f) + i11) - (this.e / 2.0f));
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.g0.L(8.0f) + this.d);
    }
}
