package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                        m11Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    g01 g01Var = (g01) m11Var;
                    q11 q11Var = g01Var.T.e;
                    List list = q11.b2;
                    q11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = g01Var.R;
                    long j3 = ((a11) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    q11Var.p(view, Long.valueOf(j3), ((a11) g01Var.R).e.document, g01Var.S, num);
                    if (g01Var.S == null) {
                        org.telegram.messenger.ri.d0(q11Var.W).G1(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
