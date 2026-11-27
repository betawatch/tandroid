// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class iec extends View {
    public final hn a;
    public final hn b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public final mm h;
    public final int[] n;

    public iec(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        k43 k43Var = k43.h;
        this.h = new mm(this, 0L, 300L, k43Var);
        this.n = new int[]{jn7.Z1, jn7.O3, 360, 480, 720, 1080, 1440, 2160};
        hn hnVar = new hn(true, false, false);
        this.a = hnVar;
        hnVar.n(0.4f, 360L, k43Var);
        hnVar.x(hl.n1("fonts/num.otf"));
        hnVar.u(-1);
        hnVar.w(hl.N(10.6f));
        hnVar.setCallback(this);
        hnVar.b = 17;
        hn hnVar2 = new hn(true, false, false);
        this.b = hnVar2;
        hnVar2.n(0.2f, 360L, k43Var);
        hnVar2.x(hl.n1("fonts/num.otf"));
        hnVar2.u(-1);
        hnVar2.w(hl.N(8.6f));
        hnVar2.setCallback(this);
        hnVar2.b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        hnVar2.a.setXfermode(new PorterDuffXfermode(mode));
        hnVar2.N = hl.q.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i, boolean z, boolean z2) {
        this.f = !z || z2;
        hn hnVar = this.b;
        hn hnVar2 = this.a;
        if (z2) {
            hnVar2.t("GIF", true, true);
            hnVar.t("", true, true);
        } else {
            hnVar2.t(i >= 720 ? "HD" : "SD", true, true);
            int[] iArr = this.n;
            int length = iArr.length - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                } else if (i >= iArr[length]) {
                    break;
                } else {
                    length--;
                }
            }
            if (length < 0) {
                hnVar.t("", true, true);
            } else if (length == 6) {
                hnVar.t("2K", TextUtils.isEmpty(hnVar.i), true);
            } else if (length == 7) {
                hnVar.t("4K", TextUtils.isEmpty(hnVar.i), true);
            } else {
                hnVar.t(String.valueOf(iArr[length]), TextUtils.isEmpty(hnVar.i), true);
            }
        }
        setClickable(!this.f);
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.d4, 31);
        float B = xnb.B(this.h.d(this.f), 0.35f, 1.0f, 255.0f);
        int i = (int) B;
        Paint paint = this.c;
        paint.setAlpha(i);
        paint.setStrokeWidth(hl.N(1.33f));
        float N = hl.N(21.33f);
        float N2 = hl.N(6.0f);
        hn hnVar = this.a;
        float max = Math.max(N, hnVar.c() + N2);
        float N3 = hl.N(17.33f);
        RectF rectF = hl.P;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - N3) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + N3) / 2.0f);
        canvas.drawRoundRect(rectF, hl.N(4.0f), hl.N(4.0f), paint);
        Rect rect = hl.Q;
        rect.set(0, (int) ((getHeight() - N3) / 2.0f), getWidth(), (int) ((getHeight() + N3) / 2.0f));
        hnVar.setBounds(rect);
        hnVar.C = i;
        hnVar.draw(canvas);
        hn hnVar2 = this.b;
        rect.set((int) ((hl.N(16.0f) + (getWidth() / 2.0f)) - (hnVar2.c() + (hl.N(2.0f) * hnVar2.i()))), (int) ((getHeight() / 2.0f) - hl.N(14.0f)), (int) (hl.N(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - hl.N(14.0f)) + hl.N(8.33f)));
        rectF.set(rect);
        rectF.inset(-hl.N(1.33f), -hl.N(1.33f));
        canvas.drawRoundRect(rectF, hl.N(1.66f), hl.N(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.d4, 31);
        rectF.set(rect);
        int i2 = (int) (hnVar2.i() * B);
        Paint paint2 = this.d;
        paint2.setAlpha(i2);
        canvas.drawRoundRect(rectF, hl.N(1.66f), hl.N(1.66f), paint2);
        rect.offset((int) (-hl.N(1.33f)), 0);
        canvas.save();
        hnVar2.setBounds(rect);
        hnVar2.draw(canvas);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public void setPhotoState(boolean z) {
        this.f = false;
        this.a.t(z ? "HD" : "SD", true, true);
        this.b.t("", false, true);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || this.b == drawable || super.verifyDrawable(drawable);
    }
}
