package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g71 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ c71(g71 g71Var, Integer num, int i10) {
        this.a = i10;
        this.b = g71Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        g71 g71Var = this.b;
        switch (i10) {
            case 0:
                g71.a(g71Var, this.c);
                break;
            default:
                g71Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        g71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    z51 z51Var = (z51) g71Var;
                    a61 a61Var = z51Var.S;
                    k71 k71Var = a61Var.e;
                    List list = k71.Z1;
                    k71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = z51Var.Q;
                    long j3 = ((t61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    a61Var.e.p(view, Long.valueOf(j3), ((t61) z51Var.Q).e.document, z51Var.R, num);
                    if (z51Var.R == null) {
                        MediaDataController.getInstance(a61Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
