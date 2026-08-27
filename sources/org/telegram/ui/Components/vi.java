package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi implements rk0, bj {
    public final /* synthetic */ lj a;

    public /* synthetic */ vi(lj ljVar) {
        this.a = ljVar;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        Object O;
        lj ljVar = this.a;
        f2.q0 adapter = ljVar.s.getAdapter();
        hj hjVar = ljVar.B;
        if (adapter == hjVar) {
            O = hjVar.E(i10);
        } else {
            ej ejVar = ljVar.A;
            O = ejVar.O(ejVar.S(i10), ejVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        ljVar.L((kj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.bj
    public void b(TLRPC.User user, boolean z10, int i10, long j10) {
        lj ljVar = this.a;
        ljVar.b.dismiss(true);
        ljVar.F.b(user, z10, i10, j10);
    }

    @Override // org.telegram.ui.Components.bj
    public /* synthetic */ void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
