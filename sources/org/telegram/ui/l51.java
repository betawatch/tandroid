package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class l51 implements if0 {
    public final float A;
    public final bn B;
    public final LinearGradient C;
    public final float D;
    public final h2.f E;
    public final org.telegram.messenger.dj F;
    public final NinePatchDrawable G;
    public final rj H;
    public final org.telegram.ui.Components.u5 I;
    public float J;
    public float K;
    public final float L;
    public final int M;
    public final int N;
    public final org.telegram.ui.ActionBar.h6 O;
    public final PointF P;
    public final RectF Q;
    public final RectF R;
    public float[] S;
    public final float T;
    public float a;
    public final Paint b;
    public final boolean c;
    public final ValueAnimator d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final float j;
    public final org.telegram.messenger.gj k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final StaticLayout q;
    public final StaticLayout r;
    public final org.telegram.ui.Cells.r1 s;
    public final org.telegram.ui.Components.ek0 t;
    public final org.telegram.ui.Components.ti u;
    public final Matrix v;
    public final Paint w;
    public final int x;
    public final float y;
    public final float z;

    public l51(org.telegram.ui.Cells.r1 r1Var, bn bnVar, org.telegram.ui.Components.ek0 ek0Var, org.telegram.ui.Components.ti tiVar, org.telegram.ui.ActionBar.h6 h6Var) {
        float f10;
        int i7;
        float f11;
        float f12;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.u4 M1;
        int i12;
        Object[] spans;
        Paint paint = new Paint(1);
        this.b = paint;
        this.E = new h2.f((int[]) null);
        PointF pointF = new PointF();
        this.P = pointF;
        this.Q = new RectF();
        this.R = new RectF();
        this.O = h6Var;
        if (r1Var.getMessageObject().B2 == null || r1Var.getMessageObject().B2.size() > 1 || r1Var.getMessageObject().B2.isEmpty() || ((org.telegram.messenger.dj) r1Var.getMessageObject().B2.get(0)).e.getLineCount() > 10) {
            return;
        }
        this.s = r1Var;
        this.t = ek0Var;
        this.u = tiVar;
        this.B = bnVar;
        rj rjVar = bnVar.a0;
        this.H = rjVar;
        if (rjVar == null || rjVar.getEditField() == null || rjVar.getEditField().getLayout() == null) {
            return;
        }
        rjVar.getRecordCircle();
        paint.setFilterBitmap(true);
        this.k = r1Var.getMessageObject();
        if (!r1Var.getTransitionParams().w0) {
            r1Var.draw(new Canvas());
        }
        r1Var.setEnterTransitionInProgress(true);
        Editable editText = rjVar.getEditText();
        CharSequence charSequence = r1Var.getMessageObject().v;
        this.n = false;
        this.o = rjVar.t6 != 0 && SystemClock.uptimeMillis() - rjVar.t6 < 1500;
        rjVar.getEditField().getLayout().getHeight();
        TextPaint textPaint = org.telegram.ui.ActionBar.m6.o2;
        org.telegram.messenger.g0.L(20.0f);
        if (r1Var.getMessageObject().P1 != 0) {
            boolean z10 = r1Var.getMessageObject().P1 == r1Var.getMessageObject().Q1;
            f10 = 4.0f;
            switch (Math.max(r1Var.getMessageObject().P1, r1Var.getMessageObject().Q1)) {
                case 0:
                case 1:
                case 2:
                    if (z10) {
                        textPaint = org.telegram.ui.ActionBar.m6.y2[0];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.m6.y2[2];
                        break;
                    }
                case 3:
                    if (z10) {
                        textPaint = org.telegram.ui.ActionBar.m6.y2[1];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.m6.y2[3];
                        break;
                    }
                case 4:
                    if (z10) {
                        textPaint = org.telegram.ui.ActionBar.m6.y2[2];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.m6.y2[4];
                        break;
                    }
                case 5:
                    if (z10) {
                        textPaint = org.telegram.ui.ActionBar.m6.y2[3];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.m6.y2[5];
                        break;
                    }
                case 6:
                    if (z10) {
                        textPaint = org.telegram.ui.ActionBar.m6.y2[4];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.m6.y2[5];
                        break;
                    }
                default:
                    textPaint = org.telegram.ui.ActionBar.m6.y2[5];
                    break;
            }
            if (textPaint != null) {
                textPaint.getTextSize();
                org.telegram.messenger.g0.L(4.0f);
            }
        } else {
            f10 = 4.0f;
        }
        boolean z11 = (charSequence instanceof Spannable) && (spans = ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class)) != null && spans.length > 0;
        if (editText.length() != charSequence.length() || z11) {
            this.n = true;
            int[] iArr = new int[1];
            CharSequence N3 = org.telegram.messenger.g0.N3(editText, iArr);
            if (iArr[0] > 0) {
                i7 = rjVar.getEditField().getLayout().getLineTop(rjVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                rjVar.getEditField().getLayout().getLineBottom(rjVar.getEditField().getLayout().getLineForOffset(N3.length() + iArr[0]));
            } else {
                i7 = 0;
            }
            org.telegram.ui.Components.y5.cloneSpans(charSequence);
            charSequence = org.telegram.messenger.j6.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
        } else {
            i7 = 0;
        }
        float textSize = rjVar.getEditField().getTextSize() / textPaint.getTextSize();
        this.D = textSize;
        int lineCount = rjVar.getEditField().getLayout().getLineCount();
        int width = (int) (rjVar.getEditField().getLayout().getWidth() / textSize);
        if (Build.VERSION.SDK_INT >= 24) {
            this.q = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
        } else {
            this.q = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.I = org.telegram.ui.Components.y5.update(2, (View) null, this.I, this.q);
        jh.k.b(rjVar.getEditField(), bnVar.m1, pointF);
        float f13 = pointF.y;
        this.z = pointF.x;
        this.A = ((org.telegram.messenger.g0.L(10.0f) + f13) - rjVar.getEditField().getScrollY()) + i7;
        float f14 = 0.0f;
        this.l = 0.0f;
        float f15 = Float.MAX_VALUE;
        for (int i13 = 0; i13 < this.q.getLineCount(); i13++) {
            float lineLeft = this.q.getLineLeft(i13);
            if (lineLeft < f15) {
                f15 = lineLeft;
            }
        }
        if (f15 != Float.MAX_VALUE) {
            this.l = f15;
        }
        this.q.getHeight();
        float L = org.telegram.messenger.g0.L(f10) + f13;
        this.j = L;
        float f16 = 12.0f;
        if (this.H.Z0()) {
            this.j = L - org.telegram.messenger.g0.L(12.0f);
        }
        this.y = f13 + rjVar.getEditField().getMeasuredHeight();
        org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) r1Var.getMessageObject().B2.get(0);
        this.F = djVar;
        StaticLayout staticLayout = djVar.e;
        int i14 = org.telegram.ui.ActionBar.m6.Wc;
        double h = i0.a.h(org.telegram.ui.ActionBar.m6.w0(i14, this.O));
        int i15 = org.telegram.ui.ActionBar.m6.Le;
        if (Math.abs(h - i0.a.h(org.telegram.ui.ActionBar.m6.w0(i15, this.O))) > 0.20000000298023224d) {
            this.n = true;
            this.p = true;
        }
        this.M = org.telegram.ui.ActionBar.m6.w0(i15, this.O);
        this.N = org.telegram.ui.ActionBar.m6.w0(i14, this.O);
        if (staticLayout.getLineCount() == this.q.getLineCount()) {
            lineCount = staticLayout.getLineCount();
            int i16 = 0;
            i10 = 0;
            i11 = 0;
            while (true) {
                if (i16 < lineCount) {
                    f12 = f16;
                    StaticLayout staticLayout2 = this.q;
                    f11 = f14;
                    if (staticLayout2.getLineRight(i16) != staticLayout2.getWidth() || staticLayout2.getLineLeft(i16) == f11) {
                        i10++;
                    } else {
                        i11++;
                    }
                    if (staticLayout.getLineEnd(i16) != this.q.getLineEnd(i16)) {
                        this.n = true;
                    } else {
                        i16++;
                        f16 = f12;
                        f14 = f11;
                    }
                } else {
                    f11 = f14;
                    f12 = f16;
                }
            }
        } else {
            f11 = 0.0f;
            f12 = 12.0f;
            this.n = true;
            i10 = 0;
            i11 = 0;
        }
        if (!this.n && i11 > 0 && i10 > 0) {
            SpannableString spannableString = new SpannableString(charSequence);
            SpannableString spannableString2 = new SpannableString(charSequence);
            float f17 = Float.MAX_VALUE;
            int i17 = 0;
            while (i17 < lineCount) {
                StaticLayout staticLayout3 = this.q;
                if (staticLayout3.getLineRight(i17) != staticLayout3.getWidth() || staticLayout3.getLineLeft(i17) == f11) {
                    i12 = lineCount;
                    spannableString2.setSpan(new org.telegram.ui.Components.uy(false), this.q.getLineStart(i17), this.q.getLineEnd(i17), 0);
                } else {
                    i12 = lineCount;
                    spannableString.setSpan(new org.telegram.ui.Components.uy(false), this.q.getLineStart(i17), this.q.getLineEnd(i17), 0);
                    float lineLeft2 = this.q.getLineLeft(i17);
                    if (lineLeft2 < f17) {
                        f17 = lineLeft2;
                    }
                }
                i17++;
                lineCount = i12;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.q = hyphenationFrequency.setAlignment(alignment).build();
                this.r = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
            } else {
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                TextPaint textPaint2 = textPaint;
                this.q = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                this.r = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
            }
        }
        this.m = this.q.getWidth() - ((org.telegram.messenger.dj) r1Var.getMessageObject().B2.get(0)).e.getWidth();
        boolean z12 = (r1Var.getMessageObject().N1() == 0 || r1Var.Q7 == null) ? false : true;
        this.c = z12;
        if (z12) {
            org.telegram.ui.ActionBar.m5 m5Var = ((org.telegram.ui.Components.so[]) bnVar.c0.b)[0].c;
            jh.k.b(m5Var, bnVar.m1, this.P);
            PointF pointF2 = this.P;
            this.e = pointF2.x;
            this.g = pointF2.y;
            this.f = ((View) m5Var.getParent()).getWidth();
            org.telegram.ui.ActionBar.m5 m5Var2 = ((org.telegram.ui.Components.so[]) bnVar.c0.b)[0].d;
            jh.k.b(m5Var2, bnVar.m1, this.P);
            float f18 = this.P.y;
            this.h = m5Var.getTextColor();
            this.i = m5Var2.getTextColor();
            this.j -= org.telegram.messenger.g0.L(46.0f);
        }
        this.T = ek0Var.getPaddingBottom() - (bnVar.ad - rjVar.getRestingFieldHeight());
        this.v = new Matrix();
        Paint paint2 = new Paint(1);
        this.w = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, org.telegram.messenger.g0.L(f12), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.C = linearGradient;
        paint2.setShader(linearGradient);
        this.x = r1Var.getMessageObject().m1;
        float f19 = f11;
        rjVar.getEditField().setAlpha(f19);
        rjVar.setTextTransitionIsRunning(true);
        StaticLayout staticLayout4 = r1Var.Q7;
        if (staticLayout4 != null && staticLayout4.getText().length() > 1 && r1Var.Q7.getPrimaryHorizontal(0) != f19) {
            this.L = r1Var.Q7.getWidth() - r1Var.Q7.getLineWidth(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new ss0(this, rjVar, tiVar, 1));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(250L);
        ((ArrayList) tiVar.c).add(this);
        tiVar.a();
        ((ViewGroup) tiVar.d).invalidate();
        this.E.d();
        ofFloat.addListener(new org.telegram.ui.Components.w10(this, tiVar, r1Var, rjVar, bnVar));
        if (org.telegram.messenger.cz.o() != 2 || (M1 = r1Var.M1(true)) == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Je, this.O);
        Rect rect = M1.o;
        if (M1.F == null) {
            Bitmap createBitmap = Bitmap.createBitmap(M1.b(50.0f), M1.b(40.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            rect.set(M1.getBounds());
            Paint paint3 = new Paint(1);
            paint3.setColor(-1);
            M1.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            M1.c(canvas, paint3);
            M1.F = new NinePatchDrawable(createBitmap, c8.q0.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
            M1.setBounds(rect);
        }
        if (M1.G != w02) {
            M1.G = w02;
            M1.F.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        this.G = M1.F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x03fb, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.z) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0413, code lost:
    
        if ((org.telegram.messenger.gj.n1(r4.C.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0466, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.z) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x047e, code lost:
    
        if ((org.telegram.messenger.gj.n1(r4.C.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:204:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0773  */
    @Override // org.telegram.ui.if0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2;
        int i7;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        ImageReceiver imageReceiver;
        ArrayList arrayList;
        org.telegram.ui.Cells.y1 y1Var;
        float f19;
        float f20;
        float f21;
        org.telegram.ui.Components.ti tiVar;
        float f22;
        org.telegram.messenger.gj gjVar;
        bn bnVar;
        float f23;
        org.telegram.ui.Cells.r1 r1Var;
        int i10;
        float f24;
        float f25;
        float f26;
        float f27;
        l51 l51Var;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        bn bnVar2;
        float f33;
        float f34;
        float f35;
        float f36;
        boolean z10;
        org.telegram.ui.Cells.y1 y1Var2;
        int i11;
        boolean z11;
        float f37;
        org.telegram.ui.Cells.r1 r1Var2;
        float f38;
        float f39;
        org.telegram.messenger.dj djVar;
        Canvas canvas3;
        float f40;
        float f41;
        int i12;
        int i13;
        float f42;
        float f43;
        int w02;
        int i14;
        int i15;
        float f44;
        org.telegram.messenger.gj gjVar2;
        int w03;
        float f45;
        float f46;
        float f47;
        float f48;
        RectF rectF;
        float f49;
        int i16;
        StaticLayout staticLayout;
        float f50;
        int i17;
        float f51;
        org.telegram.ui.Components.ek0 ek0Var = this.t;
        float y10 = ek0Var.getY();
        org.telegram.ui.Components.ti tiVar2 = this.u;
        float y11 = (y10 - tiVar2.getY()) + ek0Var.getMeasuredHeight();
        float x10 = this.z - tiVar2.getX();
        float y12 = this.A - tiVar2.getY();
        org.telegram.ui.Cells.r1 r1Var3 = this.s;
        int textX = r1Var3.getTextX();
        org.telegram.ui.Cells.y1 y1Var3 = r1Var3.ib;
        ImageReceiver imageReceiver2 = r1Var3.T7;
        ArrayList arrayList2 = r1Var3.Tb;
        this.J = textX;
        this.K = r1Var3.getTextY();
        if (r1Var3.getMessageObject().m1 != this.x) {
            return;
        }
        float x11 = (ek0Var.getX() + r1Var3.getX()) - tiVar2.getX();
        float top = ((ek0Var.getTop() + (r1Var3.getPaddingTop() + r1Var3.getTop())) - tiVar2.getY()) - (this.T - ek0Var.getPaddingBottom());
        float interpolation = pi.k.V.getInterpolation(this.a);
        float f52 = this.a;
        float f53 = f52 > 0.4f ? 1.0f : f52 / 0.4f;
        float f54 = 1.0f - f53;
        float f55 = f53;
        if (this.o) {
            float min = 1.0f - Math.min(1.0f, f52 / 0.14f);
            float max = Math.max(0.0f, Math.min(1.0f, (this.a - 0.08f) / 0.16f));
            f10 = min;
            f11 = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
        } else {
            f10 = f54;
            f11 = f55;
        }
        float interpolation2 = org.telegram.ui.Components.nr.g.getInterpolation(org.telegram.ui.Components.nr.h.getInterpolation(this.a));
        float f56 = this.J + x11;
        float f57 = this.K + top;
        float f58 = 1.0f - interpolation2;
        int measuredHeight = (int) ((y11 * interpolation2) + (tiVar2.getMeasuredHeight() * f58));
        boolean z12 = r1Var3.getBottom() - org.telegram.messenger.g0.L(4.0f) > ek0Var.getMeasuredHeight() && (((float) r1Var3.getMeasuredHeight()) + top) - ((float) org.telegram.messenger.g0.L(8.0f)) > ((float) measuredHeight) && tiVar2.getMeasuredHeight() > 0;
        if (z12) {
            float max2 = Math.max(0.0f, top);
            float measuredWidth = tiVar2.getMeasuredWidth();
            float measuredHeight2 = tiVar2.getMeasuredHeight();
            arrayList = arrayList2;
            f20 = interpolation2;
            f14 = x11;
            i7 = measuredHeight;
            f12 = x10;
            f13 = f56;
            f16 = 3.0f;
            f18 = interpolation;
            y1Var = y1Var3;
            f19 = f55;
            tiVar = tiVar2;
            f22 = top;
            canvas2 = canvas;
            f15 = f58;
            imageReceiver = imageReceiver2;
            f21 = f57;
            f17 = 2.0f;
            canvas2.saveLayerAlpha(0.0f, max2, measuredWidth, measuredHeight2, org.telegram.messenger.ls.e4, 31);
        } else {
            canvas2 = canvas;
            i7 = measuredHeight;
            f12 = x10;
            f13 = f56;
            f14 = x11;
            f15 = f58;
            f16 = 3.0f;
            f17 = 2.0f;
            f18 = interpolation;
            imageReceiver = imageReceiver2;
            arrayList = arrayList2;
            y1Var = y1Var3;
            f19 = f55;
            f20 = interpolation2;
            f21 = f57;
            tiVar = tiVar2;
            f22 = top;
        }
        canvas2.save();
        float y13 = ek0Var.getY();
        bn bnVar3 = this.B;
        canvas2.clipRect(0.0f, ((bnVar3.P9 + y13) - tiVar.getY()) - org.telegram.messenger.g0.L(f16), tiVar.getMeasuredWidth(), tiVar.getMeasuredHeight());
        canvas2.save();
        float f59 = this.l;
        float backgroundDrawableLeft = f14 + r1Var3.getBackgroundDrawableLeft() + ((f12 - (f13 - f59)) * f15);
        float backgroundDrawableTop = r1Var3.getBackgroundDrawableTop() + f22;
        float f60 = 1.0f - f18;
        float y14 = (backgroundDrawableTop * f18) + ((this.j - tiVar.getY()) * f60);
        float b10 = org.telegram.messenger.o10.b(backgroundDrawableTop, r1Var3.getBackgroundDrawableBottom() - r1Var3.getBackgroundDrawableTop(), f18, (this.y - tiVar.getY()) * f60);
        int L = (int) ((org.telegram.messenger.g0.L(4.0f) * f15) + f14 + r1Var3.getBackgroundDrawableRight());
        org.telegram.messenger.gj gjVar3 = this.k;
        float f61 = f20;
        org.telegram.ui.ActionBar.u4 M1 = !gjVar3.I2() ? r1Var3.M1(true) : null;
        if (M1 != null) {
            f23 = f18;
            r1Var3.setBackgroundTopY(tiVar.getTop() - ek0Var.getTop());
            Drawable k10 = M1.k();
            if (f19 != 1.0f) {
                gjVar = gjVar3;
                NinePatchDrawable ninePatchDrawable = this.G;
                bnVar = bnVar3;
                if (ninePatchDrawable != null) {
                    r1Var = r1Var3;
                    ninePatchDrawable.setBounds((int) backgroundDrawableLeft, (int) y14, L, (int) b10);
                    ninePatchDrawable.draw(canvas2);
                    if (k10 != null) {
                        k10.setAlpha((int) (f61 * 255.0f));
                        k10.setBounds((int) backgroundDrawableLeft, (int) y14, L, (int) b10);
                        k10.draw(canvas2);
                        k10.setAlpha(org.telegram.messenger.ls.e4);
                    }
                    M1.setAlpha((int) (f19 * 255.0f));
                    M1.setBounds((int) backgroundDrawableLeft, (int) y14, L, (int) b10);
                    M1.I = true;
                    M1.draw(canvas2);
                    M1.I = false;
                    M1.setAlpha(org.telegram.messenger.ls.e4);
                }
            } else {
                gjVar = gjVar3;
                bnVar = bnVar3;
            }
            r1Var = r1Var3;
            if (k10 != null) {
            }
            M1.setAlpha((int) (f19 * 255.0f));
            M1.setBounds((int) backgroundDrawableLeft, (int) y14, L, (int) b10);
            M1.I = true;
            M1.draw(canvas2);
            M1.I = false;
            M1.setAlpha(org.telegram.messenger.ls.e4);
        } else {
            gjVar = gjVar3;
            bnVar = bnVar3;
            f23 = f18;
            r1Var = r1Var3;
        }
        canvas2.restore();
        canvas2.save();
        if (M1 != null) {
            if (gjVar.P3()) {
                canvas2.clipRect(org.telegram.messenger.g0.L(4.0f) + backgroundDrawableLeft, org.telegram.messenger.g0.L(4.0f) + y14, L - org.telegram.messenger.g0.L(10.0f), b10 - org.telegram.messenger.g0.L(4.0f));
            } else {
                canvas2.clipRect(org.telegram.messenger.g0.L(4.0f) + backgroundDrawableLeft, org.telegram.messenger.g0.L(4.0f) + y14, L - org.telegram.messenger.g0.L(4.0f), b10 - org.telegram.messenger.g0.L(4.0f));
            }
        }
        float x12 = (ek0Var.getX() + r1Var.getLeft()) - tiVar.getX();
        float z13 = com.google.android.gms.internal.vision.e2.z(y12, f21, f60, f22);
        canvas2.translate(x12, z13);
        org.telegram.ui.Cells.r1 r1Var4 = r1Var;
        r1Var4.y1(f19, canvas2, false);
        r1Var4.h1(canvas2, f19);
        r1Var4.U0(canvas2, f19);
        r1Var4.Q0(f19, canvas2, false);
        r1Var4.o1(canvas2, f19, null);
        r1Var4.V0(canvas2, f19);
        r1Var4.e1(canvas2, f19);
        canvas2.restore();
        if (this.c) {
            bn bnVar4 = bnVar;
            ((org.telegram.ui.Components.so[]) bnVar4.c0.b)[0].c.setAlpha(0.0f);
            ((org.telegram.ui.Components.so[]) bnVar4.c0.b)[0].d.setAlpha(0.0f);
            org.telegram.messenger.g0.L(35.0f);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            float x13 = this.e - tiVar.getX();
            float y15 = this.g - tiVar.getY();
            float f62 = f14 + r1Var4.U7;
            i10 = L;
            float f63 = r1Var4.V7 + f22;
            if (r1Var4.p8 == null) {
                r1Var4.p8 = new org.telegram.ui.Components.ok0(r1Var4);
            }
            f24 = backgroundDrawableLeft;
            r1Var4.p8.a(r1Var4.getMessageObject(), r1Var4.getCurrentUser(), r1Var4.getCurrentChat(), this.O, 0);
            boolean P5 = gjVar.P5();
            org.telegram.ui.ActionBar.h6 h6Var = this.O;
            if (P5) {
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Od, h6Var);
                b(org.telegram.ui.ActionBar.m6.Md);
            } else {
                org.telegram.ui.Components.ok0 ok0Var = r1Var4.p8;
                if (ok0Var != null) {
                    i14 = ok0Var.I.c;
                    if (!gjVar.P5()) {
                        i15 = L2;
                        f26 = f60;
                        f44 = f21;
                        gjVar2 = gjVar;
                        f25 = y14;
                        org.telegram.ui.Components.ok0 ok0Var2 = r1Var4.p8;
                        if (ok0Var2 != null) {
                            w03 = ok0Var2.I.c;
                        } else {
                            if (gjVar2.B2()) {
                                org.telegram.messenger.gj gjVar4 = gjVar2.C;
                                if (gjVar4.D == 0 || !TextUtils.isEmpty(gjVar4.z)) {
                                    TLRPC.MessageMedia messageMedia = gjVar2.C.k.media;
                                    if (!(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                                        w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ub, h6Var);
                                    }
                                }
                            }
                            w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Vb, h6Var);
                        }
                    } else if (!gjVar.P3()) {
                        i15 = L2;
                        f26 = f60;
                        f44 = f21;
                        gjVar2 = gjVar;
                        f25 = y14;
                        if (!gjVar2.f4()) {
                            int w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Pd, h6Var);
                            if (!gjVar2.l2) {
                                if (gjVar2.B2()) {
                                    org.telegram.messenger.gj gjVar5 = gjVar2.C;
                                    if (gjVar5.D != 0) {
                                    }
                                    if (!(org.telegram.messenger.gj.n1(gjVar2.C.k) instanceof TLRPC.TL_messageMediaGame)) {
                                    }
                                }
                                if (!r1Var4.N7) {
                                    w04 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Qd, h6Var);
                                    f50 = 0.6f;
                                    w03 = i0.a.f(f50, w04, org.telegram.ui.ActionBar.m6.c(w04, i14));
                                }
                            }
                            f50 = 0.0f;
                            w03 = i0.a.f(f50, w04, org.telegram.ui.ActionBar.m6.c(w04, i14));
                        }
                        w03 = i14;
                    } else if (gjVar.f4()) {
                        i15 = L2;
                        f26 = f60;
                        f44 = f21;
                        gjVar2 = gjVar;
                        f25 = y14;
                        w03 = i14;
                    } else {
                        i15 = L2;
                        int w05 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ub, h6Var);
                        gjVar2 = gjVar;
                        f25 = y14;
                        if (gjVar2.l2) {
                            f26 = f60;
                        } else {
                            if (gjVar2.B2()) {
                                org.telegram.messenger.gj gjVar6 = gjVar2.C;
                                f26 = f60;
                                if (gjVar6.D != 0) {
                                }
                                if (!(org.telegram.messenger.gj.n1(gjVar2.C.k) instanceof TLRPC.TL_messageMediaGame)) {
                                }
                            } else {
                                f26 = f60;
                            }
                            if (!r1Var4.N7) {
                                i17 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Vb, h6Var);
                                f51 = 0.6f;
                                f44 = f21;
                                w03 = i0.a.f(f51, i17, org.telegram.ui.ActionBar.m6.c(i17, i14));
                            }
                        }
                        i17 = w05;
                        f51 = 0.0f;
                        f44 = f21;
                        w03 = i0.a.f(f51, i17, org.telegram.ui.ActionBar.m6.c(i17, i14));
                    }
                    f28 = b10;
                    f33 = f23;
                    org.telegram.ui.ActionBar.m6.Z2.setColor(i0.a.f(f33, this.i, w03));
                    org.telegram.ui.ActionBar.m6.Y2.setColor(i0.a.f(f33, this.h, i14));
                    float L3 = !r1Var4.d8 ? x13 - org.telegram.messenger.g0.L(44.0f) : x13;
                    float T1 = org.telegram.messenger.g0.T1(L3, f62, f61);
                    float T12 = org.telegram.messenger.g0.T1((org.telegram.messenger.g0.L(12.0f) * f33) + y15, f63, f33);
                    if (this.S != null) {
                        this.S = new float[]{r1, r1, 0.0f, 0.0f, 0.0f, 0.0f, r1, r1};
                        f45 = f62;
                        float L4 = org.telegram.messenger.g0.L(4.0f);
                        float[] fArr = this.S;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[2] = 0.0f;
                    } else {
                        f45 = f62;
                    }
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(L3, y15, this.f + L3, org.telegram.messenger.g0.L(35.0f) + y15);
                    rectF2.offset(0.0f, org.telegram.messenger.g0.L(12.0f) * f33);
                    RectF rectF3 = r1Var4.Ma;
                    RectF rectF4 = this.R;
                    rectF4.set(rectF3);
                    rectF4.offset(f14, z13);
                    RectF rectF5 = this.Q;
                    org.telegram.messenger.g0.Z1(rectF2, rectF4, f61, rectF5);
                    int i18 = i15;
                    org.telegram.messenger.gj gjVar7 = gjVar2;
                    float f64 = f19;
                    f29 = y12;
                    f32 = f59;
                    f34 = z13;
                    r1Var4.p8.e(canvas, rectF5, f64, r1Var4.N7, r1Var4.getMessageObject().P5());
                    canvas2 = canvas;
                    r1Var4.p8.f(canvas2, rectF5, f64);
                    if (r1Var4.d8) {
                        f46 = f64;
                        f47 = 0.0f;
                    } else {
                        canvas2.save();
                        float T13 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(35.0f), Math.min(rectF5.height() - org.telegram.messenger.g0.L(10.0f), org.telegram.ui.ActionBar.m6.Z2.getTextSize() + org.telegram.ui.ActionBar.m6.Y2.getTextSize() + org.telegram.messenger.g0.L(r1Var4.N7 ? f16 : 7.0f)), f61);
                        float T14 = org.telegram.messenger.g0.T1(T1, rectF5.left + org.telegram.messenger.g0.L(8.0f), f61);
                        float f65 = rectF5.top;
                        if (!r1Var4.N7 || (staticLayout = r1Var4.R7) == null) {
                            f46 = f64;
                        } else {
                            f46 = f64;
                            if (staticLayout.getLineCount() <= 1) {
                                i16 = 2;
                                float T15 = org.telegram.messenger.g0.T1(T12, f65 + org.telegram.messenger.g0.L(i16 + 5), f61);
                                ImageReceiver imageReceiver3 = imageReceiver;
                                imageReceiver3.y0(T14, T15, T13, T13);
                                imageReceiver3.h(canvas2, null);
                                canvas2.restore();
                                f47 = T13;
                            }
                        }
                        i16 = 0;
                        float T152 = org.telegram.messenger.g0.T1(T12, f65 + org.telegram.messenger.g0.L(i16 + 5), f61);
                        ImageReceiver imageReceiver32 = imageReceiver;
                        imageReceiver32.y0(T14, T152, T13, T13);
                        imageReceiver32.h(canvas2, null);
                        canvas2.restore();
                        f47 = T13;
                    }
                    canvas2.save();
                    f48 = i18 * f61;
                    canvas2.translate(f48, 0.0f);
                    float f66 = -(!gjVar7.P5() ? org.telegram.messenger.g0.L(6.0f) : org.telegram.messenger.g0.L(1.0f));
                    float L5 = !gjVar7.P5() ? org.telegram.messenger.g0.L(1.0f) : org.telegram.messenger.g0.L(f16);
                    float f67 = (f45 - r1Var4.b8) + f66;
                    float T16 = org.telegram.messenger.g0.T1(L3, (f45 - this.L) + f66, f61) + (!r1Var4.d8 ? org.telegram.messenger.g0.L(f16) + f47 : 0.0f);
                    if (r1Var4.Q7 == null) {
                        canvas2.save();
                        canvas2.translate(T16, (L5 * f61) + T12);
                        int alpha = org.telegram.ui.ActionBar.m6.Y2.getAlpha();
                        org.telegram.ui.ActionBar.m6.Y2.setAlpha((int) (alpha * f61));
                        r1Var4.Q7.draw(canvas2);
                        org.telegram.ui.ActionBar.m6.Y2.setAlpha(alpha);
                        org.telegram.ui.ActionBar.m5 m5Var = ((org.telegram.ui.Components.so[]) bnVar4.c0.b)[0].c;
                        f30 = f46;
                        rectF = rectF5;
                        bnVar2 = bnVar4;
                        f49 = L3;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, m5Var.getWidth(), m5Var.getHeight(), (int) (f15 * 255.0f), 31);
                        m5Var.setAlpha(1.0f);
                        m5Var.draw(canvas2);
                        m5Var.setAlpha(0.0f);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        rectF = rectF5;
                        bnVar2 = bnVar4;
                        f30 = f46;
                        f49 = L3;
                    }
                    if (r1Var4.N7 && r1Var4.J7 != null) {
                        if (r1Var4.p8.i() != r1Var4.G7) {
                            Drawable drawable = r1Var4.J7;
                            int i19 = r1Var4.p8.i();
                            r1Var4.G7 = i19;
                            drawable.setColorFilter(new PorterDuffColorFilter(i19, PorterDuff.Mode.SRC_IN));
                        }
                        r1Var4.J7.setBounds((int) (((rectF.right - f48) - org.telegram.messenger.g0.L((!r1Var4.J ? 1 : 0) + 2)) - r1Var4.J7.getIntrinsicWidth()), (int) (rectF.top + org.telegram.messenger.g0.L((!r1Var4.J ? 1 : 0) + 2)), (int) ((rectF.right - f48) - org.telegram.messenger.g0.L((!r1Var4.J ? 1 : 0) + 2)), (int) (rectF.top + org.telegram.messenger.g0.L((!r1Var4.J ? 1 : 0) + 2) + r1Var4.J7.getIntrinsicHeight()));
                        r1Var4.J7.setAlpha((int) (f61 * 255.0f));
                        r1Var4.J7.draw(canvas2);
                    }
                    if (r1Var4.R7 == null) {
                        canvas2.save();
                        float T17 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(19.0f), org.telegram.ui.ActionBar.m6.Y2.getTextSize() + org.telegram.messenger.g0.L(4.0f) + L5, f61) + T12;
                        if (r1Var4.N7 && r1Var4.d8) {
                            f67 -= org.telegram.messenger.g0.L(f17);
                        }
                        if (r1Var4.d8 && (!r1Var4.N7 || r1Var4.c8)) {
                            f67 = f47 + org.telegram.messenger.g0.L(f16) + f67;
                        }
                        float f68 = f67;
                        if (r1Var4.O7 && r1Var4.P7 != null) {
                            float T18 = org.telegram.messenger.g0.T1(f49 - r1Var4.b8, f68, f61);
                            r1Var4.P7.e((int) T18, org.telegram.messenger.g0.L(f17) + ((int) T17), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
                            org.telegram.ui.ActionBar.m6.X1.setColor(org.telegram.ui.ActionBar.m6.w0(gjVar7.P3() ? org.telegram.ui.ActionBar.m6.Kb : org.telegram.ui.ActionBar.m6.rd, h6Var));
                            canvas2.drawCircle(T18 + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(8.0f) + T17, org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.m6.X1);
                            r1Var4.P7.h(-1, gjVar7.P3() ? org.telegram.ui.ActionBar.m6.qc : org.telegram.ui.ActionBar.m6.oe, org.telegram.ui.ActionBar.m6.k7);
                            CheckBoxBase checkBoxBase = r1Var4.P7;
                            if (checkBoxBase.h != f33) {
                                checkBoxBase.h = f33;
                                checkBoxBase.b();
                            }
                            r1Var4.P7.a(canvas2);
                        }
                        if (r1Var4.O7) {
                            f68 += org.telegram.messenger.g0.L(16.0f);
                        }
                        if (r1Var4.c8 && r1Var4.b8 > 0) {
                            f68 = ((rectF.right - org.telegram.messenger.g0.L(8.0f)) - r1Var4.R7.getWidth()) - f48;
                        }
                        canvas2.translate(org.telegram.messenger.g0.T1(f49 - r1Var4.b8, f68, f61), T17);
                        canvas2.save();
                        ArrayList arrayList3 = arrayList;
                        xh.f.d(canvas2, arrayList3);
                        f35 = f61;
                        f31 = f13;
                        f27 = f44;
                        l51Var = this;
                        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas2, r1Var4.R7, r1Var4.Ba, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f);
                        r1Var4.R7.draw(canvas2);
                        canvas2.restore();
                        int size = arrayList3.size();
                        int i20 = 0;
                        while (i20 < size) {
                            Object obj = arrayList3.get(i20);
                            i20++;
                            xh.f fVar = (xh.f) obj;
                            boolean z14 = fVar.p;
                            fVar.p = false;
                            if (z14) {
                                fVar.h(r1Var4.R7.getPaint().getColor());
                            }
                            fVar.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        f35 = f61;
                        f31 = f13;
                        f27 = f44;
                        l51Var = this;
                    }
                    canvas2.restore();
                } else if (gjVar.P3()) {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Tb, h6Var);
                    b(org.telegram.ui.ActionBar.m6.Rb);
                } else {
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Nd, h6Var);
                    b(org.telegram.ui.ActionBar.m6.Ld);
                }
            }
            i14 = w02;
            if (!gjVar.P5()) {
            }
            f28 = b10;
            f33 = f23;
            org.telegram.ui.ActionBar.m6.Z2.setColor(i0.a.f(f33, this.i, w03));
            org.telegram.ui.ActionBar.m6.Y2.setColor(i0.a.f(f33, this.h, i14));
            if (!r1Var4.d8) {
            }
            float T19 = org.telegram.messenger.g0.T1(L3, f62, f61);
            float T122 = org.telegram.messenger.g0.T1((org.telegram.messenger.g0.L(12.0f) * f33) + y15, f63, f33);
            if (this.S != null) {
            }
            RectF rectF22 = org.telegram.messenger.g0.P;
            rectF22.set(L3, y15, this.f + L3, org.telegram.messenger.g0.L(35.0f) + y15);
            rectF22.offset(0.0f, org.telegram.messenger.g0.L(12.0f) * f33);
            RectF rectF32 = r1Var4.Ma;
            RectF rectF42 = this.R;
            rectF42.set(rectF32);
            rectF42.offset(f14, z13);
            RectF rectF52 = this.Q;
            org.telegram.messenger.g0.Z1(rectF22, rectF42, f61, rectF52);
            int i182 = i15;
            org.telegram.messenger.gj gjVar72 = gjVar2;
            float f642 = f19;
            f29 = y12;
            f32 = f59;
            f34 = z13;
            r1Var4.p8.e(canvas, rectF52, f642, r1Var4.N7, r1Var4.getMessageObject().P5());
            canvas2 = canvas;
            r1Var4.p8.f(canvas2, rectF52, f642);
            if (r1Var4.d8) {
            }
            canvas2.save();
            f48 = i182 * f61;
            canvas2.translate(f48, 0.0f);
            float f662 = -(!gjVar72.P5() ? org.telegram.messenger.g0.L(6.0f) : org.telegram.messenger.g0.L(1.0f));
            float L52 = !gjVar72.P5() ? org.telegram.messenger.g0.L(1.0f) : org.telegram.messenger.g0.L(f16);
            float f672 = (f45 - r1Var4.b8) + f662;
            float T162 = org.telegram.messenger.g0.T1(L3, (f45 - this.L) + f662, f61) + (!r1Var4.d8 ? org.telegram.messenger.g0.L(f16) + f47 : 0.0f);
            if (r1Var4.Q7 == null) {
            }
            if (r1Var4.N7) {
                if (r1Var4.p8.i() != r1Var4.G7) {
                }
                r1Var4.J7.setBounds((int) (((rectF.right - f48) - org.telegram.messenger.g0.L((!r1Var4.J ? 1 : 0) + 2)) - r1Var4.J7.getIntrinsicWidth()), (int) (rectF.top + org.telegram.messenger.g0.L((!r1Var4.J ? 1 : 0) + 2)), (int) ((rectF.right - f48) - org.telegram.messenger.g0.L((!r1Var4.J ? 1 : 0) + 2)), (int) (rectF.top + org.telegram.messenger.g0.L((!r1Var4.J ? 1 : 0) + 2) + r1Var4.J7.getIntrinsicHeight()));
                r1Var4.J7.setAlpha((int) (f61 * 255.0f));
                r1Var4.J7.draw(canvas2);
            }
            if (r1Var4.R7 == null) {
            }
            canvas2.restore();
        } else {
            i10 = L;
            f24 = backgroundDrawableLeft;
            f25 = y14;
            f26 = f60;
            f27 = f21;
            l51Var = this;
            f28 = b10;
            f29 = y12;
            f30 = f19;
            f31 = f13;
            f32 = f59;
            bnVar2 = bnVar;
            f33 = f23;
            f34 = z13;
            f35 = f61;
        }
        canvas2.save();
        if (r1Var4.getMessageObject() == null || r1Var4.getMessageObject().D != 19) {
            canvas2.clipRect(f24 + org.telegram.messenger.g0.L(4.0f), f25 + org.telegram.messenger.g0.L(4.0f), i10 - org.telegram.messenger.g0.L(4.0f), f28 - org.telegram.messenger.g0.L(4.0f));
        }
        float f69 = (l51Var.D * f15) + f35;
        canvas2.save();
        float f70 = f12 * f15;
        float z15 = com.google.android.gms.internal.vision.e2.z(f31, f32, f35, f70);
        float f71 = f29 * f26;
        ArrayList arrayList4 = r1Var4.getMessageObject().B2;
        org.telegram.messenger.dj djVar2 = l51Var.F;
        org.telegram.ui.Cells.y1 y1Var4 = y1Var;
        canvas2.translate(z15, ((djVar2.p(arrayList4, y1Var4) + f27) * f33) + f71);
        float f72 = f69 * 1.0f;
        canvas2.scale(f69, f72, 0.0f, 0.0f);
        boolean z16 = l51Var.p;
        int i21 = l51Var.N;
        boolean z17 = l51Var.n;
        StaticLayout staticLayout2 = l51Var.q;
        if (z17 && z16) {
            int color = staticLayout2.getPaint().getColor();
            float f73 = f30;
            staticLayout2.getPaint().setColor(i0.a.f(f73, l51Var.M, i21));
            z10 = z16;
            y1Var2 = y1Var4;
            f38 = f73;
            f36 = f72;
            i11 = i21;
            z11 = z17;
            canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f10 * 255.0f), 31);
            staticLayout2.draw(canvas);
            f37 = f33;
            r1Var2 = r1Var4;
            f39 = f70;
            djVar = djVar2;
            float f74 = f10;
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, l51Var.q, l51Var.I, 0.0f, null, 0.0f, 0.0f, 0.0f, f74);
            staticLayout2.getPaint().setColor(color);
            canvas.restore();
            canvas3 = canvas;
            f40 = f74;
        } else {
            f36 = f72;
            z10 = z16;
            y1Var2 = y1Var4;
            i11 = i21;
            z11 = z17;
            f37 = f33;
            r1Var2 = r1Var4;
            f38 = f30;
            f39 = f70;
            djVar = djVar2;
            float f75 = f10;
            if (z11) {
                canvas3 = canvas;
                canvas3.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f75 * 255.0f), 31);
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas3, l51Var.q, l51Var.I, 0.0f, null, 0.0f, 0.0f, 0.0f, f75);
                f40 = f75;
                canvas3.restore();
            } else {
                canvas3 = canvas;
                f40 = f75;
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas3, l51Var.q, l51Var.I, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        }
        canvas3.restore();
        StaticLayout staticLayout3 = l51Var.r;
        if (staticLayout3 != null) {
            canvas3.save();
            canvas3.translate(com.google.android.gms.internal.vision.e2.z(f31, l51Var.m, f35, f39), ((djVar.p(r1Var2.getMessageObject().B2, y1Var2) + f27) * f37) + f71);
            f41 = f36;
            canvas3.scale(f69, f41, 0.0f, 0.0f);
            if (z11 && z10) {
                int color2 = staticLayout3.getPaint().getColor();
                i12 = i11;
                staticLayout3.getPaint().setColor(i0.a.o(i0.a.f(f38, l51Var.M, i12), (int) (Color.alpha(color2) * f40)));
                staticLayout3.draw(canvas3);
                staticLayout3.getPaint().setColor(color2);
            } else {
                i12 = i11;
                if (z11) {
                    int alpha2 = staticLayout3.getPaint().getAlpha();
                    staticLayout3.getPaint().setAlpha((int) (alpha2 * f40));
                    staticLayout3.draw(canvas3);
                    staticLayout3.getPaint().setAlpha(alpha2);
                } else {
                    staticLayout3.draw(canvas3);
                }
            }
            canvas3.restore();
        } else {
            f41 = f36;
            i12 = i11;
        }
        if (z11) {
            canvas3.save();
            canvas3.translate(com.google.android.gms.internal.vision.e2.z(f12, f31, f15, (ek0Var.getX() + r1Var2.getLeft()) - tiVar.getX()), f34);
            canvas3.scale(f69, f41, r1Var2.getTextX(), r1Var2.getTextY());
            canvas3.translate(0.0f, -0.0f);
            int color3 = org.telegram.ui.ActionBar.m6.o2.getColor();
            org.telegram.ui.ActionBar.m6.o2.setColor(i12);
            ArrayList arrayList5 = r1Var2.getMessageObject().B2;
            org.telegram.ui.Cells.r1 r1Var5 = r1Var2;
            float f76 = r1Var5.u0;
            org.telegram.ui.Cells.y1 y1Var5 = r1Var5.ib;
            if (y1Var5.m2) {
                float f77 = y1Var5.o2;
                float f78 = y1Var5.L1;
                f43 = 1.0f;
                f76 = (f76 * f78) + ((1.0f - f78) * f77);
            } else {
                f43 = 1.0f;
            }
            float f79 = r1Var5.o0;
            org.telegram.messenger.gj gjVar8 = r1Var5.Q5;
            f42 = 0.0f;
            float f80 = f11;
            Canvas canvas4 = canvas3;
            i13 = i7;
            r1Var5.f1(f79, f76, canvas4, arrayList5, gjVar8 == null ? 0.0f : gjVar8.x2, true, f80, false, true, false, false);
            canvas3 = canvas4;
            r1Var5.J0(canvas3, f80);
            if (org.telegram.ui.ActionBar.m6.o2.getColor() != color3) {
                org.telegram.ui.ActionBar.m6.o2.setColor(color3);
            }
            canvas3.restore();
        } else {
            i13 = i7;
            f42 = 0.0f;
            f43 = 1.0f;
        }
        canvas3.restore();
        if (z12) {
            float f81 = i13;
            l51Var.v.setTranslate(f42, f81);
            l51Var.C.setLocalMatrix(l51Var.v);
            canvas3.drawRect(0.0f, f81, tiVar.getMeasuredWidth(), tiVar.getMeasuredHeight(), l51Var.w);
            canvas3.restore();
        }
        float f82 = l51Var.a;
        float f83 = f82 > 0.4f ? f43 : f82 / 0.4f;
        rj rjVar = l51Var.H;
        if (f83 == f43) {
            rjVar.setTextTransitionIsRunning(false);
        }
        if (rjVar.getSendButton().getVisibility() != 0 || f83 >= f43) {
            return;
        }
        View sendButton = rjVar.getSendButton();
        pl plVar = bnVar2.m1;
        PointF pointF = l51Var.P;
        jh.k.b(sendButton, plVar, pointF);
        canvas3.save();
        canvas3.translate(pointF.x - tiVar.getX(), pointF.y - tiVar.getY());
        View sendButton2 = rjVar.getSendButton();
        canvas3.saveLayerAlpha(0.0f, 0.0f, sendButton2.getWidth(), sendButton2.getHeight(), (int) ((f43 - f83) * 255.0f));
        sendButton2.draw(canvas3);
        canvas3.restore();
        canvas3.restore();
        canvas3.restore();
    }

    public final int b(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.O);
    }
}
