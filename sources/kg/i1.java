package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ei.l6;
import gi.f6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.ha;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.t3;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i1 extends sj0 implements cs {
    public l6 E;
    public final Context c;
    public final wm f;
    public int h;
    public int n;
    public final e6 s;
    public final int w;
    public final boolean x;
    public String y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = h10.t0;
    public final f6 F = new f6(this, 27);

    public i1(Context context, wm wmVar, e6 e6Var, int i3, boolean z10) {
        this.s = e6Var;
        this.c = context;
        this.f = wmVar;
        this.w = i3;
        this.x = z10;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 0 || i3 == 2;
    }

    public final Object E(int i3) {
        if (i3 < 0) {
            return null;
        }
        ArrayList arrayList = this.e;
        if (i3 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i3);
    }

    @Override // u4.h0
    public final int b() {
        return this.e.size() + this.n;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return i3 < this.e.size() ? 0 : 1;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.x5 && objArr[0] == this.E) {
            f();
        }
    }

    @Override // u4.h0
    public final void f() {
        int b10 = b();
        ArrayList arrayList = this.e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i3 = this.r;
        int i10 = this.w;
        ArrayList arrayList2 = i10 == 0 ? li.b0(i3).Z0 : ha.a(i3).b(i10).a;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            zi ziVar = (zi) arrayList2.get(i12);
            if ((!ziVar.A2() || ziVar.Q2) && !hashSet.contains(Integer.valueOf(ziVar.f1()))) {
                arrayList.add(ziVar);
                hashSet.add(Integer.valueOf(ziVar.f1()));
            }
        }
        int i13 = this.n;
        this.h = arrayList.size();
        if (i10 != 0) {
            if (!ha.a(i3).b(i10).n && this.h != 0) {
                i11 = Utilities.j(ha.a(i3).b(i10).m - this.h, 3, 0);
            }
            this.n = i11;
        } else {
            if (!li.b0(i3).W1() && this.h != 0) {
                i11 = Utilities.j(li.b0(i3).j0() - this.h, 3, 0);
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

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        int i10;
        int i11;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 != 0) {
            if (i12 == 2) {
                ((h1) view).a(this.E);
                return;
            }
            return;
        }
        t2 t2Var = (t2) view;
        t2Var.t2 = true;
        zi ziVar = (zi) E(i3);
        long B0 = zi.B0(ziVar.k);
        int i13 = ziVar.k.date;
        if (this.x) {
            t2Var.s0 = true;
            long Q1 = ziVar.Q1();
            TLRPC.Message message = ziVar.k;
            TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
            if (messageFwdHeader == null || ((i10 = messageFwdHeader.date) == 0 && messageFwdHeader.saved_date == 0)) {
                i11 = message.date;
            } else {
                if (i10 == 0) {
                    i11 = messageFwdHeader.saved_date;
                }
                z10 = false;
                B0 = Q1;
            }
            i10 = i11;
            z10 = false;
            B0 = Q1;
        } else {
            if (ziVar.Q3() || t3.o0(this.r, B0)) {
                B0 = ziVar.Z0();
            }
            z10 = true;
            i10 = i13;
        }
        t2Var.d0(B0, ziVar, i10, z10, false);
        t2Var.setDialogCellDelegate(new f1(this));
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View t2Var;
        View view;
        if (i3 != 0) {
            e6 e6Var = this.s;
            Context context = this.c;
            if (i3 == 1) {
                iz izVar = new iz(context, e6Var);
                izVar.setIsSingleCell(true);
                izVar.setViewType(7);
                view = izVar;
            } else if (i3 != 2) {
                t2Var = null;
            } else {
                view = new h1(context, e6Var);
            }
            t2Var = view;
        } else {
            t2Var = new t2(null, this.c, true, this.r, this.s);
        }
        return k2.p1.p(t2Var, t2Var, -1, -2);
    }
}
