package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fs0 extends sj0 {
    public final Context c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final ds0 f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList n = new ArrayList();
    public qr0 r;
    public final /* synthetic */ ws0 s;

    public fs0(ws0 ws0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.s = ws0Var;
        this.c = context;
        this.d = i3;
        this.e = e6Var;
        this.f = new ds0(this, i3, e6Var);
        E();
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList c2 = this.s.w1[8].c();
        int i3 = 0;
        for (int i10 = 0; i10 < c2.size(); i10++) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) c2.get(i10);
            if (ziVar.X != i3) {
                int i11 = ziVar.k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i11;
                tL_message.message = org.telegram.messenger.bd.u(j10, false);
                tL_message.id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j10 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(this.d, tL_message, false, false);
                ziVar2.D = 10;
                ziVar2.U = 1;
                ziVar2.j0 = true;
                arrayList.add(ziVar2);
                i3 = ziVar.X;
            }
            arrayList.add(ziVar);
        }
    }

    @Override // u4.h0
    public final int b() {
        return this.n.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 < 0) {
            return 0;
        }
        ArrayList arrayList = this.n;
        if (i3 >= arrayList.size()) {
            return 0;
        }
        return ((org.telegram.messenger.zi) arrayList.get(i3)).U;
    }

    @Override // u4.h0
    public final void f() {
        E();
        super.f();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.n;
            if (i3 >= arrayList.size()) {
                return;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
            int i10 = d1Var.f;
            View view = d1Var.a;
            if (i10 == 0) {
                ((org.telegram.ui.Cells.q1) view).u3(ziVar, null, false, false, false, false);
            } else {
                ((org.telegram.ui.Cells.t0) view).setMessageObject(ziVar);
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        if (i3 != 0) {
            return new bj0(new org.telegram.ui.Cells.t0(this.c, this.e, false));
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.e;
        es0 es0Var = new es0(this.c, this.d, false, null, e6Var);
        es0Var.setDelegate(this.f);
        return new bj0(es0Var);
    }
}
