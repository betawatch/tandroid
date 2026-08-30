package org.telegram.ui.Components;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class n80 extends Drawable {
    public static final Paint j = new Paint();
    public static TextPaint k;
    public static TextPaint l;
    public static TextPaint m;
    public StaticLayout b;
    public float c;
    public float d;
    public float e;
    public final int g;
    public final TextPaint h;
    public final RectF a = new RectF();
    public final StringBuilder f = new StringBuilder(5);
    public float i = 1.0f;

    public n80(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.g = i10;
        if (i10 == 0) {
            if (k == null) {
                k = new TextPaint(1);
            }
            k.setTextSize(AndroidUtilities.dp(28.0f));
            j.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Jh, f6Var));
            k.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Kh, f6Var));
            this.h = k;
            return;
        }
        if (i10 == 1) {
            if (l == null) {
                l = new TextPaint(1);
            }
            l.setColor(-1);
            l.setTextSize(AndroidUtilities.dp(13.0f));
            l.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = l;
            return;
        }
        if (m == null) {
            m = new TextPaint(1);
        }
        m.setColor(-1);
        m.setTextSize(org.telegram.ui.ActionBar.j6.d3.getTextSize() * 0.75f);
        m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.h = m;
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
            StaticLayout staticLayout = new StaticLayout(sb.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.b = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.e = this.b.getLineLeft(0);
                this.c = this.b.getLineWidth(0);
                this.d = this.b.getLineBottom(0);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        if (this.g == 0) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            float f12 = bounds.right;
            float f13 = bounds.bottom;
            RectF rectF = this.a;
            rectF.set(f10, f11, f12, f13);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), j);
        }
        canvas.save();
        float f14 = this.i;
        if (f14 != 1.0f) {
            canvas.scale(f14, f14, bounds.centerX(), bounds.centerY());
        }
        if (this.b != null) {
            float width = bounds.width();
            canvas.translate(e2.c.x(width, this.c, 2.0f, bounds.left) - this.e, e2.c.x(width, this.d, 2.0f, bounds.top));
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
    public final void setAlpha(int i10) {
        this.h.setAlpha(i10);
        j.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
