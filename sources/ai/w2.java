package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class w2 extends FrameLayout {
    public String E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public final c6 I;
    public final c6 J;
    public final c6 K;
    public final mc L;
    public float M;
    public long N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final t e;
    public final mp f;
    public final TextPaint h;
    public final TextPaint n;
    public final Paint r;
    public final Paint s;
    public final TextPaint w;
    public final String x;
    public final String y;

    public w2(Context context, String str, String str2, String str3, boolean z10) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.n = textPaint2;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        TextPaint textPaint3 = new TextPaint(1);
        this.w = textPaint3;
        String M0 = gd.M0(2131745070, null);
        this.x = M0;
        this.y = gd.M0(2131745037, null);
        this.E = M0;
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        lr lrVar = lr.h;
        c6 c6Var = new c6(this, 0L, 300L, lrVar);
        this.I = c6Var;
        c6 c6Var2 = new c6(this, 0L, 420L, lrVar);
        this.J = c6Var2;
        c6 c6Var3 = new c6(this, 0L, 420L, lrVar);
        this.K = c6Var3;
        this.L = new mc(this);
        setWillNotDraw(false);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z10;
        this.e = str != null ? DictationAsr.H(str) : null;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        mp mpVar = new mp(26, context, null);
        this.f = mpVar;
        mpVar.setDrawUnchecked(false);
        mpVar.b(-1, -1, n6.Fi);
        mpVar.setDrawBackgroundAsArc(-1);
        addView(mpVar, ma.d(26, 26.0f, (gd.a0 ? 3 : 5) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        b();
        c6Var.e(true, this.S);
        float f10 = 1.0f;
        c6Var2.e(true, a() ? 0.0f : 1.0f);
        if (!this.P && a()) {
            f10 = 0.0f;
        }
        c6Var3.e(true, f10);
    }

    public final boolean a() {
        return !this.O || this.Q || this.P;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.e == null) {
            this.O = true;
            z11 = DictationAsr.v();
        } else {
            String str = this.a;
            t[] I = DictationAsr.I();
            int length = I.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    z10 = false;
                    break;
                }
                t tVar = I[i7];
                if (tVar.b(str) && DictationAsr.w(tVar)) {
                    z10 = true;
                    break;
                }
                i7++;
            }
            this.O = z10;
            z11 = z10 && !DictationAsr.v() && DictationAsr.y(this.a);
        }
        if (this.e != null) {
            String str2 = this.a;
            for (t tVar2 : DictationAsr.I()) {
                if (tVar2.b(str2) && tVar2.h) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (!z12) {
            this.R = false;
        }
        boolean z13 = z12 && (!this.O || this.R);
        this.P = z13;
        this.Q = (!this.O || z13 || DictationAsr.W(this.a) == null) ? false : true;
        if (a() && !this.P) {
            this.E = this.O ? this.y : this.x;
        }
        float f10 = 0.0f;
        if (this.e != null) {
            String str3 = this.a;
            for (t tVar3 : DictationAsr.I()) {
                if (tVar3.b(str3) && tVar3.h) {
                    f10 = Math.max(f10, tVar3.i);
                }
            }
        }
        this.S = f10;
        this.f.a(z11, isAttachedToWindow());
        boolean z14 = this.O;
        if (z14 != (getBackground() != null)) {
            setBackground(z14 ? n6.N0(false) : null);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f10;
        boolean z11 = gd.a0;
        int x02 = n6.x0(null, n6.z6, false);
        int x03 = n6.x0(null, n6.Fi, false);
        float L = org.telegram.messenger.g0.L(25.0f);
        int x04 = n6.x0(null, n6.G6, false);
        TextPaint textPaint = this.h;
        textPaint.setColor(x04);
        TextPaint textPaint2 = this.n;
        textPaint2.setColor(x02);
        String str = this.b;
        float measureText = textPaint.measureText(str);
        float L2 = org.telegram.messenger.g0.L(5.5f) + L;
        canvas.drawText(str, z11 ? (getWidth() - org.telegram.messenger.g0.L(21.0f)) - measureText : org.telegram.messenger.g0.L(21.0f), L2, textPaint);
        String str2 = this.c;
        if (str2 != null) {
            canvas.drawText(str2, z11 ? (((getWidth() - org.telegram.messenger.g0.L(21.0f)) - measureText) - org.telegram.messenger.g0.L(8.0f)) - textPaint2.measureText(str2) : org.telegram.messenger.g0.L(21.0f) + measureText + org.telegram.messenger.g0.L(8.0f), L2, textPaint2);
        }
        float d = this.J.d(!a());
        float d2 = this.K.d(this.P || !a());
        float e10 = this.I.e(false, this.S);
        this.f.setAlpha(d);
        if (d < 1.0f) {
            String str3 = this.E;
            TextPaint textPaint3 = this.w;
            float measureText2 = textPaint3.measureText(str3);
            float L3 = org.telegram.messenger.g0.L(28.0f) + measureText2;
            float L4 = org.telegram.messenger.g0.L(30.0f);
            float L5 = z11 ? org.telegram.messenger.g0.L(17.0f) + L3 : getWidth() - org.telegram.messenger.g0.L(17.0f);
            float f11 = L4 / 2.0f;
            RectF rectF = this.G;
            rectF.set(L5 - L3, L - f11, L5, L + f11);
            float f12 = 1.0f - d;
            float a10 = this.L.a(0.08f) * (1.0f - (0.2f * d));
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            int r12 = n6.r1(f12, x03);
            Paint paint = this.s;
            paint.setColor(r12);
            canvas.drawRoundRect(rectF, f11, f11, paint);
            int x05 = n6.x0(null, n6.Ji, false);
            canvas.save();
            Path path = this.H;
            path.rewind();
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
            canvas.clipPath(path);
            float L6 = org.telegram.messenger.g0.L(16.0f);
            if (d2 < 1.0f) {
                textPaint3.setColor(n6.r1((1.0f - d2) * f12, x05));
                canvas.save();
                canvas.translate(0.0f, (-d2) * L6);
                canvas.scale(1.0f, 1.0f - (0.4f * d2), rectF.centerX(), rectF.centerY());
                canvas.drawText(this.E, rectF.centerX() - (measureText2 / 2.0f), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint3);
                canvas.restore();
            }
            if (d2 > 0.0f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                z10 = z11;
                if (this.N != 0) {
                    this.M = (((uptimeMillis - r6) * 0.36f) + this.M) % 360.0f;
                }
                this.N = uptimeMillis;
                float L7 = org.telegram.messenger.g0.L(8.0f);
                float z12 = com.google.android.gms.internal.vision.e2.z(1.0f, d2, L6, rectF.centerY());
                RectF rectF2 = this.F;
                rectF2.set(rectF.centerX() - L7, z12 - L7, rectF.centerX() + L7, z12 + L7);
                int r13 = n6.r1(f12 * d2, x05);
                Paint paint2 = this.r;
                paint2.setColor(r13);
                canvas.drawArc(rectF2, this.M - 90.0f, Math.max(0.1f, Math.min(0.9f, e10)) * 360.0f, false, paint2);
            } else {
                z10 = z11;
            }
            canvas.restore();
            canvas.restore();
            f10 = 0.0f;
            if (d2 > 0.0f || d > 0.0f) {
                invalidate();
            }
        } else {
            z10 = z11;
            f10 = 0.0f;
            this.N = 0L;
        }
        if (this.d) {
            float L8 = z10 ? f10 : org.telegram.messenger.g0.L(21.0f);
            float height = getHeight() - 1;
            int width = getWidth();
            if (z10) {
                width -= org.telegram.messenger.g0.L(21.0f);
            }
            canvas.drawLine(L8, height, width, getHeight() - 1, n6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.G;
        mc mcVar = this.L;
        if (action == 0) {
            boolean z10 = a() && !this.P && rectF.contains(motionEvent.getX(), motionEvent.getY());
            mcVar.c(z10);
            if (z10) {
                return true;
            }
        } else if (action == 2) {
            if (mcVar.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                mcVar.c(false);
            }
            if (mcVar.i) {
                return true;
            }
        } else if (action == 1 || action == 3) {
            boolean z11 = mcVar.i;
            mcVar.c(false);
            if (z11) {
                if (action == 1) {
                    performHapticFeedback(3);
                    if (!this.P) {
                        if (!this.O) {
                            DictationAsr.r(this.e);
                        } else if (this.Q) {
                            this.R = true;
                            t W = DictationAsr.W(this.a);
                            if (W != null && DictationAsr.w(W)) {
                                DictationAsr.s(W, true);
                            }
                        }
                        b();
                    }
                }
                return true;
            }
        }
        return mcVar.i || super.onTouchEvent(motionEvent);
    }
}
