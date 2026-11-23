package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ eb0(ob0 ob0Var, String str, int i7) {
        this.a = i7;
        this.b = ob0Var;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new gb0(this.b, tL_error, this.c, tLObject));
                break;
            default:
                org.telegram.messenger.g0.g3(new gb0(this.b, tL_error, tLObject, this.c));
                break;
        }
    }
}
