package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aj implements kl0, gj {
    public final /* synthetic */ qj a;

    public /* synthetic */ aj(qj qjVar) {
        this.a = qjVar;
    }

    @Override // org.telegram.ui.Components.gj
    public void a(TLRPC.User user, boolean z4, int i10, long j10) {
        qj qjVar = this.a;
        qjVar.b.dismiss(true);
        qjVar.G.a(user, z4, i10, j10);
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        Object O;
        qj qjVar = this.a;
        f2.o0 adapter = qjVar.s.getAdapter();
        mj mjVar = qjVar.C;
        if (adapter == mjVar) {
            O = mjVar.E(i10);
        } else {
            jj jjVar = qjVar.B;
            O = jjVar.O(jjVar.S(i10), jjVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        qjVar.K((pj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.gj
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z4, int i10, long j10, boolean z10) {
    }
}
