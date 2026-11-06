package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class r9 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;

    public /* synthetic */ r9(c20 c20Var, int i7) {
        this.a = i7;
        this.b = c20Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                c20 c20Var = this.b;
                if (stargiftupgradeattributes == null) {
                    c20Var.a(null);
                    break;
                } else {
                    c20Var.a(stargiftupgradeattributes.attributes);
                    break;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                boolean z9 = messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets;
                c20 c20Var2 = this.b;
                if (!z9) {
                    c20Var2.a(new ArrayList());
                    break;
                } else {
                    c20Var2.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    break;
                }
        }
    }
}
