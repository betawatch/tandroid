package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n11 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ j11(n11 n11Var, Integer num, int i7) {
        this.a = i7;
        this.b = n11Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        n11 n11Var = this.b;
        switch (i7) {
            case 0:
                n11.a(n11Var, this.c);
                break;
            default:
                Integer num = this.c;
                if (num != null) {
                    try {
                        n11Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    h01 h01Var = (h01) n11Var;
                    r11 r11Var = h01Var.T.e;
                    List list = r11.b2;
                    r11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = h01Var.R;
                    long j3 = ((b11) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    r11Var.p(view, Long.valueOf(j3), ((b11) h01Var.R).e.document, h01Var.S, num);
                    if (h01Var.S == null) {
                        org.telegram.messenger.ri.d0(r11Var.W).G1(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
