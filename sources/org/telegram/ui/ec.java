package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec implements Utilities.Callback3 {
    public final /* synthetic */ bd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ ec(bd bdVar, int i10, View view) {
        this.a = bdVar;
        this.b = i10;
        this.c = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        bd bdVar = this.a;
        int i10 = bdVar.U;
        int i11 = this.b;
        if (i11 == i10) {
            bdVar.n = l4.longValue();
            bdVar.a1(true);
        } else if (i11 == bdVar.c0) {
            bdVar.w = l4.longValue();
            bdVar.b1();
        } else if (i11 == bdVar.f0) {
            if (l4.longValue() == 0) {
                bdVar.y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                bdVar.y = emojiStatusCollectibleFromGift;
                bdVar.s = -1;
                bdVar.w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                bdVar.y = tL_emojiStatus;
            }
            bdVar.b1();
        }
        bdVar.X0(true);
        ((pc) this.c).c(l4.longValue(), tL_starGiftUnique != null, true);
        bdVar.Z0(true);
    }
}
