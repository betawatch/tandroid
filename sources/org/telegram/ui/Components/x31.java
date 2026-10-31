package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x31 extends ha {
    public ImageView P1;
    public FrameLayout Q1;
    public vh.d R1;
    public CharSequence S1;
    public boolean T1;
    public Spannable U1;
    public gt V1;
    public String W1;
    public String X1;
    public int Y1;
    public String[] Z1;
    public String[] a2;
    public p51 b2;
    public boolean c2;
    public int d2;
    public int e2;
    public int f2;

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.a, 0, true, new p31(this, 0), this.I0);
        this.b2 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return "Translate";
    }

    @Override // org.telegram.ui.Components.ha
    public final void Q0(float f7) {
        ImageView imageView = this.P1;
        float f10 = 1.0f - f7;
        imageView.setAlpha(f10);
        imageView.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, f10));
        imageView.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, f10));
    }

    public final void d1(z60 z60Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i10 = org.telegram.ui.ActionBar.t6.E8;
        int i11 = org.telegram.ui.ActionBar.t6.F8;
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(1, getContext(), this.I0, false, false);
        b1Var.setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        b1Var.setText(str);
        b1Var.setChecked(z10);
        b1Var.d(org.telegram.ui.ActionBar.t6.w0(i10, this.I0), org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
        b1Var.setSelectorColor(org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.w0(i10, this.I0)));
        b1Var.setOnClickListener(new h(z60Var, z10, runnable, 1));
        linearLayout.addView(b1Var, w7.b6.o(-1, -2));
    }

    public final void e1() {
        if (this.d2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.d2, true);
            this.d2 = -1;
        }
    }

    public final void f1() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        int i10 = 1;
        CharSequence[] charSequenceArr = {this.S1};
        tL_textWithEntities.entities = org.telegram.messenger.ui.b0(this.a).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.V1 != null) {
            this.R1.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131748789, null));
        spannableStringBuilder.setSpan(new u80(null, org.telegram.messenger.i0.L(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.U1 = spannableStringBuilder;
        this.T1 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.X1;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i11 = this.Y1;
        if (i11 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.Z1[i11];
        }
        this.d2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_translateText, new a3.b(i10), new p31(this, i10));
        this.b2.O(true);
    }

    @Override // org.telegram.ui.Components.ha, org.telegram.ui.ActionBar.z2
    public final void h0() {
        FrameLayout frameLayout = this.Q1;
        super.h0();
        ValueAnimator valueAnimator = this.O0;
        if (valueAnimator != null) {
            frameLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            frameLayout.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        FrameLayout frameLayout = this.Q1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.I0);
            if (w02 != this.f2) {
                this.f2 = w02;
                v0(w02);
            }
            if (frameLayout == null || !(frameLayout.getBackground() instanceof GradientDrawable) || w02 == this.e2) {
                return;
            }
            this.e2 = w02;
            ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, w02), w02, w02});
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        vh.d dVar = this.R1;
        super.show();
        da daVar = this.l1;
        if (daVar != null) {
            daVar.setTitle("Translate");
        }
        this.b2.O(false);
        f1();
        if (this.V1 != null) {
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new o31(this, 3));
        }
    }
}
