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
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.y70;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gw0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class j extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int c0 = org.telegram.messenger.g0.L(76.0f);
    public static final int d0 = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
    public StaticLayout D;
    public final n2.n0 E;
    public g F;
    public b80 G;
    public final org.telegram.ui.ActionBar.f2 H;
    public final org.telegram.ui.ActionBar.g6 I;
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
    public final m.f3 U;
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
    public y70 x;
    public float y;

    public j(Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        new Point();
        int i7 = 0;
        new s70(0);
        this.M = null;
        this.N = -1;
        this.P = false;
        Paint paint = new Paint();
        this.S = paint;
        this.T = org.telegram.messenger.g0.L(3.0f);
        this.U = new m.f3(this, 18);
        this.V = 0.0f;
        this.a0 = 0;
        this.b0 = false;
        this.I = g6Var;
        this.H = f2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.E = new n2.n0(frameLayout);
        this.K = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.i6, g6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.z6, g6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 13.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity(id.a0 ? 5 : 3);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, (id.a0 ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        Drawable h = jg.g.h(context, R.drawable.gradient_bottom);
        int i10 = org.telegram.ui.ActionBar.l6.d6;
        org.telegram.ui.ActionBar.s6.x(this, h, i10, g6Var, PorterDuff.Mode.SRC_ATOP);
        frameLayout2.setBackground(h);
        addView(frameLayout2, c8.ha.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, c8.ha.e(-1, -1, 55));
        c cVar = new c(context);
        cVar.a = false;
        this.n = cVar;
        org.telegram.ui.ActionBar.s6.U(cVar, org.telegram.ui.ActionBar.l6.n6, g6Var);
        cVar.setTextSize(1, 16.0f);
        cVar.setLines(1);
        cVar.setMaxLines(1);
        cVar.setSingleLine(true);
        cVar.setText(id.M0(2131751461, null));
        cVar.setOnClickListener(new a(this, i7));
        cVar.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.r = frameLayout3;
        Drawable h7 = jg.g.h(context, R.drawable.gradient_left);
        this.w = h7;
        org.telegram.ui.ActionBar.s6.x(this, h7, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        frameLayout3.setBackground(h7);
        frameLayout3.setPadding(org.telegram.messenger.g0.L(4.0f) + frameLayout3.getPaddingLeft(), org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(3.0f));
        frameLayout3.addView(cVar, c8.ha.c(-2.0f, -2));
        addView(frameLayout3, c8.ha.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / org.telegram.messenger.g0.p), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / org.telegram.messenger.g0.p), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i7, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, org.telegram.ui.ActionBar.l6.P1, i7, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.l6.P1, Math.max(1, i7)).setBreakStrategy(0).setHyphenationFrequency(0);
        if (id.a0) {
            alignment = ou0.a();
        } else {
            Layout.Alignment[] alignmentArr = ou0.a;
            alignment = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignment).build();
    }

    private void setHeight(int i7) {
        v4.o0 o0Var = (v4.o0) getLayoutParams();
        if (o0Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            o0Var = new v4.o0(-1, i7);
        } else {
            r1 = ((ViewGroup.MarginLayoutParams) o0Var).height != i7;
            ((ViewGroup.MarginLayoutParams) o0Var).height = i7;
        }
        if (r1) {
            setLayoutParams(o0Var);
        }
    }

    private void setShowMoreMarginBottom(int i7) {
        FrameLayout frameLayout = this.r;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams.bottomMargin != i7) {
            layoutParams.bottomMargin = i7;
            frameLayout.setLayoutParams(layoutParams);
        }
    }

    public final void a(int i7, boolean z9) {
        if (this.Q) {
            this.b0 = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.e;
        FrameLayout frameLayout = this.J;
        c cVar = this.n;
        if (spannableStringBuilder != null && (i7 != this.a0 || z9)) {
            StaticLayout c10 = c(i7, spannableStringBuilder);
            this.a = c10;
            this.b0 = c10.getLineCount() >= 4;
            int lineCount = this.a.getLineCount();
            FrameLayout frameLayout2 = this.r;
            if (lineCount >= 3 && this.b0) {
                int max = Math.max(this.a.getLineStart(2), this.a.getLineEnd(2));
                if (this.e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i10 = max - 1;
                this.P = (this.e.charAt(i10) == ' ' || this.e.charAt(i10) == '\n') ? false : true;
                this.L = c(i7, this.e.subSequence(0, max));
                this.M = new StaticLayout[this.a.getLineCount() - 3];
                this.O = new Point[this.a.getLineCount() - 3];
                float lineRight = this.L.getLineRight(this.L.getLineCount() - 1);
                boolean z10 = this.P;
                float f10 = this.T;
                float f11 = lineRight + (z10 ? f10 : 0.0f);
                this.N = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i11 = d0;
                    frameLayout2.measure(i11, i11);
                }
                for (int i12 = 3; i12 < this.a.getLineCount(); i12++) {
                    int lineStart = this.a.getLineStart(i12);
                    int lineEnd = this.a.getLineEnd(i12);
                    StaticLayout c11 = c(i7, this.e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i13 = i12 - 3;
                    this.M[i13] = c11;
                    this.O[i13] = new Point();
                    if (this.N == -1) {
                        if (f11 > frameLayout2.getPaddingLeft() + (i7 - frameLayout2.getMeasuredWidth())) {
                            this.N = i13;
                        }
                    }
                    f11 += c11.getLineRight(0) + f10;
                }
                if (f11 < frameLayout2.getPaddingLeft() + (i7 - frameLayout2.getMeasuredWidth())) {
                    this.b0 = false;
                }
            }
            if (!this.b0) {
                this.L = null;
                this.M = null;
            }
            this.a0 = i7;
            frameLayout.setMinimumHeight(g());
            if (this.b0 && this.L != null) {
                int min = Math.min(c0 + (this.h.getVisibility() == 0 ? org.telegram.messenger.g0.L(20.0f) : 0), g()) - org.telegram.messenger.g0.L(8.0f);
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

    public final y70 b(StaticLayout staticLayout, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i14);
            float f10 = i13;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f10);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft > f10 || lineLeft + staticLayout.getLineWidth(lineForVertical) < f10 || i14 < 0 || i14 > staticLayout.getHeight()) {
                return null;
            }
            Spannable spannable = (Spannable) staticLayout.getText();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length == 0 || org.telegram.messenger.g0.C1()) {
                return null;
            }
            y70 y70Var = new y70(clickableSpanArr[0], this.I, i11, i12, 0);
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.ze, this.I);
            RectF rectF = ProfileActivity.V6;
            y70Var.d(w02);
            int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
            int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
            s70 b10 = y70Var.b();
            float f11 = i10;
            this.y = f11;
            b10.d(staticLayout, spanStart, f11);
            staticLayout.getSelectionPath(spanStart, spanEnd, b10);
            return y70Var;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    public final void d(ClickableSpan clickableSpan, Layout layout, float f10) {
        g gVar = this.F;
        g gVar2 = null;
        if (gVar != null) {
            gVar.a(false);
            this.F = null;
        }
        if (layout != null && clickableSpan != null) {
            gVar2 = new g(this, layout, clickableSpan, f10);
        }
        this.F = gVar2;
        if (!(clickableSpan instanceof c41)) {
            if (!(clickableSpan instanceof URLSpan)) {
                clickableSpan.onClick(this);
                return;
            }
            String url = ((URLSpan) clickableSpan).getURL();
            if (!org.telegram.messenger.g0.J3(url)) {
                vf.c.r(getContext(), Uri.parse(url), true, true, this.F);
                return;
            } else {
                org.telegram.ui.Components.v4.o0(this.H, url, true, true, true, false, this.F, null, null);
                return;
            }
        }
        String url2 = ((c41) clickableSpan).getURL();
        if (url2.startsWith("@") || url2.startsWith("#") || url2.startsWith("$") || url2.startsWith("/")) {
            g gVar3 = this.F;
            ProfileActivity profileActivity = ((gw0) this).e0.e;
            RectF rectF = ProfileActivity.V6;
            profileActivity.S4(url2, gVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f10;
        boolean z9;
        float f11;
        float alpha;
        float alpha2;
        float pow;
        int i7;
        float f12;
        int i10;
        StaticLayout staticLayout;
        super.draw(canvas);
        float pow2 = ((View) getParent()) == null ? 1.0f : (float) Math.pow(r0.getAlpha(), 2.0d);
        canvas.save();
        canvas.clipRect(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(8.0f), getWidth() - org.telegram.messenger.g0.L(18.0f), getHeight());
        int L = org.telegram.messenger.g0.L(18.0f);
        this.c = L;
        float f13 = 0.0f;
        canvas.translate(L, 0.0f);
        n2.n0 n0Var = this.E;
        if (n0Var != null && n0Var.h(canvas)) {
            invalidate();
        }
        int L2 = org.telegram.messenger.g0.L(8.0f);
        this.d = L2;
        canvas.translate(0.0f, L2);
        try {
            TextPaint textPaint = org.telegram.ui.ActionBar.l6.P1;
            int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Uc, this.I);
            RectF rectF = ProfileActivity.V6;
            textPaint.linkColor = w02;
            StaticLayout staticLayout2 = this.L;
            try {
                if (staticLayout2 == null || !this.b0) {
                    f10 = 0.0f;
                    f11 = 255.0f;
                    StaticLayout staticLayout3 = this.a;
                    if (staticLayout3 != null) {
                        staticLayout3.draw(canvas);
                    }
                } else {
                    staticLayout2.draw(canvas);
                    int lineCount = this.L.getLineCount() - 1;
                    float lineTop = this.L.getLineTop(lineCount) + this.L.getTopPadding();
                    float lineRight = this.L.getLineRight(lineCount);
                    boolean z10 = this.P;
                    float f14 = this.T;
                    float f15 = lineRight + (z10 ? f14 : 0.0f);
                    float lineBottom = (this.L.getLineBottom(lineCount) - this.L.getLineTop(lineCount)) - this.L.getBottomPadding();
                    float pow3 = 1.0f - ((float) Math.pow(this.V, 0.25d));
                    if (pow3 < 0.5d) {
                        pow = com.google.android.recaptcha.internal.a.D(pow3, 4.0f, pow3, pow3);
                        z9 = true;
                        f11 = 255.0f;
                    } else {
                        z9 = true;
                        f11 = 255.0f;
                        try {
                            pow = 1.0f - (((float) Math.pow((pow3 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                        } catch (Exception e10) {
                            e = e10;
                            f10 = f13;
                            org.telegram.messenger.a8.g(e, z9);
                            canvas.restore();
                            FrameLayout frameLayout = this.r;
                            alpha = frameLayout.getAlpha();
                            if (alpha > f10) {
                            }
                            FrameLayout frameLayout2 = this.s;
                            alpha2 = frameLayout2.getAlpha();
                            if (alpha2 > f10) {
                            }
                            this.J.draw(canvas);
                        }
                    }
                    float f16 = pow;
                    if (this.M != null) {
                        float f17 = f15;
                        int i11 = 0;
                        while (true) {
                            StaticLayout[] staticLayoutArr = this.M;
                            if (i11 >= staticLayoutArr.length) {
                                break;
                            }
                            StaticLayout staticLayout4 = staticLayoutArr[i11];
                            if (staticLayout4 != null) {
                                int save = canvas.save();
                                Point point = this.O[i11];
                                if (point != null) {
                                    point.set((int) ((f17 * f16) + this.c), (int) com.google.android.recaptcha.internal.a.z(1.0f, f16, lineBottom, this.d + lineTop));
                                }
                                int i12 = this.N;
                                if (i12 == -1 || i12 > i11) {
                                    i7 = i11;
                                    i10 = save;
                                    f12 = f13;
                                    staticLayout = staticLayout4;
                                    canvas.translate(f17 * f16, com.google.android.recaptcha.internal.a.z(1.0f, f16, lineBottom, lineTop));
                                } else {
                                    canvas.translate(f13, lineTop + lineBottom);
                                    i7 = i11;
                                    i10 = save;
                                    f12 = f13;
                                    staticLayout = staticLayout4;
                                    canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout4.getWidth(), staticLayout4.getHeight(), (int) (this.V * f11), 31);
                                }
                                staticLayout.draw(canvas);
                                canvas.restoreToCount(i10);
                                lineBottom += (staticLayout.getLineBottom(0) + staticLayout.getTopPadding()) - 1;
                                f17 = staticLayout.getLineRight(0) + f14 + f17;
                            } else {
                                i7 = i11;
                                f12 = f13;
                            }
                            i11 = i7 + 1;
                            f13 = f12;
                        }
                    }
                    f10 = f13;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            f10 = 0.0f;
            z9 = true;
            f11 = 255.0f;
        }
        canvas.restore();
        FrameLayout frameLayout3 = this.r;
        alpha = frameLayout3.getAlpha();
        if (alpha > f10) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * f11), 31);
            this.w.setAlpha((int) (pow2 * f11));
            canvas.translate(frameLayout3.getLeft(), frameLayout3.getTop());
            frameLayout3.draw(canvas);
            canvas.restore();
        }
        FrameLayout frameLayout22 = this.s;
        alpha2 = frameLayout22.getAlpha();
        if (alpha2 > f10) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha2 * f11), 31);
            canvas.translate(frameLayout22.getLeft(), frameLayout22.getTop());
            frameLayout22.draw(canvas);
            canvas.restore();
        }
        this.J.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return false;
    }

    public final void e() {
        this.E.f(true);
        this.x = null;
        org.telegram.messenger.g0.r(this.U);
        invalidate();
    }

    public final void f(String str, String str2, boolean z9) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, this.b)) {
            return;
        }
        try {
            str3 = org.telegram.messenger.g0.U.matcher(str).replaceAll("\u200c");
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
        ij.e(false, spannableStringBuilder, false, false, !z9);
        org.telegram.messenger.i6.l(this.e, org.telegram.ui.ActionBar.l6.P1.getFontMetricsInt(), false);
        if (this.a0 <= 0) {
            this.a0 = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(36.0f);
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
        int L = org.telegram.messenger.g0.L(16.0f) + (staticLayout != null ? staticLayout.getHeight() : org.telegram.messenger.g0.L(20.0f));
        return this.h.getVisibility() == 0 ? org.telegram.messenger.g0.L(23.0f) + L : L;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W = null;
        }
        float f10 = this.V;
        float g10 = g();
        float min = Math.min(c0, g10);
        Math.abs(org.telegram.messenger.g0.T1(min, g10, 1.0f) - org.telegram.messenger.g0.T1(min, g10, f10));
        this.W = ValueAnimator.ofFloat(0.0f, 1.0f);
        float abs = Math.abs(f10 - 1.0f) * 1250.0f * 2.0f;
        i iVar = new i();
        iVar.a = 0.0f;
        iVar.b = 0.0f;
        this.W.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f10)), f10, 1.0f, iVar));
        this.W.addListener(new m.a(this, 20));
        this.W.setDuration((long) abs);
        this.W.start();
    }

    public final int i() {
        int g10 = g();
        float min = Math.min(c0 + (this.h.getVisibility() == 0 ? org.telegram.messenger.g0.L(20.0f) : 0), g());
        if (this.b0) {
            g10 = (int) org.telegram.messenger.g0.T1(min, g10, this.V);
        }
        setHeight(g10);
        return g10;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.a != null) {
            SpannableStringBuilder spannableStringBuilder = this.f;
            int i7 = 0;
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
                                spannableStringBuilder3.setSpan(new h(i7, this, clickableSpan), spanStart, spanEnd, 33);
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
    public final void onMeasure(int i7, int i10) {
        a(View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f), false);
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i(), TLObject.FLAG_30));
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
        j jVar;
        y70 b10;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        c cVar = this.n;
        if (cVar.getVisibility() == 0) {
            FrameLayout frameLayout = this.r;
            if (x10 >= frameLayout.getLeft() && x10 <= frameLayout.getRight() && y10 >= frameLayout.getTop() && y10 <= frameLayout.getBottom()) {
                return false;
            }
        }
        if (this.a != null || this.M != null) {
            if (motionEvent.getAction() == 0 || (this.x != null && motionEvent.getAction() == 1)) {
                if (motionEvent.getAction() == 0) {
                    e();
                    if ((x10 < cVar.getLeft() || x10 > cVar.getRight() || y10 < cVar.getTop() || y10 > cVar.getBottom()) && (getMeasuredWidth() <= 0 || x10 <= getMeasuredWidth() - org.telegram.messenger.g0.L(18.0f))) {
                        StaticLayout staticLayout = this.L;
                        if (staticLayout == null || this.V >= 1.0f || !this.b0) {
                            jVar = this;
                        } else {
                            jVar = this;
                            b10 = jVar.b(staticLayout, this.c, this.d, x10, y10);
                            if (b10 == null) {
                                if (jVar.M != null) {
                                    int i7 = 0;
                                    while (true) {
                                        StaticLayout[] staticLayoutArr = jVar.M;
                                        if (i7 >= staticLayoutArr.length) {
                                            break;
                                        }
                                        StaticLayout staticLayout2 = staticLayoutArr[i7];
                                        Point point = jVar.O[i7];
                                        y70 b11 = jVar.b(staticLayout2, point.x, point.y, x10, y10);
                                        if (b11 != null) {
                                            b10 = b11;
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                            }
                            if (b10 != null) {
                                jVar.D = jVar.a;
                                jVar.x = b10;
                                jVar.E.b(b10, null);
                                org.telegram.messenger.g0.i3(jVar.U, ViewConfiguration.getLongPressTimeout());
                                return true;
                            }
                            if (!super.onTouchEvent(motionEvent)) {
                                return true;
                            }
                        }
                        b10 = jVar.b(jVar.a, jVar.c, jVar.d, x10, y10);
                    } else {
                        jVar = this;
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                } else {
                    y70 y70Var = this.x;
                    if (y70Var != null) {
                        try {
                            d((ClickableSpan) y70Var.i, this.a, this.y);
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
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

    public void setMoreButtonDisabled(boolean z9) {
        this.Q = z9;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        TextPaint textPaint = org.telegram.ui.ActionBar.l6.P1;
        int i7 = org.telegram.ui.ActionBar.l6.Uc;
        org.telegram.ui.ActionBar.g6 g6Var = this.I;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        RectF rectF = ProfileActivity.V6;
        textPaint.linkColor = w02;
        try {
            int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.i6, g6Var);
            y yVar = this.K;
            if (yVar != null && w03 != this.R) {
                this.R = w03;
                org.telegram.ui.ActionBar.l6.H1(yVar, w03, true);
            }
            this.S.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.d6, g6Var));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
