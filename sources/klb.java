// default package

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
import android.graphics.Typeface;
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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class klb implements u37 {
    public final float A;
    public final zu1 B;
    public final LinearGradient C;
    public final float D;
    public final pn E;
    public final o47 F;
    public final NinePatchDrawable G;
    public final nr1 H;
    public final dm I;
    public float J;
    public float K;
    public final float L;
    public final int M;
    public final int N;
    public final vnb O;
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
    public final r47 k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final StaticLayout q;
    public final StaticLayout r;
    public final wb2 s;
    public final d79 t;
    public final m12 u;
    public final Matrix v;
    public final Paint w;
    public final int x;
    public final float y;
    public final float z;

    public klb(wb2 wb2Var, zu1 zu1Var, d79 d79Var, m12 m12Var, vnb vnbVar) {
        int i;
        StaticLayout staticLayout;
        int i2;
        int i3;
        t37 O1;
        Object[] spans;
        Paint paint = new Paint(1);
        this.b = paint;
        this.E = new pn(null);
        PointF pointF = new PointF();
        this.P = pointF;
        this.Q = new RectF();
        this.R = new RectF();
        this.O = vnbVar;
        if (wb2Var.getMessageObject().B2 == null || wb2Var.getMessageObject().B2.size() > 1 || wb2Var.getMessageObject().B2.isEmpty() || ((o47) wb2Var.getMessageObject().B2.get(0)).e.getLineCount() > 10) {
            return;
        }
        this.s = wb2Var;
        this.t = d79Var;
        this.u = m12Var;
        this.B = zu1Var;
        nr1 nr1Var = zu1Var.a0;
        this.H = nr1Var;
        if (nr1Var == null || nr1Var.getEditField() == null || nr1Var.getEditField().getLayout() == null) {
            return;
        }
        nr1Var.getRecordCircle();
        paint.setFilterBitmap(true);
        this.k = wb2Var.getMessageObject();
        if (!wb2Var.getTransitionParams().w0) {
            wb2Var.draw(new Canvas());
        }
        wb2Var.setEnterTransitionInProgress(true);
        Editable editText = nr1Var.getEditText();
        CharSequence charSequence = wb2Var.getMessageObject().v;
        this.n = false;
        this.o = nr1Var.E6 != 0 && SystemClock.uptimeMillis() - nr1Var.E6 < 1500;
        nr1Var.getEditField().getLayout().getHeight();
        TextPaint textPaint = aob.o2;
        Typeface typeface = hl.a;
        if (wb2Var.getMessageObject().P1 != 0) {
            boolean z = wb2Var.getMessageObject().P1 == wb2Var.getMessageObject().Q1;
            switch (Math.max(wb2Var.getMessageObject().P1, wb2Var.getMessageObject().Q1)) {
                case 0:
                case 1:
                case 2:
                    if (z) {
                        textPaint = aob.y2[0];
                        break;
                    } else {
                        textPaint = aob.y2[2];
                        break;
                    }
                case 3:
                    if (z) {
                        textPaint = aob.y2[1];
                        break;
                    } else {
                        textPaint = aob.y2[3];
                        break;
                    }
                case 4:
                    if (z) {
                        textPaint = aob.y2[2];
                        break;
                    } else {
                        textPaint = aob.y2[4];
                        break;
                    }
                case 5:
                    if (z) {
                        textPaint = aob.y2[3];
                        break;
                    } else {
                        textPaint = aob.y2[5];
                        break;
                    }
                case 6:
                    if (z) {
                        textPaint = aob.y2[4];
                        break;
                    } else {
                        textPaint = aob.y2[5];
                        break;
                    }
                default:
                    textPaint = aob.y2[5];
                    break;
            }
            if (textPaint != null) {
                textPaint.getTextSize();
            }
        }
        boolean z2 = (charSequence instanceof Spannable) && (spans = ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class)) != null && spans.length > 0;
        if (editText.length() != charSequence.length() || z2) {
            this.n = true;
            int[] iArr = new int[1];
            CharSequence J3 = hl.J3(editText, iArr);
            if (iArr[0] > 0) {
                i = nr1Var.getEditField().getLayout().getLineTop(nr1Var.getEditField().getLayout().getLineForOffset(iArr[0]));
                nr1Var.getEditField().getLayout().getLineBottom(nr1Var.getEditField().getLayout().getLineForOffset(J3.length() + iArr[0]));
            } else {
                i = 0;
            }
            hm.cloneSpans(charSequence);
            charSequence = pv3.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
        } else {
            i = 0;
        }
        float textSize = nr1Var.getEditField().getTextSize() / textPaint.getTextSize();
        this.D = textSize;
        int lineCount = nr1Var.getEditField().getLayout().getLineCount();
        int width = (int) (nr1Var.getEditField().getLayout().getWidth() / textSize);
        if (Build.VERSION.SDK_INT >= 24) {
            staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
            this.q = staticLayout;
        } else {
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.q = staticLayout2;
            staticLayout = staticLayout2;
        }
        this.I = hm.update(2, (View) null, this.I, staticLayout);
        yic.b(nr1Var.getEditField(), zu1Var.m1, pointF);
        float f = pointF.y;
        this.z = pointF.x;
        this.A = ((hl.L(10.0f) + f) - nr1Var.getEditField().getScrollY()) + i;
        this.l = 0.0f;
        float f2 = Float.MAX_VALUE;
        for (int i4 = 0; i4 < this.q.getLineCount(); i4++) {
            float lineLeft = this.q.getLineLeft(i4);
            if (lineLeft < f2) {
                f2 = lineLeft;
            }
        }
        if (f2 != Float.MAX_VALUE) {
            this.l = f2;
        }
        this.q.getHeight();
        float L = hl.L(4.0f) + f;
        this.j = L;
        if (this.H.a1()) {
            this.j = L - hl.L(12.0f);
        }
        this.y = f + nr1Var.getEditField().getMeasuredHeight();
        o47 o47Var = (o47) wb2Var.getMessageObject().B2.get(0);
        this.F = o47Var;
        StaticLayout staticLayout3 = o47Var.e;
        int i5 = aob.Wc;
        double h = vm2.h(aob.v0(i5, this.O));
        int i6 = aob.Le;
        if (Math.abs(h - vm2.h(aob.v0(i6, this.O))) > 0.20000000298023224d) {
            this.n = true;
            this.p = true;
        }
        this.M = aob.v0(i6, this.O);
        this.N = aob.v0(i5, this.O);
        if (staticLayout3.getLineCount() == this.q.getLineCount()) {
            lineCount = staticLayout3.getLineCount();
            int i7 = 0;
            int i8 = 0;
            i2 = 0;
            while (true) {
                if (i7 < lineCount) {
                    StaticLayout staticLayout4 = this.q;
                    int i9 = i8;
                    if (staticLayout4.getLineRight(i7) != staticLayout4.getWidth() || staticLayout4.getLineLeft(i7) == 0.0f) {
                        i8 = i9 + 1;
                    } else {
                        i2++;
                        i8 = i9;
                    }
                    if (staticLayout3.getLineEnd(i7) != this.q.getLineEnd(i7)) {
                        this.n = true;
                    } else {
                        i7++;
                    }
                }
            }
            i3 = i8;
        } else {
            this.n = true;
            i2 = 0;
            i3 = 0;
        }
        if (!this.n && i2 > 0 && i3 > 0) {
            SpannableString spannableString = new SpannableString(charSequence);
            SpannableString spannableString2 = new SpannableString(charSequence);
            float f3 = Float.MAX_VALUE;
            for (int i10 = 0; i10 < lineCount; i10++) {
                StaticLayout staticLayout5 = this.q;
                if (staticLayout5.getLineRight(i10) != staticLayout5.getWidth() || staticLayout5.getLineLeft(i10) == 0.0f) {
                    spannableString2.setSpan(new fy2((byte) 1), this.q.getLineStart(i10), this.q.getLineEnd(i10), 0);
                } else {
                    spannableString.setSpan(new fy2((byte) 1), this.q.getLineStart(i10), this.q.getLineEnd(i10), 0);
                    float lineLeft2 = this.q.getLineLeft(i10);
                    if (lineLeft2 < f3) {
                        f3 = lineLeft2;
                    }
                }
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
        this.m = this.q.getWidth() - ((o47) wb2Var.getMessageObject().B2.get(0)).e.getWidth();
        boolean z3 = (wb2Var.getMessageObject().N1() == 0 || wb2Var.Q7 == null) ? false : true;
        this.c = z3;
        if (z3) {
            ema emaVar = ((fd2[]) zu1Var.c0.b)[0].c;
            yic.b(emaVar, zu1Var.m1, this.P);
            PointF pointF2 = this.P;
            this.e = pointF2.x;
            this.g = pointF2.y;
            this.f = ((View) emaVar.getParent()).getWidth();
            ema emaVar2 = ((fd2[]) zu1Var.c0.b)[0].d;
            yic.b(emaVar2, zu1Var.m1, this.P);
            float f4 = this.P.y;
            this.h = emaVar.getTextColor();
            this.i = emaVar2.getTextColor();
            this.j -= hl.L(46.0f);
        }
        this.T = d79Var.getPaddingBottom() - (zu1Var.od - nr1Var.getRestingFieldHeight());
        this.v = new Matrix();
        Paint paint2 = new Paint(1);
        this.w = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, hl.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.C = linearGradient;
        paint2.setShader(linearGradient);
        this.x = wb2Var.getMessageObject().m1;
        nr1Var.getEditField().setAlpha(0.0f);
        nr1Var.setTextTransitionIsRunning(true);
        StaticLayout staticLayout6 = wb2Var.Q7;
        if (staticLayout6 != null && staticLayout6.getText().length() > 1 && wb2Var.Q7.getPrimaryHorizontal(0) != 0.0f) {
            this.L = wb2Var.Q7.getWidth() - wb2Var.Q7.getLineWidth(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new nk(this, nr1Var, m12Var, (byte) 6));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(250L);
        ((ArrayList) m12Var.c).add(this);
        m12Var.a();
        ((ViewGroup) m12Var.d).invalidate();
        this.E.d();
        ofFloat.addListener(new la5(this, m12Var, wb2Var, nr1Var, zu1Var));
        if (xea.o() != 2 || (O1 = wb2Var.O1(true)) == null) {
            return;
        }
        int v0 = aob.v0(aob.Je, this.O);
        Rect rect = O1.o;
        if (O1.F == null) {
            Bitmap createBitmap = Bitmap.createBitmap(O1.b(50.0f), O1.b(40.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            rect.set(O1.getBounds());
            Paint paint3 = new Paint(1);
            paint3.setColor(-1);
            O1.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            O1.c(canvas, paint3);
            O1.F = new NinePatchDrawable(createBitmap, jue.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
            O1.setBounds(rect);
        }
        if (O1.G != v0) {
            O1.G = v0;
            O1.F.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        }
        this.G = O1.F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x03e3, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.z) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03fb, code lost:
    
        if ((r47.n1(r4.C.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x044c, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.z) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0464, code lost:
    
        if ((r47.n1(r4.C.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0246  */
    @Override // u37
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2;
        int i;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        ImageReceiver imageReceiver;
        ArrayList arrayList;
        dc2 dc2Var;
        float f10;
        float f11;
        float f12;
        m12 m12Var;
        float f13;
        r47 r47Var;
        zu1 zu1Var;
        float f14;
        wb2 wb2Var;
        int i2;
        float f15;
        float f16;
        float f17;
        float f18;
        klb klbVar;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        zu1 zu1Var2;
        float f26;
        float f27;
        int i3;
        dc2 dc2Var2;
        boolean z;
        int i4;
        boolean z2;
        float f28;
        wb2 wb2Var2;
        float f29;
        float f30;
        float f31;
        float f32;
        o47 o47Var;
        float f33;
        float f34;
        int i5;
        int i6;
        float f35;
        float f36;
        float f37;
        int v0;
        r47 r47Var2;
        int v02;
        float f38;
        float f39;
        float f40;
        RectF rectF;
        float f41;
        int i7;
        StaticLayout staticLayout;
        float f42;
        int i8;
        float f43;
        d79 d79Var = this.t;
        float y = d79Var.getY();
        m12 m12Var2 = this.u;
        float y2 = (y - m12Var2.getY()) + d79Var.getMeasuredHeight();
        float x = this.z - m12Var2.getX();
        float y3 = this.A - m12Var2.getY();
        wb2 wb2Var3 = this.s;
        int textX = wb2Var3.getTextX();
        dc2 dc2Var3 = wb2Var3.ub;
        ImageReceiver imageReceiver2 = wb2Var3.T7;
        ArrayList arrayList2 = wb2Var3.fc;
        this.J = textX;
        this.K = wb2Var3.getTextY();
        if (wb2Var3.getMessageObject().m1 == this.x) {
            float x2 = (d79Var.getX() + wb2Var3.getX()) - m12Var2.getX();
            float top = ((d79Var.getTop() + (wb2Var3.getPaddingTop() + wb2Var3.getTop())) - m12Var2.getY()) - (this.T - d79Var.getPaddingBottom());
            float interpolation = bb2.V.getInterpolation(this.a);
            float f44 = this.a;
            float f45 = f44 > 0.4f ? 1.0f : f44 / 0.4f;
            float f46 = 1.0f - f45;
            float f47 = f45;
            if (this.o) {
                float min = 1.0f - Math.min(1.0f, f44 / 0.14f);
                float max = Math.max(0.0f, Math.min(1.0f, (this.a - 0.08f) / 0.16f));
                f = min;
                f2 = xnb.B(max, 2.0f, 3.0f, max * max);
            } else {
                f = f46;
                f2 = f47;
            }
            float interpolation2 = k43.g.getInterpolation(k43.h.getInterpolation(this.a));
            float f48 = this.J + x2;
            float f49 = this.K + top;
            float f50 = 1.0f - interpolation2;
            int measuredHeight = (int) ((y2 * interpolation2) + (m12Var2.getMeasuredHeight() * f50));
            boolean z3 = wb2Var3.getBottom() - hl.L(4.0f) > d79Var.getMeasuredHeight() && (((float) wb2Var3.getMeasuredHeight()) + top) - ((float) hl.L(8.0f)) > ((float) measuredHeight) && m12Var2.getMeasuredHeight() > 0;
            if (z3) {
                float max2 = Math.max(0.0f, top);
                float measuredWidth = m12Var2.getMeasuredWidth();
                float measuredHeight2 = m12Var2.getMeasuredHeight();
                arrayList = arrayList2;
                f11 = interpolation2;
                f5 = x2;
                i = measuredHeight;
                f3 = x;
                f4 = f48;
                f7 = 3.0f;
                f9 = interpolation;
                dc2Var = dc2Var3;
                f10 = f47;
                m12Var = m12Var2;
                f13 = top;
                canvas2 = canvas;
                f6 = f50;
                imageReceiver = imageReceiver2;
                f12 = f49;
                f8 = 2.0f;
                canvas2.saveLayerAlpha(0.0f, max2, measuredWidth, measuredHeight2, jn7.d4, 31);
            } else {
                canvas2 = canvas;
                i = measuredHeight;
                f3 = x;
                f4 = f48;
                f5 = x2;
                f6 = f50;
                f7 = 3.0f;
                f8 = 2.0f;
                f9 = interpolation;
                imageReceiver = imageReceiver2;
                arrayList = arrayList2;
                dc2Var = dc2Var3;
                f10 = f47;
                f11 = interpolation2;
                f12 = f49;
                m12Var = m12Var2;
                f13 = top;
            }
            canvas2.save();
            float y4 = d79Var.getY();
            zu1 zu1Var3 = this.B;
            canvas2.clipRect(0.0f, ((y4 + zu1Var3.P9) - m12Var.getY()) - hl.L(f7), m12Var.getMeasuredWidth(), m12Var.getMeasuredHeight());
            canvas2.save();
            float f51 = this.l;
            float backgroundDrawableLeft = f5 + wb2Var3.getBackgroundDrawableLeft() + ((f3 - (f4 - f51)) * f6);
            float backgroundDrawableTop = wb2Var3.getBackgroundDrawableTop() + f13;
            float f52 = 1.0f - f9;
            float y5 = (backgroundDrawableTop * f9) + ((this.j - m12Var.getY()) * f52);
            float v = uh9.v(backgroundDrawableTop, wb2Var3.getBackgroundDrawableBottom() - wb2Var3.getBackgroundDrawableTop(), f9, (this.y - m12Var.getY()) * f52);
            int L = (int) ((hl.L(4.0f) * f6) + f5 + wb2Var3.getBackgroundDrawableRight());
            r47 r47Var3 = this.k;
            float f53 = f11;
            t37 O1 = !r47Var3.I2() ? wb2Var3.O1(true) : null;
            if (O1 != null) {
                f14 = f9;
                wb2Var3.setBackgroundTopY(m12Var.getTop() - d79Var.getTop());
                Drawable k = O1.k();
                if (f10 != 1.0f) {
                    r47Var = r47Var3;
                    NinePatchDrawable ninePatchDrawable = this.G;
                    zu1Var = zu1Var3;
                    if (ninePatchDrawable != null) {
                        wb2Var = wb2Var3;
                        ninePatchDrawable.setBounds((int) backgroundDrawableLeft, (int) y5, L, (int) v);
                        ninePatchDrawable.draw(canvas2);
                        if (k != null) {
                            k.setAlpha((int) (f53 * 255.0f));
                            k.setBounds((int) backgroundDrawableLeft, (int) y5, L, (int) v);
                            k.draw(canvas2);
                            k.setAlpha(jn7.d4);
                        }
                        O1.setAlpha((int) (f10 * 255.0f));
                        O1.setBounds((int) backgroundDrawableLeft, (int) y5, L, (int) v);
                        O1.I = true;
                        O1.draw(canvas2);
                        O1.I = false;
                        O1.setAlpha(jn7.d4);
                    }
                } else {
                    r47Var = r47Var3;
                    zu1Var = zu1Var3;
                }
                wb2Var = wb2Var3;
                if (k != null) {
                }
                O1.setAlpha((int) (f10 * 255.0f));
                O1.setBounds((int) backgroundDrawableLeft, (int) y5, L, (int) v);
                O1.I = true;
                O1.draw(canvas2);
                O1.I = false;
                O1.setAlpha(jn7.d4);
            } else {
                r47Var = r47Var3;
                zu1Var = zu1Var3;
                f14 = f9;
                wb2Var = wb2Var3;
            }
            canvas2.restore();
            canvas2.save();
            if (O1 != null) {
                if (r47Var.O3()) {
                    canvas2.clipRect(hl.L(4.0f) + backgroundDrawableLeft, hl.L(4.0f) + y5, L - hl.L(10.0f), v - hl.L(4.0f));
                } else {
                    canvas2.clipRect(hl.L(4.0f) + backgroundDrawableLeft, hl.L(4.0f) + y5, L - hl.L(4.0f), v - hl.L(4.0f));
                }
            }
            float x3 = (d79Var.getX() + wb2Var.getLeft()) - m12Var.getX();
            float A = qd4.A(y3, f12, f52, f13);
            canvas2.translate(x3, A);
            wb2 wb2Var4 = wb2Var;
            wb2Var4.A1(f10, canvas2, false);
            wb2Var4.h1(canvas2, f10);
            wb2Var4.U0(canvas2, f10);
            wb2Var4.Q0(f10, canvas2, false);
            wb2Var4.q1(canvas2, f10, null);
            wb2Var4.V0(canvas2, f10);
            wb2Var4.e1(canvas2, f10);
            canvas2.restore();
            if (this.c) {
                zu1 zu1Var4 = zu1Var;
                ((fd2[]) zu1Var4.c0.b)[0].c.setAlpha(0.0f);
                ((fd2[]) zu1Var4.c0.b)[0].d.setAlpha(0.0f);
                int L2 = hl.L(10.0f);
                float x4 = this.e - m12Var.getX();
                float y6 = this.g - m12Var.getY();
                i2 = L;
                float f54 = f5 + wb2Var4.U7;
                f15 = backgroundDrawableLeft;
                float f55 = wb2Var4.V7 + f13;
                ab9 ab9Var = wb2Var4.p8;
                if (ab9Var == null) {
                    ab9Var = new ab9(wb2Var4);
                    wb2Var4.p8 = ab9Var;
                }
                ab9Var.a(wb2Var4.getMessageObject(), wb2Var4.getCurrentUser(), wb2Var4.getCurrentChat(), this.O, 0);
                boolean O5 = r47Var.O5();
                f18 = f12;
                vnb vnbVar = this.O;
                if (O5) {
                    v0 = aob.v0(aob.Od, vnbVar);
                    f37 = x4;
                    b(aob.Md);
                } else {
                    f37 = x4;
                    ab9 ab9Var2 = wb2Var4.p8;
                    if (ab9Var2 != null) {
                        v0 = ab9Var2.I.c;
                    } else if (r47Var.O3()) {
                        v0 = aob.v0(aob.Tb, vnbVar);
                        b(aob.Rb);
                    } else {
                        v0 = aob.v0(aob.Nd, vnbVar);
                        b(aob.Ld);
                    }
                }
                if (r47Var.O5()) {
                    f17 = f52;
                    f19 = v;
                    r47Var2 = r47Var;
                    f16 = y5;
                    ab9 ab9Var3 = wb2Var4.p8;
                    if (ab9Var3 != null) {
                        v02 = ab9Var3.I.c;
                    } else {
                        if (r47Var2.B2()) {
                            r47 r47Var4 = r47Var2.C;
                            if (r47Var4.D == 0 || !TextUtils.isEmpty(r47Var4.z)) {
                                TLRPC.MessageMedia messageMedia = r47Var2.C.k.media;
                                if (!(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                                    v02 = aob.v0(aob.Ub, vnbVar);
                                }
                            }
                        }
                        v02 = aob.v0(aob.Vb, vnbVar);
                    }
                } else if (!r47Var.O3()) {
                    f17 = f52;
                    f19 = v;
                    r47Var2 = r47Var;
                    f16 = y5;
                    if (!r47Var2.e4()) {
                        int v03 = aob.v0(aob.Pd, vnbVar);
                        if (!r47Var2.l2) {
                            if (r47Var2.B2()) {
                                r47 r47Var5 = r47Var2.C;
                                if (r47Var5.D != 0) {
                                }
                                if (!(r47.n1(r47Var2.C.k) instanceof TLRPC.TL_messageMediaGame)) {
                                }
                            }
                            if (!wb2Var4.N7) {
                                v03 = aob.v0(aob.Qd, vnbVar);
                                f42 = 0.6f;
                                v02 = vm2.f(f42, v03, aob.b(v03, v0));
                            }
                        }
                        f42 = 0.0f;
                        v02 = vm2.f(f42, v03, aob.b(v03, v0));
                    }
                    v02 = v0;
                } else if (r47Var.e4()) {
                    f17 = f52;
                    f19 = v;
                    r47Var2 = r47Var;
                    f16 = y5;
                    v02 = v0;
                } else {
                    int v04 = aob.v0(aob.Ub, vnbVar);
                    r47Var2 = r47Var;
                    f16 = y5;
                    if (r47Var2.l2) {
                        f17 = f52;
                    } else {
                        if (r47Var2.B2()) {
                            r47 r47Var6 = r47Var2.C;
                            f17 = f52;
                            if (r47Var6.D != 0) {
                            }
                            if (!(r47.n1(r47Var2.C.k) instanceof TLRPC.TL_messageMediaGame)) {
                            }
                        } else {
                            f17 = f52;
                        }
                        if (!wb2Var4.N7) {
                            i8 = aob.v0(aob.Vb, vnbVar);
                            f43 = 0.6f;
                            f19 = v;
                            v02 = vm2.f(f43, i8, aob.b(i8, v0));
                        }
                    }
                    i8 = v04;
                    f43 = 0.0f;
                    f19 = v;
                    v02 = vm2.f(f43, i8, aob.b(i8, v0));
                }
                f21 = y3;
                f26 = f14;
                aob.Z2.setColor(vm2.f(f26, this.i, v02));
                aob.Y2.setColor(vm2.f(f26, this.h, v0));
                float L3 = wb2Var4.d8 ? f37 - hl.L(44.0f) : f37;
                f25 = f53;
                float R1 = hl.R1(L3, f54, f25);
                float R12 = hl.R1((hl.L(12.0f) * f26) + y6, f55, f26);
                if (this.S == null) {
                    this.S = new float[]{r2, r2, 0.0f, 0.0f, 0.0f, 0.0f, r2, r2};
                    f38 = f54;
                    float L4 = hl.L(4.0f);
                    float[] fArr = this.S;
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                } else {
                    f38 = f54;
                }
                RectF rectF2 = hl.P;
                rectF2.set(L3, y6, this.f + L3, hl.L(35.0f) + y6);
                rectF2.offset(0.0f, hl.L(12.0f) * f26);
                RectF rectF3 = wb2Var4.Ya;
                RectF rectF4 = this.R;
                rectF4.set(rectF3);
                rectF4.offset(f5, A);
                RectF rectF5 = this.Q;
                hl.X1(rectF2, rectF4, f25, rectF5);
                f20 = A;
                f24 = f51;
                r47 r47Var7 = r47Var2;
                float f56 = f10;
                wb2Var4.p8.e(canvas, rectF5, f56, wb2Var4.N7, wb2Var4.getMessageObject().O5());
                canvas2 = canvas;
                wb2Var4.p8.f(canvas2, rectF5, f56);
                if (wb2Var4.d8) {
                    canvas2.save();
                    float R13 = hl.R1(hl.L(35.0f), Math.min(rectF5.height() - hl.L(10.0f), aob.Z2.getTextSize() + aob.Y2.getTextSize() + hl.L(wb2Var4.N7 ? f7 : 7.0f)), f25);
                    float R14 = hl.R1(R1, rectF5.left + hl.L(8.0f), f25);
                    float f57 = rectF5.top;
                    if (!wb2Var4.N7 || (staticLayout = wb2Var4.R7) == null) {
                        f39 = f56;
                    } else {
                        f39 = f56;
                        if (staticLayout.getLineCount() <= 1) {
                            i7 = 2;
                            float R15 = hl.R1(R12, f57 + hl.L(i7 + 5), f25);
                            ImageReceiver imageReceiver3 = imageReceiver;
                            imageReceiver3.i0(R14, R15, R13, R13);
                            imageReceiver3.h(canvas2, null);
                            canvas2.restore();
                            f40 = R13;
                        }
                    }
                    i7 = 0;
                    float R152 = hl.R1(R12, f57 + hl.L(i7 + 5), f25);
                    ImageReceiver imageReceiver32 = imageReceiver;
                    imageReceiver32.i0(R14, R152, R13, R13);
                    imageReceiver32.h(canvas2, null);
                    canvas2.restore();
                    f40 = R13;
                } else {
                    f39 = f56;
                    f40 = 0.0f;
                }
                canvas2.save();
                float f58 = L2 * f25;
                canvas2.translate(f58, 0.0f);
                float f59 = -(r47Var7.O5() ? hl.L(6.0f) : hl.L(1.0f));
                float L5 = r47Var7.O5() ? hl.L(1.0f) : hl.L(f7);
                float f60 = (f38 - wb2Var4.b8) + f59;
                float R16 = hl.R1(L3, (f38 - this.L) + f59, f25) + (wb2Var4.d8 ? hl.L(f7) + f40 : 0.0f);
                if (wb2Var4.Q7 != null) {
                    canvas2.save();
                    canvas2.translate(R16, (L5 * f25) + R12);
                    int alpha = aob.Y2.getAlpha();
                    aob.Y2.setAlpha((int) (alpha * f25));
                    wb2Var4.Q7.draw(canvas2);
                    aob.Y2.setAlpha(alpha);
                    ema emaVar = ((fd2[]) zu1Var4.c0.b)[0].c;
                    f22 = f39;
                    zu1Var2 = zu1Var4;
                    rectF = rectF5;
                    f41 = f58;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, emaVar.getWidth(), emaVar.getHeight(), (int) (f6 * 255.0f), 31);
                    emaVar.setAlpha(1.0f);
                    emaVar.draw(canvas2);
                    emaVar.setAlpha(0.0f);
                    canvas2.restore();
                    canvas2.restore();
                } else {
                    rectF = rectF5;
                    zu1Var2 = zu1Var4;
                    f22 = f39;
                    f41 = f58;
                }
                if (wb2Var4.N7 && wb2Var4.J7 != null) {
                    if (wb2Var4.p8.h() != wb2Var4.G7) {
                        Drawable drawable = wb2Var4.J7;
                        int h = wb2Var4.p8.h();
                        wb2Var4.G7 = h;
                        drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN));
                    }
                    wb2Var4.J7.setBounds((int) (((rectF.right - f41) - hl.L((!wb2Var4.J ? 1 : 0) + 2)) - wb2Var4.J7.getIntrinsicWidth()), (int) (rectF.top + hl.L((!wb2Var4.J ? 1 : 0) + 2)), (int) ((rectF.right - f41) - hl.L((!wb2Var4.J ? 1 : 0) + 2)), (int) (rectF.top + hl.L((!wb2Var4.J ? 1 : 0) + 2) + wb2Var4.J7.getIntrinsicHeight()));
                    wb2Var4.J7.setAlpha((int) (f25 * 255.0f));
                    wb2Var4.J7.draw(canvas2);
                }
                if (wb2Var4.R7 != null) {
                    canvas2.save();
                    float R17 = hl.R1(hl.L(19.0f), aob.Y2.getTextSize() + hl.L(4.0f) + L5, f25) + R12;
                    if (wb2Var4.N7 && wb2Var4.d8) {
                        f60 -= hl.L(f8);
                    }
                    if (wb2Var4.d8 && (!wb2Var4.N7 || wb2Var4.c8)) {
                        f60 = f40 + hl.L(f7) + f60;
                    }
                    float f61 = f60;
                    if (wb2Var4.O7 && wb2Var4.P7 != null) {
                        float R18 = hl.R1(L3 - wb2Var4.b8, f61, f25);
                        wb2Var4.P7.e((int) R18, hl.L(f8) + ((int) R17), hl.L(12.0f), hl.L(12.0f));
                        aob.X1.setColor(aob.v0(r47Var7.O3() ? aob.Kb : aob.rd, vnbVar));
                        canvas2.drawCircle(R18 + hl.L(6.0f), hl.L(8.0f) + R17, hl.L(5.0f), aob.X1);
                        wb2Var4.P7.h(-1, r47Var7.O3() ? aob.qc : aob.oe, aob.k7);
                        CheckBoxBase checkBoxBase = wb2Var4.P7;
                        if (checkBoxBase.h != f26) {
                            checkBoxBase.h = f26;
                            checkBoxBase.b();
                        }
                        wb2Var4.P7.a(canvas2);
                    }
                    if (wb2Var4.O7) {
                        f61 += hl.L(16.0f);
                    }
                    if (wb2Var4.c8 && wb2Var4.b8 > 0) {
                        f61 = ((rectF.right - hl.L(8.0f)) - wb2Var4.R7.getWidth()) - f41;
                    }
                    canvas2.translate(hl.R1(L3 - wb2Var4.b8, f61, f25), R17);
                    canvas2.save();
                    ArrayList arrayList3 = arrayList;
                    npa.d(canvas2, arrayList3);
                    klbVar = this;
                    f23 = f4;
                    hm.drawAnimatedEmojis(canvas2, wb2Var4.R7, wb2Var4.Na, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f);
                    wb2Var4.R7.draw(canvas2);
                    canvas2.restore();
                    int size = arrayList3.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList3.get(i9);
                        i9++;
                        npa npaVar = (npa) obj;
                        boolean z4 = npaVar.p;
                        npaVar.p = false;
                        if (z4) {
                            npaVar.h(wb2Var4.R7.getPaint().getColor());
                        }
                        npaVar.draw(canvas2);
                    }
                    canvas2.restore();
                } else {
                    klbVar = this;
                    f23 = f4;
                }
                canvas2.restore();
            } else {
                i2 = L;
                f15 = backgroundDrawableLeft;
                f16 = y5;
                f17 = f52;
                f18 = f12;
                klbVar = this;
                f19 = v;
                f20 = A;
                f21 = y3;
                f22 = f10;
                f23 = f4;
                f24 = f51;
                f25 = f53;
                zu1Var2 = zu1Var;
                f26 = f14;
            }
            canvas2.save();
            if (wb2Var4.getMessageObject() == null || wb2Var4.getMessageObject().D != 19) {
                canvas2.clipRect(f15 + hl.L(4.0f), f16 + hl.L(4.0f), i2 - hl.L(4.0f), f19 - hl.L(4.0f));
            }
            float f62 = (klbVar.D * f6) + f25;
            canvas2.save();
            float f63 = f3 * f6;
            float A2 = qd4.A(f23, f24, f25, f63);
            float f64 = f21 * f17;
            ArrayList arrayList4 = wb2Var4.getMessageObject().B2;
            o47 o47Var2 = klbVar.F;
            dc2 dc2Var4 = dc2Var;
            canvas2.translate(A2, ((o47Var2.p(arrayList4, dc2Var4) + f18) * f26) + f64);
            float f65 = f62 * 1.0f;
            canvas2.scale(f62, f65, 0.0f, 0.0f);
            int i10 = klbVar.M;
            boolean z5 = klbVar.p;
            int i11 = klbVar.N;
            boolean z6 = klbVar.n;
            StaticLayout staticLayout2 = klbVar.q;
            if (!z6) {
                f27 = f65;
                i3 = i10;
                dc2Var2 = dc2Var4;
                z = z5;
                i4 = i11;
                z2 = z6;
                f28 = f26;
                wb2Var2 = wb2Var4;
                f29 = f;
                f30 = f22;
                f31 = f63;
                f32 = f62;
                o47Var = o47Var2;
                staticLayout2.draw(canvas2);
                hm.drawAnimatedEmojis(canvas2, klbVar.q, klbVar.I, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            } else if (z5) {
                int color = staticLayout2.getPaint().getColor();
                float f66 = f22;
                staticLayout2.getPaint().setColor(vm2.f(f66, i10, i11));
                z2 = z6;
                z = z5;
                dc2Var2 = dc2Var4;
                i4 = i11;
                f27 = f65;
                i3 = i10;
                canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f * 255.0f), 31);
                staticLayout2.draw(canvas);
                o47Var = o47Var2;
                float f67 = f;
                f32 = f62;
                f28 = f26;
                wb2Var2 = wb2Var4;
                f31 = f63;
                f30 = f66;
                hm.drawAnimatedEmojis(canvas, klbVar.q, klbVar.I, 0.0f, null, 0.0f, 0.0f, 0.0f, f67);
                staticLayout2.getPaint().setColor(color);
                canvas.restore();
                canvas2 = canvas;
                f29 = f67;
            } else {
                o47Var = o47Var2;
                float f68 = f;
                f32 = f62;
                f27 = f65;
                i3 = i10;
                dc2Var2 = dc2Var4;
                z = z5;
                i4 = i11;
                z2 = z6;
                f28 = f26;
                wb2Var2 = wb2Var4;
                f30 = f22;
                f31 = f63;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f68 * 255.0f), 31);
                staticLayout2.draw(canvas2);
                hm.drawAnimatedEmojis(canvas2, klbVar.q, klbVar.I, 0.0f, null, 0.0f, 0.0f, 0.0f, f68);
                f29 = f68;
                canvas2.restore();
            }
            canvas2.restore();
            StaticLayout staticLayout3 = klbVar.r;
            if (staticLayout3 != null) {
                canvas2.save();
                canvas2.translate(qd4.A(f23, klbVar.m, f25, f31), ((o47Var.p(wb2Var2.getMessageObject().B2, dc2Var2) + f18) * f28) + f64);
                f33 = f32;
                f34 = f27;
                canvas2.scale(f33, f34, 0.0f, 0.0f);
                if (!z2) {
                    i5 = i4;
                    staticLayout3.draw(canvas2);
                } else if (z) {
                    int color2 = staticLayout3.getPaint().getColor();
                    i5 = i4;
                    staticLayout3.getPaint().setColor(vm2.o(vm2.f(f30, i3, i5), (int) (Color.alpha(color2) * f29)));
                    staticLayout3.draw(canvas2);
                    staticLayout3.getPaint().setColor(color2);
                } else {
                    i5 = i4;
                    int alpha2 = staticLayout3.getPaint().getAlpha();
                    staticLayout3.getPaint().setAlpha((int) (alpha2 * f29));
                    staticLayout3.draw(canvas2);
                    staticLayout3.getPaint().setAlpha(alpha2);
                }
                canvas2.restore();
            } else {
                f33 = f32;
                f34 = f27;
                i5 = i4;
            }
            if (z2) {
                canvas2.save();
                canvas2.translate(qd4.A(f3, f23, f6, (d79Var.getX() + wb2Var2.getLeft()) - m12Var.getX()), f20);
                canvas2.scale(f33, f34, wb2Var2.getTextX(), wb2Var2.getTextY());
                canvas2.translate(0.0f, -0.0f);
                int color3 = aob.o2.getColor();
                aob.o2.setColor(i5);
                ArrayList arrayList5 = wb2Var2.getMessageObject().B2;
                wb2 wb2Var5 = wb2Var2;
                float f69 = wb2Var5.u0;
                dc2 dc2Var5 = wb2Var5.ub;
                if (dc2Var5.m2) {
                    float f70 = dc2Var5.o2;
                    float f71 = dc2Var5.L1;
                    f36 = 1.0f;
                    f69 = (f69 * f71) + ((1.0f - f71) * f70);
                } else {
                    f36 = 1.0f;
                }
                float f72 = f69;
                float f73 = wb2Var5.o0;
                r47 r47Var8 = wb2Var5.Q5;
                f35 = 0.0f;
                float f74 = f2;
                Canvas canvas3 = canvas2;
                i6 = i;
                wb2Var5.f1(f73, f72, canvas3, arrayList5, r47Var8 == null ? 0.0f : r47Var8.x2, true, f74, false, true, false, false);
                canvas2 = canvas3;
                wb2Var5.J0(canvas2, f74);
                if (aob.o2.getColor() != color3) {
                    aob.o2.setColor(color3);
                }
                canvas2.restore();
            } else {
                i6 = i;
                f35 = 0.0f;
                f36 = 1.0f;
            }
            canvas2.restore();
            if (z3) {
                float f75 = i6;
                Matrix matrix = klbVar.v;
                matrix.setTranslate(f35, f75);
                klbVar.C.setLocalMatrix(matrix);
                canvas2.drawRect(0.0f, f75, m12Var.getMeasuredWidth(), m12Var.getMeasuredHeight(), klbVar.w);
                canvas2.restore();
            }
            float f76 = klbVar.a;
            float f77 = f76 > 0.4f ? f36 : f76 / 0.4f;
            nr1 nr1Var = klbVar.H;
            if (f77 == f36) {
                nr1Var.setTextTransitionIsRunning(false);
            }
            if (nr1Var.getSendButton().getVisibility() != 0 || f77 >= f36) {
                return;
            }
            View sendButton = nr1Var.getSendButton();
            nt1 nt1Var = zu1Var2.m1;
            PointF pointF = klbVar.P;
            yic.b(sendButton, nt1Var, pointF);
            canvas2.save();
            canvas2.translate(pointF.x - m12Var.getX(), pointF.y - m12Var.getY());
            View sendButton2 = nr1Var.getSendButton();
            canvas.saveLayerAlpha(0.0f, 0.0f, sendButton2.getWidth(), sendButton2.getHeight(), (int) ((f36 - f77) * 255.0f));
            sendButton2.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.restore();
        }
    }

    public final int b(int i) {
        return aob.v0(i, this.O);
    }
}
