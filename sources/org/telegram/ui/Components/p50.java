package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p50 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ r50 b;

    public /* synthetic */ p50(r50 r50Var, int i7) {
        this.a = i7;
        this.b = r50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa(this.b, tL_error, tLObject, 16));
                break;
            default:
                org.telegram.messenger.g0.g3(new bt(18, this.b, tL_error));
                break;
        }
    }
}
