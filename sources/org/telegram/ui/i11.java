package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m11 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ i11(m11 m11Var, Integer num, int i7) {
        this.a = i7;
        this.b = m11Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        m11 m11Var = this.b;
        switch (i7) {
            case 0:
                m11.a(m11Var, this.c);
                break;
            default:
                Integer num = this.c;
                if (num != null) {
                    try {
                        m11Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    g01 g01Var = (g01) m11Var;
                    q11 q11Var = g01Var.S.e;
                    List list = q11.a2;
                    q11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = g01Var.Q;
                    long j3 = ((a11) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    q11Var.p(view, Long.valueOf(j3), ((a11) g01Var.Q).e.document, g01Var.R, num);
                    if (g01Var.R == null) {
                        org.telegram.messenger.ui.b0(q11Var.V).C1(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
