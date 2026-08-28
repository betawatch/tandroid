package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class he0 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public wj0 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public ge0 v;
    public me0 w;

    public final void a(int i9, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i9 == 1) {
            if (this.a != 0) {
                return;
            }
            wj0 wj0Var = this.e;
            this.a = (int) Math.floor(e2.c.A(x10, wj0Var.a, wj0Var.c / 5.0f, 1.0f));
            return;
        }
        if (i9 != 2) {
            if ((i9 == 3 || i9 == 4 || i9 == 5) && this.a != 0) {
                this.a = 0;
                return;
            }
            return;
        }
        float min = Math.min(2.0f, (this.d - y10) / 8.0f);
        me0 me0Var = this.w;
        int i10 = me0Var.f;
        ne0 ne0Var = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? null : me0Var.d : me0Var.c : me0Var.b : me0Var.a;
        int i11 = this.a;
        if (i11 == 1) {
            ne0Var.a = Math.max(0.0f, Math.min(100.0f, ne0Var.a + min));
        } else if (i11 == 2) {
            ne0Var.b = Math.max(0.0f, Math.min(100.0f, ne0Var.b + min));
        } else if (i11 == 3) {
            ne0Var.c = Math.max(0.0f, Math.min(100.0f, ne0Var.c + min));
        } else if (i11 == 4) {
            ne0Var.d = Math.max(0.0f, Math.min(100.0f, ne0Var.d + min));
        } else if (i11 == 5) {
            ne0Var.e = Math.max(0.0f, Math.min(100.0f, ne0Var.e + min));
        }
        invalidate();
        ge0 ge0Var = this.v;
        if (ge0Var != null) {
            qe0 qe0Var = ((ie0) ge0Var).a;
            qe0Var.g();
            hz hzVar = qe0Var.h0;
            if (hzVar != null) {
                hzVar.e(false, false, false);
            }
        }
        this.d = y10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ne0 ne0Var;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        me0 me0Var = this.w;
        wj0 wj0Var = this.e;
        float f10 = wj0Var.c / 5.0f;
        for (int i9 = 0; i9 < 4; i9++) {
            float f11 = wj0Var.a;
            float f12 = i9 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = wj0Var.b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + wj0Var.d, this.f);
        }
        float f15 = wj0Var.a;
        float f16 = wj0Var.b;
        canvas.drawLine(f15, f16 + wj0Var.d, f15 + wj0Var.c, f16, this.h);
        int i10 = me0Var.f;
        int i11 = 3;
        int i12 = 2;
        if (i10 == 0) {
            paint.setColor(-1);
            ne0Var = me0Var.a;
        } else if (i10 == 1) {
            paint.setColor(-1229492);
            ne0Var = me0Var.b;
        } else if (i10 == 2) {
            paint.setColor(-15667555);
            ne0Var = me0Var.c;
        } else if (i10 != 3) {
            ne0Var = null;
        } else {
            paint.setColor(-13404165);
            ne0Var = me0Var.d;
        }
        int i13 = 0;
        while (i13 < 5) {
            String format = i13 != 0 ? i13 != 1 ? i13 != i12 ? i13 != i11 ? i13 != 4 ? "" : String.format(Locale.US, "%.2f", Float.valueOf(ne0Var.e / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(ne0Var.d / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(ne0Var.c / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(ne0Var.b / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(ne0Var.a / 100.0f));
            canvas.drawText(format, (i13 * f10) + e2.c.A(f10, textPaint.measureText(format), 2.0f, wj0Var.a), (wj0Var.b + wj0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i13++;
            i11 = 3;
            i12 = 2;
        }
        float[] a2 = ne0Var.a();
        invalidate();
        path.reset();
        for (int i14 = 0; i14 < a2.length / 2; i14++) {
            if (i14 == 0) {
                int i15 = i14 * 2;
                path.moveTo((a2[i15] * wj0Var.c) + wj0Var.a, ((1.0f - a2[i15 + 1]) * wj0Var.d) + wj0Var.b);
            } else {
                int i16 = i14 * 2;
                path.lineTo((a2[i16] * wj0Var.c) + wj0Var.a, ((1.0f - a2[i16 + 1]) * wj0Var.d) + wj0Var.b);
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
                float y10 = motionEvent.getY();
                this.d = y10;
                wj0 wj0Var = this.e;
                float f10 = wj0Var.a;
                if (x10 >= f10 && x10 <= f10 + wj0Var.c) {
                    float f11 = wj0Var.b;
                    if (y10 >= f11 && y10 <= f11 + wj0Var.d) {
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
        this.v = ge0Var;
    }
}
