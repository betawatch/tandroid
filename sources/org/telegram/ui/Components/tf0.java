package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class tf0 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public el0 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public sf0 v;
    public yf0 w;

    public final void a(int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 == 1) {
            if (this.a != 0) {
                return;
            }
            el0 el0Var = this.e;
            this.a = (int) Math.floor(com.google.android.gms.internal.play_billing.k3.z(x10, el0Var.a, el0Var.c / 5.0f, 1.0f));
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
        yf0 yf0Var = this.w;
        int i11 = yf0Var.f;
        zf0 zf0Var = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : yf0Var.d : yf0Var.c : yf0Var.b : yf0Var.a;
        int i12 = this.a;
        if (i12 == 1) {
            zf0Var.a = Math.max(0.0f, Math.min(100.0f, zf0Var.a + min));
        } else if (i12 == 2) {
            zf0Var.b = Math.max(0.0f, Math.min(100.0f, zf0Var.b + min));
        } else if (i12 == 3) {
            zf0Var.c = Math.max(0.0f, Math.min(100.0f, zf0Var.c + min));
        } else if (i12 == 4) {
            zf0Var.d = Math.max(0.0f, Math.min(100.0f, zf0Var.d + min));
        } else if (i12 == 5) {
            zf0Var.e = Math.max(0.0f, Math.min(100.0f, zf0Var.e + min));
        }
        invalidate();
        sf0 sf0Var = this.v;
        if (sf0Var != null) {
            cg0 cg0Var = ((uf0) sf0Var).a;
            cg0Var.g();
            e00 e00Var = cg0Var.l0;
            if (e00Var != null) {
                e00Var.d(false, false, false);
            }
        }
        this.d = y3;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        zf0 zf0Var;
        int i10;
        String format;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        yf0 yf0Var = this.w;
        el0 el0Var = this.e;
        float f7 = el0Var.c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = el0Var.a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = el0Var.b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + el0Var.d, this.f);
        }
        float f14 = el0Var.a;
        float f15 = el0Var.b;
        canvas.drawLine(f14, f15 + el0Var.d, f14 + el0Var.c, f15, this.h);
        int i12 = yf0Var.f;
        int i13 = 3;
        int i14 = 2;
        if (i12 == 0) {
            paint.setColor(-1);
            zf0Var = yf0Var.a;
        } else if (i12 == 1) {
            paint.setColor(-1229492);
            zf0Var = yf0Var.b;
        } else if (i12 == 2) {
            paint.setColor(-15667555);
            zf0Var = yf0Var.c;
        } else if (i12 != 3) {
            zf0Var = null;
        } else {
            paint.setColor(-13404165);
            zf0Var = yf0Var.d;
        }
        int i15 = 0;
        while (i15 < 5) {
            if (i15 == 0) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(zf0Var.a / 100.0f));
            } else if (i15 == 1) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(zf0Var.b / 100.0f));
            } else if (i15 == i14) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(zf0Var.c / 100.0f));
            } else if (i15 == i13) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(zf0Var.d / 100.0f));
            } else if (i15 != 4) {
                format = "";
                i10 = i14;
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(zf0Var.e / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.play_billing.k3.z(f7, textPaint.measureText(format), 2.0f, el0Var.a), (el0Var.b + el0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = zf0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * el0Var.c) + el0Var.a, ((1.0f - a2[i17 + 1]) * el0Var.d) + el0Var.b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * el0Var.c) + el0Var.a, ((1.0f - a2[i18 + 1]) * el0Var.d) + el0Var.b);
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
                el0 el0Var = this.e;
                float f7 = el0Var.a;
                if (x10 >= f7 && x10 <= f7 + el0Var.c) {
                    float f10 = el0Var.b;
                    if (y3 >= f10 && y3 <= f10 + el0Var.d) {
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

    public void setDelegate(sf0 sf0Var) {
        this.v = sf0Var;
    }
}
