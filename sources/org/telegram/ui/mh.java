package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.User d;

    public /* synthetic */ mh(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = tL_attachMenuBot;
        this.d = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new ph(this.b, tL_error, this.c, this.d));
                break;
            default:
                org.telegram.messenger.i0.g3(new ph(this.b, this.c, tL_error, this.d));
                break;
        }
    }
}
