package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ir0 extends sj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public int e;
    public final /* synthetic */ ws0 f;

    public ir0(ws0 ws0Var, Context context) {
        this.f = ws0Var;
        this.c = context;
        E(false);
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final void E(boolean z10) {
        ws0 ws0Var = this.f;
        long j10 = ws0Var.m1;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
        if (d2Var == null) {
            return;
        }
        if (org.telegram.messenger.m5.z(j10)) {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).M0(Long.valueOf(-j10));
            if (M0 == null || !org.telegram.messenger.t3.V(M0)) {
                return;
            }
        } else if (org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).a2(Long.valueOf(j10)) == null) {
            return;
        }
        org.telegram.messenger.io L0 = org.telegram.messenger.hp.s1(d2Var.getCurrentAccount()).L0(j10);
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i3 = 0;
        if (L0 != null) {
            ArrayList arrayList2 = L0.b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLObject tLObject = (TLObject) arrayList2.get(i10);
                if ((tLObject instanceof TLRPC.Chat) && org.telegram.messenger.t3.r0((TLRPC.Chat) tLObject)) {
                    arrayList.add(tLObject);
                } else {
                    arrayList.add(tLObject);
                }
            }
        }
        if (!arrayList.isEmpty() && !org.telegram.messenger.h10.i(d2Var.getCurrentAccount()).q()) {
            i3 = L0.c;
        }
        this.e = i3;
        if (z10) {
            f();
        }
    }

    @Override // u4.h0
    public final int b() {
        return this.d.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return (this.e <= 0 || i3 != this.d.size() + (-1)) ? 17 : 18;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.ui.Cells.f6 f6Var;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 17) {
            if (!(view instanceof org.telegram.ui.Cells.f6)) {
                return;
            } else {
                f6Var = (org.telegram.ui.Cells.f6) view;
            }
        } else if (i10 != 18) {
            f6Var = null;
        } else if (!(view instanceof ur0)) {
            return;
        } else {
            f6Var = ((ur0) view).b;
        }
        org.telegram.ui.Cells.f6 f6Var2 = f6Var;
        if (f6Var2 != null) {
            ArrayList arrayList = this.d;
            f6Var2.x(arrayList.get(i3), null, null, null, false, false);
            f6Var2.N = i3 != arrayList.size() - 1;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View f6Var;
        ws0 ws0Var = this.f;
        if (i3 == 18) {
            org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
            f6Var = new ur0(d2Var == null ? org.telegram.messenger.h10.t0 : d2Var.getCurrentAccount(), this.c, ws0Var.m1 > 0, ws0Var.I1, new sp0(this, 2));
        } else {
            f6Var = new org.telegram.ui.Cells.f6(this.c, ws0Var.I1);
        }
        f6Var.setLayoutParams(new u4.p0(-1, -2));
        return new bj0(f6Var);
    }
}
