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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v extends sa implements org.telegram.messenger.fs {
    public final TL_aicompose.AiComposeTone T1;
    public final org.telegram.messenger.e U1;
    public final ImageView V1;
    public final FrameLayout W1;
    public final TextView X1;
    public final TextView Y1;
    public final FrameLayout Z1;
    public final FrameLayout a2;
    public final hi.d b2;
    public z41 c2;
    public int d2;
    public final TL_aicompose.aiComposeToneExample[] e2;
    public int f2;

    public v(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, false, false, 2, i6Var);
        int i7 = 0;
        this.d2 = 0;
        org.telegram.messenger.e T1 = org.telegram.messenger.mp.u1(this.a).T1();
        this.U1 = T1;
        T1.b();
        this.T1 = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[((org.telegram.messenger.j0) org.telegram.messenger.mp.u1(this.a).A7.U.b).c];
        this.e2 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.V1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i10, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.1f, i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, K, i6Var);
        this.b.addView(imageView, c8.ma.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        c8.ra.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new s(this, i7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(100.0f);
        int i11 = org.telegram.ui.ActionBar.n6.d6;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        frameLayout2.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, L2, M, null, i6Var);
        frameLayout.addView(frameLayout2, c8.ma.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        q9 q9Var = new q9(context);
        q9Var.setAnimatedEmojiDrawable(new o5(4, this.a, aiComposeTone.emoji_id));
        frameLayout2.addView(q9Var, c8.ma.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.X1 = textView;
        org.telegram.messenger.f3.l(textView, i10, i6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.Y1 = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, i10, i6Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.messenger.f3.k(textView2, 17, null, 2131754966);
        this.p1.setTitle(aiComposeTone.title);
        int i12 = org.telegram.ui.ActionBar.n6.a7;
        this.b0 = i12;
        v0(org.telegram.ui.ActionBar.n6.w0(i12, this.J0));
        ck0 ck0Var = this.o1;
        int i13 = this.u0;
        ck0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(66.0f));
        this.o1.setClipToPadding(false);
        this.o1.r1();
        this.o1.setOnItemClickListener(new n(this, 1));
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(36.0f);
        this.v1 = 0.35f;
        this.J1 = true;
        u uVar = new u(this);
        uVar.m = false;
        uVar.C = false;
        uVar.o(lr.h);
        uVar.n(350L);
        this.o1.setItemAnimator(uVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z1 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, org.telegram.ui.ActionBar.n6.w0(i12, this.J0)), org.telegram.ui.ActionBar.n6.w0(i12, this.J0), org.telegram.ui.ActionBar.n6.w0(i12, this.J0)}));
        FrameLayout.LayoutParams e10 = c8.ma.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.u0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.b.addView(frameLayout3, e10);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.a2 = frameLayout4;
        FrameLayout.LayoutParams d = c8.ma.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.u0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.b.addView(frameLayout4, d);
        hi.d g10 = org.telegram.messenger.n10.g(24, context, i6Var, true);
        this.b2 = g10;
        g10.setText(org.telegram.messenger.gd.M0(e1() ? 2131754980 : 2131755005, null));
        g10.setOnClickListener(new ah.h(this, aiComposeTone, i6Var, 20));
        frameLayout3.addView(g10, c8.ma.e(-1, 48, org.telegram.messenger.ks.E1));
        this.c2.O(false);
    }

    public static SpannableStringBuilder f1() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i7 = 0; i7 < 5; i7++) {
            if (i7 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int L = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(2131748587, null));
            p80 p80Var = new p80(null, L, 0, null);
            p80Var.f = org.telegram.messenger.g0.L(6.0f);
            p80Var.h = 0.5f;
            p80Var.n = true;
            spannableStringBuilder.setSpan(p80Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.a, 0, true, new d(this, 1), this.J0);
        this.c2 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.T1;
        return aiComposeTone == null ? "" : aiComposeTone.title;
    }

    @Override // org.telegram.ui.Components.sa
    public final void R0(float f10) {
        na naVar = this.p1;
        org.telegram.ui.ActionBar.n5 titleTextView = naVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
        float translationY = naVar.getTranslationY() + org.telegram.messenger.g0.m;
        int height = naVar.getHeight() - org.telegram.messenger.g0.m;
        this.V1.setTranslationY(((1.0f - f10) * org.telegram.messenger.g0.L(28.0f)) + ((height - r2.getHeight()) / 2.0f) + translationY);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.a4) {
            this.b2.setText(org.telegram.messenger.gd.M0(e1() ? 2131754980 : 2131755005, null));
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ks.f(this.a).n(this, org.telegram.messenger.ks.a4);
    }

    public final boolean e1() {
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

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.a7, this.J0);
            if (w02 != this.f2) {
                this.f2 = w02;
                v0(w02);
                this.Z1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.ks.f(this.a).c(this, org.telegram.messenger.ks.a4);
    }
}
