package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g2 extends i {
    public final /* synthetic */ int n;
    public RectF r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(j jVar, Context context, int i10) {
        super(jVar, context);
        this.n = i10;
    }

    @Override // jg.i
    public final int a(float f7, float f10) {
        switch (this.n) {
            case 0:
                float L = org.telegram.messenger.i0.L(1.0f);
                float L2 = org.telegram.messenger.i0.L(19.5f);
                float f11 = L + L2;
                float f12 = f11 * 2.0f;
                float B = c3.i0.B(getMeasuredHeight(), f12, 2.0f, f11);
                if (f7 <= f11 - L2 || f10 <= B - L2 || f7 >= f11 + L2 || f10 >= B + L2) {
                    if (f7 <= ((getMeasuredWidth() - f12) + f11) - L2 || f10 <= B - L2 || f7 >= (getMeasuredWidth() - f12) + f11 + L2 || f10 >= B + L2) {
                        if (Math.pow(f10 - r0, 2.0d) + Math.pow(f7 - r0, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
            case 1:
                float L3 = org.telegram.messenger.i0.L(1.0f);
                float L4 = org.telegram.messenger.i0.L(19.5f);
                float f13 = L3 + L4;
                float f14 = f13 * 2.0f;
                float B2 = c3.i0.B(getMeasuredHeight(), f14, 2.0f, f13);
                if (f7 <= f13 - L4 || f10 <= B2 - L4 || f7 >= f13 + L4 || f10 >= B2 + L4) {
                    if (f7 <= ((getMeasuredWidth() - f14) + f13) - L4 || f10 <= B2 - L4 || f7 >= (getMeasuredWidth() - f14) + f13 + L4 || f10 >= B2 + L4) {
                        if (Math.pow(f10 - r0, 2.0d) + Math.pow(f7 - r0, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
            default:
                float L5 = org.telegram.messenger.i0.L(1.0f);
                float L6 = org.telegram.messenger.i0.L(19.5f);
                float f15 = L5 + L6;
                float f16 = f15 * 2.0f;
                float B3 = c3.i0.B(getMeasuredHeight(), f16, 2.0f, f15);
                if (f7 <= f15 - L6 || f10 <= B3 - L6 || f7 >= f15 + L6 || f10 >= B3 + L6) {
                    if (f7 <= ((getMeasuredWidth() - f16) + f15) - L6 || f10 <= B3 - L6 || f7 >= (getMeasuredWidth() - f16) + f15 + L6 || f10 >= B3 + L6) {
                        if (Math.pow(f10 - r0, 2.0d) + Math.pow(f7 - r0, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
        }
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.n) {
            case 0:
                RectF rectF = this.r;
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float L = org.telegram.messenger.i0.L(1.0f);
                    float N = org.telegram.messenger.i0.N(5.66f);
                    float L2 = L + N + org.telegram.messenger.i0.L(15.0f);
                    float measuredWidth = (getMeasuredWidth() / 2) - L2;
                    float f7 = (2.0f * measuredWidth) + L2;
                    rectF.set(L2, L2, f7, f7);
                    Paint paint = this.a;
                    canvas.drawArc(rectF, 0.0f, 180.0f, false, paint);
                    canvas.drawArc(rectF, 180.0f, 180.0f, false, paint);
                    float f10 = measuredWidth + L2;
                    Paint paint2 = this.c;
                    canvas.drawCircle(L2, f10, N, paint2);
                    Paint paint3 = this.b;
                    canvas.drawCircle(L2, f10, N - org.telegram.messenger.i0.L(1.0f), paint3);
                    canvas.drawCircle(f7, f10, N, paint2);
                    canvas.drawCircle(f7, f10, N - org.telegram.messenger.i0.L(1.0f), paint3);
                    canvas.restoreToCount(saveCount);
                    break;
                }
                break;
            case 1:
                RectF rectF2 = this.r;
                super.onDraw(canvas);
                int saveCount2 = canvas.getSaveCount();
                float showAlpha2 = getShowAlpha();
                if (showAlpha2 > 0.0f) {
                    if (showAlpha2 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                    }
                    float L3 = org.telegram.messenger.i0.L(1.0f);
                    float N2 = org.telegram.messenger.i0.N(5.66f);
                    float L4 = L3 + N2 + org.telegram.messenger.i0.L(15.0f);
                    float measuredWidth2 = (getMeasuredWidth() / 2.0f) - L4;
                    float f11 = (2.0f * measuredWidth2) + L4;
                    rectF2.set(L4, L4, f11, f11);
                    Paint paint4 = this.a;
                    canvas.drawArc(rectF2, 0.0f, 180.0f, false, paint4);
                    canvas.drawArc(rectF2, 180.0f, 180.0f, false, paint4);
                    float f12 = measuredWidth2 + L4;
                    Paint paint5 = this.c;
                    canvas.drawCircle(L4, f12, N2, paint5);
                    Paint paint6 = this.b;
                    canvas.drawCircle(L4, f12, N2 - org.telegram.messenger.i0.L(1.0f), paint6);
                    canvas.drawCircle(f11, f12, N2, paint5);
                    canvas.drawCircle(f11, f12, N2 - org.telegram.messenger.i0.L(1.0f), paint6);
                    canvas.restoreToCount(saveCount2);
                    break;
                }
                break;
            default:
                RectF rectF3 = this.r;
                super.onDraw(canvas);
                int saveCount3 = canvas.getSaveCount();
                float showAlpha3 = getShowAlpha();
                if (showAlpha3 > 0.0f) {
                    if (showAlpha3 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                    }
                    float L5 = org.telegram.messenger.i0.L(1.0f);
                    float N3 = org.telegram.messenger.i0.N(5.66f);
                    float L6 = L5 + N3 + org.telegram.messenger.i0.L(15.0f);
                    float measuredWidth3 = (getMeasuredWidth() / 2) - L6;
                    float f13 = (2.0f * measuredWidth3) + L6;
                    rectF3.set(L6, L6, f13, f13);
                    Paint paint7 = this.a;
                    canvas.drawArc(rectF3, 0.0f, 180.0f, false, paint7);
                    canvas.drawArc(rectF3, 180.0f, 180.0f, false, paint7);
                    float f14 = measuredWidth3 + L6;
                    Paint paint8 = this.c;
                    canvas.drawCircle(L6, f14, N3, paint8);
                    Paint paint9 = this.b;
                    canvas.drawCircle(L6, f14, N3 - org.telegram.messenger.i0.L(1.0f), paint9);
                    canvas.drawCircle(f13, f14, N3, paint8);
                    canvas.drawCircle(f13, f14, N3 - org.telegram.messenger.i0.L(1.0f), paint9);
                    canvas.restoreToCount(saveCount3);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(i2 i2Var, Context context) {
        super(i2Var, context);
        this.n = 1;
        this.r = new RectF();
    }
}
