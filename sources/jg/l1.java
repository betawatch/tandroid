package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import fi.b6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.ma;
import org.telegram.messenger.ri;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class l1 extends dk0 implements fs {
    public b6 E;
    public final Context c;
    public final bn f;
    public int h;
    public int n;
    public final h6 s;
    public final int w;
    public final boolean x;
    public String y;
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final int r = j10.t0;
    public final hi.l F = new hi.l(this, 26);

    public l1(Context context, bn bnVar, h6 h6Var, int i7, boolean z10) {
        this.s = h6Var;
        this.c = context;
        this.f = bnVar;
        this.w = i7;
        this.x = z10;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
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

    @Override // v4.i0
    public final int b() {
        return this.e.size() + this.n;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 < this.e.size() ? 0 : 1;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.A5 && objArr[0] == this.E) {
            f();
        }
    }

    @Override // v4.i0
    public final void f() {
        int b10 = b();
        ArrayList arrayList = this.e;
        arrayList.clear();
        HashSet hashSet = this.d;
        hashSet.clear();
        int i7 = this.r;
        int i10 = this.w;
        ArrayList arrayList2 = i10 == 0 ? ri.d0(i7).Z0 : ma.a(i7).b(i10).a;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            fj fjVar = (fj) arrayList2.get(i12);
            if ((!fjVar.z2() || fjVar.S2) && !hashSet.contains(Integer.valueOf(fjVar.e1()))) {
                arrayList.add(fjVar);
                hashSet.add(Integer.valueOf(fjVar.e1()));
            }
        }
        int i13 = this.n;
        this.h = arrayList.size();
        if (i10 != 0) {
            if (!ma.a(i7).b(i10).n && this.h != 0) {
                i11 = Utilities.j(ma.a(i7).b(i10).m - this.h, 3, 0);
            }
            this.n = i11;
        } else {
            if (!ri.d0(i7).b2() && this.h != 0) {
                i11 = Utilities.j(ri.d0(i7).l0() - this.h, 3, 0);
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

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        int i10;
        int i11;
        int i12 = f1Var.f;
        View view = f1Var.a;
        if (i12 != 0) {
            if (i12 == 2) {
                ((k1) view).a(this.E);
                return;
            }
            return;
        }
        u2 u2Var = (u2) view;
        u2Var.t2 = true;
        fj fjVar = (fj) E(i7);
        long B0 = fj.B0(fjVar.k);
        int i13 = fjVar.k.date;
        if (this.x) {
            u2Var.s0 = true;
            long P1 = fjVar.P1();
            TLRPC.Message message = fjVar.k;
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
            if (fjVar.P3() || v3.o0(this.r, B0)) {
                B0 = fjVar.Z0();
            }
            z10 = true;
            i10 = i13;
        }
        u2Var.d0(B0, fjVar, i10, z10, false);
        u2Var.setDialogCellDelegate(new i1(this));
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View u2Var;
        View view;
        if (i7 != 0) {
            h6 h6Var = this.s;
            Context context = this.c;
            if (i7 == 1) {
                yz yzVar = new yz(context, h6Var);
                yzVar.setIsSingleCell(true);
                yzVar.setViewType(7);
                view = yzVar;
            } else if (i7 != 2) {
                u2Var = null;
            } else {
                view = new k1(context, h6Var);
            }
            u2Var = view;
        } else {
            u2Var = new u2(null, this.c, true, this.r, this.s);
        }
        return i5.c.q(u2Var, u2Var, -1, -2);
    }
}
