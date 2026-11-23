package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class kv0 extends org.telegram.messenger.y2 {
    @Override // org.telegram.messenger.y2
    public final void f(int i7, Object obj, long j3, org.telegram.messenger.x2 x2Var) {
        TLRPC.TL_messages_searchCustomEmoji tL_messages_searchCustomEmoji = new TLRPC.TL_messages_searchCustomEmoji();
        tL_messages_searchCustomEmoji.emoticon = (String) obj;
        tL_messages_searchCustomEmoji.hash = j3;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_searchCustomEmoji, new iv0(x2Var, 1));
    }
}
