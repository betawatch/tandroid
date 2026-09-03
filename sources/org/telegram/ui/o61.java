package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t61 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ o61(t61 t61Var, Integer num, int i10) {
        this.a = i10;
        this.b = t61Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        t61 t61Var = this.b;
        switch (i10) {
            case 0:
                t61.a(t61Var, this.c);
                break;
            default:
                t61Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        t61Var.M.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    l51 l51Var = (l51) t61Var;
                    m51 m51Var = l51Var.P;
                    x61 x61Var = m51Var.e;
                    List list = x61.W1;
                    x61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = l51Var.N;
                    long j10 = ((f61) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    m51Var.e.p(view, Long.valueOf(j10), ((f61) l51Var.N).e.document, l51Var.O, num);
                    if (l51Var.O == null) {
                        MediaDataController.getInstance(m51Var.e.S).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
