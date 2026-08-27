package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr implements org.telegram.ui.Cells.x4, pf.i1 {
    public final /* synthetic */ kr a;

    @Override // pf.i1
    public /* synthetic */ boolean D0(int i10) {
        return true;
    }

    @Override // pf.i1
    public /* synthetic */ a0.h J() {
        return null;
    }

    @Override // org.telegram.ui.Cells.x4
    public boolean d(org.telegram.ui.Cells.y4 y4Var, boolean z10) {
        int intValue = ((Integer) y4Var.getTag()).intValue();
        kr krVar = this.a;
        TLObject E = krVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return krVar.y.h0((TLRPC.ChannelParticipant) E, !z10, y4Var);
    }

    @Override // pf.i1
    public /* synthetic */ a0.h h0() {
        return null;
    }

    @Override // pf.i1
    public void i(int i10) {
        kr krVar = this.a;
        lr lrVar = krVar.y;
        if (krVar.h.e()) {
            return;
        }
        int i11 = krVar.r;
        krVar.l();
        if (krVar.r > i11) {
            lrVar.y0(i11);
        }
        if (krVar.s || krVar.r != 0 || i10 == 0) {
            return;
        }
        lrVar.b.e(false, true);
    }

    @Override // pf.i1
    public /* synthetic */ void V0(ArrayList arrayList) {
    }
}
