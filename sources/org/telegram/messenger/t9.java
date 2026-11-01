package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class t9 implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;

    public /* synthetic */ t9(r20 r20Var, int i10) {
        this.a = i10;
        this.b = r20Var;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                r20 r20Var = this.b;
                if (stargiftupgradeattributes == null) {
                    r20Var.a(null);
                    break;
                } else {
                    r20Var.a(stargiftupgradeattributes.attributes);
                    break;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                r20 r20Var2 = this.b;
                if (!z10) {
                    r20Var2.a(new ArrayList());
                    break;
                } else {
                    r20Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    break;
                }
        }
    }
}
