package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gx extends g.o {
    public final /* synthetic */ wz c;

    public gx(wz wzVar) {
        this.c = wzVar;
    }

    @Override // g.o
    public final int i(int i10) {
        wz wzVar = this.c;
        rz rzVar = wzVar.z0;
        s4.g0 adapter = wzVar.D0.getAdapter();
        mz mzVar = wzVar.y0;
        if (adapter != mzVar) {
            if (i10 == rzVar.x || !(rzVar.r.get(i10) == null || (rzVar.r.get(i10) instanceof TLRPC.Document))) {
                return mzVar.d;
            }
            return 1;
        }
        if (i10 == 0) {
            return mzVar.d;
        }
        if (i10 == mzVar.s || !(mzVar.h.get(i10) == null || (mzVar.h.get(i10) instanceof TLRPC.Document))) {
            return mzVar.d;
        }
        return 1;
    }
}
