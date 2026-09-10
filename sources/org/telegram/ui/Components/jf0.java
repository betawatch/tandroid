package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jf0 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public rk0 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public if0 v;
    public of0 w;

    public final void a(int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 == 1) {
            if (this.a != 0) {
                return;
            }
            rk0 rk0Var = this.e;
            this.a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, rk0Var.a, rk0Var.c / 5.0f, 1.0f));
            return;
        }
        if (i10 != 2) {
            if ((i10 == 3 || i10 == 4 || i10 == 5) && this.a != 0) {
                this.a = 0;
                return;
            }
            return;
        }
        float min = Math.min(2.0f, (this.d - y3) / 8.0f);
        of0 of0Var = this.w;
        int i11 = of0Var.f;
        pf0 pf0Var = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : of0Var.d : of0Var.c : of0Var.b : of0Var.a;
        int i12 = this.a;
        if (i12 == 1) {
            pf0Var.a = Math.max(0.0f, Math.min(100.0f, pf0Var.a + min));
        } else if (i12 == 2) {
            pf0Var.b = Math.max(0.0f, Math.min(100.0f, pf0Var.b + min));
        } else if (i12 == 3) {
            pf0Var.c = Math.max(0.0f, Math.min(100.0f, pf0Var.c + min));
        } else if (i12 == 4) {
            pf0Var.d = Math.max(0.0f, Math.min(100.0f, pf0Var.d + min));
        } else if (i12 == 5) {
            pf0Var.e = Math.max(0.0f, Math.min(100.0f, pf0Var.e + min));
        }
        invalidate();
        if0 if0Var = this.v;
        if (if0Var != null) {
            sf0 sf0Var = ((kf0) if0Var).a;
            sf0Var.g();
            c00 c00Var = sf0Var.l0;
            if (c00Var != null) {
                c00Var.e(false, false, false);
            }
        }
        this.d = y3;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        pf0 pf0Var;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        of0 of0Var = this.w;
        rk0 rk0Var = this.e;
        float f7 = rk0Var.c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = rk0Var.a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = rk0Var.b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + rk0Var.d, this.f);
        }
        float f14 = rk0Var.a;
        float f15 = rk0Var.b;
        canvas.drawLine(f14, f15 + rk0Var.d, f14 + rk0Var.c, f15, this.h);
        int i11 = of0Var.f;
        int i12 = 3;
        int i13 = 2;
        if (i11 == 0) {
            paint.setColor(-1);
            pf0Var = of0Var.a;
        } else if (i11 == 1) {
            paint.setColor(-1229492);
            pf0Var = of0Var.b;
        } else if (i11 == 2) {
            paint.setColor(-15667555);
            pf0Var = of0Var.c;
        } else if (i11 != 3) {
            pf0Var = null;
        } else {
            paint.setColor(-13404165);
            pf0Var = of0Var.d;
        }
        int i14 = 0;
        while (i14 < 5) {
            String format = i14 != 0 ? i14 != 1 ? i14 != i13 ? i14 != i12 ? i14 != 4 ? "" : String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.e / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.d / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.c / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.b / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(pf0Var.a / 100.0f));
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, rk0Var.a), (rk0Var.b + rk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = pf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * rk0Var.c) + rk0Var.a, ((1.0f - a2[i16 + 1]) * rk0Var.d) + rk0Var.b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * rk0Var.c) + rk0Var.a, ((1.0f - a2[i17 + 1]) * rk0Var.d) + rk0Var.b);
            }
        }
        canvas.drawPath(path, paint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 6) goto L44;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                        }
                    }
                } else if (this.b) {
                    a(2, motionEvent);
                    return true;
                }
                return true;
            }
            if (this.b) {
                a(3, motionEvent);
                this.b = false;
            }
            this.c = true;
            return true;
        }
        if (motionEvent.getPointerCount() == 1) {
            if (this.c && !this.b) {
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                this.d = y3;
                rk0 rk0Var = this.e;
                float f7 = rk0Var.a;
                if (x10 >= f7 && x10 <= f7 + rk0Var.c) {
                    float f10 = rk0Var.b;
                    if (y3 >= f10 && y3 <= f10 + rk0Var.d) {
                        this.b = true;
                    }
                }
                this.c = false;
                if (this.b) {
                    a(1, motionEvent);
                    return true;
                }
            }
        } else if (this.b) {
            a(3, motionEvent);
            this.c = true;
            this.b = false;
        }
        return true;
    }

    public void setDelegate(if0 if0Var) {
        this.v = if0Var;
    }
}
