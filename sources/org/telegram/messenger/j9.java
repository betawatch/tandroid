package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j9 implements n10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ c1 c;

    public /* synthetic */ j9(q9 q9Var, long j10) {
        this.c = q9Var;
        this.b = j10;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3 = this.a;
        long j10 = this.b;
        c1 c1Var = this.c;
        switch (i3) {
            case 0:
                q9 q9Var = (q9) c1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                LongSparseArray longSparseArray = q9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    q9Var.getMessagesController().Y3(tL_StarGiftAuctionState.users, false);
                    q9Var.getMessagesController().S3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(j10, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(j10, Boolean.TRUE);
                    q9Var.j(j10, new l00(q9Var, j10, tL_StarGiftAuctionState));
                    break;
                } else if (tL_StarGiftAuctionState != null) {
                    q9Var.f(j10, tL_StarGiftAuctionState);
                    break;
                }
                break;
            default:
                hp hpVar = (hp) c1Var;
                if (((TLRPC.Bool) obj) != null) {
                    hpVar.V2(0, j10, true);
                }
                int i10 = org.telegram.ui.Components.lr.A2;
                break;
        }
    }

    public /* synthetic */ j9(hp hpVar, long j10, kh.b bVar) {
        this.c = hpVar;
        this.b = j10;
    }
}
