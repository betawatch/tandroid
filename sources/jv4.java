// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class jv4 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pcc b;

    public /* synthetic */ jv4(pcc pccVar, byte b) {
        this.a = b;
        this.b = pccVar;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                if (stargiftupgradeattributes == null) {
                    pccVar.a(null);
                    break;
                } else {
                    pccVar.a(stargiftupgradeattributes.attributes);
                    break;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                if (!(messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets)) {
                    pccVar.a(new ArrayList());
                    break;
                } else {
                    pccVar.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    break;
                }
        }
    }
}
