package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class is0 extends pj0 {
    public final Context c;
    public final int d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final gs0 f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList n = new ArrayList();
    public tr0 r;
    public final /* synthetic */ zs0 s;

    public is0(zs0 zs0Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        this.s = zs0Var;
        this.c = context;
        this.d = i7;
        this.e = g6Var;
        this.f = new gs0(this, i7, g6Var);
        E();
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList c10 = this.s.v1[8].c();
        int i7 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) c10.get(i10);
            if (ijVar.X != i7) {
                int i11 = ijVar.k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i11;
                tL_message.message = org.telegram.messenger.id.u(j3, false);
                tL_message.id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j3 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(this.d, tL_message, false, false);
                ijVar2.D = 10;
                ijVar2.U = 1;
                ijVar2.j0 = true;
                arrayList.add(ijVar2);
                i7 = ijVar.X;
            }
            arrayList.add(ijVar);
        }
    }

    @Override // v4.g0
    public final int b() {
        return this.n.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 < 0) {
            return 0;
        }
        ArrayList arrayList = this.n;
        if (i7 >= arrayList.size()) {
            return 0;
        }
        return ((org.telegram.messenger.ij) arrayList.get(i7)).U;
    }

    @Override // v4.g0
    public final void f() {
        E();
        super.f();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.n;
            if (i7 >= arrayList.size()) {
                return;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
            int i10 = d1Var.f;
            View view = d1Var.a;
            if (i10 == 0) {
                ((org.telegram.ui.Cells.q1) view).w3(ijVar, null, false, false, false, false);
            } else {
                ((org.telegram.ui.Cells.t0) view).setMessageObject(ijVar);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        if (i7 != 0) {
            return new yi0(new org.telegram.ui.Cells.t0(this.c, this.e, false));
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.e;
        hs0 hs0Var = new hs0(this.c, this.d, false, null, g6Var);
        hs0Var.setDelegate(this.f);
        return new yi0(hs0Var);
    }
}
