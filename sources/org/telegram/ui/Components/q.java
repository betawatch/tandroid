package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q extends ja implements org.telegram.messenger.is {
    public final TL_aicompose.AiComposeTone T1;
    public final org.telegram.messenger.e U1;
    public final ImageView V1;
    public final FrameLayout W1;
    public final TextView X1;
    public final TextView Y1;
    public final FrameLayout Z1;
    public final FrameLayout a2;
    public final hi.d b2;
    public p41 c2;
    public int d2;
    public final TL_aicompose.aiComposeToneExample[] e2;
    public int f2;

    public q(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, 2, e6Var);
        int i7 = 0;
        this.d2 = 0;
        org.telegram.messenger.e R1 = org.telegram.messenger.np.s1(this.a).R1();
        this.U1 = R1;
        R1.b();
        this.T1 = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[((org.telegram.messenger.j0) org.telegram.messenger.np.s1(this.a).y7.P.b).c];
        this.e2 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.V1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i10, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.1f, i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, K, e6Var);
        this.b.addView(imageView, c8.ja.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.na.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new n(this, i7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(100.0f);
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(frameLayout2, L2, M, null, e6Var);
        frameLayout.addView(frameLayout2, c8.ja.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        i9 i9Var = new i9(context);
        i9Var.setAnimatedEmojiDrawable(new g5(4, this.a, aiComposeTone.emoji_id));
        frameLayout2.addView(i9Var, c8.ja.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.X1 = textView;
        org.telegram.messenger.k5.m(textView, i10, e6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.Y1 = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, i10, e6Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.l(textView2, 17, null, 2131754966);
        this.p1.setTitle(aiComposeTone.title);
        int i12 = org.telegram.ui.ActionBar.j6.a7;
        this.b0 = i12;
        v0(org.telegram.ui.ActionBar.j6.w0(i12, this.J0));
        uj0 uj0Var = this.o1;
        int i13 = this.u0;
        uj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(66.0f));
        this.o1.setClipToPadding(false);
        this.o1.r1();
        this.o1.setOnItemClickListener(new j(this, 1));
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(36.0f);
        this.v1 = 0.35f;
        this.J1 = true;
        p pVar = new p(this);
        pVar.m = false;
        pVar.C = false;
        pVar.o(er.h);
        pVar.n(350L);
        this.o1.setItemAnimator(pVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z1 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, org.telegram.ui.ActionBar.j6.w0(i12, this.J0)), org.telegram.ui.ActionBar.j6.w0(i12, this.J0), org.telegram.ui.ActionBar.j6.w0(i12, this.J0)}));
        FrameLayout.LayoutParams e10 = c8.ja.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.u0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.b.addView(frameLayout3, e10);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.a2 = frameLayout4;
        FrameLayout.LayoutParams d = c8.ja.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.u0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.b.addView(frameLayout4, d);
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        this.b2 = g10;
        g10.setText(org.telegram.messenger.hd.M0(d1() ? 2131754980 : 2131755005, null));
        g10.setOnClickListener(new ah.g(this, aiComposeTone, e6Var, 20));
        frameLayout3.addView(g10, c8.ja.e(-1, 48, org.telegram.messenger.ns.E1));
        this.c2.O(false);
    }

    public static SpannableStringBuilder e1() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i7 = 0; i7 < 5; i7++) {
            if (i7 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int L = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131748779, null));
            e80 e80Var = new e80(null, L, 0, null);
            e80Var.f = org.telegram.messenger.g0.L(6.0f);
            e80Var.h = 0.5f;
            e80Var.n = true;
            spannableStringBuilder.setSpan(e80Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.a, 0, true, new d(this, 1), this.J0);
        this.c2 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.T1;
        return aiComposeTone == null ? "" : aiComposeTone.title;
    }

    @Override // org.telegram.ui.Components.ja
    public final void Q0(float f10) {
        fa faVar = this.p1;
        org.telegram.ui.ActionBar.j5 titleTextView = faVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
        float translationY = faVar.getTranslationY() + org.telegram.messenger.g0.m;
        int height = faVar.getHeight() - org.telegram.messenger.g0.m;
        this.V1.setTranslationY(((1.0f - f10) * org.telegram.messenger.g0.L(28.0f)) + ((height - r2.getHeight()) / 2.0f) + translationY);
    }

    public final boolean d1() {
        TL_aicompose.AiComposeTone aiComposeTone = this.T1;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i7 = 0;
            while (true) {
                org.telegram.messenger.e eVar = this.U1;
                if (i7 >= eVar.b.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) eVar.b.get(i7);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).id == tL_aiComposeTone.id) {
                    return true;
                }
                i7++;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.Y3) {
            this.b2.setText(org.telegram.messenger.hd.M0(d1() ? 2131754980 : 2131755005, null));
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ns.f(this.a).n(this, org.telegram.messenger.ns.Y3);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.J0);
            if (w02 != this.f2) {
                this.f2 = w02;
                v0(w02);
                this.Z1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.ns.f(this.a).c(this, org.telegram.messenger.ns.Y3);
    }
}
