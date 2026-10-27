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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.cp0;
import org.telegram.ui.o00;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class v8 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public static final /* synthetic */ int V = 0;
    public final org.telegram.ui.ActionBar.u6 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public float J;
    public org.telegram.ui.Components.r5 K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public PorterDuffColorFilter P;
    public CharSequence Q;
    public boolean R;
    public Paint S;
    public boolean T;
    public int U;
    public final org.telegram.ui.ActionBar.b6 a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final org.telegram.ui.Components.s6 c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final bk0 e;
    public Switch f;
    public final ImageView h;
    public int n;
    public boolean r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public boolean y;

    public v8(Context context) {
        this(20, context, null, false, false);
    }

    public static SpannableStringBuilder b(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        o00 o00Var = new o00();
        o00Var.f = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lj, false);
        o00Var.n = false;
        spannableStringBuilder.setSpan(o00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        int intValue = b6Var.getTag() instanceof Integer ? ((Integer) b6Var.getTag()).intValue() : org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.y6.w0(intValue, u6Var);
        if (intValue != org.telegram.ui.ActionBar.y6.j5 && intValue != org.telegram.ui.ActionBar.y6.G6) {
            w02 = e(w02);
        }
        if (this.M) {
            b6Var.setTextColor(w02);
        }
        if (this.N) {
            bk0 bk0Var = this.e;
            if (bk0Var.getTag() instanceof Integer) {
                int intValue2 = ((Integer) bk0Var.getTag()).intValue();
                int w03 = org.telegram.ui.ActionBar.y6.w0(intValue2, u6Var);
                if (intValue2 != org.telegram.ui.ActionBar.y6.J5 && intValue2 != org.telegram.ui.ActionBar.y6.m6) {
                    w03 = e(w03);
                }
                if (w03 != this.O || bk0Var.getColorFilter() != this.P) {
                    this.O = w03;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                    this.P = porterDuffColorFilter;
                    bk0Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.b.setTextColor(e(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y6, u6Var)));
        int i10 = org.telegram.ui.ActionBar.y6.I6;
        this.c.setTextColor(e(org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
        this.d.setTextColor(e(org.telegram.ui.ActionBar.y6.w0(i10, u6Var)));
    }

    public final int c(boolean z10) {
        return this.R ? z10 ? 52 : 58 : z10 ? 65 : 71;
    }

    public final boolean d() {
        Switch r02 = this.f;
        return r02 != null && r02.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.H || this.J != 0.0f) {
            if (this.S == null) {
                Paint paint = new Paint(1);
                this.S = paint;
                paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.O5, this.E));
            }
            if (this.T) {
                float f7 = this.I + 0.016f;
                this.I = f7;
                if (f7 > 1.0f) {
                    this.I = 1.0f;
                    this.T = false;
                }
            } else {
                float f10 = this.I - 0.016f;
                this.I = f10;
                if (f10 < 0.0f) {
                    this.I = 0.0f;
                    this.T = true;
                }
            }
            int i10 = this.U;
            if (i10 > 0) {
                this.U = i10 - 15;
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
            this.S.setAlpha((int) (((this.I * 0.4f) + 0.6f) * this.J * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(21.0f)) - AndroidUtilities.dp(this.G), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.S);
            invalidate();
        }
        float f15 = 1.0f - this.J;
        org.telegram.ui.Components.r5 r5Var = this.K;
        this.c.setAlpha(f15 * (r5Var == null ? 1.0f : 1.0f - r5Var.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f16 = 1.0f - this.J;
        org.telegram.ui.Components.r5 r5Var2 = this.K;
        this.d.setAlpha(f16 * (r5Var2 == null ? 1.0f : 1.0f - r5Var2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.r5 r5Var3 = this.K;
        if (r5Var3 != null) {
            r5Var3.setBounds((getWidth() - this.K.s) - AndroidUtilities.dp(18.0f), (getHeight() - this.K.s) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.K.s) / 2);
            this.K.draw(canvas);
        }
    }

    public final void f(int i10, int i11, int i12) {
        this.s = c(true);
        bk0 bk0Var = this.e;
        bk0Var.setVisibility(0);
        bk0Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        bk0Var.setTranslationX(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : -3.0f));
        bk0Var.setImageResource(i12);
        this.N = false;
        bk0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.u6 u6Var = this.E;
        boolean a2 = u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q();
        jc0 jc0Var = new jc0(1);
        jc0Var.b(i10, i11);
        jc0Var.b = a2;
        bk0Var.setBackground(jc0Var);
    }

    public final void g(int i10, int i11) {
        org.telegram.ui.ActionBar.u6 u6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.setTextColor(w02);
        b6Var.setTag(Integer.valueOf(i11));
        this.M = true;
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(i10, u6Var), PorterDuff.Mode.SRC_IN);
            bk0 bk0Var = this.e;
            bk0Var.setColorFilter(porterDuffColorFilter);
            bk0Var.setTag(Integer.valueOf(i10));
            this.N = true;
        }
        a();
    }

    public Switch getCheckBox() {
        return this.f;
    }

    public int getDefaultImageLeft() {
        return this.R ? 16 : 21;
    }

    public bk0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.b6 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.s6 getValueTextView() {
        return this.c;
    }

    public final void h(int i10, boolean z10, boolean z11) {
        this.H = z10;
        this.G = i10;
        if (!z11) {
            this.J = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void i(boolean z10, boolean z11) {
        super.setEnabled(z10);
        Switch r52 = this.f;
        if (r52 != null) {
            r52.setEnabled(z10);
        }
        this.a.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.b.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.c.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.d.animate().alpha(z10 ? 1.0f : 0.5f).start();
    }

    public final void j(int i10) {
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        if (i10 <= 0) {
            b6Var.i(null);
        } else {
            b6Var.i(new cp0(i10, getContext(), this.E, false));
            b6Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        }
    }

    public final void k(CharSequence charSequence, boolean z10) {
        this.w = getDefaultImageLeft();
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.l(charSequence, false);
        b6Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.s6 s6Var = this.c;
        s6Var.c(null, false, true);
        this.e.setVisibility(8);
        s6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z10, boolean z11) {
        this.w = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.l(charSequence, false);
        b6Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        Switch r6 = this.f;
        if (r6 != null) {
            r6.setVisibility(0);
            this.f.c(z10, false);
        }
        setWillNotDraw(!this.r);
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.g(null, false);
        }
    }

    public final void m(String str, boolean z10, int i10, int i11, boolean z11) {
        this.w = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.l(str, false);
        b6Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i11, i11, i10);
        if (this.f == null) {
            Switch r11 = new Switch(getContext(), this.E);
            this.f = r11;
            int i12 = org.telegram.ui.ActionBar.y6.M6;
            int i13 = org.telegram.ui.ActionBar.y6.N6;
            int i14 = org.telegram.ui.ActionBar.y6.d6;
            r11.d(i12, i13, i14, i14);
            addView(this.f, kb1.h(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r112 = this.f;
        if (r112 != null) {
            r112.setVisibility(0);
            this.f.c(z10, false);
        }
        this.r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.g(null, false);
        }
    }

    public final void n(int i10, String str, boolean z10) {
        this.w = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.l(str, false);
        b6Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r12 = this.f;
        if (r12 != null) {
            r12.setVisibility(0);
            this.f.c(z10, false);
        }
        bk0 bk0Var = this.e;
        bk0Var.setVisibility(0);
        bk0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        bk0Var.setImageResource(i10);
        this.r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.g(null, false);
        }
    }

    public final void o(int i10, CharSequence charSequence, boolean z10) {
        this.w = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.l(charSequence, false);
        b6Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.s6 s6Var = this.c;
        s6Var.c(null, false, true);
        bk0 bk0Var = this.e;
        bk0Var.setImageResource(i10);
        bk0Var.setVisibility(0);
        s6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        bk0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.r) {
            org.telegram.ui.ActionBar.u6 u6Var = this.E;
            Paint d = u6Var != null ? u6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.y6.k0;
            }
            Paint paint = d;
            int dp = AndroidUtilities.dp(this.e.getVisibility() == 0 ? this.x ? 72 : this.s : this.n);
            float f7 = LocaleController.isRTL ? 0.0f : dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!LocaleController.isRTL) {
                dp = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - dp, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        CharSequence text = b6Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.s6 s6Var = this.c;
        if (!isEmpty) {
            CharSequence text2 = s6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b6Var.getText());
            if (!TextUtils.isEmpty(s6Var.getText())) {
                sb2.append('\n');
                sb2.append(s6Var.getText());
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
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        int textHeight = b6Var.getTextHeight();
        org.telegram.ui.Components.s6 s6Var = this.c;
        int max = ((i14 - Math.max(textHeight, s6Var.getTextHeight())) / 2) + 1;
        int dp2 = LocaleController.isRTL ? AndroidUtilities.dp(this.n - 6) : (i15 - s6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n - 6);
        if (this.y && !LocaleController.isRTL) {
            dp2 = (i15 - s6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n);
        }
        s6Var.layout(dp2, max, s6Var.getMeasuredWidth() + dp2, s6Var.getMeasuredHeight() + max);
        int dp3 = LocaleController.isRTL ? AndroidUtilities.dp(this.n - 6) : (i15 - b6Var.getMeasuredWidth()) - AndroidUtilities.dp(this.n - 6);
        b6Var.layout(dp3, max, b6Var.getMeasuredWidth() + dp3, b6Var.getMeasuredHeight() + max);
        boolean z11 = LocaleController.isRTL;
        bk0 bk0Var = this.e;
        org.telegram.ui.ActionBar.b6 b6Var2 = this.a;
        if (z11) {
            dp = (getMeasuredWidth() - b6Var2.getMeasuredWidth()) - AndroidUtilities.dp(bk0Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            dp = AndroidUtilities.dp(bk0Var.getVisibility() == 0 ? this.s : this.n);
        }
        org.telegram.ui.ActionBar.b6 b6Var3 = this.b;
        if (b6Var3.getVisibility() == 0) {
            float f7 = this.v > 50 ? 4 : 2;
            int dp4 = AndroidUtilities.dp(1.0f) + wh.B(f7, (i14 - b6Var2.getTextHeight()) - b6Var3.getTextHeight(), 2);
            b6Var2.layout(dp, dp4, b6Var2.getMeasuredWidth() + dp, b6Var2.getMeasuredHeight() + dp4);
            int dp5 = AndroidUtilities.dp(f7) + b6Var2.getTextHeight() + dp4;
            b6Var3.layout(dp, dp5, b6Var3.getMeasuredWidth() + dp, b6Var3.getMeasuredHeight() + dp5);
        } else {
            int dp6 = AndroidUtilities.dp(1.0f) + ((i14 - b6Var2.getTextHeight()) / 2);
            b6Var2.layout(dp, dp6, b6Var2.getMeasuredWidth() + dp, b6Var2.getMeasuredHeight() + dp6);
        }
        if (bk0Var.getVisibility() == 0) {
            int dp7 = AndroidUtilities.dp(1.0f) + ((((i14 - bk0Var.getMeasuredHeight()) / 2) + AndroidUtilities.dp(this.v > 50 ? 0.0f : 2.0f)) - bk0Var.getPaddingTop());
            int dp8 = !LocaleController.isRTL ? AndroidUtilities.dp(this.w) : (i15 - bk0Var.getMeasuredWidth()) - AndroidUtilities.dp(this.w);
            bk0Var.layout(dp8, dp7, bk0Var.getMeasuredWidth() + dp8, bk0Var.getMeasuredHeight() + dp7);
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
        org.telegram.ui.Components.s6 s6Var = this.c;
        if (i12 != 0 && i12 != size && (charSequence = this.Q) != null) {
            s6Var.c(TextUtils.ellipsize(charSequence, s6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.L = size;
        boolean z10 = this.y;
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        org.telegram.ui.ActionBar.b6 b6Var2 = this.d;
        org.telegram.ui.ActionBar.b6 b6Var3 = this.a;
        if (z10) {
            b6Var3.measure(wh.x(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            b6Var.measure(wh.x(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            s6Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 103)) - b6Var3.getTextWidth(), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            b6Var2.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 103)) - b6Var3.getTextWidth(), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        } else {
            s6Var.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.n), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            b6Var2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.n), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            int max = Math.max(s6Var.d(), b6Var2.getTextWidth());
            b6Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
            b6Var.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        }
        bk0 bk0Var = this.e;
        if (bk0Var.getVisibility() == 0) {
            bk0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
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

    public final void p(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.s = c(false);
        this.w = 18;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.l(charSequence, false);
        b6Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.s6 s6Var = this.c;
        s6Var.c(null, false, true);
        bk0 bk0Var = this.e;
        bk0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof yj0) {
            bk0Var.setAnimation((yj0) drawable);
        } else {
            bk0Var.setImageDrawable(drawable);
        }
        bk0Var.setVisibility(0);
        s6Var.setVisibility(8);
        this.h.setVisibility(8);
        bk0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.w = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.l(charSequence, false);
        b6Var.i(null);
        this.Q = charSequence2;
        org.telegram.ui.Components.s6 s6Var = this.c;
        s6Var.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, s6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), z10, true);
        s6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11) {
        CharSequence ellipsize;
        this.w = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.l(str, false);
        b6Var.i(null);
        org.telegram.ui.Components.s6 s6Var = this.c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.Q = str2;
            ellipsize = TextUtils.ellipsize(str2, s6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        s6Var.c(ellipsize, z10, true);
        s6Var.setVisibility(0);
        this.d.setVisibility(8);
        f(i11, i12, i10);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10) {
        u(charSequence, charSequence2, false, i10, z10);
    }

    public void setChecked(boolean z10) {
        this.f.c(z10, true);
    }

    public void setCompactLayout(boolean z10) {
        this.R = z10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        i(z10, true);
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
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        if (isEmpty) {
            b6Var.setVisibility(8);
        } else {
            b6Var.setVisibility(0);
            b6Var.l(charSequence, false);
        }
    }

    public void setTextColor(int i10) {
        this.M = false;
        this.a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.K == null) {
            org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(AndroidUtilities.dp(30.0f), this);
            this.K = r5Var;
            if (this.F) {
                r5Var.a();
            }
        }
        this.K.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.s = c(false);
        this.w = 18;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.l(charSequence, false);
        b6Var.i(null);
        this.Q = charSequence2;
        org.telegram.ui.Components.s6 s6Var = this.c;
        s6Var.c(charSequence2, false, true);
        bk0 bk0Var = this.e;
        bk0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof yj0) {
            bk0Var.setAnimation((yj0) drawable);
        } else {
            bk0Var.setImageDrawable(drawable);
        }
        bk0Var.setVisibility(0);
        s6Var.setVisibility(0);
        this.h.setVisibility(8);
        bk0Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, boolean z11) {
        this.w = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.l(charSequence, false);
        b6Var.i(null);
        bk0 bk0Var = this.e;
        bk0Var.setVisibility(0);
        org.telegram.ui.Components.s6 s6Var = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((fi.v3.g(charSequence, b6Var.getTextPaint()) + AndroidUtilities.dp(this.s)) + AndroidUtilities.dp(16.0f)));
            this.Q = charSequence2;
            s6Var.c(TextUtils.ellipsize(charSequence2, s6Var.getPaint(), max, TextUtils.TruncateAt.END), z10, true);
        } else {
            s6Var.c("", z10, true);
        }
        s6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        bk0Var.setTranslationX(0.0f);
        bk0Var.setTranslationY(0.0f);
        bk0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        bk0Var.setImageResource(i10);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.g(null, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.ActionBar.u6 u6Var = this.E;
        if (this.M || this.N) {
            try {
                a();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y6, u6Var);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.I6, u6Var);
            int e10 = e(w02);
            int e11 = e(w03);
            if (e10 == w02 && e11 == w03) {
                return;
            }
            this.b.setTextColor(e10);
            this.c.setTextColor(e11);
            this.d.setTextColor(e11);
        } catch (Exception e12) {
            FileLog.e(e12);
        }
    }

    public final void v(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.w = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        b6Var.l(charSequence, false);
        b6Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.s6 s6Var = this.c;
        s6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        s6Var.setVisibility(8);
        this.d.setVisibility(8);
        bk0 bk0Var = this.e;
        bk0Var.setVisibility(8);
        bk0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.r5 r5Var = this.K;
        if (r5Var != null) {
            r5Var.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.s6 s6Var = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.Q = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, s6Var.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        s6Var.c(ellipsize, z10, true);
    }

    public v8(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this(20, context, u6Var, false, false);
    }

    public v8(int i10, Context context, boolean z10) {
        this(i10, context, null, z10, false);
    }

    public v8(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11) {
        super(context);
        this.s = 71;
        this.v = 50;
        this.w = 21;
        this.E = u6Var;
        this.n = i10;
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.a = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, z10 ? org.telegram.ui.ActionBar.y6.j5 : org.telegram.ui.ActionBar.y6.G6, u6Var);
        b6Var.setTextSize(16);
        b6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        b6Var.setImportantForAccessibility(2);
        addView(b6Var, kb1.g(-1.0f, -2));
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.b = b6Var2;
        org.telegram.ui.ActionBar.f7.Y(b6Var2, z10 ? org.telegram.ui.ActionBar.y6.p5 : org.telegram.ui.ActionBar.y6.y6, u6Var);
        b6Var2.setTextSize(13);
        b6Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        b6Var2.setImportantForAccessibility(2);
        addView(b6Var2, kb1.g(-1.0f, -2));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, true);
        this.c = s6Var;
        org.telegram.ui.ActionBar.f7.Z(s6Var, z10 ? org.telegram.ui.ActionBar.y6.n5 : org.telegram.ui.ActionBar.y6.I6, u6Var);
        s6Var.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        s6Var.setTextSize(AndroidUtilities.dp(16.0f));
        s6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        s6Var.setImportantForAccessibility(2);
        s6Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(s6Var);
        org.telegram.ui.ActionBar.b6 b6Var3 = new org.telegram.ui.ActionBar.b6(context);
        this.d = b6Var3;
        Boolean bool = Boolean.FALSE;
        if (!b6Var3.P) {
            b6Var3.n0 = true;
            b6Var3.p0 = bool;
            b6Var3.m();
            b6Var3.b();
        }
        b6Var3.q0 = 18;
        b6Var3.m();
        org.telegram.ui.ActionBar.f7.Y(b6Var3, z10 ? org.telegram.ui.ActionBar.y6.n5 : org.telegram.ui.ActionBar.y6.I6, u6Var);
        b6Var3.setGravity(LocaleController.isRTL ? 3 : 5);
        b6Var3.setTextSize(16);
        b6Var3.setImportantForAccessibility(2);
        b6Var3.setVisibility(8);
        addView(b6Var3);
        bk0 bk0Var = new bk0(context);
        this.e = bk0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        bk0Var.setScaleType(scaleType);
        org.telegram.ui.ActionBar.f7.t(bk0Var, z10 ? org.telegram.ui.ActionBar.y6.J5 : org.telegram.ui.ActionBar.y6.m6, u6Var, PorterDuff.Mode.SRC_IN);
        addView(bk0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z11) {
            Switch r32 = new Switch(context, u6Var);
            this.f = r32;
            int i11 = org.telegram.ui.ActionBar.y6.M6;
            int i12 = org.telegram.ui.ActionBar.y6.N6;
            int i13 = org.telegram.ui.ActionBar.y6.d6;
            r32.d(i11, i12, i13, i13);
            addView(this.f, kb1.h(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.K == null) {
            org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(AndroidUtilities.dp(30.0f), this);
            this.K = r5Var;
            if (this.F) {
                r5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        addOnAttachStateChangeListener(new u8(imageReceiver, 0));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.K.g(new fi.u3(imageReceiver, 5), true);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public int e(int i10) {
        return i10;
    }
}
