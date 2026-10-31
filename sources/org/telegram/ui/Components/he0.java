package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class he0 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public oj0 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public ge0 w;
    public e2.c x;

    public final void a(int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 == 1) {
            if (this.a != 0) {
                return;
            }
            oj0 oj0Var = this.e;
            this.a = (int) Math.floor(c3.i0.B(x10, oj0Var.a, oj0Var.c / 5.0f, 1.0f));
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
        e2.c cVar = this.x;
        int i11 = cVar.a;
        me0 me0Var = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : (me0) cVar.e : (me0) cVar.d : (me0) cVar.c : (me0) cVar.b;
        int i12 = this.a;
        if (i12 == 1) {
            me0Var.a = org.telegram.messenger.z20.z(me0Var.a, min, 100.0f, 0.0f);
        } else if (i12 == 2) {
            me0Var.b = org.telegram.messenger.z20.z(me0Var.b, min, 100.0f, 0.0f);
        } else if (i12 == 3) {
            me0Var.c = org.telegram.messenger.z20.z(me0Var.c, min, 100.0f, 0.0f);
        } else if (i12 == 4) {
            me0Var.d = org.telegram.messenger.z20.z(me0Var.d, min, 100.0f, 0.0f);
        } else if (i12 == 5) {
            me0Var.e = org.telegram.messenger.z20.z(me0Var.e, min, 100.0f, 0.0f);
        }
        invalidate();
        ge0 ge0Var = this.w;
        if (ge0Var != null) {
            oe0 oe0Var = ((ie0) ge0Var).a;
            oe0Var.f();
            gz gzVar = oe0Var.l0;
            if (gzVar != null) {
                gzVar.c(false, false, false);
            }
        }
        this.d = y3;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        me0 me0Var;
        int i10;
        String format;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        e2.c cVar = this.x;
        oj0 oj0Var = this.e;
        float f7 = oj0Var.c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = oj0Var.a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = oj0Var.b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + oj0Var.d, this.f);
        }
        float f14 = oj0Var.a;
        float f15 = oj0Var.b;
        canvas.drawLine(f14, f15 + oj0Var.d, f14 + oj0Var.c, f15, this.h);
        int i12 = cVar.a;
        int i13 = 3;
        int i14 = 2;
        if (i12 == 0) {
            paint.setColor(-1);
            me0Var = (me0) cVar.b;
        } else if (i12 == 1) {
            paint.setColor(-1229492);
            me0Var = (me0) cVar.c;
        } else if (i12 == 2) {
            paint.setColor(-15667555);
            me0Var = (me0) cVar.d;
        } else if (i12 != 3) {
            me0Var = null;
        } else {
            paint.setColor(-13404165);
            me0Var = (me0) cVar.e;
        }
        int i15 = 0;
        while (i15 < 5) {
            if (i15 == 0) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(me0Var.a / 100.0f));
            } else if (i15 == 1) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(me0Var.b / 100.0f));
            } else if (i15 == i14) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(me0Var.c / 100.0f));
            } else if (i15 == i13) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(me0Var.d / 100.0f));
            } else if (i15 != 4) {
                format = "";
                i10 = i14;
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(me0Var.e / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + c3.i0.B(f7, textPaint.measureText(format), 2.0f, oj0Var.a), (oj0Var.b + oj0Var.d) - org.telegram.messenger.i0.L(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = me0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * oj0Var.c) + oj0Var.a, ((1.0f - a2[i17 + 1]) * oj0Var.d) + oj0Var.b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * oj0Var.c) + oj0Var.a, ((1.0f - a2[i18 + 1]) * oj0Var.d) + oj0Var.b);
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
                oj0 oj0Var = this.e;
                float f7 = oj0Var.a;
                if (x10 >= f7 && x10 <= f7 + oj0Var.c) {
                    float f10 = oj0Var.b;
                    if (y3 >= f10 && y3 <= f10 + oj0Var.d) {
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

    public void setDelegate(ge0 ge0Var) {
        this.w = ge0Var;
    }
}
