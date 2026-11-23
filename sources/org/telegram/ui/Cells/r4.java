package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.pg0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class r4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.q9 a;
    public final org.telegram.ui.ActionBar.m5 b;
    public final org.telegram.ui.ActionBar.m5 c;
    public final org.telegram.ui.Components.b9 d;
    public final op e;
    public org.telegram.messenger.f5 f;
    public CharSequence h;
    public int n;

    public r4(Context context, boolean z10) {
        super(context);
        this.d = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(q9Var, c8.ma.d(46, 46.0f, (hd.a0 ? 5 : 3) | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = hd.a0;
        addView(linearLayout, c8.ma.d(-1, -1.0f, ls.E1, z11 ? 0 : 72, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, c8.ma.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.b = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(15);
        m5Var.setGravity((hd.a0 ? 5 : 3) | 48);
        frameLayout.addView(m5Var, c8.ma.d(-1, 20.0f, (hd.a0 ? 5 : 3) | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.c = m5Var2;
        m5Var2.setTextSize(13);
        m5Var2.setGravity((hd.a0 ? 5 : 3) | 48);
        frameLayout.addView(m5Var2, c8.ma.d(-1, 20.0f, (hd.a0 ? 5 : 3) | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            op opVar = new op(21, context, null);
            this.e = opVar;
            opVar.b(-1, org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.k7);
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(3);
            boolean z12 = hd.a0;
            addView(opVar, c8.ma.d(24, 24.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 40.0f, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        pg0 pg0Var = new pg0(context);
        pg0Var.setText(hd.N0(2131748981, null));
        pg0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(pg0Var, org.telegram.ui.ActionBar.m6.Ji, null);
        pg0Var.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false));
        int i7 = org.telegram.ui.ActionBar.m6.Yl;
        y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.m6.x0(null, i7, false), 16.0f);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i7);
        pg0Var.setBackground(e10);
        org.telegram.ui.ActionBar.t6.j(pg0Var, e10, M, e11, null);
        pg0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        linearLayout.addView(pg0Var, c8.ma.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        pg0Var.setOnClickListener(new a(this, 6));
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
        org.telegram.ui.ActionBar.m5 m5Var = this.b;
        if (charSequence2 != null) {
            m5Var.l(charSequence2, true);
        } else {
            org.telegram.messenger.f5 f5Var2 = this.f;
            m5Var.l(org.telegram.messenger.i5.m(0, f5Var2.i, f5Var2.j), false);
        }
        int i7 = org.telegram.ui.ActionBar.m6.y6;
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.ActionBar.m5 m5Var2 = this.c;
        m5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.t6.X(m5Var2, i7, null);
        org.telegram.messenger.f5 f5Var3 = this.f;
        int i10 = f5Var3.l;
        if (i10 > 0) {
            m5Var2.l(hd.G(i10, "TelegramContacts", new Object[0]), false);
        } else {
            m5Var2.l((CharSequence) f5Var3.e.get(0), false);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J7, false) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.O7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Q7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.R7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.S7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.U7, false);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
