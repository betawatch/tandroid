package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class lj implements cm0, qj {
    public final /* synthetic */ zj a;

    public /* synthetic */ lj(zj zjVar) {
        this.a = zjVar;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        Object O;
        zj zjVar = this.a;
        s4.g0 adapter = zjVar.s.getAdapter();
        vj vjVar = zjVar.F;
        if (adapter == vjVar) {
            O = vjVar.E(i10);
        } else {
            tj tjVar = zjVar.E;
            O = tjVar.O(tjVar.S(i10), tjVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        zjVar.O((yj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.qj
    public void b(TLRPC.User user, boolean z10, int i10, long j10) {
        zj zjVar = this.a;
        zjVar.b.dismiss(true);
        zjVar.J.b(user, z10, i10, j10);
    }

    @Override // org.telegram.ui.Components.qj
    public /* synthetic */ void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
