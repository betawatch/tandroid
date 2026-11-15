package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.fp;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.i9 a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final org.telegram.ui.Components.t8 d;
    public final fp e;
    public org.telegram.messenger.d5 f;
    public CharSequence h;
    public int n;

    public q4(Context context, boolean z10) {
        super(context);
        this.d = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(i9Var, c8.ja.d(46, 46.0f, (hd.a0 ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = hd.a0;
        addView(linearLayout, c8.ja.d(-1, -1.0f, ns.E1, z11 ? 0 : 72, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, c8.ja.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.G6, null);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setTextSize(15);
        j5Var.setGravity((hd.a0 ? 5 : 3) | 48);
        frameLayout.addView(j5Var, c8.ja.d(-1, 20.0f, (hd.a0 ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var2;
        j5Var2.setTextSize(13);
        j5Var2.setGravity((hd.a0 ? 5 : 3) | 48);
        frameLayout.addView(j5Var2, c8.ja.d(-1, 20.0f, (hd.a0 ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            fp fpVar = new fp(21, context, null);
            this.e = fpVar;
            fpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
            fpVar.setDrawUnchecked(false);
            fpVar.setDrawBackgroundAsArc(3);
            boolean z12 = hd.a0;
            addView(fpVar, c8.ja.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        dg0 dg0Var = new dg0(context);
        dg0Var.setText(hd.M0(2131749174, null));
        dg0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(dg0Var, org.telegram.ui.ActionBar.j6.Ji, null);
        dg0Var.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ei, false));
        int i7 = org.telegram.ui.ActionBar.j6.Yl;
        y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.x0(null, i7, false), 16.0f);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.m6 e11 = org.telegram.ui.ActionBar.q6.e(i7);
        dg0Var.setBackground(e10);
        org.telegram.ui.ActionBar.q6.j(dg0Var, e10, M, e11, null);
        dg0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        linearLayout.addView(dg0Var, c8.ja.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        dg0Var.setOnClickListener(new a(this, 6));
    }

    public final void a(org.telegram.messenger.d5 d5Var, CharSequence charSequence) {
        this.f = d5Var;
        this.h = charSequence;
        if (d5Var == null) {
            return;
        }
        long j3 = d5Var.a;
        String str = d5Var.i;
        String str2 = d5Var.j;
        org.telegram.ui.Components.t8 t8Var = this.d;
        t8Var.k(j3, str, str2, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.j5 j5Var = this.b;
        if (charSequence2 != null) {
            j5Var.l(charSequence2, true);
        } else {
            org.telegram.messenger.d5 d5Var2 = this.f;
            j5Var.l(org.telegram.messenger.g5.m(0, d5Var2.i, d5Var2.j), false);
        }
        int i7 = org.telegram.ui.ActionBar.j6.y6;
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.c;
        j5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.q6.X(j5Var2, i7, null);
        org.telegram.messenger.d5 d5Var3 = this.f;
        int i10 = d5Var3.l;
        if (i10 > 0) {
            j5Var2.l(hd.G(i10, "TelegramContacts", new Object[0]), false);
        } else {
            j5Var2.l((CharSequence) d5Var3.e.get(0), false);
        }
        this.a.setImageDrawable(t8Var);
    }

    public org.telegram.messenger.d5 getContact() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J7, false) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.O7, false)) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.P7, false)) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Q7, false)) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.R7, false)) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.S7, false)) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.T7, false)) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.U7, false);
            if (x02 == this.n) {
                return;
            }
            this.n = x02;
            org.telegram.ui.Components.i9 i9Var = this.a;
            if (i9Var != null) {
                i9Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
