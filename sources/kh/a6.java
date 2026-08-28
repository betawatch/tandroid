package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class a6 extends yf.d {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public int v;
    public int w;
    public final /* synthetic */ ya x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(ya yaVar, Context context, z5 z5Var) {
        super(context, z5Var);
        this.x = yaVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.x.i2) {
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
        int i9;
        int i10;
        float f10;
        Canvas canvas2;
        float f11;
        int measuredWidth;
        float measuredWidth2;
        int measuredHeight;
        float measuredHeight2;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.n);
        this.n = System.currentTimeMillis();
        ya yaVar = this.x;
        yf.j jVar = yaVar.F0;
        if (jVar == null || jVar.r || !jVar.n) {
            i9 = 0;
            i10 = 0;
        } else {
            i9 = jVar.getStickyX();
            i10 = yaVar.F0.getStickyY();
        }
        if (i9 != 0) {
            this.v = i9;
        }
        if (i10 != 0) {
            this.w = i10;
        }
        if (i9 != 0) {
            float f12 = this.r;
            if (f12 != 1.0f) {
                this.r = Math.min(1.0f, (min / 150.0f) + f12);
                invalidate();
                if (i10 != 0) {
                    float f13 = this.s;
                    if (f13 != 1.0f) {
                        this.s = Math.min(1.0f, (min / 150.0f) + f13);
                        invalidate();
                        f10 = this.s;
                        Paint paint = this.h;
                        if (f10 != 0.0f) {
                            paint.setAlpha((int) (f10 * 255.0f));
                            int i11 = this.w;
                            if (i11 == 1) {
                                measuredHeight = AndroidUtilities.dp(64.0f);
                            } else if (i11 == 2) {
                                measuredHeight2 = getMeasuredHeight() / 2.0f;
                                float f14 = measuredHeight2;
                                canvas2 = canvas;
                                canvas2.drawLine(0.0f, f14, getMeasuredWidth(), f14, paint);
                            } else {
                                measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(64.0f);
                            }
                            measuredHeight2 = measuredHeight;
                            float f142 = measuredHeight2;
                            canvas2 = canvas;
                            canvas2.drawLine(0.0f, f142, getMeasuredWidth(), f142, paint);
                        } else {
                            canvas2 = canvas;
                        }
                        f11 = this.r;
                        if (f11 != 0.0f) {
                            paint.setAlpha((int) (f11 * 255.0f));
                            int i12 = this.v;
                            if (i12 == 1) {
                                measuredWidth = AndroidUtilities.dp(8.0f);
                            } else {
                                if (i12 == 2) {
                                    measuredWidth2 = getMeasuredWidth() / 2.0f;
                                    float f15 = measuredWidth2;
                                    canvas2.drawLine(f15, 0.0f, f15, getMeasuredHeight(), paint);
                                    return;
                                }
                                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            measuredWidth2 = measuredWidth;
                            float f152 = measuredWidth2;
                            canvas2.drawLine(f152, 0.0f, f152, getMeasuredHeight(), paint);
                            return;
                        }
                        return;
                    }
                }
                if (i10 == 0) {
                    float f16 = this.s;
                    if (f16 != 0.0f) {
                        this.s = Math.max(0.0f, f16 - (min / 150.0f));
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
        if (i9 == 0) {
            float f17 = this.r;
            if (f17 != 0.0f) {
                this.r = Math.max(0.0f, f17 - (min / 150.0f));
                invalidate();
            }
        }
        if (i10 != 0) {
        }
        if (i10 == 0) {
        }
        f10 = this.s;
        Paint paint22 = this.h;
        if (f10 != 0.0f) {
        }
        f11 = this.r;
        if (f11 != 0.0f) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        ya yaVar = this.x;
        a6 a6Var = yaVar.N0;
        if (yaVar.N1 <= 0) {
            yaVar.N1 = a6Var.getMeasuredWidth();
        }
        if (yaVar.O1 <= 0) {
            yaVar.O1 = a6Var.getMeasuredHeight();
        }
        yaVar.H0();
    }
}
