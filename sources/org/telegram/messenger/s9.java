package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class s9 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q20 b;

    public /* synthetic */ s9(q20 q20Var, int i10) {
        this.a = i10;
        this.b = q20Var;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                q20 q20Var = this.b;
                if (stargiftupgradeattributes == null) {
                    q20Var.a(null);
                    break;
                } else {
                    q20Var.a(stargiftupgradeattributes.attributes);
                    break;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                q20 q20Var2 = this.b;
                if (!z10) {
                    q20Var2.a(new ArrayList());
                    break;
                } else {
                    q20Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    break;
                }
        }
    }
}
