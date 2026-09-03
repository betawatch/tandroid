package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec implements Utilities.Callback3 {
    public final /* synthetic */ dd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ ec(dd ddVar, int i10, View view) {
        this.a = ddVar;
        this.b = i10;
        this.c = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        dd ddVar = this.a;
        int i10 = ddVar.R;
        int i11 = this.b;
        if (i11 == i10) {
            ddVar.n = l10.longValue();
            ddVar.a1(true);
        } else if (i11 == ddVar.Z) {
            ddVar.w = l10.longValue();
            ddVar.b1();
        } else if (i11 == ddVar.c0) {
            if (l10.longValue() == 0) {
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
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                ddVar.y = tL_emojiStatus;
            }
            ddVar.b1();
        }
        ddVar.X0(true);
        ((qc) this.c).c(l10.longValue(), tL_starGiftUnique != null, true);
        ddVar.Z0(true);
    }
}
