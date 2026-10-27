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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i90 extends Drawable {
    public static final Paint k = new Paint();
    public static TextPaint l;
    public static TextPaint m;
    public static TextPaint n;
    public StaticLayout b;
    public float c;
    public float d;
    public float e;
    public final int g;
    public final TextPaint h;
    public final org.telegram.ui.ActionBar.u6 j;
    public final RectF a = new RectF();
    public final StringBuilder f = new StringBuilder(5);
    public float i = 1.0f;

    public i90(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.g = i10;
        this.j = u6Var;
        if (i10 == 0) {
            if (l == null) {
                l = new TextPaint(1);
            }
            l.setTextSize(AndroidUtilities.dp(28.0f));
            k.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Jh, u6Var));
            l.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Kh, u6Var));
            this.h = l;
            return;
        }
        if (i10 == 1) {
            if (m == null) {
                m = new TextPaint(1);
            }
            m.setColor(-1);
            m.setTextSize(AndroidUtilities.dp(13.0f));
            m.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.h = m;
            return;
        }
        if (n == null) {
            n = new TextPaint(1);
        }
        n.setColor(-1);
        n.setTextSize(org.telegram.ui.ActionBar.y6.d3.getTextSize() * 0.75f);
        n.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.h = n;
    }

    public final void a(String str) {
        StringBuilder sb2 = this.f;
        sb2.setLength(0);
        if (str != null && str.length() > 0) {
            sb2.append(str.substring(0, 1));
        }
        if (sb2.length() <= 0) {
            this.b = null;
            return;
        }
        try {
            StaticLayout staticLayout = new StaticLayout(sb2.toString().toUpperCase(), this.h, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            int i10 = org.telegram.ui.ActionBar.y6.Jh;
            org.telegram.ui.ActionBar.u6 u6Var = this.j;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            Paint paint = k;
            paint.setColor(w02);
            this.h.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Kh, u6Var));
            float f7 = bounds.left;
            float f10 = bounds.top;
            float f11 = bounds.right;
            float f12 = bounds.bottom;
            RectF rectF = this.a;
            rectF.set(f7, f10, f11, f12);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        }
        canvas.save();
        float f13 = this.i;
        if (f13 != 1.0f) {
            canvas.scale(f13, f13, bounds.centerX(), bounds.centerY());
        }
        if (this.b != null) {
            float width = bounds.width();
            canvas.translate(c3.h0.B(width, this.c, 2.0f, bounds.left) - this.e, c3.h0.B(width, this.d, 2.0f, bounds.top));
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
        k.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
