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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.f10;
import org.telegram.ui.jp0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class s8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public float J;
    public org.telegram.ui.Components.n5 K;
    public int L;
    public CharSequence M;
    public Paint N;
    public boolean O;
    public int P;
    public final org.telegram.ui.ActionBar.l5 a;
    public final org.telegram.ui.ActionBar.l5 b;
    public final org.telegram.ui.Components.o6 c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final kj0 e;
    public Switch f;
    public final ImageView h;
    public int n;
    public boolean r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public boolean y;

    public s8(Context context) {
        this(23, context, null, false, false);
    }

    public static SpannableStringBuilder a(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        f10 f10Var = new f10();
        f10Var.f = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false);
        spannableStringBuilder.setSpan(f10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final boolean b() {
        Switch r02 = this.f;
        return r02 != null && r02.h;
    }

    public final void d(int i10, int i11, int i12) {
        this.s = 52;
        kj0 kj0Var = this.e;
        kj0Var.setVisibility(0);
        kj0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        kj0Var.setTranslationX(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : -3.0f));
        kj0Var.setImageResource(i12);
        kj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.f6 f6Var = this.E;
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        zb0 zb0Var = new zb0(1);
        zb0Var.b(i10, i11);
        zb0Var.b = a2;
        kj0Var.setBackground(zb0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.H || this.J != 0.0f) {
            if (this.N == null) {
                Paint paint = new Paint(1);
                this.N = paint;
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.O5, this.E));
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
        org.telegram.ui.Components.n5 n5Var = this.K;
        this.c.setAlpha(f15 * (n5Var == null ? 1.0f : 1.0f - n5Var.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f16 = 1.0f - this.J;
        org.telegram.ui.Components.n5 n5Var2 = this.K;
        this.d.setAlpha(f16 * (n5Var2 == null ? 1.0f : 1.0f - n5Var2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.n5 n5Var3 = this.K;
        if (n5Var3 != null) {
            n5Var3.setBounds((getWidth() - this.K.s) - AndroidUtilities.dp(18.0f), (getHeight() - this.K.s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.K.s) / 2);
            this.K.draw(canvas);
        }
    }

    public final void e(int i10, int i11) {
        org.telegram.ui.ActionBar.f6 f6Var = this.E;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.setTextColor(v02);
        l5Var.setTag(Integer.valueOf(i11));
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN);
            kj0 kj0Var = this.e;
            kj0Var.setColorFilter(porterDuffColorFilter);
            kj0Var.setTag(Integer.valueOf(i10));
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

    public kj0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.l5 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.o6 getValueTextView() {
        return this.c;
    }

    public final void h(int i10) {
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        if (i10 <= 0) {
            l5Var.i(null);
        } else {
            l5Var.i(new jp0(i10, getContext(), this.E, false));
            l5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        }
    }

    public final void i(CharSequence charSequence, boolean z10) {
        this.w = 16;
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.l(charSequence, false);
        l5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.c(null, false, true);
        this.e.setVisibility(8);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void j(CharSequence charSequence, boolean z10, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.l(charSequence, false);
        l5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        Switch r62 = this.f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f.c(z10, false);
        }
        setWillNotDraw(!this.r);
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void k(String str, boolean z10, int i10, int i11, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.l(str, false);
        l5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        d(i11, i11, i10);
        if (this.f == null) {
            Switch r13 = new Switch(getContext(), this.E);
            this.f = r13;
            int i12 = org.telegram.ui.ActionBar.j6.M6;
            int i13 = org.telegram.ui.ActionBar.j6.N6;
            int i14 = org.telegram.ui.ActionBar.j6.d6;
            r13.d(i12, i13, i14, i14);
            addView(this.f, w7.a6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r132 = this.f;
        if (r132 != null) {
            r132.setVisibility(0);
            this.f.c(z10, false);
        }
        this.r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void l(int i10, String str, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.l(str, false);
        l5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r02 = this.f;
        if (r02 != null) {
            r02.setVisibility(0);
            this.f.c(z10, false);
        }
        kj0 kj0Var = this.e;
        kj0Var.setVisibility(0);
        kj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        kj0Var.setImageResource(i10);
        this.r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void m(int i10, CharSequence charSequence, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.l(charSequence, false);
        l5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.c(null, false, true);
        kj0 kj0Var = this.e;
        kj0Var.setImageResource(i10);
        kj0Var.setVisibility(0);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        kj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void n(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.s = 58;
        this.w = 18;
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.l(charSequence, false);
        l5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.c(null, false, true);
        kj0 kj0Var = this.e;
        kj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof hj0) {
            kj0Var.setAnimation((hj0) drawable);
        } else {
            kj0Var.setImageDrawable(drawable);
        }
        kj0Var.setVisibility(0);
        o6Var.setVisibility(8);
        this.h.setVisibility(8);
        kj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void o(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.l(charSequence, false);
        l5Var.i(null);
        this.M = charSequence2;
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
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var != null) {
            n5Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var != null) {
            n5Var.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f7;
        float dp;
        int i10;
        if (this.r) {
            org.telegram.ui.ActionBar.f6 f6Var = this.E;
            Paint F = f6Var != null ? f6Var.F("paintDivider") : null;
            if (F == null) {
                F = org.telegram.ui.ActionBar.j6.k0;
            }
            Paint paint = F;
            boolean z10 = LocaleController.isRTL;
            float f10 = 20.0f;
            kj0 kj0Var = this.e;
            if (z10) {
                dp = 0.0f;
            } else {
                if (kj0Var.getVisibility() == 0) {
                    f7 = this.x ? 72 : 58;
                } else {
                    f7 = 20.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (kj0Var.getVisibility() == 0) {
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
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        CharSequence text = l5Var.getText();
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
            sb2.append(l5Var.getText());
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
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        int textHeight = l5Var.getTextHeight();
        org.telegram.ui.Components.o6 o6Var = this.c;
        int max = ((i14 - Math.max(textHeight, o6Var.getTextHeight())) / 2) + 1;
        int dp2 = LocaleController.isRTL ? AndroidUtilities.dp(this.n - 6) : (i15 - o6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n - 6);
        if (this.y && !LocaleController.isRTL) {
            dp2 = (i15 - o6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n);
        }
        o6Var.layout(dp2, max, o6Var.getMeasuredWidth() + dp2, o6Var.getMeasuredHeight() + max);
        int dp3 = LocaleController.isRTL ? AndroidUtilities.dp(this.n - 6) : (i15 - l5Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n - 6);
        l5Var.layout(dp3, max, l5Var.getMeasuredWidth() + dp3, l5Var.getMeasuredHeight() + max);
        boolean z11 = LocaleController.isRTL;
        kj0 kj0Var = this.e;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.a;
        if (z11) {
            dp = (getMeasuredWidth() - l5Var2.getMeasuredWidth()) - AndroidUtilities.dp(kj0Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            dp = AndroidUtilities.dp(kj0Var.getVisibility() == 0 ? this.s : this.n);
        }
        org.telegram.ui.ActionBar.l5 l5Var3 = this.b;
        if (l5Var3.getVisibility() == 0) {
            float f7 = this.v > 50 ? 4 : 2;
            int dp4 = AndroidUtilities.dp(1.0f) + em.y(f7, (i14 - l5Var2.getTextHeight()) - l5Var3.getTextHeight(), 2);
            l5Var2.layout(dp, dp4, l5Var2.getMeasuredWidth() + dp, l5Var2.getMeasuredHeight() + dp4);
            int dp5 = AndroidUtilities.dp(f7) + l5Var2.getTextHeight() + dp4;
            l5Var3.layout(dp, dp5, l5Var3.getMeasuredWidth() + dp, l5Var3.getMeasuredHeight() + dp5);
        } else {
            int dp6 = AndroidUtilities.dp(1.0f) + ((i14 - l5Var2.getTextHeight()) / 2);
            l5Var2.layout(dp, dp6, l5Var2.getMeasuredWidth() + dp, l5Var2.getMeasuredHeight() + dp6);
        }
        if (kj0Var.getVisibility() == 0) {
            int dp7 = AndroidUtilities.dp(1.0f) + ((((i14 - kj0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(this.v > 50 ? 0.0f : 2.0f)) - kj0Var.getPaddingTop());
            int dp8 = !LocaleController.isRTL ? AndroidUtilities.dp(this.w) : (i15 - kj0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.w);
            kj0Var.layout(dp8, dp7, kj0Var.getMeasuredWidth() + dp8, kj0Var.getMeasuredHeight() + dp7);
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
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (i12 != 0 && i12 != size && (charSequence = this.M) != null) {
            o6Var.c(TextUtils.ellipsize(charSequence, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.L = size;
        boolean z10 = this.y;
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.d;
        org.telegram.ui.ActionBar.l5 l5Var3 = this.a;
        if (z10) {
            l5Var3.measure(em.d(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            l5Var.measure(em.d(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            o6Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 103)) - l5Var3.getTextWidth(), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            l5Var2.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 103)) - l5Var3.getTextWidth(), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        } else {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.n), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            l5Var2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.n), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            int max = Math.max(o6Var.d(), l5Var2.getTextWidth());
            l5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            l5Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        }
        kj0 kj0Var = this.e;
        if (kj0Var.getVisibility() == 0) {
            kj0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
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
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.l(str, false);
        l5Var.i(null);
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.M = str2;
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
        org.telegram.ui.Components.n5 n5Var = this.K;
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
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.l(charSequence, false);
        l5Var.i(null);
        this.M = charSequence2;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.c(charSequence2, false, true);
        kj0 kj0Var = this.e;
        kj0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof hj0) {
            kj0Var.setAnimation((hj0) drawable);
        } else {
            kj0Var.setImageDrawable(drawable);
        }
        kj0Var.setVisibility(0);
        o6Var.setVisibility(0);
        this.h.setVisibility(8);
        kj0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.n5 n5Var = this.K;
        if (n5Var != null) {
            n5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.l(charSequence, false);
        l5Var.i(null);
        kj0 kj0Var = this.e;
        kj0Var.setVisibility(0);
        org.telegram.ui.Components.o6 o6Var = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((bi.x4.g(charSequence, l5Var.getTextPaint()) + AndroidUtilities.dp(this.s)) + AndroidUtilities.dp(16.0f)));
            this.M = charSequence2;
            o6Var.c(TextUtils.ellipsize(charSequence2, o6Var.getPaint(), max, TextUtils.TruncateAt.END), z10, true);
        } else {
            o6Var.c("", z10, true);
        }
        o6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        kj0Var.setTranslationX(0.0f);
        kj0Var.setTranslationY(0.0f);
        kj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        kj0Var.setImageResource(i10);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.K;
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
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        if (isEmpty) {
            l5Var.setVisibility(8);
        } else {
            l5Var.setVisibility(0);
            l5Var.l(charSequence, false);
        }
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.K == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(30.0f), this);
            this.K = n5Var;
            if (this.F) {
                n5Var.a();
            }
        }
        this.K.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.l(charSequence, false);
        l5Var.i(null);
        this.M = null;
        org.telegram.ui.Components.o6 o6Var = this.c;
        o6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        o6Var.setVisibility(8);
        this.d.setVisibility(8);
        kj0 kj0Var = this.e;
        kj0Var.setVisibility(8);
        kj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.n5 n5Var = this.K;
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
            this.M = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, o6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        o6Var.c(ellipsize, z10, true);
    }

    public final void v() {
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        int intValue = l5Var.getTag() instanceof Integer ? ((Integer) l5Var.getTag()).intValue() : org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.E;
        int v02 = org.telegram.ui.ActionBar.j6.v0(intValue, f6Var);
        if (intValue != org.telegram.ui.ActionBar.j6.j5 && intValue != org.telegram.ui.ActionBar.j6.G6) {
            v02 = c(v02);
        }
        l5Var.setTextColor(v02);
        kj0 kj0Var = this.e;
        if (kj0Var.getTag() instanceof Integer) {
            int intValue2 = ((Integer) kj0Var.getTag()).intValue();
            int v03 = org.telegram.ui.ActionBar.j6.v0(intValue2, f6Var);
            if (intValue2 != org.telegram.ui.ActionBar.j6.J5 && intValue2 != org.telegram.ui.ActionBar.j6.m6) {
                v03 = c(v03);
            }
            kj0Var.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
        }
        this.b.setTextColor(c(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var)));
        int i10 = org.telegram.ui.ActionBar.j6.I6;
        this.c.setTextColor(c(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
        this.d.setTextColor(c(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
    }

    public s8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(23, context, f6Var, false, false);
    }

    public s8(int i10, Context context, boolean z10) {
        this(i10, context, null, z10, false);
    }

    public s8(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        this.s = 58;
        this.v = 50;
        this.w = 16;
        this.E = f6Var;
        this.n = i10;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.a = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.j5 : org.telegram.ui.ActionBar.j6.G6, f6Var));
        l5Var.setTextSize(16);
        l5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        l5Var.setImportantForAccessibility(2);
        addView(l5Var, w7.a6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.b = l5Var2;
        l5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.p5 : org.telegram.ui.ActionBar.j6.y6, f6Var));
        l5Var2.setTextSize(13);
        l5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        l5Var2.setImportantForAccessibility(2);
        addView(l5Var2, w7.a6.c(-1.0f, -2));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.c = o6Var;
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.n5 : org.telegram.ui.ActionBar.j6.I6, f6Var));
        o6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        o6Var.setTextSize(AndroidUtilities.dp(16.0f));
        o6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        o6Var.setImportantForAccessibility(2);
        o6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(o6Var);
        org.telegram.ui.ActionBar.l5 l5Var3 = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var3;
        Boolean bool = Boolean.FALSE;
        if (!l5Var3.P) {
            l5Var3.n0 = true;
            l5Var3.p0 = bool;
            l5Var3.m();
            l5Var3.b();
        }
        l5Var3.q0 = 18;
        l5Var3.m();
        l5Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.n5 : org.telegram.ui.ActionBar.j6.I6, f6Var));
        l5Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        l5Var3.setTextSize(16);
        l5Var3.setImportantForAccessibility(2);
        l5Var3.setVisibility(8);
        addView(l5Var3);
        kj0 kj0Var = new kj0(context);
        this.e = kj0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        kj0Var.setScaleType(scaleType);
        kj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.J5 : org.telegram.ui.ActionBar.j6.m6, f6Var), PorterDuff.Mode.SRC_IN));
        addView(kj0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z11) {
            Switch r42 = new Switch(context, f6Var);
            this.f = r42;
            int i11 = org.telegram.ui.ActionBar.j6.M6;
            int i12 = org.telegram.ui.ActionBar.j6.N6;
            int i13 = org.telegram.ui.ActionBar.j6.d6;
            r42.d(i11, i12, i13, i13);
            addView(this.f, w7.a6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.K == null) {
            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(30.0f), this);
            this.K = n5Var;
            if (this.F) {
                n5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new r8(imageReceiver, 0));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.K.g(new bi.w4(imageReceiver, 4), true);
        invalidate();
    }

    public int c(int i10) {
        return i10;
    }
}
