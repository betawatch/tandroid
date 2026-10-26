package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uf0 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public hl0 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public tf0 v;
    public ag0 w;

    public final void a(int i10, MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 == 1) {
            if (this.a != 0) {
                return;
            }
            hl0 hl0Var = this.e;
            this.a = (int) Math.floor(c3.h0.B(x9, hl0Var.a, hl0Var.c / 5.0f, 1.0f));
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
        ag0 ag0Var = this.w;
        int i11 = ag0Var.f;
        bg0 bg0Var = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : ag0Var.d : ag0Var.c : ag0Var.b : ag0Var.a;
        int i12 = this.a;
        if (i12 == 1) {
            bg0Var.a = org.telegram.messenger.vh.A(bg0Var.a, min, 100.0f, 0.0f);
        } else if (i12 == 2) {
            bg0Var.b = org.telegram.messenger.vh.A(bg0Var.b, min, 100.0f, 0.0f);
        } else if (i12 == 3) {
            bg0Var.c = org.telegram.messenger.vh.A(bg0Var.c, min, 100.0f, 0.0f);
        } else if (i12 == 4) {
            bg0Var.d = org.telegram.messenger.vh.A(bg0Var.d, min, 100.0f, 0.0f);
        } else if (i12 == 5) {
            bg0Var.e = org.telegram.messenger.vh.A(bg0Var.e, min, 100.0f, 0.0f);
        }
        invalidate();
        tf0 tf0Var = this.v;
        if (tf0Var != null) {
            eg0 eg0Var = ((vf0) tf0Var).a;
            eg0Var.g();
            e00 e00Var = eg0Var.l0;
            if (e00Var != null) {
                e00Var.d(false, false, false);
            }
        }
        this.d = y3;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        bg0 bg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        ag0 ag0Var = this.w;
        hl0 hl0Var = this.e;
        float f7 = hl0Var.c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = hl0Var.a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = hl0Var.b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + hl0Var.d, this.f);
        }
        float f14 = hl0Var.a;
        float f15 = hl0Var.b;
        canvas.drawLine(f14, f15 + hl0Var.d, f14 + hl0Var.c, f15, this.h);
        int i12 = ag0Var.f;
        int i13 = 3;
        int i14 = 2;
        if (i12 == 0) {
            paint.setColor(-1);
            bg0Var = ag0Var.a;
        } else if (i12 == 1) {
            paint.setColor(-1229492);
            bg0Var = ag0Var.b;
        } else if (i12 == 2) {
            paint.setColor(-15667555);
            bg0Var = ag0Var.c;
        } else if (i12 != 3) {
            bg0Var = null;
        } else {
            paint.setColor(-13404165);
            bg0Var = ag0Var.d;
        }
        int i15 = 0;
        while (i15 < 5) {
            if (i15 == 0) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(bg0Var.a / 100.0f));
            } else if (i15 == 1) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(bg0Var.b / 100.0f));
            } else if (i15 == i14) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(bg0Var.c / 100.0f));
            } else if (i15 == i13) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(bg0Var.d / 100.0f));
            } else if (i15 != 4) {
                format = "";
                i10 = i14;
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(bg0Var.e / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + c3.h0.B(f7, textPaint.measureText(format), 2.0f, hl0Var.a), (hl0Var.b + hl0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = bg0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * hl0Var.c) + hl0Var.a, ((1.0f - a2[i17 + 1]) * hl0Var.d) + hl0Var.b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * hl0Var.c) + hl0Var.a, ((1.0f - a2[i18 + 1]) * hl0Var.d) + hl0Var.b);
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
                hl0 hl0Var = this.e;
                float f7 = hl0Var.a;
                if (x9 >= f7 && x9 <= f7 + hl0Var.c) {
                    float f10 = hl0Var.b;
                    if (y3 >= f10 && y3 <= f10 + hl0Var.d) {
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

    public void setDelegate(tf0 tf0Var) {
        this.v = tf0Var;
    }
}
