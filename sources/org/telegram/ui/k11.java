package org.telegram.ui;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                        o11Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    i01 i01Var = (i01) o11Var;
                    s11 s11Var = i01Var.T.e;
                    List list = s11.b2;
                    s11Var.l();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = i01Var.R;
                    long j3 = ((c11) view).e.documentId;
                    tL_emojiStatus.document_id = j3;
                    s11Var.p(view, Long.valueOf(j3), ((c11) i01Var.R).e.document, i01Var.S, num);
                    if (i01Var.S == null) {
                        org.telegram.messenger.ri.d0(s11Var.W).G1(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
