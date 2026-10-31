package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class xn extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int L = 0;
    public boolean D;
    public boolean E;
    public AnimatorSet F;
    public boolean G;
    public boolean H;
    public float I;
    public int J;
    public boolean K;
    public TLRPC.Document a;
    public final TextView b;
    public final TextView c;
    public wn d;
    public final int e;
    public final FrameLayout f;
    public g9 h;
    public g9 n;
    public final org.telegram.ui.ActionBar.p6 r;
    public boolean s;
    public ei0 w;
    public TextView x;
    public bi.j6 y;

    public xn(Context context, int i10, TLRPC.Document document, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        setOrientation(1);
        this.e = i10;
        this.r = p6Var;
        setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        g9 g9Var = new g9(context);
        this.h = g9Var;
        g9Var.getImageReceiver().R0 = true;
        frameLayout.addView(this.h, w7.b6.c(112.0f, org.telegram.messenger.zs.x1));
        w7.e6.a(this.h);
        g9 g9Var2 = new g9(context);
        this.n = g9Var2;
        g9Var2.getImageReceiver().R0 = true;
        frameLayout.addView(this.n, w7.b6.c(112.0f, org.telegram.messenger.zs.x1));
        this.n.setVisibility(8);
        this.n.setAlpha(0.0f);
        w7.e6.a(this.n);
        e();
        updateColors();
        String L0 = org.telegram.messenger.cd.L0(2131748210, null);
        String L02 = org.telegram.messenger.cd.L0(2131748208, null);
        textView.setText(L0);
        textView2.setText(L02);
        textView2.setMaxWidth(vh.p2.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.a = document;
        if (document == null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i10);
            TLRPC.Document document2 = b02.y0;
            b02.n1();
            this.a = document2;
        }
    }

    public static void a(xn xnVar) {
        AnimatorSet animatorSet = xnVar.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        xnVar.n.setVisibility(0);
        xnVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        xnVar.F = animatorSet2;
        animatorSet2.setDuration(420L);
        xnVar.F.setInterpolator(gr.h);
        xnVar.F.addListener(new eg.m(xnVar));
        AnimatorSet animatorSet3 = xnVar.F;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xnVar.n, (Property<g9, Float>) property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(xnVar.n, (Property<g9, Float>) property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(xnVar.n, (Property<g9, Float>) property3, 0.7f, 1.0f), ObjectAnimator.ofFloat(xnVar.n, (Property<g9, Float>) property4, -org.telegram.messenger.i0.L(24.0f), 0.0f), ObjectAnimator.ofFloat(xnVar.h, (Property<g9, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(xnVar.h, (Property<g9, Float>) property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(xnVar.h, (Property<g9, Float>) property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(xnVar.h, (Property<g9, Float>) property4, 0.0f, org.telegram.messenger.i0.L(24.0f)));
        xnVar.F.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f7;
        int i10;
        if (org.telegram.messenger.i0.Q1()) {
            min = org.telegram.messenger.i0.Q0();
            f7 = 0.4f;
        } else {
            Point point = org.telegram.messenger.i0.q;
            min = Math.min(point.x, point.y);
            f7 = 0.5f;
        }
        float f10 = min * f7;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= document.attributes.size()) {
                i10 = 0;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                i11 = documentAttribute.w;
                i10 = documentAttribute.h;
                break;
            }
            i12++;
        }
        if (org.telegram.messenger.jj.K2(document, true) && i11 == 0 && i10 == 0) {
            i11 = 512;
            i10 = 512;
        }
        if (i11 == 0) {
            i10 = (int) f10;
            i11 = org.telegram.messenger.i0.L(100.0f) + i10;
        }
        int i13 = (int) ((f10 / i11) * i10);
        int i14 = (int) f10;
        float f11 = i13;
        if (f11 > f10) {
            i14 = (int) ((f10 / f11) * i14);
            i13 = i14;
        }
        float f12 = i14;
        float f13 = org.telegram.messenger.i0.p;
        int i15 = (int) (f12 / f13);
        int i16 = (int) (i13 / f13);
        Locale locale = Locale.US;
        return a1.g.i(i15, i16, "_");
    }

    public final void c(boolean z10, boolean z11, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.D == z10) {
            return;
        }
        this.D = z10;
        this.E = z11;
        if (z10) {
            if (this.w == null) {
                ei0 ei0Var = new ei0(getContext());
                this.w = ei0Var;
                ei0Var.setScaleType(ImageView.ScaleType.CENTER);
                this.w.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.w.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(78.0f), 469762048));
                if (z11) {
                    this.w.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.w.f(R.raw.large_message_lock, 80, 80, null);
                    this.w.setOnClickListener(new h0(this, 6));
                }
            }
            this.w.d();
            if (this.x == null) {
                TextView textView = new TextView(getContext());
                this.x = textView;
                textView.setTextAlignment(4);
                this.x.setGravity(17);
                this.x.setTextSize(1, 13.0f);
            }
            this.x.setText(spannableStringBuilder);
            TextView textView2 = this.x;
            textView2.setMaxWidth(vh.p2.a(textView2.getText(), this.x.getPaint()));
            TextView textView3 = this.x;
            int i10 = org.telegram.ui.ActionBar.t6.Wc;
            org.telegram.ui.ActionBar.p6 p6Var = this.r;
            org.telegram.ui.ActionBar.a7.V(textView3, i10, p6Var);
            this.x.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
            if (this.y == null) {
                bi.j6 j6Var = new bi.j6(getContext(), 5);
                this.y = j6Var;
                j6Var.setTextAlignment(4);
                this.y.setGravity(17);
                this.y.setTypeface(org.telegram.messenger.i0.o());
                this.y.setTextSize(1, 14.0f);
                this.y.setPadding(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
                bi.j6 j6Var2 = this.y;
                int L2 = org.telegram.messenger.i0.L(15.0f);
                j6Var2.setBackground(org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 503316480, 855638016, 855638016));
                w7.e6.a(this.y);
            }
            this.y.setText(str);
            org.telegram.ui.ActionBar.a7.V(this.y, i10, p6Var);
            this.y.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        this.H = true;
        if (TextUtils.isEmpty(charSequence == null ? null : charSequence.toString().trim())) {
            charSequence = org.telegram.messenger.cd.L0(2131748210, null);
        }
        this.b.setText(charSequence);
        if (TextUtils.isEmpty(charSequence2 == null ? null : charSequence2.toString().trim())) {
            charSequence2 = org.telegram.messenger.cd.L0(2131748208, null);
        }
        TextView textView = this.c;
        textView.setText(charSequence2);
        textView.setMaxWidth(textView.getText().length() > 60 ? Math.min((int) (org.telegram.messenger.i0.q.x * 0.5f), vh.p2.a(textView.getText(), textView.getPaint())) : (int) (org.telegram.messenger.i0.q.x * 0.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.K) {
            canvas2 = canvas;
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.r;
            if (p6Var != null) {
                p6Var.b(0.0f, this.I + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.J);
            } else {
                org.telegram.ui.ActionBar.t6.r(0.0f, this.I + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.J);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.W0("paintChatActionBackground", p6Var));
        }
        if (!this.s) {
            this.s = true;
            setSticker(this.a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        removeAllViews();
        if (!this.D) {
            addView(this.b, w7.b6.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.c, w7.b6.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.f, w7.b6.t(org.telegram.messenger.zs.x1, org.telegram.messenger.zs.x1, 1, 16, 10, 16, 16));
            return;
        }
        addView(this.w, w7.b6.t(78, 78, 49, 20, 9, 20, 9));
        boolean A3 = org.telegram.messenger.vp.r1(this.e).A3();
        addView(this.x, w7.b6.t(-2, -2, 49, 20, 0, 20, A3 ? 13 : 9));
        if (A3) {
            return;
        }
        bi.j6 j6Var = this.y;
        if ((j6Var == null || TextUtils.isEmpty(j6Var.getText())) && this.E) {
            return;
        }
        addView(this.y, w7.b6.t(-2, 30, 49, 20, 2, 20, 13));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.e);
            TLRPC.Document document = b02.y0;
            b02.n1();
            this.a = document;
            if (this.s) {
                setSticker(document);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        this.G = true;
        boolean z10 = this.H;
        TextView textView = this.c;
        if (!z10) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() <= View.MeasureSpec.getSize(i11) || this.H) {
            if (!this.H) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        }
        this.G = false;
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.K = true;
    }

    public void setListener(wn wnVar) {
        this.d = wnVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.s = true;
        this.n.b();
        org.telegram.messenger.c00 f7 = org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.Zc, 1.0f, null);
        if (f7 != null) {
            this.h.p(org.telegram.messenger.ic.b(document), b(document), f7, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.l(org.telegram.messenger.ic.b(document), b(document), org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false), document), null, 0, document2);
        }
        this.h.setOnClickListener(new un(this, document2, 0));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var = this.r;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, p6Var));
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, p6Var));
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.s = true;
        this.n.b();
        this.h.l(org.telegram.messenger.ic.g(str), "256_256", null, null, 0, null);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
