// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ft4 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;

    public /* synthetic */ ft4(p8c p8cVar, byte b) {
        this.a = b;
        this.b = p8cVar;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes = (TL_stars.starGiftUpgradeAttributes) obj;
                if (stargiftupgradeattributes == null) {
                    p8cVar.a(null);
                    break;
                } else {
                    p8cVar.a(stargiftupgradeattributes.attributes);
                    break;
                }
            default:
                TLRPC.messages_FoundStickerSets messages_foundstickersets = (TLRPC.messages_FoundStickerSets) obj;
                if (!(messages_foundstickersets instanceof TLRPC.TL_messages_foundStickerSets)) {
                    p8cVar.a(new ArrayList());
                    break;
                } else {
                    p8cVar.a(((TLRPC.TL_messages_foundStickerSets) messages_foundstickersets).sets);
                    break;
                }
        }
    }
}
