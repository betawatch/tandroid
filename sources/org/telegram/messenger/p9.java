package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class p9 implements v10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ c1 c;

    public /* synthetic */ p9(w9 w9Var, long j3) {
        this.c = w9Var;
        this.b = j3;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        long j3 = this.b;
        c1 c1Var = this.c;
        switch (i7) {
            case 0:
                w9 w9Var = (w9) c1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                LongSparseArray longSparseArray = w9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    w9Var.getMessagesController().Y3(tL_StarGiftAuctionState.users, false);
                    w9Var.getMessagesController().S3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(j3, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(j3, Boolean.TRUE);
                    w9Var.j(j3, new t00(w9Var, j3, tL_StarGiftAuctionState));
                    break;
                } else if (tL_StarGiftAuctionState != null) {
                    w9Var.f(j3, tL_StarGiftAuctionState);
                    break;
                }
                break;
            default:
                qp qpVar = (qp) c1Var;
                if (((TLRPC.Bool) obj) != null) {
                    qpVar.V2(0, j3, true);
                }
                int i10 = org.telegram.ui.Components.lr.z2;
                break;
        }
    }

    public /* synthetic */ p9(qp qpVar, long j3, jh.b bVar) {
        this.c = qpVar;
        this.b = j3;
    }
}
