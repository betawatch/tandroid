package org.telegram.ui.Components;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fq0 extends tf.j1 {
    @Override // tf.j1
    public final boolean d(TLObject tLObject) {
        return !(tLObject instanceof TLRPC.Chat) || ChatObject.canWriteToChat((TLRPC.Chat) tLObject);
    }
}
