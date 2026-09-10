package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class gc implements Utilities.Callback3 {
    public final /* synthetic */ cd a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ gc(cd cdVar, int i10, View view) {
        this.a = cdVar;
        this.b = i10;
        this.c = view;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        cd cdVar = this.a;
        int i10 = cdVar.U;
        int i11 = this.b;
        if (i11 == i10) {
            cdVar.n = l4.longValue();
            cdVar.a1(true);
        } else if (i11 == cdVar.c0) {
            cdVar.w = l4.longValue();
            cdVar.b1();
        } else if (i11 == cdVar.f0) {
            if (l4.longValue() == 0) {
                cdVar.y = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible emojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    emojiStatusCollectibleFromGift.flags |= 1;
                    emojiStatusCollectibleFromGift.until = num.intValue();
                }
                cdVar.y = emojiStatusCollectibleFromGift;
                cdVar.s = -1;
                cdVar.w = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                cdVar.y = tL_emojiStatus;
            }
            cdVar.b1();
        }
        cdVar.X0(true);
        ((qc) this.c).c(l4.longValue(), tL_starGiftUnique != null, true);
        cdVar.Z0(true);
    }
}
