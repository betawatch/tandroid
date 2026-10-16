package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jc implements Utilities.Callback3 {
    public final /* synthetic */ gd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ jc(gd gdVar, int i10, View view) {
        this.a = gdVar;
        this.b = i10;
        this.c = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        gd gdVar = this.a;
        int i10 = gdVar.U;
        int i11 = this.b;
        if (i11 == i10) {
            gdVar.n = l4.longValue();
            gdVar.a1(true);
        } else if (i11 == gdVar.c0) {
            gdVar.w = l4.longValue();
            gdVar.b1();
        } else if (i11 == gdVar.f0) {
            if (l4.longValue() == 0) {
                gdVar.y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                gdVar.y = emojiStatusCollectibleFromGift;
                gdVar.s = -1;
                gdVar.w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                gdVar.y = tL_emojiStatus;
            }
            gdVar.b1();
        }
        gdVar.X0(true);
        ((tc) this.c).c(l4.longValue(), tL_starGiftUnique != null, true);
        gdVar.Z0(true);
    }
}
