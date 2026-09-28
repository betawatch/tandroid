package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class fy {
    public final TLRPC.StickerSetCovered a;
    public final TLRPC.TL_messages_stickerSet b;
    public final TLRPC.StickerSet c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public fy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
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

    public fy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.a = stickerSetCovered;
        this.b = null;
        this.c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
