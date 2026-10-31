package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class v4 extends l80 implements fe.e {
    public final fe.f P0;
    public Picture Q0;
    public float R0;
    public int S0;
    public Paint T0;

    public v4(Context context) {
        super(context);
        this.P0 = new fe.f(0, this, gr.h, 320L, 1.0f);
        this.S0 = 0;
    }

    @Override // fe.e
    public final void E(float f7, int i10) {
        if (f7 == 1.0f) {
            if (this.Q0 != null) {
                this.Q0 = null;
                super.setLayerType(this.S0, this.T0);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public int getLayerType() {
        return this.S0;
    }

    public final void n(Canvas canvas, float f7, float f10) {
        if (f7 >= 1.0f && f10 == 0.0f) {
            super.onDraw(canvas);
            return;
        }
        canvas.save();
        canvas.translate(0.0f, f10);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f7 * 255.0f));
        super.onDraw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public final boolean o(CharSequence charSequence, boolean z10) {
        CharSequence text = getText();
        if (TextUtils.equals(text, charSequence)) {
            return l(charSequence, false);
        }
        fe.f fVar = this.P0;
        if (!z10 || !isAttachedToWindow() || !isLaidOut() || getVisibility() != 0 || getAlpha() <= 0.0f || getWidth() <= 0 || getHeight() <= 0 || TextUtils.isEmpty(text)) {
            fVar.c(1.0f);
            if (this.Q0 != null) {
                this.Q0 = null;
                super.setLayerType(this.S0, this.T0);
            }
            invalidate();
        } else {
            Picture picture = new Picture();
            n(picture.beginRecording(getWidth(), getHeight()), 1.0f, 0.0f);
            picture.endRecording();
            fVar.c(0.0f);
            this.Q0 = picture;
            this.R0 = getTranslationX();
            super.setLayerType(0, null);
            fVar.a(1.0f);
        }
        invalidate();
        return l(charSequence, false);
    }

    @Override // org.telegram.ui.Components.l80, org.telegram.ui.ActionBar.u5, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.Q0 == null) {
            super.onDraw(canvas);
            return;
        }
        float f7 = this.P0.f;
        int L = org.telegram.messenger.i0.L(6.0f);
        canvas.save();
        canvas.translate(this.R0 - getTranslationX(), (-L) * f7);
        float f10 = 1.0f - f7;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.Q0.getWidth(), this.Q0.getHeight(), (int) (255.0f * f10));
        canvas.drawPicture(this.Q0);
        canvas.restore();
        canvas.restore();
        n(canvas, f7, L * f10);
    }

    @Override // android.view.View
    public final void setLayerType(int i10, Paint paint) {
        this.S0 = i10;
        this.T0 = paint;
        if (this.Q0 == null) {
            super.setLayerType(i10, paint);
        }
    }
}
