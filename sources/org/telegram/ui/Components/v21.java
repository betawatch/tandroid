package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v21 extends na {
    public ImageView P1;
    public FrameLayout Q1;
    public fi.d R1;
    public CharSequence S1;
    public boolean T1;
    public CharSequence U1;
    public ts V1;
    public String W1;
    public String X1;
    public int Y1;
    public String[] Z1;
    public String[] a2;
    public l41 b2;
    public boolean c2;
    public int d2;
    public int e2;
    public int f2;

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(pj0Var, getContext(), this.a, 0, true, new n21(this, 0), this.I0);
        this.b2 = l41Var;
        l41Var.r = false;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return "Translate";
    }

    @Override // org.telegram.ui.Components.na
    public final void Q0(float f10) {
        ImageView imageView = this.P1;
        float f11 = 1.0f - f10;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    public final void d1(k60 k60Var, LinearLayout linearLayout, boolean z9, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.k6.E8;
        int i10 = org.telegram.ui.ActionBar.k6.F8;
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(1, getContext(), this.I0, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.setText(str);
        z0Var.setChecked(z9);
        z0Var.d(org.telegram.ui.ActionBar.k6.w0(i7, this.I0), org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(i7, this.I0)));
        z0Var.setOnClickListener(new i(k60Var, z9, runnable, 1));
        linearLayout.addView(z0Var, c8.ha.o(-1, -2));
    }

    public final void e1() {
        if (this.d2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.d2, true);
            this.d2 = -1;
        }
    }

    public final void f1() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        int i7 = 1;
        CharSequence[] charSequenceArr = {this.S1};
        tL_textWithEntities.entities = org.telegram.messenger.ui.b0(this.a).W(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.V1 != null) {
            this.R1.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131748778, null));
        spannableStringBuilder.setSpan(new b80(null, org.telegram.messenger.g0.L(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.U1 = spannableStringBuilder;
        this.T1 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.X1;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.Y1;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.Z1[i10];
        }
        this.d2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_translateText, new d3.b(i7), new n21(this, i7));
        this.b2.O(true);
    }

    @Override // org.telegram.ui.Components.na, org.telegram.ui.ActionBar.v2
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

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        FrameLayout frameLayout = this.Q1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.I0);
            if (w02 != this.f2) {
                this.f2 = w02;
                v0(w02);
            }
            if (frameLayout == null || !(frameLayout.getBackground() instanceof GradientDrawable) || w02 == this.e2) {
                return;
            }
            this.e2 = w02;
            ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02, w02});
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        fi.d dVar = this.R1;
        super.show();
        ja jaVar = this.l1;
        if (jaVar != null) {
            jaVar.setTitle("Translate");
        }
        this.b2.O(false);
        f1();
        if (this.V1 != null) {
            dVar.setText("Use This Translation");
            dVar.setOnClickListener(new m21(this, 3));
        }
    }
}
