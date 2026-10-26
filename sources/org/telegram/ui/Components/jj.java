package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj implements bm0, oj {
    public final /* synthetic */ xj a;

    public /* synthetic */ jj(xj xjVar) {
        this.a = xjVar;
    }

    @Override // org.telegram.ui.Components.oj
    public void a(TLRPC.User user, boolean z10, int i10, long j10) {
        xj xjVar = this.a;
        xjVar.b.dismiss(true);
        xjVar.J.a(user, z10, i10, j10);
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        Object O;
        xj xjVar = this.a;
        s4.h0 adapter = xjVar.s.getAdapter();
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
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
