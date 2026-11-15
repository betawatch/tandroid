package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w2 extends FrameLayout {
    public final Path E;
    public final u5 F;
    public final u5 G;
    public final u5 H;
    public final dc I;
    public float J;
    public long K;
    public boolean L;
    public boolean M;
    public float N;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final t e;
    public final fp f;
    public final TextPaint h;
    public final TextPaint n;
    public final Paint r;
    public final Paint s;
    public final TextPaint w;
    public final RectF x;
    public final RectF y;

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
        this.x = new RectF();
        this.y = new RectF();
        this.E = new Path();
        er erVar = er.h;
        u5 u5Var = new u5(this, 0L, 300L, erVar);
        this.F = u5Var;
        u5 u5Var2 = new u5(this, 0L, 420L, erVar);
        this.G = u5Var2;
        u5 u5Var3 = new u5(this, 0L, 420L, erVar);
        this.H = u5Var3;
        this.I = new dc(this);
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
        fp fpVar = new fp(26, context, null);
        this.f = fpVar;
        fpVar.setDrawUnchecked(false);
        fpVar.b(-1, -1, j6.Fi);
        fpVar.setDrawBackgroundAsArc(-1);
        addView(fpVar, ja.d(26, 26.0f, (hd.a0 ? 3 : 5) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        b();
        u5Var.e(true, this.N);
        u5Var2.e(true, this.L ? 1.0f : 0.0f);
        u5Var3.e(true, (this.M || this.L) ? 1.0f : 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i7;
        if (this.L) {
            boolean v = DictationAsr.v();
            String str = this.a;
            if (v) {
                DictationAsr.S(str);
            } else {
                boolean y10 = DictationAsr.y(str);
                StringBuilder sb2 = new StringBuilder();
                String[] C = DictationAsr.C();
                int length = C.length;
                while (i7 < length) {
                    String str2 = C[i7];
                    if (str2.equals(str)) {
                        i7 = y10 ? i7 + 1 : 0;
                        if (sb2.length() > 0) {
                            sb2.append(',');
                        }
                        sb2.append(str2);
                    } else {
                        if (!DictationAsr.y(str2)) {
                        }
                        if (sb2.length() > 0) {
                        }
                        sb2.append(str2);
                    }
                }
                SharedPreferences.Editor putString = np.e1().edit().putString("asr_langs", sb2.toString());
                if (sb2.length() == 0) {
                    putString.putBoolean("asr_auto", true);
                }
                putString.apply();
            }
        } else if (!this.M) {
            DictationAsr.s(this.e);
        }
        b();
    }

    public final void b() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.e == null) {
            this.L = true;
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
            this.L = z10;
            z11 = z10 && !DictationAsr.v() && DictationAsr.y(this.a);
        }
        if (!this.L && this.e != null) {
            String str2 = this.a;
            for (t tVar2 : DictationAsr.I()) {
                if (tVar2.b(str2) && tVar2.h) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        this.M = z12;
        float f10 = 0.0f;
        if (this.e != null) {
            String str3 = this.a;
            for (t tVar3 : DictationAsr.I()) {
                if (tVar3.b(str3) && tVar3.h) {
                    f10 = Math.max(f10, tVar3.i);
                }
            }
        }
        this.N = f10;
        this.f.a(z11, isAttachedToWindow());
        boolean z13 = this.L;
        if (z13 != (getBackground() != null)) {
            setBackground(z13 ? j6.N0(false) : null);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f10;
        boolean z11 = hd.a0;
        int x02 = j6.x0(null, j6.z6, false);
        int x03 = j6.x0(null, j6.Fi, false);
        float L = org.telegram.messenger.g0.L(25.0f);
        int x04 = j6.x0(null, j6.G6, false);
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
        float d = this.G.d(this.L);
        float d2 = this.H.d(this.M || this.L);
        float e10 = this.F.e(false, this.N);
        this.f.setAlpha(d);
        if (d < 1.0f) {
            TextPaint textPaint3 = this.w;
            float measureText2 = textPaint3.measureText("Download");
            float L3 = measureText2 + org.telegram.messenger.g0.L(28.0f);
            float L4 = org.telegram.messenger.g0.L(30.0f);
            float L5 = z11 ? org.telegram.messenger.g0.L(17.0f) + L3 : getWidth() - org.telegram.messenger.g0.L(17.0f);
            float f11 = L4 / 2.0f;
            RectF rectF = this.y;
            rectF.set(L5 - L3, L - f11, L5, L + f11);
            float f12 = 1.0f - d;
            float a10 = this.I.a(0.08f) * (1.0f - (0.2f * d));
            canvas.save();
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            int r12 = j6.r1(f12, x03);
            Paint paint = this.s;
            paint.setColor(r12);
            canvas.drawRoundRect(rectF, f11, f11, paint);
            int x05 = j6.x0(null, j6.Ji, false);
            canvas.save();
            Path path = this.E;
            path.rewind();
            path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
            canvas.clipPath(path);
            float L6 = org.telegram.messenger.g0.L(16.0f);
            if (d2 < 1.0f) {
                textPaint3.setColor(j6.r1((1.0f - d2) * f12, x05));
                canvas.save();
                canvas.translate(0.0f, (-d2) * L6);
                canvas.scale(1.0f, 1.0f - (0.4f * d2), rectF.centerX(), rectF.centerY());
                canvas.drawText("Download", rectF.centerX() - (measureText2 / 2.0f), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint3);
                canvas.restore();
            }
            if (d2 > 0.0f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                z10 = z11;
                if (this.K != 0) {
                    this.J = (((uptimeMillis - r6) * 0.36f) + this.J) % 360.0f;
                }
                this.K = uptimeMillis;
                float L7 = org.telegram.messenger.g0.L(8.0f);
                float z12 = com.google.android.gms.internal.vision.e2.z(1.0f, d2, L6, rectF.centerY());
                RectF rectF2 = this.x;
                rectF2.set(rectF.centerX() - L7, z12 - L7, rectF.centerX() + L7, z12 + L7);
                int r13 = j6.r1(f12 * d2, x05);
                Paint paint2 = this.r;
                paint2.setColor(r13);
                canvas.drawArc(rectF2, this.J - 90.0f, Math.max(0.1f, Math.min(0.9f, e10)) * 360.0f, false, paint2);
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
            this.K = 0L;
        }
        if (this.d) {
            float L8 = z10 ? f10 : org.telegram.messenger.g0.L(21.0f);
            float height = getHeight() - 1;
            int width = getWidth();
            if (z10) {
                width -= org.telegram.messenger.g0.L(21.0f);
            }
            canvas.drawLine(L8, height, width, getHeight() - 1, j6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        RectF rectF = this.y;
        dc dcVar = this.I;
        if (action == 0) {
            boolean z10 = (this.L || this.M || !rectF.contains(motionEvent.getX(), motionEvent.getY())) ? false : true;
            dcVar.c(z10);
            if (z10) {
                return true;
            }
        } else if (action == 2) {
            if (dcVar.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                dcVar.c(false);
            }
            if (dcVar.i) {
                return true;
            }
        } else if (action == 1 || action == 3) {
            boolean z11 = dcVar.i;
            dcVar.c(false);
            if (z11) {
                if (action == 1) {
                    performHapticFeedback(3);
                    a();
                }
                return true;
            }
        }
        return dcVar.i || super.onTouchEvent(motionEvent);
    }
}
