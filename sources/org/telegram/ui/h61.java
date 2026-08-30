package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m61 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ h61(m61 m61Var, Integer num, int i10) {
        this.a = i10;
        this.b = m61Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        m61 m61Var = this.b;
        switch (i10) {
            case 0:
                m61.a(m61Var, this.c);
                break;
            default:
                m61Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        m61Var.M.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    e51 e51Var = (e51) m61Var;
                    f51 f51Var = e51Var.P;
                    q61 q61Var = f51Var.e;
                    List list = q61.W1;
                    q61Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = e51Var.N;
                    long j10 = ((y51) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    f51Var.e.p(view, Long.valueOf(j10), ((y51) e51Var.N).e.document, e51Var.O, num);
                    if (e51Var.O == null) {
                        MediaDataController.getInstance(f51Var.e.S).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
