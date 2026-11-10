package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qi implements dj0, vi {
    public final /* synthetic */ ej a;

    public /* synthetic */ qi(ej ejVar) {
        this.a = ejVar;
    }

    @Override // org.telegram.ui.Components.vi
    public void a(TLRPC.User user, boolean z9, int i7, long j3) {
        ej ejVar = this.a;
        ejVar.b.a(true);
        ejVar.J.a(user, z9, i7, j3);
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        Object O;
        ej ejVar = this.a;
        v4.g0 adapter = ejVar.s.getAdapter();
        aj ajVar = ejVar.F;
        if (adapter == ajVar) {
            O = ajVar.E(i7);
        } else {
            yi yiVar = ejVar.E;
            O = yiVar.O(yiVar.S(i7), yiVar.Q(i7));
        }
        if (O == null) {
            return false;
        }
        ejVar.P((dj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.vi
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z9, int i7, long j3, boolean z10) {
    }
}
