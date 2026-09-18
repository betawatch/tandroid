package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e71 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ a71(e71 e71Var, Integer num, int i10) {
        this.a = i10;
        this.b = e71Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        e71 e71Var = this.b;
        switch (i10) {
            case 0:
                e71.a(e71Var, this.c);
                break;
            default:
                e71Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        e71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    x51 x51Var = (x51) e71Var;
                    y51 y51Var = x51Var.S;
                    i71 i71Var = y51Var.e;
                    List list = i71.Z1;
                    i71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = x51Var.Q;
                    long j3 = ((r61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    y51Var.e.p(view, Long.valueOf(j3), ((r61) x51Var.Q).e.document, x51Var.R, num);
                    if (x51Var.R == null) {
                        MediaDataController.getInstance(y51Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
