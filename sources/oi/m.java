package oi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.tj;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class m implements tj {
    public final /* synthetic */ ki a;
    public final /* synthetic */ o b;

    public m(o oVar, ki kiVar) {
        this.b = oVar;
        this.a = kiVar;
    }

    @Override // org.telegram.ui.Components.tj
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.b.a2.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.tj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        q3 q3Var = this.b.r;
        if (!arrayList.isEmpty()) {
            q3Var.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            gj gjVar = (gj) arrayList3.get(0);
            q3Var.getClass();
            if (gjVar != null && gjVar.F0() != null) {
                TLRPC.Document F0 = gjVar.F0();
                TLRPC.Message message = gjVar.k;
                q3Var.g2(F0, message != null ? message.attachPath : null);
            }
        }
        this.a.a(true);
    }

    @Override // org.telegram.ui.Components.tj
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.tj
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
