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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.va0;
import org.telegram.ui.g00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class p8 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int V = 0;
    public boolean D;
    public final org.telegram.ui.ActionBar.p6 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public float J;
    public org.telegram.ui.Components.d5 K;
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
    public final org.telegram.ui.ActionBar.u5 a;
    public final org.telegram.ui.ActionBar.u5 b;
    public final org.telegram.ui.Components.f6 c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final ei0 e;
    public Switch f;
    public final ImageView h;
    public int n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public p8(Context context) {
        this(20, context, null, false, false);
    }

    public static SpannableStringBuilder b(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        g00 g00Var = new g00();
        g00Var.f = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zk, false);
        g00Var.n = false;
        spannableStringBuilder.setSpan(g00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        int intValue = u5Var.getTag() instanceof Integer ? ((Integer) u5Var.getTag()).intValue() : org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.t6.w0(intValue, p6Var);
        if (intValue != org.telegram.ui.ActionBar.t6.j5 && intValue != org.telegram.ui.ActionBar.t6.G6) {
            w02 = e(w02);
        }
        if (this.M) {
            u5Var.setTextColor(w02);
        }
        if (this.N) {
            ei0 ei0Var = this.e;
            if (ei0Var.getTag() instanceof Integer) {
                int intValue2 = ((Integer) ei0Var.getTag()).intValue();
                int w03 = org.telegram.ui.ActionBar.t6.w0(intValue2, p6Var);
                if (intValue2 != org.telegram.ui.ActionBar.t6.J5 && intValue2 != org.telegram.ui.ActionBar.t6.m6) {
                    w03 = e(w03);
                }
                if (w03 != this.O || ei0Var.getColorFilter() != this.P) {
                    this.O = w03;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                    this.P = porterDuffColorFilter;
                    ei0Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.b.setTextColor(e(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var)));
        int i10 = org.telegram.ui.ActionBar.t6.I6;
        this.c.setTextColor(e(org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
        this.d.setTextColor(e(org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
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
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.O5, this.E));
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
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.i0.L(21.0f)) - org.telegram.messenger.i0.L(this.G), measuredHeight - org.telegram.messenger.i0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(3.0f) + measuredHeight);
            if (cd.X) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), this.S);
            invalidate();
        }
        float f15 = 1.0f - this.J;
        org.telegram.ui.Components.d5 d5Var = this.K;
        this.c.setAlpha(f15 * (d5Var == null ? 1.0f : 1.0f - d5Var.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f16 = 1.0f - this.J;
        org.telegram.ui.Components.d5 d5Var2 = this.K;
        this.d.setAlpha(f16 * (d5Var2 == null ? 1.0f : 1.0f - d5Var2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.d5 d5Var3 = this.K;
        if (d5Var3 != null) {
            d5Var3.setBounds((getWidth() - this.K.s) - org.telegram.messenger.i0.L(18.0f), (getHeight() - this.K.s) / 2, getWidth() - org.telegram.messenger.i0.L(18.0f), (getHeight() + this.K.s) / 2);
            this.K.draw(canvas);
        }
    }

    public final void f(int i10, int i11, int i12) {
        this.s = c(true);
        ei0 ei0Var = this.e;
        ei0Var.setVisibility(0);
        ei0Var.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        ei0Var.setTranslationX(org.telegram.messenger.i0.L(cd.X ? 0.0f : -3.0f));
        ei0Var.setImageResource(i12);
        this.N = false;
        ei0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.p6 p6Var = this.E;
        boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
        va0 va0Var = new va0(1);
        va0Var.b(i10, i11);
        va0Var.b = a2;
        ei0Var.setBackground(va0Var);
    }

    public final void g(int i10, int i11) {
        org.telegram.ui.ActionBar.p6 p6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.setTextColor(w02);
        u5Var.setTag(Integer.valueOf(i11));
        this.M = true;
        if (i10 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), PorterDuff.Mode.SRC_IN);
            ei0 ei0Var = this.e;
            ei0Var.setColorFilter(porterDuffColorFilter);
            ei0Var.setTag(Integer.valueOf(i10));
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

    public ei0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.u5 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.f6 getValueTextView() {
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
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        if (i10 <= 0) {
            u5Var.i(null);
        } else {
            u5Var.i(new org.telegram.ui.ActionBar.y2(i10, getContext(), this.E, false));
            u5Var.setDrawablePadding(org.telegram.messenger.i0.L(6.0f));
        }
    }

    public final void k(CharSequence charSequence, boolean z10) {
        this.x = getDefaultImageLeft();
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.f6 f6Var = this.c;
        f6Var.c(null, false, true);
        this.e.setVisibility(8);
        f6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z10, boolean z11) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        Switch r62 = this.f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f.c(z10, false);
        }
        setWillNotDraw(!this.r);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void m(String str, boolean z10, int i10, int i11, boolean z11) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.l(str, false);
        u5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i11, i11, i10);
        if (this.f == null) {
            Switch r11 = new Switch(getContext(), this.E);
            this.f = r11;
            int i12 = org.telegram.ui.ActionBar.t6.M6;
            int i13 = org.telegram.ui.ActionBar.t6.N6;
            int i14 = org.telegram.ui.ActionBar.t6.d6;
            r11.d(i12, i13, i14, i14);
            addView(this.f, w7.b6.d(37, 20.0f, (cd.X ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r112 = this.f;
        if (r112 != null) {
            r112.setVisibility(0);
            this.f.c(z10, false);
        }
        this.r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void n(int i10, String str, boolean z10) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.l(str, false);
        u5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r12 = this.f;
        if (r12 != null) {
            r12.setVisibility(0);
            this.f.c(z10, false);
        }
        ei0 ei0Var = this.e;
        ei0Var.setVisibility(0);
        ei0Var.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        ei0Var.setImageResource(i10);
        this.r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void o(int i10, CharSequence charSequence, boolean z10) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.f6 f6Var = this.c;
        f6Var.c(null, false, true);
        ei0 ei0Var = this.e;
        ei0Var.setImageResource(i10);
        ei0Var.setVisibility(0);
        f6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        ei0Var.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.r) {
            org.telegram.ui.ActionBar.p6 p6Var = this.E;
            Paint d = p6Var != null ? p6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.t6.k0;
            }
            Paint paint = d;
            int L = org.telegram.messenger.i0.L(this.e.getVisibility() == 0 ? this.y ? 72 : this.s : this.n);
            float f7 = cd.X ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!cd.X) {
                L = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        CharSequence text = u5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.f6 f6Var = this.c;
        if (!isEmpty) {
            CharSequence text2 = f6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(u5Var.getText());
            if (!TextUtils.isEmpty(f6Var.getText())) {
                sb2.append('\n');
                sb2.append(f6Var.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L;
        int i14 = i13 - i11;
        int i15 = i12 - i10;
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        int textHeight = u5Var.getTextHeight();
        org.telegram.ui.Components.f6 f6Var = this.c;
        int max = ((i14 - Math.max(textHeight, f6Var.getTextHeight())) / 2) + 1;
        int L2 = cd.X ? org.telegram.messenger.i0.L(this.n - 6) : (i15 - f6Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(this.n - 6);
        if (this.D && !cd.X) {
            L2 = (i15 - f6Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(this.n);
        }
        f6Var.layout(L2, max, f6Var.getMeasuredWidth() + L2, f6Var.getMeasuredHeight() + max);
        int L3 = cd.X ? org.telegram.messenger.i0.L(this.n - 6) : (i15 - u5Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(this.n - 6);
        u5Var.layout(L3, max, u5Var.getMeasuredWidth() + L3, u5Var.getMeasuredHeight() + max);
        boolean z11 = cd.X;
        ei0 ei0Var = this.e;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.a;
        if (z11) {
            L = (getMeasuredWidth() - u5Var2.getMeasuredWidth()) - org.telegram.messenger.i0.L(ei0Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            L = org.telegram.messenger.i0.L(ei0Var.getVisibility() == 0 ? this.s : this.n);
        }
        org.telegram.ui.ActionBar.u5 u5Var3 = this.b;
        if (u5Var3.getVisibility() == 0) {
            float f7 = this.w > 50 ? 4 : 2;
            int L4 = org.telegram.messenger.i0.L(1.0f) + z20.y(f7, (i14 - u5Var2.getTextHeight()) - u5Var3.getTextHeight(), 2);
            u5Var2.layout(L, L4, u5Var2.getMeasuredWidth() + L, u5Var2.getMeasuredHeight() + L4);
            int L5 = org.telegram.messenger.i0.L(f7) + u5Var2.getTextHeight() + L4;
            u5Var3.layout(L, L5, u5Var3.getMeasuredWidth() + L, u5Var3.getMeasuredHeight() + L5);
        } else {
            int L6 = org.telegram.messenger.i0.L(1.0f) + ((i14 - u5Var2.getTextHeight()) / 2);
            u5Var2.layout(L, L6, u5Var2.getMeasuredWidth() + L, u5Var2.getMeasuredHeight() + L6);
        }
        if (ei0Var.getVisibility() == 0) {
            int L7 = org.telegram.messenger.i0.L(1.0f) + ((((i14 - ei0Var.getMeasuredHeight()) / 2) + org.telegram.messenger.i0.L(this.w > 50 ? 0.0f : 2.0f)) - ei0Var.getPaddingTop());
            int L8 = !cd.X ? org.telegram.messenger.i0.L(this.x) : (i15 - ei0Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(this.x);
            ei0Var.layout(L8, L7, ei0Var.getMeasuredWidth() + L8, ei0Var.getMeasuredHeight() + L7);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L9 = org.telegram.messenger.i0.L(1.0f) + ((i14 - imageView.getMeasuredHeight()) / 2);
            int L10 = cd.X ? org.telegram.messenger.i0.L(23.0f) : (i15 - imageView.getMeasuredWidth()) - org.telegram.messenger.i0.L(23.0f);
            imageView.layout(L10, L9, imageView.getMeasuredWidth() + L10, imageView.getMeasuredHeight() + L9);
        }
        Switch r92 = this.f;
        if (r92 == null || r92.getVisibility() != 0) {
            return;
        }
        int measuredHeight = (i14 - this.f.getMeasuredHeight()) / 2;
        int L11 = cd.X ? org.telegram.messenger.i0.L(22.0f) : (i15 - this.f.getMeasuredWidth()) - org.telegram.messenger.i0.L(22.0f);
        Switch r10 = this.f;
        r10.layout(L11, measuredHeight, r10.getMeasuredWidth() + L11, this.f.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(this.w);
        int i12 = this.L;
        org.telegram.ui.Components.f6 f6Var = this.c;
        if (i12 != 0 && i12 != size && (charSequence = this.Q) != null) {
            f6Var.c(TextUtils.ellipsize(charSequence, f6Var.getPaint(), org.telegram.messenger.i0.q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.L = size;
        boolean z10 = this.D;
        org.telegram.ui.ActionBar.u5 u5Var = this.b;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.d;
        org.telegram.ui.ActionBar.u5 u5Var3 = this.a;
        if (z10) {
            u5Var3.measure(z20.c(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
            u5Var.measure(z20.c(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
            f6Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.i0.L(this.n + zs.o1)) - u5Var3.getTextWidth(), cd.X ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
            u5Var2.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.i0.L(this.n + zs.o1)) - u5Var3.getTextWidth(), cd.X ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
        } else {
            f6Var.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.i0.L(this.n), cd.X ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
            u5Var2.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.i0.L(this.n), cd.X ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
            int max = Math.max(f6Var.d(), u5Var2.getTextWidth());
            u5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - org.telegram.messenger.i0.L(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
            u5Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.i0.L(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
        }
        ei0 ei0Var = this.e;
        if (ei0Var.getVisibility() == 0) {
            ei0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        Switch r02 = this.f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(37.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, L + (this.r ? 1 : 0));
    }

    public final void p(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.s = c(false);
        this.x = 18;
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.f6 f6Var = this.c;
        f6Var.c(null, false, true);
        ei0 ei0Var = this.e;
        ei0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof bi0) {
            ei0Var.setAnimation((bi0) drawable);
        } else {
            ei0Var.setImageDrawable(drawable);
        }
        ei0Var.setVisibility(0);
        f6Var.setVisibility(8);
        this.h.setVisibility(8);
        ei0Var.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.Q = charSequence2;
        org.telegram.ui.Components.f6 f6Var = this.c;
        f6Var.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, f6Var.getPaint(), org.telegram.messenger.i0.q.x / 2.5f, TextUtils.TruncateAt.END), z10, true);
        f6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11) {
        CharSequence ellipsize;
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.l(str, false);
        u5Var.i(null);
        org.telegram.ui.Components.f6 f6Var = this.c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.Q = str2;
            ellipsize = TextUtils.ellipsize(str2, f6Var.getPaint(), org.telegram.messenger.i0.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        f6Var.c(ellipsize, z10, true);
        f6Var.setVisibility(0);
        this.d.setVisibility(8);
        f(i11, i12, i10);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
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
        this.x = i10;
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
        if (this.D != z10) {
            this.D = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.u5 u5Var = this.b;
        if (isEmpty) {
            u5Var.setVisibility(8);
        } else {
            u5Var.setVisibility(0);
            u5Var.l(charSequence, false);
        }
    }

    public void setTextColor(int i10) {
        this.M = false;
        this.a.setTextColor(i10);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.K == null) {
            org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(30.0f), this);
            this.K = d5Var;
            if (this.F) {
                d5Var.a();
            }
        }
        this.K.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.s = c(false);
        this.x = 18;
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.Q = charSequence2;
        org.telegram.ui.Components.f6 f6Var = this.c;
        f6Var.c(charSequence2, false, true);
        ei0 ei0Var = this.e;
        ei0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof bi0) {
            ei0Var.setAnimation((bi0) drawable);
        } else {
            ei0Var.setImageDrawable(drawable);
        }
        ei0Var.setVisibility(0);
        f6Var.setVisibility(0);
        this.h.setVisibility(8);
        ei0Var.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, boolean z11) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        ei0 ei0Var = this.e;
        ei0Var.setVisibility(0);
        org.telegram.ui.Components.f6 f6Var = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, org.telegram.messenger.i0.q.x - ((vh.p2.g(charSequence, u5Var.getTextPaint()) + org.telegram.messenger.i0.L(this.s)) + org.telegram.messenger.i0.L(16.0f)));
            this.Q = charSequence2;
            f6Var.c(TextUtils.ellipsize(charSequence2, f6Var.getPaint(), max, TextUtils.TruncateAt.END), z10, true);
        } else {
            f6Var.c("", z10, true);
        }
        f6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        ei0Var.setTranslationX(0.0f);
        ei0Var.setTranslationY(0.0f);
        ei0Var.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        ei0Var.setImageResource(i10);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var = this.E;
        if (this.M || this.N) {
            try {
                a();
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.I6, p6Var);
            int e7 = e(w02);
            int e10 = e(w03);
            if (e7 == w02 && e10 == w03) {
                return;
            }
            this.b.setTextColor(e7);
            this.c.setTextColor(e10);
            this.d.setTextColor(e10);
        } catch (Exception e11) {
            org.telegram.messenger.f8.g(e11, true);
        }
    }

    public final void v(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.l(charSequence, false);
        u5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.f6 f6Var = this.c;
        f6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        f6Var.setVisibility(8);
        this.d.setVisibility(8);
        ei0 ei0Var = this.e;
        ei0Var.setVisibility(8);
        ei0Var.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.d5 d5Var = this.K;
        if (d5Var != null) {
            d5Var.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.f6 f6Var = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.Q = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, f6Var.getPaint(), org.telegram.messenger.i0.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        f6Var.c(ellipsize, z10, true);
    }

    public p8(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(20, context, p6Var, false, false);
    }

    public p8(int i10, Context context, boolean z10) {
        this(i10, context, null, z10, false);
    }

    public p8(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context);
        this.s = 71;
        this.w = 50;
        this.x = 21;
        this.E = p6Var;
        this.n = i10;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.a = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, z10 ? org.telegram.ui.ActionBar.t6.j5 : org.telegram.ui.ActionBar.t6.G6, p6Var);
        u5Var.setTextSize(16);
        u5Var.setGravity(cd.X ? 5 : 3);
        u5Var.setImportantForAccessibility(2);
        addView(u5Var, w7.b6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.b = u5Var2;
        org.telegram.ui.ActionBar.a7.Y(u5Var2, z10 ? org.telegram.ui.ActionBar.t6.p5 : org.telegram.ui.ActionBar.t6.y6, p6Var);
        u5Var2.setTextSize(13);
        u5Var2.setGravity(cd.X ? 5 : 3);
        u5Var2.setImportantForAccessibility(2);
        addView(u5Var2, w7.b6.c(-1.0f, -2));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, true, true);
        this.c = f6Var;
        org.telegram.ui.ActionBar.a7.Z(f6Var, z10 ? org.telegram.ui.ActionBar.t6.n5 : org.telegram.ui.ActionBar.t6.I6, p6Var);
        f6Var.setPadding(0, org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f));
        f6Var.setTextSize(org.telegram.messenger.i0.L(16.0f));
        f6Var.setGravity(cd.X ? 3 : 5);
        f6Var.setImportantForAccessibility(2);
        f6Var.setTranslationY(org.telegram.messenger.i0.L(-2.0f));
        addView(f6Var);
        org.telegram.ui.ActionBar.u5 u5Var3 = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var3;
        Boolean bool = Boolean.FALSE;
        if (!u5Var3.P) {
            u5Var3.n0 = true;
            u5Var3.p0 = bool;
            u5Var3.m();
            u5Var3.b();
        }
        u5Var3.q0 = 18;
        u5Var3.m();
        org.telegram.ui.ActionBar.a7.Y(u5Var3, z10 ? org.telegram.ui.ActionBar.t6.n5 : org.telegram.ui.ActionBar.t6.I6, p6Var);
        u5Var3.setGravity(cd.X ? 3 : 5);
        u5Var3.setTextSize(16);
        u5Var3.setImportantForAccessibility(2);
        u5Var3.setVisibility(8);
        addView(u5Var3);
        ei0 ei0Var = new ei0(context);
        this.e = ei0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ei0Var.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.t(ei0Var, z10 ? org.telegram.ui.ActionBar.t6.J5 : org.telegram.ui.ActionBar.t6.m6, p6Var, PorterDuff.Mode.SRC_IN);
        addView(ei0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z11) {
            Switch r32 = new Switch(context, p6Var);
            this.f = r32;
            int i11 = org.telegram.ui.ActionBar.t6.M6;
            int i12 = org.telegram.ui.ActionBar.t6.N6;
            int i13 = org.telegram.ui.ActionBar.t6.d6;
            r32.d(i11, i12, i13, i13);
            addView(this.f, w7.b6.d(37, 20.0f, (cd.X ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.K == null) {
            org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(30.0f), this);
            this.K = d5Var;
            if (this.F) {
                d5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.P();
        }
        addOnAttachStateChangeListener(new jh.f(imageReceiver, 1));
        imageReceiver.o0(str, "30_30", null, null, 0L);
        this.K.g(new jg.x0(imageReceiver, 6), true);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public int e(int i10) {
        return i10;
    }
}
