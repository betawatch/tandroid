// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class f0 extends ny0 implements fn7 {
    public final TL_aicompose.AiComposeTone S1;
    public final jc T1;
    public final ImageView U1;
    public final FrameLayout V1;
    public final TextView W1;
    public final TextView X1;
    public final FrameLayout Y1;
    public final FrameLayout Z1;
    public final c51 a2;
    public l9c b2;
    public int c2;
    public final TL_aicompose.aiComposeToneExample[] d2;
    public int e2;

    public f0(Context context, TL_aicompose.AiComposeTone aiComposeTone, vnb vnbVar) {
        super(context, null, false, false, 2, vnbVar);
        byte b = 0;
        this.c2 = 0;
        jc Q1 = uc7.s1(this.a).Q1();
        this.T1 = Q1;
        Q1.b();
        this.S1 = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[uc7.s1(this.a).k4.a0.f()];
        this.d2 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.U1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i = aob.G6;
        yob.s(imageView, i, vnbVar, PorterDuff.Mode.SRC_ATOP);
        hf0 f0 = aob.f0(aob.p1(0.1f, aob.v0(i, this.J0)), 1, -1);
        uob K = yob.K(0.1f, i);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, K, vnbVar);
        this.b.addView(imageView, tre.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        iye.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new b0(this, b));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = hl.L(100.0f);
        int i2 = aob.d6;
        ShapeDrawable K2 = aob.K(L, aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        frameLayout2.setBackground(K2);
        yob.j(frameLayout2, K2, M, null, vnbVar);
        frameLayout.addView(frameLayout2, tre.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        de0 de0Var = new de0(context);
        de0Var.setAnimatedEmojiDrawable(new wl(4, this.a, aiComposeTone.emoji_id));
        frameLayout2.addView(de0Var, tre.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.W1 = textView;
        qd4.w(textView, i, vnbVar, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.X1 = textView2;
        yob.X(textView2, i, vnbVar);
        textView2.setTextSize(1, 14.0f);
        uh9.q(textView2, 17, null, 2131754963);
        this.o1.setTitle(aiComposeTone.title);
        int i3 = aob.a7;
        this.b0 = i3;
        s0(aob.v0(i3, this.J0));
        d79 d79Var = this.n1;
        int i4 = this.u0;
        d79Var.setPadding(i4, 0, i4, hl.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.s1();
        this.n1.setOnItemClickListener(new u(this, (byte) 1));
        this.F1 = false;
        this.E1 = hl.L(36.0f);
        this.u1 = 0.35f;
        this.I1 = true;
        e0 e0Var = new e0(this);
        e0Var.m = false;
        e0Var.C = false;
        e0Var.o(k43.h);
        e0Var.n(350L);
        this.n1.setItemAnimator(e0Var);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        frameLayout3.setPadding(hl.L(16.0f), hl.L(6.0f), hl.L(16.0f), hl.L(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, aob.v0(i3, this.J0)), aob.v0(i3, this.J0), aob.v0(i3, this.J0)}));
        FrameLayout.LayoutParams e = tre.e(-1, -2, 80);
        int i5 = e.leftMargin;
        int i6 = this.u0;
        e.leftMargin = i5 + i6;
        e.rightMargin += i6;
        this.b.addView(frameLayout3, e);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z1 = frameLayout4;
        FrameLayout.LayoutParams d = tre.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i7 = d.leftMargin;
        int i8 = this.u0;
        d.leftMargin = i7 + i8;
        d.rightMargin += i8;
        this.b.addView(frameLayout4, d);
        c51 i9 = xnb.i(24, vnbVar, context, true);
        this.a2 = i9;
        i9.setText(ob6.M0(Z0() ? 2131754977 : 2131755002, null));
        i9.setOnClickListener(new c0(this, aiComposeTone, vnbVar, b));
        frameLayout3.addView(i9, tre.e(-1, 48, jn7.D1));
        this.b2.O(false);
    }

    public static SpannableStringBuilder a1() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < 5; i++) {
            if (i > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int L = hl.L((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) ob6.M0(2131748533, null));
            ya6 ya6Var = new ya6(null, L, 0, null);
            ya6Var.f = hl.L(6.0f);
            ya6Var.h = 0.5f;
            ya6Var.n = true;
            spannableStringBuilder.setSpan(ya6Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, true, new c(this, (byte) 1), this.J0);
        this.b2 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.S1;
        return aiComposeTone == null ? "" : aiComposeTone.title;
    }

    @Override // ny0
    public final void M0(float f) {
        jy0 jy0Var = this.o1;
        ema titleTextView = jy0Var.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f);
        }
        float translationY = jy0Var.getTranslationY() + hl.m;
        int height = jy0Var.getHeight() - hl.m;
        this.U1.setTranslationY(((1.0f - f) * hl.L(28.0f)) + ((height - r3.getHeight()) / 2.0f) + translationY);
    }

    public final boolean Z0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.S1;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i = 0;
            while (true) {
                jc jcVar = this.T1;
                if (i >= jcVar.b.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) jcVar.b.get(i);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).id == tL_aiComposeTone.id) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.b4) {
            this.a2.setText(ob6.M0(Z0() ? 2131754977 : 2131755002, null));
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        jn7.f(this.a).n(this, jn7.b4);
    }

    @Override // nx0
    public final void p0() {
        try {
            super.p0();
            int v0 = aob.v0(aob.a7, this.J0);
            if (v0 != this.e2) {
                this.e2 = v0;
                s0(v0);
                this.Y1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, v0), v0, v0}));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        jn7.f(this.a).b(this, jn7.b4);
    }
}
