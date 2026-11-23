package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class q9 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y10 b;

    public /* synthetic */ q9(y10 y10Var, int i7) {
        this.a = i7;
        this.b = y10Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                y10 y10Var = this.b;
                if (stargiftupgradeattributes == null) {
                    y10Var.a(null);
                    break;
                } else {
                    y10Var.a(stargiftupgradeattributes.attributes);
                    break;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                boolean z10 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                y10 y10Var2 = this.b;
                if (!z10) {
                    y10Var2.a(new ArrayList());
                    break;
                } else {
                    y10Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    break;
                }
        }
    }
}
