package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ps0 extends bk0 {
    public final Context c;
    public final int d;
    public final org.telegram.ui.ActionBar.i6 e;
    public final ns0 f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList n = new ArrayList();
    public as0 r;
    public final /* synthetic */ gt0 s;

    public ps0(gt0 gt0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.s = gt0Var;
        this.c = context;
        this.d = i7;
        this.e = i6Var;
        this.f = new ns0(this, i7, i6Var);
        E();
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList c10 = this.s.w1[8].c();
        int i7 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) c10.get(i10);
            if (fjVar.X != i7) {
                int i11 = fjVar.k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i11;
                tL_message.message = org.telegram.messenger.gd.u(j3, false);
                tL_message.id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j3 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(this.d, tL_message, false, false);
                fjVar2.D = 10;
                fjVar2.U = 1;
                fjVar2.l0 = true;
                arrayList.add(fjVar2);
                i7 = fjVar.X;
            }
            arrayList.add(fjVar);
        }
    }

    @Override // v4.i0
    public final int b() {
        return this.n.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 < 0) {
            return 0;
        }
        ArrayList arrayList = this.n;
        if (i7 >= arrayList.size()) {
            return 0;
        }
        return ((org.telegram.messenger.fj) arrayList.get(i7)).U;
    }

    @Override // v4.i0
    public final void f() {
        E();
        super.f();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.n;
            if (i7 >= arrayList.size()) {
                return;
            }
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
            int i10 = f1Var.f;
            View view = f1Var.a;
            if (i10 == 0) {
                ((org.telegram.ui.Cells.r1) view).y3(fjVar, null, false, false, false, false);
            } else {
                ((org.telegram.ui.Cells.v0) view).setMessageObject(fjVar);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (i7 != 0) {
            return new kj0(new org.telegram.ui.Cells.v0(this.c, this.e, false));
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.e;
        os0 os0Var = new os0(this.c, this.d, false, null, i6Var);
        os0Var.setDelegate(this.f);
        return new kj0(os0Var);
    }
}
