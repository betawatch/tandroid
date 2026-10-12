package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class kc implements Utilities.Callback3 {
    public final /* synthetic */ hd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ kc(hd hdVar, int i10, View view) {
        this.a = hdVar;
        this.b = i10;
        this.c = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        hd hdVar = this.a;
        int i10 = hdVar.U;
        int i11 = this.b;
        if (i11 == i10) {
            hdVar.n = l4.longValue();
            hdVar.a1(true);
        } else if (i11 == hdVar.c0) {
            hdVar.w = l4.longValue();
            hdVar.b1();
        } else if (i11 == hdVar.f0) {
            if (l4.longValue() == 0) {
                hdVar.y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                hdVar.y = emojiStatusCollectibleFromGift;
                hdVar.s = -1;
                hdVar.w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                hdVar.y = tL_emojiStatus;
            }
            hdVar.b1();
        }
        hdVar.X0(true);
        ((uc) this.c).c(l4.longValue(), tL_starGiftUnique != null, true);
        hdVar.Z0(true);
    }
}
