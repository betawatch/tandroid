package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class uy implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_messages_initHistoryImport a;
    public final /* synthetic */ xy b;

    public uy(xy xyVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.b = xyVar;
        this.a = tL_messages_initHistoryImport;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new em(this, tLObject, this.a, tL_error, 25));
    }
}
