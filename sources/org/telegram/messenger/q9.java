package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class q9 implements j20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ f1 c;

    public /* synthetic */ q9(x9 x9Var, long j10) {
        this.c = x9Var;
        this.b = j10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        long j10 = this.b;
        f1 f1Var = this.c;
        switch (i10) {
            case 0:
                x9 x9Var = (x9) f1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                LongSparseArray longSparseArray = x9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    x9Var.getMessagesController().V3(tL_StarGiftAuctionState.users, false);
                    x9Var.getMessagesController().P3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(j10, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(j10, Boolean.TRUE);
                    x9Var.j(j10, new h10(x9Var, j10, tL_StarGiftAuctionState));
                    break;
                } else if (tL_StarGiftAuctionState != null) {
                    x9Var.f(j10, tL_StarGiftAuctionState);
                    break;
                }
                break;
            default:
                vp vpVar = (vp) f1Var;
                if (((TLRPC.Bool) obj) != null) {
                    vpVar.T2(0, j10, true);
                }
                int i11 = org.telegram.ui.Components.vr.z2;
                break;
        }
    }

    public /* synthetic */ q9(vp vpVar, long j10, z1 z1Var) {
        this.c = vpVar;
        this.b = j10;
    }
}
