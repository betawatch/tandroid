package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n61 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ j61(n61 n61Var, Integer num, int i10) {
        this.a = i10;
        this.b = n61Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        n61 n61Var = this.b;
        switch (i10) {
            case 0:
                n61.a(n61Var, this.c);
                break;
            default:
                n61Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        n61Var.M.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    g51 g51Var = (g51) n61Var;
                    h51 h51Var = g51Var.P;
                    r61 r61Var = h51Var.e;
                    List list = r61.W1;
                    r61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = g51Var.N;
                    long j10 = ((a61) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    h51Var.e.p(view, Long.valueOf(j10), ((a61) g51Var.N).e.document, g51Var.O, num);
                    if (g51Var.O == null) {
                        MediaDataController.getInstance(h51Var.e.S).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
