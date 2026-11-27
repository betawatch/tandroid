// default package

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class oga implements wc5 {
    public final /* synthetic */ eja a;

    public oga(eja ejaVar) {
        this.a = ejaVar;
    }

    @Override // wc5
    public final void a(xc5 xc5Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        bundle.putBoolean("just_created_chat", true);
        xc5Var.presentFragment(new zu1(bundle), true);
        sha shaVar = this.a.S;
        e eVar = shaVar.r.y1;
        if (shaVar.n != 0) {
            eVar.getConnectionsManager().cancelRequest(shaVar.n, true);
            shaVar.n = 0;
        }
        shaVar.d.clear();
        shaVar.e = false;
        shaVar.h = false;
        shaVar.E(0L);
        TLRPC.User X1 = eVar.getMessagesController().X1(Long.valueOf(shaVar.F()));
        if (X1 != null) {
            eVar.getMessagesController().f3(X1, eVar.getClassGuid(), true, null);
        }
    }
}
