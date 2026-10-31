package bi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.nj;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class r implements nj {
    public final /* synthetic */ bi a;
    public final /* synthetic */ t b;

    public r(t tVar, bi biVar) {
        this.b = tVar;
        this.a = biVar;
    }

    @Override // org.telegram.ui.Components.nj
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.b.W1.startActivityForResult(intent, 21);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Components.nj
    public final void m(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        d4 d4Var = this.b.r;
        if (!arrayList.isEmpty()) {
            d4Var.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            jj jjVar = (jj) arrayList3.get(0);
            d4Var.getClass();
            if (jjVar != null && jjVar.F0() != null) {
                TLRPC.Document F0 = jjVar.F0();
                TLRPC.Message message = jjVar.k;
                d4Var.g2(F0, message != null ? message.attachPath : null);
            }
        }
        this.a.a(true);
    }

    @Override // org.telegram.ui.Components.nj
    public final /* synthetic */ void S() {
    }

    @Override // org.telegram.ui.Components.nj
    public final /* synthetic */ void o(ArrayList arrayList, boolean z10, int i10, long j10) {
    }
}
