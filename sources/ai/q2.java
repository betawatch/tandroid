package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q2 extends FrameLayout {
    public final String E;
    public String F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public final c6 J;
    public final c6 K;
    public final c6 L;
    public final lc M;
    public float N;
    public long O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public float U;
    public final String[] V;
    public final View W;
    public final String a;
    public a1.e a0;
    public String b;
    public final Paint c;
    public final String d;
    public final boolean e;
    public final q f;
    public final lp h;
    public final TextPaint n;
    public final TextPaint r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final String y;

    public q2(Context context, String str, String str2, String str3, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.r = textPaint2;
        Paint paint2 = new Paint(1);
        this.s = paint2;
        this.w = new Paint(1);
        TextPaint textPaint3 = new TextPaint(1);
        this.x = textPaint3;
        String N0 = gd.N0(2131745064, null);
        this.y = N0;
        this.E = gd.N0(2131745031, null);
        this.F = N0;
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Path();
        kr krVar = kr.h;
        c6 c6Var = new c6(this, 0L, 300L, krVar);
        this.J = c6Var;
        c6 c6Var2 = new c6(this, 0L, 420L, krVar);
        this.K = c6Var2;
        c6 c6Var3 = new c6(this, 0L, 420L, krVar);
        this.L = c6Var3;
        this.M = new lc(this);
        setWillNotDraw(false);
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = z10;
        q M = str != null ? DictationAsr.M(str) : null;
        this.f = M;
        String[] d = M != null ? M.d(str) : new String[0];
        this.V = d;
        if (d.length > 1) {
            View view = new View(context);
            this.W = view;
            addView(view, new FrameLayout.LayoutParams(0, 0));
            this.b = l0.L(DictationAsr.g0(M, str));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        lp lpVar = new lp(26, context, null);
        this.h = lpVar;
        lpVar.setDrawUnchecked(false);
        lpVar.b(-1, -1, n6.Fi);
        lpVar.setDrawBackgroundAsArc(-1);
        addView(lpVar, na.d(26, 26.0f, (gd.a0 ? 3 : 5) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        lpVar.setImportantForAccessibility(2);
        View view2 = this.W;
        if (view2 != null) {
            view2.setImportantForAccessibility(2);
        }
        setFocusable(true);
        c();
        c6Var.e(true, this.U);
        float f10 = 1.0f;
        c6Var2.e(true, b() ? 0.0f : 1.0f);
        if (!this.Q && b()) {
            f10 = 0.0f;
        }
        c6Var3.e(true, f10);
    }

    public final void a() {
        if (this.Q) {
            return;
        }
        if (!this.P) {
            DictationAsr.v(this.f);
        } else if (this.R) {
            this.S = true;
            q f02 = DictationAsr.f0(this.a);
            if (f02 != null && DictationAsr.A(f02)) {
                DictationAsr.w(f02, true);
            }
        }
        c();
    }

    public final boolean b() {
        return !this.P || this.R || this.Q;
    }

    public final void c() {
        boolean z10;
        boolean z11;
        if (this.W != null) {
            String L = l0.L(DictationAsr.g0(this.f, this.a));
            if (!L.equals(this.b)) {
                this.b = L;
                requestLayout();
            }
        }
        boolean z12 = this.Q;
        if (this.f == null) {
            this.P = true;
            this.T = DictationAsr.z();
        } else {
            String str = this.a;
            q[] N = DictationAsr.N();
            int length = N.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    z10 = false;
                    break;
                }
                q qVar = N[i7];
                if (qVar.c(str) && DictationAsr.A(qVar)) {
                    z10 = true;
                    break;
                }
                i7++;
            }
            this.P = z10;
            this.T = z10 && !DictationAsr.z() && DictationAsr.B(this.a);
        }
        if (this.f != null) {
            String str2 = this.a;
            for (q qVar2 : DictationAsr.N()) {
                if (qVar2.c(str2) && qVar2.j) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!z11) {
            this.S = false;
        }
        boolean z13 = z11 && (!this.P || this.S);
        this.Q = z13;
        this.R = (!this.P || z13 || DictationAsr.f0(this.a) == null) ? false : true;
        if (b() && !this.Q) {
            this.F = this.P ? this.E : this.y;
        }
        float f10 = 0.0f;
        if (this.f != null) {
            String str3 = this.a;
            for (q qVar3 : DictationAsr.N()) {
                if (qVar3.c(str3) && qVar3.j) {
                    f10 = Math.max(f10, qVar3.k);
                }
            }
        }
        this.U = f10;
        this.h.a(this.T, isAttachedToWindow());
        if (z12 && !this.Q && this.P && isAttachedToWindow() && org.telegram.messenger.g0.C1()) {
            announceForAccessibility(gd.a0(null, null, 2131745075, this.b));
        }
        boolean z14 = this.P;
        if (z14 != (getBackground() != null)) {
            setBackground(z14 ? n6.N0(false) : null);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2 = canvas;
        boolean z10 = gd.a0;
        int x02 = n6.x0(null, n6.z6, false);
        int x03 = n6.x0(null, n6.Fi, false);
        float L = org.telegram.messenger.g0.L(25.0f);
        int x04 = n6.x0(null, n6.G6, false);
        TextPaint textPaint = this.n;
        textPaint.setColor(x04);
        TextPaint textPaint2 = this.r;
        textPaint2.setColor(x02);
        float measureText = textPaint.measureText(this.b);
        float L2 = L + org.telegram.messenger.g0.L(5.5f);
        canvas2.drawText(this.b, z10 ? (getWidth() - org.telegram.messenger.g0.L(21.0f)) - measureText : org.telegram.messenger.g0.L(21.0f), L2, textPaint);
        if (this.W != null) {
            Paint paint = this.c;
            paint.setColor(x02);
            float width = z10 ? ((getWidth() - org.telegram.messenger.g0.L(21.0f)) - measureText) - org.telegram.messenger.g0.L(12.0f) : org.telegram.messenger.g0.L(21.0f) + measureText + org.telegram.messenger.g0.L(12.0f);
            canvas2.drawLine(width - org.telegram.messenger.g0.L(4.5f), L - org.telegram.messenger.g0.L(2.0f), width, org.telegram.messenger.g0.L(2.5f) + L, paint);
            canvas2 = canvas;
            canvas2.drawLine(width, L + org.telegram.messenger.g0.L(2.5f), width + org.telegram.messenger.g0.L(4.5f), L - org.telegram.messenger.g0.L(2.0f), paint);
            measureText += org.telegram.messenger.g0.L(18.0f);
        }
        String str = this.d;
        if (str != null) {
            canvas2.drawText(str, z10 ? (((getWidth() - org.telegram.messenger.g0.L(21.0f)) - measureText) - org.telegram.messenger.g0.L(8.0f)) - textPaint2.measureText(str) : org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(21.0f) + measureText, L2, textPaint2);
        }
        float d = this.K.d(!b());
        float d2 = this.L.d(this.Q || !b());
        float e10 = this.J.e(false, this.U);
        this.h.setAlpha(d);
        if (d < 1.0f) {
            String str2 = this.F;
            TextPaint textPaint3 = this.x;
            float measureText2 = textPaint3.measureText(str2);
            f10 = 21.0f;
            float L3 = org.telegram.messenger.g0.L(28.0f) + measureText2;
            float L4 = org.telegram.messenger.g0.L(30.0f);
            float L5 = z10 ? org.telegram.messenger.g0.L(17.0f) + L3 : getWidth() - org.telegram.messenger.g0.L(17.0f);
            float f12 = L4 / 2.0f;
            RectF rectF = this.H;
            rectF.set(L5 - L3, L - f12, L5, L + f12);
            float f13 = 1.0f - d;
            float a10 = this.M.a(0.08f) * (1.0f - (d * 0.2f));
            canvas2.save();
            canvas2.scale(a10, a10, rectF.centerX(), rectF.centerY());
            int r12 = n6.r1(f13, x03);
            Paint paint2 = this.w;
            paint2.setColor(r12);
            canvas2.drawRoundRect(rectF, f12, f12, paint2);
            int x05 = n6.x0(null, n6.Ji, false);
            canvas2.save();
            Path path = this.I;
            path.rewind();
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
            canvas2.clipPath(path);
            float L6 = org.telegram.messenger.g0.L(16.0f);
            if (d2 < 1.0f) {
                textPaint3.setColor(n6.r1((1.0f - d2) * f13, x05));
                canvas2.save();
                canvas2.translate(0.0f, (-d2) * L6);
                canvas2.scale(1.0f, 1.0f - (0.4f * d2), rectF.centerX(), rectF.centerY());
                canvas2.drawText(this.F, rectF.centerX() - (measureText2 / 2.0f), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint3);
                canvas2.restore();
            }
            if (d2 > 0.0f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.O != 0) {
                    this.N = (((uptimeMillis - r5) * 0.36f) + this.N) % 360.0f;
                }
                this.O = uptimeMillis;
                float L7 = org.telegram.messenger.g0.L(8.0f);
                float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, d2, L6, rectF.centerY());
                RectF rectF2 = this.G;
                rectF2.set(rectF.centerX() - L7, z11 - L7, rectF.centerX() + L7, z11 + L7);
                int r13 = n6.r1(d2 * f13, x05);
                Paint paint3 = this.s;
                paint3.setColor(r13);
                canvas2.drawArc(rectF2, this.N - 90.0f, Math.max(0.1f, Math.min(0.9f, e10)) * 360.0f, false, paint3);
            }
            canvas.restore();
            canvas.restore();
            f11 = 0.0f;
            if (d2 > 0.0f || d > 0.0f) {
                invalidate();
            }
        } else {
            f10 = 21.0f;
            f11 = 0.0f;
            this.O = 0L;
        }
        if (this.e) {
            float L8 = z10 ? f11 : org.telegram.messenger.g0.L(f10);
            float height = getHeight() - 1;
            int width2 = getWidth();
            if (z10) {
                width2 -= org.telegram.messenger.g0.L(f10);
            }
            canvas.drawLine(L8, height, width2, getHeight() - 1, n6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder(this.b);
        String str = this.d;
        if (str != null) {
            sb2.append(", ");
            sb2.append(str);
        }
        boolean z10 = false;
        if (this.Q) {
            sb2.append(", ");
            sb2.append(gd.a0(null, null, 2131745074, Integer.valueOf(Math.round(this.U * 100.0f))));
        } else if (!this.P) {
            sb2.append(", ");
            sb2.append(gd.N0(2131745073, null));
        } else if (this.R) {
            sb2.append(", ");
            sb2.append(gd.N0(2131745072, null));
        }
        accessibilityNodeInfo.setText(sb2);
        accessibilityNodeInfo.setClassName(this.P ? "android.widget.CheckBox" : "android.widget.Button");
        accessibilityNodeInfo.setCheckable(this.P);
        if (this.P && this.T) {
            z10 = true;
        }
        accessibilityNodeInfo.setChecked(z10);
        if (!this.P && !this.Q) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.y));
        }
        if (this.R) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_speech_update, this.E));
        }
        if (this.W == null || this.a0 == null) {
            return;
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_speech_variants, gd.N0(2131745071, null)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        View view = this.W;
        if (view != null) {
            int measureText = (int) (this.n.measureText(this.b) + org.telegram.messenger.g0.L(18.0f));
            int L = org.telegram.messenger.g0.L(34.0f);
            int L2 = (org.telegram.messenger.g0.L(50.0f) - L) / 2;
            int z11 = gd.a0 ? f3.z(21.0f, getWidth(), measureText) : org.telegram.messenger.g0.L(21.0f);
            view.layout(z11 - org.telegram.messenger.g0.L(6.0f), L2, org.telegram.messenger.g0.L(6.0f) + z11 + measureText, L + L2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r0 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r2.i != false) goto L53;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        lc lcVar = this.M;
        if (action == 1) {
            float x10 = motionEvent.getX();
            if (this.W != null && this.a0 != null && x10 >= r5.getLeft() - org.telegram.messenger.g0.L(8.0f)) {
                if (x10 <= org.telegram.messenger.g0.L(8.0f) + r5.getRight() && !lcVar.i) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    super.onTouchEvent(obtain);
                    obtain.recycle();
                    this.a0.run();
                    return true;
                }
            }
        }
        RectF rectF = this.H;
        if (action == 0) {
            boolean z10 = b() && !this.Q && rectF.contains(motionEvent.getX(), motionEvent.getY());
            lcVar.c(z10);
        } else {
            if (action != 2) {
                if (action == 1 || action == 3) {
                    boolean z11 = lcVar.i;
                    lcVar.c(false);
                    if (z11) {
                        if (action == 1) {
                            performHapticFeedback(3);
                            a();
                            return true;
                        }
                    }
                }
                return lcVar.i || super.onTouchEvent(motionEvent);
            }
            if (lcVar.i && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                lcVar.c(false);
            }
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        a1.e eVar;
        if (i7 == R.id.acc_action_speech_update && this.R) {
            a();
            return true;
        }
        if (i7 != R.id.acc_action_speech_variants || this.W == null || (eVar = this.a0) == null) {
            return super.performAccessibilityAction(i7, bundle);
        }
        eVar.run();
        return true;
    }
}
