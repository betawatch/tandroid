package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ag0;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.k9 a;
    public final org.telegram.ui.ActionBar.m5 b;
    public final org.telegram.ui.ActionBar.m5 c;
    public final org.telegram.ui.Components.v8 d;
    public final wo e;
    public org.telegram.messenger.d5 f;
    public CharSequence h;
    public int n;

    public q4(Context context, boolean z9) {
        super(context);
        this.d = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(k9Var, c8.ha.d(46, 46.0f, (id.a0 ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z10 = id.a0;
        addView(linearLayout, c8.ha.d(-1, -1.0f, qs.E1, z10 ? 0 : 72, 0.0f, z10 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, c8.ha.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.b = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(15);
        m5Var.setGravity((id.a0 ? 5 : 3) | 48);
        frameLayout.addView(m5Var, c8.ha.d(-1, 20.0f, (id.a0 ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.c = m5Var2;
        m5Var2.setTextSize(13);
        m5Var2.setGravity((id.a0 ? 5 : 3) | 48);
        frameLayout.addView(m5Var2, c8.ha.d(-1, 20.0f, (id.a0 ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z9) {
            wo woVar = new wo(21, context, null);
            this.e = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z11 = id.a0;
            addView(woVar, c8.ha.d(24, 24.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 40.0f, 32.0f, z11 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        ag0 ag0Var = new ag0(context);
        ag0Var.setText(id.M0(2131749174, null));
        ag0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(ag0Var, org.telegram.ui.ActionBar.m6.Gi, null);
        ag0Var.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Bi, false));
        int i7 = org.telegram.ui.ActionBar.m6.Vl;
        y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.m6.x0(null, i7, false), 16.0f);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i7);
        ag0Var.setBackground(e10);
        org.telegram.ui.ActionBar.t6.j(ag0Var, e10, M, e11, null);
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
        org.telegram.ui.Components.v8 v8Var = this.d;
        v8Var.k(j3, str, str2, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.m5 m5Var = this.b;
        if (charSequence2 != null) {
            m5Var.l(charSequence2, true);
        } else {
            org.telegram.messenger.d5 d5Var2 = this.f;
            m5Var.l(org.telegram.messenger.g5.m(0, d5Var2.i, d5Var2.j), false);
        }
        int i7 = org.telegram.ui.ActionBar.m6.y6;
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.ActionBar.m5 m5Var2 = this.c;
        m5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.t6.X(m5Var2, i7, null);
        org.telegram.messenger.d5 d5Var3 = this.f;
        int i10 = d5Var3.l;
        if (i10 > 0) {
            m5Var2.l(id.G(i10, "TelegramContacts", new Object[0]), false);
        } else {
            m5Var2.l((CharSequence) d5Var3.e.get(0), false);
        }
        this.a.setImageDrawable(v8Var);
    }

    public org.telegram.messenger.d5 getContact() {
        return this.f;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J7, false) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.O7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Q7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.R7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.S7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.U7, false);
            if (x02 == this.n) {
                return;
            }
            this.n = x02;
            org.telegram.ui.Components.k9 k9Var = this.a;
            if (k9Var != null) {
                k9Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
