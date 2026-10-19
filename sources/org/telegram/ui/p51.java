package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class p51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t51 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ p51(t51 t51Var, Integer num, int i10) {
        this.a = i10;
        this.b = t51Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        t51 t51Var = this.b;
        switch (i10) {
            case 0:
                t51.a(t51Var, this.c);
                break;
            default:
                t51Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        t51Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    m41 m41Var = (m41) t51Var;
                    n41 n41Var = m41Var.S;
                    x51 x51Var = n41Var.e;
                    List list = x51.Z1;
                    x51Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = m41Var.Q;
                    long j10 = ((g51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    n41Var.e.p(view, Long.valueOf(j10), ((g51) m41Var.Q).e.document, m41Var.R, num);
                    if (m41Var.R == null) {
                        MediaDataController.getInstance(n41Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
