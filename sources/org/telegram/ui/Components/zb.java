package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zb implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zb(int i10, long j10, TLRPC.Document document) {
        this.c = i10;
        this.b = j10;
        this.d = document;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        TLRPC.StickerSet stickerSet;
        int i10 = this.a;
        int i11 = 2;
        Object obj2 = this.d;
        long j10 = this.b;
        int i12 = this.c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                org.telegram.messenger.i0.h3(new org.telegram.ui.zg(27, (wb) obj2, (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) ? org.telegram.messenger.cd.L0(2131754435, null) : i12 == 1 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("TopicContainsEmojiPackSingle", null, 2131744047, stickerSet.title)) : i12 == 2 ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("StoryContainsEmojiPackSingle", null, 2131744717, stickerSet.title)) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("MessageContainsEmojiPackSingle", null, 2131748611, stickerSet.title))), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                break;
            case 1:
                ((zt0) obj2).getStoriesController().b(i12, j10, (ArrayList) obj);
                break;
            default:
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (((Boolean) obj).booleanValue()) {
                    rh.e6.y(i12, false).P(j10);
                    org.telegram.messenger.i0.g3(new u41(new org.telegram.ui.vl0(j10, i11), document, org.telegram.messenger.cd.L0(2131750111, null), 25));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ zb(int i10, wb wbVar, long j10) {
        this.c = i10;
        this.d = wbVar;
        this.b = j10;
    }

    public /* synthetic */ zb(zt0 zt0Var, long j10, int i10) {
        this.d = zt0Var;
        this.b = j10;
        this.c = i10;
    }
}
