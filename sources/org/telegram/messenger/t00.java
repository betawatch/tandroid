package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class t00 implements c20 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ c1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t00(w9 w9Var, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.c = w9Var;
        this.b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.d;
        long j3 = this.b;
        c1 c1Var = this.c;
        switch (i7) {
            case 0:
                f10 f10Var = (f10) c1Var;
                ij ijVar = (ij) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = ijVar.k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                f10Var.getMessagesStorage().X1(j3, ijVar.k);
                qs.f(f10Var.currentAccount).k(128, ijVar, Boolean.TRUE);
                break;
            default:
                w9 w9Var = (w9) c1Var;
                w9Var.d(j3).c = (ArrayList) obj;
                w9Var.f(j3, (TL_payments.TL_StarGiftAuctionState) obj2);
                break;
        }
    }

    public /* synthetic */ t00(f10 f10Var, ij ijVar, long j3) {
        this.c = f10Var;
        this.d = ijVar;
        this.b = j3;
    }
}
