package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ij implements sj0, mj {
    public final /* synthetic */ vj a;

    public /* synthetic */ ij(vj vjVar) {
        this.a = vjVar;
    }

    @Override // org.telegram.ui.Components.mj
    public void a(TLRPC.User user, boolean z10, int i7, long j3) {
        vj vjVar = this.a;
        vjVar.b.a(true);
        vjVar.K.a(user, z10, i7, j3);
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        Object O;
        vj vjVar = this.a;
        v4.i0 adapter = vjVar.s.getAdapter();
        rj rjVar = vjVar.G;
        if (adapter == rjVar) {
            O = rjVar.E(i7);
        } else {
            pj pjVar = vjVar.F;
            O = pjVar.O(pjVar.S(i7), pjVar.Q(i7));
        }
        if (O == null) {
            return false;
        }
        vjVar.Q((uj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.mj
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
    }
}
