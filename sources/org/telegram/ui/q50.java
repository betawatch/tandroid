package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q50 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ t50 n;

    public q50(t50 t50Var, Context context) {
        this.n = t50Var;
        this.c = context;
    }

    @Override // u4.h0
    public final void A(u4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.q4) {
            ((org.telegram.ui.Cells.q4) view).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f != 2;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            f();
        } else {
            Timer timer2 = new Timer();
            this.f = timer2;
            timer2.schedule(new kg.m1(3, this, str), 200L, 300L);
        }
    }

    @Override // u4.h0
    public final int b() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (this.h) {
            return 0;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3 == 1 ? 2 : 0;
    }

    @Override // u4.h0
    public final void f() {
        super.f();
        t50 t50Var = this.n;
        q50 q50Var = t50Var.s;
        if (q50Var == null || t50Var.y) {
            return;
        }
        t50Var.r.setVisibility(q50Var.b() == 2 ? 0 : 4);
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.messenger.d5 d5Var;
        CharSequence charSequence;
        if (d1Var.f == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) d1Var.a;
            boolean z10 = this.h;
            t50 t50Var = this.n;
            if (z10) {
                d5Var = (org.telegram.messenger.d5) this.d.get(i3);
                charSequence = (CharSequence) this.e.get(i3);
            } else {
                d5Var = (org.telegram.messenger.d5) t50Var.w.get(i3 - 2);
                charSequence = null;
            }
            q4Var.a(d5Var, charSequence);
            boolean containsKey = t50Var.E.containsKey(d5Var.b);
            org.telegram.ui.Components.wo woVar = q4Var.e;
            if (woVar != null) {
                woVar.a(containsKey, false);
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        Context context = this.c;
        if (i3 == 1) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            l8Var.g(i10, i10);
            l8Var.u(org.telegram.messenger.bd.M0(2131745437, null), "", false, R.drawable.msg_shareout, false);
            view = l8Var;
        } else {
            view = i3 == 2 ? new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null) : new org.telegram.ui.Cells.q4(context, true);
        }
        return new org.telegram.ui.Components.bj0(view);
    }
}
