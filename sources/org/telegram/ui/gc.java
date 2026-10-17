package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gc implements Utilities.Callback3 {
    public final /* synthetic */ dd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ gc(dd ddVar, int i10, View view) {
        this.a = ddVar;
        this.b = i10;
        this.c = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        dd ddVar = this.a;
        int i10 = ddVar.U;
        int i11 = this.b;
        if (i11 == i10) {
            ddVar.n = l4.longValue();
            ddVar.a1(true);
        } else if (i11 == ddVar.c0) {
            ddVar.w = l4.longValue();
            ddVar.b1();
        } else if (i11 == ddVar.f0) {
            if (l4.longValue() == 0) {
                ddVar.y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                ddVar.y = emojiStatusCollectibleFromGift;
                ddVar.s = -1;
                ddVar.w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                ddVar.y = tL_emojiStatus;
            }
            ddVar.b1();
        }
        ddVar.X0(true);
        ((qc) this.c).c(l4.longValue(), tL_starGiftUnique != null, true);
        ddVar.Z0(true);
    }
}
