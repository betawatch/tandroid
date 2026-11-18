package oi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.si;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class p1 implements ak {
    public final /* synthetic */ si a;
    public final /* synthetic */ z1 b;

    public p1(z1 z1Var, si siVar) {
        this.b = z1Var;
        this.a = siVar;
    }

    @Override // org.telegram.ui.Components.ak
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Components.ak
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        boolean isEmpty = arrayList.isEmpty();
        z1 z1Var = this.b;
        if (!isEmpty) {
            z1Var.Q.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            s3 s3Var = z1Var.Q;
            fj fjVar = (fj) arrayList3.get(0);
            s3Var.getClass();
            if (fjVar != null && fjVar.F0() != null) {
                TLRPC.Document F0 = fjVar.F0();
                TLRPC.Message message = fjVar.k;
                s3Var.g2(F0, message != null ? message.attachPath : null);
            }
        }
        this.a.a(true);
    }

    @Override // org.telegram.ui.Components.ak
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.ak
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
