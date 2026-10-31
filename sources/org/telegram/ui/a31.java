package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e31 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ a31(e31 e31Var, Integer num, int i10) {
        this.a = i10;
        this.b = e31Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        e31 e31Var = this.b;
        switch (i10) {
            case 0:
                e31.a(e31Var, this.c);
                break;
            default:
                Integer num = this.c;
                if (num != null) {
                    try {
                        e31Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    y11 y11Var = (y11) e31Var;
                    i31 i31Var = y11Var.S.e;
                    List list = i31.a2;
                    i31Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = y11Var.Q;
                    long j10 = ((s21) view).e.documentId;
                    tL_emojiStatus.document_id = j10;
                    i31Var.p(view, Long.valueOf(j10), ((s21) y11Var.Q).e.document, y11Var.R, num);
                    if (y11Var.R == null) {
                        org.telegram.messenger.ui.b0(i31Var.V).C1(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
