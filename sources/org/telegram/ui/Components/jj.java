package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj implements yl0, oj {
    public final /* synthetic */ xj a;

    public /* synthetic */ jj(xj xjVar) {
        this.a = xjVar;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        Object O;
        xj xjVar = this.a;
        s4.g0 adapter = xjVar.s.getAdapter();
        tj tjVar = xjVar.F;
        if (adapter == tjVar) {
            O = tjVar.E(i10);
        } else {
            rj rjVar = xjVar.E;
            O = rjVar.O(rjVar.S(i10), rjVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        xjVar.O((wj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.oj
    public void b(TLRPC.User user, boolean z10, int i10, long j10) {
        xj xjVar = this.a;
        xjVar.b.dismiss(true);
        xjVar.J.b(user, z10, i10, j10);
    }

    @Override // org.telegram.ui.Components.oj
    public /* synthetic */ void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
