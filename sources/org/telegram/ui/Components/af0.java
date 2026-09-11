package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class af0 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public hk0 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public ze0 v;
    public ff0 w;

    public final void a(int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 == 1) {
            if (this.a != 0) {
                return;
            }
            hk0 hk0Var = this.e;
            this.a = (int) Math.floor(com.google.android.gms.internal.vision.e2.A(x10, hk0Var.a, hk0Var.c / 5.0f, 1.0f));
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
        ff0 ff0Var = this.w;
        int i11 = ff0Var.f;
        gf0 gf0Var = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : ff0Var.d : ff0Var.c : ff0Var.b : ff0Var.a;
        int i12 = this.a;
        if (i12 == 1) {
            gf0Var.a = Math.max(0.0f, Math.min(100.0f, gf0Var.a + min));
        } else if (i12 == 2) {
            gf0Var.b = Math.max(0.0f, Math.min(100.0f, gf0Var.b + min));
        } else if (i12 == 3) {
            gf0Var.c = Math.max(0.0f, Math.min(100.0f, gf0Var.c + min));
        } else if (i12 == 4) {
            gf0Var.d = Math.max(0.0f, Math.min(100.0f, gf0Var.d + min));
        } else if (i12 == 5) {
            gf0Var.e = Math.max(0.0f, Math.min(100.0f, gf0Var.e + min));
        }
        invalidate();
        ze0 ze0Var = this.v;
        if (ze0Var != null) {
            jf0 jf0Var = ((bf0) ze0Var).a;
            jf0Var.g();
            vz vzVar = jf0Var.l0;
            if (vzVar != null) {
                vzVar.e(false, false, false);
            }
        }
        this.d = y3;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        gf0 gf0Var;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        ff0 ff0Var = this.w;
        hk0 hk0Var = this.e;
        float f7 = hk0Var.c / 5.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            float f10 = hk0Var.a;
            float f11 = i10 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = hk0Var.b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + hk0Var.d, this.f);
        }
        float f14 = hk0Var.a;
        float f15 = hk0Var.b;
        canvas.drawLine(f14, f15 + hk0Var.d, f14 + hk0Var.c, f15, this.h);
        int i11 = ff0Var.f;
        int i12 = 3;
        int i13 = 2;
        if (i11 == 0) {
            paint.setColor(-1);
            gf0Var = ff0Var.a;
        } else if (i11 == 1) {
            paint.setColor(-1229492);
            gf0Var = ff0Var.b;
        } else if (i11 == 2) {
            paint.setColor(-15667555);
            gf0Var = ff0Var.c;
        } else if (i11 != 3) {
            gf0Var = null;
        } else {
            paint.setColor(-13404165);
            gf0Var = ff0Var.d;
        }
        int i14 = 0;
        while (i14 < 5) {
            String format = i14 != 0 ? i14 != 1 ? i14 != i13 ? i14 != i12 ? i14 != 4 ? "" : String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.e / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.d / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.c / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.b / 100.0f)) : String.format(Locale.US, "%.2f", Float.valueOf(gf0Var.a / 100.0f));
            canvas.drawText(format, (i14 * f7) + com.google.android.gms.internal.vision.e2.A(f7, textPaint.measureText(format), 2.0f, hk0Var.a), (hk0Var.b + hk0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i14++;
            i12 = 3;
            i13 = 2;
        }
        float[] a2 = gf0Var.a();
        invalidate();
        path.reset();
        for (int i15 = 0; i15 < a2.length / 2; i15++) {
            if (i15 == 0) {
                int i16 = i15 * 2;
                path.moveTo((a2[i16] * hk0Var.c) + hk0Var.a, ((1.0f - a2[i16 + 1]) * hk0Var.d) + hk0Var.b);
            } else {
                int i17 = i15 * 2;
                path.lineTo((a2[i17] * hk0Var.c) + hk0Var.a, ((1.0f - a2[i17 + 1]) * hk0Var.d) + hk0Var.b);
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
                hk0 hk0Var = this.e;
                float f7 = hk0Var.a;
                if (x10 >= f7 && x10 <= f7 + hk0Var.c) {
                    float f10 = hk0Var.b;
                    if (y3 >= f10 && y3 <= f10 + hk0Var.d) {
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

    public void setDelegate(ze0 ze0Var) {
        this.v = ze0Var;
    }
}
