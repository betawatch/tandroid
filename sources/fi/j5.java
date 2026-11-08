package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class j5 extends tg.d {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public int w;
    public int x;
    public final /* synthetic */ x9 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(x9 x9Var, Context context, aa.n nVar) {
        super(context, nVar);
        this.y = x9Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.y.V1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i7;
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
        x9 x9Var = this.y;
        tg.j jVar = x9Var.s0;
        if (jVar == null || jVar.r || !jVar.n) {
            i7 = 0;
            i10 = 0;
        } else {
            i7 = jVar.getStickyX();
            i10 = x9Var.s0.getStickyY();
        }
        if (i7 != 0) {
            this.w = i7;
        }
        if (i10 != 0) {
            this.x = i10;
        }
        if (i7 != 0) {
            float f12 = this.r;
            if (f12 != 1.0f) {
                this.r = org.telegram.ui.Cells.f1.e(min, 150.0f, f12, 1.0f);
                invalidate();
                if (i10 != 0) {
                    float f13 = this.s;
                    if (f13 != 1.0f) {
                        this.s = org.telegram.ui.Cells.f1.e(min, 150.0f, f13, 1.0f);
                        invalidate();
                        f10 = this.s;
                        Paint paint = this.h;
                        if (f10 != 0.0f) {
                            paint.setAlpha((int) (f10 * 255.0f));
                            int i11 = this.x;
                            if (i11 == 1) {
                                measuredHeight = org.telegram.messenger.g0.L(64.0f);
                            } else if (i11 == 2) {
                                measuredHeight2 = getMeasuredHeight() / 2.0f;
                                float f14 = measuredHeight2;
                                canvas2 = canvas;
                                canvas2.drawLine(0.0f, f14, getMeasuredWidth(), f14, paint);
                            } else {
                                measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f);
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
                            int i12 = this.w;
                            if (i12 == 1) {
                                measuredWidth = org.telegram.messenger.g0.L(8.0f);
                            } else {
                                if (i12 == 2) {
                                    measuredWidth2 = getMeasuredWidth() / 2.0f;
                                    float f15 = measuredWidth2;
                                    canvas2.drawLine(f15, 0.0f, f15, getMeasuredHeight(), paint);
                                    return;
                                }
                                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f);
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
                        this.s = org.telegram.ui.Cells.f1.v(min, 150.0f, f16, 0.0f);
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
        if (i7 == 0) {
            float f17 = this.r;
            if (f17 != 0.0f) {
                this.r = org.telegram.ui.Cells.f1.v(min, 150.0f, f17, 0.0f);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        x9 x9Var = this.y;
        j5 j5Var = x9Var.A0;
        if (x9Var.A1 <= 0) {
            x9Var.A1 = j5Var.getMeasuredWidth();
        }
        if (x9Var.B1 <= 0) {
            x9Var.B1 = j5Var.getMeasuredHeight();
        }
        x9Var.E0();
    }
}
