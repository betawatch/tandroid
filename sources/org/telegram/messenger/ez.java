package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ez implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_messages_initHistoryImport a;
    public final /* synthetic */ hz b;

    public ez(hz hzVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.b = hzVar;
        this.a = tL_messages_initHistoryImport;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new ul(this, tLObject, this.a, tL_error, 25));
    }
}
