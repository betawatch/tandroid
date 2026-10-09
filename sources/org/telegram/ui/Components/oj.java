package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oj implements gm0, tj {
    public final /* synthetic */ ck a;

    public /* synthetic */ oj(ck ckVar) {
        this.a = ckVar;
    }

    @Override // org.telegram.ui.Components.tj
    public void a(TLRPC.User user, boolean z10, int i10, long j3) {
        ck ckVar = this.a;
        ckVar.b.dismiss(true);
        ckVar.J.a(user, z10, i10, j3);
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        Object O;
        ck ckVar = this.a;
        s4.i0 adapter = ckVar.s.getAdapter();
        yj yjVar = ckVar.F;
        if (adapter == yjVar) {
            O = yjVar.E(i10);
        } else {
            wj wjVar = ckVar.E;
            O = wjVar.O(wjVar.S(i10), wjVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        ckVar.O((bk) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.tj
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
