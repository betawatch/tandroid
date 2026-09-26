package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lj implements ml0, qj {
    public final /* synthetic */ zj a;

    public /* synthetic */ lj(zj zjVar) {
        this.a = zjVar;
    }

    @Override // org.telegram.ui.Components.qj
    public void a(TLRPC.User user, boolean z10, int i10, long j3) {
        zj zjVar = this.a;
        zjVar.b.dismiss(true);
        zjVar.J.a(user, z10, i10, j3);
    }

    @Override // org.telegram.ui.Components.ml0
    public boolean d(int i10, View view) {
        Object O;
        zj zjVar = this.a;
        s4.h0 adapter = zjVar.s.getAdapter();
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
        zjVar.L((yj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.qj
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
