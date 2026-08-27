package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uz extends yk0 {
    public final Context c;
    public final /* synthetic */ yz d;

    public uz(yz yzVar, Context context) {
        this.d = yzVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.q0
    public final long i(int i10) {
        return this.d.g0.get(i10);
    }

    @Override // f2.q0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        wz wzVar = (wz) o1Var.a;
        int id2 = wzVar.b != null ? wzVar.getId() : -1;
        vz vzVar = (vz) this.d.h.get(i10);
        wzVar.b = vzVar;
        wzVar.e = i10;
        wzVar.setContentDescription(vzVar.b);
        wzVar.requestLayout();
        boolean z10 = wzVar.n;
        vz vzVar2 = wzVar.b;
        if (z10 != (vzVar2 != null && vzVar2.g)) {
            t5.release(wzVar, wzVar.r);
            t5.release(wzVar, wzVar.K);
            t5.release(wzVar, wzVar.M);
            t5.release(wzVar, wzVar.O);
            if (wzVar.h0) {
                wzVar.r = t5.update(wzVar.b.g ? 26 : 0, wzVar, wzVar.r, wzVar.s);
                wzVar.K = t5.update(wzVar.b.g ? 26 : 0, wzVar, wzVar.K, wzVar.L);
                wzVar.M = t5.update(wzVar.b.g ? 26 : 0, wzVar, wzVar.M, wzVar.N);
                wzVar.O = t5.update(wzVar.b.g ? 26 : 0, wzVar, wzVar.O, wzVar.P);
            }
            wzVar.n = wzVar.b.g;
        }
        if (id2 != wzVar.getId()) {
            wzVar.g0 = wzVar.b.f ? 1.0f : 0.0f;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new lk0(new wz(this.d, this.c));
    }
}
