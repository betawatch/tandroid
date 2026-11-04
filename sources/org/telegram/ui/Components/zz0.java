package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zz0 extends Drawable {
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public int e;
    public int f;
    public Drawable g;
    public int h;
    public final Context i;
    public final org.telegram.ui.ActionBar.e6 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public ColorFilter n;

    public zz0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.d = 0.0f;
        this.e = 0;
        this.f = -1;
        this.i = context;
        this.j = e6Var;
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
    }

    public static zz0 a(int i3) {
        zz0 zz0Var = new zz0(org.telegram.messenger.t0.b, null);
        zz0Var.b(i3);
        zz0Var.l = true;
        return zz0Var;
    }

    public final void b(int i3) {
        String str;
        if (this.f != i3) {
            this.f = i3;
            boolean z10 = this.m;
            Context context = this.i;
            if (z10) {
                this.g = context.getDrawable(R.drawable.msg_autodelete_badge2).mutate();
            } else {
                Drawable mutate = context.getDrawable(i3 == 0 ? R.drawable.msg_mini_autodelete : R.drawable.msg_mini_autodelete_empty).mutate();
                this.g = mutate;
                mutate.setColorFilter(this.n);
            }
            invalidateSelf();
            int i10 = this.f;
            if (i10 >= 1 && i10 < 60) {
                str = k2.p1.i(i3, "");
                if (str.length() < 2) {
                    str = k2.p1.k(2131745698, null, com.google.android.recaptcha.internal.a.l(str));
                }
            } else if (i10 >= 60 && i10 < 3600) {
                str = "" + (i3 / 60);
                if (str.length() < 2) {
                    str = k2.p1.k(2131745700, null, com.google.android.recaptcha.internal.a.l(str));
                }
            } else if (i10 >= 3600 && i10 < 86400) {
                str = "" + ((i3 / 60) / 60);
                if (str.length() < 2) {
                    str = k2.p1.k(2131745701, null, com.google.android.recaptcha.internal.a.l(str));
                }
            } else if (i10 >= 86400 && i10 < 604800) {
                str = "" + (((i3 / 60) / 60) / 24);
                if (str.length() < 2) {
                    str = k2.p1.k(2131745702, null, com.google.android.recaptcha.internal.a.l(str));
                }
            } else if (i10 < 2678400) {
                str = "" + ((((i3 / 60) / 60) / 24) / 7);
                if (str.length() < 2) {
                    str = k2.p1.k(2131745697, null, com.google.android.recaptcha.internal.a.l(str));
                } else if (str.length() > 2) {
                    str = "c";
                }
            } else if (i10 < 31449600) {
                str = "" + ((((i3 / 60) / 60) / 24) / 30);
                if (str.length() < 2) {
                    str = k2.p1.k(2131745699, null, com.google.android.recaptcha.internal.a.l(str));
                }
            } else {
                str = "" + ((((i3 / 60) / 60) / 24) / 364);
                if (str.length() < 2) {
                    str = k2.p1.k(2131745696, null, com.google.android.recaptcha.internal.a.l(str));
                }
            }
            String str2 = str;
            float L = org.telegram.messenger.g0.L(11.0f);
            TextPaint textPaint = this.a;
            textPaint.setTextSize(L);
            float measureText = textPaint.measureText(str2);
            this.d = measureText;
            if (measureText > org.telegram.messenger.g0.L(13.0f)) {
                textPaint.setTextSize(org.telegram.messenger.g0.L(9.0f));
                this.d = textPaint.measureText(str2);
            }
            if (this.d > org.telegram.messenger.g0.L(13.0f)) {
                textPaint.setTextSize(org.telegram.messenger.g0.L(6.0f));
                this.d = textPaint.measureText(str2);
            }
            try {
                StaticLayout staticLayout = new StaticLayout(str2, textPaint, (int) Math.ceil(this.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.c = staticLayout;
                this.e = staticLayout.getHeight();
            } catch (Exception e10) {
                this.c = null;
                org.telegram.messenger.a8.g(e10, true);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(23.0f);
        int L2 = org.telegram.messenger.g0.L(23.0f);
        boolean z10 = this.m;
        Paint paint = this.b;
        TextPaint textPaint = this.a;
        org.telegram.ui.ActionBar.e6 e6Var = this.j;
        if (z10) {
            textPaint.setColor(-1);
        } else if (this.l) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, e6Var));
        } else {
            if (!this.k) {
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s8, e6Var));
            }
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, e6Var));
        }
        if (this.g != null) {
            if (!this.l && !this.m) {
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, e6Var);
                if (this.h != w02) {
                    this.h = w02;
                    this.g.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
            if (this.m) {
                this.g.setBounds(getBounds().left, getBounds().top, this.g.getIntrinsicWidth() + getBounds().left, this.g.getIntrinsicHeight() + getBounds().top);
                this.g.draw(canvas);
            } else {
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(getBounds().centerX() - org.telegram.messenger.g0.L(10.5f), getBounds().centerY() - org.telegram.messenger.g0.L(10.5f), this.g.getIntrinsicWidth() + (getBounds().centerX() - org.telegram.messenger.g0.L(10.5f)), this.g.getIntrinsicHeight() + (getBounds().centerY() - org.telegram.messenger.g0.L(10.5f)));
                this.g.setBounds(rect);
                this.g.draw(canvas);
            }
        }
        if (this.f == 0 || this.c == null) {
            return;
        }
        int i3 = org.telegram.messenger.g0.p != 3.0f ? 0 : -1;
        canvas.save();
        if (this.m) {
            canvas.translate((float) (((getBounds().width() / 2) - Math.ceil(this.d / 2.0f)) + i3), (getBounds().height() - this.e) / 2.0f);
            this.c.draw(canvas);
        } else {
            canvas.translate(((int) ((L / 2) - Math.ceil(this.d / 2.0f))) + i3, (L2 - this.e) / 2.0f);
            this.c.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(23.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(23.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.n = colorFilter;
        if (this.l) {
            this.g.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
    }
}
