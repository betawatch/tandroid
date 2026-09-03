package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s61 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ o61(s61 s61Var, Integer num, int i10) {
        this.a = i10;
        this.b = s61Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        s61 s61Var = this.b;
        switch (i10) {
            case 0:
                s61.a(s61Var, this.c);
                break;
            default:
                s61Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        s61Var.M.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    l51 l51Var = (l51) s61Var;
                    m51 m51Var = l51Var.P;
                    w61 w61Var = m51Var.e;
                    List list = w61.W1;
                    w61Var.l();
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
