package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mj implements ol0, rj {
    public final /* synthetic */ ak a;

    public /* synthetic */ mj(ak akVar) {
        this.a = akVar;
    }

    @Override // org.telegram.ui.Components.rj
    public void a(TLRPC.User user, boolean z10, int i10, long j3) {
        ak akVar = this.a;
        akVar.b.dismiss(true);
        akVar.J.a(user, z10, i10, j3);
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        Object O;
        ak akVar = this.a;
        s4.h0 adapter = akVar.s.getAdapter();
        wj wjVar = akVar.F;
        if (adapter == wjVar) {
            O = wjVar.E(i10);
        } else {
            uj ujVar = akVar.E;
            O = ujVar.O(ujVar.S(i10), ujVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        akVar.L((zj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.rj
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
