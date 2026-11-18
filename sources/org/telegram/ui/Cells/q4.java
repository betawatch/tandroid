package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.ng0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.q9 a;
    public final org.telegram.ui.ActionBar.n5 b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final org.telegram.ui.Components.b9 d;
    public final mp e;
    public org.telegram.messenger.f5 f;
    public CharSequence h;
    public int n;

    public q4(Context context, boolean z10) {
        super(context);
        this.d = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(q9Var, c8.ma.d(46, 46.0f, (gd.a0 ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = gd.a0;
        addView(linearLayout, c8.ma.d(-1, -1.0f, ks.E1, z11 ? 0 : 72, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, c8.ma.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setTextSize(15);
        n5Var.setGravity((gd.a0 ? 5 : 3) | 48);
        frameLayout.addView(n5Var, c8.ma.d(-1, 20.0f, (gd.a0 ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var2;
        n5Var2.setTextSize(13);
        n5Var2.setGravity((gd.a0 ? 5 : 3) | 48);
        frameLayout.addView(n5Var2, c8.ma.d(-1, 20.0f, (gd.a0 ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            mp mpVar = new mp(21, context, null);
            this.e = mpVar;
            mpVar.b(-1, org.telegram.ui.ActionBar.n6.d6, org.telegram.ui.ActionBar.n6.k7);
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(3);
            boolean z12 = gd.a0;
            addView(mpVar, c8.ma.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        ng0 ng0Var = new ng0(context);
        ng0Var.setText(gd.M0(2131748982, null));
        ng0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(ng0Var, org.telegram.ui.ActionBar.n6.Ji, null);
        ng0Var.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ei, false));
        int i7 = org.telegram.ui.ActionBar.n6.Yl;
        y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.x0(null, i7, false), 16.0f);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i7);
        ng0Var.setBackground(e10);
        org.telegram.ui.ActionBar.u6.j(ng0Var, e10, M, e11, null);
        ng0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        linearLayout.addView(ng0Var, c8.ma.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        ng0Var.setOnClickListener(new a(this, 6));
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
        org.telegram.ui.Components.b9 b9Var = this.d;
        b9Var.k(j3, str, str2, null);
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
        this.a.setImageDrawable(b9Var);
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
            org.telegram.ui.Components.q9 q9Var = this.a;
            if (q9Var != null) {
                q9Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
