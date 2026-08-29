package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d3 extends j {
    public final /* synthetic */ int n;
    public RectF r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(k kVar, Context context, int i10) {
        super(kVar, context);
        this.n = i10;
    }

    @Override // bg.j
    public final int a(float f9, float f10) {
        switch (this.n) {
            case 0:
                float dp = AndroidUtilities.dp(1.0f);
                float dp2 = AndroidUtilities.dp(19.5f);
                float f11 = dp + dp2;
                float f12 = f11 * 2.0f;
                float A = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f12, 2.0f, f11);
                if (f9 <= f11 - dp2 || f10 <= A - dp2 || f9 >= f11 + dp2 || f10 >= A + dp2) {
                    if (f9 <= ((getMeasuredWidth() - f12) + f11) - dp2 || f10 <= A - dp2 || f9 >= (getMeasuredWidth() - f12) + f11 + dp2 || f10 >= A + dp2) {
                        if (Math.pow(f10 - r0, 2.0d) + Math.pow(f9 - r0, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
            case 1:
                float dp3 = AndroidUtilities.dp(1.0f);
                float dp4 = AndroidUtilities.dp(19.5f);
                float f13 = dp3 + dp4;
                float f14 = f13 * 2.0f;
                float A2 = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f14, 2.0f, f13);
                if (f9 <= f13 - dp4 || f10 <= A2 - dp4 || f9 >= f13 + dp4 || f10 >= A2 + dp4) {
                    if (f9 <= ((getMeasuredWidth() - f14) + f13) - dp4 || f10 <= A2 - dp4 || f9 >= (getMeasuredWidth() - f14) + f13 + dp4 || f10 >= A2 + dp4) {
                        if (Math.pow(f10 - r0, 2.0d) + Math.pow(f9 - r0, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
                        }
                    }
                }
                break;
            default:
                float dp5 = AndroidUtilities.dp(1.0f);
                float dp6 = AndroidUtilities.dp(19.5f);
                float f15 = dp5 + dp6;
                float f16 = f15 * 2.0f;
                float A3 = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f16, 2.0f, f15);
                if (f9 <= f15 - dp6 || f10 <= A3 - dp6 || f9 >= f15 + dp6 || f10 >= A3 + dp6) {
                    if (f9 <= ((getMeasuredWidth() - f16) + f15) - dp6 || f10 <= A3 - dp6 || f9 >= (getMeasuredWidth() - f16) + f15 + dp6 || f10 >= A3 + dp6) {
                        if (Math.pow(f10 - r0, 2.0d) + Math.pow(f9 - r0, 2.0d) < Math.pow(getMeasuredWidth() / 2.0f, 2.0d)) {
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
                    float f9 = (2.0f * measuredWidth) + dp2;
                    rectF.set(dp2, dp2, f9, f9);
                    Paint paint = this.a;
                    canvas.drawArc(rectF, 0.0f, 180.0f, false, paint);
                    canvas.drawArc(rectF, 180.0f, 180.0f, false, paint);
                    float f10 = measuredWidth + dp2;
                    Paint paint2 = this.c;
                    canvas.drawCircle(dp2, f10, dpf2, paint2);
                    Paint paint3 = this.b;
                    canvas.drawCircle(dp2, f10, dpf2 - AndroidUtilities.dp(1.0f), paint3);
                    canvas.drawCircle(f9, f10, dpf2, paint2);
                    canvas.drawCircle(f9, f10, dpf2 - AndroidUtilities.dp(1.0f), paint3);
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
                    float f11 = (2.0f * measuredWidth2) + dp4;
                    rectF2.set(dp4, dp4, f11, f11);
                    Paint paint4 = this.a;
                    canvas.drawArc(rectF2, 0.0f, 180.0f, false, paint4);
                    canvas.drawArc(rectF2, 180.0f, 180.0f, false, paint4);
                    float f12 = measuredWidth2 + dp4;
                    Paint paint5 = this.c;
                    canvas.drawCircle(dp4, f12, dpf22, paint5);
                    Paint paint6 = this.b;
                    canvas.drawCircle(dp4, f12, dpf22 - AndroidUtilities.dp(1.0f), paint6);
                    canvas.drawCircle(f11, f12, dpf22, paint5);
                    canvas.drawCircle(f11, f12, dpf22 - AndroidUtilities.dp(1.0f), paint6);
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
                    float f13 = (2.0f * measuredWidth3) + dp6;
                    rectF3.set(dp6, dp6, f13, f13);
                    Paint paint7 = this.a;
                    canvas.drawArc(rectF3, 0.0f, 180.0f, false, paint7);
                    canvas.drawArc(rectF3, 180.0f, 180.0f, false, paint7);
                    float f14 = measuredWidth3 + dp6;
                    Paint paint8 = this.c;
                    canvas.drawCircle(dp6, f14, dpf23, paint8);
                    Paint paint9 = this.b;
                    canvas.drawCircle(dp6, f14, dpf23 - AndroidUtilities.dp(1.0f), paint9);
                    canvas.drawCircle(f13, f14, dpf23, paint8);
                    canvas.drawCircle(f13, f14, dpf23 - AndroidUtilities.dp(1.0f), paint9);
                    canvas.restoreToCount(saveCount3);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(f3 f3Var, Context context) {
        super(f3Var, context);
        this.n = 1;
        this.r = new RectF();
    }
}
