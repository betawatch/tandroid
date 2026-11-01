package org.telegram.messenger;

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class r9 implements k20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ f1 c;

    public /* synthetic */ r9(y9 y9Var, long j10) {
        this.c = y9Var;
        this.b = j10;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        long j10 = this.b;
        f1 f1Var = this.c;
        switch (i10) {
            case 0:
                y9 y9Var = (y9) f1Var;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                LongSparseArray longSparseArray = y9Var.e;
                if (tL_StarGiftAuctionState != null) {
                    y9Var.getMessagesController().V3(tL_StarGiftAuctionState.users, false);
                    y9Var.getMessagesController().P3(tL_StarGiftAuctionState.chats, false);
                }
                if (tL_StarGiftAuctionState != null && !((Boolean) longSparseArray.get(j10, Boolean.FALSE)).booleanValue()) {
                    longSparseArray.put(j10, Boolean.TRUE);
                    y9Var.j(j10, new i10(y9Var, j10, tL_StarGiftAuctionState));
                    break;
                } else if (tL_StarGiftAuctionState != null) {
                    y9Var.f(j10, tL_StarGiftAuctionState);
                    break;
                }
                break;
            default:
                wp wpVar = (wp) f1Var;
                if (((TLRPC.Bool) obj) != null) {
                    wpVar.T2(0, j10, true);
                }
                int i11 = org.telegram.ui.Components.vr.z2;
                break;
        }
    }

    public /* synthetic */ r9(wp wpVar, long j10, z1 z1Var) {
        this.c = wpVar;
        this.b = j10;
    }
}
