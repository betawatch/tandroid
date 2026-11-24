// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class gv4 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qac b;

    public /* synthetic */ gv4(qac qacVar, byte b) {
        this.a = b;
        this.b = qacVar;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                if (stargiftupgradeattributes == null) {
                    qacVar.a(null);
                    break;
                } else {
                    qacVar.a(stargiftupgradeattributes.attributes);
                    break;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                if (!(messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets)) {
                    qacVar.a(new ArrayList());
                    break;
                } else {
                    qacVar.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    break;
                }
        }
    }
}
