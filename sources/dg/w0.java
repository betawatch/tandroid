package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ft0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w0 extends d {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public final /* synthetic */ ft0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ft0 ft0Var, Context context, v0 v0Var) {
        super(context, v0Var);
        this.v = ft0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        Canvas canvas2;
        float f11;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.n);
        this.n = System.currentTimeMillis();
        ft0 ft0Var = this.v;
        j jVar = ft0Var.P0;
        if (jVar == null || jVar.r || !jVar.n) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = jVar.getStickyX();
            i11 = ft0Var.P0.getStickyY();
        }
        if (i10 != 0) {
            float f12 = this.r;
            if (f12 != 1.0f) {
                this.r = Math.min(1.0f, (min / 150.0f) + f12);
                invalidate();
                if (i11 != 0) {
                    float f13 = this.s;
                    if (f13 != 1.0f) {
                        this.s = Math.min(1.0f, (min / 150.0f) + f13);
                        invalidate();
                        f10 = this.s;
                        Paint paint = this.h;
                        if (f10 != 0.0f) {
                            paint.setAlpha((int) (f10 * 255.0f));
                            float measuredHeight = getMeasuredHeight() / 2.0f;
                            canvas2 = canvas;
                            canvas2.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, paint);
                        } else {
                            canvas2 = canvas;
                        }
                        f11 = this.r;
                        if (f11 != 0.0f) {
                            paint.setAlpha((int) (f11 * 255.0f));
                            float measuredWidth = getMeasuredWidth() / 2.0f;
                            canvas2.drawLine(measuredWidth, 0.0f, measuredWidth, getMeasuredHeight(), paint);
                            return;
                        }
                        return;
                    }
                }
                if (i11 == 0) {
                    float f14 = this.s;
                    if (f14 != 0.0f) {
                        this.s = Math.max(0.0f, f14 - (min / 150.0f));
                        invalidate();
                    }
                }
                f10 = this.s;
                Paint paint2 = this.h;
                if (f10 != 0.0f) {
                }
                f11 = this.r;
                if (f11 != 0.0f) {
                }
            }
        }
        if (i10 == 0) {
            float f15 = this.r;
            if (f15 != 0.0f) {
                this.r = Math.max(0.0f, f15 - (min / 150.0f));
                invalidate();
            }
        }
        if (i11 != 0) {
        }
        if (i11 == 0) {
        }
        f10 = this.s;
        Paint paint22 = this.h;
        if (f10 != 0.0f) {
        }
        f11 = this.r;
        if (f11 != 0.0f) {
        }
    }
}
