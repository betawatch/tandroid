package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public interface RequestDelegate {
    void run(TLObject tLObject, TLRPC.TL_error tL_error);
}
