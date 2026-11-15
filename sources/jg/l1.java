package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import fi.d6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.na;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l1 extends tj0 implements is {
    public d6 E;
    public final Context c;
    public final an f;
    public int h;
    public int n;
    public final e6 s;
    public final int w;
    public final boolean x;
    public String y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = m10.t0;
    public final hi.e1 F = new hi.e1(this, 22);

    public l1(Context context, an anVar, e6 e6Var, int i7, boolean z10) {
        this.s = e6Var;
        this.c = context;
        this.f = anVar;
        this.w = i7;
        this.x = z10;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 0 || i7 == 2;
    }

    public final Object E(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.e;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i7);
    }

    @Override // v4.h0
    public final int b() {
        return this.e.size() + this.n;
    }

    @Override // v4.h0
    public final int d(int i7) {
        return i7 < this.e.size() ? 0 : 1;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.x5 && objArr[0] == this.E) {
            f();
        }
    }

    @Override // v4.h0
    public final void f() {
        int b10 = b();
        ArrayList arrayList = this.e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i7 = this.r;
        int i10 = this.w;
        ArrayList arrayList2 = i10 == 0 ? si.b0(i7).Z0 : na.a(i7).b(i10).a;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            gj gjVar = (gj) arrayList2.get(i12);
            if ((!gjVar.z2() || gjVar.S2) && !hashSet.contains(Integer.valueOf(gjVar.e1()))) {
                arrayList.add(gjVar);
                hashSet.add(Integer.valueOf(gjVar.e1()));
            }
        }
        int i13 = this.n;
        this.h = arrayList.size();
        if (i10 != 0) {
            if (!na.a(i7).b(i10).n && this.h != 0) {
                i11 = Utilities.j(na.a(i7).b(i10).m - this.h, 3, 0);
            }
            this.n = i11;
        } else {
            if (!si.b0(i7).W1() && this.h != 0) {
                i11 = Utilities.j(si.b0(i7).j0() - this.h, 3, 0);
            }
            this.n = i11;
        }
        int b11 = b();
        if (b10 >= b11) {
            super.f();
            return;
        }
        if (i13 > 0) {
            k(b10 - i13, i13);
        }
        o(b10, b11 - b10);
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        int i10;
        int i11;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 != 0) {
            if (i12 == 2) {
                ((k1) view).a(this.E);
                return;
            }
            return;
        }
        t2 t2Var = (t2) view;
        t2Var.t2 = true;
        gj gjVar = (gj) E(i7);
        long B0 = gj.B0(gjVar.k);
        int i13 = gjVar.k.date;
        if (this.x) {
            t2Var.s0 = true;
            long P1 = gjVar.P1();
            TLRPC.Message message = gjVar.k;
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader == null || ((i10 = messageFwdHeader.date) == 0 && messageFwdHeader.saved_date == 0)) {
                i11 = message.date;
            } else {
                if (i10 == 0) {
                    i11 = messageFwdHeader.saved_date;
                }
                z10 = false;
                B0 = P1;
            }
            i10 = i11;
            z10 = false;
            B0 = P1;
        } else {
            if (gjVar.P3() || t3.o0(this.r, B0)) {
                B0 = gjVar.Z0();
            }
            z10 = true;
            i10 = i13;
        }
        t2Var.f0(B0, gjVar, i10, z10, false);
        t2Var.setDialogCellDelegate(new i1(this));
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View t2Var;
        View view;
        if (i7 != 0) {
            e6 e6Var = this.s;
            Context context = this.c;
            if (i7 == 1) {
                pz pzVar = new pz(context, e6Var);
                pzVar.setIsSingleCell(true);
                pzVar.setViewType(7);
                view = pzVar;
            } else if (i7 != 2) {
                t2Var = null;
            } else {
                view = new k1(context, e6Var);
            }
            t2Var = view;
        } else {
            t2Var = new t2(null, this.c, true, this.r, this.s);
        }
        return i5.c.q(t2Var, t2Var, -1, -2);
    }
}
