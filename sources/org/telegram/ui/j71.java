package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class j71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n71 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ j71(n71 n71Var, Integer num, int i10) {
        this.a = i10;
        this.b = n71Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        n71 n71Var = this.b;
        switch (i10) {
            case 0:
                n71.a(n71Var, this.c);
                break;
            default:
                n71Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        n71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    g61 g61Var = (g61) n71Var;
                    h61 h61Var = g61Var.S;
                    r71 r71Var = h61Var.e;
                    List list = r71.Z1;
                    r71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = g61Var.Q;
                    long j10 = ((a71) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    h61Var.e.p(view, Long.valueOf(j10), ((a71) g61Var.Q).e.document, g61Var.R, num);
                    if (g61Var.R == null) {
                        MediaDataController.getInstance(h61Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
