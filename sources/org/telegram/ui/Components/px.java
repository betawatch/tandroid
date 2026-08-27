package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class px {
    public final TLRPC.StickerSetCovered a;
    public final TLRPC.TL_messages_stickerSet b;
    public final TLRPC.StickerSet c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public px(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.a = null;
        this.b = tL_messages_stickerSet;
        this.c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public px(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.a = stickerSetCovered;
        this.b = null;
        this.c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
