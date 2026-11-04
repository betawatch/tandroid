package mi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.lj;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class s1 implements lj {
    public final /* synthetic */ bi a;
    public final /* synthetic */ c2 b;

    public s1(c2 c2Var, bi biVar) {
        this.b = c2Var;
        this.a = biVar;
    }

    @Override // org.telegram.ui.Components.lj
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.lj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i3, long j10, boolean z11, long j11) {
        boolean isEmpty = arrayList.isEmpty();
        c2 c2Var = this.b;
        if (!isEmpty) {
            c2Var.Q.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            t3 t3Var = c2Var.Q;
            zi ziVar = (zi) arrayList3.get(0);
            t3Var.getClass();
            if (ziVar != null && ziVar.F0() != null) {
                TLRPC.Document F0 = ziVar.F0();
                TLRPC.Message message = ziVar.k;
                t3Var.g2(F0, message != null ? message.attachPath : null);
            }
        }
        this.a.a(true);
    }

    @Override // org.telegram.ui.Components.lj
    public final /* synthetic */ void S() {
    }

    @Override // org.telegram.ui.Components.lj
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i3, long j10) {
    }
}
