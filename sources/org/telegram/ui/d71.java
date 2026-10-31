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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d71 implements ng0 {
    public final un A;
    public final LinearGradient B;
    public final float C;
    public final e2.f D;
    public final org.telegram.messenger.gj E;
    public final NinePatchDrawable F;
    public final mk G;
    public final org.telegram.ui.Components.k5 H;
    public float I;
    public float J;
    public final float K;
    public final int L;
    public final int M;
    public final org.telegram.ui.ActionBar.p6 N;
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
    public final org.telegram.messenger.jj k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final StaticLayout p;
    public final StaticLayout q;
    public final org.telegram.ui.Cells.q1 r;
    public final org.telegram.ui.Components.tk0 s;
    public final ih.e t;
    public final Matrix u;
    public final Paint v;
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    public d71(org.telegram.ui.Cells.q1 q1Var, un unVar, org.telegram.ui.Components.tk0 tk0Var, ih.e eVar, org.telegram.ui.ActionBar.p6 p6Var) {
        float f7;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.c5 J1;
        int i13;
        Object[] spans;
        Paint paint = new Paint(1);
        this.b = paint;
        this.D = new e2.f(null);
        PointF pointF = new PointF();
        this.O = pointF;
        this.P = new RectF();
        this.Q = new RectF();
        this.N = p6Var;
        if (q1Var.getMessageObject().z2 == null || q1Var.getMessageObject().z2.size() > 1 || q1Var.getMessageObject().z2.isEmpty() || ((org.telegram.messenger.gj) q1Var.getMessageObject().z2.get(0)).e.getLineCount() > 10) {
            return;
        }
        this.r = q1Var;
        this.s = tk0Var;
        this.t = eVar;
        this.A = unVar;
        mk mkVar = unVar.Z;
        this.G = mkVar;
        if (mkVar == null || mkVar.getEditField() == null || mkVar.getEditField().getLayout() == null) {
            return;
        }
        mkVar.getRecordCircle();
        paint.setFilterBitmap(true);
        this.k = q1Var.getMessageObject();
        if (!q1Var.getTransitionParams().w0) {
            q1Var.draw(new Canvas());
        }
        q1Var.setEnterTransitionInProgress(true);
        Editable editText = mkVar.getEditText();
        CharSequence charSequence = q1Var.getMessageObject().v;
        this.n = false;
        mkVar.getEditField().getLayout().getHeight();
        TextPaint textPaint = org.telegram.ui.ActionBar.t6.o2;
        org.telegram.messenger.i0.L(20.0f);
        if (q1Var.getMessageObject().N1 != 0) {
            boolean z10 = q1Var.getMessageObject().N1 == q1Var.getMessageObject().O1;
            f7 = 4.0f;
            switch (Math.max(q1Var.getMessageObject().N1, q1Var.getMessageObject().O1)) {
                case 0:
                case 1:
                case 2:
                    if (z10) {
                        textPaint = org.telegram.ui.ActionBar.t6.y2[0];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.t6.y2[2];
                        break;
                    }
                case 3:
                    if (z10) {
                        textPaint = org.telegram.ui.ActionBar.t6.y2[1];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.t6.y2[3];
                        break;
                    }
                case 4:
                    if (z10) {
                        textPaint = org.telegram.ui.ActionBar.t6.y2[2];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.t6.y2[4];
                        break;
                    }
                case 5:
                    if (z10) {
                        textPaint = org.telegram.ui.ActionBar.t6.y2[3];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.t6.y2[5];
                        break;
                    }
                case 6:
                    if (z10) {
                        textPaint = org.telegram.ui.ActionBar.t6.y2[4];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.t6.y2[5];
                        break;
                    }
                default:
                    textPaint = org.telegram.ui.ActionBar.t6.y2[5];
                    break;
            }
            if (textPaint != null) {
                textPaint.getTextSize();
                org.telegram.messenger.i0.L(4.0f);
            }
        } else {
            f7 = 4.0f;
        }
        boolean z11 = (charSequence instanceof Spannable) && (spans = ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class)) != null && spans.length > 0;
        if (editText.length() != charSequence.length() || z11) {
            this.n = true;
            int[] iArr = new int[1];
            CharSequence O3 = org.telegram.messenger.i0.O3(editText, iArr);
            if (iArr[0] > 0) {
                i10 = mkVar.getEditField().getLayout().getLineTop(mkVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                mkVar.getEditField().getLayout().getLineBottom(mkVar.getEditField().getLayout().getLineForOffset(O3.length() + iArr[0]));
            } else {
                i10 = 0;
            }
            org.telegram.ui.Components.o5.cloneSpans(charSequence);
            charSequence = org.telegram.messenger.k6.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
        } else {
            i10 = 0;
        }
        float textSize = mkVar.getEditField().getTextSize() / textPaint.getTextSize();
        this.C = textSize;
        int lineCount = mkVar.getEditField().getLayout().getLineCount();
        int width = (int) (mkVar.getEditField().getLayout().getWidth() / textSize);
        if (Build.VERSION.SDK_INT >= 24) {
            this.p = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
        } else {
            this.p = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.H = org.telegram.ui.Components.o5.update(2, (View) null, this.H, this.p);
        zg.h.b(mkVar.getEditField(), unVar.l1, pointF);
        float f12 = pointF.y;
        this.y = pointF.x;
        this.z = ((org.telegram.messenger.i0.L(10.0f) + f12) - mkVar.getEditField().getScrollY()) + i10;
        float f13 = 0.0f;
        this.l = 0.0f;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < this.p.getLineCount(); i14++) {
            float lineLeft = this.p.getLineLeft(i14);
            if (lineLeft < f14) {
                f14 = lineLeft;
            }
        }
        if (f14 != Float.MAX_VALUE) {
            this.l = f14;
        }
        this.p.getHeight();
        float L = org.telegram.messenger.i0.L(f7) + f12;
        this.j = L;
        float f15 = 12.0f;
        if (this.G.x0()) {
            this.j = L - org.telegram.messenger.i0.L(12.0f);
        }
        this.x = f12 + mkVar.getEditField().getMeasuredHeight();
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) q1Var.getMessageObject().z2.get(0);
        this.E = gjVar;
        StaticLayout staticLayout = gjVar.e;
        int i15 = org.telegram.ui.ActionBar.t6.Tc;
        double h = i0.b.h(org.telegram.ui.ActionBar.t6.w0(i15, this.N));
        int i16 = org.telegram.ui.ActionBar.t6.Ie;
        if (Math.abs(h - i0.b.h(org.telegram.ui.ActionBar.t6.w0(i16, this.N))) > 0.20000000298023224d) {
            this.n = true;
            this.o = true;
        }
        this.L = org.telegram.ui.ActionBar.t6.w0(i16, this.N);
        this.M = org.telegram.ui.ActionBar.t6.w0(i15, this.N);
        if (staticLayout.getLineCount() == this.p.getLineCount()) {
            lineCount = staticLayout.getLineCount();
            int i17 = 0;
            i11 = 0;
            i12 = 0;
            while (true) {
                if (i17 < lineCount) {
                    f11 = f15;
                    StaticLayout staticLayout2 = this.p;
                    f10 = f13;
                    if (staticLayout2.getLineRight(i17) != staticLayout2.getWidth() || staticLayout2.getLineLeft(i17) == f10) {
                        i11++;
                    } else {
                        i12++;
                    }
                    if (staticLayout.getLineEnd(i17) != this.p.getLineEnd(i17)) {
                        this.n = true;
                    } else {
                        i17++;
                        f15 = f11;
                        f13 = f10;
                    }
                } else {
                    f10 = f13;
                    f11 = f15;
                }
            }
        } else {
            f10 = 0.0f;
            f11 = 12.0f;
            this.n = true;
            i11 = 0;
            i12 = 0;
        }
        if (!this.n && i12 > 0 && i11 > 0) {
            SpannableString spannableString = new SpannableString(charSequence);
            SpannableString spannableString2 = new SpannableString(charSequence);
            float f16 = Float.MAX_VALUE;
            int i18 = 0;
            while (i18 < lineCount) {
                StaticLayout staticLayout3 = this.p;
                if (staticLayout3.getLineRight(i18) != staticLayout3.getWidth() || staticLayout3.getLineLeft(i18) == f10) {
                    i13 = lineCount;
                    spannableString2.setSpan(new org.telegram.ui.Components.wy(false), this.p.getLineStart(i18), this.p.getLineEnd(i18), 0);
                } else {
                    i13 = lineCount;
                    spannableString.setSpan(new org.telegram.ui.Components.wy(false), this.p.getLineStart(i18), this.p.getLineEnd(i18), 0);
                    float lineLeft2 = this.p.getLineLeft(i18);
                    if (lineLeft2 < f16) {
                        f16 = lineLeft2;
                    }
                }
                i18++;
                lineCount = i13;
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
        this.m = this.p.getWidth() - ((org.telegram.messenger.gj) q1Var.getMessageObject().z2.get(0)).e.getWidth();
        boolean z12 = (q1Var.getMessageObject().O1() == 0 || q1Var.O7 == null) ? false : true;
        this.c = z12;
        if (z12) {
            org.telegram.ui.ActionBar.u5 u5Var = ((org.telegram.ui.Components.io[]) unVar.b0.b)[0].c;
            zg.h.b(u5Var, unVar.l1, this.O);
            PointF pointF2 = this.O;
            this.e = pointF2.x;
            this.g = pointF2.y;
            this.f = ((View) u5Var.getParent()).getWidth();
            org.telegram.ui.ActionBar.u5 u5Var2 = ((org.telegram.ui.Components.io[]) unVar.b0.b)[0].d;
            zg.h.b(u5Var2, unVar.l1, this.O);
            float f17 = this.O.y;
            this.h = u5Var.getTextColor();
            this.i = u5Var2.getTextColor();
            this.j -= org.telegram.messenger.i0.L(46.0f);
        }
        this.S = tk0Var.getPaddingBottom() - (unVar.Oc - org.telegram.messenger.i0.L(44.0f));
        this.u = new Matrix();
        Paint paint2 = new Paint(1);
        this.v = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, org.telegram.messenger.i0.L(f11), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.B = linearGradient;
        paint2.setShader(linearGradient);
        this.w = q1Var.getMessageObject().k1;
        float f18 = f10;
        mkVar.getEditField().setAlpha(f18);
        mkVar.setTextTransitionIsRunning(true);
        StaticLayout staticLayout4 = q1Var.O7;
        if (staticLayout4 != null && staticLayout4.getText().length() > 1 && q1Var.O7.getPrimaryHorizontal(0) != f18) {
            this.K = q1Var.O7.getWidth() - q1Var.O7.getLineWidth(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new au0(1, mkVar, this, eVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(250L);
        ((ArrayList) eVar.c).add(this);
        eVar.a();
        ((ViewGroup) eVar.d).invalidate();
        this.D.d();
        ofFloat.addListener(new org.telegram.ui.Components.a20(this, eVar, q1Var, mkVar, unVar));
        if (org.telegram.messenger.tz.o() != 2 || (J1 = q1Var.J1(true)) == null) {
            return;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ge, this.N);
        Rect rect = J1.o;
        if (J1.F == null) {
            Bitmap createBitmap = Bitmap.createBitmap(J1.b(50.0f), J1.b(40.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            rect.set(J1.getBounds());
            Paint paint3 = new Paint(1);
            paint3.setColor(-1);
            J1.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            J1.c(canvas, paint3);
            J1.F = new NinePatchDrawable(createBitmap, w7.k9.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
            J1.setBounds(rect);
        }
        if (J1.G != w02) {
            J1.G = w02;
            J1.F.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        this.F = J1.F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x03c7, code lost:
    
        if (android.text.TextUtils.isEmpty(r8.z) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03df, code lost:
    
        if ((org.telegram.messenger.jj.o1(r5.C.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0433, code lost:
    
        if (android.text.TextUtils.isEmpty(r11.z) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x044b, code lost:
    
        if ((org.telegram.messenger.jj.o1(r5.C.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L105;
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
    @Override // org.telegram.ui.ng0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Canvas canvas2;
        float f18;
        un unVar;
        ImageReceiver imageReceiver;
        float f19;
        float f20;
        float f21;
        org.telegram.messenger.jj jjVar;
        float f22;
        float f23;
        int i11;
        d71 d71Var;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        un unVar2;
        float f32;
        float f33;
        boolean z10;
        int i12;
        float f34;
        float f35;
        float f36;
        org.telegram.ui.Cells.q1 q1Var;
        boolean z11;
        float f37;
        float f38;
        float f39;
        float f40;
        org.telegram.messenger.gj gjVar;
        org.telegram.ui.Cells.x1 x1Var;
        float f41;
        Canvas canvas3;
        float f42;
        float f43;
        int i13;
        float f44;
        float f45;
        boolean z12;
        int w02;
        int i14;
        float f46;
        org.telegram.messenger.jj jjVar2;
        int w03;
        float f47;
        float f48;
        float f49;
        float f50;
        float f51;
        RectF rectF;
        int i15;
        StaticLayout staticLayout;
        int i16;
        float f52;
        int i17;
        float f53;
        org.telegram.ui.Components.tk0 tk0Var = this.s;
        float y3 = tk0Var.getY();
        ih.e eVar = this.t;
        float y10 = (y3 - eVar.getY()) + tk0Var.getMeasuredHeight();
        float x10 = this.y - eVar.getX();
        float y11 = this.z - eVar.getY();
        org.telegram.ui.Cells.q1 q1Var2 = this.r;
        int textX = q1Var2.getTextX();
        org.telegram.ui.Cells.x1 x1Var2 = q1Var2.gb;
        ImageReceiver imageReceiver2 = q1Var2.R7;
        ArrayList arrayList = q1Var2.Rb;
        this.I = textX;
        this.J = q1Var2.getTextY();
        if (q1Var2.getMessageObject().k1 != this.w) {
            return;
        }
        float x11 = (tk0Var.getX() + q1Var2.getX()) - eVar.getX();
        float top = ((tk0Var.getTop() + (q1Var2.getPaddingTop() + q1Var2.getTop())) - eVar.getY()) - (this.S - tk0Var.getPaddingBottom());
        float interpolation = ci.o.V.getInterpolation(this.a);
        float f54 = this.a;
        float f55 = f54 > 0.4f ? 1.0f : f54 / 0.4f;
        float interpolation2 = org.telegram.ui.Components.gr.g.getInterpolation(org.telegram.ui.Components.gr.h.getInterpolation(f54));
        float f56 = this.I + x11;
        float f57 = this.J + top;
        float f58 = f55;
        float f59 = 1.0f - interpolation2;
        int measuredHeight = (int) ((y10 * interpolation2) + (eVar.getMeasuredHeight() * f59));
        boolean z13 = q1Var2.getBottom() - org.telegram.messenger.i0.L(4.0f) > tk0Var.getMeasuredHeight() && (((float) q1Var2.getMeasuredHeight()) + top) - ((float) org.telegram.messenger.i0.L(8.0f)) > ((float) measuredHeight) && eVar.getMeasuredHeight() > 0;
        if (z13) {
            i10 = measuredHeight;
            f11 = interpolation2;
            f14 = interpolation;
            f15 = f57;
            f16 = f58;
            f17 = x11;
            f12 = f59;
            f13 = f56;
            f7 = top;
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, Math.max(0.0f, top), eVar.getMeasuredWidth(), eVar.getMeasuredHeight(), org.telegram.messenger.zs.e4, 31);
        } else {
            i10 = measuredHeight;
            f7 = top;
            f10 = 0.0f;
            f11 = interpolation2;
            f12 = f59;
            f13 = f56;
            f14 = interpolation;
            f15 = f57;
            f16 = f58;
            f17 = x11;
            canvas2 = canvas;
        }
        canvas2.save();
        float y12 = tk0Var.getY();
        un unVar3 = this.A;
        canvas2.clipRect(f10, ((unVar3.L9 + y12) - eVar.getY()) - org.telegram.messenger.i0.L(3.0f), eVar.getMeasuredWidth(), eVar.getMeasuredHeight());
        canvas2.save();
        float f60 = f17;
        float f61 = this.l;
        float f62 = f13;
        float backgroundDrawableLeft = q1Var2.getBackgroundDrawableLeft() + f60 + ((x10 - (f62 - f61)) * f12);
        float f63 = f7;
        float backgroundDrawableTop = q1Var2.getBackgroundDrawableTop() + f63;
        float y13 = this.j - eVar.getY();
        float f64 = f14;
        float f65 = 1.0f - f64;
        float f66 = (backgroundDrawableTop * f64) + (y13 * f65);
        float b10 = org.telegram.messenger.z20.b(backgroundDrawableTop, q1Var2.getBackgroundDrawableBottom() - q1Var2.getBackgroundDrawableTop(), f64, (this.x - eVar.getY()) * f65);
        int L = (int) ((org.telegram.messenger.i0.L(4.0f) * f12) + q1Var2.getBackgroundDrawableRight() + f60);
        org.telegram.messenger.jj jjVar3 = this.k;
        org.telegram.ui.ActionBar.c5 J1 = !jjVar3.I2() ? q1Var2.J1(true) : null;
        if (J1 != null) {
            imageReceiver = imageReceiver2;
            q1Var2.setBackgroundTopY(eVar.getTop() - tk0Var.getTop());
            Drawable l4 = J1.l();
            f18 = f60;
            f20 = f16;
            if (f20 != 1.0f) {
                f19 = f64;
                NinePatchDrawable ninePatchDrawable = this.F;
                jjVar = jjVar3;
                if (ninePatchDrawable != null) {
                    unVar = unVar3;
                    ninePatchDrawable.setBounds((int) backgroundDrawableLeft, (int) f66, L, (int) b10);
                    ninePatchDrawable.draw(canvas2);
                } else {
                    unVar = unVar3;
                }
            } else {
                jjVar = jjVar3;
                unVar = unVar3;
                f19 = f64;
            }
            f21 = f11;
            if (l4 != null) {
                l4.setAlpha((int) (f21 * 255.0f));
                l4.setBounds((int) backgroundDrawableLeft, (int) f66, L, (int) b10);
                l4.draw(canvas2);
                l4.setAlpha(org.telegram.messenger.zs.e4);
            }
            J1.setAlpha((int) (f20 * 255.0f));
            J1.setBounds((int) backgroundDrawableLeft, (int) f66, L, (int) b10);
            J1.I = true;
            J1.draw(canvas2);
            J1.I = false;
            J1.setAlpha(org.telegram.messenger.zs.e4);
        } else {
            f18 = f60;
            unVar = unVar3;
            imageReceiver = imageReceiver2;
            f19 = f64;
            f20 = f16;
            f21 = f11;
            jjVar = jjVar3;
        }
        canvas2.restore();
        canvas2.save();
        if (J1 != null) {
            if (jjVar.P3()) {
                canvas2.clipRect(org.telegram.messenger.i0.L(4.0f) + backgroundDrawableLeft, org.telegram.messenger.i0.L(4.0f) + f66, L - org.telegram.messenger.i0.L(10.0f), b10 - org.telegram.messenger.i0.L(4.0f));
            } else {
                canvas2.clipRect(org.telegram.messenger.i0.L(4.0f) + backgroundDrawableLeft, org.telegram.messenger.i0.L(4.0f) + f66, L - org.telegram.messenger.i0.L(4.0f), b10 - org.telegram.messenger.i0.L(4.0f));
            }
        }
        float x12 = (tk0Var.getX() + q1Var2.getLeft()) - eVar.getX();
        float f67 = f15;
        float z14 = c3.i0.z(y11, f67, f65, f63);
        canvas2.translate(x12, z14);
        q1Var2.v1(f20, canvas2, false);
        q1Var2.f1(canvas2, f20);
        q1Var2.S0(canvas2, f20);
        q1Var2.O0(f20, canvas2, false);
        q1Var2.m1(canvas2, f20, null);
        q1Var2.T0(canvas2, f20);
        q1Var2.c1(canvas2, f20);
        canvas2.restore();
        if (this.c) {
            un unVar4 = unVar;
            ((org.telegram.ui.Components.io[]) unVar4.b0.b)[0].c.setAlpha(0.0f);
            ((org.telegram.ui.Components.io[]) unVar4.b0.b)[0].d.setAlpha(0.0f);
            org.telegram.messenger.i0.L(35.0f);
            int L2 = org.telegram.messenger.i0.L(10.0f);
            float x13 = this.e - eVar.getX();
            float y14 = this.g - eVar.getY();
            f22 = backgroundDrawableLeft;
            float f68 = f18 + q1Var2.S7;
            float f69 = f20;
            float f70 = q1Var2.T7 + f63;
            if (q1Var2.n8 == null) {
                q1Var2.n8 = new org.telegram.ui.Components.dl0(q1Var2);
            }
            i11 = L;
            q1Var2.n8.a(q1Var2.getMessageObject(), q1Var2.getCurrentUser(), q1Var2.getCurrentChat(), this.N, 0);
            boolean O5 = jjVar.O5();
            org.telegram.ui.ActionBar.p6 p6Var = this.N;
            if (O5) {
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ld, p6Var);
                b(org.telegram.ui.ActionBar.t6.Jd);
            } else {
                org.telegram.ui.Components.dl0 dl0Var = q1Var2.n8;
                if (dl0Var != null) {
                    i14 = dl0Var.I.c;
                    if (!jjVar.O5()) {
                        f46 = x13;
                        f25 = f66;
                        f26 = y11;
                        jjVar2 = jjVar;
                        f24 = f67;
                        org.telegram.ui.Components.dl0 dl0Var2 = q1Var2.n8;
                        if (dl0Var2 != null) {
                            w03 = dl0Var2.I.c;
                        } else {
                            if (jjVar2.B2()) {
                                org.telegram.messenger.jj jjVar4 = jjVar2.C;
                                if (jjVar4.D == 0 || !TextUtils.isEmpty(jjVar4.z)) {
                                    TLRPC.MessageMedia messageMedia = jjVar2.C.k.media;
                                    if (!(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                                        w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Rb, p6Var);
                                    }
                                }
                            }
                            w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sb, p6Var);
                        }
                    } else if (!jjVar.P3()) {
                        f46 = x13;
                        f25 = f66;
                        f26 = y11;
                        jjVar2 = jjVar;
                        f24 = f67;
                        if (!jjVar2.f4()) {
                            int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Md, p6Var);
                            if (!jjVar2.j2) {
                                if (jjVar2.B2()) {
                                    org.telegram.messenger.jj jjVar5 = jjVar2.C;
                                    if (jjVar5.D != 0) {
                                    }
                                    if (!(org.telegram.messenger.jj.o1(jjVar2.C.k) instanceof TLRPC.TL_messageMediaGame)) {
                                    }
                                }
                                if (!q1Var2.L7) {
                                    i16 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Nd, p6Var);
                                    f52 = 0.6f;
                                    w03 = i0.b.f(f52, i16, org.telegram.ui.ActionBar.t6.c(i16, i14));
                                }
                            }
                            i16 = w04;
                            f52 = 0.0f;
                            w03 = i0.b.f(f52, i16, org.telegram.ui.ActionBar.t6.c(i16, i14));
                        }
                        w03 = i14;
                    } else if (jjVar.f4()) {
                        f46 = x13;
                        f25 = f66;
                        f26 = y11;
                        jjVar2 = jjVar;
                        f24 = f67;
                        w03 = i14;
                    } else {
                        f46 = x13;
                        int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Rb, p6Var);
                        jjVar2 = jjVar;
                        f24 = f67;
                        if (jjVar2.j2) {
                            f25 = f66;
                        } else {
                            if (jjVar2.B2()) {
                                org.telegram.messenger.jj jjVar6 = jjVar2.C;
                                f25 = f66;
                                if (jjVar6.D != 0) {
                                }
                                if (!(org.telegram.messenger.jj.o1(jjVar2.C.k) instanceof TLRPC.TL_messageMediaGame)) {
                                }
                            } else {
                                f25 = f66;
                            }
                            if (!q1Var2.L7) {
                                i17 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sb, p6Var);
                                f53 = 0.6f;
                                f26 = y11;
                                w03 = i0.b.f(f53, i17, org.telegram.ui.ActionBar.t6.c(i17, i14));
                            }
                        }
                        i17 = w05;
                        f53 = 0.0f;
                        f26 = y11;
                        w03 = i0.b.f(f53, i17, org.telegram.ui.ActionBar.t6.c(i17, i14));
                    }
                    f27 = f65;
                    f30 = f19;
                    org.telegram.ui.ActionBar.t6.Z2.setColor(i0.b.f(f30, this.i, w03));
                    org.telegram.ui.ActionBar.t6.Y2.setColor(i0.b.f(f30, this.h, i14));
                    float L3 = !q1Var2.b8 ? f46 - org.telegram.messenger.i0.L(44.0f) : f46;
                    float T1 = org.telegram.messenger.i0.T1(L3, f68, f21);
                    float T12 = org.telegram.messenger.i0.T1((org.telegram.messenger.i0.L(12.0f) * f30) + y14, f70, f30);
                    if (this.R != null) {
                        this.R = new float[]{r12, r12, 0.0f, 0.0f, 0.0f, 0.0f, r12, r12};
                        f47 = 12.0f;
                        float L4 = org.telegram.messenger.i0.L(4.0f);
                        float[] fArr = this.R;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[2] = 0.0f;
                    } else {
                        f47 = 12.0f;
                    }
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    rectF2.set(L3, y14, this.f + L3, org.telegram.messenger.i0.L(35.0f) + y14);
                    rectF2.offset(0.0f, org.telegram.messenger.i0.L(f47) * f30);
                    RectF rectF3 = q1Var2.Ka;
                    RectF rectF4 = this.Q;
                    rectF4.set(rectF3);
                    rectF4.offset(f18, z14);
                    RectF rectF5 = this.P;
                    org.telegram.messenger.i0.Z1(rectF2, rectF4, f21, rectF5);
                    org.telegram.messenger.jj jjVar7 = jjVar2;
                    f28 = f61;
                    f29 = f62;
                    f33 = b10;
                    q1Var2.n8.e(canvas, rectF5, f69, q1Var2.L7, q1Var2.getMessageObject().O5());
                    canvas2 = canvas;
                    q1Var2.n8.f(canvas2, rectF5, f69);
                    if (q1Var2.b8) {
                        f48 = f69;
                        f49 = 0.0f;
                    } else {
                        canvas2.save();
                        float T13 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(35.0f), Math.min(rectF5.height() - org.telegram.messenger.i0.L(10.0f), org.telegram.ui.ActionBar.t6.Z2.getTextSize() + org.telegram.ui.ActionBar.t6.Y2.getTextSize() + org.telegram.messenger.i0.L(q1Var2.L7 ? 3.0f : 7.0f)), f21);
                        float T14 = org.telegram.messenger.i0.T1(T1, rectF5.left + org.telegram.messenger.i0.L(8.0f), f21);
                        float f71 = rectF5.top;
                        if (!q1Var2.L7 || (staticLayout = q1Var2.P7) == null) {
                            f48 = f69;
                        } else {
                            f48 = f69;
                            if (staticLayout.getLineCount() <= 1) {
                                i15 = 2;
                                float T15 = org.telegram.messenger.i0.T1(T12, f71 + org.telegram.messenger.i0.L(i15 + 5), f21);
                                ImageReceiver imageReceiver3 = imageReceiver;
                                imageReceiver3.y0(T14, T15, T13, T13);
                                imageReceiver3.h(canvas2, null);
                                canvas2.restore();
                                f49 = T13;
                            }
                        }
                        i15 = 0;
                        float T152 = org.telegram.messenger.i0.T1(T12, f71 + org.telegram.messenger.i0.L(i15 + 5), f21);
                        ImageReceiver imageReceiver32 = imageReceiver;
                        imageReceiver32.y0(T14, T152, T13, T13);
                        imageReceiver32.h(canvas2, null);
                        canvas2.restore();
                        f49 = T13;
                    }
                    canvas2.save();
                    float f72 = L2 * f21;
                    canvas2.translate(f72, 0.0f);
                    float f73 = -(!jjVar7.O5() ? org.telegram.messenger.i0.L(6.0f) : org.telegram.messenger.i0.L(1.0f));
                    float L5 = !jjVar7.O5() ? org.telegram.messenger.i0.L(1.0f) : org.telegram.messenger.i0.L(3.0f);
                    float f74 = (f68 - q1Var2.Z7) + f73;
                    float T16 = org.telegram.messenger.i0.T1(L3, (f68 - this.K) + f73, f21) + (!q1Var2.b8 ? org.telegram.messenger.i0.L(3.0f) + f49 : 0.0f);
                    if (q1Var2.O7 == null) {
                        canvas2.save();
                        canvas2.translate(T16, (L5 * f21) + T12);
                        int alpha = org.telegram.ui.ActionBar.t6.Y2.getAlpha();
                        org.telegram.ui.ActionBar.t6.Y2.setAlpha((int) (alpha * f21));
                        q1Var2.O7.draw(canvas2);
                        org.telegram.ui.ActionBar.t6.Y2.setAlpha(alpha);
                        org.telegram.ui.ActionBar.u5 u5Var = ((org.telegram.ui.Components.io[]) unVar4.b0.b)[0].c;
                        f50 = L3;
                        f51 = f72;
                        rectF = rectF5;
                        unVar2 = unVar4;
                        f23 = f48;
                        d71Var = this;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, u5Var.getWidth(), u5Var.getHeight(), (int) (f12 * 255.0f), 31);
                        u5Var.setAlpha(1.0f);
                        u5Var.draw(canvas2);
                        u5Var.setAlpha(0.0f);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        unVar2 = unVar4;
                        d71Var = this;
                        f50 = L3;
                        f51 = f72;
                        f23 = f48;
                        rectF = rectF5;
                    }
                    if (q1Var2.L7 && q1Var2.H7 != null) {
                        if (q1Var2.n8.i() != q1Var2.E7) {
                            Drawable drawable = q1Var2.H7;
                            int i18 = q1Var2.n8.i();
                            q1Var2.E7 = i18;
                            drawable.setColorFilter(new PorterDuffColorFilter(i18, PorterDuff.Mode.SRC_IN));
                        }
                        q1Var2.H7.setBounds((int) (((rectF.right - f51) - org.telegram.messenger.i0.L((!q1Var2.I ? 1 : 0) + 2)) - q1Var2.H7.getIntrinsicWidth()), (int) (rectF.top + org.telegram.messenger.i0.L((!q1Var2.I ? 1 : 0) + 2)), (int) ((rectF.right - f51) - org.telegram.messenger.i0.L((!q1Var2.I ? 1 : 0) + 2)), (int) (rectF.top + org.telegram.messenger.i0.L((!q1Var2.I ? 1 : 0) + 2) + q1Var2.H7.getIntrinsicHeight()));
                        q1Var2.H7.setAlpha((int) (f21 * 255.0f));
                        q1Var2.H7.draw(canvas2);
                    }
                    if (q1Var2.P7 == null) {
                        canvas2.save();
                        float T17 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(19.0f), org.telegram.ui.ActionBar.t6.Y2.getTextSize() + org.telegram.messenger.i0.L(4.0f) + L5, f21) + T12;
                        if (q1Var2.L7 && q1Var2.b8) {
                            f74 -= org.telegram.messenger.i0.L(2.0f);
                        }
                        if (q1Var2.b8 && (!q1Var2.L7 || q1Var2.a8)) {
                            f74 = f49 + org.telegram.messenger.i0.L(3.0f) + f74;
                        }
                        float f75 = f74;
                        if (q1Var2.M7 && q1Var2.N7 != null) {
                            float T18 = org.telegram.messenger.i0.T1(f50 - q1Var2.Z7, f75, f21);
                            q1Var2.N7.e((int) T18, org.telegram.messenger.i0.L(2.0f) + ((int) T17), org.telegram.messenger.i0.L(f47), org.telegram.messenger.i0.L(f47));
                            org.telegram.ui.ActionBar.t6.X1.setColor(org.telegram.ui.ActionBar.t6.w0(jjVar7.P3() ? org.telegram.ui.ActionBar.t6.Hb : org.telegram.ui.ActionBar.t6.od, p6Var));
                            canvas2.drawCircle(T18 + org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(8.0f) + T17, org.telegram.messenger.i0.L(5.0f), org.telegram.ui.ActionBar.t6.X1);
                            q1Var2.N7.h(-1, jjVar7.P3() ? org.telegram.ui.ActionBar.t6.nc : org.telegram.ui.ActionBar.t6.le, org.telegram.ui.ActionBar.t6.k7);
                            CheckBoxBase checkBoxBase = q1Var2.N7;
                            if (checkBoxBase.h != f30) {
                                checkBoxBase.h = f30;
                                checkBoxBase.b();
                            }
                            q1Var2.N7.a(canvas2);
                        }
                        if (q1Var2.M7) {
                            f75 += org.telegram.messenger.i0.L(16.0f);
                        }
                        if (q1Var2.a8 && q1Var2.Z7 > 0) {
                            f75 = ((rectF.right - org.telegram.messenger.i0.L(8.0f)) - q1Var2.P7.getWidth()) - f51;
                        }
                        canvas2.translate(org.telegram.messenger.i0.T1(f50 - q1Var2.Z7, f75, f21), T17);
                        canvas2.save();
                        nh.i.d(canvas2, arrayList);
                        f32 = z14;
                        f31 = f12;
                        org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, q1Var2.P7, q1Var2.za, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
                        q1Var2.P7.draw(canvas2);
                        canvas2.restore();
                        int size = arrayList.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj = arrayList.get(i19);
                            i19++;
                            nh.i iVar = (nh.i) obj;
                            boolean z15 = iVar.p;
                            iVar.p = false;
                            if (z15) {
                                iVar.h(q1Var2.P7.getPaint().getColor());
                            }
                            iVar.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        f32 = z14;
                        f31 = f12;
                    }
                    canvas2.restore();
                } else if (jjVar.P3()) {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Qb, p6Var);
                    b(org.telegram.ui.ActionBar.t6.Ob);
                } else {
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Kd, p6Var);
                    b(org.telegram.ui.ActionBar.t6.Id);
                }
            }
            i14 = w02;
            if (!jjVar.O5()) {
            }
            f27 = f65;
            f30 = f19;
            org.telegram.ui.ActionBar.t6.Z2.setColor(i0.b.f(f30, this.i, w03));
            org.telegram.ui.ActionBar.t6.Y2.setColor(i0.b.f(f30, this.h, i14));
            if (!q1Var2.b8) {
            }
            float T19 = org.telegram.messenger.i0.T1(L3, f68, f21);
            float T122 = org.telegram.messenger.i0.T1((org.telegram.messenger.i0.L(12.0f) * f30) + y14, f70, f30);
            if (this.R != null) {
            }
            RectF rectF22 = org.telegram.messenger.i0.P;
            rectF22.set(L3, y14, this.f + L3, org.telegram.messenger.i0.L(35.0f) + y14);
            rectF22.offset(0.0f, org.telegram.messenger.i0.L(f47) * f30);
            RectF rectF32 = q1Var2.Ka;
            RectF rectF42 = this.Q;
            rectF42.set(rectF32);
            rectF42.offset(f18, z14);
            RectF rectF52 = this.P;
            org.telegram.messenger.i0.Z1(rectF22, rectF42, f21, rectF52);
            org.telegram.messenger.jj jjVar72 = jjVar2;
            f28 = f61;
            f29 = f62;
            f33 = b10;
            q1Var2.n8.e(canvas, rectF52, f69, q1Var2.L7, q1Var2.getMessageObject().O5());
            canvas2 = canvas;
            q1Var2.n8.f(canvas2, rectF52, f69);
            if (q1Var2.b8) {
            }
            canvas2.save();
            float f722 = L2 * f21;
            canvas2.translate(f722, 0.0f);
            float f732 = -(!jjVar72.O5() ? org.telegram.messenger.i0.L(6.0f) : org.telegram.messenger.i0.L(1.0f));
            float L52 = !jjVar72.O5() ? org.telegram.messenger.i0.L(1.0f) : org.telegram.messenger.i0.L(3.0f);
            float f742 = (f68 - q1Var2.Z7) + f732;
            float T162 = org.telegram.messenger.i0.T1(L3, (f68 - this.K) + f732, f21) + (!q1Var2.b8 ? org.telegram.messenger.i0.L(3.0f) + f49 : 0.0f);
            if (q1Var2.O7 == null) {
            }
            if (q1Var2.L7) {
                if (q1Var2.n8.i() != q1Var2.E7) {
                }
                q1Var2.H7.setBounds((int) (((rectF.right - f51) - org.telegram.messenger.i0.L((!q1Var2.I ? 1 : 0) + 2)) - q1Var2.H7.getIntrinsicWidth()), (int) (rectF.top + org.telegram.messenger.i0.L((!q1Var2.I ? 1 : 0) + 2)), (int) ((rectF.right - f51) - org.telegram.messenger.i0.L((!q1Var2.I ? 1 : 0) + 2)), (int) (rectF.top + org.telegram.messenger.i0.L((!q1Var2.I ? 1 : 0) + 2) + q1Var2.H7.getIntrinsicHeight()));
                q1Var2.H7.setAlpha((int) (f21 * 255.0f));
                q1Var2.H7.draw(canvas2);
            }
            if (q1Var2.P7 == null) {
            }
            canvas2.restore();
        } else {
            f22 = backgroundDrawableLeft;
            f23 = f20;
            i11 = L;
            d71Var = this;
            f24 = f67;
            f25 = f66;
            f26 = y11;
            f27 = f65;
            f28 = f61;
            f29 = f62;
            f30 = f19;
            f31 = f12;
            unVar2 = unVar;
            f32 = z14;
            f33 = b10;
        }
        canvas2.save();
        if (q1Var2.getMessageObject() == null || q1Var2.getMessageObject().D != 19) {
            canvas2.clipRect(f22 + org.telegram.messenger.i0.L(4.0f), f25 + org.telegram.messenger.i0.L(4.0f), i11 - org.telegram.messenger.i0.L(4.0f), f33 - org.telegram.messenger.i0.L(4.0f));
        }
        float f76 = (d71Var.C * f31) + f21;
        canvas2.save();
        float f77 = x10 * f31;
        float f78 = f29;
        float z16 = c3.i0.z(f78, f28, f21, f77);
        float f79 = f26 * f27;
        ArrayList arrayList2 = q1Var2.getMessageObject().z2;
        org.telegram.messenger.gj gjVar2 = d71Var.E;
        canvas2.translate(z16, ((gjVar2.p(arrayList2, x1Var2) + f24) * f30) + f79);
        float f80 = f76 * 1.0f;
        canvas2.scale(f76, f80, 0.0f, 0.0f);
        boolean z17 = d71Var.o;
        int i20 = d71Var.M;
        boolean z18 = d71Var.n;
        StaticLayout staticLayout2 = d71Var.p;
        if (z18 && z17) {
            int color = staticLayout2.getPaint().getColor();
            float f81 = f23;
            staticLayout2.getPaint().setColor(i0.b.f(f81, d71Var.L, i20));
            float f82 = 1.0f - f81;
            f38 = f81;
            z10 = z17;
            f34 = f31;
            f36 = f30;
            i12 = i20;
            x1Var = x1Var2;
            f35 = f32;
            z11 = z18;
            gjVar = gjVar2;
            q1Var = q1Var2;
            f39 = f78;
            canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f82 * 255.0f), 31);
            staticLayout2.draw(canvas);
            f37 = f76;
            f40 = f80;
            f41 = f77;
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, d71Var.p, d71Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f82);
            staticLayout2.getPaint().setColor(color);
            canvas.restore();
            canvas3 = canvas;
        } else {
            z10 = z17;
            i12 = i20;
            f34 = f31;
            f35 = f32;
            f36 = f30;
            q1Var = q1Var2;
            z11 = z18;
            f37 = f76;
            f38 = f23;
            f39 = f78;
            f40 = f80;
            gjVar = gjVar2;
            x1Var = x1Var2;
            f41 = f77;
            if (z11) {
                float f83 = 1.0f - f38;
                canvas3 = canvas;
                canvas3.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f83 * 255.0f), 31);
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas3, d71Var.p, d71Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f83);
                canvas3.restore();
            } else {
                canvas3 = canvas;
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas3, d71Var.p, d71Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        }
        canvas3.restore();
        StaticLayout staticLayout3 = d71Var.q;
        if (staticLayout3 != null) {
            canvas3.save();
            canvas3.translate(c3.i0.z(f39, d71Var.m, f21, f41), ((gjVar.p(q1Var.getMessageObject().z2, x1Var) + f24) * f36) + f79);
            f42 = f40;
            f44 = f37;
            canvas3.scale(f44, f42, 0.0f, 0.0f);
            if (z11 && z10) {
                int color2 = staticLayout3.getPaint().getColor();
                f43 = f38;
                i13 = i12;
                staticLayout3.getPaint().setColor(i0.b.o(i0.b.f(f43, d71Var.L, i13), (int) ((1.0f - f43) * Color.alpha(color2))));
                staticLayout3.draw(canvas3);
                staticLayout3.getPaint().setColor(color2);
            } else {
                f43 = f38;
                i13 = i12;
                if (z11) {
                    int alpha2 = staticLayout3.getPaint().getAlpha();
                    staticLayout3.getPaint().setAlpha((int) ((1.0f - f43) * alpha2));
                    staticLayout3.draw(canvas3);
                    staticLayout3.getPaint().setAlpha(alpha2);
                } else {
                    staticLayout3.draw(canvas3);
                }
            }
            canvas3.restore();
        } else {
            f42 = f40;
            f43 = f38;
            i13 = i12;
            f44 = f37;
        }
        if (z11) {
            canvas3.save();
            canvas3.translate(c3.i0.z(x10, f39, f34, (tk0Var.getX() + q1Var.getLeft()) - eVar.getX()), f35);
            canvas3.scale(f44, f42, q1Var.getTextX(), q1Var.getTextY());
            canvas3.translate(0.0f, -0.0f);
            int color3 = org.telegram.ui.ActionBar.t6.o2.getColor();
            org.telegram.ui.ActionBar.t6.o2.setColor(i13);
            ArrayList arrayList3 = q1Var.getMessageObject().z2;
            org.telegram.ui.Cells.q1 q1Var3 = q1Var;
            float f84 = q1Var3.t0;
            org.telegram.ui.Cells.x1 x1Var3 = q1Var3.gb;
            if (x1Var3.m2) {
                float f85 = x1Var3.o2;
                float f86 = x1Var3.L1;
                f84 = (f84 * f86) + ((1.0f - f86) * f85);
            }
            float f87 = q1Var3.n0;
            org.telegram.messenger.jj jjVar8 = q1Var3.O5;
            f45 = 0.0f;
            z12 = false;
            Canvas canvas4 = canvas3;
            q1Var3.d1(f87, f84, canvas4, arrayList3, jjVar8 == null ? 0.0f : jjVar8.v2, true, f43, false, true, false, false);
            canvas3 = canvas4;
            q1Var3.H0(canvas3, f43);
            if (org.telegram.ui.ActionBar.t6.o2.getColor() != color3) {
                org.telegram.ui.ActionBar.t6.o2.setColor(color3);
            }
            canvas3.restore();
        } else {
            f45 = 0.0f;
            z12 = false;
        }
        canvas3.restore();
        if (z13) {
            float f88 = i10;
            d71Var.u.setTranslate(f45, f88);
            d71Var.B.setLocalMatrix(d71Var.u);
            canvas3.drawRect(0.0f, f88, eVar.getMeasuredWidth(), eVar.getMeasuredHeight(), d71Var.v);
            canvas3.restore();
        }
        float f89 = d71Var.a;
        float f90 = f89 > 0.4f ? 1.0f : f89 / 0.4f;
        mk mkVar = d71Var.G;
        if (f90 == 1.0f) {
            mkVar.setTextTransitionIsRunning(z12);
        }
        if (mkVar.getSendButton().getVisibility() != 0 || f90 >= 1.0f) {
            return;
        }
        View sendButton = mkVar.getSendButton();
        km kmVar = unVar2.l1;
        PointF pointF = d71Var.O;
        zg.h.b(sendButton, kmVar, pointF);
        canvas3.save();
        canvas3.translate(pointF.x - eVar.getX(), pointF.y - eVar.getY());
        View sendButton2 = mkVar.getSendButton();
        canvas3.saveLayerAlpha(0.0f, 0.0f, sendButton2.getWidth(), sendButton2.getHeight(), (int) ((1.0f - f90) * 255.0f));
        sendButton2.draw(canvas3);
        canvas3.restore();
        canvas3.restore();
        canvas3.restore();
    }

    public final int b(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.N);
    }
}
