package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class nh0 extends org.telegram.ui.ActionBar.z2 {
    public final Bitmap i1;
    public final TextView j1;
    public final TextView k1;
    public final TextView l1;
    public final int m1;
    public final ei0 n1;
    public boolean o1;
    public int p1;

    public nh0(Context context, String str, String str2, String str3, boolean z10) {
        super(1, context, (org.telegram.ui.ActionBar.p6) null, false);
        Bitmap bitmap;
        O();
        this.O = str;
        this.P = true;
        ag.r rVar = new ag.r(context, 3);
        rVar.setScaleType(ImageView.ScaleType.FIT_XY);
        int i10 = 14;
        rVar.setOutlineProvider(new bi.d2(i10));
        rVar.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(16.0f), 0, 0);
        Bitmap bitmap2 = this.i1;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(vb.b.a, ac.d.c);
            hashMap.put(vb.b.c, 0);
            org.telegram.messenger.i00 i00Var = new org.telegram.messenger.i00();
            bitmap = i00Var.a(str2, 768, 768, hashMap, bitmap2, 1.0f, -1, -16777216);
            this.m1 = i00Var.f;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            bitmap = null;
        }
        this.i1 = bitmap;
        rVar.setImageBitmap(bitmap);
        ei0 ei0Var = new ei0(context);
        this.n1 = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        ei0Var.setBackgroundColor(-1);
        org.telegram.ui.hk0 hk0Var = new org.telegram.ui.hk0(this, context, rVar);
        hk0Var.addView(rVar, w7.b6.c(-1.0f, -1));
        hk0Var.addView(ei0Var, w7.b6.e(60, 60, 17));
        linearLayout.addView(hk0Var, w7.b6.t(org.telegram.messenger.zs.x3, org.telegram.messenger.zs.x3, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.j1 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, w7.b6.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.k1 = textView2;
        textView2.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setText(org.telegram.messenger.cd.L0(2131745466, null));
        textView2.setOnClickListener(new sr(13, this, context));
        linearLayout.addView(textView2, w7.b6.t(-1, 48, 80, 16, 15, 16, 3));
        if (z10) {
            TextView textView3 = new TextView(context);
            this.l1 = textView3;
            textView3.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(org.telegram.messenger.cd.L0(2131745476, null));
            textView3.setOnClickListener(new sr(i10, str2, context));
            linearLayout.addView(textView3, w7.b6.t(-1, 48, 80, 16, 3, 16, 16));
        }
        updateColors();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        this.N = scrollView;
    }

    public final void I0() {
        ei0 ei0Var = this.n1;
        ei0Var.setAutoRepeat(true);
        ei0Var.f(R.raw.qr_code_logo, 60, 60, null);
        ei0Var.d();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            int i10 = org.telegram.ui.ActionBar.t6.Gi;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i10, this.I0) * 31;
            int i11 = org.telegram.ui.ActionBar.t6.Ci;
            int w03 = (org.telegram.ui.ActionBar.t6.w0(i11, this.I0) * 17) + w02;
            int i12 = org.telegram.ui.ActionBar.t6.Ei;
            int w04 = (org.telegram.ui.ActionBar.t6.w0(i12, this.I0) * 13) + w03;
            int i13 = org.telegram.ui.ActionBar.t6.i6;
            int w05 = (org.telegram.ui.ActionBar.t6.w0(i13, this.I0) * 7) + w04;
            int i14 = org.telegram.ui.ActionBar.t6.y6;
            int w06 = (org.telegram.ui.ActionBar.t6.w0(i14, this.I0) * 5) + w05;
            int i15 = org.telegram.ui.ActionBar.t6.G6;
            int w07 = (org.telegram.ui.ActionBar.t6.w0(i15, this.I0) * 3) + w06;
            int i16 = org.telegram.ui.ActionBar.t6.h5;
            int w08 = w07 + org.telegram.ui.ActionBar.t6.w0(i16, this.I0);
            if (this.o1 && w08 == this.p1) {
                return;
            }
            this.o1 = true;
            this.p1 = w08;
            TextView textView = this.k1;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
                org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), org.telegram.ui.ActionBar.t6.w0(i11, this.I0), false);
                org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), org.telegram.ui.ActionBar.t6.w0(i12, this.I0), true);
            }
            TextView textView2 = this.l1;
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
                org.telegram.ui.ActionBar.t6.H1(textView2.getBackground(), i0.b.o(org.telegram.ui.ActionBar.t6.w0(i11, this.I0), Math.min(org.telegram.messenger.zs.e4, Color.alpha(org.telegram.ui.ActionBar.t6.w0(i13, this.I0)) * 2)), true);
            }
            TextView textView3 = this.j1;
            if (textView3 != null) {
                textView3.setTextColor(org.telegram.ui.ActionBar.t6.w0(i14, this.I0));
            }
            org.telegram.ui.ActionBar.q2 q2Var = this.l0;
            if (q2Var != null) {
                q2Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i15, this.I0));
            }
            v0(org.telegram.ui.ActionBar.t6.w0(i16, this.I0));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gi, this.I0);
        TextView textView = this.k1;
        textView.setTextColor(w02);
        int L = org.telegram.messenger.i0.L(24.0f);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        int w03 = org.telegram.ui.ActionBar.t6.w0(i10, this.I0);
        int w04 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ei, this.I0);
        textView.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w03, w04, w04));
        TextView textView2 = this.l1;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
            textView2.setBackground(org.telegram.ui.ActionBar.t6.h0(i0.b.o(org.telegram.ui.ActionBar.t6.w0(i10, this.I0), Math.min(org.telegram.messenger.zs.e4, Color.alpha(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, this.I0)) * 2)), 7, -1));
        }
        int i11 = org.telegram.ui.ActionBar.t6.y6;
        int w05 = org.telegram.ui.ActionBar.t6.w0(i11, this.I0);
        TextView textView3 = this.j1;
        textView3.setTextColor(w05);
        textView3.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, this.I0));
        org.telegram.ui.ActionBar.q2 q2Var = this.l0;
        if (q2Var != null) {
            q2Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.I0));
        }
        v0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0));
    }
}
