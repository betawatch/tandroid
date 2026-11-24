// default package

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nz9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rz9 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ nz9(rz9 rz9Var, Integer num, byte b) {
        this.a = b;
        this.b = rz9Var;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rz9 rz9Var = this.b;
        switch (b) {
            case 0:
                rz9Var.d(this.c);
                break;
            default:
                Integer num = this.c;
                if (num != null) {
                    try {
                        rz9Var.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    ly9 ly9Var = (ly9) rz9Var;
                    vz9 vz9Var = ly9Var.T.e;
                    List list = vz9.b2;
                    vz9Var.k();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = ly9Var.R;
                    long j = ((fz9) view).e.documentId;
                    tL_emojiStatus.document_id = j;
                    vz9Var.o(view, Long.valueOf(j), ((fz9) ly9Var.R).e.document, ly9Var.S, num);
                    if (ly9Var.S == null) {
                        hs6.d0(vz9Var.W).E1(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
