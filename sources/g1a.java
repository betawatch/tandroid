// default package

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g1a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j1a b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ g1a(j1a j1aVar, Integer num, byte b) {
        this.a = b;
        this.b = j1aVar;
        this.c = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        j1a j1aVar = this.b;
        switch (b) {
            case 0:
                j1aVar.d(this.c);
                break;
            default:
                Integer num = this.c;
                if (num != null) {
                    try {
                        j1aVar.Q.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    c0a c0aVar = (c0a) j1aVar;
                    n1a n1aVar = c0aVar.T.e;
                    List list = n1a.b2;
                    n1aVar.k();
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    View view = c0aVar.R;
                    long j = ((w0a) view).e.documentId;
                    tL_emojiStatus.document_id = j;
                    n1aVar.o(view, Long.valueOf(j), ((w0a) c0aVar.R).e.document, c0aVar.S, num);
                    if (c0aVar.S == null) {
                        ls6.d0(n1aVar.W).E1(tL_emojiStatus);
                        break;
                    }
                }
                break;
        }
    }
}
