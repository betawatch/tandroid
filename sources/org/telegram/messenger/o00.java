package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class o00 implements y10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ c1 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o00(v9 v9Var, long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        this.c = v9Var;
        this.b = j3;
        this.d = tL_StarGiftAuctionState;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.d;
        long j3 = this.b;
        c1 c1Var = this.c;
        switch (i7) {
            case 0:
                a10 a10Var = (a10) c1Var;
                gj gjVar = (gj) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.Message message = gjVar.k;
                message.summaryText = tL_textWithEntities;
                if (tL_textWithEntities == null) {
                    message.summarizedOpen = false;
                }
                a10Var.getMessagesStorage().X1(j3, gjVar.k);
                ls.f(a10Var.currentAccount).k(128, gjVar, Boolean.TRUE);
                break;
            default:
                v9 v9Var = (v9) c1Var;
                v9Var.d(j3).c = (ArrayList) obj;
                v9Var.f(j3, (TL_payments.TL_StarGiftAuctionState) obj2);
                break;
        }
    }

    public /* synthetic */ o00(a10 a10Var, gj gjVar, long j3) {
        this.c = a10Var;
        this.d = gjVar;
        this.b = j3;
    }
}
