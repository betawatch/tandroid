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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.ko0;
import org.telegram.ui.n00;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class m8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 A;
    public boolean B;
    public int C;
    public boolean D;
    public float E;
    public float F;
    public org.telegram.ui.Components.n5 G;
    public int H;
    public CharSequence I;
    public Paint J;
    public boolean K;
    public int L;
    public final org.telegram.ui.ActionBar.h5 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final org.telegram.ui.Components.o6 c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final aj0 e;
    public Switch f;
    public final ImageView h;
    public int n;
    public boolean r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public boolean y;

    public m8(Context context) {
        this(23, context, null, false, false);
    }

    public static SpannableStringBuilder a(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        n00 n00Var = new n00();
        n00Var.f = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false);
        spannableStringBuilder.setSpan(n00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final boolean b() {
        Switch r02 = this.f;
        return r02 != null && r02.h;
    }

    public final void d(int i10, int i11, int i12) {
        this.s = 52;
        aj0 aj0Var = this.e;
        aj0Var.setVisibility(0);
        aj0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        aj0Var.setTranslationX(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : -3.0f));
        aj0Var.setImageResource(i12);
        aj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.c6 c6Var = this.A;
        boolean a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
        mb0 mb0Var = new mb0(1);
        mb0Var.b(i10, i11);
        mb0Var.b = a2;
        aj0Var.setBackground(mb0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.D || this.F != 0.0f) {
            if (this.J == null) {
                Paint paint = new Paint(1);
                this.J = paint;
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.O5, this.A));
            }
            if (this.K) {
                float f9 = this.E + 0.016f;
                this.E = f9;
                if (f9 > 1.0f) {
                    this.E = 1.0f;
                    this.K = false;
                }
            } else {
                float f10 = this.E - 0.016f;
                this.E = f10;
                if (f10 < 0.0f) {
                    this.E = 0.0f;
                    this.K = true;
                }
            }
            int i10 = this.L;
            if (i10 > 0) {
                this.L = i10 - 15;
            } else {
                boolean z10 = this.D;
                if (z10) {
                    float f11 = this.F;
                    if (f11 != 1.0f) {
                        float f12 = f11 + 0.10666667f;
                        this.F = f12;
                        if (f12 > 1.0f) {
                            this.F = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f13 = this.F;
                    if (f13 != 0.0f) {
                        float f14 = f13 - 0.10666667f;
                        this.F = f14;
                        if (f14 < 0.0f) {
                            this.F = 0.0f;
                        }
                    }
                }
            }
            this.J.setAlpha((int) (((this.E * 0.4f) + 0.6f) * this.F * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(21.0f)) - AndroidUtilities.dp(this.C), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.J);
            invalidate();
        }
        float f15 = 1.0f - this.F;
        org.telegram.ui.Components.n5 n5Var = this.G;
        this.c.setAlpha(f15 * (n5Var == null ? 1.0f : 1.0f - n5Var.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f16 = 1.0f - this.F;
        org.telegram.ui.Components.n5 n5Var2 = this.G;
        this.d.setAlpha(f16 * (n5Var2 == null ? 1.0f : 1.0f - n5Var2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.n5 n5Var3 = this.G;
        if (n5Var3 != null) {
            n5Var3.setBounds((getWidth() - this.G.s) - AndroidUtilities.dp(18.0f), (getHeight() - this.G.s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.G.s) / 2);
            this.G.draw(canvas);
        }
    }

    public final void e(int i10, int i11) {
        org.telegram.ui.ActionBar.c6 c6Var = this.A;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.setTextColor(v02);
        h5Var.setTag(Integer.valueOf(i11));
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN);
            aj0 aj0Var = this.e;
            aj0Var.setColorFilter(porterDuffColorFilter);
            aj0Var.setTag(Integer.valueOf(i10));
        }
        v();
    }

    public final void f(int i10, boolean z10, boolean z11) {
        this.D = z10;
        this.C = i10;
        if (!z11) {
            this.F = z10 ? 1.0f : 0.0f;
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

    public aj0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.h5 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.o6 getValueTextView() {
        return this.c;
    }

    public final void h(int i10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        if (i10 <= 0) {
            h5Var.i(null);
        } else {
            h5Var.i(new ko0(i10, getContext(), this.A, false));
            h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        }
    }

    public final void i(CharSequence charSequence, boolean z10) {
        this.w = 16;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.c(null, false, true);
        this.e.setVisibility(8);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void j(CharSequence charSequence, boolean z10, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        Switch r6 = this.f;
        if (r6 != null) {
            r6.setVisibility(0);
            this.f.c(z10, false);
        }
        setWillNotDraw(!this.r);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void k(String str, boolean z10, int i10, int i11, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(str, false);
        h5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        d(i11, i11, i10);
        if (this.f == null) {
            Switch r13 = new Switch(getContext(), this.A);
            this.f = r13;
            int i12 = org.telegram.ui.ActionBar.g6.M6;
            int i13 = org.telegram.ui.ActionBar.g6.N6;
            int i14 = org.telegram.ui.ActionBar.g6.d6;
            r13.d(i12, i13, i14, i14);
            addView(this.f, i7.f6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r132 = this.f;
        if (r132 != null) {
            r132.setVisibility(0);
            this.f.c(z10, false);
        }
        this.r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void l(int i10, String str, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(str, false);
        h5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r02 = this.f;
        if (r02 != null) {
            r02.setVisibility(0);
            this.f.c(z10, false);
        }
        aj0 aj0Var = this.e;
        aj0Var.setVisibility(0);
        aj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        aj0Var.setImageResource(i10);
        this.r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void m(int i10, CharSequence charSequence, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.c(null, false, true);
        aj0 aj0Var = this.e;
        aj0Var.setImageResource(i10);
        aj0Var.setVisibility(0);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        aj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void n(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.s = 58;
        this.w = 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.c(null, false, true);
        aj0 aj0Var = this.e;
        aj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof xi0) {
            aj0Var.setAnimation((xi0) drawable);
        } else {
            aj0Var.setImageDrawable(drawable);
        }
        aj0Var.setVisibility(0);
        o6Var.setVisibility(8);
        this.h.setVisibility(8);
        aj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void o(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = charSequence2;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), z10, true);
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B = true;
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B = false;
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f9;
        float dp;
        int i10;
        if (this.r) {
            org.telegram.ui.ActionBar.c6 c6Var = this.A;
            Paint G = c6Var != null ? c6Var.G("paintDivider") : null;
            if (G == null) {
                G = org.telegram.ui.ActionBar.g6.k0;
            }
            Paint paint = G;
            boolean z10 = LocaleController.isRTL;
            float f10 = 20.0f;
            aj0 aj0Var = this.e;
            if (z10) {
                dp = 0.0f;
            } else {
                if (aj0Var.getVisibility() == 0) {
                    f9 = this.x ? 72 : 58;
                } else {
                    f9 = 20.0f;
                }
                dp = AndroidUtilities.dp(f9);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (aj0Var.getVisibility() == 0) {
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
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        CharSequence text = h5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (!isEmpty) {
            CharSequence text2 = o6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(h5Var.getText());
            if (!TextUtils.isEmpty(o6Var.getText())) {
                sb2.append('\n');
                sb2.append(o6Var.getText());
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
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        int textHeight = h5Var.getTextHeight();
        org.telegram.ui.Components.o6 o6Var = this.c;
        int max = ((i14 - Math.max(textHeight, o6Var.getTextHeight())) / 2) + 1;
        int dp2 = LocaleController.isRTL ? AndroidUtilities.dp(this.n - 6) : (i15 - o6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n - 6);
        if (this.y && !LocaleController.isRTL) {
            dp2 = (i15 - o6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n);
        }
        o6Var.layout(dp2, max, o6Var.getMeasuredWidth() + dp2, o6Var.getMeasuredHeight() + max);
        int dp3 = LocaleController.isRTL ? AndroidUtilities.dp(this.n - 6) : (i15 - h5Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n - 6);
        h5Var.layout(dp3, max, h5Var.getMeasuredWidth() + dp3, h5Var.getMeasuredHeight() + max);
        boolean z11 = LocaleController.isRTL;
        aj0 aj0Var = this.e;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.a;
        if (z11) {
            dp = (getMeasuredWidth() - h5Var2.getMeasuredWidth()) - AndroidUtilities.dp(aj0Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            dp = AndroidUtilities.dp(aj0Var.getVisibility() == 0 ? this.s : this.n);
        }
        org.telegram.ui.ActionBar.h5 h5Var3 = this.b;
        if (h5Var3.getVisibility() == 0) {
            float f9 = this.v > 50 ? 4 : 2;
            int dp4 = AndroidUtilities.dp(1.0f) + org.telegram.ui.b.x(f9, (i14 - h5Var2.getTextHeight()) - h5Var3.getTextHeight(), 2);
            h5Var2.layout(dp, dp4, h5Var2.getMeasuredWidth() + dp, h5Var2.getMeasuredHeight() + dp4);
            int dp5 = AndroidUtilities.dp(f9) + h5Var2.getTextHeight() + dp4;
            h5Var3.layout(dp, dp5, h5Var3.getMeasuredWidth() + dp, h5Var3.getMeasuredHeight() + dp5);
        } else {
            int dp6 = AndroidUtilities.dp(1.0f) + ((i14 - h5Var2.getTextHeight()) / 2);
            h5Var2.layout(dp, dp6, h5Var2.getMeasuredWidth() + dp, h5Var2.getMeasuredHeight() + dp6);
        }
        if (aj0Var.getVisibility() == 0) {
            int dp7 = AndroidUtilities.dp(1.0f) + ((((i14 - aj0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(this.v > 50 ? 0.0f : 2.0f)) - aj0Var.getPaddingTop());
            int dp8 = !LocaleController.isRTL ? AndroidUtilities.dp(this.w) : (i15 - aj0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.w);
            aj0Var.layout(dp8, dp7, aj0Var.getMeasuredWidth() + dp8, aj0Var.getMeasuredHeight() + dp7);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int dp9 = AndroidUtilities.dp(1.0f) + ((i14 - imageView.getMeasuredHeight()) / 2);
            int dp10 = LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : (i15 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            imageView.layout(dp10, dp9, imageView.getMeasuredWidth() + dp10, imageView.getMeasuredHeight() + dp9);
        }
        Switch r9 = this.f;
        if (r9 == null || r9.getVisibility() != 0) {
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
        int i12 = this.H;
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (i12 != 0 && i12 != size && (charSequence = this.I) != null) {
            o6Var.c(TextUtils.ellipsize(charSequence, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.H = size;
        boolean z10 = this.y;
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.d;
        org.telegram.ui.ActionBar.h5 h5Var3 = this.a;
        if (z10) {
            h5Var3.measure(org.telegram.ui.b.d(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            h5Var.measure(org.telegram.ui.b.d(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            o6Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 103)) - h5Var3.getTextWidth(), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            h5Var2.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 103)) - h5Var3.getTextWidth(), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        } else {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.n), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            h5Var2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.n), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            int max = Math.max(o6Var.d(), h5Var2.getTextWidth());
            h5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            h5Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        }
        aj0 aj0Var = this.e;
        if (aj0Var.getVisibility() == 0) {
            aj0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
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
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(str, false);
        h5Var.i(null);
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.I = str2;
            ellipsize = TextUtils.ellipsize(str2, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        o6Var.c(ellipsize, z10, true);
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        d(i11, i12, i10);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10) {
        s(charSequence, charSequence2, false, i10, z10);
    }

    public final void r(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.s = 58;
        this.w = 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = charSequence2;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.c(charSequence2, false, true);
        aj0 aj0Var = this.e;
        aj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof xi0) {
            aj0Var.setAnimation((xi0) drawable);
        } else {
            aj0Var.setImageDrawable(drawable);
        }
        aj0Var.setVisibility(0);
        o6Var.setVisibility(0);
        this.h.setVisibility(8);
        aj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        aj0 aj0Var = this.e;
        aj0Var.setVisibility(0);
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((nh.t3.g(charSequence, h5Var.getTextPaint()) + AndroidUtilities.dp(this.s)) + AndroidUtilities.dp(16.0f)));
            this.I = charSequence2;
            o6Var.c(TextUtils.ellipsize(charSequence2, o6Var.getPaint(), max, TextUtils.TruncateAt.END), z10, true);
        } else {
            o6Var.c("", z10, true);
        }
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        aj0Var.setTranslationX(0.0f);
        aj0Var.setTranslationY(0.0f);
        aj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        aj0Var.setImageResource(i10);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r9 = this.f;
        if (r9 != null) {
            r9.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
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
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        if (isEmpty) {
            h5Var.setVisibility(8);
        } else {
            h5Var.setVisibility(0);
            h5Var.l(charSequence, false);
        }
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.G == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(30.0f), this);
            this.G = n5Var;
            if (this.B) {
                n5Var.a();
            }
        }
        this.G.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        aj0 aj0Var = this.e;
        aj0Var.setVisibility(8);
        aj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.G;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.I = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        o6Var.c(ellipsize, z10, true);
    }

    public final void v() {
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        int intValue = h5Var.getTag() instanceof Integer ? ((Integer) h5Var.getTag()).intValue() : org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.A;
        int v02 = org.telegram.ui.ActionBar.g6.v0(intValue, c6Var);
        if (intValue != org.telegram.ui.ActionBar.g6.j5 && intValue != org.telegram.ui.ActionBar.g6.G6) {
            v02 = c(v02);
        }
        h5Var.setTextColor(v02);
        aj0 aj0Var = this.e;
        if (aj0Var.getTag() instanceof Integer) {
            int intValue2 = ((Integer) aj0Var.getTag()).intValue();
            int v03 = org.telegram.ui.ActionBar.g6.v0(intValue2, c6Var);
            if (intValue2 != org.telegram.ui.ActionBar.g6.J5 && intValue2 != org.telegram.ui.ActionBar.g6.m6) {
                v03 = c(v03);
            }
            aj0Var.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
        }
        this.b.setTextColor(c(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var)));
        int i10 = org.telegram.ui.ActionBar.g6.I6;
        this.c.setTextColor(c(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
        this.d.setTextColor(c(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
    }

    public m8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(23, context, c6Var, false, false);
    }

    public m8(int i10, Context context, boolean z10) {
        this(i10, context, null, z10, false);
    }

    public m8(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.s = 58;
        this.v = 50;
        this.w = 16;
        this.A = c6Var;
        this.n = i10;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.a = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.j5 : org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setTextSize(16);
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var.setImportantForAccessibility(2);
        addView(h5Var, i7.f6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var2;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.p5 : org.telegram.ui.ActionBar.g6.y6, c6Var));
        h5Var2.setTextSize(13);
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var2.setImportantForAccessibility(2);
        addView(h5Var2, i7.f6.c(-1.0f, -2));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.c = o6Var;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.n5 : org.telegram.ui.ActionBar.g6.I6, c6Var));
        o6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        o6Var.setTextSize(AndroidUtilities.dp(16.0f));
        o6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        o6Var.setImportantForAccessibility(2);
        o6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(o6Var);
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var3;
        Boolean bool = Boolean.FALSE;
        if (!h5Var3.L) {
            h5Var3.j0 = true;
            h5Var3.l0 = bool;
            h5Var3.m();
            h5Var3.b();
        }
        h5Var3.m0 = 18;
        h5Var3.m();
        h5Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.n5 : org.telegram.ui.ActionBar.g6.I6, c6Var));
        h5Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        h5Var3.setTextSize(16);
        h5Var3.setImportantForAccessibility(2);
        h5Var3.setVisibility(8);
        addView(h5Var3);
        aj0 aj0Var = new aj0(context);
        this.e = aj0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        aj0Var.setScaleType(scaleType);
        aj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.J5 : org.telegram.ui.ActionBar.g6.m6, c6Var), PorterDuff.Mode.SRC_IN));
        addView(aj0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z11) {
            Switch r42 = new Switch(context, c6Var);
            this.f = r42;
            int i11 = org.telegram.ui.ActionBar.g6.M6;
            int i12 = org.telegram.ui.ActionBar.g6.N6;
            int i13 = org.telegram.ui.ActionBar.g6.d6;
            r42.d(i11, i12, i13, i13);
            addView(this.f, i7.f6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.G == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(30.0f), this);
            this.G = n5Var;
            if (this.B) {
                n5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new ch.f(imageReceiver, 1));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.G.g(new bg.m1(imageReceiver, 5), true);
        invalidate();
    }

    public int c(int i10) {
        return i10;
    }
}
