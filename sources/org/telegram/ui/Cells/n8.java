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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.a10;
import org.telegram.ui.wo0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class n8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 B;
    public boolean C;
    public int D;
    public boolean E;
    public float F;
    public float G;
    public org.telegram.ui.Components.j5 H;
    public int I;
    public CharSequence J;
    public Paint K;
    public boolean L;
    public int M;
    public final org.telegram.ui.ActionBar.k5 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final org.telegram.ui.Components.k6 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final jj0 e;
    public Switch f;
    public final ImageView h;
    public int n;
    public boolean r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public boolean y;

    public n8(Context context) {
        this(23, context, null, false, false);
    }

    public static SpannableStringBuilder a(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        a10 a10Var = new a10();
        a10Var.f = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false);
        spannableStringBuilder.setSpan(a10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final boolean b() {
        Switch r02 = this.f;
        return r02 != null && r02.h;
    }

    public final void d(int i10, int i11, int i12) {
        this.s = 52;
        jj0 jj0Var = this.e;
        jj0Var.setVisibility(0);
        jj0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        jj0Var.setTranslationX(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : -3.0f));
        jj0Var.setImageResource(i12);
        jj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.f6 f6Var = this.B;
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        sb0 sb0Var = new sb0(1);
        sb0Var.b(i10, i11);
        sb0Var.b = a2;
        jj0Var.setBackground(sb0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.E || this.G != 0.0f) {
            if (this.K == null) {
                Paint paint = new Paint(1);
                this.K = paint;
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.O5, this.B));
            }
            if (this.L) {
                float f10 = this.F + 0.016f;
                this.F = f10;
                if (f10 > 1.0f) {
                    this.F = 1.0f;
                    this.L = false;
                }
            } else {
                float f11 = this.F - 0.016f;
                this.F = f11;
                if (f11 < 0.0f) {
                    this.F = 0.0f;
                    this.L = true;
                }
            }
            int i10 = this.M;
            if (i10 > 0) {
                this.M = i10 - 15;
            } else {
                boolean z4 = this.E;
                if (z4) {
                    float f12 = this.G;
                    if (f12 != 1.0f) {
                        float f13 = f12 + 0.10666667f;
                        this.G = f13;
                        if (f13 > 1.0f) {
                            this.G = 1.0f;
                        }
                    }
                }
                if (!z4) {
                    float f14 = this.G;
                    if (f14 != 0.0f) {
                        float f15 = f14 - 0.10666667f;
                        this.G = f15;
                        if (f15 < 0.0f) {
                            this.G = 0.0f;
                        }
                    }
                }
            }
            this.K.setAlpha((int) (((this.F * 0.4f) + 0.6f) * this.G * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(21.0f)) - AndroidUtilities.dp(this.D), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.K);
            invalidate();
        }
        float f16 = 1.0f - this.G;
        org.telegram.ui.Components.j5 j5Var = this.H;
        this.c.setAlpha(f16 * (j5Var == null ? 1.0f : 1.0f - j5Var.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f17 = 1.0f - this.G;
        org.telegram.ui.Components.j5 j5Var2 = this.H;
        this.d.setAlpha(f17 * (j5Var2 == null ? 1.0f : 1.0f - j5Var2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.j5 j5Var3 = this.H;
        if (j5Var3 != null) {
            j5Var3.setBounds((getWidth() - this.H.s) - AndroidUtilities.dp(18.0f), (getHeight() - this.H.s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.H.s) / 2);
            this.H.draw(canvas);
        }
    }

    public final void e(int i10, int i11) {
        org.telegram.ui.ActionBar.f6 f6Var = this.B;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.setTextColor(v02);
        k5Var.setTag(Integer.valueOf(i11));
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN);
            jj0 jj0Var = this.e;
            jj0Var.setColorFilter(porterDuffColorFilter);
            jj0Var.setTag(Integer.valueOf(i10));
        }
        v();
    }

    public final void f(int i10, boolean z4, boolean z10) {
        this.E = z4;
        this.D = i10;
        if (!z10) {
            this.G = z4 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void g(boolean z4) {
        super.setEnabled(z4);
        Switch r02 = this.f;
        if (r02 != null) {
            r02.setEnabled(z4);
        }
        this.a.animate().alpha(z4 ? 1.0f : 0.5f).start();
        this.b.animate().alpha(z4 ? 1.0f : 0.5f).start();
        this.c.animate().alpha(z4 ? 1.0f : 0.5f).start();
        this.d.animate().alpha(z4 ? 1.0f : 0.5f).start();
    }

    public Switch getCheckBox() {
        return this.f;
    }

    public jj0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.k5 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.k6 getValueTextView() {
        return this.c;
    }

    public final void h(int i10) {
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        if (i10 <= 0) {
            k5Var.i(null);
        } else {
            k5Var.i(new wo0(i10, getContext(), this.B, false));
            k5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        }
    }

    public final void i(CharSequence charSequence, boolean z4) {
        this.w = 16;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.J = null;
        org.telegram.ui.Components.k6 k6Var = this.c;
        k6Var.c(null, false, true);
        this.e.setVisibility(8);
        k6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z4;
        setWillNotDraw(!z4);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void j(CharSequence charSequence, boolean z4, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z10;
        Switch r62 = this.f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f.c(z4, false);
        }
        setWillNotDraw(!this.r);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void k(String str, boolean z4, int i10, int i11, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(str, false);
        k5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        d(i11, i11, i10);
        if (this.f == null) {
            Switch r13 = new Switch(getContext(), this.B);
            this.f = r13;
            int i12 = org.telegram.ui.ActionBar.j6.M6;
            int i13 = org.telegram.ui.ActionBar.j6.N6;
            int i14 = org.telegram.ui.ActionBar.j6.d6;
            r13.d(i12, i13, i14, i14);
            addView(this.f, k7.b6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r132 = this.f;
        if (r132 != null) {
            r132.setVisibility(0);
            this.f.c(z4, false);
        }
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void l(int i10, String str, boolean z4) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(str, false);
        k5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r02 = this.f;
        if (r02 != null) {
            r02.setVisibility(0);
            this.f.c(z4, false);
        }
        jj0 jj0Var = this.e;
        jj0Var.setVisibility(0);
        jj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        jj0Var.setImageResource(i10);
        this.r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void m(int i10, CharSequence charSequence, boolean z4) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.J = null;
        org.telegram.ui.Components.k6 k6Var = this.c;
        k6Var.c(null, false, true);
        jj0 jj0Var = this.e;
        jj0Var.setImageResource(i10);
        jj0Var.setVisibility(0);
        k6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        jj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.r = z4;
        setWillNotDraw(!z4);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void n(CharSequence charSequence, Drawable drawable, boolean z4) {
        this.s = 58;
        this.w = 18;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.J = null;
        org.telegram.ui.Components.k6 k6Var = this.c;
        k6Var.c(null, false, true);
        jj0 jj0Var = this.e;
        jj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof gj0) {
            jj0Var.setAnimation((gj0) drawable);
        } else {
            jj0Var.setImageDrawable(drawable);
        }
        jj0Var.setVisibility(0);
        k6Var.setVisibility(8);
        this.h.setVisibility(8);
        jj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.r = z4;
        setWillNotDraw(!z4);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void o(CharSequence charSequence, CharSequence charSequence2, boolean z4, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.J = charSequence2;
        org.telegram.ui.Components.k6 k6Var = this.c;
        k6Var.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, k6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), z4, true);
        k6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C = true;
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C = false;
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10;
        float dp;
        int i10;
        if (this.r) {
            org.telegram.ui.ActionBar.f6 f6Var = this.B;
            Paint G = f6Var != null ? f6Var.G("paintDivider") : null;
            if (G == null) {
                G = org.telegram.ui.ActionBar.j6.k0;
            }
            Paint paint = G;
            boolean z4 = LocaleController.isRTL;
            float f11 = 20.0f;
            jj0 jj0Var = this.e;
            if (z4) {
                dp = 0.0f;
            } else {
                if (jj0Var.getVisibility() == 0) {
                    f10 = this.x ? 72 : 58;
                } else {
                    f10 = 20.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (jj0Var.getVisibility() == 0) {
                    f11 = this.x ? 72 : 58;
                }
                i10 = AndroidUtilities.dp(f11);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        CharSequence text = k5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.k6 k6Var = this.c;
        if (!isEmpty) {
            CharSequence text2 = k6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f.h);
            StringBuilder sb = new StringBuilder();
            sb.append(k5Var.getText());
            if (!TextUtils.isEmpty(k6Var.getText())) {
                sb.append('\n');
                sb.append(k6Var.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp;
        int i14 = i13 - i11;
        int i15 = i12 - i10;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        int textHeight = k5Var.getTextHeight();
        org.telegram.ui.Components.k6 k6Var = this.c;
        int max = ((i14 - Math.max(textHeight, k6Var.getTextHeight())) / 2) + 1;
        int dp2 = LocaleController.isRTL ? AndroidUtilities.dp(this.n - 6) : (i15 - k6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n - 6);
        if (this.y && !LocaleController.isRTL) {
            dp2 = (i15 - k6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n);
        }
        k6Var.layout(dp2, max, k6Var.getMeasuredWidth() + dp2, k6Var.getMeasuredHeight() + max);
        int dp3 = LocaleController.isRTL ? AndroidUtilities.dp(this.n - 6) : (i15 - k5Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n - 6);
        k5Var.layout(dp3, max, k5Var.getMeasuredWidth() + dp3, k5Var.getMeasuredHeight() + max);
        boolean z10 = LocaleController.isRTL;
        jj0 jj0Var = this.e;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.a;
        if (z10) {
            dp = (getMeasuredWidth() - k5Var2.getMeasuredWidth()) - AndroidUtilities.dp(jj0Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            dp = AndroidUtilities.dp(jj0Var.getVisibility() == 0 ? this.s : this.n);
        }
        org.telegram.ui.ActionBar.k5 k5Var3 = this.b;
        if (k5Var3.getVisibility() == 0) {
            float f10 = this.v > 50 ? 4 : 2;
            int dp4 = AndroidUtilities.dp(1.0f) + org.telegram.ui.b.x(f10, (i14 - k5Var2.getTextHeight()) - k5Var3.getTextHeight(), 2);
            k5Var2.layout(dp, dp4, k5Var2.getMeasuredWidth() + dp, k5Var2.getMeasuredHeight() + dp4);
            int dp5 = AndroidUtilities.dp(f10) + k5Var2.getTextHeight() + dp4;
            k5Var3.layout(dp, dp5, k5Var3.getMeasuredWidth() + dp, k5Var3.getMeasuredHeight() + dp5);
        } else {
            int dp6 = AndroidUtilities.dp(1.0f) + ((i14 - k5Var2.getTextHeight()) / 2);
            k5Var2.layout(dp, dp6, k5Var2.getMeasuredWidth() + dp, k5Var2.getMeasuredHeight() + dp6);
        }
        if (jj0Var.getVisibility() == 0) {
            int dp7 = AndroidUtilities.dp(1.0f) + ((((i14 - jj0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(this.v > 50 ? 0.0f : 2.0f)) - jj0Var.getPaddingTop());
            int dp8 = !LocaleController.isRTL ? AndroidUtilities.dp(this.w) : (i15 - jj0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.w);
            jj0Var.layout(dp8, dp7, jj0Var.getMeasuredWidth() + dp8, jj0Var.getMeasuredHeight() + dp7);
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
        int i12 = this.I;
        org.telegram.ui.Components.k6 k6Var = this.c;
        if (i12 != 0 && i12 != size && (charSequence = this.J) != null) {
            k6Var.c(TextUtils.ellipsize(charSequence, k6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.I = size;
        boolean z4 = this.y;
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.d;
        org.telegram.ui.ActionBar.k5 k5Var3 = this.a;
        if (z4) {
            k5Var3.measure(org.telegram.ui.b.d(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            k5Var.measure(org.telegram.ui.b.d(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            k6Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 103)) - k5Var3.getTextWidth(), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            k5Var2.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 103)) - k5Var3.getTextWidth(), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        } else {
            k6Var.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.n), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            k5Var2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.n), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            int max = Math.max(k6Var.d(), k5Var2.getTextWidth());
            k5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            k5Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        }
        jj0 jj0Var = this.e;
        if (jj0Var.getVisibility() == 0) {
            jj0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
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

    public final void p(String str, String str2, boolean z4, int i10, int i11, int i12, boolean z10) {
        CharSequence ellipsize;
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(str, false);
        k5Var.i(null);
        org.telegram.ui.Components.k6 k6Var = this.c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.J = str2;
            ellipsize = TextUtils.ellipsize(str2, k6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        k6Var.c(ellipsize, z4, true);
        k6Var.setVisibility(0);
        this.d.setVisibility(8);
        d(i11, i12, i10);
        this.h.setVisibility(8);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z4) {
        s(charSequence, charSequence2, false, i10, z4);
    }

    public final void r(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z4) {
        this.s = 58;
        this.w = 18;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.J = charSequence2;
        org.telegram.ui.Components.k6 k6Var = this.c;
        k6Var.c(charSequence2, false, true);
        jj0 jj0Var = this.e;
        jj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof gj0) {
            jj0Var.setAnimation((gj0) drawable);
        } else {
            jj0Var.setImageDrawable(drawable);
        }
        jj0Var.setVisibility(0);
        k6Var.setVisibility(0);
        this.h.setVisibility(8);
        jj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.r = z4;
        setWillNotDraw(!z4);
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i10, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        jj0 jj0Var = this.e;
        jj0Var.setVisibility(0);
        org.telegram.ui.Components.k6 k6Var = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((ph.f3.g(charSequence, k5Var.getTextPaint()) + AndroidUtilities.dp(this.s)) + AndroidUtilities.dp(16.0f)));
            this.J = charSequence2;
            k6Var.c(TextUtils.ellipsize(charSequence2, k6Var.getPaint(), max, TextUtils.TruncateAt.END), z4, true);
        } else {
            k6Var.c("", z4, true);
        }
        k6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        jj0Var.setTranslationX(0.0f);
        jj0Var.setTranslationY(0.0f);
        jj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        jj0Var.setImageResource(i10);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r92 = this.f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public void setChecked(boolean z4) {
        this.f.c(z4, true);
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        g(z4);
    }

    public void setImageLeft(int i10) {
        this.w = i10;
    }

    public void setNeedDivider(boolean z4) {
        if (this.r != z4) {
            this.r = z4;
            setWillNotDraw(!z4);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i10) {
        this.s = i10;
    }

    public void setPrioritizeTitleOverValue(boolean z4) {
        if (this.y != z4) {
            this.y = z4;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        if (isEmpty) {
            k5Var.setVisibility(8);
        } else {
            k5Var.setVisibility(0);
            k5Var.l(charSequence, false);
        }
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.H == null) {
            org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(30.0f), this);
            this.H = j5Var;
            if (this.C) {
                j5Var.a();
            }
        }
        this.H.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, Drawable drawable, boolean z4) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.J = null;
        org.telegram.ui.Components.k6 k6Var = this.c;
        k6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        k6Var.setVisibility(8);
        this.d.setVisibility(8);
        jj0 jj0Var = this.e;
        jj0Var.setVisibility(8);
        jj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.r = z4;
        setWillNotDraw(!z4);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.j5 j5Var = this.H;
        if (j5Var != null) {
            j5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, boolean z4) {
        CharSequence ellipsize;
        org.telegram.ui.Components.k6 k6Var = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.J = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, k6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        k6Var.c(ellipsize, z4, true);
    }

    public final void v() {
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        int intValue = k5Var.getTag() instanceof Integer ? ((Integer) k5Var.getTag()).intValue() : org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.B;
        int v02 = org.telegram.ui.ActionBar.j6.v0(intValue, f6Var);
        if (intValue != org.telegram.ui.ActionBar.j6.j5 && intValue != org.telegram.ui.ActionBar.j6.G6) {
            v02 = c(v02);
        }
        k5Var.setTextColor(v02);
        jj0 jj0Var = this.e;
        if (jj0Var.getTag() instanceof Integer) {
            int intValue2 = ((Integer) jj0Var.getTag()).intValue();
            int v03 = org.telegram.ui.ActionBar.j6.v0(intValue2, f6Var);
            if (intValue2 != org.telegram.ui.ActionBar.j6.J5 && intValue2 != org.telegram.ui.ActionBar.j6.m6) {
                v03 = c(v03);
            }
            jj0Var.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
        }
        this.b.setTextColor(c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var)));
        int i10 = org.telegram.ui.ActionBar.j6.I6;
        this.c.setTextColor(c(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        this.d.setTextColor(c(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
    }

    public n8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(23, context, f6Var, false, false);
    }

    public n8(int i10, Context context, boolean z4) {
        this(i10, context, null, z4, false);
    }

    public n8(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context);
        this.s = 58;
        this.v = 50;
        this.w = 16;
        this.B = f6Var;
        this.n = i10;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.a = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(z4 ? org.telegram.ui.ActionBar.j6.j5 : org.telegram.ui.ActionBar.j6.G6, f6Var));
        k5Var.setTextSize(16);
        k5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        k5Var.setImportantForAccessibility(2);
        addView(k5Var, k7.b6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var2;
        k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(z4 ? org.telegram.ui.ActionBar.j6.p5 : org.telegram.ui.ActionBar.j6.y6, f6Var));
        k5Var2.setTextSize(13);
        k5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        k5Var2.setImportantForAccessibility(2);
        addView(k5Var2, k7.b6.c(-1.0f, -2));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
        this.c = k6Var;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(z4 ? org.telegram.ui.ActionBar.j6.n5 : org.telegram.ui.ActionBar.j6.I6, f6Var));
        k6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        k6Var.setTextSize(AndroidUtilities.dp(16.0f));
        k6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        k6Var.setImportantForAccessibility(2);
        k6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(k6Var);
        org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var3;
        Boolean bool = Boolean.FALSE;
        if (!k5Var3.M) {
            k5Var3.k0 = true;
            k5Var3.m0 = bool;
            k5Var3.m();
            k5Var3.b();
        }
        k5Var3.n0 = 18;
        k5Var3.m();
        k5Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(z4 ? org.telegram.ui.ActionBar.j6.n5 : org.telegram.ui.ActionBar.j6.I6, f6Var));
        k5Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        k5Var3.setTextSize(16);
        k5Var3.setImportantForAccessibility(2);
        k5Var3.setVisibility(8);
        addView(k5Var3);
        jj0 jj0Var = new jj0(context);
        this.e = jj0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        jj0Var.setScaleType(scaleType);
        jj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(z4 ? org.telegram.ui.ActionBar.j6.J5 : org.telegram.ui.ActionBar.j6.m6, f6Var), PorterDuff.Mode.SRC_IN));
        addView(jj0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z10) {
            Switch r42 = new Switch(context, f6Var);
            this.f = r42;
            int i11 = org.telegram.ui.ActionBar.j6.M6;
            int i12 = org.telegram.ui.ActionBar.j6.N6;
            int i13 = org.telegram.ui.ActionBar.j6.d6;
            r42.d(i11, i12, i13, i13);
            addView(this.f, k7.b6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.H == null) {
            org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(30.0f), this);
            this.H = j5Var;
            if (this.C) {
                j5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new eh.f(imageReceiver, 1));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.H.g(new dg.k1(imageReceiver, 4), true);
        invalidate();
    }

    public int c(int i10) {
        return i10;
    }
}
