package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class gf0 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public tk0 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public ff0 v;
    public lf0 w;

    public final void a(int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i10 == 1) {
            if (this.a != 0) {
                return;
            }
            tk0 tk0Var = this.e;
            this.a = (int) Math.floor(e2.c.x(x10, tk0Var.a, tk0Var.c / 5.0f, 1.0f));
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
        lf0 lf0Var = this.w;
        int i11 = lf0Var.f;
        mf0 mf0Var = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : lf0Var.d : lf0Var.c : lf0Var.b : lf0Var.a;
        int i12 = this.a;
        if (i12 == 1) {
            mf0Var.a = Math.max(0.0f, Math.min(100.0f, mf0Var.a + min));
        } else if (i12 == 2) {
            mf0Var.b = Math.max(0.0f, Math.min(100.0f, mf0Var.b + min));
        } else if (i12 == 3) {
            mf0Var.c = Math.max(0.0f, Math.min(100.0f, mf0Var.c + min));
        } else if (i12 == 4) {
            mf0Var.d = Math.max(0.0f, Math.min(100.0f, mf0Var.d + min));
        } else if (i12 == 5) {
            mf0Var.e = Math.max(0.0f, Math.min(100.0f, mf0Var.e + min));
        }
        invalidate();
        ff0 ff0Var = this.v;
        if (ff0Var != null) {
            pf0 pf0Var = ((hf0) ff0Var).a;
            pf0Var.g();
            xz xzVar = pf0Var.i0;
            if (xzVar != null) {
                xzVar.e(false, false, false);
            }
        }
        this.d = y10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        mf0 mf0Var;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        lf0 lf0Var = this.w;
        tk0 tk0Var = this.e;
        float f10 = tk0Var.c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = tk0Var.a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = tk0Var.b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + tk0Var.d, this.f);
        }
        float f15 = tk0Var.a;
        float f16 = tk0Var.b;
        canvas.drawLine(f15, f16 + tk0Var.d, f15 + tk0Var.c, f16, this.h);
        int i11 = lf0Var.f;
        int i12 = 3;
        int i13 = 2;
        if (i11 == 0) {
            paint.setColor(-1);
            mf0Var = lf0Var.a;
        } else if (i11 == 1) {
            paint.setColor(-1229492);
            mf0Var = lf0Var.b;
        } else if (i11 == 2) {
            paint.setColor(-15667555);
            mf0Var = lf0Var.c;
        } else if (i11 != 3) {
            mf0Var = null;
        } else {
            paint.setColor(-13404165);
            mf0Var = lf0Var.d;
        }
        int i14 = 0;
        while (i14 < 5) {
            String format = i14 != 0 ? i14 != 1 ? i14 != i13 ? i14 != i12 ? i14 != 4 ? "" : String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.e / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.d / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.c / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.b / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(mf0Var.a / 100.0f));
            canvas.drawText(format, (i14 * f10) + e2.c.x(f10, textPaint.measureText(format), 2.0f, tk0Var.a), (tk0Var.b + tk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = mf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * tk0Var.c) + tk0Var.a, ((1.0f - a2[i16 + 1]) * tk0Var.d) + tk0Var.b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * tk0Var.c) + tk0Var.a, ((1.0f - a2[i17 + 1]) * tk0Var.d) + tk0Var.b);
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
                tk0 tk0Var = this.e;
                float f10 = tk0Var.a;
                if (x10 >= f10 && x10 <= f10 + tk0Var.c) {
                    float f11 = tk0Var.b;
                    if (y10 >= f11 && y10 <= f11 + tk0Var.d) {
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

    public void setDelegate(ff0 ff0Var) {
        this.v = ff0Var;
    }
}
