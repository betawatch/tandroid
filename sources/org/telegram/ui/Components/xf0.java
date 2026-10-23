package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class xf0 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public il0 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public wf0 v;
    public dg0 w;

    public final void a(int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 == 1) {
            if (this.a != 0) {
                return;
            }
            il0 il0Var = this.e;
            this.a = (int) Math.floor(com.google.android.gms.internal.play_billing.k3.z(x10, il0Var.a, il0Var.c / 5.0f, 1.0f));
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
        dg0 dg0Var = this.w;
        int i11 = dg0Var.f;
        eg0 eg0Var = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : dg0Var.d : dg0Var.c : dg0Var.b : dg0Var.a;
        int i12 = this.a;
        if (i12 == 1) {
            eg0Var.a = Math.max(0.0f, Math.min(100.0f, eg0Var.a + min));
        } else if (i12 == 2) {
            eg0Var.b = Math.max(0.0f, Math.min(100.0f, eg0Var.b + min));
        } else if (i12 == 3) {
            eg0Var.c = Math.max(0.0f, Math.min(100.0f, eg0Var.c + min));
        } else if (i12 == 4) {
            eg0Var.d = Math.max(0.0f, Math.min(100.0f, eg0Var.d + min));
        } else if (i12 == 5) {
            eg0Var.e = Math.max(0.0f, Math.min(100.0f, eg0Var.e + min));
        }
        invalidate();
        wf0 wf0Var = this.v;
        if (wf0Var != null) {
            hg0 hg0Var = ((yf0) wf0Var).a;
            hg0Var.g();
            e00 e00Var = hg0Var.l0;
            if (e00Var != null) {
                e00Var.d(false, false, false);
            }
        }
        this.d = y3;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        eg0 eg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        dg0 dg0Var = this.w;
        il0 il0Var = this.e;
        float f7 = il0Var.c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = il0Var.a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = il0Var.b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + il0Var.d, this.f);
        }
        float f14 = il0Var.a;
        float f15 = il0Var.b;
        canvas.drawLine(f14, f15 + il0Var.d, f14 + il0Var.c, f15, this.h);
        int i12 = dg0Var.f;
        int i13 = 3;
        int i14 = 2;
        if (i12 == 0) {
            paint.setColor(-1);
            eg0Var = dg0Var.a;
        } else if (i12 == 1) {
            paint.setColor(-1229492);
            eg0Var = dg0Var.b;
        } else if (i12 == 2) {
            paint.setColor(-15667555);
            eg0Var = dg0Var.c;
        } else if (i12 != 3) {
            eg0Var = null;
        } else {
            paint.setColor(-13404165);
            eg0Var = dg0Var.d;
        }
        int i15 = 0;
        while (i15 < 5) {
            if (i15 == 0) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(eg0Var.a / 100.0f));
            } else if (i15 == 1) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(eg0Var.b / 100.0f));
            } else if (i15 == i14) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(eg0Var.c / 100.0f));
            } else if (i15 == i13) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(eg0Var.d / 100.0f));
            } else if (i15 != 4) {
                format = "";
                i10 = i14;
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(eg0Var.e / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.play_billing.k3.z(f7, textPaint.measureText(format), 2.0f, il0Var.a), (il0Var.b + il0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = eg0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * il0Var.c) + il0Var.a, ((1.0f - a2[i17 + 1]) * il0Var.d) + il0Var.b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * il0Var.c) + il0Var.a, ((1.0f - a2[i18 + 1]) * il0Var.d) + il0Var.b);
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
                il0 il0Var = this.e;
                float f7 = il0Var.a;
                if (x10 >= f7 && x10 <= f7 + il0Var.c) {
                    float f10 = il0Var.b;
                    if (y3 >= f10 && y3 <= f10 + il0Var.d) {
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

    public void setDelegate(wf0 wf0Var) {
        this.v = wf0Var;
    }
}
