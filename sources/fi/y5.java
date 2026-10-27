package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class y5 extends sg.d {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public int v;
    public int w;
    public final /* synthetic */ ta x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(ta taVar, Context context, x5 x5Var) {
        super(context, x5Var);
        this.x = taVar;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.x.b2) {
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
        ta taVar = this.x;
        sg.j jVar = taVar.y0;
        if (jVar == null || jVar.r || !jVar.n) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = jVar.getStickyX();
            i11 = taVar.y0.getStickyY();
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
                this.r = org.telegram.ui.d3.d(min, 150.0f, f11, 1.0f);
                invalidate();
                if (i11 != 0) {
                    float f12 = this.s;
                    if (f12 != 1.0f) {
                        this.s = org.telegram.ui.d3.d(min, 150.0f, f12, 1.0f);
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
                        this.s = org.telegram.ui.d3.v(min, 150.0f, f15, 0.0f);
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
                this.r = org.telegram.ui.d3.v(min, 150.0f, f16, 0.0f);
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
        ta taVar = this.x;
        y5 y5Var = taVar.G0;
        if (taVar.G1 <= 0) {
            taVar.G1 = y5Var.getMeasuredWidth();
        }
        if (taVar.H1 <= 0) {
            taVar.H1 = y5Var.getMeasuredHeight();
        }
        taVar.E0();
    }
}
