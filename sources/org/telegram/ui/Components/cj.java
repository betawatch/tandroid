package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cj implements kl0, ij {
    public final /* synthetic */ sj a;

    public /* synthetic */ cj(sj sjVar) {
        this.a = sjVar;
    }

    @Override // org.telegram.ui.Components.ij
    public void a(TLRPC.User user, boolean z4, int i10, long j10) {
        sj sjVar = this.a;
        sjVar.b.dismiss(true);
        sjVar.G.a(user, z4, i10, j10);
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        Object O;
        sj sjVar = this.a;
        f2.p0 adapter = sjVar.s.getAdapter();
        oj ojVar = sjVar.C;
        if (adapter == ojVar) {
            O = ojVar.E(i10);
        } else {
            lj ljVar = sjVar.B;
            O = ljVar.O(ljVar.S(i10), ljVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        sjVar.K((rj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.ij
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z4, int i10, long j10, boolean z10) {
    }
}
