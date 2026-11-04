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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class on extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public static final /* synthetic */ int M = 0;
    public boolean E;
    public boolean F;
    public AnimatorSet G;
    public boolean H;
    public boolean I;
    public float J;
    public int K;
    public boolean L;
    public TLRPC.Document a;
    public final TextView b;
    public final TextView c;
    public nn d;
    public final int e;
    public final FrameLayout f;
    public k9 h;
    public k9 n;
    public final org.telegram.ui.ActionBar.e6 r;
    public boolean s;
    public fh0 w;
    public TextView x;
    public fi.j y;

    public on(Context context, int i3, TLRPC.Document document, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(1);
        this.e = i3;
        this.r = e6Var;
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
        k9 k9Var = new k9(context);
        this.h = k9Var;
        k9Var.getImageReceiver().S0 = true;
        frameLayout.addView(this.h, b8.mf.c(112.0f, org.telegram.messenger.hs.x1));
        b8.pf.a(this.h);
        k9 k9Var2 = new k9(context);
        this.n = k9Var2;
        k9Var2.getImageReceiver().S0 = true;
        frameLayout.addView(this.n, b8.mf.c(112.0f, org.telegram.messenger.hs.x1));
        this.n.setVisibility(8);
        this.n.setAlpha(0.0f);
        b8.pf.a(this.n);
        e();
        updateColors();
        String M0 = org.telegram.messenger.bd.M0(2131748201, null);
        String M02 = org.telegram.messenger.bd.M0(2131748199, null);
        textView.setText(M0);
        textView2.setText(M02);
        textView2.setMaxWidth(gi.l3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.a = document;
        if (document == null) {
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i3);
            TLRPC.Document document2 = b02.z0;
            b02.n1();
            this.a = document2;
        }
    }

    public static void a(on onVar) {
        AnimatorSet animatorSet = onVar.G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        onVar.n.setVisibility(0);
        onVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        onVar.G = animatorSet2;
        animatorSet2.setDuration(420L);
        onVar.G.setInterpolator(xq.h);
        onVar.G.addListener(new s9(onVar));
        AnimatorSet animatorSet3 = onVar.G;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(onVar.n, (Property<k9, Float>) property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(onVar.n, (Property<k9, Float>) property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(onVar.n, (Property<k9, Float>) property3, 0.7f, 1.0f), ObjectAnimator.ofFloat(onVar.n, (Property<k9, Float>) property4, -org.telegram.messenger.g0.L(24.0f), 0.0f), ObjectAnimator.ofFloat(onVar.h, (Property<k9, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(onVar.h, (Property<k9, Float>) property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(onVar.h, (Property<k9, Float>) property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(onVar.h, (Property<k9, Float>) property4, 0.0f, org.telegram.messenger.g0.L(24.0f)));
        onVar.G.start();
    }

    public static String b(TLRPC.Document document) {
        float min;
        float f10;
        int i3;
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
                i3 = 0;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                i10 = documentAttribute.w;
                i3 = documentAttribute.h;
                break;
            }
            i11++;
        }
        if (org.telegram.messenger.zi.L2(document, true) && i10 == 0 && i3 == 0) {
            i10 = 512;
            i3 = 512;
        }
        if (i10 == 0) {
            i3 = (int) f11;
            i10 = org.telegram.messenger.g0.L(100.0f) + i3;
        }
        int i12 = (int) ((f11 / i10) * i3);
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
        return com.google.android.recaptcha.internal.a.i(i14, "_", i15);
    }

    public final void c(boolean z10, boolean z11, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        this.F = z11;
        if (z10) {
            if (this.w == null) {
                fh0 fh0Var = new fh0(getContext());
                this.w = fh0Var;
                fh0Var.setScaleType(ImageView.ScaleType.CENTER);
                this.w.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.w.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(78.0f), 469762048));
                if (z11) {
                    this.w.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.w.f(R.raw.large_message_lock, 80, 80, null);
                    this.w.setOnClickListener(new f0(this, 7));
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
            textView2.setMaxWidth(gi.l3.a(textView2.getText(), this.x.getPaint()));
            TextView textView3 = this.x;
            int i3 = org.telegram.ui.ActionBar.k6.Wc;
            org.telegram.ui.ActionBar.e6 e6Var = this.r;
            org.telegram.ui.ActionBar.r6.V(textView3, i3, e6Var);
            this.x.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            if (this.y == null) {
                fi.j jVar = new fi.j(getContext(), 6);
                this.y = jVar;
                jVar.setTextAlignment(4);
                this.y.setGravity(17);
                this.y.setTypeface(org.telegram.messenger.g0.o());
                this.y.setTextSize(1, 14.0f);
                this.y.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                fi.j jVar2 = this.y;
                int L = org.telegram.messenger.g0.L(15.0f);
                jVar2.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, 503316480, 855638016, 855638016));
                b8.pf.a(this.y);
            }
            this.y.setText(str);
            org.telegram.ui.ActionBar.r6.V(this.y, i3, e6Var);
            this.y.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        this.I = true;
        if (TextUtils.isEmpty(charSequence == null ? null : charSequence.toString().trim())) {
            charSequence = org.telegram.messenger.bd.M0(2131748201, null);
        }
        this.b.setText(charSequence);
        if (TextUtils.isEmpty(charSequence2 == null ? null : charSequence2.toString().trim())) {
            charSequence2 = org.telegram.messenger.bd.M0(2131748199, null);
        }
        TextView textView = this.c;
        textView.setText(charSequence2);
        textView.setMaxWidth(textView.getText().length() > 60 ? Math.min((int) (org.telegram.messenger.g0.q.x * 0.5f), gi.l3.a(textView.getText(), textView.getPaint())) : (int) (org.telegram.messenger.g0.q.x * 0.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.L) {
            canvas2 = canvas;
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.r;
            if (e6Var != null) {
                e6Var.b(0.0f, this.J + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.K);
            } else {
                org.telegram.ui.ActionBar.k6.r(0.0f, this.J + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.K);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.W0("paintChatActionBackground", e6Var));
        }
        if (!this.s) {
            this.s = true;
            setSticker(this.a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        removeAllViews();
        if (!this.E) {
            addView(this.b, b8.mf.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.c, b8.mf.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.f, b8.mf.t(org.telegram.messenger.hs.x1, org.telegram.messenger.hs.x1, 1, 16, 10, 16, 16));
            return;
        }
        addView(this.w, b8.mf.t(78, 78, 49, 20, 9, 20, 9));
        boolean D3 = org.telegram.messenger.hp.s1(this.e).D3();
        addView(this.x, b8.mf.t(-2, -2, 49, 20, 0, 20, D3 ? 13 : 9));
        if (D3) {
            return;
        }
        fi.j jVar = this.y;
        if ((jVar == null || TextUtils.isEmpty(jVar.getText())) && this.F) {
            return;
        }
        addView(this.y, b8.mf.t(-2, 30, 49, 20, 2, 20, 13));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == null) {
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.e);
            TLRPC.Document document = b02.z0;
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
    public void onMeasure(int i3, int i10) {
        this.H = true;
        boolean z10 = this.I;
        TextView textView = this.c;
        if (!z10) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i3, i10);
        if (getMeasuredHeight() <= View.MeasureSpec.getSize(i10) || this.I) {
            if (!this.I) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        }
        this.H = false;
        super.onMeasure(i3, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.L = true;
    }

    public void setListener(nn nnVar) {
        this.d = nnVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.s = true;
        this.n.b();
        org.telegram.messenger.jz f10 = org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.k6.Zc, 1.0f, null);
        if (f10 != null) {
            this.h.p(org.telegram.messenger.ac.b(document), b(document), f10, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.l(org.telegram.messenger.ac.b(document), b(document), org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), null, 0, document2);
        }
        this.h.setOnClickListener(new ln(this, document2, 0));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.r;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, e6Var));
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, e6Var));
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.s = true;
        this.n.b();
        this.h.l(org.telegram.messenger.ac.g(str), "256_256", null, null, 0, null);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
