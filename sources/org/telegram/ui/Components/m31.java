package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class m31 extends sa {
    public ImageView T1;
    public FrameLayout U1;
    public hi.e V1;
    public CharSequence W1;
    public boolean X1;
    public CharSequence Y1;
    public jt Z1;
    public String a2;
    public String b2;
    public int c2;
    public String[] d2;
    public String[] e2;
    public c51 f2;
    public boolean g2;
    public int h2;
    public int i2;
    public int j2;

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.a, 0, true, new e31(this, 0), this.J0);
        this.f2 = c51Var;
        c51Var.r = false;
        return c51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return "Translate";
    }

    @Override // org.telegram.ui.Components.sa
    public final void R0(float f10) {
        ImageView imageView = this.T1;
        float f11 = 1.0f - f10;
        imageView.setAlpha(f11);
        imageView.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, f11));
    }

    public final void e1(a70 a70Var, LinearLayout linearLayout, boolean z10, String str, Runnable runnable) {
        int i7 = org.telegram.ui.ActionBar.m6.E8;
        int i10 = org.telegram.ui.ActionBar.m6.F8;
        org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(1, getContext(), this.J0, false, false);
        y0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        y0Var.setText(str);
        y0Var.setChecked(z10);
        y0Var.d(org.telegram.ui.ActionBar.m6.w0(i7, this.J0), org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
        y0Var.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(i7, this.J0)));
        y0Var.setOnClickListener(new m(a70Var, z10, runnable, 1));
        linearLayout.addView(y0Var, c8.ma.o(-1, -2));
    }

    public final void f1() {
        if (this.h2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.h2, true);
            this.h2 = -1;
        }
    }

    public final void g1() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        int i7 = 1;
        CharSequence[] charSequenceArr = {this.W1};
        tL_textWithEntities.entities = org.telegram.messenger.si.d0(this.a).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.Z1 != null) {
            this.V1.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131748586, null));
        spannableStringBuilder.setSpan(new r80(null, org.telegram.messenger.g0.L(120.0f), 0, null), 0, spannableStringBuilder.length(), 33);
        this.Y1 = spannableStringBuilder;
        this.X1 = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.b2;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i10 = this.c2;
        if (i10 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.d2[i10];
        }
        this.h2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_translateText, new d3.b(i7), new e31(this, i7));
        this.f2.O(true);
    }

    @Override // org.telegram.ui.Components.sa, org.telegram.ui.ActionBar.w2
    public final void h0() {
        FrameLayout frameLayout = this.U1;
        super.h0();
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            frameLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            frameLayout.setTranslationY(0.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        FrameLayout frameLayout = this.U1;
        try {
            super.s0();
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.J0);
            if (w02 != this.j2) {
                this.j2 = w02;
                v0(w02);
            }
            if (frameLayout == null || !(frameLayout.getBackground() instanceof GradientDrawable) || w02 == this.i2) {
                return;
            }
            this.i2 = w02;
            ((GradientDrawable) frameLayout.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, w02), w02, w02});
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        hi.e eVar = this.V1;
        super.show();
        na naVar = this.p1;
        if (naVar != null) {
            naVar.setTitle("Translate");
        }
        this.f2.O(false);
        g1();
        if (this.Z1 != null) {
            eVar.setText("Use This Translation");
            eVar.setOnClickListener(new d31(this, 3));
        }
    }
}
