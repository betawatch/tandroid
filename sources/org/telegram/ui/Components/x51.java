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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x51 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final TextPaint c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f;
    public final RectF g;
    public final uc h;
    public final wd.b i;
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
        uc ucVar = new uc((View) null);
        this.h = ucVar;
        this.i = new wd.b(new o4.g(this, 6));
        this.s = AndroidUtilities.dp(62.33f);
        this.t = AndroidUtilities.dp(12.0f);
        this.u = AndroidUtilities.dp(30.0f);
        this.v = AndroidUtilities.dp(15.0f);
        this.w = AndroidUtilities.dp(7.0f);
        this.x = AndroidUtilities.dp(12.0f);
        this.y = AndroidUtilities.dp(2.0f);
        this.a = ApplicationLoader.applicationContext.getDrawable(R.drawable.send_plane_26).mutate();
        this.b = ApplicationLoader.applicationContext.getDrawable(R.drawable.large_unsupported).mutate();
        ucVar.f = new fq0(this, 28);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
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
        int dp = (((i10 - this.s) - ((int) ((this.t * 2) + measureText))) - this.x) - AndroidUtilities.dp(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.c;
        this.k = new StaticLayout(TextUtils.ellipsize(this.n, textPaint2, dp, truncateAt), textPaint2, dp, alignment, 1.0f, 0.0f, false);
        this.l = new StaticLayout(this.o, this.d, dp, alignment, 1.0f, 0.0f, false);
        int max = (this.w * 2) + Math.max(this.l.getHeight() + this.k.getHeight() + this.y, this.u);
        this.r = max;
        setBounds(0, 0, this.q, max);
        return this.r;
    }

    public final void b() {
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ic, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.a.setColorFilter(new PorterDuffColorFilter(w02, mode));
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.l1(0.11f, -16777216), mode));
        this.c.setColor(w02);
        this.d.setColor(i0.a.k(w02, 179));
        this.e.setColor(w02);
        this.f.setColor(org.telegram.ui.ActionBar.g6.l1(0.11f, -16777216));
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
        int dp = i11 - AndroidUtilities.dp(11.0f);
        float f9 = centerY - (this.u / 2);
        RectF rectF = this.g;
        rectF.set(dp - ((int) (width + (i12 * 2))), f9, dp, r6 + r5);
        float a2 = this.h.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        org.telegram.ui.ActionBar.g6.l1(0.18f, -1);
        int i13 = this.v;
        canvas.drawRoundRect(rectF, i13, i13, this.f);
        canvas.save();
        canvas.translate(r3 + i12, ((r5 - this.m.getHeight()) / 2.0f) + f9);
        this.m.draw(canvas);
        canvas.restore();
        canvas.restore();
        float dp2 = AndroidUtilities.dp(29.66f) + i10;
        float f10 = centerY + 1;
        Drawable drawable = this.b;
        jf.r.d(drawable, dp2, f10, 17);
        drawable.draw(canvas);
        float dp3 = AndroidUtilities.dp(29.66f) + i10;
        Drawable drawable2 = this.a;
        jf.r.d(drawable2, dp3, f10, 17);
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
