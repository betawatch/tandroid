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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class pn extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
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
    public on d;
    public final int e;
    public final FrameLayout f;
    public l9 h;
    public l9 n;
    public final org.telegram.ui.ActionBar.g6 r;
    public boolean s;
    public dh0 w;
    public TextView x;
    public ei.k y;

    public pn(Context context, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setOrientation(1);
        this.e = i7;
        this.r = g6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
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
        l9 l9Var = new l9(context);
        this.h = l9Var;
        l9Var.getImageReceiver().R0 = true;
        frameLayout.addView(this.h, c8.ha.c(112.0f, org.telegram.messenger.qs.x1));
        c8.ka.a(this.h);
        l9 l9Var2 = new l9(context);
        this.n = l9Var2;
        l9Var2.getImageReceiver().R0 = true;
        frameLayout.addView(this.n, c8.ha.c(112.0f, org.telegram.messenger.qs.x1));
        this.n.setVisibility(8);
        this.n.setAlpha(0.0f);
        c8.ka.a(this.n);
        e();
        updateColors();
        String M0 = org.telegram.messenger.id.M0(2131748193, null);
        String M02 = org.telegram.messenger.id.M0(2131748191, null);
        textView.setText(M0);
        textView2.setText(M02);
        textView2.setMaxWidth(fi.m3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.a = document;
        if (document == null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i7);
            TLRPC.Document document2 = b02.y0;
            b02.n1();
            this.a = document2;
        }
    }

    public static void a(pn pnVar) {
        AnimatorSet animatorSet = pnVar.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        pnVar.n.setVisibility(0);
        pnVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        pnVar.F = animatorSet2;
        animatorSet2.setDuration(420L);
        pnVar.F.setInterpolator(xq.h);
        pnVar.F.addListener(new t9(pnVar));
        AnimatorSet animatorSet3 = pnVar.F;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pnVar.n, (Property<l9, Float>) property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pnVar.n, (Property<l9, Float>) property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(pnVar.n, (Property<l9, Float>) property3, 0.7f, 1.0f), ObjectAnimator.ofFloat(pnVar.n, (Property<l9, Float>) property4, -org.telegram.messenger.g0.L(24.0f), 0.0f), ObjectAnimator.ofFloat(pnVar.h, (Property<l9, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(pnVar.h, (Property<l9, Float>) property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(pnVar.h, (Property<l9, Float>) property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(pnVar.h, (Property<l9, Float>) property4, 0.0f, org.telegram.messenger.g0.L(24.0f)));
        pnVar.F.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f10;
        int i7;
        if (org.telegram.messenger.g0.Q1()) {
            min = org.telegram.messenger.g0.Q0();
            f10 = 0.4f;
        } else {
            Point point = org.telegram.messenger.g0.q;
            min = Math.min(point.x, point.y);
            f10 = 0.5f;
        }
        float f11 = min * f10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= document.attributes.size()) {
                i7 = 0;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                i10 = documentAttribute.w;
                i7 = documentAttribute.h;
                break;
            }
            i11++;
        }
        if (org.telegram.messenger.ij.K2(document, true) && i10 == 0 && i7 == 0) {
            i10 = 512;
            i7 = 512;
        }
        if (i10 == 0) {
            i7 = (int) f11;
            i10 = org.telegram.messenger.g0.L(100.0f) + i7;
        }
        int i12 = (int) ((f11 / i10) * i7);
        int i13 = (int) f11;
        float f12 = i12;
        if (f12 > f11) {
            i13 = (int) ((f11 / f12) * i13);
            i12 = i13;
        }
        float f13 = i13;
        float f14 = org.telegram.messenger.g0.p;
        int i14 = (int) (f13 / f14);
        int i15 = (int) (i12 / f14);
        Locale locale = Locale.US;
        return com.google.android.recaptcha.internal.a.j(i14, "_", i15);
    }

    public final void c(boolean z9, boolean z10, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.D == z9) {
            return;
        }
        this.D = z9;
        this.E = z10;
        if (z9) {
            if (this.w == null) {
                dh0 dh0Var = new dh0(getContext());
                this.w = dh0Var;
                dh0Var.setScaleType(ImageView.ScaleType.CENTER);
                this.w.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.w.setBackground(org.telegram.ui.ActionBar.l6.L(org.telegram.messenger.g0.L(78.0f), 469762048));
                if (z10) {
                    this.w.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.w.f(R.raw.large_message_lock, 80, 80, null);
                    this.w.setOnClickListener(new h0(this, 7));
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
            textView2.setMaxWidth(fi.m3.a(textView2.getText(), this.x.getPaint()));
            TextView textView3 = this.x;
            int i7 = org.telegram.ui.ActionBar.l6.Wc;
            org.telegram.ui.ActionBar.g6 g6Var = this.r;
            org.telegram.ui.ActionBar.s6.U(textView3, i7, g6Var);
            this.x.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            if (this.y == null) {
                ei.k kVar = new ei.k(getContext(), 6);
                this.y = kVar;
                kVar.setTextAlignment(4);
                this.y.setGravity(17);
                this.y.setTypeface(org.telegram.messenger.g0.o());
                this.y.setTextSize(1, 14.0f);
                this.y.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                ei.k kVar2 = this.y;
                int L2 = org.telegram.messenger.g0.L(15.0f);
                kVar2.setBackground(org.telegram.ui.ActionBar.l6.k0(L2, L2, L2, L2, 503316480, 855638016, 855638016));
                c8.ka.a(this.y);
            }
            this.y.setText(str);
            org.telegram.ui.ActionBar.s6.U(this.y, i7, g6Var);
            this.y.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        this.H = true;
        if (TextUtils.isEmpty(charSequence == null ? null : charSequence.toString().trim())) {
            charSequence = org.telegram.messenger.id.M0(2131748193, null);
        }
        this.b.setText(charSequence);
        if (TextUtils.isEmpty(charSequence2 == null ? null : charSequence2.toString().trim())) {
            charSequence2 = org.telegram.messenger.id.M0(2131748191, null);
        }
        TextView textView = this.c;
        textView.setText(charSequence2);
        textView.setMaxWidth(textView.getText().length() > 60 ? Math.min((int) (org.telegram.messenger.g0.q.x * 0.5f), fi.m3.a(textView.getText(), textView.getPaint())) : (int) (org.telegram.messenger.g0.q.x * 0.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.K) {
            canvas2 = canvas;
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.r;
            if (g6Var != null) {
                g6Var.b(0.0f, this.I + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.J);
            } else {
                org.telegram.ui.ActionBar.l6.r(0.0f, this.I + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.J);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.l6.W0("paintChatActionBackground", g6Var));
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
            addView(this.b, c8.ha.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.c, c8.ha.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.f, c8.ha.t(org.telegram.messenger.qs.x1, org.telegram.messenger.qs.x1, 1, 16, 10, 16, 16));
            return;
        }
        addView(this.w, c8.ha.t(78, 78, 49, 20, 9, 20, 9));
        boolean D3 = org.telegram.messenger.qp.s1(this.e).D3();
        addView(this.x, c8.ha.t(-2, -2, 49, 20, 0, 20, D3 ? 13 : 9));
        if (D3) {
            return;
        }
        ei.k kVar = this.y;
        if ((kVar == null || TextUtils.isEmpty(kVar.getText())) && this.E) {
            return;
        }
        addView(this.y, c8.ha.t(-2, 30, 49, 20, 2, 20, 13));
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
    public void onMeasure(int i7, int i10) {
        this.G = true;
        boolean z9 = this.H;
        TextView textView = this.c;
        if (!z9) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i7, i10);
        if (getMeasuredHeight() <= View.MeasureSpec.getSize(i10) || this.H) {
            if (!this.H) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        }
        this.G = false;
        super.onMeasure(i7, i10);
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

    public void setListener(on onVar) {
        this.d = onVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.s = true;
        this.n.b();
        org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.l6.Zc, 1.0f, null);
        if (f10 != null) {
            this.h.p(org.telegram.messenger.hc.b(document), b(document), f10, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.l(org.telegram.messenger.hc.b(document), b(document), org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), null, 0, document2);
        }
        this.h.setOnClickListener(new mn(this, document2, 0));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var = this.r;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Wc, g6Var));
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Wc, g6Var));
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.s = true;
        this.n.b();
        this.h.l(org.telegram.messenger.hc.g(str), "256_256", null, null, 0, null);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
