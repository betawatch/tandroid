package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o80;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class p6 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ o80 b;
    public final /* synthetic */ h7 c;

    public p6(h7 h7Var, long j10, o80 o80Var) {
        this.c = h7Var;
        this.a = j10;
        this.b = o80Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ai.b3(this, tLObject, this.a, this.b, 9));
    }
}
