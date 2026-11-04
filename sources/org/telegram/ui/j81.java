package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j81 extends FrameLayout {
    public final /* synthetic */ int a;
    public float b;
    public boolean c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j81(Context context, int i3) {
        super(context);
        this.a = i3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float f10 = ((1.0f - this.b) * 0.2f) + 0.8f;
                canvas.save();
                canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (isPressed()) {
                    float f11 = this.b;
                    if (f11 != 1.0f) {
                        this.b = Utilities.i(f11 + 0.16f, 1.0f, 0.0f);
                        invalidate();
                        break;
                    }
                }
                break;
            default:
                super.dispatchDraw(canvas);
                if (this.c) {
                    float f12 = this.b + 0.013333334f;
                    this.b = f12;
                    if (f12 > 1.0f) {
                        this.c = false;
                        this.b = 1.0f;
                    }
                } else {
                    float f13 = this.b - 0.013333334f;
                    this.b = f13;
                    if (f13 < 0.0f) {
                        this.c = true;
                        this.b = 0.0f;
                    }
                }
                ((TextView) this.d).setTranslationX(org.telegram.ui.Components.xq.f.getInterpolation(this.b) * org.telegram.messenger.g0.L(8.0f) * (org.telegram.messenger.bd.a0 ? -1 : 1));
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
                        float f10 = this.b;
                        if (f10 != 0.0f) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                            this.d = ofFloat;
                            ofFloat.addUpdateListener(new xy0(this, 12));
                            ((ValueAnimator) this.d).addListener(new i81(this, 0));
                            org.telegram.messenger.camera.q.i(5.0f, (ValueAnimator) this.d);
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
