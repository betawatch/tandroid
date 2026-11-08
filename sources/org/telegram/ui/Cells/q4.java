package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class q4 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.Components.l9 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final org.telegram.ui.Components.w8 d;
    public final wo e;
    public org.telegram.messenger.d5 f;
    public CharSequence h;
    public int n;

    public q4(Context context, boolean z9) {
        super(context);
        this.d = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(l9Var, c8.ha.d(46, 46.0f, (id.a0 ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z10 = id.a0;
        addView(linearLayout, c8.ha.d(-1, -1.0f, qs.E1, z10 ? 0 : 72, 0.0f, z10 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, c8.ha.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(15);
        k5Var.setGravity((id.a0 ? 5 : 3) | 48);
        frameLayout.addView(k5Var, c8.ha.d(-1, 20.0f, (id.a0 ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var2;
        k5Var2.setTextSize(13);
        k5Var2.setGravity((id.a0 ? 5 : 3) | 48);
        frameLayout.addView(k5Var2, c8.ha.d(-1, 20.0f, (id.a0 ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z9) {
            wo woVar = new wo(21, context, null);
            this.e = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z11 = id.a0;
            addView(woVar, c8.ha.d(24, 24.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 40.0f, 32.0f, z11 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        ag0 ag0Var = new ag0(context);
        ag0Var.setText(id.M0(2131749175, null));
        ag0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(ag0Var, org.telegram.ui.ActionBar.k6.Gi, null);
        ag0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
        int i7 = org.telegram.ui.ActionBar.k6.Vl;
        y e10 = org.telegram.ui.ActionBar.z5.e(org.telegram.ui.ActionBar.k6.x0(null, i7, false), 16.0f);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i7);
        ag0Var.setBackground(e10);
        org.telegram.ui.ActionBar.r6.k(ag0Var, e10, N, f10, null);
        ag0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        linearLayout.addView(ag0Var, c8.ha.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        ag0Var.setOnClickListener(new a(this, 6));
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
        org.telegram.ui.Components.w8 w8Var = this.d;
        w8Var.k(j3, str, str2, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        if (charSequence2 != null) {
            k5Var.l(charSequence2, true);
        } else {
            org.telegram.messenger.d5 d5Var2 = this.f;
            k5Var.l(org.telegram.messenger.g5.m(0, d5Var2.i, d5Var2.j), false);
        }
        int i7 = org.telegram.ui.ActionBar.k6.y6;
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.c;
        k5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.r6.Y(k5Var2, i7, null);
        org.telegram.messenger.d5 d5Var3 = this.f;
        int i10 = d5Var3.l;
        if (i10 > 0) {
            k5Var2.l(id.G(i10, "TelegramContacts", new Object[0]), false);
        } else {
            k5Var2.l((CharSequence) d5Var3.e.get(0), false);
        }
        this.a.setImageDrawable(w8Var);
    }

    public org.telegram.messenger.d5 getContact() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J7, false) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Q7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U7, false);
            if (x02 == this.n) {
                return;
            }
            this.n = x02;
            org.telegram.ui.Components.l9 l9Var = this.a;
            if (l9Var != null) {
                l9Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
