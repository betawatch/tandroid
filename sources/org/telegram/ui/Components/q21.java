package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q21 extends ma {
    public ImageView Q1;
    public FrameLayout R1;
    public gi.d S1;
    public CharSequence T1;
    public boolean U1;
    public CharSequence V1;
    public ts W1;
    public String X1;
    public String Y1;
    public int Z1;
    public String[] a2;
    public String[] b2;
    public f41 c2;
    public boolean d2;
    public int e2;
    public int f2;
    public int g2;

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.a, 0, true, new i21(this, 0), this.J0);
        this.c2 = f41Var;
        f41Var.r = false;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return "Translate";
    }

    @Override // org.telegram.ui.Components.ma
    public final void Q0(float f10) {
        ImageView imageView = this.Q1;
        float f11 = 1.0f - f10;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    public final void d1(f60 f60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i3 = org.telegram.ui.ActionBar.k6.E8;
        int i10 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, getContext(), this.J0, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(str);
        y0Var.setChecked(z10);
        y0Var.d(org.telegram.ui.ActionBar.k6.w0(i3, this.J0), org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
        y0Var.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(i3, this.J0)));
        y0Var.setOnClickListener(new i(f60Var, z10, runnable, 1));
        linearLayout.addView(y0Var, b8.mf.o(-1, -2));
    }

    public final void e1() {
        if (this.e2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.e2, true);
            this.e2 = -1;
        }
    }

    public final void f1() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        int i3 = 1;
        CharSequence[] charSequenceArr = {this.T1};
        tL_textWithEntities.entities = org.telegram.messenger.li.b0(this.a).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.W1 != null) {
            this.S1.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131748787, null));
        spannableStringBuilder.setSpan(new x70(null, org.telegram.messenger.g0.L(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.V1 = spannableStringBuilder;
        this.U1 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.Y1;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.Z1;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.a2[i10];
        }
        this.e2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_translateText, new c3.b(i3), new i21(this, i3));
        this.c2.O(true);
    }

    @Override // org.telegram.ui.Components.ma, org.telegram.ui.ActionBar.t2
    public final void h0() {
        FrameLayout frameLayout = this.R1;
        super.h0();
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            frameLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            frameLayout.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        FrameLayout frameLayout = this.R1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0);
            if (w02 != this.g2) {
                this.g2 = w02;
                v0(w02);
            }
            if (frameLayout == null || !(frameLayout.getBackground() instanceof GradientDrawable) || w02 == this.f2) {
                return;
            }
            this.f2 = w02;
            ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02, w02});
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        gi.d dVar = this.S1;
        super.show();
        ia iaVar = this.m1;
        if (iaVar != null) {
            iaVar.setTitle("Translate");
        }
        this.c2.O(false);
        f1();
        if (this.W1 != null) {
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new h21(this, 3));
        }
    }
}
