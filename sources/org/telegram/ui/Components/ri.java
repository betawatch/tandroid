package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri implements ik0, vi {
    public final /* synthetic */ ej a;

    public /* synthetic */ ri(ej ejVar) {
        this.a = ejVar;
    }

    @Override // org.telegram.ui.Components.vi
    public void a(TLRPC.User user, boolean z10, int i10, long j10) {
        ej ejVar = this.a;
        ejVar.b.a(true);
        ejVar.J.a(user, z10, i10, j10);
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        Object O;
        ej ejVar = this.a;
        s4.g0 adapter = ejVar.s.getAdapter();
        aj ajVar = ejVar.F;
        if (adapter == ajVar) {
            O = ajVar.E(i10);
        } else {
            yi yiVar = ejVar.E;
            O = yiVar.O(yiVar.S(i10), yiVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        ejVar.O((dj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.vi
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
