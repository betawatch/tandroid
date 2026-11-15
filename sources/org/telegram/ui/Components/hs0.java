package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class hs0 extends tj0 {
    public final Context c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final fs0 f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList n = new ArrayList();
    public sr0 r;
    public final /* synthetic */ ys0 s;

    public hs0(ys0 ys0Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        this.s = ys0Var;
        this.c = context;
        this.d = i7;
        this.e = e6Var;
        this.f = new fs0(this, i7, e6Var);
        E();
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList c10 = this.s.w1[8].c();
        int i7 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) c10.get(i10);
            if (gjVar.X != i7) {
                int i11 = gjVar.k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i11;
                tL_message.message = org.telegram.messenger.hd.u(j3, false);
                tL_message.id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j3 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(this.d, tL_message, false, false);
                gjVar2.D = 10;
                gjVar2.U = 1;
                gjVar2.l0 = true;
                arrayList.add(gjVar2);
                i7 = gjVar.X;
            }
            arrayList.add(gjVar);
        }
    }

    @Override // v4.h0
    public final int b() {
        return this.n.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 < 0) {
            return 0;
        }
        ArrayList arrayList = this.n;
        if (i7 >= arrayList.size()) {
            return 0;
        }
        return ((org.telegram.messenger.gj) arrayList.get(i7)).U;
    }

    @Override // v4.h0
    public final void f() {
        E();
        super.f();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.n;
            if (i7 >= arrayList.size()) {
                return;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
            int i10 = e1Var.f;
            View view = e1Var.a;
            if (i10 == 0) {
                ((org.telegram.ui.Cells.q1) view).x3(gjVar, null, false, false, false, false);
            } else {
                ((org.telegram.ui.Cells.t0) view).setMessageObject(gjVar);
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        if (i7 != 0) {
            return new cj0(new org.telegram.ui.Cells.t0(this.c, this.e, false));
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.e;
        gs0 gs0Var = new gs0(this.c, this.d, false, null, e6Var);
        gs0Var.setDelegate(this.f);
        return new cj0(gs0Var);
    }
}
