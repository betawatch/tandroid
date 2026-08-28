package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback4 b;

    public /* synthetic */ bw0(Utilities.Callback4 callback4, int i9) {
        this.a = i9;
        this.b = callback4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified;
                Utilities.Callback4 callback4 = this.b;
                if (!z10) {
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
                boolean z11 = tLObject instanceof TLRPC.TL_emojiListNotModified;
                Utilities.Callback4 callback42 = this.b;
                if (!z11) {
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
