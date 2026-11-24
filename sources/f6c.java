// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class f6c extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final TextPaint c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f;
    public final RectF g;
    public final n41 h;
    public final hi2 i;
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

    public f6c() {
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f = new Paint(1);
        this.g = new RectF();
        n41 n41Var = new n41((View) null);
        this.h = n41Var;
        this.i = new hi2(new v39(this, (byte) 18));
        this.s = gl.L(62.33f);
        this.t = gl.L(12.0f);
        this.u = gl.L(30.0f);
        this.v = gl.L(15.0f);
        this.w = gl.L(7.0f);
        this.x = gl.L(12.0f);
        this.y = gl.L(2.0f);
        this.a = a.b.getDrawable(R.drawable.send_plane_26).mutate();
        this.b = a.b.getDrawable(R.drawable.large_unsupported).mutate();
        n41Var.f = new cib(this, (byte) 22);
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.L(14.0f));
        textPaint2.setTextSize(gl.L(12.0f));
        textPaint3.setTypeface(gl.o());
        textPaint3.setTextSize(gl.L(14.0f));
        b();
    }

    public final int a(int i) {
        this.q = i;
        String str = this.p;
        int length = str.length();
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText((CharSequence) str, 0, length);
        String str2 = this.p;
        int ceil = (int) Math.ceil(measureText);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.m = new StaticLayout(str2, textPaint, ceil, alignment, 1.0f, 0.0f, false);
        int L = (((i - this.s) - ((int) ((this.t << 1) + measureText))) - this.x) - gl.L(11.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextPaint textPaint2 = this.c;
        this.k = new StaticLayout(TextUtils.ellipsize(this.n, textPaint2, L, truncateAt), textPaint2, L, alignment, 1.0f, 0.0f, false);
        this.l = new StaticLayout(this.o, this.d, L, alignment, 1.0f, 0.0f, false);
        int max = Math.max(this.l.getHeight() + this.k.getHeight() + this.y, this.u) + (this.w << 1);
        this.r = max;
        setBounds(0, 0, this.q, max);
        return this.r;
    }

    public final void b() {
        int w0 = bkb.w0(null, bkb.Yc, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.a.setColorFilter(new PorterDuffColorFilter(w0, mode));
        this.b.setColorFilter(new PorterDuffColorFilter(bkb.p1(0.11f, -16777216), mode));
        this.c.setColor(w0);
        this.d.setColor(bm2.o(w0, kk7.I2));
        this.e.setColor(w0);
        this.f.setColor(bkb.p1(0.11f, -16777216));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.k == null || this.l == null || this.m == null) {
            return;
        }
        int i = getBounds().left;
        int i2 = getBounds().right;
        int centerY = getBounds().centerY();
        int height = centerY - ((this.l.getHeight() + (this.k.getHeight() + this.y)) / 2);
        canvas.save();
        canvas.translate(this.s + i, height);
        this.k.draw(canvas);
        canvas.translate(0.0f, this.k.getHeight() + r4);
        this.l.draw(canvas);
        canvas.restore();
        float width = this.m.getWidth();
        int i3 = this.t;
        int L = i2 - gl.L(11.0f);
        float f = centerY - (this.u / 2);
        RectF rectF = this.g;
        rectF.set(L - ((int) (width + (i3 << 1))), f, L, r6 + r5);
        float a = this.h.a(0.05f);
        canvas.save();
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        bkb.p1(0.18f, -1);
        int i4 = this.v;
        canvas.drawRoundRect(rectF, i4, i4, this.f);
        canvas.save();
        canvas.translate(r3 + i3, ((r5 - this.m.getHeight()) / 2.0f) + f);
        this.m.draw(canvas);
        canvas.restore();
        canvas.restore();
        float L2 = gl.L(29.66f) + i;
        float f2 = centerY + 1;
        Drawable drawable = this.b;
        kq3.d(drawable, L2, f2, 17);
        drawable.draw(canvas);
        float L3 = gl.L(29.66f) + i;
        Drawable drawable2 = this.a;
        kq3.d(drawable2, L3, f2, 17);
        drawable2.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
