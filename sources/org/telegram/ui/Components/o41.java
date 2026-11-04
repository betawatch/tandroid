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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o41 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final TextPaint c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f;
    public final RectF g;
    public final gc h;
    public final org.telegram.ui.Cells.k9 i;
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

    public o41() {
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f = new Paint(1);
        this.g = new RectF();
        gc gcVar = new gc((View) null);
        this.h = gcVar;
        this.i = new org.telegram.ui.Cells.k9(new i9(this, 8));
        this.s = org.telegram.messenger.g0.L(62.33f);
        this.t = org.telegram.messenger.g0.L(12.0f);
        this.u = org.telegram.messenger.g0.L(30.0f);
        this.v = org.telegram.messenger.g0.L(15.0f);
        this.w = org.telegram.messenger.g0.L(7.0f);
        this.x = org.telegram.messenger.g0.L(12.0f);
        this.y = org.telegram.messenger.g0.L(2.0f);
        this.a = org.telegram.messenger.t0.b.getDrawable(R.drawable.send_plane_26).mutate();
        this.b = org.telegram.messenger.t0.b.getDrawable(R.drawable.large_unsupported).mutate();
        gcVar.f = new sp0(this, 28);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        b();
    }

    public final int a(int i3) {
        this.q = i3;
        String str = this.p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        String str2 = this.p;
        int ceil = (int) Math.ceil(measureText);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.m = new StaticLayout(str2, textPaint, ceil, alignment, 1.0f, 0.0f, false);
        int L = (((i3 - this.s) - ((int) ((this.t * 2) + measureText))) - this.x) - org.telegram.messenger.g0.L(11.0f);
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
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.a.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.r1(0.11f, -16777216), mode));
        this.c.setColor(x02);
        this.d.setColor(i0.a.o(x02, org.telegram.messenger.hs.J2));
        this.e.setColor(x02);
        this.f.setColor(org.telegram.ui.ActionBar.k6.r1(0.11f, -16777216));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.k == null || this.l == null || this.m == null) {
            return;
        }
        int i3 = getBounds().left;
        int i10 = getBounds().right;
        int centerY = getBounds().centerY();
        int height = centerY - ((this.l.getHeight() + (this.k.getHeight() + this.y)) / 2);
        canvas.save();
        canvas.translate(this.s + i3, height);
        this.k.draw(canvas);
        canvas.translate(0.0f, this.k.getHeight() + r4);
        this.l.draw(canvas);
        canvas.restore();
        float width = this.m.getWidth();
        int i11 = this.t;
        int L = i10 - org.telegram.messenger.g0.L(11.0f);
        float f10 = centerY - (this.u / 2);
        RectF rectF = this.g;
        rectF.set(L - ((int) (width + (i11 * 2))), f10, L, r6 + r5);
        float a10 = this.h.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        org.telegram.ui.ActionBar.k6.r1(0.18f, -1);
        int i12 = this.v;
        canvas.drawRoundRect(rectF, i12, i12, this.f);
        canvas.save();
        canvas.translate(r3 + i11, ((r5 - this.m.getHeight()) / 2.0f) + f10);
        this.m.draw(canvas);
        canvas.restore();
        canvas.restore();
        float L2 = org.telegram.messenger.g0.L(29.66f) + i3;
        float f11 = centerY + 1;
        Drawable drawable = this.b;
        cg.r.d(drawable, L2, f11, 17);
        drawable.draw(canvas);
        float L3 = org.telegram.messenger.g0.L(29.66f) + i3;
        Drawable drawable2 = this.a;
        cg.r.d(drawable2, L3, f11, 17);
        drawable2.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
