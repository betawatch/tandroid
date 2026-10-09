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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x71 extends View {
    public final q6 a;
    public final q6 b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public final g6 h;
    public final int[] n;

    public x71(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        hs hsVar = hs.h;
        this.h = new g6(this, 0L, 300L, hsVar);
        this.n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        q6 q6Var = new q6(true, false, false);
        this.a = q6Var;
        q6Var.n(0.4f, 360L, hsVar);
        q6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        q6Var.u(-1);
        q6Var.w(AndroidUtilities.dpf2(10.6f));
        q6Var.setCallback(this);
        q6Var.b = 17;
        q6 q6Var2 = new q6(true, false, false);
        this.b = q6Var2;
        q6Var2.n(0.2f, 360L, hsVar);
        q6Var2.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        q6Var2.u(-1);
        q6Var2.w(AndroidUtilities.dpf2(8.6f));
        q6Var2.setCallback(this);
        q6Var2.b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        q6Var2.a.setXfermode(new PorterDuffXfermode(mode));
        q6Var2.M = AndroidUtilities.displaySize.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i10, boolean z10, boolean z11) {
        this.f = !z10 || z11;
        q6 q6Var = this.a;
        q6 q6Var2 = this.b;
        if (z11) {
            q6Var.t("GIF", true, true);
            q6Var2.t("", true, true);
        } else {
            q6Var.t(i10 >= 720 ? "HD" : "SD", true, true);
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
                q6Var2.t("", true, true);
            } else if (length == 6) {
                q6Var2.t("2K", TextUtils.isEmpty(q6Var2.i), true);
            } else if (length == 7) {
                q6Var2.t("4K", TextUtils.isEmpty(q6Var2.i), true);
            } else {
                q6Var2.t("" + iArr[length], TextUtils.isEmpty(q6Var2.i), true);
            }
        }
        setClickable(!this.f);
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float B = com.google.android.gms.internal.vision.e2.B(this.h.e(this.f), 0.35f, 1.0f, 255.0f);
        int i10 = (int) B;
        Paint paint = this.c;
        paint.setAlpha(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float dpf2 = AndroidUtilities.dpf2(21.33f);
        float dpf22 = AndroidUtilities.dpf2(6.0f);
        q6 q6Var = this.a;
        float max = Math.max(dpf2, q6Var.c() + dpf22);
        float dpf23 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - dpf23) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + dpf23) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), paint);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - dpf23) / 2.0f), getWidth(), (int) ((getHeight() + dpf23) / 2.0f));
        q6Var.setBounds(rect);
        q6Var.B = i10;
        q6Var.draw(canvas);
        q6 q6Var2 = this.b;
        rect.set((int) ((AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)) - (q6Var2.c() + (AndroidUtilities.dpf2(2.0f) * q6Var2.i()))), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) (AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + AndroidUtilities.dpf2(8.33f)));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        int i11 = (int) (q6Var2.i() * B);
        Paint paint2 = this.d;
        paint2.setAlpha(i11);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), paint2);
        rect.offset((int) (-AndroidUtilities.dpf2(1.33f)), 0);
        canvas.save();
        q6Var2.setBounds(rect);
        q6Var2.draw(canvas);
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
