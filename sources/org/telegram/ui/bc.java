package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc implements org.telegram.messenger.l20 {
    public final /* synthetic */ zc a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ bc(zc zcVar, int i10, View view) {
        this.a = zcVar;
        this.b = i10;
        this.c = view;
    }

    @Override // org.telegram.messenger.l20
    public final void a(Object obj, Object obj2, Object obj3) {
        Long l4 = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        zc zcVar = this.a;
        int i10 = zcVar.U;
        int i11 = this.b;
        if (i11 == i10) {
            zcVar.n = l4.longValue();
            zcVar.g1(true);
        } else if (i11 == zcVar.c0) {
            zcVar.x = l4.longValue();
            zcVar.h1();
        } else if (i11 == zcVar.f0) {
            if (l4.longValue() == 0) {
                zcVar.D = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible q02 = org.telegram.messenger.vp.q0(tL_starGiftUnique);
                if (num != null) {
                    q02.flags |= 1;
                    q02.until = num.intValue();
                }
                zcVar.D = q02;
                zcVar.s = -1;
                zcVar.x = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l4.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                zcVar.D = tL_emojiStatus;
            }
            zcVar.h1();
        }
        zcVar.d1(true);
        ((mc) this.c).c(l4.longValue(), tL_starGiftUnique != null, true);
        zcVar.f1(true);
    }
}
