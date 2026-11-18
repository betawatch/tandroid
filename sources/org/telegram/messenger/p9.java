package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class p9 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x10 b;

    public /* synthetic */ p9(x10 x10Var, int i7) {
        this.a = i7;
        this.b = x10Var;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                x10 x10Var = this.b;
                if (stargiftupgradeattributes == null) {
                    x10Var.a(null);
                    break;
                } else {
                    x10Var.a(stargiftupgradeattributes.attributes);
                    break;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                x10 x10Var2 = this.b;
                if (!z10) {
                    x10Var2.a(new ArrayList());
                    break;
                } else {
                    x10Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    break;
                }
        }
    }
}
