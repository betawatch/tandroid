package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ja1 extends FrameLayout {
    public final /* synthetic */ int a;
    public float b;
    public boolean c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja1(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float f7 = ((1.0f - this.b) * 0.2f) + 0.8f;
                canvas.save();
                canvas.scale(f7, f7, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (isPressed()) {
                    float f10 = this.b;
                    if (f10 != 1.0f) {
                        this.b = Utilities.i(f10 + 0.16f, 1.0f, 0.0f);
                        invalidate();
                        break;
                    }
                }
                break;
            default:
                super.dispatchDraw(canvas);
                if (this.c) {
                    float f11 = this.b + 0.013333334f;
                    this.b = f11;
                    if (f11 > 1.0f) {
                        this.c = false;
                        this.b = 1.0f;
                    }
                } else {
                    float f12 = this.b - 0.013333334f;
                    this.b = f12;
                    if (f12 < 0.0f) {
                        this.c = true;
                        this.b = 0.0f;
                    }
                }
                ((TextView) this.d).setTranslationX(org.telegram.ui.Components.gr.f.getInterpolation(this.b) * org.telegram.messenger.i0.L(8.0f) * (org.telegram.messenger.cd.X ? -1 : 1));
                invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        switch (this.a) {
            case 0:
                super.setPressed(z10);
                if (this.c != z10) {
                    this.c = z10;
                    invalidate();
                    if (z10 && (valueAnimator = (ValueAnimator) this.d) != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) this.d).cancel();
                    }
                    if (!z10) {
                        float f7 = this.b;
                        if (f7 != 0.0f) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                            this.d = ofFloat;
                            ofFloat.addUpdateListener(new u01(this, 12));
                            ((ValueAnimator) this.d).addListener(new ns0(this, 11));
                            org.telegram.messenger.z20.j(5.0f, (ValueAnimator) this.d);
                            ((ValueAnimator) this.d).setDuration(350L);
                            ((ValueAnimator) this.d).start();
                            break;
                        }
                    }
                }
                break;
            default:
                super.setPressed(z10);
                break;
        }
    }
}
