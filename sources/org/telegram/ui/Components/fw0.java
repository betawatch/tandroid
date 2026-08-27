package org.telegram.ui.Components;

import org.telegram.messenger.CacheFetcher;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fw0 extends CacheFetcher {
    @Override // org.telegram.messenger.CacheFetcher
    public final void getRemote(int i10, Object obj, long j10, Utilities.Callback4 callback4) {
        TLRPC.TL_messages_searchCustomEmoji tL_messages_searchCustomEmoji = new TLRPC.TL_messages_searchCustomEmoji();
        tL_messages_searchCustomEmoji.emoticon = (String) obj;
        tL_messages_searchCustomEmoji.hash = j10;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_searchCustomEmoji, new dw0(callback4, 1));
    }
}
