package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri implements hj0, vi {
    public final /* synthetic */ ej a;

    public /* synthetic */ ri(ej ejVar) {
        this.a = ejVar;
    }

    @Override // org.telegram.ui.Components.vi
    public void a(TLRPC.User user, boolean z10, int i3, long j10) {
        ej ejVar = this.a;
        ejVar.b.a(true);
        ejVar.K.a(user, z10, i3, j10);
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        Object O;
        ej ejVar = this.a;
        u4.h0 adapter = ejVar.s.getAdapter();
        aj ajVar = ejVar.G;
        if (adapter == ajVar) {
            O = ajVar.E(i3);
        } else {
            yi yiVar = ejVar.F;
            O = yiVar.O(yiVar.S(i3), yiVar.Q(i3));
        }
        if (O == null) {
            return false;
        }
        ejVar.P((dj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.vi
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i3, long j10, boolean z11) {
    }
}
