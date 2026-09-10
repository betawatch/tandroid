package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class nj implements ll0, sj {
    public final /* synthetic */ bk a;

    public /* synthetic */ nj(bk bkVar) {
        this.a = bkVar;
    }

    @Override // org.telegram.ui.Components.sj
    public void a(TLRPC.User user, boolean z10, int i10, long j3) {
        bk bkVar = this.a;
        bkVar.b.dismiss(true);
        bkVar.J.a(user, z10, i10, j3);
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        Object O;
        bk bkVar = this.a;
        s4.h0 adapter = bkVar.s.getAdapter();
        xj xjVar = bkVar.F;
        if (adapter == xjVar) {
            O = xjVar.E(i10);
        } else {
            vj vjVar = bkVar.E;
            O = vjVar.O(vjVar.S(i10), vjVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        bkVar.L((ak) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.sj
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
