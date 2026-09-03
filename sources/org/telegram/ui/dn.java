package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class dn extends MessageObject {
    @Override // org.telegram.messenger.MessageObject
    public final boolean canDeleteMessage(boolean z4, TLRPC.Chat chat) {
        return false;
    }
}
