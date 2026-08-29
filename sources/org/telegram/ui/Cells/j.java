package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
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
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.z80;
import org.telegram.ui.qz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class j extends FrameLayout {
    public static final int T = AndroidUtilities.dp(76.0f);
    public static final int U = View.MeasureSpec.makeMeasureSpec(999999, TLObject.FLAG_31);
    public final v80 A;
    public h B;
    public c90 C;
    public final org.telegram.ui.ActionBar.o2 D;
    public final org.telegram.ui.ActionBar.c6 E;
    public final FrameLayout F;
    public final z G;
    public StaticLayout H;
    public StaticLayout[] I;
    public int J;
    public Point[] K;
    public boolean L;
    public boolean M;
    public final float N;
    public final f O;
    public float P;
    public ValueAnimator Q;
    public int R;
    public boolean S;
    public StaticLayout a;
    public String b;
    public int c;
    public int d;
    public SpannableStringBuilder e;
    public SpannableStringBuilder f;
    public final TextView h;
    public final c n;
    public final FrameLayout r;
    public final FrameLayout s;
    public final Drawable v;
    public z80 w;
    public float x;
    public StaticLayout y;

    public j(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        new Point();
        new s80(0);
        this.I = null;
        this.J = -1;
        this.L = false;
        Paint paint = new Paint();
        this.N = AndroidUtilities.dp(3.0f);
        this.O = new f(this);
        this.P = 0.0f;
        this.R = 0;
        this.S = false;
        this.E = c6Var;
        this.D = o2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.setImportantForAccessibility(2);
        this.A = new v80(frameLayout);
        this.G = org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 0, 0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setVisibility(8);
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.z6, c6Var, textView, 1, 13.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setImportantForAccessibility(2);
        textView.setFocusable(false);
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 18.0f, 0.0f, 18.0f, 10.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        Drawable mutate = context.getResources().getDrawable(R.drawable.gradient_bottom).mutate();
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_ATOP));
        frameLayout2.setBackground(mutate);
        addView(frameLayout2, i7.f6.d(-1, 12.0f, 87, 16.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, i7.f6.e(-1, -1, 55));
        c cVar = new c(context);
        cVar.a = false;
        this.n = cVar;
        cVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.n6, c6Var));
        cVar.setTextSize(1, 16.0f);
        cVar.setLines(1);
        cVar.setMaxLines(1);
        cVar.setSingleLine(true);
        cVar.setText(LocaleController.getString(R.string.DescriptionMore));
        cVar.setOnClickListener(new a(this, 0));
        cVar.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.r = frameLayout3;
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.gradient_left).mutate();
        this.v = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        frameLayout3.setBackground(mutate2);
        frameLayout3.setPadding(AndroidUtilities.dp(4.0f) + frameLayout3.getPaddingLeft(), AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout3.addView(cVar, i7.f6.c(-2.0f, -2));
        addView(frameLayout3, i7.f6.d(-2, -2.0f, 85, 18.0f - (frameLayout3.getPaddingLeft() / AndroidUtilities.density), 0.0f, 18.0f - (frameLayout3.getPaddingRight() / AndroidUtilities.density), 6.0f));
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        setWillNotDraw(false);
    }

    public static StaticLayout c(int i10, CharSequence charSequence) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT < 24) {
            return new StaticLayout(charSequence, org.telegram.ui.ActionBar.g6.P1, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), org.telegram.ui.ActionBar.g6.P1, Math.max(1, i10)).setBreakStrategy(0).setHyphenationFrequency(0);
        if (LocaleController.isRTL) {
            alignment = bw0.a();
        } else {
            Layout.Alignment[] alignmentArr = bw0.a;
            alignment = alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL;
        }
        return hyphenationFrequency.setAlignment(alignment).build();
    }

    private void setHeight(int i10) {
        f2.x0 x0Var = (f2.x0) getLayoutParams();
        if (x0Var == null) {
            if (getMinimumHeight() == 0) {
                getHeight();
            } else {
                getMinimumHeight();
            }
            x0Var = new f2.x0(-1, i10);
        } else {
            r1 = ((ViewGroup.MarginLayoutParams) x0Var).height != i10;
            ((ViewGroup.MarginLayoutParams) x0Var).height = i10;
        }
        if (r1) {
            setLayoutParams(x0Var);
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
        if (this.M) {
            this.S = false;
        }
        SpannableStringBuilder spannableStringBuilder = this.e;
        FrameLayout frameLayout = this.F;
        c cVar = this.n;
        if (spannableStringBuilder != null && (i10 != this.R || z10)) {
            StaticLayout c3 = c(i10, spannableStringBuilder);
            this.a = c3;
            this.S = c3.getLineCount() >= 4;
            int lineCount = this.a.getLineCount();
            FrameLayout frameLayout2 = this.r;
            if (lineCount >= 3 && this.S) {
                int max = Math.max(this.a.getLineStart(2), this.a.getLineEnd(2));
                if (this.e.charAt(max - 1) == '\n') {
                    max--;
                }
                int i11 = max - 1;
                this.L = (this.e.charAt(i11) == ' ' || this.e.charAt(i11) == '\n') ? false : true;
                this.H = c(i10, this.e.subSequence(0, max));
                this.I = new StaticLayout[this.a.getLineCount() - 3];
                this.K = new Point[this.a.getLineCount() - 3];
                float lineRight = this.H.getLineRight(this.H.getLineCount() - 1);
                boolean z11 = this.L;
                float f9 = this.N;
                float f10 = lineRight + (z11 ? f9 : 0.0f);
                this.J = -1;
                if (frameLayout2.getMeasuredWidth() <= 0) {
                    int i12 = U;
                    frameLayout2.measure(i12, i12);
                }
                for (int i13 = 3; i13 < this.a.getLineCount(); i13++) {
                    int lineStart = this.a.getLineStart(i13);
                    int lineEnd = this.a.getLineEnd(i13);
                    StaticLayout c6 = c(i10, this.e.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd)));
                    int i14 = i13 - 3;
                    this.I[i14] = c6;
                    this.K[i14] = new Point();
                    if (this.J == -1) {
                        if (f10 > frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                            this.J = i14;
                        }
                    }
                    f10 += c6.getLineRight(0) + f9;
                }
                if (f10 < frameLayout2.getPaddingLeft() + (i10 - frameLayout2.getMeasuredWidth())) {
                    this.S = false;
                }
            }
            if (!this.S) {
                this.H = null;
                this.I = null;
            }
            this.R = i10;
            frameLayout.setMinimumHeight(g());
            if (this.S && this.H != null) {
                int min = Math.min(T + (this.h.getVisibility() == 0 ? AndroidUtilities.dp(20.0f) : 0), g()) - AndroidUtilities.dp(8.0f);
                StaticLayout staticLayout = this.H;
                setShowMoreMarginBottom((((min - staticLayout.getLineBottom(staticLayout.getLineCount() - 1)) - frameLayout2.getPaddingBottom()) - cVar.getPaddingBottom()) - (cVar.getLayout() == null ? 0 : cVar.getLayout().getHeight() - cVar.getLayout().getLineBottom(cVar.getLineCount() - 1)));
            }
        }
        cVar.setVisibility(this.S ? 0 : 8);
        if (!this.S && frameLayout.getBackground() == null) {
            frameLayout.setBackground(this.G);
        }
        if (!this.S || this.P >= 1.0f || frameLayout.getBackground() == null) {
            return;
        }
        frameLayout.setBackground(null);
    }

    public final z80 b(StaticLayout staticLayout, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        try {
            int lineForVertical = staticLayout.getLineForVertical(i15);
            float f9 = i14;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(lineForVertical, f9);
            float lineLeft = staticLayout.getLineLeft(lineForVertical);
            if (lineLeft > f9 || lineLeft + staticLayout.getLineWidth(lineForVertical) < f9 || i15 < 0 || i15 > staticLayout.getHeight()) {
                return null;
            }
            Spannable spannable = (Spannable) staticLayout.getText();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length == 0 || AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return null;
            }
            z80 z80Var = new z80(clickableSpanArr[0], this.E, i12, i13, 0);
            z80Var.d(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ld, this.E));
            int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
            int spanEnd = spannable.getSpanEnd(clickableSpanArr[0]);
            s80 b10 = z80Var.b();
            float f10 = i11;
            this.x = f10;
            b10.d(staticLayout, spanStart, f10);
            staticLayout.getSelectionPath(spanStart, spanEnd, b10);
            return z80Var;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public final void d(ClickableSpan clickableSpan, Layout layout, float f9) {
        h hVar = this.B;
        h hVar2 = null;
        if (hVar != null) {
            hVar.a(false);
            this.B = null;
        }
        if (layout != null && clickableSpan != null) {
            hVar2 = new h(this, layout, clickableSpan, f9);
        }
        this.B = hVar2;
        if (clickableSpan instanceof a51) {
            String url = ((a51) clickableSpan).getURL();
            if (url.startsWith("@") || url.startsWith("#") || url.startsWith("$") || url.startsWith("/")) {
                ((qz0) this).V.e.B4(url, this.B);
                return;
            }
            return;
        }
        if (!(clickableSpan instanceof URLSpan)) {
            clickableSpan.onClick(this);
            return;
        }
        String url2 = ((URLSpan) clickableSpan).getURL();
        if (!AndroidUtilities.shouldShowUrlInAlert(url2)) {
            ye.d.q(getContext(), Uri.parse(url2), true, true, this.B);
        } else {
            org.telegram.ui.Components.c5.r0(this.D, url2, true, true, true, false, this.B, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f9;
        float f10;
        float alpha;
        float alpha2;
        float f11;
        float f12;
        float pow;
        int i10;
        float f13;
        StaticLayout staticLayout;
        int i11;
        super.draw(canvas);
        float pow2 = ((View) getParent()) == null ? 1.0f : (float) Math.pow(r0.getAlpha(), 2.0d);
        canvas.save();
        canvas.clipRect(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(18.0f), getHeight());
        int dp = AndroidUtilities.dp(18.0f);
        this.c = dp;
        float f14 = 0.0f;
        canvas.translate(dp, 0.0f);
        v80 v80Var = this.A;
        if (v80Var != null && v80Var.f(canvas)) {
            invalidate();
        }
        int dp2 = AndroidUtilities.dp(8.0f);
        this.d = dp2;
        canvas.translate(0.0f, dp2);
        try {
            org.telegram.ui.ActionBar.g6.P1.linkColor = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.E);
            StaticLayout staticLayout2 = this.H;
            try {
                if (staticLayout2 == null || !this.S) {
                    f9 = 0.0f;
                    f10 = 255.0f;
                    StaticLayout staticLayout3 = this.a;
                    if (staticLayout3 != null) {
                        staticLayout3.draw(canvas);
                    }
                } else {
                    staticLayout2.draw(canvas);
                    int lineCount = this.H.getLineCount() - 1;
                    float lineTop = this.H.getLineTop(lineCount) + this.H.getTopPadding();
                    float lineRight = this.H.getLineRight(lineCount);
                    boolean z10 = this.L;
                    float f15 = this.N;
                    float f16 = lineRight + (z10 ? f15 : 0.0f);
                    float lineBottom = (this.H.getLineBottom(lineCount) - this.H.getLineTop(lineCount)) - this.H.getBottomPadding();
                    float pow3 = 1.0f - ((float) Math.pow(this.P, 0.25d));
                    if (pow3 < 0.5d) {
                        pow = com.google.android.recaptcha.internal.a.C(pow3, 4.0f, pow3, pow3);
                        f11 = lineTop;
                        f12 = 255.0f;
                    } else {
                        f11 = lineTop;
                        f12 = 255.0f;
                        pow = 1.0f - (((float) Math.pow((pow3 * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
                    }
                    float f17 = pow;
                    if (this.I != null) {
                        float f18 = f16;
                        int i12 = 0;
                        while (true) {
                            StaticLayout[] staticLayoutArr = this.I;
                            if (i12 >= staticLayoutArr.length) {
                                break;
                            }
                            StaticLayout staticLayout4 = staticLayoutArr[i12];
                            if (staticLayout4 != null) {
                                int save = canvas.save();
                                Point point = this.K[i12];
                                if (point != null) {
                                    point.set((int) ((f18 * f17) + this.c), (int) com.google.android.recaptcha.internal.a.z(1.0f, f17, lineBottom, this.d + f11));
                                }
                                int i13 = this.J;
                                if (i13 == -1 || i13 > i12) {
                                    i10 = i12;
                                    staticLayout = staticLayout4;
                                    i11 = save;
                                    f13 = f11;
                                    canvas.translate(f18 * f17, com.google.android.recaptcha.internal.a.z(1.0f, f17, lineBottom, f13));
                                } else {
                                    canvas.translate(f14, f11 + lineBottom);
                                    float width = staticLayout4.getWidth();
                                    float height = staticLayout4.getHeight();
                                    int i14 = (int) (this.P * f12);
                                    i10 = i12;
                                    i11 = save;
                                    staticLayout = staticLayout4;
                                    canvas.saveLayerAlpha(0.0f, 0.0f, width, height, i14, 31);
                                    f13 = f11;
                                }
                                staticLayout.draw(canvas);
                                canvas.restoreToCount(i11);
                                lineBottom += (staticLayout.getLineBottom(0) + staticLayout.getTopPadding()) - 1;
                                f18 = staticLayout.getLineRight(0) + f15 + f18;
                            } else {
                                i10 = i12;
                                f13 = f11;
                            }
                            i12 = i10 + 1;
                            f11 = f13;
                            f14 = 0.0f;
                            f12 = 255.0f;
                        }
                    }
                    f9 = 0.0f;
                    f10 = 255.0f;
                }
            } catch (Exception e10) {
                e = e10;
                FileLog.e(e);
                canvas.restore();
                FrameLayout frameLayout = this.r;
                alpha = frameLayout.getAlpha();
                if (alpha > f9) {
                }
                FrameLayout frameLayout2 = this.s;
                alpha2 = frameLayout2.getAlpha();
                if (alpha2 > f9) {
                }
                this.F.draw(canvas);
            }
        } catch (Exception e11) {
            e = e11;
            f9 = 0.0f;
            f10 = 255.0f;
        }
        canvas.restore();
        FrameLayout frameLayout3 = this.r;
        alpha = frameLayout3.getAlpha();
        if (alpha > f9) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * f10), 31);
            this.v.setAlpha((int) (pow2 * f10));
            canvas.translate(frameLayout3.getLeft(), frameLayout3.getTop());
            frameLayout3.draw(canvas);
            canvas.restore();
        }
        FrameLayout frameLayout22 = this.s;
        alpha2 = frameLayout22.getAlpha();
        if (alpha2 > f9) {
            canvas.save();
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha2 * f10), 31);
            canvas.translate(frameLayout22.getLeft(), frameLayout22.getTop());
            frameLayout22.draw(canvas);
            canvas.restore();
        }
        this.F.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    public final void e() {
        this.A.d(true);
        this.w = null;
        AndroidUtilities.cancelRunOnUIThread(this.O);
        invalidate();
    }

    public final void f(String str, String str2, boolean z10) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, this.b)) {
            return;
        }
        try {
            this.b = AndroidUtilities.getSafeString(str);
        } catch (Throwable unused) {
            this.b = str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
        this.e = spannableStringBuilder;
        this.f = null;
        MessageObject.addLinks(false, spannableStringBuilder, false, false, !z10);
        Emoji.replaceEmoji(this.e, org.telegram.ui.ActionBar.g6.P1.getFontMetricsInt(), false);
        if (this.R <= 0) {
            this.R = AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f);
        }
        a(this.R, true);
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
            a(this.R, true);
        }
        requestLayout();
    }

    public final int g() {
        StaticLayout staticLayout = this.a;
        int dp = AndroidUtilities.dp(16.0f) + (staticLayout != null ? staticLayout.getHeight() : AndroidUtilities.dp(20.0f));
        return this.h.getVisibility() == 0 ? AndroidUtilities.dp(23.0f) + dp : dp;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q = null;
        }
        float f9 = this.P;
        float g10 = g();
        float min = Math.min(T, g10);
        Math.abs(AndroidUtilities.lerp(min, g10, 1.0f) - AndroidUtilities.lerp(min, g10, f9));
        this.Q = ValueAnimator.ofFloat(0.0f, 1.0f);
        float abs = Math.abs(f9 - 1.0f) * 1250.0f * 2.0f;
        o1.f fVar = new o1.f();
        fVar.a = 0.0f;
        fVar.b = 0.0f;
        this.Q.addUpdateListener(new b(this, new AtomicReference(Float.valueOf(f9)), f9, 1.0f, fVar));
        this.Q.addListener(new nh.q5(this, 12));
        this.Q.setDuration((long) abs);
        this.Q.start();
    }

    public final int i() {
        int g10 = g();
        float min = Math.min(T + (this.h.getVisibility() == 0 ? AndroidUtilities.dp(20.0f) : 0), g());
        if (this.S) {
            g10 = (int) AndroidUtilities.lerp(min, g10, this.P);
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
                                spannableStringBuilder3.setSpan(new i(i10, this, clickableSpan), spanStart, spanEnd, 33);
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
        a(View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(36.0f), false);
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
        j jVar;
        z80 b10;
        int x4 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        c cVar = this.n;
        if (cVar.getVisibility() == 0) {
            FrameLayout frameLayout = this.r;
            if (x4 >= frameLayout.getLeft() && x4 <= frameLayout.getRight() && y8 >= frameLayout.getTop() && y8 <= frameLayout.getBottom()) {
                return false;
            }
        }
        if (this.a != null || this.I != null) {
            if (motionEvent.getAction() == 0 || (this.w != null && motionEvent.getAction() == 1)) {
                if (motionEvent.getAction() == 0) {
                    e();
                    if ((x4 < cVar.getLeft() || x4 > cVar.getRight() || y8 < cVar.getTop() || y8 > cVar.getBottom()) && (getMeasuredWidth() <= 0 || x4 <= getMeasuredWidth() - AndroidUtilities.dp(18.0f))) {
                        StaticLayout staticLayout = this.H;
                        if (staticLayout == null || this.P >= 1.0f || !this.S) {
                            jVar = this;
                        } else {
                            jVar = this;
                            b10 = jVar.b(staticLayout, this.c, this.d, x4, y8);
                            if (b10 == null) {
                                if (jVar.I != null) {
                                    int i10 = 0;
                                    while (true) {
                                        StaticLayout[] staticLayoutArr = jVar.I;
                                        if (i10 >= staticLayoutArr.length) {
                                            break;
                                        }
                                        StaticLayout staticLayout2 = staticLayoutArr[i10];
                                        Point point = jVar.K[i10];
                                        z80 b11 = jVar.b(staticLayout2, point.x, point.y, x4, y8);
                                        if (b11 != null) {
                                            b10 = b11;
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                            }
                            if (b10 != null) {
                                jVar.y = jVar.a;
                                jVar.w = b10;
                                jVar.A.a(b10, null);
                                AndroidUtilities.runOnUIThread(jVar.O, ViewConfiguration.getLongPressTimeout());
                                return true;
                            }
                            if (!super.onTouchEvent(motionEvent)) {
                                return true;
                            }
                        }
                        b10 = jVar.b(jVar.a, jVar.c, jVar.d, x4, y8);
                    } else {
                        jVar = this;
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    if (!super.onTouchEvent(motionEvent)) {
                    }
                } else {
                    z80 z80Var = this.w;
                    if (z80Var != null) {
                        try {
                            d((ClickableSpan) z80Var.i, this.a, this.x);
                        } catch (Exception e10) {
                            FileLog.e(e10);
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
        this.M = z10;
    }
}
