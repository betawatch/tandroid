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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u61 extends View {
    public final j6 a;
    public final j6 b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public final z5 h;
    public final int[] n;

    public u61(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        mr mrVar = mr.h;
        this.h = new z5(this, 0L, 300L, mrVar);
        this.n = new int[]{144, 240, 360, 480, 720, 1080, 1440, 2160};
        j6 j6Var = new j6(true, false, false, false);
        this.a = j6Var;
        j6Var.k(0.4f, 360L, mrVar);
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.r(-1);
        j6Var.t(AndroidUtilities.dpf2(10.6f));
        j6Var.setCallback(this);
        j6Var.b = 17;
        j6 j6Var2 = new j6(true, false, false, false);
        this.b = j6Var2;
        j6Var2.k(0.2f, 360L, mrVar);
        j6Var2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var2.r(-1);
        j6Var2.t(AndroidUtilities.dpf2(8.6f));
        j6Var2.setCallback(this);
        j6Var2.b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        j6Var2.a.setXfermode(new PorterDuffXfermode(mode));
        j6Var2.G = AndroidUtilities.displaySize.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i10, boolean z4, boolean z10) {
        this.f = !z4 || z10;
        j6 j6Var = this.a;
        j6 j6Var2 = this.b;
        if (z10) {
            j6Var.q("GIF", true, true);
            j6Var2.q("", true, true);
        } else {
            j6Var.q(i10 >= 720 ? "HD" : "SD", true, true);
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
                j6Var2.q("", true, true);
            } else if (length == 6) {
                j6Var2.q("2K", TextUtils.isEmpty(j6Var2.g), true);
            } else if (length == 7) {
                j6Var2.q("4K", TextUtils.isEmpty(j6Var2.g), true);
            } else {
                j6Var2.q("" + iArr[length], TextUtils.isEmpty(j6Var2.g), true);
            }
        }
        setClickable(!this.f);
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float e = (1.0f - (this.h.e(this.f) * 0.35f)) * 255.0f;
        int i10 = (int) e;
        Paint paint = this.c;
        paint.setAlpha(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
        float dpf2 = AndroidUtilities.dpf2(21.33f);
        float dpf22 = AndroidUtilities.dpf2(6.0f);
        j6 j6Var = this.a;
        float max = Math.max(dpf2, j6Var.d() + dpf22);
        float dpf23 = AndroidUtilities.dpf2(17.33f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - dpf23) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + dpf23) / 2.0f);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), paint);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, (int) ((getHeight() - dpf23) / 2.0f), getWidth(), (int) ((getHeight() + dpf23) / 2.0f));
        j6Var.setBounds(rect);
        j6Var.w = i10;
        j6Var.draw(canvas);
        j6 j6Var2 = this.b;
        rect.set((int) ((AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)) - (j6Var2.d() + (AndroidUtilities.dpf2(2.0f) * j6Var2.g()))), (int) ((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)), (int) (AndroidUtilities.dpf2(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - AndroidUtilities.dpf2(14.0f)) + AndroidUtilities.dpf2(8.33f)));
        rectF.set(rect);
        rectF.inset(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(1.33f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        rectF.set(rect);
        int g10 = (int) (j6Var2.g() * e);
        Paint paint2 = this.d;
        paint2.setAlpha(g10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.66f), AndroidUtilities.dpf2(1.66f), paint2);
        rect.offset((int) (-AndroidUtilities.dpf2(1.33f)), 0);
        canvas.save();
        j6Var2.setBounds(rect);
        j6Var2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z4) {
        this.f = false;
        this.a.q(z4 ? "HD" : "SD", true, true);
        this.b.q("", false, true);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || this.b == drawable || super.verifyDrawable(drawable);
    }
}
