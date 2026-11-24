// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o26 extends Drawable {
    public static final Paint k = new Paint();
    public static TextPaint l;
    public static TextPaint m;
    public static TextPaint n;
    public StaticLayout b;
    public float c;
    public float d;
    public float e;
    public final boolean g;
    public final TextPaint h;
    public final ylb j;
    public final RectF a = new RectF();
    public final StringBuilder f = new StringBuilder(5);
    public float i = 1.0f;

    /* JADX WARN: Multi-variable type inference failed */
    public o26(int i, ylb ylbVar) {
        this.g = i;
        this.j = ylbVar;
        if (i == 0) {
            TextPaint textPaint = l;
            if (textPaint == null) {
                textPaint = new TextPaint(1);
                l = textPaint;
            }
            textPaint.setTextSize(gm.L(28.0f));
            k.setColor(cmb.v0(cmb.zi, ylbVar));
            l.setColor(cmb.v0(cmb.Ai, ylbVar));
            this.h = l;
            return;
        }
        if (i == 1) {
            TextPaint textPaint2 = m;
            if (textPaint2 == null) {
                textPaint2 = new TextPaint(1);
                m = textPaint2;
            }
            textPaint2.setColor(-1);
            m.setTextSize(gm.L(13.0f));
            m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = m;
            return;
        }
        TextPaint textPaint3 = n;
        if (textPaint3 == null) {
            textPaint3 = new TextPaint(1);
            n = textPaint3;
        }
        textPaint3.setColor(-1);
        n.setTextSize(cmb.c3.getTextSize() * 0.75f);
        n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.h = n;
    }

    public final void a(String str) {
        StringBuilder sb = this.f;
        sb.setLength(0);
        if (str != null && str.length() > 0) {
            sb.append(str.substring(0, 1));
        }
        if (sb.length() <= 0) {
            this.b = null;
            return;
        }
        try {
            StaticLayout staticLayout = new StaticLayout(sb.toString().toUpperCase(), this.h, gm.L(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.b = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.e = this.b.getLineLeft(0);
                this.c = this.b.getLineWidth(0);
                this.d = this.b.getLineBottom(0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (!this.g) {
            int i = cmb.zi;
            ylb ylbVar = this.j;
            int v0 = cmb.v0(i, ylbVar);
            Paint paint = k;
            paint.setColor(v0);
            this.h.setColor(cmb.v0(cmb.Ai, ylbVar));
            float f = bounds.left;
            float f2 = bounds.top;
            float f3 = bounds.right;
            float f4 = bounds.bottom;
            RectF rectF = this.a;
            rectF.set(f, f2, f3, f4);
            canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), paint);
        }
        canvas.save();
        float f5 = this.i;
        if (f5 != 1.0f) {
            canvas.scale(f5, f5, bounds.centerX(), bounds.centerY());
        }
        if (this.b != null) {
            float width = bounds.width();
            canvas.translate(aq1.z(width, this.c, 2.0f, bounds.left) - this.e, aq1.z(width, this.d, 2.0f, bounds.top));
            this.b.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.h.setAlpha(i);
        k.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
