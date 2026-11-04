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
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.cz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class l8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final /* synthetic */ int W = 0;
    public boolean E;
    public final org.telegram.ui.ActionBar.e6 F;
    public boolean G;
    public int H;
    public boolean I;
    public float J;
    public float K;
    public org.telegram.ui.Components.e5 L;
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
    public final org.telegram.ui.ActionBar.k5 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final org.telegram.ui.Components.h6 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final fh0 e;
    public Switch f;
    public final ImageView h;
    public int n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public l8(Context context) {
        this(20, context, null, false, false);
    }

    public static SpannableStringBuilder b(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) "  d");
        cz czVar = new cz();
        czVar.f = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false);
        czVar.n = false;
        spannableStringBuilder.setSpan(czVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        int intValue = k5Var.getTag() instanceof Integer ? ((Integer) k5Var.getTag()).intValue() : org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.F;
        int w02 = org.telegram.ui.ActionBar.k6.w0(intValue, e6Var);
        if (intValue != org.telegram.ui.ActionBar.k6.j5 && intValue != org.telegram.ui.ActionBar.k6.G6) {
            w02 = e(w02);
        }
        if (this.N) {
            k5Var.setTextColor(w02);
        }
        if (this.O) {
            fh0 fh0Var = this.e;
            if (fh0Var.getTag() instanceof Integer) {
                int intValue2 = ((Integer) fh0Var.getTag()).intValue();
                int w03 = org.telegram.ui.ActionBar.k6.w0(intValue2, e6Var);
                if (intValue2 != org.telegram.ui.ActionBar.k6.J5 && intValue2 != org.telegram.ui.ActionBar.k6.m6) {
                    w03 = e(w03);
                }
                if (w03 != this.P || fh0Var.getColorFilter() != this.Q) {
                    this.P = w03;
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                    this.Q = porterDuffColorFilter;
                    fh0Var.setColorFilter(porterDuffColorFilter);
                }
            }
        }
        this.b.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, e6Var)));
        int i3 = org.telegram.ui.ActionBar.k6.I6;
        this.c.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
        this.d.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
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
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, this.F));
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
            int i3 = this.V;
            if (i3 > 0) {
                this.V = i3 - 15;
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
            if (bd.a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.T);
            invalidate();
        }
        float f16 = 1.0f - this.K;
        org.telegram.ui.Components.e5 e5Var = this.L;
        this.c.setAlpha(f16 * (e5Var == null ? 1.0f : 1.0f - e5Var.e()) * (isEnabled() ? 1.0f : 0.5f));
        float f17 = 1.0f - this.K;
        org.telegram.ui.Components.e5 e5Var2 = this.L;
        this.d.setAlpha(f17 * (e5Var2 == null ? 1.0f : 1.0f - e5Var2.e()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        org.telegram.ui.Components.e5 e5Var3 = this.L;
        if (e5Var3 != null) {
            e5Var3.setBounds((getWidth() - this.L.s) - org.telegram.messenger.g0.L(18.0f), (getHeight() - this.L.s) / 2, getWidth() - org.telegram.messenger.g0.L(18.0f), (getHeight() + this.L.s) / 2);
            this.L.draw(canvas);
        }
    }

    public final void f(int i3, int i10, int i11) {
        this.s = c(true);
        fh0 fh0Var = this.e;
        fh0Var.setVisibility(0);
        fh0Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        fh0Var.setTranslationX(org.telegram.messenger.g0.L(bd.a0 ? 0.0f : -3.0f));
        fh0Var.setImageResource(i11);
        this.O = false;
        fh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        org.telegram.ui.ActionBar.e6 e6Var = this.F;
        boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
        y90 y90Var = new y90(1);
        y90Var.b(i3, i10);
        y90Var.b = a10;
        fh0Var.setBackground(y90Var);
    }

    public final void g(int i3, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.F;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.setTextColor(w02);
        k5Var.setTag(Integer.valueOf(i10));
        this.N = true;
        if (i3 >= 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), PorterDuff.Mode.SRC_IN);
            fh0 fh0Var = this.e;
            fh0Var.setColorFilter(porterDuffColorFilter);
            fh0Var.setTag(Integer.valueOf(i3));
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

    public fh0 getImageView() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.k5 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.h;
    }

    public org.telegram.ui.Components.h6 getValueTextView() {
        return this.c;
    }

    public final void h(int i3, boolean z10, boolean z11) {
        this.I = z10;
        this.H = i3;
        if (!z11) {
            this.K = z10 ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public final void i(boolean z10, boolean z11) {
        super.setEnabled(z10);
        Switch r5 = this.f;
        if (r5 != null) {
            r5.setEnabled(z10);
        }
        this.a.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.b.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.c.animate().alpha(z10 ? 1.0f : 0.5f).start();
        this.d.animate().alpha(z10 ? 1.0f : 0.5f).start();
    }

    public final void j(int i3) {
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        if (i3 <= 0) {
            k5Var.i(null);
        } else {
            k5Var.i(new org.telegram.ui.ActionBar.s2(i3, getContext(), this.F, false));
            k5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        }
    }

    public final void k(CharSequence charSequence, boolean z10) {
        this.x = getDefaultImageLeft();
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.h6 h6Var = this.c;
        h6Var.c(null, false, true);
        this.e.setVisibility(8);
        h6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void l(CharSequence charSequence, boolean z10, boolean z11) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        Switch r62 = this.f;
        if (r62 != null) {
            r62.setVisibility(0);
            this.f.c(z10, false);
        }
        setWillNotDraw(!this.r);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void m(String str, boolean z10, int i3, int i10, boolean z11) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(str, false);
        k5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        f(i10, i10, i3);
        if (this.f == null) {
            Switch r11 = new Switch(getContext(), this.F);
            this.f = r11;
            int i11 = org.telegram.ui.ActionBar.k6.M6;
            int i12 = org.telegram.ui.ActionBar.k6.N6;
            int i13 = org.telegram.ui.ActionBar.k6.d6;
            r11.d(i11, i12, i13, i13);
            addView(this.f, mf.d(37, 20.0f, (bd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r112 = this.f;
        if (r112 != null) {
            r112.setVisibility(0);
            this.f.c(z10, false);
        }
        this.r = z11;
        setWillNotDraw(!z11);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void n(int i3, String str, boolean z10) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(str, false);
        k5Var.i(null);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        Switch r12 = this.f;
        if (r12 != null) {
            r12.setVisibility(0);
            this.f.c(z10, false);
        }
        fh0 fh0Var = this.e;
        fh0Var.setVisibility(0);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        fh0Var.setImageResource(i3);
        this.r = false;
        setWillNotDraw(true);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void o(int i3, CharSequence charSequence, boolean z10) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.h6 h6Var = this.c;
        h6Var.c(null, false, true);
        fh0 fh0Var = this.e;
        fh0Var.setImageResource(i3);
        fh0Var.setVisibility(0);
        h6Var.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.b();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.r) {
            org.telegram.ui.ActionBar.e6 e6Var = this.F;
            Paint d = e6Var != null ? e6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.k6.k0;
            }
            Paint paint = d;
            int L = org.telegram.messenger.g0.L(this.e.getVisibility() == 0 ? this.y ? 72 : this.s : this.n);
            float f10 = bd.a0 ? 0.0f : L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!bd.a0) {
                L = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - L, getMeasuredHeight() - 1, paint);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        CharSequence text = k5Var.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        org.telegram.ui.Components.h6 h6Var = this.c;
        if (!isEmpty) {
            CharSequence text2 = h6Var.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.f != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.f.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(k5Var.getText());
            if (!TextUtils.isEmpty(h6Var.getText())) {
                sb2.append('\n');
                sb2.append(h6Var.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb2);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int L;
        int i13 = i12 - i10;
        int i14 = i11 - i3;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        int textHeight = k5Var.getTextHeight();
        org.telegram.ui.Components.h6 h6Var = this.c;
        int max = ((i13 - Math.max(textHeight, h6Var.getTextHeight())) / 2) + 1;
        int L2 = bd.a0 ? org.telegram.messenger.g0.L(this.n - 6) : (i14 - h6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.n - 6);
        if (this.E && !bd.a0) {
            L2 = (i14 - h6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.n);
        }
        h6Var.layout(L2, max, h6Var.getMeasuredWidth() + L2, h6Var.getMeasuredHeight() + max);
        int L3 = bd.a0 ? org.telegram.messenger.g0.L(this.n - 6) : (i14 - k5Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.n - 6);
        k5Var.layout(L3, max, k5Var.getMeasuredWidth() + L3, k5Var.getMeasuredHeight() + max);
        boolean z11 = bd.a0;
        fh0 fh0Var = this.e;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.a;
        if (z11) {
            L = (getMeasuredWidth() - k5Var2.getMeasuredWidth()) - org.telegram.messenger.g0.L(fh0Var.getVisibility() == 0 ? this.s : this.n);
        } else {
            L = org.telegram.messenger.g0.L(fh0Var.getVisibility() == 0 ? this.s : this.n);
        }
        org.telegram.ui.ActionBar.k5 k5Var3 = this.b;
        if (k5Var3.getVisibility() == 0) {
            float f10 = this.w > 50 ? 4 : 2;
            int L4 = org.telegram.messenger.g0.L(1.0f) + org.telegram.messenger.camera.q.y(f10, (i13 - k5Var2.getTextHeight()) - k5Var3.getTextHeight(), 2);
            k5Var2.layout(L, L4, k5Var2.getMeasuredWidth() + L, k5Var2.getMeasuredHeight() + L4);
            int L5 = org.telegram.messenger.g0.L(f10) + k5Var2.getTextHeight() + L4;
            k5Var3.layout(L, L5, k5Var3.getMeasuredWidth() + L, k5Var3.getMeasuredHeight() + L5);
        } else {
            int L6 = org.telegram.messenger.g0.L(1.0f) + ((i13 - k5Var2.getTextHeight()) / 2);
            k5Var2.layout(L, L6, k5Var2.getMeasuredWidth() + L, k5Var2.getMeasuredHeight() + L6);
        }
        if (fh0Var.getVisibility() == 0) {
            int L7 = org.telegram.messenger.g0.L(1.0f) + ((((i13 - fh0Var.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.L(this.w > 50 ? 0.0f : 2.0f)) - fh0Var.getPaddingTop());
            int L8 = !bd.a0 ? org.telegram.messenger.g0.L(this.x) : (i14 - fh0Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(this.x);
            fh0Var.layout(L8, L7, fh0Var.getMeasuredWidth() + L8, fh0Var.getMeasuredHeight() + L7);
        }
        ImageView imageView = this.h;
        if (imageView.getVisibility() == 0) {
            int L9 = org.telegram.messenger.g0.L(1.0f) + ((i13 - imageView.getMeasuredHeight()) / 2);
            int L10 = bd.a0 ? org.telegram.messenger.g0.L(23.0f) : (i14 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(23.0f);
            imageView.layout(L10, L9, imageView.getMeasuredWidth() + L10, imageView.getMeasuredHeight() + L9);
        }
        Switch r9 = this.f;
        if (r9 == null || r9.getVisibility() != 0) {
            return;
        }
        int measuredHeight = (i13 - this.f.getMeasuredHeight()) / 2;
        int L11 = bd.a0 ? org.telegram.messenger.g0.L(22.0f) : (i14 - this.f.getMeasuredWidth()) - org.telegram.messenger.g0.L(22.0f);
        Switch r10 = this.f;
        r10.layout(L11, measuredHeight, r10.getMeasuredWidth() + L11, this.f.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i3);
        int L = org.telegram.messenger.g0.L(this.w);
        int i11 = this.M;
        org.telegram.ui.Components.h6 h6Var = this.c;
        if (i11 != 0 && i11 != size && (charSequence = this.R) != null) {
            h6Var.c(TextUtils.ellipsize(charSequence, h6Var.getPaint(), org.telegram.messenger.g0.q.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.M = size;
        boolean z10 = this.E;
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.d;
        org.telegram.ui.ActionBar.k5 k5Var3 = this.a;
        if (z10) {
            k5Var3.measure(org.telegram.messenger.camera.q.c(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            k5Var.measure(org.telegram.messenger.camera.q.c(this.n + 71, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            h6Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.n + hs.o1)) - k5Var3.getTextWidth(), bd.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            k5Var2.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.n + hs.o1)) - k5Var3.getTextWidth(), bd.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        } else {
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.g0.L(this.n), bd.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            k5Var2.measure(View.MeasureSpec.makeMeasureSpec(size - org.telegram.messenger.g0.L(this.n), bd.a0 ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            int max = Math.max(h6Var.d(), k5Var2.getTextWidth());
            k5Var3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - org.telegram.messenger.g0.L(this.n + 71)) - max), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
            k5Var.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(this.n + 71)) - max, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        }
        fh0 fh0Var = this.e;
        if (fh0Var.getVisibility() == 0) {
            fh0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
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
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.h6 h6Var = this.c;
        h6Var.c(null, false, true);
        fh0 fh0Var = this.e;
        fh0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof ch0) {
            fh0Var.setAnimation((ch0) drawable);
        } else {
            fh0Var.setImageDrawable(drawable);
        }
        fh0Var.setVisibility(0);
        h6Var.setVisibility(8);
        this.h.setVisibility(8);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void q(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.R = charSequence2;
        org.telegram.ui.Components.h6 h6Var = this.c;
        h6Var.c(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, h6Var.getPaint(), org.telegram.messenger.g0.q.x / 2.5f, TextUtils.TruncateAt.END), z10, true);
        h6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void r(String str, String str2, boolean z10, int i3, int i10, int i11, boolean z11) {
        CharSequence ellipsize;
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(str, false);
        k5Var.i(null);
        org.telegram.ui.Components.h6 h6Var = this.c;
        if (str2 == null) {
            ellipsize = "";
        } else {
            this.R = str2;
            ellipsize = TextUtils.ellipsize(str2, h6Var.getPaint(), org.telegram.messenger.g0.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        h6Var.c(ellipsize, z10, true);
        h6Var.setVisibility(0);
        this.d.setVisibility(8);
        f(i10, i11, i3);
        this.h.setVisibility(8);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void s(CharSequence charSequence, CharSequence charSequence2, int i3, boolean z10) {
        u(charSequence, charSequence2, false, i3, z10);
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

    public void setImageLeft(int i3) {
        this.x = i3;
    }

    public void setNeedDivider(boolean z10) {
        if (this.r != z10) {
            this.r = z10;
            setWillNotDraw(!z10);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i3) {
        this.s = i3;
    }

    public void setPrioritizeTitleOverValue(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
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

    public void setTextColor(int i3) {
        this.N = false;
        this.a.setTextColor(i3);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.L == null) {
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(30.0f), this);
            this.L = e5Var;
            if (this.G) {
                e5Var.a();
            }
        }
        this.L.h(document, 1, true);
        invalidate();
    }

    public final void t(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z10) {
        this.s = c(false);
        this.x = 18;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.R = charSequence2;
        org.telegram.ui.Components.h6 h6Var = this.c;
        h6Var.c(charSequence2, false, true);
        fh0 fh0Var = this.e;
        fh0Var.setColorFilter((ColorFilter) null);
        if (drawable instanceof ch0) {
            fh0Var.setAnimation((ch0) drawable);
        } else {
            fh0Var.setImageDrawable(drawable);
        }
        fh0Var.setVisibility(0);
        h6Var.setVisibility(0);
        this.h.setVisibility(8);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void u(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i3, boolean z11) {
        this.x = getDefaultImageLeft();
        this.s = c(false);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        fh0 fh0Var = this.e;
        fh0Var.setVisibility(0);
        org.telegram.ui.Components.h6 h6Var = this.c;
        if (charSequence2 != null) {
            int max = (int) Math.max(1.0f, org.telegram.messenger.g0.q.x - ((gi.l3.h(charSequence, k5Var.getTextPaint()) + org.telegram.messenger.g0.L(this.s)) + org.telegram.messenger.g0.L(16.0f)));
            this.R = charSequence2;
            h6Var.c(TextUtils.ellipsize(charSequence2, h6Var.getPaint(), max, TextUtils.TruncateAt.END), z10, true);
        } else {
            h6Var.c("", z10, true);
        }
        h6Var.setVisibility(0);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        fh0Var.setTranslationX(0.0f);
        fh0Var.setTranslationY(0.0f);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        fh0Var.setImageResource(i3);
        this.r = z11;
        setWillNotDraw(!z11);
        Switch r9 = this.f;
        if (r9 != null) {
            r9.setVisibility(8);
        }
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.F;
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
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, e6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I6, e6Var);
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
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(charSequence, false);
        k5Var.i(null);
        this.R = null;
        org.telegram.ui.Components.h6 h6Var = this.c;
        h6Var.c(null, false, true);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        h6Var.setVisibility(8);
        this.d.setVisibility(8);
        fh0 fh0Var = this.e;
        fh0Var.setVisibility(8);
        fh0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.r = z10;
        setWillNotDraw(!z10);
        Switch r72 = this.f;
        if (r72 != null) {
            r72.setVisibility(8);
        }
        org.telegram.ui.Components.e5 e5Var = this.L;
        if (e5Var != null) {
            e5Var.g(null, false);
        }
    }

    public final void w(CharSequence charSequence, boolean z10) {
        CharSequence ellipsize;
        org.telegram.ui.Components.h6 h6Var = this.c;
        if (charSequence == null) {
            ellipsize = "";
        } else {
            this.R = charSequence;
            ellipsize = TextUtils.ellipsize(charSequence, h6Var.getPaint(), org.telegram.messenger.g0.q.x / 2.5f, TextUtils.TruncateAt.END);
        }
        h6Var.c(ellipsize, z10, true);
    }

    public l8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(20, context, e6Var, false, false);
    }

    public l8(int i3, Context context, boolean z10) {
        this(i3, context, null, z10, false);
    }

    public l8(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.s = 71;
        this.w = 50;
        this.x = 21;
        this.F = e6Var;
        this.n = i3;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.a = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, z10 ? org.telegram.ui.ActionBar.k6.j5 : org.telegram.ui.ActionBar.k6.G6, e6Var);
        k5Var.setTextSize(16);
        k5Var.setGravity(bd.a0 ? 5 : 3);
        k5Var.setImportantForAccessibility(2);
        addView(k5Var, mf.c(-1.0f, -2));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var2;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, z10 ? org.telegram.ui.ActionBar.k6.p5 : org.telegram.ui.ActionBar.k6.y6, e6Var);
        k5Var2.setTextSize(13);
        k5Var2.setGravity(bd.a0 ? 5 : 3);
        k5Var2.setImportantForAccessibility(2);
        addView(k5Var2, mf.c(-1.0f, -2));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.c = h6Var;
        org.telegram.ui.ActionBar.r6.Z(h6Var, z10 ? org.telegram.ui.ActionBar.k6.n5 : org.telegram.ui.ActionBar.k6.I6, e6Var);
        h6Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        h6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        h6Var.setGravity(bd.a0 ? 3 : 5);
        h6Var.setImportantForAccessibility(2);
        h6Var.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        addView(h6Var);
        org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var3;
        Boolean bool = Boolean.FALSE;
        if (!k5Var3.Q) {
            k5Var3.o0 = true;
            k5Var3.q0 = bool;
            k5Var3.m();
            k5Var3.b();
        }
        k5Var3.r0 = 18;
        k5Var3.m();
        org.telegram.ui.ActionBar.r6.Y(k5Var3, z10 ? org.telegram.ui.ActionBar.k6.n5 : org.telegram.ui.ActionBar.k6.I6, e6Var);
        k5Var3.setGravity(bd.a0 ? 3 : 5);
        k5Var3.setTextSize(16);
        k5Var3.setImportantForAccessibility(2);
        k5Var3.setVisibility(8);
        addView(k5Var3);
        fh0 fh0Var = new fh0(context);
        this.e = fh0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        fh0Var.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(fh0Var, z10 ? org.telegram.ui.ActionBar.k6.J5 : org.telegram.ui.ActionBar.k6.m6, e6Var, PorterDuff.Mode.SRC_IN);
        addView(fh0Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z11) {
            Switch r32 = new Switch(context, e6Var);
            this.f = r32;
            int i10 = org.telegram.ui.ActionBar.k6.M6;
            int i11 = org.telegram.ui.ActionBar.k6.N6;
            int i12 = org.telegram.ui.ActionBar.k6.d6;
            r32.d(i10, i11, i12, i12);
            addView(this.f, mf.d(37, 20.0f, (bd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.L == null) {
            org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(30.0f), this);
            this.L = e5Var;
            if (this.G) {
                e5Var.a();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.P();
        }
        addOnAttachStateChangeListener(new k8(imageReceiver, 0));
        imageReceiver.o0(str, "30_30", null, null, 0L);
        this.L.g(new gi.k3(imageReceiver, 6), true);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public int e(int i3) {
        return i3;
    }
}
