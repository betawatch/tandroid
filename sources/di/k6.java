package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class k6 extends rg.d {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public int v;
    public int w;
    public final /* synthetic */ rb x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(rb rbVar, Context context, j6 j6Var) {
        super(context, j6Var);
        this.x = rbVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.x.m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        Canvas canvas2;
        float f10;
        int measuredWidth;
        float measuredWidth2;
        int measuredHeight;
        float measuredHeight2;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.n);
        this.n = System.currentTimeMillis();
        rb rbVar = this.x;
        rg.k kVar = rbVar.J0;
        if (kVar == null || kVar.r || !kVar.n) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = kVar.getStickyX();
            i11 = rbVar.J0.getStickyY();
        }
        if (i10 != 0) {
            this.v = i10;
        }
        if (i11 != 0) {
            this.w = i11;
        }
        if (i10 != 0) {
            float f11 = this.r;
            if (f11 != 1.0f) {
                this.r = Math.min(1.0f, (min / 150.0f) + f11);
                invalidate();
                if (i11 != 0) {
                    float f12 = this.s;
                    if (f12 != 1.0f) {
                        this.s = Math.min(1.0f, (min / 150.0f) + f12);
                        invalidate();
                        f7 = this.s;
                        Paint paint = this.h;
                        if (f7 != 0.0f) {
                            paint.setAlpha((int) (f7 * 255.0f));
                            int i12 = this.w;
                            if (i12 == 1) {
                                measuredHeight = AndroidUtilities.dp(64.0f);
                            } else if (i12 == 2) {
                                measuredHeight2 = getMeasuredHeight() / 2.0f;
                                float f13 = measuredHeight2;
                                canvas2 = canvas;
                                canvas2.drawLine(0.0f, f13, getMeasuredWidth(), f13, paint);
                            } else {
                                measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(64.0f);
                            }
                            measuredHeight2 = measuredHeight;
                            float f132 = measuredHeight2;
                            canvas2 = canvas;
                            canvas2.drawLine(0.0f, f132, getMeasuredWidth(), f132, paint);
                        } else {
                            canvas2 = canvas;
                        }
                        f10 = this.r;
                        if (f10 != 0.0f) {
                            paint.setAlpha((int) (f10 * 255.0f));
                            int i13 = this.v;
                            if (i13 == 1) {
                                measuredWidth = AndroidUtilities.dp(8.0f);
                            } else {
                                if (i13 == 2) {
                                    measuredWidth2 = getMeasuredWidth() / 2.0f;
                                    float f14 = measuredWidth2;
                                    canvas2.drawLine(f14, 0.0f, f14, getMeasuredHeight(), paint);
                                    return;
                                }
                                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            measuredWidth2 = measuredWidth;
                            float f142 = measuredWidth2;
                            canvas2.drawLine(f142, 0.0f, f142, getMeasuredHeight(), paint);
                            return;
                        }
                        return;
                    }
                }
                if (i11 == 0) {
                    float f15 = this.s;
                    if (f15 != 0.0f) {
                        this.s = Math.max(0.0f, f15 - (min / 150.0f));
                        invalidate();
                    }
                }
                f7 = this.s;
                Paint paint2 = this.h;
                if (f7 != 0.0f) {
                }
                f10 = this.r;
                if (f10 != 0.0f) {
                }
            }
        }
        if (i10 == 0) {
            float f16 = this.r;
            if (f16 != 0.0f) {
                this.r = Math.max(0.0f, f16 - (min / 150.0f));
                invalidate();
            }
        }
        if (i11 != 0) {
        }
        if (i11 == 0) {
        }
        f7 = this.s;
        Paint paint22 = this.h;
        if (f7 != 0.0f) {
        }
        f10 = this.r;
        if (f10 != 0.0f) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        rb rbVar = this.x;
        k6 k6Var = rbVar.R0;
        if (rbVar.R1 <= 0) {
            rbVar.R1 = k6Var.getMeasuredWidth();
        }
        if (rbVar.S1 <= 0) {
            rbVar.S1 = k6Var.getMeasuredHeight();
        }
        rbVar.H0();
    }
}
