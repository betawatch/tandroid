package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class q00 implements z10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ c1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q00(v9 v9Var, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.c = v9Var;
        this.b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.d;
        long j3 = this.b;
        c1 c1Var = this.c;
        switch (i7) {
            case 0:
                c10 c10Var = (c10) c1Var;
                gj gjVar = (gj) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = gjVar.k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                c10Var.getMessagesStorage().X1(j3, gjVar.k);
                ns.f(c10Var.currentAccount).k(128, gjVar, Boolean.TRUE);
                break;
            default:
                v9 v9Var = (v9) c1Var;
                v9Var.d(j3).c = (ArrayList) obj;
                v9Var.f(j3, (TL_payments.TL_StarGiftAuctionState) obj2);
                break;
        }
    }

    public /* synthetic */ q00(c10 c10Var, gj gjVar, long j3) {
        this.c = c10Var;
        this.d = gjVar;
        this.b = j3;
    }
}
