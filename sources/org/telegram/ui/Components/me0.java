package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class me0 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public yj0 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public le0 v;
    public re0 w;

    public final void a(int i10, MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i10 == 1) {
            if (this.a != 0) {
                return;
            }
            yj0 yj0Var = this.e;
            this.a = (int) Math.floor(com.google.android.recaptcha.internal.a.A(x8, yj0Var.a, yj0Var.c / 5.0f, 1.0f));
            return;
        }
        if (i10 != 2) {
            if ((i10 == 3 || i10 == 4 || i10 == 5) && this.a != 0) {
                this.a = 0;
                return;
            }
            return;
        }
        float min = Math.min(2.0f, (this.d - y10) / 8.0f);
        re0 re0Var = this.w;
        int i11 = re0Var.f;
        se0 se0Var = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : re0Var.d : re0Var.c : re0Var.b : re0Var.a;
        int i12 = this.a;
        if (i12 == 1) {
            se0Var.a = Math.max(0.0f, Math.min(100.0f, se0Var.a + min));
        } else if (i12 == 2) {
            se0Var.b = Math.max(0.0f, Math.min(100.0f, se0Var.b + min));
        } else if (i12 == 3) {
            se0Var.c = Math.max(0.0f, Math.min(100.0f, se0Var.c + min));
        } else if (i12 == 4) {
            se0Var.d = Math.max(0.0f, Math.min(100.0f, se0Var.d + min));
        } else if (i12 == 5) {
            se0Var.e = Math.max(0.0f, Math.min(100.0f, se0Var.e + min));
        }
        invalidate();
        le0 le0Var = this.v;
        if (le0Var != null) {
            ve0 ve0Var = ((ne0) le0Var).a;
            ve0Var.g();
            jz jzVar = ve0Var.h0;
            if (jzVar != null) {
                jzVar.e(false, false, false);
            }
        }
        this.d = y10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        se0 se0Var;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        re0 re0Var = this.w;
        yj0 yj0Var = this.e;
        float f10 = yj0Var.c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = yj0Var.a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = yj0Var.b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + yj0Var.d, this.f);
        }
        float f15 = yj0Var.a;
        float f16 = yj0Var.b;
        canvas.drawLine(f15, f16 + yj0Var.d, f15 + yj0Var.c, f16, this.h);
        int i11 = re0Var.f;
        int i12 = 3;
        int i13 = 2;
        if (i11 == 0) {
            paint.setColor(-1);
            se0Var = re0Var.a;
        } else if (i11 == 1) {
            paint.setColor(-1229492);
            se0Var = re0Var.b;
        } else if (i11 == 2) {
            paint.setColor(-15667555);
            se0Var = re0Var.c;
        } else if (i11 != 3) {
            se0Var = null;
        } else {
            paint.setColor(-13404165);
            se0Var = re0Var.d;
        }
        int i14 = 0;
        while (i14 < 5) {
            String format = i14 != 0 ? i14 != 1 ? i14 != i13 ? i14 != i12 ? i14 != 4 ? "" : String.format(Locale.US, "%.2f", Float.valueOf(se0Var.e / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(se0Var.d / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(se0Var.c / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(se0Var.b / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(se0Var.a / 100.0f));
            canvas.drawText(format, (i14 * f10) + com.google.android.recaptcha.internal.a.A(f10, textPaint.measureText(format), 2.0f, yj0Var.a), (yj0Var.b + yj0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = se0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * yj0Var.c) + yj0Var.a, ((1.0f - a2[i16 + 1]) * yj0Var.d) + yj0Var.b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * yj0Var.c) + yj0Var.a, ((1.0f - a2[i17 + 1]) * yj0Var.d) + yj0Var.b);
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
                float x8 = motionEvent.getX();
                float y10 = motionEvent.getY();
                this.d = y10;
                yj0 yj0Var = this.e;
                float f10 = yj0Var.a;
                if (x8 >= f10 && x8 <= f10 + yj0Var.c) {
                    float f11 = yj0Var.b;
                    if (y10 >= f11 && y10 <= f11 + yj0Var.d) {
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

    public void setDelegate(le0 le0Var) {
        this.v = le0Var;
    }
}
