package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.n00;
import org.telegram.ui.so0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public class q8 extends FrameLayout {
    public static final /* synthetic */ int Q = 0;
    public final org.telegram.ui.ActionBar.d6 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public float J;
    public org.telegram.ui.Components.p5 K;
    public int L;
    public CharSequence M;
    public Paint N;
    public boolean O;
    public int P;
    public final org.telegram.ui.ActionBar.j5 a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.Components.q6 c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final xj0 e;
    public Switch f;
    public final ImageView h;
    public int n;
    public boolean r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public boolean y;

    public q8(Context context) {
        this(20, context, null, false, false);
    }

    public static SpannableStringBuilder a(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        n00 n00Var = new n00();
        n00Var.f = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Lj, false);
        spannableStringBuilder.setSpan(n00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final boolean b() {
        Switch r02 = this.f;
        return r02 != null && r02.h;
    }

    public final void d(int i10, int i11, int i12) {
        this.s = 52;
        xj0 xj0Var = this.e;
        xj0Var.setVisibility(0);
        xj0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        xj0Var.setTranslationX(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : -3.0f));
        xj0Var.setImageResource(i12);
        xj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.d6 d6Var = this.E;
        boolean a2 = d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q();
        jc0 jc0Var = new jc0(1);
        jc0Var.b(i10, i11);
        jc0Var.b = a2;
        xj0Var.setBackground(jc0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.H || this.J != 0.0f) {
            if (this.N == null) {
                Paint paint = new Paint(1);
                this.N = paint;
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.O5, this.E));
            }
            if (this.O) {
                float f7 = this.I + 0.016f;
                this.I = f7;
                if (f7 > 1.0f) {
                    this.I = 1.0f;
                    this.O = false;
                }
            } else {
                float f10 = this.I - 0.016f;
                this.I = f10;
                if (f10 < 0.0f) {
                    this.I = 0.0f;
                    this.O = true;
                }
            }
            int i10 = this.P;
            if (i10 > 0) {
                this.P = i10 - 15;
            } else {
                boolean z10 = this.H;
                if (z10) {
                    float f11 = this.J;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.10666667f;
                        this.J = f12;
                        if (f12 > 1.0f) {
                            this.J = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f13 = this.J;
                    if (f13 != 0.0f) {
                        float f14 = f13 - 0.10666667f;
                        this.J = f14;
                        if (f14 < 0.0f) {
                            this.J = 0.0f;
                        }
                    }
                }
            }
            this.N.setAlpha((int) (((this.I * 0.4f) + 0.6f) * this.J * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(21.0f)) - AndroidUtilities.dp(this.G), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.N);
            invalidate();
        }
        float f15 = 1.0f - this.J;
        org.telegram.ui.Components.p5 p5Var = this.K;
        this.c.setAlpha(f15 * (p5Var == null ? 1.0f : 1.0f - p5Var.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f16 = 1.0f - this.J;
        org.telegram.ui.Components.p5 p5Var2 = this.K;
        this.d.setAlpha(f16 * (p5Var2 == null ? 1.0f : 1.0f - p5Var2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.p5 p5Var3 = this.K;
        if (p5Var3 != null) {
            p5Var3.setBounds((getWidth() - this.K.s) - AndroidUtilities.dp(18.0f), (getHeight() - this.K.s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.K.s) / 2);
            this.K.draw(canvas);
        }
    }

    public final void e(int i10, int i11) {
        org.telegram.ui.ActionBar.d6 d6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.setTextColor(w02);
        j5Var.setTag(Integer.valueOf(i11));
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.SRC_IN);
            xj0 xj0Var = this.e;
            xj0Var.setColorFilter(porterDuffColorFilter);
            xj0Var.setTag(Integer.valueOf(i10));
        }
        v();
    }

    public final void f(int i10, boolean z10, boolean z11) {
        this.H = z10;
        this.G = i10;
        if (!z11) {
            this.J = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void g(boolean z10) {
        super.setEnabled(z10);
        Switch r02 = this.f;
        if (r02 != null) {
            r02.setEnabled(z10);
        }
        this.a.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.b.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.c.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.d.animate().alpha(z10 ? 1.0f : 0.5f).start();
    }

    public Switch getCheckBox() {
        return this.f;
    }

    public xj0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.j5 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.q6 getValueTextView() {
        return this.c;
    }

    public final void h(int i10) {
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        if (i10 <= 0) {
            j5Var.i(null);
        } else {
            j5Var.i(new so0(i10, getContext(), this.E, false));
            j5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        }
    }

    public final void i(CharSequence charSequence, boolean z10) {
        this.w = 16;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.q6 q6Var = this.c;
        q6Var.c(null, false, true);
        this.e.setVisibility(8);
        q6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void j(CharSequence charSequence, boolean z10, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        Switch r62 = this.f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f.c(z10, false);
        }
        setWillNotDraw(!this.r);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void k(String str, boolean z10, int i10, int i11, boolean z11) {
        this.w = 21;
        this.s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.l(str, false);
        j5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        d(i11, i11, i10);
        if (this.f == null) {
            Switch r12 = new Switch(getContext(), this.E);
            this.f = r12;
            int i12 = org.telegram.ui.ActionBar.h6.M6;
            int i13 = org.telegram.ui.ActionBar.h6.N6;
            int i14 = org.telegram.ui.ActionBar.h6.d6;
            r12.d(i12, i13, i14, i14);
            addView(this.f, w7.z5.a(20.0f, 22.0f, 0.0f, 22.0f, 0.0f, 37, (LocaleController.isRTL ? 3 : 5) | 16));
        }
        Switch r122 = this.f;
        if (r122 != null) {
            r122.setVisibility(0);
            this.f.c(z10, false);
        }
        this.r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void l(int i10, String str, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.l(str, false);
        j5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r02 = this.f;
        if (r02 != null) {
            r02.setVisibility(0);
            this.f.c(z10, false);
        }
        xj0 xj0Var = this.e;
        xj0Var.setVisibility(0);
        xj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        xj0Var.setImageResource(i10);
        this.r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void m(int i10, CharSequence charSequence, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.q6 q6Var = this.c;
        q6Var.c(null, false, true);
        xj0 xj0Var = this.e;
        xj0Var.setImageResource(i10);
        xj0Var.setVisibility(0);
        q6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        xj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void n(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.s = 58;
        this.w = 18;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.q6 q6Var = this.c;
        q6Var.c(null, false, true);
        xj0 xj0Var = this.e;
        xj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof uj0) {
            xj0Var.setAnimation((uj0) drawable);
        } else {
            xj0Var.setImageDrawable(drawable);
        }
        xj0Var.setVisibility(0);
        q6Var.setVisibility(8);
        this.h.setVisibility(8);
        xj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void o(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.M = charSequence2;
        org.telegram.ui.Components.q6 q6Var = this.c;
        q6Var.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, q6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), z10, true);
        q6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f7;
        float dp;
        int i10;
        if (this.r) {
            org.telegram.ui.ActionBar.d6 d6Var = this.E;
            Paint n10 = d6Var != null ? d6Var.n("paintDivider") : null;
            if (n10 == null) {
                n10 = org.telegram.ui.ActionBar.h6.k0;
            }
            Paint paint = n10;
            boolean z10 = LocaleController.isRTL;
            float f10 = 20.0f;
            xj0 xj0Var = this.e;
            if (z10) {
                dp = 0.0f;
            } else {
                if (xj0Var.getVisibility() == 0) {
                    f7 = this.x ? 72 : 58;
                } else {
                    f7 = 20.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (xj0Var.getVisibility() == 0) {
                    f10 = this.x ? 72 : 58;
                }
                i10 = AndroidUtilities.dp(f10);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        CharSequence text = j5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.q6 q6Var = this.c;
        if (!isEmpty) {
            CharSequence text2 = q6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j5Var.getText());
            if (!TextUtils.isEmpty(q6Var.getText())) {
                sb2.append('\n');
                sb2.append(q6Var.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int i14 = i13 - i11;
        int i15 = i12 - i10;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        int textHeight = j5Var.getTextHeight();
        org.telegram.ui.Components.q6 q6Var = this.c;
        int max = ((i14 - Math.max(textHeight, q6Var.getTextHeight())) / 2) + 1;
        int dp2 = LocaleController.isRTL ? AndroidUtilities.dp(this.n - 6) : (i15 - q6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n - 6);
        if (this.y && !LocaleController.isRTL) {
            dp2 = (i15 - q6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n);
        }
        q6Var.layout(dp2, max, q6Var.getMeasuredWidth() + dp2, q6Var.getMeasuredHeight() + max);
        int dp3 = LocaleController.isRTL ? AndroidUtilities.dp(this.n - 6) : (i15 - j5Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n - 6);
        j5Var.layout(dp3, max, j5Var.getMeasuredWidth() + dp3, j5Var.getMeasuredHeight() + max);
        boolean z11 = LocaleController.isRTL;
        xj0 xj0Var = this.e;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.a;
        if (z11) {
            dp = (getMeasuredWidth() - j5Var2.getMeasuredWidth()) - AndroidUtilities.dp(xj0Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            dp = AndroidUtilities.dp(xj0Var.getVisibility() == 0 ? this.s : this.n);
        }
        org.telegram.ui.ActionBar.j5 j5Var3 = this.b;
        if (j5Var3.getVisibility() == 0) {
            float f7 = this.v > 50 ? 4 : 2;
            int dp4 = AndroidUtilities.dp(1.0f) + wh.B(f7, (i14 - j5Var2.getTextHeight()) - j5Var3.getTextHeight(), 2);
            j5Var2.layout(dp, dp4, j5Var2.getMeasuredWidth() + dp, j5Var2.getMeasuredHeight() + dp4);
            int dp5 = AndroidUtilities.dp(f7) + j5Var2.getTextHeight() + dp4;
            j5Var3.layout(dp, dp5, j5Var3.getMeasuredWidth() + dp, j5Var3.getMeasuredHeight() + dp5);
        } else {
            int dp6 = AndroidUtilities.dp(1.0f) + ((i14 - j5Var2.getTextHeight()) / 2);
            j5Var2.layout(dp, dp6, j5Var2.getMeasuredWidth() + dp, j5Var2.getMeasuredHeight() + dp6);
        }
        if (xj0Var.getVisibility() == 0) {
            int dp7 = AndroidUtilities.dp(1.0f) + ((((i14 - xj0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(this.v > 50 ? 0.0f : 2.0f)) - xj0Var.getPaddingTop());
            int dp8 = !LocaleController.isRTL ? AndroidUtilities.dp(this.w) : (i15 - xj0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.w);
            xj0Var.layout(dp8, dp7, xj0Var.getMeasuredWidth() + dp8, xj0Var.getMeasuredHeight() + dp7);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int dp9 = AndroidUtilities.dp(1.0f) + ((i14 - imageView.getMeasuredHeight()) / 2);
            int dp10 = LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : (i15 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            imageView.layout(dp10, dp9, imageView.getMeasuredWidth() + dp10, imageView.getMeasuredHeight() + dp9);
        }
        Switch r92 = this.f;
        if (r92 == null || r92.getVisibility() != 0) {
            return;
        }
        int measuredHeight = (i14 - this.f.getMeasuredHeight()) / 2;
        int dp11 = LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : (i15 - this.f.getMeasuredWidth()) - AndroidUtilities.dp(22.0f);
        Switch r10 = this.f;
        r10.layout(dp11, measuredHeight, r10.getMeasuredWidth() + dp11, this.f.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(this.v);
        int i12 = this.L;
        org.telegram.ui.Components.q6 q6Var = this.c;
        if (i12 != 0 && i12 != size && (charSequence = this.M) != null) {
            q6Var.c(TextUtils.ellipsize(charSequence, q6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.L = size;
        boolean z10 = this.y;
        org.telegram.ui.ActionBar.j5 j5Var = this.b;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.d;
        org.telegram.ui.ActionBar.j5 j5Var3 = this.a;
        if (z10) {
            j5Var3.measure(wh.c(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            j5Var.measure(wh.c(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            q6Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 103)) - j5Var3.getTextWidth(), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            j5Var2.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 103)) - j5Var3.getTextWidth(), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        } else {
            q6Var.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.n), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            j5Var2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.n), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            int max = Math.max(q6Var.d(), j5Var2.getTextWidth());
            j5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            j5Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        }
        xj0 xj0Var = this.e;
        if (xj0Var.getVisibility() == 0) {
            xj0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
        }
        Switch r02 = this.f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, dp + (this.r ? 1 : 0));
    }

    public final void p(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11) {
        CharSequence ellipsize;
        this.w = 21;
        this.s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.l(str, false);
        j5Var.i(null);
        org.telegram.ui.Components.q6 q6Var = this.c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.M = str2;
            ellipsize = TextUtils.ellipsize(str2, q6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        q6Var.c(ellipsize, z10, true);
        q6Var.setVisibility(0);
        this.d.setVisibility(8);
        d(i11, i12, i10);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10) {
        s(charSequence, charSequence2, false, i10, z10);
    }

    public final void r(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.s = 58;
        this.w = 18;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.M = charSequence2;
        org.telegram.ui.Components.q6 q6Var = this.c;
        q6Var.c(charSequence2, false, true);
        xj0 xj0Var = this.e;
        xj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof uj0) {
            xj0Var.setAnimation((uj0) drawable);
        } else {
            xj0Var.setImageDrawable(drawable);
        }
        xj0Var.setVisibility(0);
        q6Var.setVisibility(0);
        this.h.setVisibility(8);
        xj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        xj0 xj0Var = this.e;
        xj0Var.setVisibility(0);
        org.telegram.ui.Components.q6 q6Var = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((ei.x3.g(charSequence, j5Var.getTextPaint()) + AndroidUtilities.dp(this.s)) + AndroidUtilities.dp(16.0f)));
            this.M = charSequence2;
            q6Var.c(TextUtils.ellipsize(charSequence2, q6Var.getPaint(), max, TextUtils.TruncateAt.END), z10, true);
        } else {
            q6Var.c("", z10, true);
        }
        q6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        xj0Var.setTranslationX(0.0f);
        xj0Var.setTranslationY(0.0f);
        xj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        xj0Var.setImageResource(i10);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public void setChecked(boolean z10) {
        this.f.c(z10, true);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        g(z10);
    }

    public void setImageLeft(int i10) {
        this.w = i10;
    }

    public void setNeedDivider(boolean z10) {
        if (this.r != z10) {
            this.r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i10) {
        this.s = i10;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.y != z10) {
            this.y = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.j5 j5Var = this.b;
        if (isEmpty) {
            j5Var.setVisibility(8);
        } else {
            j5Var.setVisibility(0);
            j5Var.l(charSequence, false);
        }
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.K == null) {
            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(30.0f), this);
            this.K = p5Var;
            if (this.F) {
                p5Var.a();
            }
        }
        this.K.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        j5Var.l(charSequence, false);
        j5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.q6 q6Var = this.c;
        q6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        q6Var.setVisibility(8);
        this.d.setVisibility(8);
        xj0 xj0Var = this.e;
        xj0Var.setVisibility(8);
        xj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.p5 p5Var = this.K;
        if (p5Var != null) {
            p5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.q6 q6Var = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.M = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, q6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        q6Var.c(ellipsize, z10, true);
    }

    public final void v() {
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        int intValue = j5Var.getTag() instanceof Integer ? ((Integer) j5Var.getTag()).intValue() : org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.h6.w0(intValue, d6Var);
        if (intValue != org.telegram.ui.ActionBar.h6.j5 && intValue != org.telegram.ui.ActionBar.h6.G6) {
            w02 = c(w02);
        }
        j5Var.setTextColor(w02);
        xj0 xj0Var = this.e;
        if (xj0Var.getTag() instanceof Integer) {
            int intValue2 = ((Integer) xj0Var.getTag()).intValue();
            int w03 = org.telegram.ui.ActionBar.h6.w0(intValue2, d6Var);
            if (intValue2 != org.telegram.ui.ActionBar.h6.J5 && intValue2 != org.telegram.ui.ActionBar.h6.m6) {
                w03 = c(w03);
            }
            xj0Var.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        this.b.setTextColor(c(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.y6, d6Var)));
        int i10 = org.telegram.ui.ActionBar.h6.I6;
        this.c.setTextColor(c(org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
        this.d.setTextColor(c(org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
    }

    public q8(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(20, context, d6Var, false, false);
    }

    public q8(int i10, Context context, boolean z10) {
        this(i10, context, null, z10, false);
    }

    public q8(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context);
        this.s = 58;
        this.v = 50;
        this.w = 16;
        this.E = d6Var;
        this.n = i10;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.a = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.j5 : org.telegram.ui.ActionBar.h6.G6, d6Var));
        j5Var.setTextSize(16);
        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        j5Var.setImportantForAccessibility(2);
        addView(j5Var, w7.z5.d(-1.0f, -2));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var2;
        j5Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.p5 : org.telegram.ui.ActionBar.h6.y6, d6Var));
        j5Var2.setTextSize(13);
        j5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        j5Var2.setImportantForAccessibility(2);
        addView(j5Var2, w7.z5.d(-1.0f, -2));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, true);
        this.c = q6Var;
        q6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.n5 : org.telegram.ui.ActionBar.h6.I6, d6Var));
        q6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        q6Var.setTextSize(AndroidUtilities.dp(16.0f));
        q6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        q6Var.setImportantForAccessibility(2);
        q6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(q6Var);
        org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var3;
        Boolean bool = Boolean.FALSE;
        if (!j5Var3.P) {
            j5Var3.n0 = true;
            j5Var3.p0 = bool;
            j5Var3.m();
            j5Var3.b();
        }
        j5Var3.q0 = 18;
        j5Var3.m();
        j5Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.n5 : org.telegram.ui.ActionBar.h6.I6, d6Var));
        j5Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        j5Var3.setTextSize(16);
        j5Var3.setImportantForAccessibility(2);
        j5Var3.setVisibility(8);
        addView(j5Var3);
        xj0 xj0Var = new xj0(context);
        this.e = xj0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        xj0Var.setScaleType(scaleType);
        xj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.J5 : org.telegram.ui.ActionBar.h6.m6, d6Var), PorterDuff.Mode.SRC_IN));
        addView(xj0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z11) {
            Switch r42 = new Switch(context, d6Var);
            this.f = r42;
            int i11 = org.telegram.ui.ActionBar.h6.M6;
            int i12 = org.telegram.ui.ActionBar.h6.N6;
            int i13 = org.telegram.ui.ActionBar.h6.d6;
            r42.d(i11, i12, i13, i13);
            addView(this.f, w7.z5.a(20.0f, 22.0f, 0.0f, 22.0f, 0.0f, 37, (LocaleController.isRTL ? 3 : 5) | 16));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.K == null) {
            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(30.0f), this);
            this.K = p5Var;
            if (this.F) {
                p5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new p8(imageReceiver, 0));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.K.g(new ei.w3(imageReceiver, 4), true);
        invalidate();
    }

    public int c(int i10) {
        return i10;
    }
}
