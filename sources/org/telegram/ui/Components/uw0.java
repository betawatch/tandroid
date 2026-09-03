package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uw0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback4 b;

    public /* synthetic */ uw0(Utilities.Callback4 callback4, int i10) {
        this.a = i10;
        this.b = callback4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z4 = tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified;
                Utilities.Callback4 callback4 = this.b;
                if (!z4) {
                    if (!(tLObject instanceof TLRPC.TL_messages_emojiGroups)) {
                        callback4.run(Boolean.FALSE, null, 0L, Boolean.TRUE);
                        break;
                    } else {
                        callback4.run(Boolean.FALSE, (TLRPC.TL_messages_emojiGroups) tLObject, Long.valueOf(r5.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool = Boolean.TRUE;
                    callback4.run(bool, null, 0L, bool);
                    break;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_emojiListNotModified;
                Utilities.Callback4 callback42 = this.b;
                if (!z10) {
                    if (!(tLObject instanceof TLRPC.TL_emojiList)) {
                        callback42.run(Boolean.FALSE, null, 0L, Boolean.TRUE);
                        break;
                    } else {
                        TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) tLObject;
                        callback42.run(Boolean.FALSE, tL_emojiList, Long.valueOf(tL_emojiList.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    callback42.run(bool2, null, 0L, bool2);
                    break;
                }
        }
    }
}
