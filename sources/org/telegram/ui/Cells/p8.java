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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.l00;
import org.telegram.ui.lo0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class p8 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 A;
    public boolean B;
    public int C;
    public boolean D;
    public float E;
    public float F;
    public org.telegram.ui.Components.i5 G;
    public int H;
    public CharSequence I;
    public Paint J;
    public boolean K;
    public int L;
    public final org.telegram.ui.ActionBar.h5 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final org.telegram.ui.Components.j6 c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final pi0 e;
    public Switch f;
    public final ImageView h;
    public int n;
    public boolean r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public boolean y;

    public p8(Context context) {
        this(23, context, null, false, false);
    }

    public static SpannableStringBuilder a(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        l00 l00Var = new l00();
        l00Var.f = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lj, false);
        spannableStringBuilder.setSpan(l00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final boolean b() {
        Switch r02 = this.f;
        return r02 != null && r02.h;
    }

    public final void d(int i9, int i10, int i11) {
        this.s = 52;
        pi0 pi0Var = this.e;
        pi0Var.setVisibility(0);
        pi0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        pi0Var.setTranslationX(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : -3.0f));
        pi0Var.setImageResource(i11);
        pi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.b6 b6Var = this.A;
        boolean a2 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
        xa0 xa0Var = new xa0(1);
        xa0Var.b(i9, i10);
        xa0Var.b = a2;
        pi0Var.setBackground(xa0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.D || this.F != 0.0f) {
            if (this.J == null) {
                Paint paint = new Paint(1);
                this.J = paint;
                paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.O5, this.A));
            }
            if (this.K) {
                float f10 = this.E + 0.016f;
                this.E = f10;
                if (f10 > 1.0f) {
                    this.E = 1.0f;
                    this.K = false;
                }
            } else {
                float f11 = this.E - 0.016f;
                this.E = f11;
                if (f11 < 0.0f) {
                    this.E = 0.0f;
                    this.K = true;
                }
            }
            int i9 = this.L;
            if (i9 > 0) {
                this.L = i9 - 15;
            } else {
                boolean z10 = this.D;
                if (z10) {
                    float f12 = this.F;
                    if (f12 != 1.0f) {
                        float f13 = f12 + 0.10666667f;
                        this.F = f13;
                        if (f13 > 1.0f) {
                            this.F = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f14 = this.F;
                    if (f14 != 0.0f) {
                        float f15 = f14 - 0.10666667f;
                        this.F = f15;
                        if (f15 < 0.0f) {
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
        float f16 = 1.0f - this.F;
        org.telegram.ui.Components.i5 i5Var = this.G;
        this.c.setAlpha(f16 * (i5Var == null ? 1.0f : 1.0f - i5Var.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f17 = 1.0f - this.F;
        org.telegram.ui.Components.i5 i5Var2 = this.G;
        this.d.setAlpha(f17 * (i5Var2 == null ? 1.0f : 1.0f - i5Var2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.i5 i5Var3 = this.G;
        if (i5Var3 != null) {
            i5Var3.setBounds((getWidth() - this.G.s) - AndroidUtilities.dp(18.0f), (getHeight() - this.G.s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.G.s) / 2);
            this.G.draw(canvas);
        }
    }

    public final void e(int i9, int i10) {
        org.telegram.ui.ActionBar.b6 b6Var = this.A;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.setTextColor(v02);
        h5Var.setTag(Integer.valueOf(i10));
        if (i9 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN);
            pi0 pi0Var = this.e;
            pi0Var.setColorFilter(porterDuffColorFilter);
            pi0Var.setTag(Integer.valueOf(i9));
        }
        v();
    }

    public final void f(int i9, boolean z10, boolean z11) {
        this.D = z10;
        this.C = i9;
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

    public pi0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.h5 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.j6 getValueTextView() {
        return this.c;
    }

    public final void h(int i9) {
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        if (i9 <= 0) {
            h5Var.i(null);
        } else {
            h5Var.i(new lo0(i9, getContext(), this.A, false));
            h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        }
    }

    public final void i(CharSequence charSequence, boolean z10) {
        this.w = 16;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.j6 j6Var = this.c;
        j6Var.c(null, false, true);
        this.e.setVisibility(8);
        j6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
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
        Switch r62 = this.f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f.c(z10, false);
        }
        setWillNotDraw(!this.r);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void k(String str, boolean z10, int i9, int i10, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(str, false);
        h5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        d(i10, i10, i9);
        if (this.f == null) {
            Switch r13 = new Switch(getContext(), this.A);
            this.f = r13;
            int i11 = org.telegram.ui.ActionBar.f6.M6;
            int i12 = org.telegram.ui.ActionBar.f6.N6;
            int i13 = org.telegram.ui.ActionBar.f6.d6;
            r13.d(i11, i12, i13, i13);
            addView(this.f, g7.e6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r132 = this.f;
        if (r132 != null) {
            r132.setVisibility(0);
            this.f.c(z10, false);
        }
        this.r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void l(int i9, String str, boolean z10) {
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
        pi0 pi0Var = this.e;
        pi0Var.setVisibility(0);
        pi0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        pi0Var.setImageResource(i9);
        this.r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void m(int i9, CharSequence charSequence, boolean z10) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.j6 j6Var = this.c;
        j6Var.c(null, false, true);
        pi0 pi0Var = this.e;
        pi0Var.setImageResource(i9);
        pi0Var.setVisibility(0);
        j6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        pi0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void n(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.s = 58;
        this.w = 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = null;
        org.telegram.ui.Components.j6 j6Var = this.c;
        j6Var.c(null, false, true);
        pi0 pi0Var = this.e;
        pi0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof mi0) {
            pi0Var.setAnimation((mi0) drawable);
        } else {
            pi0Var.setImageDrawable(drawable);
        }
        pi0Var.setVisibility(0);
        j6Var.setVisibility(8);
        this.h.setVisibility(8);
        pi0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void o(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = charSequence2;
        org.telegram.ui.Components.j6 j6Var = this.c;
        j6Var.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, j6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), z10, true);
        j6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B = true;
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B = false;
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10;
        float dp;
        int i9;
        if (this.r) {
            org.telegram.ui.ActionBar.b6 b6Var = this.A;
            Paint O = b6Var != null ? b6Var.O("paintDivider") : null;
            if (O == null) {
                O = org.telegram.ui.ActionBar.f6.k0;
            }
            Paint paint = O;
            boolean z10 = LocaleController.isRTL;
            float f11 = 20.0f;
            pi0 pi0Var = this.e;
            if (z10) {
                dp = 0.0f;
            } else {
                if (pi0Var.getVisibility() == 0) {
                    f10 = this.x ? 72 : 58;
                } else {
                    f10 = 20.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (pi0Var.getVisibility() == 0) {
                    f11 = this.x ? 72 : 58;
                }
                i9 = AndroidUtilities.dp(f11);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        CharSequence text = h5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (!isEmpty) {
            CharSequence text2 = j6Var.getText();
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
            if (!TextUtils.isEmpty(j6Var.getText())) {
                sb2.append('\n');
                sb2.append(j6Var.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int dp;
        int i13 = i12 - i10;
        int i14 = i11 - i9;
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        int textHeight = h5Var.getTextHeight();
        org.telegram.ui.Components.j6 j6Var = this.c;
        int max = ((i13 - Math.max(textHeight, j6Var.getTextHeight())) / 2) + 1;
        int dp2 = LocaleController.isRTL ? AndroidUtilities.dp(this.n - 6) : (i14 - j6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n - 6);
        if (this.y && !LocaleController.isRTL) {
            dp2 = (i14 - j6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n);
        }
        j6Var.layout(dp2, max, j6Var.getMeasuredWidth() + dp2, j6Var.getMeasuredHeight() + max);
        int dp3 = LocaleController.isRTL ? AndroidUtilities.dp(this.n - 6) : (i14 - h5Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n - 6);
        h5Var.layout(dp3, max, h5Var.getMeasuredWidth() + dp3, h5Var.getMeasuredHeight() + max);
        boolean z11 = LocaleController.isRTL;
        pi0 pi0Var = this.e;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.a;
        if (z11) {
            dp = (getMeasuredWidth() - h5Var2.getMeasuredWidth()) - AndroidUtilities.dp(pi0Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            dp = AndroidUtilities.dp(pi0Var.getVisibility() == 0 ? this.s : this.n);
        }
        org.telegram.ui.ActionBar.h5 h5Var3 = this.b;
        if (h5Var3.getVisibility() == 0) {
            float f10 = this.v > 50 ? 4 : 2;
            int dp4 = AndroidUtilities.dp(1.0f) + ll.y(f10, (i13 - h5Var2.getTextHeight()) - h5Var3.getTextHeight(), 2);
            h5Var2.layout(dp, dp4, h5Var2.getMeasuredWidth() + dp, h5Var2.getMeasuredHeight() + dp4);
            int dp5 = AndroidUtilities.dp(f10) + h5Var2.getTextHeight() + dp4;
            h5Var3.layout(dp, dp5, h5Var3.getMeasuredWidth() + dp, h5Var3.getMeasuredHeight() + dp5);
        } else {
            int dp6 = AndroidUtilities.dp(1.0f) + ((i13 - h5Var2.getTextHeight()) / 2);
            h5Var2.layout(dp, dp6, h5Var2.getMeasuredWidth() + dp, h5Var2.getMeasuredHeight() + dp6);
        }
        if (pi0Var.getVisibility() == 0) {
            int dp7 = AndroidUtilities.dp(1.0f) + ((((i13 - pi0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(this.v > 50 ? 0.0f : 2.0f)) - pi0Var.getPaddingTop());
            int dp8 = !LocaleController.isRTL ? AndroidUtilities.dp(this.w) : (i14 - pi0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.w);
            pi0Var.layout(dp8, dp7, pi0Var.getMeasuredWidth() + dp8, pi0Var.getMeasuredHeight() + dp7);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int dp9 = AndroidUtilities.dp(1.0f) + ((i13 - imageView.getMeasuredHeight()) / 2);
            int dp10 = LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            imageView.layout(dp10, dp9, imageView.getMeasuredWidth() + dp10, imageView.getMeasuredHeight() + dp9);
        }
        Switch r92 = this.f;
        if (r92 == null || r92.getVisibility() != 0) {
            return;
        }
        int measuredHeight = (i13 - this.f.getMeasuredHeight()) / 2;
        int dp11 = LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : (i14 - this.f.getMeasuredWidth()) - AndroidUtilities.dp(22.0f);
        Switch r10 = this.f;
        r10.layout(dp11, measuredHeight, r10.getMeasuredWidth() + dp11, this.f.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(this.v);
        int i11 = this.H;
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (i11 != 0 && i11 != size && (charSequence = this.I) != null) {
            j6Var.c(TextUtils.ellipsize(charSequence, j6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.H = size;
        boolean z10 = this.y;
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        org.telegram.ui.ActionBar.h5 h5Var2 = this.d;
        org.telegram.ui.ActionBar.h5 h5Var3 = this.a;
        if (z10) {
            h5Var3.measure(ll.d(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            h5Var.measure(ll.d(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            j6Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 103)) - h5Var3.getTextWidth(), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            h5Var2.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 103)) - h5Var3.getTextWidth(), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        } else {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.n), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            h5Var2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.n), LocaleController.isRTL ? TLObject.FLAG_31 : TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            int max = Math.max(j6Var.d(), h5Var2.getTextWidth());
            h5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            h5Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        }
        pi0 pi0Var = this.e;
        if (pi0Var.getVisibility() == 0) {
            pi0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
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

    public final void p(String str, String str2, boolean z10, int i9, int i10, int i11, boolean z11) {
        CharSequence ellipsize;
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(str, false);
        h5Var.i(null);
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.I = str2;
            ellipsize = TextUtils.ellipsize(str2, j6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        j6Var.c(ellipsize, z10, true);
        j6Var.setVisibility(0);
        this.d.setVisibility(8);
        d(i10, i11, i9);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, int i9, boolean z10) {
        s(charSequence, charSequence2, false, i9, z10);
    }

    public final void r(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.s = 58;
        this.w = 18;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        this.I = charSequence2;
        org.telegram.ui.Components.j6 j6Var = this.c;
        j6Var.c(charSequence2, false, true);
        pi0 pi0Var = this.e;
        pi0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof mi0) {
            pi0Var.setAnimation((mi0) drawable);
        } else {
            pi0Var.setImageDrawable(drawable);
        }
        pi0Var.setVisibility(0);
        j6Var.setVisibility(0);
        this.h.setVisibility(8);
        pi0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i9, boolean z11) {
        this.w = 16;
        this.s = 58;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.l(charSequence, false);
        h5Var.i(null);
        pi0 pi0Var = this.e;
        pi0Var.setVisibility(0);
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((kh.x3.g(charSequence, h5Var.getTextPaint()) + AndroidUtilities.dp(this.s)) + AndroidUtilities.dp(16.0f)));
            this.I = charSequence2;
            j6Var.c(TextUtils.ellipsize(charSequence2, j6Var.getPaint(), max, TextUtils.TruncateAt.END), z10, true);
        } else {
            j6Var.c("", z10, true);
        }
        j6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        pi0Var.setTranslationX(0.0f);
        pi0Var.setTranslationY(0.0f);
        pi0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        pi0Var.setImageResource(i9);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public void setChecked(boolean z10) {
        this.f.c(z10, true);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        g(z10);
    }

    public void setImageLeft(int i9) {
        this.w = i9;
    }

    public void setNeedDivider(boolean z10) {
        if (this.r != z10) {
            this.r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i9) {
        this.s = i9;
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

    public void setTextColor(int i9) {
        this.a.setTextColor(i9);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.G == null) {
            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(30.0f), this);
            this.G = i5Var;
            if (this.B) {
                i5Var.a();
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
        org.telegram.ui.Components.j6 j6Var = this.c;
        j6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        j6Var.setVisibility(8);
        this.d.setVisibility(8);
        pi0 pi0Var = this.e;
        pi0Var.setVisibility(8);
        pi0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.i5 i5Var = this.G;
        if (i5Var != null) {
            i5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.j6 j6Var = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.I = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, j6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        j6Var.c(ellipsize, z10, true);
    }

    public final void v() {
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        int intValue = h5Var.getTag() instanceof Integer ? ((Integer) h5Var.getTag()).intValue() : org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.A;
        int v02 = org.telegram.ui.ActionBar.f6.v0(intValue, b6Var);
        if (intValue != org.telegram.ui.ActionBar.f6.j5 && intValue != org.telegram.ui.ActionBar.f6.G6) {
            v02 = c(v02);
        }
        h5Var.setTextColor(v02);
        pi0 pi0Var = this.e;
        if (pi0Var.getTag() instanceof Integer) {
            int intValue2 = ((Integer) pi0Var.getTag()).intValue();
            int v03 = org.telegram.ui.ActionBar.f6.v0(intValue2, b6Var);
            if (intValue2 != org.telegram.ui.ActionBar.f6.J5 && intValue2 != org.telegram.ui.ActionBar.f6.m6) {
                v03 = c(v03);
            }
            pi0Var.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
        }
        this.b.setTextColor(c(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y6, b6Var)));
        int i9 = org.telegram.ui.ActionBar.f6.I6;
        this.c.setTextColor(c(org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
        this.d.setTextColor(c(org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
    }

    public p8(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(23, context, b6Var, false, false);
    }

    public p8(int i9, Context context, boolean z10) {
        this(i9, context, null, z10, false);
    }

    public p8(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context);
        this.s = 58;
        this.v = 50;
        this.w = 16;
        this.A = b6Var;
        this.n = i9;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.a = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.j5 : org.telegram.ui.ActionBar.f6.G6, b6Var));
        h5Var.setTextSize(16);
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var.setImportantForAccessibility(2);
        addView(h5Var, g7.e6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var2;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.p5 : org.telegram.ui.ActionBar.f6.y6, b6Var));
        h5Var2.setTextSize(13);
        h5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        h5Var2.setImportantForAccessibility(2);
        addView(h5Var2, g7.e6.c(-1.0f, -2));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.c = j6Var;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.n5 : org.telegram.ui.ActionBar.f6.I6, b6Var));
        j6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        j6Var.setTextSize(AndroidUtilities.dp(16.0f));
        j6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        j6Var.setImportantForAccessibility(2);
        j6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(j6Var);
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
        h5Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.n5 : org.telegram.ui.ActionBar.f6.I6, b6Var));
        h5Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        h5Var3.setTextSize(16);
        h5Var3.setImportantForAccessibility(2);
        h5Var3.setVisibility(8);
        addView(h5Var3);
        pi0 pi0Var = new pi0(context);
        this.e = pi0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        pi0Var.setScaleType(scaleType);
        pi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(z10 ? org.telegram.ui.ActionBar.f6.J5 : org.telegram.ui.ActionBar.f6.m6, b6Var), PorterDuff.Mode.SRC_IN));
        addView(pi0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z11) {
            Switch r42 = new Switch(context, b6Var);
            this.f = r42;
            int i10 = org.telegram.ui.ActionBar.f6.M6;
            int i11 = org.telegram.ui.ActionBar.f6.N6;
            int i12 = org.telegram.ui.ActionBar.f6.d6;
            r42.d(i10, i11, i12, i12);
            addView(this.f, g7.e6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.G == null) {
            org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(30.0f), this);
            this.G = i5Var;
            if (this.B) {
                i5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new o8(imageReceiver, 0));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.G.g(new kh.w3(imageReceiver, 4), true);
        invalidate();
    }

    public int c(int i9) {
        return i9;
    }
}
