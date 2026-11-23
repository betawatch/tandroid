package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class p9 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w10 b;

    public /* synthetic */ p9(w10 w10Var, int i7) {
        this.a = i7;
        this.b = w10Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                w10 w10Var = this.b;
                if (stargiftupgradeattributes == null) {
                    w10Var.a(null);
                    break;
                } else {
                    w10Var.a(stargiftupgradeattributes.attributes);
                    break;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                w10 w10Var2 = this.b;
                if (!z10) {
                    w10Var2.a(new ArrayList());
                    break;
                } else {
                    w10Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    break;
                }
        }
    }
}
