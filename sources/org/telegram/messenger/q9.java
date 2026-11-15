package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class q9 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;

    public /* synthetic */ q9(z10 z10Var, int i7) {
        this.a = i7;
        this.b = z10Var;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                z10 z10Var = this.b;
                if (stargiftupgradeattributes == null) {
                    z10Var.a(null);
                    break;
                } else {
                    z10Var.a(stargiftupgradeattributes.attributes);
                    break;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                z10 z10Var2 = this.b;
                if (!z10) {
                    z10Var2.a(new ArrayList());
                    break;
                } else {
                    z10Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    break;
                }
        }
    }
}
