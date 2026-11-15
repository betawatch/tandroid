package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class uy implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_messages_startHistoryImport a;
    public final /* synthetic */ vy b;

    public uy(vy vyVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.b = vyVar;
        this.a = tL_messages_startHistoryImport;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new kg(this, tL_error, this.a, 27));
    }
}
