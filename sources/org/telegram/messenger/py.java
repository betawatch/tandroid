package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class py implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_messages_startHistoryImport a;
    public final /* synthetic */ qy b;

    public py(qy qyVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.b = qyVar;
        this.a = tL_messages_startHistoryImport;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new kg(this, tL_error, this.a, 27));
    }
}
