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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y51 extends View {
    public final i6 a;
    public final i6 b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public final y5 h;
    public final int[] n;

    public y51(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        er erVar = er.h;
        this.h = new y5(this, 0L, 300L, erVar);
        this.n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        i6 i6Var = new i6(true, false, false, false);
        this.a = i6Var;
        i6Var.k(0.4f, 360L, erVar);
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dpf2(10.6f));
        i6Var.setCallback(this);
        i6Var.b = 17;
        i6 i6Var2 = new i6(true, false, false, false);
        this.b = i6Var2;
        i6Var2.k(0.2f, 360L, erVar);
        i6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var2.r(-1);
        i6Var2.t(AndroidUtilities.dpf2(8.6f));
        i6Var2.setCallback(this);
        i6Var2.b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        i6Var2.a.setXfermode(new PorterDuffXfermode(mode));
        i6Var2.G = AndroidUtilities.displaySize.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i10, boolean z10, boolean z11) {
        this.f = !z10 || z11;
        i6 i6Var = this.a;
        i6 i6Var2 = this.b;
        if (z11) {
            i6Var.q("GIF", true, true);
            i6Var2.q("", true, true);
        } else {
            i6Var.q(i10 >= 720 ? "HD" : "SD", true, true);
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
                i6Var2.q("", true, true);
            } else if (length == 6) {
                i6Var2.q("2K", TextUtils.isEmpty(i6Var2.g), true);
            } else if (length == 7) {
                i6Var2.q("4K", TextUtils.isEmpty(i6Var2.g), true);
            } else {
                i6Var2.q("" + iArr[length], TextUtils.isEmpty(i6Var2.g), true);
            }
        }
        setClickable(!this.f);
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float e9 = (1.0f - (this.h.e(this.f) * 0.35f)) * 255.0f;
        int i10 = (int) e9;
        Paint paint = this.c;
        paint.setAlpha(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float dpf2 = AndroidUtilities.dpf2(21.33f);
        float dpf22 = AndroidUtilities.dpf2(6.0f);
        i6 i6Var = this.a;
        float max = Math.max(dpf2, i6Var.d() + dpf22);
        float dpf23 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - dpf23) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + dpf23) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), paint);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - dpf23) / 2.0f), getWidth(), (int) ((getHeight() + dpf23) / 2.0f));
        i6Var.setBounds(rect);
        i6Var.w = i10;
        i6Var.draw(canvas);
        i6 i6Var2 = this.b;
        rect.set((int) ((AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)) - (i6Var2.d() + (AndroidUtilities.dpf2(2.0f) * i6Var2.g()))), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) (AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + AndroidUtilities.dpf2(8.33f)));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        int g10 = (int) (i6Var2.g() * e9);
        Paint paint2 = this.d;
        paint2.setAlpha(g10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), paint2);
        rect.offset((int) (-AndroidUtilities.dpf2(1.33f)), 0);
        canvas.save();
        i6Var2.setBounds(rect);
        i6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z10) {
        this.f = false;
        this.a.q(z10 ? "HD" : "SD", true, true);
        this.b.q("", false, true);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || this.b == drawable || super.verifyDrawable(drawable);
    }
}
