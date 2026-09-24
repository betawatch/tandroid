package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc implements Utilities.Callback3 {
    public final /* synthetic */ ad a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ dc(ad adVar, int i10, View view) {
        this.a = adVar;
        this.b = i10;
        this.c = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        ad adVar = this.a;
        int i10 = adVar.U;
        int i11 = this.b;
        if (i11 == i10) {
            adVar.n = l4.longValue();
            adVar.a1(true);
        } else if (i11 == adVar.c0) {
            adVar.w = l4.longValue();
            adVar.b1();
        } else if (i11 == adVar.f0) {
            if (l4.longValue() == 0) {
                adVar.y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                adVar.y = emojiStatusCollectibleFromGift;
                adVar.s = -1;
                adVar.w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                adVar.y = tL_emojiStatus;
            }
            adVar.b1();
        }
        adVar.X0(true);
        ((nc) this.c).c(l4.longValue(), tL_starGiftUnique != null, true);
        adVar.Z0(true);
    }
}
