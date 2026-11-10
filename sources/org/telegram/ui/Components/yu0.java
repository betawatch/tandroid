package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yu0 extends org.telegram.messenger.x2 {
    @Override // org.telegram.messenger.x2
    public final void f(int i7, Object obj, long j3, org.telegram.messenger.w2 w2Var) {
        TLRPC.TL_messages_searchCustomEmoji tL_messages_searchCustomEmoji = new TLRPC.TL_messages_searchCustomEmoji();
        tL_messages_searchCustomEmoji.emoticon = (String) obj;
        tL_messages_searchCustomEmoji.hash = j3;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_searchCustomEmoji, new wu0(w2Var, 1));
    }
}
