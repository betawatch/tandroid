package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class n00 implements x10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ c1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n00(u9 u9Var, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.c = u9Var;
        this.b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.d;
        long j3 = this.b;
        c1 c1Var = this.c;
        switch (i7) {
            case 0:
                z00 z00Var = (z00) c1Var;
                fj fjVar = (fj) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = fjVar.k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                z00Var.getMessagesStorage().X1(j3, fjVar.k);
                ks.f(z00Var.currentAccount).k(128, fjVar, Boolean.TRUE);
                break;
            default:
                u9 u9Var = (u9) c1Var;
                u9Var.d(j3).c = (ArrayList) obj;
                u9Var.f(j3, (TL_payments.TL_StarGiftAuctionState) obj2);
                break;
        }
    }

    public /* synthetic */ n00(z00 z00Var, fj fjVar, long j3) {
        this.c = z00Var;
        this.d = fjVar;
        this.b = j3;
    }
}
