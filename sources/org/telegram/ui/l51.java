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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l51 implements ff0 {
    public final an A;
    public final LinearGradient B;
    public final float C;
    public final h2.f D;
    public final org.telegram.messenger.fj E;
    public final NinePatchDrawable F;
    public final qj G;
    public final org.telegram.ui.Components.n5 H;
    public float I;
    public float J;
    public final float K;
    public final int L;
    public final int M;
    public final org.telegram.ui.ActionBar.f6 N;
    public final PointF O;
    public final RectF P;
    public final RectF Q;
    public float[] R;
    public final float S;
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
    public final org.telegram.messenger.ij k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final StaticLayout p;
    public final StaticLayout q;
    public final org.telegram.ui.Cells.q1 r;
    public final org.telegram.ui.Components.pj0 s;
    public final org.telegram.ui.Components.ci t;
    public final Matrix u;
    public final Paint v;
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    public l51(org.telegram.ui.Cells.q1 q1Var, an anVar, org.telegram.ui.Components.pj0 pj0Var, org.telegram.ui.Components.ci ciVar, org.telegram.ui.ActionBar.f6 f6Var) {
        float f10;
        int i7;
        float f11;
        float f12;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.t4 L1;
        int i12;
        Object[] spans;
        Paint paint = new Paint(1);
        this.b = paint;
        this.D = new h2.f((int[]) null);
        PointF pointF = new PointF();
        this.O = pointF;
        this.P = new RectF();
        this.Q = new RectF();
        this.N = f6Var;
        if (q1Var.getMessageObject().z2 == null || q1Var.getMessageObject().z2.size() > 1 || q1Var.getMessageObject().z2.isEmpty() || ((org.telegram.messenger.fj) q1Var.getMessageObject().z2.get(0)).e.getLineCount() > 10) {
            return;
        }
        this.r = q1Var;
        this.s = pj0Var;
        this.t = ciVar;
        this.A = anVar;
        qj qjVar = anVar.Z;
        this.G = qjVar;
        if (qjVar == null || qjVar.getEditField() == null || qjVar.getEditField().getLayout() == null) {
            return;
        }
        qjVar.getRecordCircle();
        paint.setFilterBitmap(true);
        this.k = q1Var.getMessageObject();
        if (!q1Var.getTransitionParams().w0) {
            q1Var.draw(new Canvas());
        }
        q1Var.setEnterTransitionInProgress(true);
        Editable editText = qjVar.getEditText();
        CharSequence charSequence = q1Var.getMessageObject().v;
        this.n = false;
        qjVar.getEditField().getLayout().getHeight();
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.o2;
        org.telegram.messenger.g0.L(20.0f);
        if (q1Var.getMessageObject().N1 != 0) {
            boolean z9 = q1Var.getMessageObject().N1 == q1Var.getMessageObject().O1;
            f10 = 4.0f;
            switch (Math.max(q1Var.getMessageObject().N1, q1Var.getMessageObject().O1)) {
                case 0:
                case 1:
                case 2:
                    if (z9) {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[0];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[2];
                        break;
                    }
                case 3:
                    if (z9) {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[1];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[3];
                        break;
                    }
                case 4:
                    if (z9) {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[2];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[4];
                        break;
                    }
                case 5:
                    if (z9) {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[3];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[5];
                        break;
                    }
                case 6:
                    if (z9) {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[4];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[5];
                        break;
                    }
                default:
                    textPaint = org.telegram.ui.ActionBar.k6.y2[5];
                    break;
            }
            if (textPaint != null) {
                textPaint.getTextSize();
                org.telegram.messenger.g0.L(4.0f);
            }
        } else {
            f10 = 4.0f;
        }
        boolean z10 = (charSequence instanceof Spannable) && (spans = ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class)) != null && spans.length > 0;
        if (editText.length() != charSequence.length() || z10) {
            this.n = true;
            int[] iArr = new int[1];
            CharSequence P3 = org.telegram.messenger.g0.P3(editText, iArr);
            if (iArr[0] > 0) {
                i7 = qjVar.getEditField().getLayout().getLineTop(qjVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                qjVar.getEditField().getLayout().getLineBottom(qjVar.getEditField().getLayout().getLineForOffset(P3.length() + iArr[0]));
            } else {
                i7 = 0;
            }
            org.telegram.ui.Components.r5.cloneSpans(charSequence);
            charSequence = org.telegram.messenger.i6.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
        } else {
            i7 = 0;
        }
        float textSize = qjVar.getEditField().getTextSize() / textPaint.getTextSize();
        this.C = textSize;
        int lineCount = qjVar.getEditField().getLayout().getLineCount();
        int width = (int) (qjVar.getEditField().getLayout().getWidth() / textSize);
        if (Build.VERSION.SDK_INT >= 24) {
            this.p = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
        } else {
            this.p = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.H = org.telegram.ui.Components.r5.update(2, (View) null, this.H, this.p);
        jh.k.b(qjVar.getEditField(), anVar.l1, pointF);
        float f13 = pointF.y;
        this.y = pointF.x;
        this.z = ((org.telegram.messenger.g0.L(10.0f) + f13) - qjVar.getEditField().getScrollY()) + i7;
        float f14 = 0.0f;
        this.l = 0.0f;
        float f15 = Float.MAX_VALUE;
        for (int i13 = 0; i13 < this.p.getLineCount(); i13++) {
            float lineLeft = this.p.getLineLeft(i13);
            if (lineLeft < f15) {
                f15 = lineLeft;
            }
        }
        if (f15 != Float.MAX_VALUE) {
            this.l = f15;
        }
        this.p.getHeight();
        float L = org.telegram.messenger.g0.L(f10) + f13;
        this.j = L;
        float f16 = 12.0f;
        if (this.G.z0()) {
            this.j = L - org.telegram.messenger.g0.L(12.0f);
        }
        this.x = f13 + qjVar.getEditField().getMeasuredHeight();
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) q1Var.getMessageObject().z2.get(0);
        this.E = fjVar;
        StaticLayout staticLayout = fjVar.e;
        int i14 = org.telegram.ui.ActionBar.k6.Tc;
        double h = i0.a.h(org.telegram.ui.ActionBar.k6.w0(i14, this.N));
        int i15 = org.telegram.ui.ActionBar.k6.Ie;
        if (Math.abs(h - i0.a.h(org.telegram.ui.ActionBar.k6.w0(i15, this.N))) > 0.20000000298023224d) {
            this.n = true;
            this.o = true;
        }
        this.L = org.telegram.ui.ActionBar.k6.w0(i15, this.N);
        this.M = org.telegram.ui.ActionBar.k6.w0(i14, this.N);
        if (staticLayout.getLineCount() == this.p.getLineCount()) {
            lineCount = staticLayout.getLineCount();
            int i16 = 0;
            i10 = 0;
            i11 = 0;
            while (true) {
                if (i16 < lineCount) {
                    f12 = f16;
                    StaticLayout staticLayout2 = this.p;
                    f11 = f14;
                    if (staticLayout2.getLineRight(i16) != staticLayout2.getWidth() || staticLayout2.getLineLeft(i16) == f11) {
                        i10++;
                    } else {
                        i11++;
                    }
                    if (staticLayout.getLineEnd(i16) != this.p.getLineEnd(i16)) {
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
                StaticLayout staticLayout3 = this.p;
                if (staticLayout3.getLineRight(i17) != staticLayout3.getWidth() || staticLayout3.getLineLeft(i17) == f11) {
                    i12 = lineCount;
                    spannableString2.setSpan(new org.telegram.ui.Components.hy(false), this.p.getLineStart(i17), this.p.getLineEnd(i17), 0);
                } else {
                    i12 = lineCount;
                    spannableString.setSpan(new org.telegram.ui.Components.hy(false), this.p.getLineStart(i17), this.p.getLineEnd(i17), 0);
                    float lineLeft2 = this.p.getLineLeft(i17);
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
                this.p = hyphenationFrequency.setAlignment(alignment).build();
                this.q = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
            } else {
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                TextPaint textPaint2 = textPaint;
                this.p = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                this.q = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
            }
        }
        this.m = this.p.getWidth() - ((org.telegram.messenger.fj) q1Var.getMessageObject().z2.get(0)).e.getWidth();
        boolean z11 = (q1Var.getMessageObject().O1() == 0 || q1Var.P7 == null) ? false : true;
        this.c = z11;
        if (z11) {
            org.telegram.ui.ActionBar.k5 k5Var = ((org.telegram.ui.Components.zn[]) anVar.b0.b)[0].c;
            jh.k.b(k5Var, anVar.l1, this.O);
            PointF pointF2 = this.O;
            this.e = pointF2.x;
            this.g = pointF2.y;
            this.f = ((View) k5Var.getParent()).getWidth();
            org.telegram.ui.ActionBar.k5 k5Var2 = ((org.telegram.ui.Components.zn[]) anVar.b0.b)[0].d;
            jh.k.b(k5Var2, anVar.l1, this.O);
            float f18 = this.O.y;
            this.h = k5Var.getTextColor();
            this.i = k5Var2.getTextColor();
            this.j -= org.telegram.messenger.g0.L(46.0f);
        }
        this.S = pj0Var.getPaddingBottom() - (anVar.Wc - org.telegram.messenger.g0.L(44.0f));
        this.u = new Matrix();
        Paint paint2 = new Paint(1);
        this.v = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, org.telegram.messenger.g0.L(f12), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.B = linearGradient;
        paint2.setShader(linearGradient);
        this.w = q1Var.getMessageObject().k1;
        float f19 = f11;
        qjVar.getEditField().setAlpha(f19);
        qjVar.setTextTransitionIsRunning(true);
        StaticLayout staticLayout4 = q1Var.P7;
        if (staticLayout4 != null && staticLayout4.getText().length() > 1 && q1Var.P7.getPrimaryHorizontal(0) != f19) {
            this.K = q1Var.P7.getWidth() - q1Var.P7.getLineWidth(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new qs0(1, qjVar, this, ciVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(250L);
        ((ArrayList) ciVar.c).add(this);
        ciVar.a();
        ((ViewGroup) ciVar.d).invalidate();
        this.D.d();
        ofFloat.addListener(new org.telegram.ui.Components.i10(this, ciVar, q1Var, qjVar, anVar));
        if (org.telegram.messenger.iz.o() != 2 || (L1 = q1Var.L1(true)) == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ge, this.N);
        Rect rect = L1.o;
        if (L1.F == null) {
            Bitmap createBitmap = Bitmap.createBitmap(L1.b(50.0f), L1.b(40.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            rect.set(L1.getBounds());
            Paint paint3 = new Paint(1);
            paint3.setColor(-1);
            L1.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            L1.c(canvas, paint3);
            L1.F = new NinePatchDrawable(createBitmap, c8.n0.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
            L1.setBounds(rect);
        }
        if (L1.G != w02) {
            L1.G = w02;
            L1.F.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        this.F = L1.F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x03c7, code lost:
    
        if (android.text.TextUtils.isEmpty(r8.z) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03df, code lost:
    
        if ((org.telegram.messenger.ij.o1(r5.C.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0433, code lost:
    
        if (android.text.TextUtils.isEmpty(r11.z) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x044b, code lost:
    
        if ((org.telegram.messenger.ij.o1(r5.C.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0749  */
    @Override // org.telegram.ui.ff0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        int i7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        Canvas canvas2;
        float f19;
        an anVar;
        ImageReceiver imageReceiver;
        float f20;
        float f21;
        float f22;
        org.telegram.messenger.ij ijVar;
        float f23;
        float f24;
        int i10;
        l51 l51Var;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        an anVar2;
        float f33;
        float f34;
        boolean z9;
        int i11;
        float f35;
        float f36;
        float f37;
        org.telegram.ui.Cells.q1 q1Var;
        boolean z10;
        float f38;
        float f39;
        float f40;
        float f41;
        org.telegram.messenger.fj fjVar;
        org.telegram.ui.Cells.x1 x1Var;
        float f42;
        Canvas canvas3;
        float f43;
        float f44;
        int i12;
        float f45;
        float f46;
        boolean z11;
        int w02;
        int i13;
        float f47;
        org.telegram.messenger.ij ijVar2;
        int w03;
        float f48;
        float f49;
        float f50;
        float f51;
        float f52;
        RectF rectF;
        int i14;
        StaticLayout staticLayout;
        int i15;
        float f53;
        int i16;
        float f54;
        org.telegram.ui.Components.pj0 pj0Var = this.s;
        float y10 = pj0Var.getY();
        org.telegram.ui.Components.ci ciVar = this.t;
        float y11 = (y10 - ciVar.getY()) + pj0Var.getMeasuredHeight();
        float x10 = this.y - ciVar.getX();
        float y12 = this.z - ciVar.getY();
        org.telegram.ui.Cells.q1 q1Var2 = this.r;
        int textX = q1Var2.getTextX();
        org.telegram.ui.Cells.x1 x1Var2 = q1Var2.hb;
        ImageReceiver imageReceiver2 = q1Var2.S7;
        ArrayList arrayList = q1Var2.Sb;
        this.I = textX;
        this.J = q1Var2.getTextY();
        if (q1Var2.getMessageObject().k1 != this.w) {
            return;
        }
        float x11 = (pj0Var.getX() + q1Var2.getX()) - ciVar.getX();
        float top = ((pj0Var.getTop() + (q1Var2.getPaddingTop() + q1Var2.getTop())) - ciVar.getY()) - (this.S - pj0Var.getPaddingBottom());
        float interpolation = mi.l.V.getInterpolation(this.a);
        float f55 = this.a;
        float f56 = f55 > 0.4f ? 1.0f : f55 / 0.4f;
        float interpolation2 = org.telegram.ui.Components.xq.g.getInterpolation(org.telegram.ui.Components.xq.h.getInterpolation(f55));
        float f57 = this.I + x11;
        float f58 = this.J + top;
        float f59 = f56;
        float f60 = 1.0f - interpolation2;
        int measuredHeight = (int) ((y11 * interpolation2) + (ciVar.getMeasuredHeight() * f60));
        boolean z12 = q1Var2.getBottom() - org.telegram.messenger.g0.L(4.0f) > pj0Var.getMeasuredHeight() && (((float) q1Var2.getMeasuredHeight()) + top) - ((float) org.telegram.messenger.g0.L(8.0f)) > ((float) measuredHeight) && ciVar.getMeasuredHeight() > 0;
        if (z12) {
            i7 = measuredHeight;
            f12 = interpolation2;
            f15 = interpolation;
            f16 = f58;
            f17 = f59;
            f18 = x11;
            f13 = f60;
            f14 = f57;
            f10 = top;
            f11 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, Math.max(0.0f, top), ciVar.getMeasuredWidth(), ciVar.getMeasuredHeight(), org.telegram.messenger.qs.e4, 31);
        } else {
            i7 = measuredHeight;
            f10 = top;
            f11 = 0.0f;
            f12 = interpolation2;
            f13 = f60;
            f14 = f57;
            f15 = interpolation;
            f16 = f58;
            f17 = f59;
            f18 = x11;
            canvas2 = canvas;
        }
        canvas2.save();
        float y13 = pj0Var.getY();
        an anVar3 = this.A;
        canvas2.clipRect(f11, ((anVar3.L9 + y13) - ciVar.getY()) - org.telegram.messenger.g0.L(3.0f), ciVar.getMeasuredWidth(), ciVar.getMeasuredHeight());
        canvas2.save();
        float f61 = f18;
        float f62 = this.l;
        float f63 = f14;
        float backgroundDrawableLeft = q1Var2.getBackgroundDrawableLeft() + f61 + ((x10 - (f63 - f62)) * f13);
        float f64 = f10;
        float backgroundDrawableTop = q1Var2.getBackgroundDrawableTop() + f64;
        float y14 = this.j - ciVar.getY();
        float f65 = f15;
        float f66 = 1.0f - f65;
        float f67 = (backgroundDrawableTop * f65) + (y14 * f66);
        float b10 = org.telegram.messenger.camera.q.b(backgroundDrawableTop, q1Var2.getBackgroundDrawableBottom() - q1Var2.getBackgroundDrawableTop(), f65, (this.x - ciVar.getY()) * f66);
        int L = (int) ((org.telegram.messenger.g0.L(4.0f) * f13) + q1Var2.getBackgroundDrawableRight() + f61);
        org.telegram.messenger.ij ijVar3 = this.k;
        org.telegram.ui.ActionBar.t4 L1 = !ijVar3.J2() ? q1Var2.L1(true) : null;
        if (L1 != null) {
            imageReceiver = imageReceiver2;
            q1Var2.setBackgroundTopY(ciVar.getTop() - pj0Var.getTop());
            Drawable l10 = L1.l();
            f19 = f61;
            f21 = f17;
            if (f21 != 1.0f) {
                f20 = f65;
                NinePatchDrawable ninePatchDrawable = this.F;
                ijVar = ijVar3;
                if (ninePatchDrawable != null) {
                    anVar = anVar3;
                    ninePatchDrawable.setBounds((int) backgroundDrawableLeft, (int) f67, L, (int) b10);
                    ninePatchDrawable.draw(canvas2);
                } else {
                    anVar = anVar3;
                }
            } else {
                ijVar = ijVar3;
                anVar = anVar3;
                f20 = f65;
            }
            f22 = f12;
            if (l10 != null) {
                l10.setAlpha((int) (f22 * 255.0f));
                l10.setBounds((int) backgroundDrawableLeft, (int) f67, L, (int) b10);
                l10.draw(canvas2);
                l10.setAlpha(org.telegram.messenger.qs.e4);
            }
            L1.setAlpha((int) (f21 * 255.0f));
            L1.setBounds((int) backgroundDrawableLeft, (int) f67, L, (int) b10);
            L1.I = true;
            L1.draw(canvas2);
            L1.I = false;
            L1.setAlpha(org.telegram.messenger.qs.e4);
        } else {
            f19 = f61;
            anVar = anVar3;
            imageReceiver = imageReceiver2;
            f20 = f65;
            f21 = f17;
            f22 = f12;
            ijVar = ijVar3;
        }
        canvas2.restore();
        canvas2.save();
        if (L1 != null) {
            if (ijVar.Q3()) {
                canvas2.clipRect(org.telegram.messenger.g0.L(4.0f) + backgroundDrawableLeft, org.telegram.messenger.g0.L(4.0f) + f67, L - org.telegram.messenger.g0.L(10.0f), b10 - org.telegram.messenger.g0.L(4.0f));
            } else {
                canvas2.clipRect(org.telegram.messenger.g0.L(4.0f) + backgroundDrawableLeft, org.telegram.messenger.g0.L(4.0f) + f67, L - org.telegram.messenger.g0.L(4.0f), b10 - org.telegram.messenger.g0.L(4.0f));
            }
        }
        float x12 = (pj0Var.getX() + q1Var2.getLeft()) - ciVar.getX();
        float f68 = f16;
        float z13 = com.google.android.recaptcha.internal.a.z(y12, f68, f66, f64);
        canvas2.translate(x12, z13);
        q1Var2.x1(f21, canvas2, false);
        q1Var2.h1(canvas2, f21);
        q1Var2.U0(canvas2, f21);
        q1Var2.Q0(f21, canvas2, false);
        q1Var2.o1(canvas2, f21, null);
        q1Var2.V0(canvas2, f21);
        q1Var2.e1(canvas2, f21);
        canvas2.restore();
        if (this.c) {
            an anVar4 = anVar;
            ((org.telegram.ui.Components.zn[]) anVar4.b0.b)[0].c.setAlpha(0.0f);
            ((org.telegram.ui.Components.zn[]) anVar4.b0.b)[0].d.setAlpha(0.0f);
            org.telegram.messenger.g0.L(35.0f);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            float x13 = this.e - ciVar.getX();
            float y15 = this.g - ciVar.getY();
            f23 = backgroundDrawableLeft;
            float f69 = f19 + q1Var2.T7;
            float f70 = f21;
            float f71 = q1Var2.U7 + f64;
            if (q1Var2.o8 == null) {
                q1Var2.o8 = new org.telegram.ui.Components.zj0(q1Var2);
            }
            i10 = L;
            q1Var2.o8.a(q1Var2.getMessageObject(), q1Var2.getCurrentUser(), q1Var2.getCurrentChat(), this.N, 0);
            boolean Q5 = ijVar.Q5();
            org.telegram.ui.ActionBar.f6 f6Var = this.N;
            if (Q5) {
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ld, f6Var);
                b(org.telegram.ui.ActionBar.k6.Jd);
            } else {
                org.telegram.ui.Components.zj0 zj0Var = q1Var2.o8;
                if (zj0Var != null) {
                    i13 = zj0Var.I.c;
                    if (!ijVar.Q5()) {
                        f47 = x13;
                        f26 = f67;
                        f27 = y12;
                        ijVar2 = ijVar;
                        f25 = f68;
                        org.telegram.ui.Components.zj0 zj0Var2 = q1Var2.o8;
                        if (zj0Var2 != null) {
                            w03 = zj0Var2.I.c;
                        } else {
                            if (ijVar2.C2()) {
                                org.telegram.messenger.ij ijVar4 = ijVar2.C;
                                if (ijVar4.D == 0 || !TextUtils.isEmpty(ijVar4.z)) {
                                    TLRPC.MessageMedia messageMedia = ijVar2.C.k.media;
                                    if (!(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                                        w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Rb, f6Var);
                                    }
                                }
                            }
                            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sb, f6Var);
                        }
                    } else if (!ijVar.Q3()) {
                        f47 = x13;
                        f26 = f67;
                        f27 = y12;
                        ijVar2 = ijVar;
                        f25 = f68;
                        if (!ijVar2.g4()) {
                            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Md, f6Var);
                            if (!ijVar2.j2) {
                                if (ijVar2.C2()) {
                                    org.telegram.messenger.ij ijVar5 = ijVar2.C;
                                    if (ijVar5.D != 0) {
                                    }
                                    if (!(org.telegram.messenger.ij.o1(ijVar2.C.k) instanceof TLRPC.TL_messageMediaGame)) {
                                    }
                                }
                                if (!q1Var2.M7) {
                                    i15 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Nd, f6Var);
                                    f53 = 0.6f;
                                    w03 = i0.a.f(f53, i15, org.telegram.ui.ActionBar.k6.c(i15, i13));
                                }
                            }
                            i15 = w04;
                            f53 = 0.0f;
                            w03 = i0.a.f(f53, i15, org.telegram.ui.ActionBar.k6.c(i15, i13));
                        }
                        w03 = i13;
                    } else if (ijVar.g4()) {
                        f47 = x13;
                        f26 = f67;
                        f27 = y12;
                        ijVar2 = ijVar;
                        f25 = f68;
                        w03 = i13;
                    } else {
                        f47 = x13;
                        int w05 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Rb, f6Var);
                        ijVar2 = ijVar;
                        f25 = f68;
                        if (ijVar2.j2) {
                            f26 = f67;
                        } else {
                            if (ijVar2.C2()) {
                                org.telegram.messenger.ij ijVar6 = ijVar2.C;
                                f26 = f67;
                                if (ijVar6.D != 0) {
                                }
                                if (!(org.telegram.messenger.ij.o1(ijVar2.C.k) instanceof TLRPC.TL_messageMediaGame)) {
                                }
                            } else {
                                f26 = f67;
                            }
                            if (!q1Var2.M7) {
                                i16 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sb, f6Var);
                                f54 = 0.6f;
                                f27 = y12;
                                w03 = i0.a.f(f54, i16, org.telegram.ui.ActionBar.k6.c(i16, i13));
                            }
                        }
                        i16 = w05;
                        f54 = 0.0f;
                        f27 = y12;
                        w03 = i0.a.f(f54, i16, org.telegram.ui.ActionBar.k6.c(i16, i13));
                    }
                    f28 = f66;
                    f31 = f20;
                    org.telegram.ui.ActionBar.k6.Z2.setColor(i0.a.f(f31, this.i, w03));
                    org.telegram.ui.ActionBar.k6.Y2.setColor(i0.a.f(f31, this.h, i13));
                    float L3 = !q1Var2.c8 ? f47 - org.telegram.messenger.g0.L(44.0f) : f47;
                    float T1 = org.telegram.messenger.g0.T1(L3, f69, f22);
                    float T12 = org.telegram.messenger.g0.T1((org.telegram.messenger.g0.L(12.0f) * f31) + y15, f71, f31);
                    if (this.R != null) {
                        this.R = new float[]{r12, r12, 0.0f, 0.0f, 0.0f, 0.0f, r12, r12};
                        f48 = 12.0f;
                        float L4 = org.telegram.messenger.g0.L(4.0f);
                        float[] fArr = this.R;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[2] = 0.0f;
                    } else {
                        f48 = 12.0f;
                    }
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(L3, y15, this.f + L3, org.telegram.messenger.g0.L(35.0f) + y15);
                    rectF2.offset(0.0f, org.telegram.messenger.g0.L(f48) * f31);
                    RectF rectF3 = q1Var2.La;
                    RectF rectF4 = this.Q;
                    rectF4.set(rectF3);
                    rectF4.offset(f19, z13);
                    RectF rectF5 = this.P;
                    org.telegram.messenger.g0.Z1(rectF2, rectF4, f22, rectF5);
                    org.telegram.messenger.ij ijVar7 = ijVar2;
                    f29 = f62;
                    f30 = f63;
                    f34 = b10;
                    q1Var2.o8.e(canvas, rectF5, f70, q1Var2.M7, q1Var2.getMessageObject().Q5());
                    canvas2 = canvas;
                    q1Var2.o8.f(canvas2, rectF5, f70);
                    if (q1Var2.c8) {
                        f49 = f70;
                        f50 = 0.0f;
                    } else {
                        canvas2.save();
                        float T13 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(35.0f), Math.min(rectF5.height() - org.telegram.messenger.g0.L(10.0f), org.telegram.ui.ActionBar.k6.Z2.getTextSize() + org.telegram.ui.ActionBar.k6.Y2.getTextSize() + org.telegram.messenger.g0.L(q1Var2.M7 ? 3.0f : 7.0f)), f22);
                        float T14 = org.telegram.messenger.g0.T1(T1, rectF5.left + org.telegram.messenger.g0.L(8.0f), f22);
                        float f72 = rectF5.top;
                        if (!q1Var2.M7 || (staticLayout = q1Var2.Q7) == null) {
                            f49 = f70;
                        } else {
                            f49 = f70;
                            if (staticLayout.getLineCount() <= 1) {
                                i14 = 2;
                                float T15 = org.telegram.messenger.g0.T1(T12, f72 + org.telegram.messenger.g0.L(i14 + 5), f22);
                                ImageReceiver imageReceiver3 = imageReceiver;
                                imageReceiver3.y0(T14, T15, T13, T13);
                                imageReceiver3.h(canvas2, null);
                                canvas2.restore();
                                f50 = T13;
                            }
                        }
                        i14 = 0;
                        float T152 = org.telegram.messenger.g0.T1(T12, f72 + org.telegram.messenger.g0.L(i14 + 5), f22);
                        ImageReceiver imageReceiver32 = imageReceiver;
                        imageReceiver32.y0(T14, T152, T13, T13);
                        imageReceiver32.h(canvas2, null);
                        canvas2.restore();
                        f50 = T13;
                    }
                    canvas2.save();
                    float f73 = L2 * f22;
                    canvas2.translate(f73, 0.0f);
                    float f74 = -(!ijVar7.Q5() ? org.telegram.messenger.g0.L(6.0f) : org.telegram.messenger.g0.L(1.0f));
                    float L5 = !ijVar7.Q5() ? org.telegram.messenger.g0.L(1.0f) : org.telegram.messenger.g0.L(3.0f);
                    float f75 = (f69 - q1Var2.a8) + f74;
                    float T16 = org.telegram.messenger.g0.T1(L3, (f69 - this.K) + f74, f22) + (!q1Var2.c8 ? org.telegram.messenger.g0.L(3.0f) + f50 : 0.0f);
                    if (q1Var2.P7 == null) {
                        canvas2.save();
                        canvas2.translate(T16, (L5 * f22) + T12);
                        int alpha = org.telegram.ui.ActionBar.k6.Y2.getAlpha();
                        org.telegram.ui.ActionBar.k6.Y2.setAlpha((int) (alpha * f22));
                        q1Var2.P7.draw(canvas2);
                        org.telegram.ui.ActionBar.k6.Y2.setAlpha(alpha);
                        org.telegram.ui.ActionBar.k5 k5Var = ((org.telegram.ui.Components.zn[]) anVar4.b0.b)[0].c;
                        f51 = L3;
                        f52 = f73;
                        rectF = rectF5;
                        anVar2 = anVar4;
                        f24 = f49;
                        l51Var = this;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, k5Var.getWidth(), k5Var.getHeight(), (int) (f13 * 255.0f), 31);
                        k5Var.setAlpha(1.0f);
                        k5Var.draw(canvas2);
                        k5Var.setAlpha(0.0f);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        anVar2 = anVar4;
                        l51Var = this;
                        f51 = L3;
                        f52 = f73;
                        f24 = f49;
                        rectF = rectF5;
                    }
                    if (q1Var2.M7 && q1Var2.I7 != null) {
                        if (q1Var2.o8.i() != q1Var2.F7) {
                            Drawable drawable = q1Var2.I7;
                            int i17 = q1Var2.o8.i();
                            q1Var2.F7 = i17;
                            drawable.setColorFilter(new PorterDuffColorFilter(i17, PorterDuff.Mode.SRC_IN));
                        }
                        q1Var2.I7.setBounds((int) (((rectF.right - f52) - org.telegram.messenger.g0.L((!q1Var2.I ? 1 : 0) + 2)) - q1Var2.I7.getIntrinsicWidth()), (int) (rectF.top + org.telegram.messenger.g0.L((!q1Var2.I ? 1 : 0) + 2)), (int) ((rectF.right - f52) - org.telegram.messenger.g0.L((!q1Var2.I ? 1 : 0) + 2)), (int) (rectF.top + org.telegram.messenger.g0.L((!q1Var2.I ? 1 : 0) + 2) + q1Var2.I7.getIntrinsicHeight()));
                        q1Var2.I7.setAlpha((int) (f22 * 255.0f));
                        q1Var2.I7.draw(canvas2);
                    }
                    if (q1Var2.Q7 == null) {
                        canvas2.save();
                        float T17 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(19.0f), org.telegram.ui.ActionBar.k6.Y2.getTextSize() + org.telegram.messenger.g0.L(4.0f) + L5, f22) + T12;
                        if (q1Var2.M7 && q1Var2.c8) {
                            f75 -= org.telegram.messenger.g0.L(2.0f);
                        }
                        if (q1Var2.c8 && (!q1Var2.M7 || q1Var2.b8)) {
                            f75 = f50 + org.telegram.messenger.g0.L(3.0f) + f75;
                        }
                        float f76 = f75;
                        if (q1Var2.N7 && q1Var2.O7 != null) {
                            float T18 = org.telegram.messenger.g0.T1(f51 - q1Var2.a8, f76, f22);
                            q1Var2.O7.e((int) T18, org.telegram.messenger.g0.L(2.0f) + ((int) T17), org.telegram.messenger.g0.L(f48), org.telegram.messenger.g0.L(f48));
                            org.telegram.ui.ActionBar.k6.X1.setColor(org.telegram.ui.ActionBar.k6.w0(ijVar7.Q3() ? org.telegram.ui.ActionBar.k6.Hb : org.telegram.ui.ActionBar.k6.od, f6Var));
                            canvas2.drawCircle(T18 + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(8.0f) + T17, org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.k6.X1);
                            q1Var2.O7.h(-1, ijVar7.Q3() ? org.telegram.ui.ActionBar.k6.nc : org.telegram.ui.ActionBar.k6.le, org.telegram.ui.ActionBar.k6.k7);
                            CheckBoxBase checkBoxBase = q1Var2.O7;
                            if (checkBoxBase.h != f31) {
                                checkBoxBase.h = f31;
                                checkBoxBase.b();
                            }
                            q1Var2.O7.a(canvas2);
                        }
                        if (q1Var2.N7) {
                            f76 += org.telegram.messenger.g0.L(16.0f);
                        }
                        if (q1Var2.b8 && q1Var2.a8 > 0) {
                            f76 = ((rectF.right - org.telegram.messenger.g0.L(8.0f)) - q1Var2.Q7.getWidth()) - f52;
                        }
                        canvas2.translate(org.telegram.messenger.g0.T1(f51 - q1Var2.a8, f76, f22), T17);
                        canvas2.save();
                        xh.f.d(canvas2, arrayList);
                        f33 = z13;
                        f32 = f13;
                        org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas2, q1Var2.Q7, q1Var2.Aa, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
                        q1Var2.Q7.draw(canvas2);
                        canvas2.restore();
                        int size = arrayList.size();
                        int i18 = 0;
                        while (i18 < size) {
                            Object obj = arrayList.get(i18);
                            i18++;
                            xh.f fVar = (xh.f) obj;
                            boolean z14 = fVar.p;
                            fVar.p = false;
                            if (z14) {
                                fVar.h(q1Var2.Q7.getPaint().getColor());
                            }
                            fVar.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        f33 = z13;
                        f32 = f13;
                    }
                    canvas2.restore();
                } else if (ijVar.Q3()) {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Qb, f6Var);
                    b(org.telegram.ui.ActionBar.k6.Ob);
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Kd, f6Var);
                    b(org.telegram.ui.ActionBar.k6.Id);
                }
            }
            i13 = w02;
            if (!ijVar.Q5()) {
            }
            f28 = f66;
            f31 = f20;
            org.telegram.ui.ActionBar.k6.Z2.setColor(i0.a.f(f31, this.i, w03));
            org.telegram.ui.ActionBar.k6.Y2.setColor(i0.a.f(f31, this.h, i13));
            if (!q1Var2.c8) {
            }
            float T19 = org.telegram.messenger.g0.T1(L3, f69, f22);
            float T122 = org.telegram.messenger.g0.T1((org.telegram.messenger.g0.L(12.0f) * f31) + y15, f71, f31);
            if (this.R != null) {
            }
            RectF rectF22 = org.telegram.messenger.g0.P;
            rectF22.set(L3, y15, this.f + L3, org.telegram.messenger.g0.L(35.0f) + y15);
            rectF22.offset(0.0f, org.telegram.messenger.g0.L(f48) * f31);
            RectF rectF32 = q1Var2.La;
            RectF rectF42 = this.Q;
            rectF42.set(rectF32);
            rectF42.offset(f19, z13);
            RectF rectF52 = this.P;
            org.telegram.messenger.g0.Z1(rectF22, rectF42, f22, rectF52);
            org.telegram.messenger.ij ijVar72 = ijVar2;
            f29 = f62;
            f30 = f63;
            f34 = b10;
            q1Var2.o8.e(canvas, rectF52, f70, q1Var2.M7, q1Var2.getMessageObject().Q5());
            canvas2 = canvas;
            q1Var2.o8.f(canvas2, rectF52, f70);
            if (q1Var2.c8) {
            }
            canvas2.save();
            float f732 = L2 * f22;
            canvas2.translate(f732, 0.0f);
            float f742 = -(!ijVar72.Q5() ? org.telegram.messenger.g0.L(6.0f) : org.telegram.messenger.g0.L(1.0f));
            float L52 = !ijVar72.Q5() ? org.telegram.messenger.g0.L(1.0f) : org.telegram.messenger.g0.L(3.0f);
            float f752 = (f69 - q1Var2.a8) + f742;
            float T162 = org.telegram.messenger.g0.T1(L3, (f69 - this.K) + f742, f22) + (!q1Var2.c8 ? org.telegram.messenger.g0.L(3.0f) + f50 : 0.0f);
            if (q1Var2.P7 == null) {
            }
            if (q1Var2.M7) {
                if (q1Var2.o8.i() != q1Var2.F7) {
                }
                q1Var2.I7.setBounds((int) (((rectF.right - f52) - org.telegram.messenger.g0.L((!q1Var2.I ? 1 : 0) + 2)) - q1Var2.I7.getIntrinsicWidth()), (int) (rectF.top + org.telegram.messenger.g0.L((!q1Var2.I ? 1 : 0) + 2)), (int) ((rectF.right - f52) - org.telegram.messenger.g0.L((!q1Var2.I ? 1 : 0) + 2)), (int) (rectF.top + org.telegram.messenger.g0.L((!q1Var2.I ? 1 : 0) + 2) + q1Var2.I7.getIntrinsicHeight()));
                q1Var2.I7.setAlpha((int) (f22 * 255.0f));
                q1Var2.I7.draw(canvas2);
            }
            if (q1Var2.Q7 == null) {
            }
            canvas2.restore();
        } else {
            f23 = backgroundDrawableLeft;
            f24 = f21;
            i10 = L;
            l51Var = this;
            f25 = f68;
            f26 = f67;
            f27 = y12;
            f28 = f66;
            f29 = f62;
            f30 = f63;
            f31 = f20;
            f32 = f13;
            anVar2 = anVar;
            f33 = z13;
            f34 = b10;
        }
        canvas2.save();
        if (q1Var2.getMessageObject() == null || q1Var2.getMessageObject().D != 19) {
            canvas2.clipRect(f23 + org.telegram.messenger.g0.L(4.0f), f26 + org.telegram.messenger.g0.L(4.0f), i10 - org.telegram.messenger.g0.L(4.0f), f34 - org.telegram.messenger.g0.L(4.0f));
        }
        float f77 = (l51Var.C * f32) + f22;
        canvas2.save();
        float f78 = x10 * f32;
        float f79 = f30;
        float z15 = com.google.android.recaptcha.internal.a.z(f79, f29, f22, f78);
        float f80 = f27 * f28;
        ArrayList arrayList2 = q1Var2.getMessageObject().z2;
        org.telegram.messenger.fj fjVar2 = l51Var.E;
        canvas2.translate(z15, ((fjVar2.p(arrayList2, x1Var2) + f25) * f31) + f80);
        float f81 = f77 * 1.0f;
        canvas2.scale(f77, f81, 0.0f, 0.0f);
        boolean z16 = l51Var.o;
        int i19 = l51Var.M;
        boolean z17 = l51Var.n;
        StaticLayout staticLayout2 = l51Var.p;
        if (z17 && z16) {
            int color = staticLayout2.getPaint().getColor();
            float f82 = f24;
            staticLayout2.getPaint().setColor(i0.a.f(f82, l51Var.L, i19));
            float f83 = 1.0f - f82;
            f39 = f82;
            z9 = z16;
            f35 = f32;
            f37 = f31;
            i11 = i19;
            x1Var = x1Var2;
            f36 = f33;
            z10 = z17;
            fjVar = fjVar2;
            q1Var = q1Var2;
            f40 = f79;
            canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f83 * 255.0f), 31);
            staticLayout2.draw(canvas);
            f38 = f77;
            f41 = f81;
            f42 = f78;
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, l51Var.p, l51Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f83);
            staticLayout2.getPaint().setColor(color);
            canvas.restore();
            canvas3 = canvas;
        } else {
            z9 = z16;
            i11 = i19;
            f35 = f32;
            f36 = f33;
            f37 = f31;
            q1Var = q1Var2;
            z10 = z17;
            f38 = f77;
            f39 = f24;
            f40 = f79;
            f41 = f81;
            fjVar = fjVar2;
            x1Var = x1Var2;
            f42 = f78;
            if (z10) {
                float f84 = 1.0f - f39;
                canvas3 = canvas;
                canvas3.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f84 * 255.0f), 31);
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas3, l51Var.p, l51Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f84);
                canvas3.restore();
            } else {
                canvas3 = canvas;
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas3, l51Var.p, l51Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        }
        canvas3.restore();
        StaticLayout staticLayout3 = l51Var.q;
        if (staticLayout3 != null) {
            canvas3.save();
            canvas3.translate(com.google.android.recaptcha.internal.a.z(f40, l51Var.m, f22, f42), ((fjVar.p(q1Var.getMessageObject().z2, x1Var) + f25) * f37) + f80);
            f43 = f41;
            f45 = f38;
            canvas3.scale(f45, f43, 0.0f, 0.0f);
            if (z10 && z9) {
                int color2 = staticLayout3.getPaint().getColor();
                f44 = f39;
                i12 = i11;
                staticLayout3.getPaint().setColor(i0.a.o(i0.a.f(f44, l51Var.L, i12), (int) ((1.0f - f44) * Color.alpha(color2))));
                staticLayout3.draw(canvas3);
                staticLayout3.getPaint().setColor(color2);
            } else {
                f44 = f39;
                i12 = i11;
                if (z10) {
                    int alpha2 = staticLayout3.getPaint().getAlpha();
                    staticLayout3.getPaint().setAlpha((int) ((1.0f - f44) * alpha2));
                    staticLayout3.draw(canvas3);
                    staticLayout3.getPaint().setAlpha(alpha2);
                } else {
                    staticLayout3.draw(canvas3);
                }
            }
            canvas3.restore();
        } else {
            f43 = f41;
            f44 = f39;
            i12 = i11;
            f45 = f38;
        }
        if (z10) {
            canvas3.save();
            canvas3.translate(com.google.android.recaptcha.internal.a.z(x10, f40, f35, (pj0Var.getX() + q1Var.getLeft()) - ciVar.getX()), f36);
            canvas3.scale(f45, f43, q1Var.getTextX(), q1Var.getTextY());
            canvas3.translate(0.0f, -0.0f);
            int color3 = org.telegram.ui.ActionBar.k6.o2.getColor();
            org.telegram.ui.ActionBar.k6.o2.setColor(i12);
            ArrayList arrayList3 = q1Var.getMessageObject().z2;
            org.telegram.ui.Cells.q1 q1Var3 = q1Var;
            float f85 = q1Var3.t0;
            org.telegram.ui.Cells.x1 x1Var3 = q1Var3.hb;
            if (x1Var3.m2) {
                float f86 = x1Var3.o2;
                float f87 = x1Var3.L1;
                f85 = (f85 * f87) + ((1.0f - f87) * f86);
            }
            float f88 = q1Var3.n0;
            org.telegram.messenger.ij ijVar8 = q1Var3.P5;
            f46 = 0.0f;
            z11 = false;
            Canvas canvas4 = canvas3;
            q1Var3.f1(f88, f85, canvas4, arrayList3, ijVar8 == null ? 0.0f : ijVar8.v2, true, f44, false, true, false, false);
            canvas3 = canvas4;
            q1Var3.J0(canvas3, f44);
            if (org.telegram.ui.ActionBar.k6.o2.getColor() != color3) {
                org.telegram.ui.ActionBar.k6.o2.setColor(color3);
            }
            canvas3.restore();
        } else {
            f46 = 0.0f;
            z11 = false;
        }
        canvas3.restore();
        if (z12) {
            float f89 = i7;
            l51Var.u.setTranslate(f46, f89);
            l51Var.B.setLocalMatrix(l51Var.u);
            canvas3.drawRect(0.0f, f89, ciVar.getMeasuredWidth(), ciVar.getMeasuredHeight(), l51Var.v);
            canvas3.restore();
        }
        float f90 = l51Var.a;
        float f91 = f90 > 0.4f ? 1.0f : f90 / 0.4f;
        qj qjVar = l51Var.G;
        if (f91 == 1.0f) {
            qjVar.setTextTransitionIsRunning(z11);
        }
        if (qjVar.getSendButton().getVisibility() != 0 || f91 >= 1.0f) {
            return;
        }
        View sendButton = qjVar.getSendButton();
        ol olVar = anVar2.l1;
        PointF pointF = l51Var.O;
        jh.k.b(sendButton, olVar, pointF);
        canvas3.save();
        canvas3.translate(pointF.x - ciVar.getX(), pointF.y - ciVar.getY());
        View sendButton2 = qjVar.getSendButton();
        canvas3.saveLayerAlpha(0.0f, 0.0f, sendButton2.getWidth(), sendButton2.getHeight(), (int) ((1.0f - f91) * 255.0f));
        sendButton2.draw(canvas3);
        canvas3.restore();
        canvas3.restore();
        canvas3.restore();
    }

    public final int b(int i7) {
        return org.telegram.ui.ActionBar.k6.w0(i7, this.N);
    }
}
