package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vf0 extends View {
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
    public uf0 v;
    public bg0 w;

    public final void a(int i10, MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 == 1) {
            if (this.a != 0) {
                return;
            }
            il0 il0Var = this.e;
            this.a = (int) Math.floor(c3.h0.B(x9, il0Var.a, il0Var.c / 5.0f, 1.0f));
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
        bg0 bg0Var = this.w;
        int i11 = bg0Var.f;
        cg0 cg0Var = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : bg0Var.d : bg0Var.c : bg0Var.b : bg0Var.a;
        int i12 = this.a;
        if (i12 == 1) {
            cg0Var.a = org.telegram.messenger.wh.A(cg0Var.a, min, 100.0f, 0.0f);
        } else if (i12 == 2) {
            cg0Var.b = org.telegram.messenger.wh.A(cg0Var.b, min, 100.0f, 0.0f);
        } else if (i12 == 3) {
            cg0Var.c = org.telegram.messenger.wh.A(cg0Var.c, min, 100.0f, 0.0f);
        } else if (i12 == 4) {
            cg0Var.d = org.telegram.messenger.wh.A(cg0Var.d, min, 100.0f, 0.0f);
        } else if (i12 == 5) {
            cg0Var.e = org.telegram.messenger.wh.A(cg0Var.e, min, 100.0f, 0.0f);
        }
        invalidate();
        uf0 uf0Var = this.v;
        if (uf0Var != null) {
            fg0 fg0Var = ((wf0) uf0Var).a;
            fg0Var.g();
            e00 e00Var = fg0Var.l0;
            if (e00Var != null) {
                e00Var.d(false, false, false);
            }
        }
        this.d = y3;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        cg0 cg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        bg0 bg0Var = this.w;
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
        int i12 = bg0Var.f;
        int i13 = 3;
        int i14 = 2;
        if (i12 == 0) {
            paint.setColor(-1);
            cg0Var = bg0Var.a;
        } else if (i12 == 1) {
            paint.setColor(-1229492);
            cg0Var = bg0Var.b;
        } else if (i12 == 2) {
            paint.setColor(-15667555);
            cg0Var = bg0Var.c;
        } else if (i12 != 3) {
            cg0Var = null;
        } else {
            paint.setColor(-13404165);
            cg0Var = bg0Var.d;
        }
        int i15 = 0;
        while (i15 < 5) {
            if (i15 == 0) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(cg0Var.a / 100.0f));
            } else if (i15 == 1) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(cg0Var.b / 100.0f));
            } else if (i15 == i14) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(cg0Var.c / 100.0f));
            } else if (i15 == i13) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(cg0Var.d / 100.0f));
            } else if (i15 != 4) {
                format = "";
                i10 = i14;
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(cg0Var.e / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + c3.h0.B(f7, textPaint.measureText(format), 2.0f, il0Var.a), (il0Var.b + il0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = cg0Var.a();
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
                float x9 = motionEvent.getX();
                float y3 = motionEvent.getY();
                this.d = y3;
                il0 il0Var = this.e;
                float f7 = il0Var.a;
                if (x9 >= f7 && x9 <= f7 + il0Var.c) {
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

    public void setDelegate(uf0 uf0Var) {
        this.v = uf0Var;
    }
}
