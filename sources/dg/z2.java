package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z2 extends i {
    public final /* synthetic */ int n;
    public RectF r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(j jVar, Context context, int i10) {
        super(jVar, context);
        this.n = i10;
    }

    @Override // dg.i
    public final int a(float f10, float f11) {
        switch (this.n) {
            case 0:
                float dp = AndroidUtilities.dp(1.0f);
                float dp2 = AndroidUtilities.dp(19.5f);
                float f12 = dp + dp2;
                float f13 = f12 * 2.0f;
                float x10 = e2.c.x(getMeasuredHeight(), f13, 2.0f, f12);
                if (f10 <= f12 - dp2 || f11 <= x10 - dp2 || f10 >= f12 + dp2 || f11 >= x10 + dp2) {
                    if (f10 <= ((getMeasuredWidth() - f13) + f12) - dp2 || f11 <= x10 - dp2 || f10 >= (getMeasuredWidth() - f13) + f12 + dp2 || f11 >= x10 + dp2) {
                        if (Math.pow(f11 - r0, 2.0d) + Math.pow(f10 - r0, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
            case 1:
                float dp3 = AndroidUtilities.dp(1.0f);
                float dp4 = AndroidUtilities.dp(19.5f);
                float f14 = dp3 + dp4;
                float f15 = f14 * 2.0f;
                float x11 = e2.c.x(getMeasuredHeight(), f15, 2.0f, f14);
                if (f10 <= f14 - dp4 || f11 <= x11 - dp4 || f10 >= f14 + dp4 || f11 >= x11 + dp4) {
                    if (f10 <= ((getMeasuredWidth() - f15) + f14) - dp4 || f11 <= x11 - dp4 || f10 >= (getMeasuredWidth() - f15) + f14 + dp4 || f11 >= x11 + dp4) {
                        if (Math.pow(f11 - r0, 2.0d) + Math.pow(f10 - r0, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
            default:
                float dp5 = AndroidUtilities.dp(1.0f);
                float dp6 = AndroidUtilities.dp(19.5f);
                float f16 = dp5 + dp6;
                float f17 = f16 * 2.0f;
                float x12 = e2.c.x(getMeasuredHeight(), f17, 2.0f, f16);
                if (f10 <= f16 - dp6 || f11 <= x12 - dp6 || f10 >= f16 + dp6 || f11 >= x12 + dp6) {
                    if (f10 <= ((getMeasuredWidth() - f17) + f16) - dp6 || f11 <= x12 - dp6 || f10 >= (getMeasuredWidth() - f17) + f16 + dp6 || f11 >= x12 + dp6) {
                        if (Math.pow(f11 - r0, 2.0d) + Math.pow(f10 - r0, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
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
                    float dp = AndroidUtilities.dp(1.0f);
                    float dpf2 = AndroidUtilities.dpf2(5.66f);
                    float dp2 = dp + dpf2 + AndroidUtilities.dp(15.0f);
                    float measuredWidth = (getMeasuredWidth() / 2) - dp2;
                    float f10 = (2.0f * measuredWidth) + dp2;
                    rectF.set(dp2, dp2, f10, f10);
                    Paint paint = this.a;
                    canvas.drawArc(rectF, 0.0f, 180.0f, false, paint);
                    canvas.drawArc(rectF, 180.0f, 180.0f, false, paint);
                    float f11 = measuredWidth + dp2;
                    Paint paint2 = this.c;
                    canvas.drawCircle(dp2, f11, dpf2, paint2);
                    Paint paint3 = this.b;
                    canvas.drawCircle(dp2, f11, dpf2 - AndroidUtilities.dp(1.0f), paint3);
                    canvas.drawCircle(f10, f11, dpf2, paint2);
                    canvas.drawCircle(f10, f11, dpf2 - AndroidUtilities.dp(1.0f), paint3);
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
                    float dp3 = AndroidUtilities.dp(1.0f);
                    float dpf22 = AndroidUtilities.dpf2(5.66f);
                    float dp4 = dp3 + dpf22 + AndroidUtilities.dp(15.0f);
                    float measuredWidth2 = (getMeasuredWidth() / 2.0f) - dp4;
                    float f12 = (2.0f * measuredWidth2) + dp4;
                    rectF2.set(dp4, dp4, f12, f12);
                    Paint paint4 = this.a;
                    canvas.drawArc(rectF2, 0.0f, 180.0f, false, paint4);
                    canvas.drawArc(rectF2, 180.0f, 180.0f, false, paint4);
                    float f13 = measuredWidth2 + dp4;
                    Paint paint5 = this.c;
                    canvas.drawCircle(dp4, f13, dpf22, paint5);
                    Paint paint6 = this.b;
                    canvas.drawCircle(dp4, f13, dpf22 - AndroidUtilities.dp(1.0f), paint6);
                    canvas.drawCircle(f12, f13, dpf22, paint5);
                    canvas.drawCircle(f12, f13, dpf22 - AndroidUtilities.dp(1.0f), paint6);
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
                    float dp5 = AndroidUtilities.dp(1.0f);
                    float dpf23 = AndroidUtilities.dpf2(5.66f);
                    float dp6 = dp5 + dpf23 + AndroidUtilities.dp(15.0f);
                    float measuredWidth3 = (getMeasuredWidth() / 2) - dp6;
                    float f14 = (2.0f * measuredWidth3) + dp6;
                    rectF3.set(dp6, dp6, f14, f14);
                    Paint paint7 = this.a;
                    canvas.drawArc(rectF3, 0.0f, 180.0f, false, paint7);
                    canvas.drawArc(rectF3, 180.0f, 180.0f, false, paint7);
                    float f15 = measuredWidth3 + dp6;
                    Paint paint8 = this.c;
                    canvas.drawCircle(dp6, f15, dpf23, paint8);
                    Paint paint9 = this.b;
                    canvas.drawCircle(dp6, f15, dpf23 - AndroidUtilities.dp(1.0f), paint9);
                    canvas.drawCircle(f14, f15, dpf23, paint8);
                    canvas.drawCircle(f14, f15, dpf23 - AndroidUtilities.dp(1.0f), paint9);
                    canvas.restoreToCount(saveCount3);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(b3 b3Var, Context context) {
        super(b3Var, context);
        this.n = 1;
        this.r = new RectF();
    }
}
