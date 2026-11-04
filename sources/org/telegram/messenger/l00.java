package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class l00 implements u10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ c1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l00(q9 q9Var, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.c = q9Var;
        this.b = j10;
        this.d = tL_StarGiftAuctionState;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        Object obj2 = this.d;
        long j10 = this.b;
        c1 c1Var = this.c;
        switch (i3) {
            case 0:
                x00 x00Var = (x00) c1Var;
                zi ziVar = (zi) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = ziVar.k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                x00Var.getMessagesStorage().X1(j10, ziVar.k);
                hs.f(x00Var.currentAccount).k(128, ziVar, Boolean.TRUE);
                break;
            default:
                q9 q9Var = (q9) c1Var;
                q9Var.d(j10).c = (ArrayList) obj;
                q9Var.f(j10, (TL_payments.TL_StarGiftAuctionState) obj2);
                break;
        }
    }

    public /* synthetic */ l00(x00 x00Var, zi ziVar, long j10) {
        this.c = x00Var;
        this.d = ziVar;
        this.b = j10;
    }
}
