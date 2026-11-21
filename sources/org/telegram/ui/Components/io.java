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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class io extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
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
    public ho d;
    public final int e;
    public final FrameLayout f;
    public q9 h;
    public q9 n;
    public final org.telegram.ui.ActionBar.h6 r;
    public boolean s;
    public rh0 w;
    public TextView x;
    public gi.j y;

    public io(Context context, int i7, TLRPC.Document document, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setOrientation(1);
        this.e = i7;
        this.r = h6Var;
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
        q9 q9Var = new q9(context);
        this.h = q9Var;
        q9Var.getImageReceiver().S0 = true;
        frameLayout.addView(this.h, c8.ma.c(112.0f, org.telegram.messenger.ks.x1));
        c8.ra.a(this.h);
        q9 q9Var2 = new q9(context);
        this.n = q9Var2;
        q9Var2.getImageReceiver().S0 = true;
        frameLayout.addView(this.n, c8.ma.c(112.0f, org.telegram.messenger.ks.x1));
        this.n.setVisibility(8);
        this.n.setAlpha(0.0f);
        c8.ra.a(this.n);
        e();
        updateColors();
        String N0 = org.telegram.messenger.gd.N0(2131748000, null);
        String N02 = org.telegram.messenger.gd.N0(2131747998, null);
        textView.setText(N0);
        textView2.setText(N02);
        textView2.setMaxWidth(hi.l3.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.a = document;
        if (document == null) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i7);
            TLRPC.Document document2 = d02.z0;
            d02.q1();
            this.a = document2;
        }
    }

    public static void a(io ioVar) {
        AnimatorSet animatorSet = ioVar.G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ioVar.n.setVisibility(0);
        ioVar.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ioVar.G = animatorSet2;
        animatorSet2.setDuration(420L);
        ioVar.G.setInterpolator(nr.h);
        ioVar.G.addListener(new org.telegram.ui.on(ioVar));
        AnimatorSet animatorSet3 = ioVar.G;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ioVar.n, (Property<q9, Float>) property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ioVar.n, (Property<q9, Float>) property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ioVar.n, (Property<q9, Float>) property3, 0.7f, 1.0f), ObjectAnimator.ofFloat(ioVar.n, (Property<q9, Float>) property4, -org.telegram.messenger.g0.L(24.0f), 0.0f), ObjectAnimator.ofFloat(ioVar.h, (Property<q9, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(ioVar.h, (Property<q9, Float>) property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(ioVar.h, (Property<q9, Float>) property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(ioVar.h, (Property<q9, Float>) property4, 0.0f, org.telegram.messenger.g0.L(24.0f)));
        ioVar.G.start();
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
        if (org.telegram.messenger.fj.K2(document, true) && i10 == 0 && i7 == 0) {
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
        return com.google.android.gms.internal.vision.e2.j(i14, "_", i15);
    }

    public final void c(boolean z10, boolean z11, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        this.F = z11;
        if (z10) {
            if (this.w == null) {
                rh0 rh0Var = new rh0(getContext());
                this.w = rh0Var;
                rh0Var.setScaleType(ImageView.ScaleType.CENTER);
                this.w.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.w.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(78.0f), 469762048));
                if (z11) {
                    this.w.setImageResource(R.drawable.filled_chatlist2);
                } else {
                    this.w.f(R.raw.large_message_lock, 80, 80, null);
                    this.w.setOnClickListener(new o0(this, 8));
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
            textView2.setMaxWidth(hi.l3.a(textView2.getText(), this.x.getPaint()));
            TextView textView3 = this.x;
            int i7 = org.telegram.ui.ActionBar.m6.Zc;
            org.telegram.ui.ActionBar.h6 h6Var = this.r;
            org.telegram.ui.ActionBar.t6.U(textView3, i7, h6Var);
            this.x.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            if (this.y == null) {
                gi.j jVar = new gi.j(getContext(), 6);
                this.y = jVar;
                jVar.setTextAlignment(4);
                this.y.setGravity(17);
                this.y.setTypeface(org.telegram.messenger.g0.o());
                this.y.setTextSize(1, 14.0f);
                this.y.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
                gi.j jVar2 = this.y;
                int L = org.telegram.messenger.g0.L(15.0f);
                jVar2.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 503316480, 855638016, 855638016));
                c8.ra.a(this.y);
            }
            this.y.setText(str);
            org.telegram.ui.ActionBar.t6.U(this.y, i7, h6Var);
            this.y.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void d(CharSequence charSequence, CharSequence charSequence2) {
        this.I = true;
        if (TextUtils.isEmpty(charSequence == null ? null : charSequence.toString().trim())) {
            charSequence = org.telegram.messenger.gd.N0(2131748000, null);
        }
        this.b.setText(charSequence);
        if (TextUtils.isEmpty(charSequence2 == null ? null : charSequence2.toString().trim())) {
            charSequence2 = org.telegram.messenger.gd.N0(2131747998, null);
        }
        TextView textView = this.c;
        textView.setText(charSequence2);
        textView.setMaxWidth(textView.getText().length() > 60 ? Math.min((int) (org.telegram.messenger.g0.q.x * 0.5f), hi.l3.a(textView.getText(), textView.getPaint())) : (int) (org.telegram.messenger.g0.q.x * 0.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.L) {
            canvas2 = canvas;
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.r;
            if (h6Var != null) {
                h6Var.e(0.0f, this.J + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.K);
            } else {
                org.telegram.ui.ActionBar.m6.r(0.0f, this.J + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.K);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.m6.W0("paintChatActionBackground", h6Var));
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
            addView(this.b, c8.ma.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.c, c8.ma.t(-2, -2, 1, 20, 6, 20, 6));
            addView(this.f, c8.ma.t(org.telegram.messenger.ks.x1, org.telegram.messenger.ks.x1, 1, 16, 10, 16, 16));
            return;
        }
        addView(this.w, c8.ma.t(78, 78, 49, 20, 9, 20, 9));
        boolean K3 = org.telegram.messenger.mp.u1(this.e).K3();
        addView(this.x, c8.ma.t(-2, -2, 49, 20, 0, 20, K3 ? 13 : 9));
        if (K3) {
            return;
        }
        gi.j jVar = this.y;
        if ((jVar == null || TextUtils.isEmpty(jVar.getText())) && this.F) {
            return;
        }
        addView(this.y, c8.ma.t(-2, 30, 49, 20, 2, 20, 13));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == null) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.e);
            TLRPC.Document document = d02.z0;
            d02.q1();
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
        this.H = true;
        boolean z10 = this.I;
        TextView textView = this.c;
        if (!z10) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i7, i10);
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
        super.onMeasure(i7, i10);
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

    public void setListener(ho hoVar) {
        this.d = hoVar;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.s = true;
        this.n.b();
        org.telegram.messenger.lz f10 = org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.m6.cd, 1.0f, null);
        if (f10 != null) {
            this.h.p(org.telegram.messenger.fc.b(document), b(document), f10, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.l(org.telegram.messenger.fc.b(document), b(document), org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), null, 0, document2);
        }
        this.h.setOnClickListener(new fo(this, document2, 0));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var = this.r;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zc, h6Var));
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zc, h6Var));
        }
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.s = true;
        this.n.b();
        this.h.l(org.telegram.messenger.fc.g(str), "256_256", null, null, 0, null);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
