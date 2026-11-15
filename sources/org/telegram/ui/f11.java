package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j11 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ f11(j11 j11Var, Integer num, int i7) {
        this.a = i7;
        this.b = j11Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        j11 j11Var = this.b;
        switch (i7) {
            case 0:
                j11.a(j11Var, this.c);
                break;
            default:
                Integer num = this.c;
                if (num != null) {
                    try {
                        j11Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    d01 d01Var = (d01) j11Var;
                    n11 n11Var = d01Var.T.e;
                    List list = n11.b2;
                    n11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = d01Var.R;
                    long j3 = ((x01) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    n11Var.p(view, Long.valueOf(j3), ((x01) d01Var.R).e.document, d01Var.S, num);
                    if (d01Var.S == null) {
                        org.telegram.messenger.si.b0(n11Var.W).C1(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
