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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i61 extends View {
    public final e6 a;
    public final e6 b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public final t5 h;
    public final int[] n;

    public i61(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        gr grVar = gr.h;
        this.h = new t5(this, 0L, 300L, grVar);
        this.n = new int[]{org.telegram.messenger.zs.a2, org.telegram.messenger.zs.P3, 360, 480, 720, 1080, 1440, 2160};
        e6 e6Var = new e6(true, false, false);
        this.a = e6Var;
        e6Var.n(0.4f, 360L, grVar);
        e6Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var.u(-1);
        e6Var.w(org.telegram.messenger.i0.N(10.6f));
        e6Var.setCallback(this);
        e6Var.b = 17;
        e6 e6Var2 = new e6(true, false, false);
        this.b = e6Var2;
        e6Var2.n(0.2f, 360L, grVar);
        e6Var2.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var2.u(-1);
        e6Var2.w(org.telegram.messenger.i0.N(8.6f));
        e6Var2.setCallback(this);
        e6Var2.b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        e6Var2.a.setXfermode(new PorterDuffXfermode(mode));
        e6Var2.M = org.telegram.messenger.i0.q.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i10, boolean z10, boolean z11) {
        this.f = !z10 || z11;
        e6 e6Var = this.a;
        e6 e6Var2 = this.b;
        if (z11) {
            e6Var.t("GIF", true, true);
            e6Var2.t("", true, true);
        } else {
            e6Var.t(i10 >= 720 ? "HD" : "SD", true, true);
            int[] iArr = this.n;
            int length = iArr.length - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                } else if (i10 >= iArr[length]) {
                    break;
                } else {
                    length--;
                }
            }
            if (length < 0) {
                e6Var2.t("", true, true);
            } else if (length == 6) {
                e6Var2.t("2K", TextUtils.isEmpty(e6Var2.i), true);
            } else if (length == 7) {
                e6Var2.t("4K", TextUtils.isEmpty(e6Var2.i), true);
            } else {
                e6Var2.t("" + iArr[length], TextUtils.isEmpty(e6Var2.i), true);
            }
        }
        setClickable(!this.f);
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.zs.e4, 31);
        float D = c3.i0.D(this.h.d(this.f), 0.35f, 1.0f, 255.0f);
        int i10 = (int) D;
        Paint paint = this.c;
        paint.setAlpha(i10);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.33f));
        float N = org.telegram.messenger.i0.N(21.33f);
        float N2 = org.telegram.messenger.i0.N(6.0f);
        e6 e6Var = this.a;
        float max = Math.max(N, e6Var.c() + N2);
        float N3 = org.telegram.messenger.i0.N(17.33f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - N3) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + N3) / 2.0f);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(4.0f), org.telegram.messenger.i0.N(4.0f), paint);
        Rect rect = org.telegram.messenger.i0.Q;
        rect.set(0, (int) ((getHeight() - N3) / 2.0f), getWidth(), (int) ((getHeight() + N3) / 2.0f));
        e6Var.setBounds(rect);
        e6Var.B = i10;
        e6Var.draw(canvas);
        e6 e6Var2 = this.b;
        rect.set((int) ((org.telegram.messenger.i0.N(16.0f) + (getWidth() / 2.0f)) - (e6Var2.c() + (org.telegram.messenger.i0.N(2.0f) * e6Var2.i()))), (int) ((getHeight() / 2.0f) - org.telegram.messenger.i0.N(14.0f)), (int) (org.telegram.messenger.i0.N(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - org.telegram.messenger.i0.N(14.0f)) + org.telegram.messenger.i0.N(8.33f)));
        rectF.set(rect);
        rectF.inset(-org.telegram.messenger.i0.N(1.33f), -org.telegram.messenger.i0.N(1.33f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(1.66f), org.telegram.messenger.i0.N(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.zs.e4, 31);
        rectF.set(rect);
        int i11 = (int) (e6Var2.i() * D);
        Paint paint2 = this.d;
        paint2.setAlpha(i11);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(1.66f), org.telegram.messenger.i0.N(1.66f), paint2);
        rect.offset((int) (-org.telegram.messenger.i0.N(1.33f)), 0);
        canvas.save();
        e6Var2.setBounds(rect);
        e6Var2.draw(canvas);
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
