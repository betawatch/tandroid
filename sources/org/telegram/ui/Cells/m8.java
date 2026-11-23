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
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.hz;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class m8 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final /* synthetic */ int W = 0;
    public boolean E;
    public final org.telegram.ui.ActionBar.i6 F;
    public boolean G;
    public int H;
    public boolean I;
    public float J;
    public float K;
    public org.telegram.ui.Components.m5 L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public PorterDuffColorFilter Q;
    public CharSequence R;
    public boolean S;
    public Paint T;
    public boolean U;
    public int V;
    public final org.telegram.ui.ActionBar.n5 a;
    public final org.telegram.ui.ActionBar.n5 b;
    public final org.telegram.ui.Components.n6 c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final qh0 e;
    public Switch f;
    public final ImageView h;
    public int n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public m8(Context context) {
        this(20, context, null, false, false);
    }

    public static SpannableStringBuilder b(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        hz hzVar = new hz();
        hzVar.f = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ck, false);
        hzVar.n = false;
        spannableStringBuilder.setSpan(hzVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        int intValue = n5Var.getTag() instanceof Integer ? ((Integer) n5Var.getTag()).intValue() : org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.F;
        int w02 = org.telegram.ui.ActionBar.n6.w0(intValue, i6Var);
        if (intValue != org.telegram.ui.ActionBar.n6.j5 && intValue != org.telegram.ui.ActionBar.n6.G6) {
            w02 = e(w02);
        }
        if (this.N) {
            n5Var.setTextColor(w02);
        }
        if (this.O) {
            qh0 qh0Var = this.e;
            if (qh0Var.getTag() instanceof Integer) {
                int intValue2 = ((Integer) qh0Var.getTag()).intValue();
                int w03 = org.telegram.ui.ActionBar.n6.w0(intValue2, i6Var);
                if (intValue2 != org.telegram.ui.ActionBar.n6.J5 && intValue2 != org.telegram.ui.ActionBar.n6.m6) {
                    w03 = e(w03);
                }
                if (w03 != this.P || qh0Var.getColorFilter() != this.Q) {
                    this.P = w03;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                    this.Q = porterDuffColorFilter;
                    qh0Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.b.setTextColor(e(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.y6, i6Var)));
        int i7 = org.telegram.ui.ActionBar.n6.I6;
        this.c.setTextColor(e(org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
        this.d.setTextColor(e(org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
    }

    public final int c(boolean z10) {
        return this.S ? z10 ? 52 : 58 : z10 ? 65 : 71;
    }

    public final boolean d() {
        Switch r02 = this.f;
        return r02 != null && r02.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.I || this.K != 0.0f) {
            if (this.T == null) {
                Paint paint = new Paint(1);
                this.T = paint;
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.O5, this.F));
            }
            if (this.U) {
                float f10 = this.J + 0.016f;
                this.J = f10;
                if (f10 > 1.0f) {
                    this.J = 1.0f;
                    this.U = false;
                }
            } else {
                float f11 = this.J - 0.016f;
                this.J = f11;
                if (f11 < 0.0f) {
                    this.J = 0.0f;
                    this.U = true;
                }
            }
            int i7 = this.V;
            if (i7 > 0) {
                this.V = i7 - 15;
            } else {
                boolean z10 = this.I;
                if (z10) {
                    float f12 = this.K;
                    if (f12 != 1.0f) {
                        float f13 = f12 + 0.10666667f;
                        this.K = f13;
                        if (f13 > 1.0f) {
                            this.K = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f14 = this.K;
                    if (f14 != 0.0f) {
                        float f15 = f14 - 0.10666667f;
                        this.K = f15;
                        if (f15 < 0.0f) {
                            this.K = 0.0f;
                        }
                    }
                }
            }
            this.T.setAlpha((int) (((this.J * 0.4f) + 0.6f) * this.K * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f)) - org.telegram.messenger.g0.L(this.H), measuredHeight - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(3.0f) + measuredHeight);
            if (gd.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.T);
            invalidate();
        }
        float f16 = 1.0f - this.K;
        org.telegram.ui.Components.m5 m5Var = this.L;
        this.c.setAlpha(f16 * (m5Var == null ? 1.0f : 1.0f - m5Var.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f17 = 1.0f - this.K;
        org.telegram.ui.Components.m5 m5Var2 = this.L;
        this.d.setAlpha(f17 * (m5Var2 == null ? 1.0f : 1.0f - m5Var2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.m5 m5Var3 = this.L;
        if (m5Var3 != null) {
            m5Var3.setBounds((getWidth() - this.L.s) - org.telegram.messenger.g0.L(18.0f), (getHeight() - this.L.s) / 2, getWidth() - org.telegram.messenger.g0.L(18.0f), (getHeight() + this.L.s) / 2);
            this.L.draw(canvas);
        }
    }

    public final void f(int i7, int i10, int i11) {
        this.s = c(true);
        qh0 qh0Var = this.e;
        qh0Var.setVisibility(0);
        qh0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        qh0Var.setTranslationX(org.telegram.messenger.g0.L(gd.a0 ? 0.0f : -3.0f));
        qh0Var.setImageResource(i11);
        this.O = false;
        qh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.i6 i6Var = this.F;
        boolean b10 = i6Var != null ? i6Var.b() : org.telegram.ui.ActionBar.n6.I.q();
        oa0 oa0Var = new oa0(1);
        oa0Var.b(i7, i10);
        oa0Var.b = b10;
        qh0Var.setBackground(oa0Var);
    }

    public final void g(int i7, int i10) {
        org.telegram.ui.ActionBar.i6 i6Var = this.F;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.setTextColor(w02);
        n5Var.setTag(Integer.valueOf(i10));
        this.N = true;
        if (i7 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), PorterDuff.Mode.SRC_IN);
            qh0 qh0Var = this.e;
            qh0Var.setColorFilter(porterDuffColorFilter);
            qh0Var.setTag(Integer.valueOf(i7));
            this.O = true;
        }
        a();
    }

    public Switch getCheckBox() {
        return this.f;
    }

    public int getDefaultImageLeft() {
        return this.S ? 16 : 21;
    }

    public qh0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.n5 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.n6 getValueTextView() {
        return this.c;
    }

    public final void h(int i7, boolean z10, boolean z11) {
        this.I = z10;
        this.H = i7;
        if (!z11) {
            this.K = z10 ? 1.0f : 0.0f;
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

    public final void j(int i7) {
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        if (i7 <= 0) {
            n5Var.i(null);
        } else {
            n5Var.i(new org.telegram.ui.ActionBar.v2(i7, getContext(), this.F, false));
            n5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void k(CharSequence charSequence, boolean z10) {
        this.x = getDefaultImageLeft();
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.n6 n6Var = this.c;
        n6Var.c(null, false, true);
        this.e.setVisibility(8);
        n6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z10, boolean z11) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        Switch r62 = this.f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f.c(z10, false);
        }
        setWillNotDraw(!this.r);
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.g(null, false);
        }
    }

    public final void m(String str, boolean z10, int i7, int i10, boolean z11) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.l(str, false);
        n5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i10, i10, i7);
        if (this.f == null) {
            Switch r11 = new Switch(getContext(), this.F);
            this.f = r11;
            int i11 = org.telegram.ui.ActionBar.n6.M6;
            int i12 = org.telegram.ui.ActionBar.n6.N6;
            int i13 = org.telegram.ui.ActionBar.n6.d6;
            r11.d(i11, i12, i13, i13);
            addView(this.f, c8.na.d(37, 20.0f, (gd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r112 = this.f;
        if (r112 != null) {
            r112.setVisibility(0);
            this.f.c(z10, false);
        }
        this.r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.g(null, false);
        }
    }

    public final void n(int i7, String str, boolean z10) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.l(str, false);
        n5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r12 = this.f;
        if (r12 != null) {
            r12.setVisibility(0);
            this.f.c(z10, false);
        }
        qh0 qh0Var = this.e;
        qh0Var.setVisibility(0);
        qh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        qh0Var.setImageResource(i7);
        this.r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.g(null, false);
        }
    }

    public final void o(int i7, CharSequence charSequence, boolean z10) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.n6 n6Var = this.c;
        n6Var.c(null, false, true);
        qh0 qh0Var = this.e;
        qh0Var.setImageResource(i7);
        qh0Var.setVisibility(0);
        n6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        qh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.r) {
            org.telegram.ui.ActionBar.i6 i6Var = this.F;
            Paint e10 = i6Var != null ? i6Var.e("paintDivider") : null;
            if (e10 == null) {
                e10 = org.telegram.ui.ActionBar.n6.k0;
            }
            Paint paint = e10;
            int L = org.telegram.messenger.g0.L(this.e.getVisibility() == 0 ? this.y ? 72 : this.s : this.n);
            float f10 = gd.a0 ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!gd.a0) {
                L = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        CharSequence text = n5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.n6 n6Var = this.c;
        if (!isEmpty) {
            CharSequence text2 = n6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(n5Var.getText());
            if (!TextUtils.isEmpty(n6Var.getText())) {
                sb2.append('\n');
                sb2.append(n6Var.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        int i13 = i12 - i10;
        int i14 = i11 - i7;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        int textHeight = n5Var.getTextHeight();
        org.telegram.ui.Components.n6 n6Var = this.c;
        int max = ((i13 - Math.max(textHeight, n6Var.getTextHeight())) / 2) + 1;
        int L2 = gd.a0 ? org.telegram.messenger.g0.L(this.n - 6) : (i14 - n6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.n - 6);
        if (this.E && !gd.a0) {
            L2 = (i14 - n6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.n);
        }
        n6Var.layout(L2, max, n6Var.getMeasuredWidth() + L2, n6Var.getMeasuredHeight() + max);
        int L3 = gd.a0 ? org.telegram.messenger.g0.L(this.n - 6) : (i14 - n5Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.n - 6);
        n5Var.layout(L3, max, n5Var.getMeasuredWidth() + L3, n5Var.getMeasuredHeight() + max);
        boolean z11 = gd.a0;
        qh0 qh0Var = this.e;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.a;
        if (z11) {
            L = (getMeasuredWidth() - n5Var2.getMeasuredWidth()) - org.telegram.messenger.g0.L(qh0Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            L = org.telegram.messenger.g0.L(qh0Var.getVisibility() == 0 ? this.s : this.n);
        }
        org.telegram.ui.ActionBar.n5 n5Var3 = this.b;
        if (n5Var3.getVisibility() == 0) {
            float f10 = this.w > 50 ? 4 : 2;
            int L4 = org.telegram.messenger.g0.L(1.0f) + m10.z(f10, (i13 - n5Var2.getTextHeight()) - n5Var3.getTextHeight(), 2);
            n5Var2.layout(L, L4, n5Var2.getMeasuredWidth() + L, n5Var2.getMeasuredHeight() + L4);
            int L5 = org.telegram.messenger.g0.L(f10) + n5Var2.getTextHeight() + L4;
            n5Var3.layout(L, L5, n5Var3.getMeasuredWidth() + L, n5Var3.getMeasuredHeight() + L5);
        } else {
            int L6 = org.telegram.messenger.g0.L(1.0f) + ((i13 - n5Var2.getTextHeight()) / 2);
            n5Var2.layout(L, L6, n5Var2.getMeasuredWidth() + L, n5Var2.getMeasuredHeight() + L6);
        }
        if (qh0Var.getVisibility() == 0) {
            int L7 = org.telegram.messenger.g0.L(1.0f) + ((((i13 - qh0Var.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.L(this.w > 50 ? 0.0f : 2.0f)) - qh0Var.getPaddingTop());
            int L8 = !gd.a0 ? org.telegram.messenger.g0.L(this.x) : (i14 - qh0Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.x);
            qh0Var.layout(L8, L7, qh0Var.getMeasuredWidth() + L8, qh0Var.getMeasuredHeight() + L7);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L9 = org.telegram.messenger.g0.L(1.0f) + ((i13 - imageView.getMeasuredHeight()) / 2);
            int L10 = gd.a0 ? org.telegram.messenger.g0.L(23.0f) : (i14 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(23.0f);
            imageView.layout(L10, L9, imageView.getMeasuredWidth() + L10, imageView.getMeasuredHeight() + L9);
        }
        Switch r92 = this.f;
        if (r92 == null || r92.getVisibility() != 0) {
            return;
        }
        int measuredHeight = (i13 - this.f.getMeasuredHeight()) / 2;
        int L11 = gd.a0 ? org.telegram.messenger.g0.L(22.0f) : (i14 - this.f.getMeasuredWidth()) - org.telegram.messenger.g0.L(22.0f);
        Switch r10 = this.f;
        r10.layout(L11, measuredHeight, r10.getMeasuredWidth() + L11, this.f.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(this.w);
        int i11 = this.M;
        org.telegram.ui.Components.n6 n6Var = this.c;
        if (i11 != 0 && i11 != size && (charSequence = this.R) != null) {
            n6Var.c(TextUtils.ellipsize(charSequence, n6Var.getPaint(), org.telegram.messenger.g0.q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.M = size;
        boolean z10 = this.E;
        org.telegram.ui.ActionBar.n5 n5Var = this.b;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.d;
        org.telegram.ui.ActionBar.n5 n5Var3 = this.a;
        if (z10) {
            n5Var3.measure(m10.c(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            n5Var.measure(m10.c(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            n6Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.n + ks.o1)) - n5Var3.getTextWidth(), gd.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            n5Var2.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.n + ks.o1)) - n5Var3.getTextWidth(), gd.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        } else {
            n6Var.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.g0.L(this.n), gd.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            n5Var2.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.g0.L(this.n), gd.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            int max = Math.max(n6Var.d(), n5Var2.getTextWidth());
            n5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - org.telegram.messenger.g0.L(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            n5Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        }
        qh0 qh0Var = this.e;
        if (qh0Var.getVisibility() == 0) {
            qh0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        Switch r02 = this.f;
        if (r02 != null) {
            r02.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(37.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, L + (this.r ? 1 : 0));
    }

    public final void p(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.s = c(false);
        this.x = 18;
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.n6 n6Var = this.c;
        n6Var.c(null, false, true);
        qh0 qh0Var = this.e;
        qh0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof nh0) {
            qh0Var.setAnimation((nh0) drawable);
        } else {
            qh0Var.setImageDrawable(drawable);
        }
        qh0Var.setVisibility(0);
        n6Var.setVisibility(8);
        this.h.setVisibility(8);
        qh0Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.R = charSequence2;
        org.telegram.ui.Components.n6 n6Var = this.c;
        n6Var.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, n6Var.getPaint(), org.telegram.messenger.g0.q.x / 2.5f, TextUtils.TruncateAt.END), z10, true);
        n6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z10, int i7, int i10, int i11, boolean z11) {
        CharSequence ellipsize;
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.l(str, false);
        n5Var.i(null);
        org.telegram.ui.Components.n6 n6Var = this.c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.R = str2;
            ellipsize = TextUtils.ellipsize(str2, n6Var.getPaint(), org.telegram.messenger.g0.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        n6Var.c(ellipsize, z10, true);
        n6Var.setVisibility(0);
        this.d.setVisibility(8);
        f(i10, i11, i7);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, int i7, boolean z10) {
        u(charSequence, charSequence2, false, i7, z10);
    }

    public void setChecked(boolean z10) {
        this.f.c(z10, true);
    }

    public void setCompactLayout(boolean z10) {
        this.S = z10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        i(z10, true);
    }

    public void setImageLeft(int i7) {
        this.x = i7;
    }

    public void setNeedDivider(boolean z10) {
        if (this.r != z10) {
            this.r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i7) {
        this.s = i7;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.n5 n5Var = this.b;
        if (isEmpty) {
            n5Var.setVisibility(8);
        } else {
            n5Var.setVisibility(0);
            n5Var.l(charSequence, false);
        }
    }

    public void setTextColor(int i7) {
        this.N = false;
        this.a.setTextColor(i7);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.L == null) {
            org.telegram.ui.Components.m5 m5Var = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(30.0f), this);
            this.L = m5Var;
            if (this.G) {
                m5Var.a();
            }
        }
        this.L.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.s = c(false);
        this.x = 18;
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.R = charSequence2;
        org.telegram.ui.Components.n6 n6Var = this.c;
        n6Var.c(charSequence2, false, true);
        qh0 qh0Var = this.e;
        qh0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof nh0) {
            qh0Var.setAnimation((nh0) drawable);
        } else {
            qh0Var.setImageDrawable(drawable);
        }
        qh0Var.setVisibility(0);
        n6Var.setVisibility(0);
        this.h.setVisibility(8);
        qh0Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i7, boolean z11) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        qh0 qh0Var = this.e;
        qh0Var.setVisibility(0);
        org.telegram.ui.Components.n6 n6Var = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, org.telegram.messenger.g0.q.x - ((hi.u3.h(charSequence, n5Var.getTextPaint()) + org.telegram.messenger.g0.L(this.s)) + org.telegram.messenger.g0.L(16.0f)));
            this.R = charSequence2;
            n6Var.c(TextUtils.ellipsize(charSequence2, n6Var.getPaint(), max, TextUtils.TruncateAt.END), z10, true);
        } else {
            n6Var.c("", z10, true);
        }
        n6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        qh0Var.setTranslationX(0.0f);
        qh0Var.setTranslationY(0.0f);
        qh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        qh0Var.setImageResource(i7);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r92 = this.f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.g(null, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var = this.F;
        if (this.N || this.O) {
            try {
                a();
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.y6, i6Var);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.I6, i6Var);
            int e11 = e(w02);
            int e12 = e(w03);
            if (e11 == w02 && e12 == w03) {
                return;
            }
            this.b.setTextColor(e11);
            this.c.setTextColor(e12);
            this.d.setTextColor(e12);
        } catch (Exception e13) {
            org.telegram.messenger.a8.g(e13, true);
        }
    }

    public final void v(CharSequence charSequence, Drawable drawable, boolean z10) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.l(charSequence, false);
        n5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.n6 n6Var = this.c;
        n6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        n6Var.setVisibility(8);
        this.d.setVisibility(8);
        qh0 qh0Var = this.e;
        qh0Var.setVisibility(8);
        qh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.m5 m5Var = this.L;
        if (m5Var != null) {
            m5Var.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.n6 n6Var = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.R = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, n6Var.getPaint(), org.telegram.messenger.g0.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        n6Var.c(ellipsize, z10, true);
    }

    public m8(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(20, context, i6Var, false, false);
    }

    public m8(int i7, Context context, boolean z10) {
        this(i7, context, null, z10, false);
    }

    public m8(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(context);
        this.s = 71;
        this.w = 50;
        this.x = 21;
        this.F = i6Var;
        this.n = i7;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.a = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, z10 ? org.telegram.ui.ActionBar.n6.j5 : org.telegram.ui.ActionBar.n6.G6, i6Var);
        n5Var.setTextSize(16);
        n5Var.setGravity(gd.a0 ? 5 : 3);
        n5Var.setImportantForAccessibility(2);
        addView(n5Var, c8.na.c(-1.0f, -2));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var2;
        org.telegram.ui.ActionBar.u6.X(n5Var2, z10 ? org.telegram.ui.ActionBar.n6.p5 : org.telegram.ui.ActionBar.n6.y6, i6Var);
        n5Var2.setTextSize(13);
        n5Var2.setGravity(gd.a0 ? 5 : 3);
        n5Var2.setImportantForAccessibility(2);
        addView(n5Var2, c8.na.c(-1.0f, -2));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
        this.c = n6Var;
        org.telegram.ui.ActionBar.u6.Y(n6Var, z10 ? org.telegram.ui.ActionBar.n6.n5 : org.telegram.ui.ActionBar.n6.I6, i6Var);
        n6Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        n6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        n6Var.setGravity(gd.a0 ? 3 : 5);
        n6Var.setImportantForAccessibility(2);
        n6Var.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        addView(n6Var);
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var3;
        Boolean bool = Boolean.FALSE;
        if (!n5Var3.Q) {
            n5Var3.o0 = true;
            n5Var3.q0 = bool;
            n5Var3.m();
            n5Var3.b();
        }
        n5Var3.r0 = 18;
        n5Var3.m();
        org.telegram.ui.ActionBar.u6.X(n5Var3, z10 ? org.telegram.ui.ActionBar.n6.n5 : org.telegram.ui.ActionBar.n6.I6, i6Var);
        n5Var3.setGravity(gd.a0 ? 3 : 5);
        n5Var3.setTextSize(16);
        n5Var3.setImportantForAccessibility(2);
        n5Var3.setVisibility(8);
        addView(n5Var3);
        qh0 qh0Var = new qh0(context);
        this.e = qh0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        qh0Var.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(qh0Var, z10 ? org.telegram.ui.ActionBar.n6.J5 : org.telegram.ui.ActionBar.n6.m6, i6Var, PorterDuff.Mode.SRC_IN);
        addView(qh0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z11) {
            Switch r32 = new Switch(context, i6Var);
            this.f = r32;
            int i10 = org.telegram.ui.ActionBar.n6.M6;
            int i11 = org.telegram.ui.ActionBar.n6.N6;
            int i12 = org.telegram.ui.ActionBar.n6.d6;
            r32.d(i10, i11, i12, i12);
            addView(this.f, c8.na.d(37, 20.0f, (gd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.L == null) {
            org.telegram.ui.Components.m5 m5Var = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(30.0f), this);
            this.L = m5Var;
            if (this.G) {
                m5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.Q();
        }
        addOnAttachStateChangeListener(new l8(imageReceiver, 0));
        imageReceiver.p0(str, "30_30", null, null, 0L);
        this.L.g(new hi.t3(imageReceiver, 6), true);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public int e(int i7) {
        return i7;
    }
}
