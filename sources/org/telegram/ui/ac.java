package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac implements Utilities.Callback3 {
    public final /* synthetic */ xc a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ ac(xc xcVar, int i10, View view) {
        this.a = xcVar;
        this.b = i10;
        this.c = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        xc xcVar = this.a;
        int i10 = xcVar.Q;
        int i11 = this.b;
        if (i11 == i10) {
            xcVar.n = l10.longValue();
            xcVar.a1(true);
        } else if (i11 == xcVar.Y) {
            xcVar.w = l10.longValue();
            xcVar.b1();
        } else if (i11 == xcVar.b0) {
            if (l10.longValue() == 0) {
                xcVar.y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                xcVar.y = emojiStatusCollectibleFromGift;
                xcVar.s = -1;
                xcVar.w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l10.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                xcVar.y = tL_emojiStatus;
            }
            xcVar.b1();
        }
        xcVar.X0(true);
        ((kc) this.c).c(l10.longValue(), tL_starGiftUnique != null, true);
        xcVar.Z0(true);
    }
}
