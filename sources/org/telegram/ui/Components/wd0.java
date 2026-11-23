package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wd0 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public aj0 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public vd0 w;
    public h2.c x;

    public final void a(int i7, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (i7 == 1) {
            if (this.a != 0) {
                return;
            }
            aj0 aj0Var = this.e;
            this.a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, aj0Var.a, aj0Var.c / 5.0f, 1.0f));
            return;
        }
        if (i7 != 2) {
            if ((i7 == 3 || i7 == 4 || i7 == 5) && this.a != 0) {
                this.a = 0;
                return;
            }
            return;
        }
        float min = Math.min(2.0f, (this.d - y10) / 8.0f);
        h2.c cVar = this.x;
        int i10 = cVar.a;
        be0 be0Var = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? null : (be0) cVar.e : (be0) cVar.d : (be0) cVar.c : (be0) cVar.b;
        int i11 = this.a;
        if (i11 == 1) {
            be0Var.a = org.telegram.messenger.m10.A(be0Var.a, min, 100.0f, 0.0f);
        } else if (i11 == 2) {
            be0Var.b = org.telegram.messenger.m10.A(be0Var.b, min, 100.0f, 0.0f);
        } else if (i11 == 3) {
            be0Var.c = org.telegram.messenger.m10.A(be0Var.c, min, 100.0f, 0.0f);
        } else if (i11 == 4) {
            be0Var.d = org.telegram.messenger.m10.A(be0Var.d, min, 100.0f, 0.0f);
        } else if (i11 == 5) {
            be0Var.e = org.telegram.messenger.m10.A(be0Var.e, min, 100.0f, 0.0f);
        }
        invalidate();
        vd0 vd0Var = this.w;
        if (vd0Var != null) {
            de0 de0Var = ((xd0) vd0Var).a;
            de0Var.d();
            bz bzVar = de0Var.m0;
            if (bzVar != null) {
                bzVar.c(false, false, false);
            }
        }
        this.d = y10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        be0 be0Var;
        int i7;
        String format;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        h2.c cVar = this.x;
        aj0 aj0Var = this.e;
        float f10 = aj0Var.c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f11 = aj0Var.a;
            float f12 = i10 * f10;
            float f13 = f11 + f10 + f12;
            float f14 = aj0Var.b;
            canvas.drawLine(f13, f14, f12 + f11 + f10, f14 + aj0Var.d, this.f);
        }
        float f15 = aj0Var.a;
        float f16 = aj0Var.b;
        canvas.drawLine(f15, f16 + aj0Var.d, f15 + aj0Var.c, f16, this.h);
        int i11 = cVar.a;
        int i12 = 3;
        int i13 = 2;
        if (i11 == 0) {
            paint.setColor(-1);
            be0Var = (be0) cVar.b;
        } else if (i11 == 1) {
            paint.setColor(-1229492);
            be0Var = (be0) cVar.c;
        } else if (i11 == 2) {
            paint.setColor(-15667555);
            be0Var = (be0) cVar.d;
        } else if (i11 != 3) {
            be0Var = null;
        } else {
            paint.setColor(-13404165);
            be0Var = (be0) cVar.e;
        }
        int i14 = 0;
        while (i14 < 5) {
            if (i14 == 0) {
                i7 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.a / 100.0f));
            } else if (i14 == 1) {
                i7 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.b / 100.0f));
            } else if (i14 == i13) {
                i7 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.c / 100.0f));
            } else if (i14 == i12) {
                i7 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.d / 100.0f));
            } else if (i14 != 4) {
                format = "";
                i7 = i13;
            } else {
                i7 = i13;
                format = String.format(Locale.US, "%.2f", Float.valueOf(be0Var.e / 100.0f));
            }
            canvas.drawText(format, (i14 * f10) + com.google.android.gms.internal.vision.e2.A(f10, textPaint.measureText(format), 2.0f, aj0Var.a), (aj0Var.b + aj0Var.d) - org.telegram.messenger.g0.L(4.0f), textPaint);
            i14++;
            i13 = i7;
            i12 = 3;
        }
        float[] a10 = be0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a10.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a10[i16] * aj0Var.c) + aj0Var.a, ((1.0f - a10[i16 + 1]) * aj0Var.d) + aj0Var.b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a10[i17] * aj0Var.c) + aj0Var.a, ((1.0f - a10[i17 + 1]) * aj0Var.d) + aj0Var.b);
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
                aj0 aj0Var = this.e;
                float f10 = aj0Var.a;
                if (x10 >= f10 && x10 <= f10 + aj0Var.c) {
                    float f11 = aj0Var.b;
                    if (y10 >= f11 && y10 <= f11 + aj0Var.d) {
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

    public void setDelegate(vd0 vd0Var) {
        this.w = vd0Var;
    }
}
