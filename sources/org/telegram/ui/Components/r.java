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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r extends ma implements org.telegram.messenger.cs {
    public final TL_aicompose.AiComposeTone Q1;
    public final org.telegram.messenger.e R1;
    public final ImageView S1;
    public final FrameLayout T1;
    public final TextView U1;
    public final TextView V1;
    public final FrameLayout W1;
    public final FrameLayout X1;
    public final gi.d Y1;
    public f41 Z1;
    public int a2;
    public final TL_aicompose.aiComposeToneExample[] b2;
    public int c2;

    public r(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, 2, e6Var);
        int i3 = 0;
        this.a2 = 0;
        org.telegram.messenger.e R1 = org.telegram.messenger.hp.s1(this.a).R1();
        this.R1 = R1;
        R1.b();
        this.Q1 = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[((org.telegram.messenger.j0) org.telegram.messenger.hp.s1(this.a).x7.P.b).c];
        this.b2 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.S1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i10, this.J0)), 1, -1);
        org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i10);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, L, e6Var);
        this.b.addView(imageView, b8.mf.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        b8.pf.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new o(this, i3));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L2 = org.telegram.messenger.g0.L(100.0f);
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        ShapeDrawable L3 = org.telegram.ui.ActionBar.k6.L(L2, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        frameLayout2.setBackground(L3);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, L3, N, null, e6Var);
        frameLayout.addView(frameLayout2, b8.mf.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        k9 k9Var = new k9(context);
        k9Var.setAnimatedEmojiDrawable(new g5(4, this.a, aiComposeTone.emoji_id));
        frameLayout2.addView(k9Var, b8.mf.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.U1 = textView;
        org.telegram.messenger.k5.n(textView, i10, e6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.V1 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i10, e6Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.m(textView2, 17, null, 2131754966);
        this.m1.setTitle(aiComposeTone.title);
        int i12 = org.telegram.ui.ActionBar.k6.a7;
        this.b0 = i12;
        v0(org.telegram.ui.ActionBar.k6.w0(i12, this.J0));
        tj0 tj0Var = this.l1;
        int i13 = this.u0;
        tj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(66.0f));
        this.l1.setClipToPadding(false);
        this.l1.r1();
        this.l1.setOnItemClickListener(new k(this, 1));
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(36.0f);
        this.s1 = 0.35f;
        this.G1 = true;
        q qVar = new q(this);
        qVar.m = false;
        qVar.C = false;
        qVar.o(xq.h);
        qVar.n(350L);
        this.l1.setItemAnimator(qVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.W1 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, org.telegram.ui.ActionBar.k6.w0(i12, this.J0)), org.telegram.ui.ActionBar.k6.w0(i12, this.J0), org.telegram.ui.ActionBar.k6.w0(i12, this.J0)}));
        FrameLayout.LayoutParams e10 = b8.mf.e(-1, -2, 80);
        int i14 = e10.leftMargin;
        int i15 = this.u0;
        e10.leftMargin = i14 + i15;
        e10.rightMargin += i15;
        this.b.addView(frameLayout3, e10);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.X1 = frameLayout4;
        FrameLayout.LayoutParams d = b8.mf.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.u0;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.b.addView(frameLayout4, d);
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.Y1 = h;
        h.setText(org.telegram.messenger.bd.M0(d1() ? 2131754980 : 2131755005, null));
        h.setOnClickListener(new ai.h(this, aiComposeTone, e6Var, 20));
        frameLayout3.addView(h, b8.mf.e(-1, 48, org.telegram.messenger.hs.E1));
        this.Z1.O(false);
    }

    public static SpannableStringBuilder e1() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i3 = 0; i3 < 5; i3++) {
            if (i3 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int L = org.telegram.messenger.g0.L((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131748787, null));
            x70 x70Var = new x70(null, L, 0, null);
            x70Var.f = org.telegram.messenger.g0.L(6.0f);
            x70Var.h = 0.5f;
            x70Var.n = true;
            spannableStringBuilder.setSpan(x70Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.a, 0, true, new e(this, 1), this.J0);
        this.Z1 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        TL_aicompose.AiComposeTone aiComposeTone = this.Q1;
        return aiComposeTone == null ? "" : aiComposeTone.title;
    }

    @Override // org.telegram.ui.Components.ma
    public final void Q0(float f10) {
        ia iaVar = this.m1;
        org.telegram.ui.ActionBar.k5 titleTextView = iaVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
        float translationY = iaVar.getTranslationY() + org.telegram.messenger.g0.m;
        int height = iaVar.getHeight() - org.telegram.messenger.g0.m;
        this.S1.setTranslationY(((1.0f - f10) * org.telegram.messenger.g0.L(28.0f)) + ((height - r2.getHeight()) / 2.0f) + translationY);
    }

    public final boolean d1() {
        TL_aicompose.AiComposeTone aiComposeTone = this.Q1;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i3 = 0;
            while (true) {
                org.telegram.messenger.e eVar = this.R1;
                if (i3 >= eVar.b.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) eVar.b.get(i3);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).id == tL_aiComposeTone.id) {
                    return true;
                }
                i3++;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.Y3) {
            this.Y1.setText(org.telegram.messenger.bd.M0(d1() ? 2131754980 : 2131755005, null));
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.hs.f(this.a).n(this, org.telegram.messenger.hs.Y3);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0);
            if (w02 != this.c2) {
                this.c2 = w02;
                v0(w02);
                this.W1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02, w02}));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.hs.f(this.a).c(this, org.telegram.messenger.hs.Y3);
    }
}
