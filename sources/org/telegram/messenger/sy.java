package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class sy implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_messages_initHistoryImport a;
    public final /* synthetic */ vy b;

    public sy(vy vyVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.b = vyVar;
        this.a = tL_messages_initHistoryImport;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new bm(this, tLObject, this.a, tL_error, 25));
    }
}
