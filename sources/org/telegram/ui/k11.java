package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o11 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ k11(o11 o11Var, Integer num, int i7) {
        this.a = i7;
        this.b = o11Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        o11 o11Var = this.b;
        switch (i7) {
            case 0:
                o11.a(o11Var, this.c);
                break;
            default:
                Integer num = this.c;
                if (num != null) {
                    try {
                        o11Var.P.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    i01 i01Var = (i01) o11Var;
                    s11 s11Var = i01Var.S.e;
                    List list = s11.a2;
                    s11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = i01Var.Q;
                    long j3 = ((c11) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    s11Var.p(view, Long.valueOf(j3), ((c11) i01Var.Q).e.document, i01Var.R, num);
                    if (i01Var.R == null) {
                        org.telegram.messenger.ui.b0(s11Var.V).C1(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
