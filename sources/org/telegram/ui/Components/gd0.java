package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gd0 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public ni0 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public fd0 w;
    public g2.d x;

    public final void a(int i3, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (i3 == 1) {
            if (this.a != 0) {
                return;
            }
            ni0 ni0Var = this.e;
            this.a = (int) Math.floor(com.google.android.recaptcha.internal.a.z(x10, ni0Var.a, ni0Var.c / 5.0f, 1.0f));
            return;
        }
        if (i3 != 2) {
            if ((i3 == 3 || i3 == 4 || i3 == 5) && this.a != 0) {
                this.a = 0;
                return;
            }
            return;
        }
        float min = Math.min(2.0f, (this.d - y9) / 8.0f);
        g2.d dVar = this.x;
        int i10 = dVar.a;
        ld0 ld0Var = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? null : (ld0) dVar.e : (ld0) dVar.d : (ld0) dVar.c : (ld0) dVar.b;
        int i11 = this.a;
        if (i11 == 1) {
            ld0Var.a = org.telegram.messenger.camera.q.z(ld0Var.a, min, 100.0f, 0.0f);
        } else if (i11 == 2) {
            ld0Var.b = org.telegram.messenger.camera.q.z(ld0Var.b, min, 100.0f, 0.0f);
        } else if (i11 == 3) {
            ld0Var.c = org.telegram.messenger.camera.q.z(ld0Var.c, min, 100.0f, 0.0f);
        } else if (i11 == 4) {
            ld0Var.d = org.telegram.messenger.camera.q.z(ld0Var.d, min, 100.0f, 0.0f);
        } else if (i11 == 5) {
            ld0Var.e = org.telegram.messenger.camera.q.z(ld0Var.e, min, 100.0f, 0.0f);
        }
        invalidate();
        fd0 fd0Var = this.w;
        if (fd0Var != null) {
            nd0 nd0Var = ((hd0) fd0Var).a;
            nd0Var.d();
            py pyVar = nd0Var.m0;
            if (pyVar != null) {
                pyVar.c(false, false, false);
            }
        }
        this.d = y9;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ld0 ld0Var;
        int i3;
        String format;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        g2.d dVar = this.x;
        ni0 ni0Var = this.e;
        float f10 = ni0Var.c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = ni0Var.a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = ni0Var.b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + ni0Var.d, this.f);
        }
        float f15 = ni0Var.a;
        float f16 = ni0Var.b;
        canvas.drawLine(f15, f16 + ni0Var.d, f15 + ni0Var.c, f16, this.h);
        int i11 = dVar.a;
        int i12 = 3;
        int i13 = 2;
        if (i11 == 0) {
            paint.setColor(-1);
            ld0Var = (ld0) dVar.b;
        } else if (i11 == 1) {
            paint.setColor(-1229492);
            ld0Var = (ld0) dVar.c;
        } else if (i11 == 2) {
            paint.setColor(-15667555);
            ld0Var = (ld0) dVar.d;
        } else if (i11 != 3) {
            ld0Var = null;
        } else {
            paint.setColor(-13404165);
            ld0Var = (ld0) dVar.e;
        }
        int i14 = 0;
        while (i14 < 5) {
            if (i14 == 0) {
                i3 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(ld0Var.a / 100.0f));
            } else if (i14 == 1) {
                i3 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(ld0Var.b / 100.0f));
            } else if (i14 == i13) {
                i3 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(ld0Var.c / 100.0f));
            } else if (i14 == i12) {
                i3 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(ld0Var.d / 100.0f));
            } else if (i14 != 4) {
                format = "";
                i3 = i13;
            } else {
                i3 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(ld0Var.e / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + com.google.android.recaptcha.internal.a.z(f10, textPaint.measureText(format), 2.0f, ni0Var.a), (ni0Var.b + ni0Var.d) - org.telegram.messenger.g0.L(4.0f), textPaint);
            i14++;
            i13 = i3;
            i12 = 3;
        }
        float[] a10 = ld0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a10.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a10[i16] * ni0Var.c) + ni0Var.a, ((1.0f - a10[i16 + 1]) * ni0Var.d) + ni0Var.b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a10[i17] * ni0Var.c) + ni0Var.a, ((1.0f - a10[i17 + 1]) * ni0Var.d) + ni0Var.b);
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
                float y9 = motionEvent.getY();
                this.d = y9;
                ni0 ni0Var = this.e;
                float f10 = ni0Var.a;
                if (x10 >= f10 && x10 <= f10 + ni0Var.c) {
                    float f11 = ni0Var.b;
                    if (y9 >= f11 && y9 <= f11 + ni0Var.d) {
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

    public void setDelegate(fd0 fd0Var) {
        this.w = fd0Var;
    }
}
