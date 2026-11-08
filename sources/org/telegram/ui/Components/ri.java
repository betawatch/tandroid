package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri implements dj0, wi {
    public final /* synthetic */ fj a;

    public /* synthetic */ ri(fj fjVar) {
        this.a = fjVar;
    }

    @Override // org.telegram.ui.Components.wi
    public void a(TLRPC.User user, boolean z9, int i7, long j3) {
        fj fjVar = this.a;
        fjVar.b.a(true);
        fjVar.J.a(user, z9, i7, j3);
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        Object O;
        fj fjVar = this.a;
        v4.g0 adapter = fjVar.s.getAdapter();
        bj bjVar = fjVar.F;
        if (adapter == bjVar) {
            O = bjVar.E(i7);
        } else {
            zi ziVar = fjVar.E;
            O = ziVar.O(ziVar.S(i7), ziVar.Q(i7));
        }
        if (O == null) {
            return false;
        }
        fjVar.P((ej) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.wi
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z9, int i7, long j3, boolean z10) {
    }
}
