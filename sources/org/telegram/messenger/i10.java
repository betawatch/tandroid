package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class i10 implements r20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ f1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i10(y9 y9Var, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.c = y9Var;
        this.b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        int i10 = this.a;
        Object obj2 = this.d;
        long j10 = this.b;
        f1 f1Var = this.c;
        switch (i10) {
            case 0:
                u10 u10Var = (u10) f1Var;
                kj kjVar = (kj) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = kjVar.k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                u10Var.getMessagesStorage().X1(j10, kjVar.k);
                at.f(u10Var.currentAccount).k(128, kjVar, Boolean.TRUE);
                break;
            default:
                y9 y9Var = (y9) f1Var;
                y9Var.d(j10).c = (ArrayList) obj;
                y9Var.f(j10, (TL_payments.TL_StarGiftAuctionState) obj2);
                break;
        }
    }

    public /* synthetic */ i10(u10 u10Var, kj kjVar, long j10) {
        this.c = u10Var;
        this.d = kjVar;
        this.b = j10;
    }
}
