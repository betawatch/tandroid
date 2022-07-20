package org.telegram.tgnet;

import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class TLRPC$StickerSetCovered extends TLObject {
    public TLRPC$Document cover;
    public ArrayList<TLRPC$Document> covers = new ArrayList<>();
    public TLRPC$StickerSet set;

    public static TLRPC$StickerSetCovered TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$StickerSetCovered tLRPC$StickerSetCovered;
        if (i == 451763941) {
            tLRPC$StickerSetCovered = new TLRPC$TL_stickerSetFullCovered();
        } else if (i == 872932635) {
            tLRPC$StickerSetCovered = new TLRPC$TL_stickerSetMultiCovered();
        } else {
            tLRPC$StickerSetCovered = i != 1678812626 ? null : new TLRPC$TL_stickerSetCovered();
        }
        if (tLRPC$StickerSetCovered != null || !z) {
            if (tLRPC$StickerSetCovered != null) {
                tLRPC$StickerSetCovered.readParams(abstractSerializedData, z);
            }
            return tLRPC$StickerSetCovered;
        }
        throw new RuntimeException(String.format("can't parse magic %x in StickerSetCovered", Integer.valueOf(i)));
    }
}
