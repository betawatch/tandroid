package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class bg0 extends View {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public ml0 e;
    public Paint f;
    public Paint h;
    public Paint n;
    public TextPaint r;
    public Path s;
    public ag0 v;
    public gg0 w;

    public final void a(int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (i10 == 1) {
            if (this.a != 0) {
                return;
            }
            ml0 ml0Var = this.e;
            this.a = (int) Math.floor(com.google.android.gms.internal.vision.e2.z(x10, ml0Var.a, ml0Var.c / 5.0f, 1.0f));
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
        gg0 gg0Var = this.w;
        int i11 = gg0Var.f;
        hg0 hg0Var = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : gg0Var.d : gg0Var.c : gg0Var.b : gg0Var.a;
        int i12 = this.a;
        if (i12 == 1) {
            hg0Var.a = Math.max(0.0f, Math.min(100.0f, hg0Var.a + min));
        } else if (i12 == 2) {
            hg0Var.b = Math.max(0.0f, Math.min(100.0f, hg0Var.b + min));
        } else if (i12 == 3) {
            hg0Var.c = Math.max(0.0f, Math.min(100.0f, hg0Var.c + min));
        } else if (i12 == 4) {
            hg0Var.d = Math.max(0.0f, Math.min(100.0f, hg0Var.d + min));
        } else if (i12 == 5) {
            hg0Var.e = Math.max(0.0f, Math.min(100.0f, hg0Var.e + min));
        }
        invalidate();
        ag0 ag0Var = this.v;
        if (ag0Var != null) {
            kg0 kg0Var = ((cg0) ag0Var).a;
            kg0Var.g();
            l00 l00Var = kg0Var.l0;
            if (l00Var != null) {
                l00Var.e(false, false, false);
            }
        }
        this.d = y3;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        hg0 hg0Var;
        int i10;
        String format;
        TextPaint textPaint = this.r;
        Path path = this.s;
        Paint paint = this.n;
        gg0 gg0Var = this.w;
        ml0 ml0Var = this.e;
        float f7 = ml0Var.c / 5.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            float f10 = ml0Var.a;
            float f11 = i11 * f7;
            float f12 = f10 + f7 + f11;
            float f13 = ml0Var.b;
            canvas.drawLine(f12, f13, f11 + f10 + f7, f13 + ml0Var.d, this.f);
        }
        float f14 = ml0Var.a;
        float f15 = ml0Var.b;
        canvas.drawLine(f14, f15 + ml0Var.d, f14 + ml0Var.c, f15, this.h);
        int i12 = gg0Var.f;
        int i13 = 3;
        int i14 = 2;
        if (i12 == 0) {
            paint.setColor(-1);
            hg0Var = gg0Var.a;
        } else if (i12 == 1) {
            paint.setColor(-1229492);
            hg0Var = gg0Var.b;
        } else if (i12 == 2) {
            paint.setColor(-15667555);
            hg0Var = gg0Var.c;
        } else if (i12 != 3) {
            hg0Var = null;
        } else {
            paint.setColor(-13404165);
            hg0Var = gg0Var.d;
        }
        int i15 = 0;
        while (i15 < 5) {
            if (i15 == 0) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(hg0Var.a / 100.0f));
            } else if (i15 == 1) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(hg0Var.b / 100.0f));
            } else if (i15 == i14) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(hg0Var.c / 100.0f));
            } else if (i15 == i13) {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(hg0Var.d / 100.0f));
            } else if (i15 != 4) {
                format = "";
                i10 = i14;
            } else {
                i10 = i14;
                format = String.format(Locale.US, "%.2f", Float.valueOf(hg0Var.e / 100.0f));
            }
            canvas.drawText(format, (i15 * f7) + com.google.android.gms.internal.vision.e2.z(f7, textPaint.measureText(format), 2.0f, ml0Var.a), (ml0Var.b + ml0Var.d) - AndroidUtilities.dp(4.0f), textPaint);
            i15++;
            i14 = i10;
            i13 = 3;
        }
        float[] a2 = hg0Var.a();
        invalidate();
        path.reset();
        for (int i16 = 0; i16 < a2.length / 2; i16++) {
            if (i16 == 0) {
                int i17 = i16 * 2;
                path.moveTo((a2[i17] * ml0Var.c) + ml0Var.a, ((1.0f - a2[i17 + 1]) * ml0Var.d) + ml0Var.b);
            } else {
                int i18 = i16 * 2;
                path.lineTo((a2[i18] * ml0Var.c) + ml0Var.a, ((1.0f - a2[i18 + 1]) * ml0Var.d) + ml0Var.b);
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
                ml0 ml0Var = this.e;
                float f7 = ml0Var.a;
                if (x10 >= f7 && x10 <= f7 + ml0Var.c) {
                    float f10 = ml0Var.b;
                    if (y3 >= f10 && y3 <= f10 + ml0Var.d) {
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

    public void setDelegate(ag0 ag0Var) {
        this.v = ag0Var;
    }
}
