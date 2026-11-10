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
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.hz;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class m8 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static final /* synthetic */ int V = 0;
    public boolean D;
    public final org.telegram.ui.ActionBar.h6 E;
    public boolean F;
    public int G;
    public boolean H;
    public float I;
    public float J;
    public org.telegram.ui.Components.f5 K;
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
    public final org.telegram.ui.ActionBar.m5 a;
    public final org.telegram.ui.ActionBar.m5 b;
    public final org.telegram.ui.Components.i6 c;
    public final org.telegram.ui.ActionBar.m5 d;
    public final ch0 e;
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
        hzVar.f = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zk, false);
        hzVar.n = false;
        spannableStringBuilder.setSpan(hzVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        int intValue = m5Var.getTag() instanceof Integer ? ((Integer) m5Var.getTag()).intValue() : org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.m6.w0(intValue, h6Var);
        if (intValue != org.telegram.ui.ActionBar.m6.j5 && intValue != org.telegram.ui.ActionBar.m6.G6) {
            w02 = e(w02);
        }
        if (this.M) {
            m5Var.setTextColor(w02);
        }
        if (this.N) {
            ch0 ch0Var = this.e;
            if (ch0Var.getTag() instanceof Integer) {
                int intValue2 = ((Integer) ch0Var.getTag()).intValue();
                int w03 = org.telegram.ui.ActionBar.m6.w0(intValue2, h6Var);
                if (intValue2 != org.telegram.ui.ActionBar.m6.J5 && intValue2 != org.telegram.ui.ActionBar.m6.m6) {
                    w03 = e(w03);
                }
                if (w03 != this.O || ch0Var.getColorFilter() != this.P) {
                    this.O = w03;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                    this.P = porterDuffColorFilter;
                    ch0Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.b.setTextColor(e(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, h6Var)));
        int i7 = org.telegram.ui.ActionBar.m6.I6;
        this.c.setTextColor(e(org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
        this.d.setTextColor(e(org.telegram.ui.ActionBar.m6.w0(i7, h6Var)));
    }

    public final int c(boolean z9) {
        return this.R ? z9 ? 52 : 58 : z9 ? 65 : 71;
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
                paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, this.E));
            }
            if (this.T) {
                float f10 = this.I + 0.016f;
                this.I = f10;
                if (f10 > 1.0f) {
                    this.I = 1.0f;
                    this.T = false;
                }
            } else {
                float f11 = this.I - 0.016f;
                this.I = f11;
                if (f11 < 0.0f) {
                    this.I = 0.0f;
                    this.T = true;
                }
            }
            int i7 = this.U;
            if (i7 > 0) {
                this.U = i7 - 15;
            } else {
                boolean z9 = this.H;
                if (z9) {
                    float f12 = this.J;
                    if (f12 != 1.0f) {
                        float f13 = f12 + 0.10666667f;
                        this.J = f13;
                        if (f13 > 1.0f) {
                            this.J = 1.0f;
                        }
                    }
                }
                if (!z9) {
                    float f14 = this.J;
                    if (f14 != 0.0f) {
                        float f15 = f14 - 0.10666667f;
                        this.J = f15;
                        if (f15 < 0.0f) {
                            this.J = 0.0f;
                        }
                    }
                }
            }
            this.S.setAlpha((int) (((this.I * 0.4f) + 0.6f) * this.J * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set((getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f)) - org.telegram.messenger.g0.L(this.G), measuredHeight - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(3.0f) + measuredHeight);
            if (id.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.S);
            invalidate();
        }
        float f16 = 1.0f - this.J;
        org.telegram.ui.Components.f5 f5Var = this.K;
        this.c.setAlpha(f16 * (f5Var == null ? 1.0f : 1.0f - f5Var.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f17 = 1.0f - this.J;
        org.telegram.ui.Components.f5 f5Var2 = this.K;
        this.d.setAlpha(f17 * (f5Var2 == null ? 1.0f : 1.0f - f5Var2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.f5 f5Var3 = this.K;
        if (f5Var3 != null) {
            f5Var3.setBounds((getWidth() - this.K.s) - org.telegram.messenger.g0.L(18.0f), (getHeight() - this.K.s) / 2, getWidth() - org.telegram.messenger.g0.L(18.0f), (getHeight() + this.K.s) / 2);
            this.K.draw(canvas);
        }
    }

    public final void f(int i7, int i10, int i11) {
        this.s = c(true);
        ch0 ch0Var = this.e;
        ch0Var.setVisibility(0);
        ch0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        ch0Var.setTranslationX(org.telegram.messenger.g0.L(id.a0 ? 0.0f : -3.0f));
        ch0Var.setImageResource(i11);
        this.N = false;
        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.h6 h6Var = this.E;
        boolean a10 = h6Var != null ? h6Var.a() : org.telegram.ui.ActionBar.m6.I.q();
        da0 da0Var = new da0(1);
        da0Var.b(i7, i10);
        da0Var.b = a10;
        ch0Var.setBackground(da0Var);
    }

    public final void g(int i7, int i10) {
        org.telegram.ui.ActionBar.h6 h6Var = this.E;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.setTextColor(w02);
        m5Var.setTag(Integer.valueOf(i10));
        this.M = true;
        if (i7 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), PorterDuff.Mode.SRC_IN);
            ch0 ch0Var = this.e;
            ch0Var.setColorFilter(porterDuffColorFilter);
            ch0Var.setTag(Integer.valueOf(i7));
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

    public ch0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.m5 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.i6 getValueTextView() {
        return this.c;
    }

    public final void h(int i7, boolean z9, boolean z10) {
        this.H = z9;
        this.G = i7;
        if (!z10) {
            this.J = z9 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void i(boolean z9, boolean z10) {
        super.setEnabled(z9);
        Switch r52 = this.f;
        if (r52 != null) {
            r52.setEnabled(z9);
        }
        this.a.animate().alpha(z9 ? 1.0f : 0.5f).start();
        this.b.animate().alpha(z9 ? 1.0f : 0.5f).start();
        this.c.animate().alpha(z9 ? 1.0f : 0.5f).start();
        this.d.animate().alpha(z9 ? 1.0f : 0.5f).start();
    }

    public final void j(int i7) {
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        if (i7 <= 0) {
            m5Var.i(null);
        } else {
            m5Var.i(new org.telegram.ui.ActionBar.v2(i7, getContext(), this.E, false));
            m5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void k(CharSequence charSequence, boolean z9) {
        this.x = getDefaultImageLeft();
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.i6 i6Var = this.c;
        i6Var.c(null, false, true);
        this.e.setVisibility(8);
        i6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z9;
        setWillNotDraw(!z9);
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z9, boolean z10) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z10;
        Switch r62 = this.f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f.c(z9, false);
        }
        setWillNotDraw(!this.r);
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.g(null, false);
        }
    }

    public final void m(String str, boolean z9, int i7, int i10, boolean z10) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.l(str, false);
        m5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i10, i10, i7);
        if (this.f == null) {
            Switch r11 = new Switch(getContext(), this.E);
            this.f = r11;
            int i11 = org.telegram.ui.ActionBar.m6.M6;
            int i12 = org.telegram.ui.ActionBar.m6.N6;
            int i13 = org.telegram.ui.ActionBar.m6.d6;
            r11.d(i11, i12, i13, i13);
            addView(this.f, c8.ha.d(37, 20.0f, (id.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r112 = this.f;
        if (r112 != null) {
            r112.setVisibility(0);
            this.f.c(z9, false);
        }
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.g(null, false);
        }
    }

    public final void n(int i7, String str, boolean z9) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.l(str, false);
        m5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r12 = this.f;
        if (r12 != null) {
            r12.setVisibility(0);
            this.f.c(z9, false);
        }
        ch0 ch0Var = this.e;
        ch0Var.setVisibility(0);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        ch0Var.setImageResource(i7);
        this.r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.g(null, false);
        }
    }

    public final void o(int i7, CharSequence charSequence, boolean z9) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.i6 i6Var = this.c;
        i6Var.c(null, false, true);
        ch0 ch0Var = this.e;
        ch0Var.setImageResource(i7);
        ch0Var.setVisibility(0);
        i6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.r = z9;
        setWillNotDraw(!z9);
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.r) {
            org.telegram.ui.ActionBar.h6 h6Var = this.E;
            Paint d = h6Var != null ? h6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.m6.k0;
            }
            Paint paint = d;
            int L = org.telegram.messenger.g0.L(this.e.getVisibility() == 0 ? this.y ? 72 : this.s : this.n);
            float f10 = id.a0 ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!id.a0) {
                L = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        CharSequence text = m5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.i6 i6Var = this.c;
        if (!isEmpty) {
            CharSequence text2 = i6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m5Var.getText());
            if (!TextUtils.isEmpty(i6Var.getText())) {
                sb2.append('\n');
                sb2.append(i6Var.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        int i13 = i12 - i10;
        int i14 = i11 - i7;
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        int textHeight = m5Var.getTextHeight();
        org.telegram.ui.Components.i6 i6Var = this.c;
        int max = ((i13 - Math.max(textHeight, i6Var.getTextHeight())) / 2) + 1;
        int L2 = id.a0 ? org.telegram.messenger.g0.L(this.n - 6) : (i14 - i6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.n - 6);
        if (this.D && !id.a0) {
            L2 = (i14 - i6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.n);
        }
        i6Var.layout(L2, max, i6Var.getMeasuredWidth() + L2, i6Var.getMeasuredHeight() + max);
        int L3 = id.a0 ? org.telegram.messenger.g0.L(this.n - 6) : (i14 - m5Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.n - 6);
        m5Var.layout(L3, max, m5Var.getMeasuredWidth() + L3, m5Var.getMeasuredHeight() + max);
        boolean z10 = id.a0;
        ch0 ch0Var = this.e;
        org.telegram.ui.ActionBar.m5 m5Var2 = this.a;
        if (z10) {
            L = (getMeasuredWidth() - m5Var2.getMeasuredWidth()) - org.telegram.messenger.g0.L(ch0Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            L = org.telegram.messenger.g0.L(ch0Var.getVisibility() == 0 ? this.s : this.n);
        }
        org.telegram.ui.ActionBar.m5 m5Var3 = this.b;
        if (m5Var3.getVisibility() == 0) {
            float f10 = this.w > 50 ? 4 : 2;
            int L4 = org.telegram.messenger.g0.L(1.0f) + org.telegram.messenger.camera.q.y(f10, (i13 - m5Var2.getTextHeight()) - m5Var3.getTextHeight(), 2);
            m5Var2.layout(L, L4, m5Var2.getMeasuredWidth() + L, m5Var2.getMeasuredHeight() + L4);
            int L5 = org.telegram.messenger.g0.L(f10) + m5Var2.getTextHeight() + L4;
            m5Var3.layout(L, L5, m5Var3.getMeasuredWidth() + L, m5Var3.getMeasuredHeight() + L5);
        } else {
            int L6 = org.telegram.messenger.g0.L(1.0f) + ((i13 - m5Var2.getTextHeight()) / 2);
            m5Var2.layout(L, L6, m5Var2.getMeasuredWidth() + L, m5Var2.getMeasuredHeight() + L6);
        }
        if (ch0Var.getVisibility() == 0) {
            int L7 = org.telegram.messenger.g0.L(1.0f) + ((((i13 - ch0Var.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.L(this.w > 50 ? 0.0f : 2.0f)) - ch0Var.getPaddingTop());
            int L8 = !id.a0 ? org.telegram.messenger.g0.L(this.x) : (i14 - ch0Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.x);
            ch0Var.layout(L8, L7, ch0Var.getMeasuredWidth() + L8, ch0Var.getMeasuredHeight() + L7);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L9 = org.telegram.messenger.g0.L(1.0f) + ((i13 - imageView.getMeasuredHeight()) / 2);
            int L10 = id.a0 ? org.telegram.messenger.g0.L(23.0f) : (i14 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(23.0f);
            imageView.layout(L10, L9, imageView.getMeasuredWidth() + L10, imageView.getMeasuredHeight() + L9);
        }
        Switch r92 = this.f;
        if (r92 == null || r92.getVisibility() != 0) {
            return;
        }
        int measuredHeight = (i13 - this.f.getMeasuredHeight()) / 2;
        int L11 = id.a0 ? org.telegram.messenger.g0.L(22.0f) : (i14 - this.f.getMeasuredWidth()) - org.telegram.messenger.g0.L(22.0f);
        Switch r10 = this.f;
        r10.layout(L11, measuredHeight, r10.getMeasuredWidth() + L11, this.f.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(this.w);
        int i11 = this.L;
        org.telegram.ui.Components.i6 i6Var = this.c;
        if (i11 != 0 && i11 != size && (charSequence = this.Q) != null) {
            i6Var.c(TextUtils.ellipsize(charSequence, i6Var.getPaint(), org.telegram.messenger.g0.q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.L = size;
        boolean z9 = this.D;
        org.telegram.ui.ActionBar.m5 m5Var = this.b;
        org.telegram.ui.ActionBar.m5 m5Var2 = this.d;
        org.telegram.ui.ActionBar.m5 m5Var3 = this.a;
        if (z9) {
            m5Var3.measure(org.telegram.messenger.camera.q.c(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            m5Var.measure(org.telegram.messenger.camera.q.c(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            i6Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.n + qs.o1)) - m5Var3.getTextWidth(), id.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            m5Var2.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.n + qs.o1)) - m5Var3.getTextWidth(), id.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        } else {
            i6Var.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.g0.L(this.n), id.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            m5Var2.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.g0.L(this.n), id.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            int max = Math.max(i6Var.d(), m5Var2.getTextWidth());
            m5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - org.telegram.messenger.g0.L(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            m5Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        }
        ch0 ch0Var = this.e;
        if (ch0Var.getVisibility() == 0) {
            ch0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
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

    public final void p(CharSequence charSequence, Drawable drawable, boolean z9) {
        this.s = c(false);
        this.x = 18;
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.i6 i6Var = this.c;
        i6Var.c(null, false, true);
        ch0 ch0Var = this.e;
        ch0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof zg0) {
            ch0Var.setAnimation((zg0) drawable);
        } else {
            ch0Var.setImageDrawable(drawable);
        }
        ch0Var.setVisibility(0);
        i6Var.setVisibility(8);
        this.h.setVisibility(8);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
        this.r = z9;
        setWillNotDraw(!z9);
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z9, boolean z10) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.Q = charSequence2;
        org.telegram.ui.Components.i6 i6Var = this.c;
        i6Var.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, i6Var.getPaint(), org.telegram.messenger.g0.q.x / 2.5f, TextUtils.TruncateAt.END), z9, true);
        i6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z9, int i7, int i10, int i11, boolean z10) {
        CharSequence ellipsize;
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.l(str, false);
        m5Var.i(null);
        org.telegram.ui.Components.i6 i6Var = this.c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.Q = str2;
            ellipsize = TextUtils.ellipsize(str2, i6Var.getPaint(), org.telegram.messenger.g0.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        i6Var.c(ellipsize, z9, true);
        i6Var.setVisibility(0);
        this.d.setVisibility(8);
        f(i10, i11, i7);
        this.h.setVisibility(8);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, int i7, boolean z9) {
        u(charSequence, charSequence2, false, i7, z9);
    }

    public void setChecked(boolean z9) {
        this.f.c(z9, true);
    }

    public void setCompactLayout(boolean z9) {
        this.R = z9;
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        i(z9, true);
    }

    public void setImageLeft(int i7) {
        this.x = i7;
    }

    public void setNeedDivider(boolean z9) {
        if (this.r != z9) {
            this.r = z9;
            setWillNotDraw(!z9);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i7) {
        this.s = i7;
    }

    public void setPrioritizeTitleOverValue(boolean z9) {
        if (this.D != z9) {
            this.D = z9;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        org.telegram.ui.ActionBar.m5 m5Var = this.b;
        if (isEmpty) {
            m5Var.setVisibility(8);
        } else {
            m5Var.setVisibility(0);
            m5Var.l(charSequence, false);
        }
    }

    public void setTextColor(int i7) {
        this.M = false;
        this.a.setTextColor(i7);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.K == null) {
            org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(30.0f), this);
            this.K = f5Var;
            if (this.F) {
                f5Var.a();
            }
        }
        this.K.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z9) {
        this.s = c(false);
        this.x = 18;
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.Q = charSequence2;
        org.telegram.ui.Components.i6 i6Var = this.c;
        i6Var.c(charSequence2, false, true);
        ch0 ch0Var = this.e;
        ch0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof zg0) {
            ch0Var.setAnimation((zg0) drawable);
        } else {
            ch0Var.setImageDrawable(drawable);
        }
        ch0Var.setVisibility(0);
        i6Var.setVisibility(0);
        this.h.setVisibility(8);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
        this.r = z9;
        setWillNotDraw(!z9);
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i7, boolean z10) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        ch0 ch0Var = this.e;
        ch0Var.setVisibility(0);
        org.telegram.ui.Components.i6 i6Var = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, org.telegram.messenger.g0.q.x - ((fi.m3.h(charSequence, m5Var.getTextPaint()) + org.telegram.messenger.g0.L(this.s)) + org.telegram.messenger.g0.L(16.0f)));
            this.Q = charSequence2;
            i6Var.c(TextUtils.ellipsize(charSequence2, i6Var.getPaint(), max, TextUtils.TruncateAt.END), z9, true);
        } else {
            i6Var.c("", z9, true);
        }
        i6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        ch0Var.setTranslationX(0.0f);
        ch0Var.setTranslationY(0.0f);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        ch0Var.setImageResource(i7);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r92 = this.f;
        if (r92 != null) {
            r92.setVisibility(8);
        }
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.g(null, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var = this.E;
        if (this.M || this.N) {
            try {
                a();
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, h6Var);
            int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I6, h6Var);
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

    public final void v(CharSequence charSequence, Drawable drawable, boolean z9) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.l(charSequence, false);
        m5Var.i(null);
        this.Q = null;
        org.telegram.ui.Components.i6 i6Var = this.c;
        i6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        i6Var.setVisibility(8);
        this.d.setVisibility(8);
        ch0 ch0Var = this.e;
        ch0Var.setVisibility(8);
        ch0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.r = z9;
        setWillNotDraw(!z9);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.f5 f5Var = this.K;
        if (f5Var != null) {
            f5Var.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z9) {
        CharSequence ellipsize;
        org.telegram.ui.Components.i6 i6Var = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.Q = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, i6Var.getPaint(), org.telegram.messenger.g0.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        i6Var.c(ellipsize, z9, true);
    }

    public m8(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(20, context, h6Var, false, false);
    }

    public m8(int i7, Context context, boolean z9) {
        this(i7, context, null, z9, false);
    }

    public m8(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        super(context);
        this.s = 71;
        this.w = 50;
        this.x = 21;
        this.E = h6Var;
        this.n = i7;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.a = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, z9 ? org.telegram.ui.ActionBar.m6.j5 : org.telegram.ui.ActionBar.m6.G6, h6Var);
        m5Var.setTextSize(16);
        m5Var.setGravity(id.a0 ? 5 : 3);
        m5Var.setImportantForAccessibility(2);
        addView(m5Var, c8.ha.c(-1.0f, -2));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.b = m5Var2;
        org.telegram.ui.ActionBar.t6.X(m5Var2, z9 ? org.telegram.ui.ActionBar.m6.p5 : org.telegram.ui.ActionBar.m6.y6, h6Var);
        m5Var2.setTextSize(13);
        m5Var2.setGravity(id.a0 ? 5 : 3);
        m5Var2.setImportantForAccessibility(2);
        addView(m5Var2, c8.ha.c(-1.0f, -2));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, false, true, true);
        this.c = i6Var;
        org.telegram.ui.ActionBar.t6.Y(i6Var, z9 ? org.telegram.ui.ActionBar.m6.n5 : org.telegram.ui.ActionBar.m6.I6, h6Var);
        i6Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        i6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        i6Var.setGravity(id.a0 ? 3 : 5);
        i6Var.setImportantForAccessibility(2);
        i6Var.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        addView(i6Var);
        org.telegram.ui.ActionBar.m5 m5Var3 = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var3;
        Boolean bool = Boolean.FALSE;
        if (!m5Var3.P) {
            m5Var3.n0 = true;
            m5Var3.p0 = bool;
            m5Var3.m();
            m5Var3.b();
        }
        m5Var3.q0 = 18;
        m5Var3.m();
        org.telegram.ui.ActionBar.t6.X(m5Var3, z9 ? org.telegram.ui.ActionBar.m6.n5 : org.telegram.ui.ActionBar.m6.I6, h6Var);
        m5Var3.setGravity(id.a0 ? 3 : 5);
        m5Var3.setTextSize(16);
        m5Var3.setImportantForAccessibility(2);
        m5Var3.setVisibility(8);
        addView(m5Var3);
        ch0 ch0Var = new ch0(context);
        this.e = ch0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ch0Var.setScaleType(scaleType);
        org.telegram.ui.ActionBar.t6.s(ch0Var, z9 ? org.telegram.ui.ActionBar.m6.J5 : org.telegram.ui.ActionBar.m6.m6, h6Var, PorterDuff.Mode.SRC_IN);
        addView(ch0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z10) {
            Switch r32 = new Switch(context, h6Var);
            this.f = r32;
            int i10 = org.telegram.ui.ActionBar.m6.M6;
            int i11 = org.telegram.ui.ActionBar.m6.N6;
            int i12 = org.telegram.ui.ActionBar.m6.d6;
            r32.d(i10, i11, i12, i12);
            addView(this.f, c8.ha.d(37, 20.0f, (id.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.K == null) {
            org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(30.0f), this);
            this.K = f5Var;
            if (this.F) {
                f5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.P();
        }
        addOnAttachStateChangeListener(new l8(imageReceiver, 0));
        imageReceiver.o0(str, "30_30", null, null, 0L);
        this.K.g(new fi.l3(imageReceiver, 6), true);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public int e(int i7) {
        return i7;
    }
}
