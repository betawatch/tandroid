package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.w2 b;

    public /* synthetic */ wu0(org.telegram.messenger.w2 w2Var, int i7) {
        this.a = i7;
        this.b = w2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z9 = tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified;
                org.telegram.messenger.w2 w2Var = this.b;
                if (!z9) {
                    if (!(tLObject instanceof TLRPC.TL_messages_emojiGroups)) {
                        w2Var.a(Boolean.FALSE, null, 0L, Boolean.TRUE);
                        break;
                    } else {
                        w2Var.a(Boolean.FALSE, (TLRPC.TL_messages_emojiGroups) tLObject, Long.valueOf(r5.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool = Boolean.TRUE;
                    w2Var.a(bool, null, 0L, bool);
                    break;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.TL_emojiListNotModified;
                org.telegram.messenger.w2 w2Var2 = this.b;
                if (!z10) {
                    if (!(tLObject instanceof TLRPC.TL_emojiList)) {
                        w2Var2.a(Boolean.FALSE, null, 0L, Boolean.TRUE);
                        break;
                    } else {
                        TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) tLObject;
                        w2Var2.a(Boolean.FALSE, tL_emojiList, Long.valueOf(tL_emojiList.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    w2Var2.a(bool2, null, 0L, bool2);
                    break;
                }
        }
    }
}
