package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z41 extends View {
    public final g6 a;
    public final g6 b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public final u5 h;
    public final int[] n;

    public z41(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        xq xqVar = xq.h;
        this.h = new u5(this, 0L, 300L, xqVar);
        this.n = new int[]{org.telegram.messenger.hs.a2, org.telegram.messenger.hs.P3, 360, 480, 720, 1080, 1440, 2160};
        g6 g6Var = new g6(true, false, false);
        this.a = g6Var;
        g6Var.n(0.4f, 360L, xqVar);
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.u(-1);
        g6Var.w(org.telegram.messenger.g0.N(10.6f));
        g6Var.setCallback(this);
        g6Var.b = 17;
        g6 g6Var2 = new g6(true, false, false);
        this.b = g6Var2;
        g6Var2.n(0.2f, 360L, xqVar);
        g6Var2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var2.u(-1);
        g6Var2.w(org.telegram.messenger.g0.N(8.6f));
        g6Var2.setCallback(this);
        g6Var2.b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        g6Var2.a.setXfermode(new PorterDuffXfermode(mode));
        g6Var2.M = org.telegram.messenger.g0.q.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i3, boolean z10, boolean z11) {
        this.f = !z10 || z11;
        g6 g6Var = this.a;
        g6 g6Var2 = this.b;
        if (z11) {
            g6Var.t("GIF", true, true);
            g6Var2.t("", true, true);
        } else {
            g6Var.t(i3 >= 720 ? "HD" : "SD", true, true);
            int[] iArr = this.n;
            int length = iArr.length - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                } else if (i3 >= iArr[length]) {
                    break;
                } else {
                    length--;
                }
            }
            if (length < 0) {
                g6Var2.t("", true, true);
            } else if (length == 6) {
                g6Var2.t("2K", TextUtils.isEmpty(g6Var2.i), true);
            } else if (length == 7) {
                g6Var2.t("4K", TextUtils.isEmpty(g6Var2.i), true);
            } else {
                g6Var2.t("" + iArr[length], TextUtils.isEmpty(g6Var2.i), true);
            }
        }
        setClickable(!this.f);
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.hs.e4, 31);
        float B = com.google.android.recaptcha.internal.a.B(this.h.d(this.f), 0.35f, 1.0f, 255.0f);
        int i3 = (int) B;
        Paint paint = this.c;
        paint.setAlpha(i3);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.33f));
        float N = org.telegram.messenger.g0.N(21.33f);
        float N2 = org.telegram.messenger.g0.N(6.0f);
        g6 g6Var = this.a;
        float max = Math.max(N, g6Var.c() + N2);
        float N3 = org.telegram.messenger.g0.N(17.33f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - N3) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + N3) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(4.0f), paint);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set(0, (int) ((getHeight() - N3) / 2.0f), getWidth(), (int) ((getHeight() + N3) / 2.0f));
        g6Var.setBounds(rect);
        g6Var.B = i3;
        g6Var.draw(canvas);
        g6 g6Var2 = this.b;
        rect.set((int) ((org.telegram.messenger.g0.N(16.0f) + (getWidth() / 2.0f)) - (g6Var2.c() + (org.telegram.messenger.g0.N(2.0f) * g6Var2.i()))), (int) ((getHeight() / 2.0f) - org.telegram.messenger.g0.N(14.0f)), (int) (org.telegram.messenger.g0.N(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - org.telegram.messenger.g0.N(14.0f)) + org.telegram.messenger.g0.N(8.33f)));
        rectF.set(rect);
        rectF.inset(-org.telegram.messenger.g0.N(1.33f), -org.telegram.messenger.g0.N(1.33f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.66f), org.telegram.messenger.g0.N(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.hs.e4, 31);
        rectF.set(rect);
        int i10 = (int) (g6Var2.i() * B);
        Paint paint2 = this.d;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.66f), org.telegram.messenger.g0.N(1.66f), paint2);
        rect.offset((int) (-org.telegram.messenger.g0.N(1.33f)), 0);
        canvas.save();
        g6Var2.setBounds(rect);
        g6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z10) {
        this.f = false;
        this.a.t(z10 ? "HD" : "SD", true, true);
        this.b.t("", false, true);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || this.b == drawable || super.verifyDrawable(drawable);
    }
}
