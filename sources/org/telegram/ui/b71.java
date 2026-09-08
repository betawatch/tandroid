package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class b71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f71 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ b71(f71 f71Var, Integer num, int i10) {
        this.a = i10;
        this.b = f71Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        f71 f71Var = this.b;
        switch (i10) {
            case 0:
                f71.a(f71Var, this.c);
                break;
            default:
                f71Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        f71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    y51 y51Var = (y51) f71Var;
                    z51 z51Var = y51Var.S;
                    j71 j71Var = z51Var.e;
                    List list = j71.Z1;
                    j71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = y51Var.Q;
                    long j3 = ((s61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    z51Var.e.p(view, Long.valueOf(j3), ((s61) y51Var.Q).e.document, y51Var.R, num);
                    if (y51Var.R == null) {
                        MediaDataController.getInstance(z51Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
