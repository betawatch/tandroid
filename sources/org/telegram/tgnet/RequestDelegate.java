package org.telegram.tgnet;

import org.telegram.tgnet.TLRPC;

/* loaded from: classes3.dex */
public interface RequestDelegate {
    void run(TLObject tLObject, TLRPC.TL_error tL_error);
}
