package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class d71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h71 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ d71(h71 h71Var, Integer num, int i10) {
        this.a = i10;
        this.b = h71Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        h71 h71Var = this.b;
        switch (i10) {
            case 0:
                h71.a(h71Var, this.c);
                break;
            default:
                h71Var.getClass();
                Integer num = this.c;
                if (num != null) {
                    try {
                        h71Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    a61 a61Var = (a61) h71Var;
                    b61 b61Var = a61Var.S;
                    l71 l71Var = b61Var.e;
                    List list = l71.Z1;
                    l71Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = a61Var.Q;
                    long j3 = ((u61) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    b61Var.e.p(view, Long.valueOf(j3), ((u61) a61Var.Q).e.document, a61Var.R, num);
                    if (a61Var.R == null) {
                        MediaDataController.getInstance(b61Var.e.V).pushRecentEmojiStatus(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
