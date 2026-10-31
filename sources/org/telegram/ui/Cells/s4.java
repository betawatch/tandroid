package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ep;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.g9 a;
    public final org.telegram.ui.ActionBar.u5 b;
    public final org.telegram.ui.ActionBar.u5 c;
    public final org.telegram.ui.Components.r8 d;
    public final ep e;
    public org.telegram.messenger.f5 f;
    public CharSequence h;
    public int n;

    public s4(Context context, boolean z10) {
        super(context);
        this.d = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(23.0f));
        addView(g9Var, w7.b6.d(46, 46.0f, (cd.X ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = cd.X;
        addView(linearLayout, w7.b6.d(-1, -1.0f, zs.E1, z11 ? 0 : 72, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, w7.b6.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.b = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(15);
        u5Var.setGravity((cd.X ? 5 : 3) | 48);
        frameLayout.addView(u5Var, w7.b6.d(-1, 20.0f, (cd.X ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.c = u5Var2;
        u5Var2.setTextSize(13);
        u5Var2.setGravity((cd.X ? 5 : 3) | 48);
        frameLayout.addView(u5Var2, w7.b6.d(-1, 20.0f, (cd.X ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            ep epVar = new ep(21, context, null);
            this.e = epVar;
            epVar.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(3);
            boolean z12 = cd.X;
            addView(epVar, w7.b6.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        ch0 ch0Var = new ch0(context);
        ch0Var.setText(cd.L0(2131749184, null));
        ch0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(ch0Var, org.telegram.ui.ActionBar.t6.Gi, null);
        ch0Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
        int i10 = org.telegram.ui.ActionBar.t6.Vl;
        y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.x0(null, i10, false), 16.0f);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.w6 f7 = org.telegram.ui.ActionBar.a7.f(i10);
        ch0Var.setBackground(e);
        org.telegram.ui.ActionBar.a7.k(ch0Var, e, N, f7, null);
        ch0Var.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        linearLayout.addView(ch0Var, w7.b6.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        ch0Var.setOnClickListener(new a(this, 6));
    }

    public final void a(org.telegram.messenger.f5 f5Var, CharSequence charSequence) {
        this.f = f5Var;
        this.h = charSequence;
        if (f5Var == null) {
            return;
        }
        long j10 = f5Var.a;
        String str = f5Var.i;
        String str2 = f5Var.j;
        org.telegram.ui.Components.r8 r8Var = this.d;
        r8Var.k(j10, str, str2, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.u5 u5Var = this.b;
        if (charSequence2 != null) {
            u5Var.l(charSequence2, true);
        } else {
            org.telegram.messenger.f5 f5Var2 = this.f;
            u5Var.l(org.telegram.messenger.i5.m(0, f5Var2.i, f5Var2.j), false);
        }
        int i10 = org.telegram.ui.ActionBar.t6.y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.u5 u5Var2 = this.c;
        u5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.a7.Y(u5Var2, i10, null);
        org.telegram.messenger.f5 f5Var3 = this.f;
        int i11 = f5Var3.l;
        if (i11 > 0) {
            u5Var2.l(cd.G(i11, "TelegramContacts", new Object[0]), false);
        } else {
            u5Var2.l((CharSequence) f5Var3.e.get(0), false);
        }
        this.a.setImageDrawable(r8Var);
    }

    public org.telegram.messenger.f5 getContact() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J7, false) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O7, false)) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P7, false)) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Q7, false)) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.R7, false)) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.S7, false)) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T7, false)) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.U7, false);
            if (x02 == this.n) {
                return;
            }
            this.n = x02;
            org.telegram.ui.Components.g9 g9Var = this.a;
            if (g9Var != null) {
                g9Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
