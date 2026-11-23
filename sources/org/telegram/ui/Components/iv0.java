package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.x2 b;

    public /* synthetic */ iv0(org.telegram.messenger.x2 x2Var, int i7) {
        this.a = i7;
        this.b = x2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified;
                org.telegram.messenger.x2 x2Var = this.b;
                if (!z10) {
                    if (!(tLObject instanceof TLRPC.TL_messages_emojiGroups)) {
                        x2Var.a(Boolean.FALSE, null, 0L, Boolean.TRUE);
                        break;
                    } else {
                        x2Var.a(Boolean.FALSE, (TLRPC.TL_messages_emojiGroups) tLObject, Long.valueOf(r5.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool = Boolean.TRUE;
                    x2Var.a(bool, null, 0L, bool);
                    break;
                }
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_emojiListNotModified;
                org.telegram.messenger.x2 x2Var2 = this.b;
                if (!z11) {
                    if (!(tLObject instanceof TLRPC.TL_emojiList)) {
                        x2Var2.a(Boolean.FALSE, null, 0L, Boolean.TRUE);
                        break;
                    } else {
                        TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) tLObject;
                        x2Var2.a(Boolean.FALSE, tL_emojiList, Long.valueOf(tL_emojiList.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    x2Var2.a(bool2, null, 0L, bool2);
                    break;
                }
        }
    }
}
