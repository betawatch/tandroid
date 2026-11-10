package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p11 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ l11(p11 p11Var, Integer num, int i7) {
        this.a = i7;
        this.b = p11Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        p11 p11Var = this.b;
        switch (i7) {
            case 0:
                p11.a(p11Var, this.c);
                break;
            default:
                Integer num = this.c;
                if (num != null) {
                    try {
                        p11Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    j01 j01Var = (j01) p11Var;
                    t11 t11Var = j01Var.S.e;
                    List list = t11.a2;
                    t11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = j01Var.Q;
                    long j3 = ((d11) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    t11Var.p(view, Long.valueOf(j3), ((d11) j01Var.Q).e.document, j01Var.R, num);
                    if (j01Var.R == null) {
                        org.telegram.messenger.ui.b0(t11Var.V).C1(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
