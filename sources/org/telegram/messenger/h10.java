package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h10 implements q20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ f1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h10(x9 x9Var, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.c = x9Var;
        this.b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        Object obj2 = this.d;
        long j10 = this.b;
        f1 f1Var = this.c;
        switch (i10) {
            case 0:
                t10 t10Var = (t10) f1Var;
                jj jjVar = (jj) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = jjVar.k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                t10Var.getMessagesStorage().X1(j10, jjVar.k);
                zs.f(t10Var.currentAccount).k(128, jjVar, Boolean.TRUE);
                break;
            default:
                x9 x9Var = (x9) f1Var;
                x9Var.d(j10).c = (ArrayList) obj;
                x9Var.f(j10, (TL_payments.TL_StarGiftAuctionState) obj2);
                break;
        }
    }

    public /* synthetic */ h10(t10 t10Var, jj jjVar, long j10) {
        this.c = t10Var;
        this.d = jjVar;
        this.b = j10;
    }
}
