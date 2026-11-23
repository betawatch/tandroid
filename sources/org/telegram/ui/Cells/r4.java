package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.og0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.p9 a;
    public final org.telegram.ui.ActionBar.n5 b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final org.telegram.ui.Components.a9 d;
    public final lp e;
    public org.telegram.messenger.f5 f;
    public CharSequence h;
    public int n;

    public r4(Context context, boolean z10) {
        super(context);
        this.d = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(p9Var, c8.na.d(46, 46.0f, (gd.a0 ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = gd.a0;
        addView(linearLayout, c8.na.d(-1, -1.0f, ks.E1, z11 ? 0 : 72, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, c8.na.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setTextSize(15);
        n5Var.setGravity((gd.a0 ? 5 : 3) | 48);
        frameLayout.addView(n5Var, c8.na.d(-1, 20.0f, (gd.a0 ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var2;
        n5Var2.setTextSize(13);
        n5Var2.setGravity((gd.a0 ? 5 : 3) | 48);
        frameLayout.addView(n5Var2, c8.na.d(-1, 20.0f, (gd.a0 ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            lp lpVar = new lp(21, context, null);
            this.e = lpVar;
            lpVar.b(-1, org.telegram.ui.ActionBar.n6.d6, org.telegram.ui.ActionBar.n6.k7);
            lpVar.setDrawUnchecked(false);
            lpVar.setDrawBackgroundAsArc(3);
            boolean z12 = gd.a0;
            addView(lpVar, c8.na.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        og0 og0Var = new og0(context);
        og0Var.setText(gd.N0(2131748981, null));
        og0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(og0Var, org.telegram.ui.ActionBar.n6.Ji, null);
        og0Var.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ei, false));
        int i7 = org.telegram.ui.ActionBar.n6.Yl;
        y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 16.0f);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i7);
        og0Var.setBackground(e10);
        org.telegram.ui.ActionBar.u6.j(og0Var, e10, M, e11, null);
        og0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        linearLayout.addView(og0Var, c8.na.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        og0Var.setOnClickListener(new a(this, 6));
    }

    public final void a(org.telegram.messenger.f5 f5Var, CharSequence charSequence) {
        this.f = f5Var;
        this.h = charSequence;
        if (f5Var == null) {
            return;
        }
        long j3 = f5Var.a;
        String str = f5Var.i;
        String str2 = f5Var.j;
        org.telegram.ui.Components.a9 a9Var = this.d;
        a9Var.k(j3, str, str2, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.n5 n5Var = this.b;
        if (charSequence2 != null) {
            n5Var.l(charSequence2, true);
        } else {
            org.telegram.messenger.f5 f5Var2 = this.f;
            n5Var.l(org.telegram.messenger.i5.m(0, f5Var2.i, f5Var2.j), false);
        }
        int i7 = org.telegram.ui.ActionBar.n6.y6;
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.c;
        n5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.u6.X(n5Var2, i7, null);
        org.telegram.messenger.f5 f5Var3 = this.f;
        int i10 = f5Var3.l;
        if (i10 > 0) {
            n5Var2.l(gd.G(i10, "TelegramContacts", new Object[0]), false);
        } else {
            n5Var2.l((CharSequence) f5Var3.e.get(0), false);
        }
        this.a.setImageDrawable(a9Var);
    }

    public org.telegram.messenger.f5 getContact() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J7, false) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.O7, false)) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.P7, false)) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Q7, false)) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.R7, false)) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.S7, false)) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T7, false)) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.U7, false);
            if (x02 == this.n) {
                return;
            }
            this.n = x02;
            org.telegram.ui.Components.p9 p9Var = this.a;
            if (p9Var != null) {
                p9Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
