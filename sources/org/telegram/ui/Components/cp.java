package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements org.telegram.ui.u71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp b;

    public /* synthetic */ cp(dp dpVar, int i7) {
        this.a = i7;
        this.b = dpVar;
    }

    @Override // org.telegram.ui.u71
    public final void a(TLRPC.TL_wallPaper tL_wallPaper) {
        switch (this.a) {
            case 0:
                kp kpVar = this.b.a;
                kpVar.S1.L();
                kpVar.dismiss();
                break;
            default:
                kp kpVar2 = this.b.a;
                kpVar2.S1.L();
                kpVar2.dismiss();
                break;
        }
    }
}
