package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri implements jk0, vi {
    public final /* synthetic */ ej a;

    public /* synthetic */ ri(ej ejVar) {
        this.a = ejVar;
    }

    @Override // org.telegram.ui.Components.vi
    public void a(TLRPC.User user, boolean z10, int i10, long j10) {
        ej ejVar = this.a;
        ejVar.b.a(true);
        ejVar.J.a(user, z10, i10, j10);
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        Object O;
        ej ejVar = this.a;
        s4.g0 adapter = ejVar.s.getAdapter();
        aj ajVar = ejVar.F;
        if (adapter == ajVar) {
            O = ajVar.E(i10);
        } else {
            yi yiVar = ejVar.E;
            O = yiVar.O(yiVar.S(i10), yiVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        ejVar.O((dj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.vi
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
