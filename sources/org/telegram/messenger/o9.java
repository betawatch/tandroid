package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class o9 implements r10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ c1 c;

    public /* synthetic */ o9(v9 v9Var, long j3) {
        this.c = v9Var;
        this.b = j3;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        long j3 = this.b;
        c1 c1Var = this.c;
        switch (i7) {
            case 0:
                v9 v9Var = (v9) c1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                LongSparseArray longSparseArray = v9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    v9Var.getMessagesController().f4(tL_StarGiftAuctionState.users, false);
                    v9Var.getMessagesController().Z3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(j3, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(j3, Boolean.TRUE);
                    v9Var.j(j3, new o00(v9Var, j3, tL_StarGiftAuctionState));
                    break;
                } else if (tL_StarGiftAuctionState != null) {
                    v9Var.f(j3, tL_StarGiftAuctionState);
                    break;
                }
                break;
            default:
                np npVar = (np) c1Var;
                if (((TLRPC.Bool) obj) != null) {
                    npVar.b3(0, j3, true);
                }
                int i10 = org.telegram.ui.Components.as.D2;
                break;
        }
    }

    public /* synthetic */ o9(np npVar, long j3, jh.b bVar) {
        this.c = npVar;
        this.b = j3;
    }
}
