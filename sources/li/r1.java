package li;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.mj;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class r1 implements mj {
    public final /* synthetic */ di a;
    public final /* synthetic */ b2 b;

    public r1(b2 b2Var, di diVar) {
        this.b = b2Var;
        this.a = diVar;
    }

    @Override // org.telegram.ui.Components.mj
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.mj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        boolean isEmpty = arrayList.isEmpty();
        b2 b2Var = this.b;
        if (!isEmpty) {
            b2Var.P.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            t3 t3Var = b2Var.P;
            ij ijVar = (ij) arrayList3.get(0);
            t3Var.getClass();
            if (ijVar != null && ijVar.F0() != null) {
                TLRPC.Document F0 = ijVar.F0();
                TLRPC.Message message = ijVar.k;
                t3Var.g2(F0, message != null ? message.attachPath : null);
            }
        }
        this.a.a(true);
    }

    @Override // org.telegram.ui.Components.mj
    public final /* synthetic */ void S() {
    }

    @Override // org.telegram.ui.Components.mj
    public final /* synthetic */ void p(ArrayList arrayList, boolean z9, int i7, long j3) {
    }
}
