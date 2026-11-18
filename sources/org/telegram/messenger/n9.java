package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class n9 implements q10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ c1 c;

    public /* synthetic */ n9(u9 u9Var, long j3) {
        this.c = u9Var;
        this.b = j3;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        long j3 = this.b;
        c1 c1Var = this.c;
        switch (i7) {
            case 0:
                u9 u9Var = (u9) c1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                LongSparseArray longSparseArray = u9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    u9Var.getMessagesController().f4(tL_StarGiftAuctionState.users, false);
                    u9Var.getMessagesController().Z3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(j3, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(j3, Boolean.TRUE);
                    u9Var.j(j3, new n00(u9Var, j3, tL_StarGiftAuctionState));
                    break;
                } else if (tL_StarGiftAuctionState != null) {
                    u9Var.f(j3, tL_StarGiftAuctionState);
                    break;
                }
                break;
            default:
                mp mpVar = (mp) c1Var;
                if (((TLRPC.Bool) obj) != null) {
                    mpVar.b3(0, j3, true);
                }
                int i10 = org.telegram.ui.Components.yr.D2;
                break;
        }
    }

    public /* synthetic */ n9(mp mpVar, long j3, jh.b bVar) {
        this.c = mpVar;
        this.b = j3;
    }
}
