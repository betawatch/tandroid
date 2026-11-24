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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iac extends View {
    public final gn a;
    public final gn b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public final lm h;
    public final int[] n;

    public iac(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        s33 s33Var = s33.h;
        this.h = new lm(this, 0L, 300L, s33Var);
        this.n = new int[]{kk7.Z1, kk7.O3, 360, 480, 720, 1080, 1440, 2160};
        gn gnVar = new gn(true, false, false);
        this.a = gnVar;
        gnVar.n(0.4f, 360L, s33Var);
        gnVar.x(gl.n1("fonts/num.otf"));
        gnVar.u(-1);
        gnVar.w(gl.N(10.6f));
        gnVar.setCallback(this);
        gnVar.b = 17;
        gn gnVar2 = new gn(true, false, false);
        this.b = gnVar2;
        gnVar2.n(0.2f, 360L, s33Var);
        gnVar2.x(gl.n1("fonts/num.otf"));
        gnVar2.u(-1);
        gnVar2.w(gl.N(8.6f));
        gnVar2.setCallback(this);
        gnVar2.b = 5;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        gnVar2.a.setXfermode(new PorterDuffXfermode(mode));
        gnVar2.N = gl.q.x;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(int i, boolean z, boolean z2) {
        this.f = !z || z2;
        gn gnVar = this.b;
        gn gnVar2 = this.a;
        if (z2) {
            gnVar2.t("GIF", true, true);
            gnVar.t("", true, true);
        } else {
            gnVar2.t(i >= 720 ? "HD" : "SD", true, true);
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
                gnVar.t("", true, true);
            } else if (length == 6) {
                gnVar.t("2K", TextUtils.isEmpty(gnVar.i), true);
            } else if (length == 7) {
                gnVar.t("4K", TextUtils.isEmpty(gnVar.i), true);
            } else {
                gnVar.t(String.valueOf(iArr[length]), TextUtils.isEmpty(gnVar.i), true);
            }
        }
        setClickable(!this.f);
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
        float B = yjb.B(this.h.d(this.f), 0.35f, 1.0f, 255.0f);
        int i = (int) B;
        Paint paint = this.c;
        paint.setAlpha(i);
        paint.setStrokeWidth(gl.N(1.33f));
        float N = gl.N(21.33f);
        float N2 = gl.N(6.0f);
        gn gnVar = this.a;
        float max = Math.max(N, gnVar.c() + N2);
        float N3 = gl.N(17.33f);
        RectF rectF = gl.P;
        rectF.set((getWidth() - max) / 2.0f, (getHeight() - N3) / 2.0f, (getWidth() + max) / 2.0f, (getHeight() + N3) / 2.0f);
        canvas.drawRoundRect(rectF, gl.N(4.0f), gl.N(4.0f), paint);
        Rect rect = gl.Q;
        rect.set(0, (int) ((getHeight() - N3) / 2.0f), getWidth(), (int) ((getHeight() + N3) / 2.0f));
        gnVar.setBounds(rect);
        gnVar.C = i;
        gnVar.draw(canvas);
        gn gnVar2 = this.b;
        rect.set((int) ((gl.N(16.0f) + (getWidth() / 2.0f)) - (gnVar2.c() + (gl.N(2.0f) * gnVar2.i()))), (int) ((getHeight() / 2.0f) - gl.N(14.0f)), (int) (gl.N(16.0f) + (getWidth() / 2.0f)), (int) (((getHeight() / 2.0f) - gl.N(14.0f)) + gl.N(8.33f)));
        rectF.set(rect);
        rectF.inset(-gl.N(1.33f), -gl.N(1.33f));
        canvas.drawRoundRect(rectF, gl.N(1.66f), gl.N(1.66f), this.e);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
        rectF.set(rect);
        int i2 = (int) (gnVar2.i() * B);
        Paint paint2 = this.d;
        paint2.setAlpha(i2);
        canvas.drawRoundRect(rectF, gl.N(1.66f), gl.N(1.66f), paint2);
        rect.offset((int) (-gl.N(1.33f)), 0);
        canvas.save();
        gnVar2.setBounds(rect);
        gnVar2.draw(canvas);
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
