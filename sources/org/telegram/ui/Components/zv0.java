package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zv0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.a3 b;

    public /* synthetic */ zv0(org.telegram.messenger.a3 a3Var, int i10) {
        this.a = i10;
        this.b = a3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified;
                org.telegram.messenger.a3 a3Var = this.b;
                if (!z10) {
                    if (!(tLObject instanceof TLRPC.TL_messages_emojiGroups)) {
                        a3Var.a(Boolean.FALSE, null, 0L, Boolean.TRUE);
                        break;
                    } else {
                        a3Var.a(Boolean.FALSE, (TLRPC.TL_messages_emojiGroups) tLObject, Long.valueOf(r5.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool = Boolean.TRUE;
                    a3Var.a(bool, null, 0L, bool);
                    break;
                }
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_emojiListNotModified;
                org.telegram.messenger.a3 a3Var2 = this.b;
                if (!z11) {
                    if (!(tLObject instanceof TLRPC.TL_emojiList)) {
                        a3Var2.a(Boolean.FALSE, null, 0L, Boolean.TRUE);
                        break;
                    } else {
                        TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) tLObject;
                        a3Var2.a(Boolean.FALSE, tL_emojiList, Long.valueOf(tL_emojiList.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    a3Var2.a(bool2, null, 0L, bool2);
                    break;
                }
        }
    }
}
