// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.text.TextUtils;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class kl extends k66 implements s84 {
    public final t84 Q0;
    public Picture R0;
    public float S0;
    public int T0;
    public Paint U0;

    public kl(Context context) {
        super(context);
        this.Q0 = new t84(0, this, k43.h, 320L, 1.0f);
        this.T0 = 0;
    }

    @Override // android.view.View
    public int getLayerType() {
        return this.T0;
    }

    public final void n(Canvas canvas, float f, float f2) {
        if (f >= 1.0f && f2 == 0.0f) {
            super.onDraw(canvas);
            return;
        }
        canvas.save();
        canvas.translate(0.0f, f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f * 255.0f));
        super.onDraw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public final boolean o(CharSequence charSequence, boolean z) {
        CharSequence text = getText();
        if (TextUtils.equals(text, charSequence)) {
            return l(charSequence, false);
        }
        t84 t84Var = this.Q0;
        if (!z || !isAttachedToWindow() || !isLaidOut() || getVisibility() != 0 || getAlpha() <= 0.0f || getWidth() <= 0 || getHeight() <= 0 || TextUtils.isEmpty(text)) {
            t84Var.c(1.0f);
            if (this.R0 != null) {
                this.R0 = null;
                super.setLayerType(this.T0, this.U0);
            }
            invalidate();
        } else {
            Picture picture = new Picture();
            n(picture.beginRecording(getWidth(), getHeight()), 1.0f, 0.0f);
            picture.endRecording();
            t84Var.c(0.0f);
            this.R0 = picture;
            this.S0 = getTranslationX();
            super.setLayerType(0, null);
            t84Var.a(1.0f);
        }
        invalidate();
        return l(charSequence, false);
    }

    @Override // k66, ema, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.R0 == null) {
            super.onDraw(canvas);
            return;
        }
        float f = this.Q0.f;
        int L = hl.L(6.0f);
        canvas.save();
        canvas.translate(this.S0 - getTranslationX(), (-L) * f);
        float f2 = 1.0f - f;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.R0.getWidth(), this.R0.getHeight(), (int) (255.0f * f2));
        canvas.drawPicture(this.R0);
        canvas.restore();
        canvas.restore();
        n(canvas, f, L * f2);
    }

    @Override // android.view.View
    public final void setLayerType(int i, Paint paint) {
        this.T0 = i;
        this.U0 = paint;
        if (this.R0 == null) {
            super.setLayerType(i, paint);
        }
    }

    @Override // s84
    public final void v0(float f, int i) {
        if (f == 1.0f) {
            if (this.R0 != null) {
                this.R0 = null;
                super.setLayerType(this.T0, this.U0);
            }
            invalidate();
        }
    }
}
