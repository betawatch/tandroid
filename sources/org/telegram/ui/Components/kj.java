package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj implements ml0, pj {
    public final /* synthetic */ yj a;

    public /* synthetic */ kj(yj yjVar) {
        this.a = yjVar;
    }

    @Override // org.telegram.ui.Components.pj
    public void a(TLRPC.User user, boolean z10, int i10, long j3) {
        yj yjVar = this.a;
        yjVar.b.dismiss(true);
        yjVar.J.a(user, z10, i10, j3);
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        Object O;
        yj yjVar = this.a;
        s4.h0 adapter = yjVar.s.getAdapter();
        uj ujVar = yjVar.F;
        if (adapter == ujVar) {
            O = ujVar.E(i10);
        } else {
            sj sjVar = yjVar.E;
            O = sjVar.O(sjVar.S(i10), sjVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        yjVar.L((xj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.pj
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
