package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x51 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final TextPaint c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f;
    public final RectF g;
    public final dc h;
    public final ge.b i;
    public Runnable j;
    public StaticLayout k;
    public StaticLayout l;
    public StaticLayout m;
    public String n;
    public String o;
    public String p;
    public int q;
    public int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;

    public x51() {
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f = new Paint(1);
        this.g = new RectF();
        dc dcVar = new dc((View) null);
        this.h = dcVar;
        this.i = new ge.b(new l2.f(this, 20));
        this.s = org.telegram.messenger.i0.L(62.33f);
        this.t = org.telegram.messenger.i0.L(12.0f);
        this.u = org.telegram.messenger.i0.L(30.0f);
        this.v = org.telegram.messenger.i0.L(15.0f);
        this.w = org.telegram.messenger.i0.L(7.0f);
        this.x = org.telegram.messenger.i0.L(12.0f);
        this.y = org.telegram.messenger.i0.L(2.0f);
        this.a = org.telegram.messenger.w0.b.getDrawable(R.drawable.send_plane_26).mutate();
        this.b = org.telegram.messenger.w0.b.getDrawable(R.drawable.large_unsupported).mutate();
        dcVar.f = new j51(this, 1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.i0.o());
        textPaint3.setTextSize(org.telegram.messenger.i0.L(14.0f));
        b();
    }

    public final int a(int i10) {
        this.q = i10;
        String str = this.p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        String str2 = this.p;
        int ceil = (int) Math.ceil(measureText);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.m = new StaticLayout(str2, textPaint, ceil, alignment, 1.0f, 0.0f, false);
        int L = (((i10 - this.s) - ((int) ((this.t * 2) + measureText))) - this.x) - org.telegram.messenger.i0.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.c;
        this.k = new StaticLayout(TextUtils.ellipsize(this.n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.l = new StaticLayout(this.o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = (this.w * 2) + Math.max(this.l.getHeight() + this.k.getHeight() + this.y, this.u);
        this.r = max;
        setBounds(0, 0, this.q, max);
        return this.r;
    }

    public final void b() {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.r1(0.11f, -16777216), mode));
        this.c.setColor(x02);
        this.d.setColor(i0.b.o(x02, org.telegram.messenger.zs.J2));
        this.e.setColor(x02);
        this.f.setColor(org.telegram.ui.ActionBar.t6.r1(0.11f, -16777216));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.k == null || this.l == null || this.m == null) {
            return;
        }
        int i10 = getBounds().left;
        int i11 = getBounds().right;
        int centerY = getBounds().centerY();
        int height = centerY - ((this.l.getHeight() + (this.k.getHeight() + this.y)) / 2);
        canvas.save();
        canvas.translate(this.s + i10, height);
        this.k.draw(canvas);
        canvas.translate(0.0f, this.k.getHeight() + r4);
        this.l.draw(canvas);
        canvas.restore();
        float width = this.m.getWidth();
        int i12 = this.t;
        int L = i11 - org.telegram.messenger.i0.L(11.0f);
        float f7 = centerY - (this.u / 2);
        RectF rectF = this.g;
        rectF.set(L - ((int) (width + (i12 * 2))), f7, L, r6 + r5);
        float a2 = this.h.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        org.telegram.ui.ActionBar.t6.r1(0.18f, -1);
        int i13 = this.v;
        canvas.drawRoundRect(rectF, i13, i13, this.f);
        canvas.save();
        canvas.translate(r3 + i12, ((r5 - this.m.getHeight()) / 2.0f) + f7);
        this.m.draw(canvas);
        canvas.restore();
        canvas.restore();
        float L2 = org.telegram.messenger.i0.L(29.66f) + i10;
        float f10 = centerY + 1;
        Drawable drawable = this.b;
        rf.o.d(drawable, L2, f10, 17);
        drawable.draw(canvas);
        float L3 = org.telegram.messenger.i0.L(29.66f) + i10;
        Drawable drawable2 = this.a;
        rf.o.d(drawable2, L3, f10, 17);
        drawable2.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
