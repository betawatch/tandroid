package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hj implements sj0, lj {
    public final /* synthetic */ uj a;

    public /* synthetic */ hj(uj ujVar) {
        this.a = ujVar;
    }

    @Override // org.telegram.ui.Components.lj
    public void a(TLRPC.User user, boolean z10, int i7, long j3) {
        uj ujVar = this.a;
        ujVar.b.a(true);
        ujVar.K.a(user, z10, i7, j3);
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        Object O;
        uj ujVar = this.a;
        v4.i0 adapter = ujVar.s.getAdapter();
        qj qjVar = ujVar.G;
        if (adapter == qjVar) {
            O = qjVar.E(i7);
        } else {
            oj ojVar = ujVar.F;
            O = ojVar.O(ojVar.S(i7), ojVar.Q(i7));
        }
        if (O == null) {
            return false;
        }
        ujVar.Q((tj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.lj
    public /* synthetic */ void c(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
    }
}
