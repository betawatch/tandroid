package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sx0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class i extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final int c0 = org.telegram.messenger.i0.L(76.0f);
    public static final int d0 = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
    public StaticLayout D;
    public final ji.a E;
    public g F;
    public t80 G;
    public final org.telegram.ui.ActionBar.k2 H;
    public final org.telegram.ui.ActionBar.p6 I;
    public final FrameLayout J;
    public final y K;
    public StaticLayout L;
    public StaticLayout[] M;
    public int N;
    public Point[] O;
    public boolean P;
    public boolean Q;
    public int R;
    public final Paint S;
    public final float T;
    public final mg.c2 U;
    public float V;
    public ValueAnimator W;
    public StaticLayout a;
    public int a0;
    public String b;
    public boolean b0;
    public int c;
    public int d;
    public SpannableStringBuilder e;
    public SpannableStringBuilder f;
    public final TextView h;
    public final c n;
    public final FrameLayout r;
    public final FrameLayout s;
    public final Drawable w;
    public q80 x;
    public float y;

    public i(Context context, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        new Point();
        int i10 = 0;
        new k80(0);
        this.M = null;
        this.N = -1;
        this.P = false;
        Paint paint = new Paint();
        this.S = paint;
        this.T = org.telegram.messenger.i0.L(3.0f);
        this.U = new mg.c2(this, 16);
        this.V = 0.0f;
        this.a0 = 0;
        this.b0 = false;
        this.I = p6Var;
        this.H = k2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.E = new ji.a(frameLayout);
        this.K = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.z6, p6Var);
        z20.o(textView, 1, 13.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity(cd.X ? 5 : 3);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        Drawable f7 = i0.a.f(context, R.drawable.gradient_bottom);
        int i11 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.a7.y(this, f7, i11, p6Var, PorterDuff.Mode.SRC_ATOP);
        frameLayout2.setBackground(f7);
        addView(frameLayout2, w7.b6.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, w7.b6.e(-1, -1, 55));
        c cVar = new c(context);
        cVar.a = false;
        this.n = cVar;
        org.telegram.ui.ActionBar.a7.V(cVar, org.telegram.ui.ActionBar.t6.n6, p6Var);
        cVar.setTextSize(1, 16.0f);
        cVar.setLines(1);
        cVar.setMaxLines(1);
        cVar.setSingleLine(true);
        cVar.setText(cd.L0(2131751462, null));
        cVar.setOnClickListener(new a(this, i10));
        cVar.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.r = frameLayout3;
        Drawable f10 = i0.a.f(context, R.drawable.gradient_left);
        this.w = f10;
        org.telegram.ui.ActionBar.a7.y(this, f10, i11, p6Var, PorterDuff.Mode.MULTIPLY);
        frameLayout3.setBackground(f10);
        frameLayout3.setPadding(org.telegram.messenger.i0.L(4.0f) + frameLayout3.getPaddingLeft(), org.telegram.messenger.i0.L(1.0f), 0, org.telegram.messenger.i0.L(3.0f));
        frameLayout3.addView(cVar, w7.b6.c(-2.0f, -2));
        addView(frameLayout3, w7.b6.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / org.telegram.messenger.i0.p), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / org.telegram.messenger.i0.p), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i10, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, org.telegram.ui.ActionBar.t6.P1, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.t6.P1, Math.max(1, i10)).setBreakStrategy(0).setHyphenationFrequency(0);
        if (cd.X) {
            alignment = ov0.a();
        } else {
            Layout.Alignment[] alignmentArr = ov0.a;
            alignment = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignment).build();
    }

    private void setHeight(int i10) {
        s4.o0 o0Var = (s4.o0) getLayoutParams();
        if (o0Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            o0Var = new s4.o0(-1, i10);
        } else {
            r1 = ((ViewGroup.MarginLayoutParams) o0Var).height != i10;
            ((ViewGroup.MarginLayoutParams) o0Var).height = i10;
        }
        if (r1) {
            setLayoutParams(o0Var);
        }
    }

    private void setShowMoreMarginBottom(int i10) {
        FrameLayout frameLayout = this.r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i10) {
            layoutParams.bottomMargin = i10;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i10, boolean z10) {
        if (this.Q) {
            this.b0 = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.e;
        FrameLayout frameLayout = this.J;
        c cVar = this.n;
        if (spannableStringBuilder != null && (i10 != this.a0 || z10)) {
            StaticLayout c10 = c(i10, spannableStringBuilder);
            this.a = c10;
            this.b0 = c10.getLineCount() >= 4;
            int lineCount = this.a.getLineCount();
            FrameLayout frameLayout2 = this.r;
            if (lineCount >= 3 && this.b0) {
                int max = Math.max(this.a.getLineStart(2), this.a.getLineEnd(2));
                if (this.e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i11 = max - 1;
                this.P = (this.e.charAt(i11) == ' ' || this.e.charAt(i11) == '\n') ? false : true;
                this.L = c(i10, this.e.subSequence(0, max));
                this.M = new StaticLayout[this.a.getLineCount() - 3];
                this.O = new Point[this.a.getLineCount() - 3];
                float lineRight = this.L.getLineRight(this.L.getLineCount() - 1);
                boolean z11 = this.P;
                float f7 = this.T;
                float f10 = lineRight + (z11 ? f7 : 0.0f);
                this.N = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i12 = d0;
                    frameLayout2.measure(i12, i12);
                }
                for (int i13 = 3; i13 < this.a.getLineCount(); i13++) {
                    int lineStart = this.a.getLineStart(i13);
                    int lineEnd = this.a.getLineEnd(i13);
                    StaticLayout c11 = c(i10, this.e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i14 = i13 - 3;
                    this.M[i14] = c11;
                    this.O[i14] = new Point();
                    if (this.N == -1) {
                        if (f10 > frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                            this.N = i14;
                        }
                    }
                    f10 += c11.getLineRight(0) + f7;
                }
                if (f10 < frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                    this.b0 = false;
                }
            }
            if (!this.b0) {
                this.L = null;
                this.M = null;
            }
            this.a0 = i10;
            frameLayout.setMinimumHeight(g());
            if (this.b0 && this.L != null) {
                int min = Math.min(c0 + (this.h.getVisibility() == 0 ? org.telegram.messenger.i0.L(20.0f) : 0), g()) - org.telegram.messenger.i0.L(8.0f);
                StaticLayout staticLayout = this.L;
                setShowMoreMarginBottom((((min - staticLayout.getLineBottom(staticLayout.getLineCount() - 1)) - frameLayout2.getPaddingBottom()) - cVar.getPaddingBottom()) - (cVar.getLayout() == null ? 0 : cVar.getLayout().getHeight() - cVar.getLayout().getLineBottom(cVar.getLineCount() - 1)));
            }
        }
        cVar.setVisibility(this.b0 ? 0 : 8);
        if (!this.b0 && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.K);
        }
        if (!this.b0 || this.V >= 1.0f || frameLayout.getBackground() == null) {
            return;
        }
        frameLayout.setBackground(null);
    }

    public final q80 b(StaticLayout staticLayout, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i15);
            float f7 = i14;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f7);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft > f7 || lineLeft + staticLayout.getLineWidth(lineForVertical) < f7 || i15 < 0 || i15 > staticLayout.getHeight()) {
                return null;
            }
            Spannable spannable = (Spannable) staticLayout.getText();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length == 0 || org.telegram.messenger.i0.C1()) {
                return null;
            }
            q80 q80Var = new q80(clickableSpanArr[0], this.I, i12, i13, 0);
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ze, this.I);
            RectF rectF = ProfileActivity.R6;
            q80Var.d(w02);
            int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
            int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
            k80 b10 = q80Var.b();
            float f10 = i11;
            this.y = f10;
            b10.d(staticLayout, spanStart, f10);
            staticLayout.getSelectionPath(spanStart, spanEnd, b10);
            return q80Var;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return null;
        }
    }

    public final void d(ClickableSpan clickableSpan, Layout layout, float f7) {
        g gVar = this.F;
        g gVar2 = null;
        if (gVar != null) {
            gVar.a(false);
            this.F = null;
        }
        if (layout != null && clickableSpan != null) {
            gVar2 = new g(this, layout, clickableSpan, f7);
        }
        this.F = gVar2;
        if (!(clickableSpan instanceof e51)) {
            if (!(clickableSpan instanceof URLSpan)) {
                clickableSpan.onClick(this);
                return;
            }
            String url = ((URLSpan) clickableSpan).getURL();
            if (!org.telegram.messenger.i0.I3(url)) {
                gf.f.p(getContext(), Uri.parse(url), true, true, this.F);
                return;
            } else {
                org.telegram.ui.Components.s4.q0(this.H, url, true, true, true, false, this.F, null, null);
                return;
            }
        }
        String url2 = ((e51) clickableSpan).getURL();
        if (url2.startsWith("@") || url2.startsWith("#") || url2.startsWith("$") || url2.startsWith("/")) {
            g gVar3 = this.F;
            ProfileActivity profileActivity = ((sx0) this).e0.e;
            RectF rectF = ProfileActivity.R6;
            profileActivity.O4(url2, gVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f7;
        boolean z10;
        float f10;
        float alpha;
        float alpha2;
        float pow;
        int i10;
        float f11;
        int i11;
        StaticLayout staticLayout;
        super.draw(canvas);
        float pow2 = ((View) getParent()) == null ? 1.0f : (float) Math.pow(r0.getAlpha(), 2.0d);
        canvas.save();
        canvas.clipRect(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(8.0f), getWidth() - org.telegram.messenger.i0.L(18.0f), getHeight());
        int L = org.telegram.messenger.i0.L(18.0f);
        this.c = L;
        float f12 = 0.0f;
        canvas.translate(L, 0.0f);
        ji.a aVar = this.E;
        if (aVar != null && aVar.h(canvas)) {
            invalidate();
        }
        int L2 = org.telegram.messenger.i0.L(8.0f);
        this.d = L2;
        canvas.translate(0.0f, L2);
        try {
            TextPaint textPaint = org.telegram.ui.ActionBar.t6.P1;
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uc, this.I);
            RectF rectF = ProfileActivity.R6;
            textPaint.linkColor = w02;
            StaticLayout staticLayout2 = this.L;
            try {
                if (staticLayout2 == null || !this.b0) {
                    f7 = 0.0f;
                    f10 = 255.0f;
                    StaticLayout staticLayout3 = this.a;
                    if (staticLayout3 != null) {
                        staticLayout3.draw(canvas);
                    }
                } else {
                    staticLayout2.draw(canvas);
                    int lineCount = this.L.getLineCount() - 1;
                    float lineTop = this.L.getLineTop(lineCount) + this.L.getTopPadding();
                    float lineRight = this.L.getLineRight(lineCount);
                    boolean z11 = this.P;
                    float f13 = this.T;
                    float f14 = lineRight + (z11 ? f13 : 0.0f);
                    float lineBottom = (this.L.getLineBottom(lineCount) - this.L.getLineTop(lineCount)) - this.L.getBottomPadding();
                    float pow3 = 1.0f - ((float) Math.pow(this.V, 0.25d));
                    if (pow3 < 0.5d) {
                        pow = c3.i0.E(pow3, 4.0f, pow3, pow3);
                        z10 = true;
                        f10 = 255.0f;
                    } else {
                        z10 = true;
                        f10 = 255.0f;
                        try {
                            pow = 1.0f - (((float) Math.pow((pow3 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                        } catch (Exception e) {
                            e = e;
                            f7 = f12;
                            org.telegram.messenger.f8.g(e, z10);
                            canvas.restore();
                            FrameLayout frameLayout = this.r;
                            alpha = frameLayout.getAlpha();
                            if (alpha > f7) {
                            }
                            FrameLayout frameLayout2 = this.s;
                            alpha2 = frameLayout2.getAlpha();
                            if (alpha2 > f7) {
                            }
                            this.J.draw(canvas);
                        }
                    }
                    float f15 = pow;
                    if (this.M != null) {
                        float f16 = f14;
                        int i12 = 0;
                        while (true) {
                            StaticLayout[] staticLayoutArr = this.M;
                            if (i12 >= staticLayoutArr.length) {
                                break;
                            }
                            StaticLayout staticLayout4 = staticLayoutArr[i12];
                            if (staticLayout4 != null) {
                                int save = canvas.save();
                                Point point = this.O[i12];
                                if (point != null) {
                                    point.set((int) ((f16 * f15) + this.c), (int) c3.i0.z(1.0f, f15, lineBottom, this.d + lineTop));
                                }
                                int i13 = this.N;
                                if (i13 == -1 || i13 > i12) {
                                    i10 = i12;
                                    i11 = save;
                                    f11 = f12;
                                    staticLayout = staticLayout4;
                                    canvas.translate(f16 * f15, c3.i0.z(1.0f, f15, lineBottom, lineTop));
                                } else {
                                    canvas.translate(f12, lineTop + lineBottom);
                                    i10 = i12;
                                    i11 = save;
                                    f11 = f12;
                                    staticLayout = staticLayout4;
                                    canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout4.getWidth(), staticLayout4.getHeight(), (int) (this.V * f10), 31);
                                }
                                staticLayout.draw(canvas);
                                canvas.restoreToCount(i11);
                                lineBottom += (staticLayout.getLineBottom(0) + staticLayout.getTopPadding()) - 1;
                                f16 = staticLayout.getLineRight(0) + f13 + f16;
                            } else {
                                i10 = i12;
                                f11 = f12;
                            }
                            i12 = i10 + 1;
                            f12 = f11;
                        }
                    }
                    f7 = f12;
                }
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Exception e10) {
            e = e10;
            f7 = 0.0f;
            z10 = true;
            f10 = 255.0f;
        }
        canvas.restore();
        FrameLayout frameLayout3 = this.r;
        alpha = frameLayout3.getAlpha();
        if (alpha > f7) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * f10), 31);
            this.w.setAlpha((int) (pow2 * f10));
            canvas.translate(frameLayout3.getLeft(), frameLayout3.getTop());
            frameLayout3.draw(canvas);
            canvas.restore();
        }
        FrameLayout frameLayout22 = this.s;
        alpha2 = frameLayout22.getAlpha();
        if (alpha2 > f7) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha2 * f10), 31);
            canvas.translate(frameLayout22.getLeft(), frameLayout22.getTop());
            frameLayout22.draw(canvas);
            canvas.restore();
        }
        this.J.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        this.E.f(true);
        this.x = null;
        org.telegram.messenger.i0.r(this.U);
        invalidate();
    }

    public final void f(String str, String str2, boolean z10) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, this.b)) {
            return;
        }
        try {
            str3 = org.telegram.messenger.i0.U.matcher(str).replaceAll("\u200c");
        } catch (Throwable unused) {
            str3 = str;
        }
        try {
            this.b = str3;
        } catch (Throwable unused2) {
            this.b = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
        this.e = spannableStringBuilder;
        this.f = null;
        jj.e(false, spannableStringBuilder, false, false, !z10);
        org.telegram.messenger.k6.l(this.e, org.telegram.ui.ActionBar.t6.P1.getFontMetricsInt(), false);
        if (this.a0 <= 0) {
            this.a0 = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(36.0f);
        }
        a(this.a0, true);
        i();
        TextView textView = this.h;
        int visibility = textView.getVisibility();
        if (TextUtils.isEmpty(str2)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str2);
            textView.setVisibility(0);
        }
        if (visibility != textView.getVisibility()) {
            a(this.a0, true);
        }
        requestLayout();
    }

    public final int g() {
        StaticLayout staticLayout = this.a;
        int L = org.telegram.messenger.i0.L(16.0f) + (staticLayout != null ? staticLayout.getHeight() : org.telegram.messenger.i0.L(20.0f));
        return this.h.getVisibility() == 0 ? org.telegram.messenger.i0.L(23.0f) + L : L;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W = null;
        }
        float f7 = this.V;
        float g10 = g();
        float min = Math.min(c0, g10);
        Math.abs(org.telegram.messenger.i0.T1(min, g10, 1.0f) - org.telegram.messenger.i0.T1(min, g10, f7));
        this.W = ValueAnimator.ofFloat(0.0f, 1.0f);
        float abs = Math.abs(f7 - 1.0f) * 1250.0f * 2.0f;
        o1.e eVar = new o1.e();
        eVar.a = 0.0f;
        eVar.b = 0.0f;
        this.W.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f7)), f7, 1.0f, eVar));
        this.W.addListener(new org.telegram.ui.s9(this, 1));
        this.W.setDuration((long) abs);
        this.W.start();
    }

    public final int i() {
        int g10 = g();
        float min = Math.min(c0 + (this.h.getVisibility() == 0 ? org.telegram.messenger.i0.L(20.0f) : 0), g());
        if (this.b0) {
            g10 = (int) org.telegram.messenger.i0.T1(min, g10, this.V);
        }
        setHeight(g10);
        return g10;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f;
            int i10 = 0;
            if (spannableStringBuilder == null) {
                SpannableStringBuilder spannableStringBuilder2 = this.e;
                if (spannableStringBuilder2 == null) {
                    spannableStringBuilder = null;
                } else {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class);
                    if (clickableSpanArr == null || clickableSpanArr.length == 0) {
                        spannableStringBuilder = this.e;
                        this.f = spannableStringBuilder;
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.e);
                        for (ClickableSpan clickableSpan : clickableSpanArr) {
                            int spanStart = spannableStringBuilder3.getSpanStart(clickableSpan);
                            int spanEnd = spannableStringBuilder3.getSpanEnd(clickableSpan);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                spannableStringBuilder3.removeSpan(clickableSpan);
                                spannableStringBuilder3.setSpan(new h(i10, this, clickableSpan), spanStart, spanEnd, 33);
                            }
                        }
                        this.f = spannableStringBuilder3;
                        spannableStringBuilder = spannableStringBuilder3;
                    }
                }
            }
            CharSequence text = this.h.getText();
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(spannableStringBuilder);
            } else {
                accessibilityNodeInfo.setText(TextUtils.concat(text, ": ", spannableStringBuilder));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        a(View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(36.0f), false);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i(), TLObject.FLAG_30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d9, code lost:
    
        if (r0 != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i iVar;
        q80 b10;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        c cVar = this.n;
        if (cVar.getVisibility() == 0) {
            FrameLayout frameLayout = this.r;
            if (x10 >= frameLayout.getLeft() && x10 <= frameLayout.getRight() && y3 >= frameLayout.getTop() && y3 <= frameLayout.getBottom()) {
                return false;
            }
        }
        if (this.a != null || this.M != null) {
            if (motionEvent.getAction() == 0 || (this.x != null && motionEvent.getAction() == 1)) {
                if (motionEvent.getAction() == 0) {
                    e();
                    if ((x10 < cVar.getLeft() || x10 > cVar.getRight() || y3 < cVar.getTop() || y3 > cVar.getBottom()) && (getMeasuredWidth() <= 0 || x10 <= getMeasuredWidth() - org.telegram.messenger.i0.L(18.0f))) {
                        StaticLayout staticLayout = this.L;
                        if (staticLayout == null || this.V >= 1.0f || !this.b0) {
                            iVar = this;
                        } else {
                            iVar = this;
                            b10 = iVar.b(staticLayout, this.c, this.d, x10, y3);
                            if (b10 == null) {
                                if (iVar.M != null) {
                                    int i10 = 0;
                                    while (true) {
                                        StaticLayout[] staticLayoutArr = iVar.M;
                                        if (i10 >= staticLayoutArr.length) {
                                            break;
                                        }
                                        StaticLayout staticLayout2 = staticLayoutArr[i10];
                                        Point point = iVar.O[i10];
                                        q80 b11 = iVar.b(staticLayout2, point.x, point.y, x10, y3);
                                        if (b11 != null) {
                                            b10 = b11;
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                            }
                            if (b10 != null) {
                                iVar.D = iVar.a;
                                iVar.x = b10;
                                iVar.E.b(b10, null);
                                org.telegram.messenger.i0.h3(iVar.U, ViewConfiguration.getLongPressTimeout());
                                return true;
                            }
                            if (!super.onTouchEvent(motionEvent)) {
                                return true;
                            }
                        }
                        b10 = iVar.b(iVar.a, iVar.c, iVar.d, x10, y3);
                    } else {
                        iVar = this;
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                } else {
                    q80 q80Var = this.x;
                    if (q80Var != null) {
                        try {
                            d((ClickableSpan) q80Var.i, this.a, this.y);
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        e();
                        return true;
                    }
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                }
                return false;
            }
            if (motionEvent.getAction() == 3) {
                e();
            }
        }
        if (!super.onTouchEvent(motionEvent)) {
            return false;
        }
    }

    public void setMoreButtonDisabled(boolean z10) {
        this.Q = z10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        TextPaint textPaint = org.telegram.ui.ActionBar.t6.P1;
        int i10 = org.telegram.ui.ActionBar.t6.Uc;
        org.telegram.ui.ActionBar.p6 p6Var = this.I;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        RectF rectF = ProfileActivity.R6;
        textPaint.linkColor = w02;
        try {
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var);
            y yVar = this.K;
            if (yVar != null && w03 != this.R) {
                this.R = w03;
                org.telegram.ui.ActionBar.t6.H1(yVar, w03, true);
            }
            this.S.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
