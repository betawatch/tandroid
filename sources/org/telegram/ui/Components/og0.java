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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class og0 extends org.telegram.ui.ActionBar.t2 {
    public final Bitmap j1;
    public final TextView k1;
    public final TextView l1;
    public final TextView m1;
    public final int n1;
    public final fh0 o1;
    public boolean p1;
    public int q1;

    public og0(Context context, String str, String str2, String str3, boolean z10) {
        super(1, context, (org.telegram.ui.ActionBar.e6) null, false);
        Bitmap bitmap;
        N();
        this.P = str;
        this.Q = true;
        lg.k kVar = new lg.k(context, 3);
        kVar.setScaleType(ImageView.ScaleType.FIT_XY);
        kVar.setOutlineProvider(new cg.p0(17));
        kVar.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        Bitmap bitmap2 = this.j1;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(yb.b.a, dc.b.c);
            hashMap.put(yb.b.c, 0);
            org.telegram.messenger.pz pzVar = new org.telegram.messenger.pz();
            bitmap = pzVar.a(str2, 768, 768, hashMap, bitmap2, 1.0f, -1, -16777216);
            this.n1 = pzVar.f;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            bitmap = null;
        }
        this.j1 = bitmap;
        kVar.setImageBitmap(bitmap);
        fh0 fh0Var = new fh0(context);
        this.o1 = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        fh0Var.setBackgroundColor(-1);
        org.telegram.ui.vi0 vi0Var = new org.telegram.ui.vi0(this, context, kVar);
        vi0Var.addView(kVar, b8.mf.c(-1.0f, -1));
        vi0Var.addView(fh0Var, b8.mf.e(60, 60, 17));
        linearLayout.addView(vi0Var, b8.mf.t(org.telegram.messenger.hs.x3, org.telegram.messenger.hs.x3, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.k1 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, b8.mf.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.l1 = textView2;
        textView2.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(org.telegram.messenger.bd.M0(2131745458, null));
        textView2.setOnClickListener(new q2(26, this, context));
        linearLayout.addView(textView2, b8.mf.t(-1, 48, 80, 16, 15, 16, 3));
        if (z10) {
            TextView textView3 = new TextView(context);
            this.m1 = textView3;
            textView3.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(org.telegram.messenger.bd.M0(2131745468, null));
            textView3.setOnClickListener(new q2(27, str2, context));
            linearLayout.addView(textView3, b8.mf.t(-1, 48, 80, 16, 3, 16, 16));
        }
        updateColors();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        this.O = scrollView;
    }

    public final void I0() {
        fh0 fh0Var = this.o1;
        fh0Var.setAutoRepeat(true);
        fh0Var.f(R.raw.qr_code_logo, 60, 60, null);
        fh0Var.d();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            int i3 = org.telegram.ui.ActionBar.k6.Gi;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i3, this.J0) * 31;
            int i10 = org.telegram.ui.ActionBar.k6.Ci;
            int w03 = (org.telegram.ui.ActionBar.k6.w0(i10, this.J0) * 17) + w02;
            int i11 = org.telegram.ui.ActionBar.k6.Ei;
            int w04 = (org.telegram.ui.ActionBar.k6.w0(i11, this.J0) * 13) + w03;
            int i12 = org.telegram.ui.ActionBar.k6.i6;
            int w05 = (org.telegram.ui.ActionBar.k6.w0(i12, this.J0) * 7) + w04;
            int i13 = org.telegram.ui.ActionBar.k6.y6;
            int w06 = (org.telegram.ui.ActionBar.k6.w0(i13, this.J0) * 5) + w05;
            int i14 = org.telegram.ui.ActionBar.k6.G6;
            int w07 = (org.telegram.ui.ActionBar.k6.w0(i14, this.J0) * 3) + w06;
            int i15 = org.telegram.ui.ActionBar.k6.h5;
            int w08 = w07 + org.telegram.ui.ActionBar.k6.w0(i15, this.J0);
            if (this.p1 && w08 == this.q1) {
                return;
            }
            this.p1 = true;
            this.q1 = w08;
            TextView textView = this.l1;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), org.telegram.ui.ActionBar.k6.w0(i10, this.J0), false);
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), org.telegram.ui.ActionBar.k6.w0(i11, this.J0), true);
            }
            TextView textView2 = this.m1;
            if (textView2 != null) {
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
                org.telegram.ui.ActionBar.k6.H1(textView2.getBackground(), i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, this.J0), Math.min(org.telegram.messenger.hs.e4, Color.alpha(org.telegram.ui.ActionBar.k6.w0(i12, this.J0)) * 2)), true);
            }
            TextView textView3 = this.k1;
            if (textView3 != null) {
                textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i13, this.J0));
            }
            org.telegram.ui.ActionBar.k2 k2Var = this.m0;
            if (k2Var != null) {
                k2Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i14, this.J0));
            }
            v0(org.telegram.ui.ActionBar.k6.w0(i15, this.J0));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void updateColors() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, this.J0);
        TextView textView = this.l1;
        textView.setTextColor(w02);
        int L = org.telegram.messenger.g0.L(24.0f);
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i3, this.J0);
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ei, this.J0);
        textView.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w03, w04, w04));
        TextView textView2 = this.m1;
        if (textView2 != null) {
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
            textView2.setBackground(org.telegram.ui.ActionBar.k6.h0(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i3, this.J0), Math.min(org.telegram.messenger.hs.e4, Color.alpha(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, this.J0)) * 2)), 7, -1));
        }
        int i10 = org.telegram.ui.ActionBar.k6.y6;
        int w05 = org.telegram.ui.ActionBar.k6.w0(i10, this.J0);
        TextView textView3 = this.k1;
        textView3.setTextColor(w05);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
        org.telegram.ui.ActionBar.k2 k2Var = this.m0;
        if (k2Var != null) {
            k2Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.J0));
        }
        v0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0));
    }
}
