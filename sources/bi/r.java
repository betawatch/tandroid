package bi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.nj;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class r implements nj {
    public final /* synthetic */ bi a;
    public final /* synthetic */ t b;

    public r(t tVar, bi biVar) {
        this.b = tVar;
        this.a = biVar;
    }

    @Override // org.telegram.ui.Components.nj
    public final void B() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.b.W1.startActivityForResult(intent, 21);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.nj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        d4 d4Var = this.b.r;
        if (!arrayList.isEmpty()) {
            d4Var.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            kj kjVar = (kj) arrayList3.get(0);
            d4Var.getClass();
            if (kjVar != null && kjVar.F0() != null) {
                TLRPC.Document F0 = kjVar.F0();
                TLRPC.Message message = kjVar.k;
                d4Var.g2(F0, message != null ? message.attachPath : null);
            }
        }
        this.a.a(true);
    }

    @Override // org.telegram.ui.Components.nj
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.nj
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i10, long j10) {
    }
}
