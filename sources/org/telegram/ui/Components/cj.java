package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cj implements bl0, ij {
    public final /* synthetic */ sj a;

    public /* synthetic */ cj(sj sjVar) {
        this.a = sjVar;
    }

    @Override // org.telegram.ui.Components.ij
    public void a(TLRPC.User user, boolean z10, int i10, long j10) {
        sj sjVar = this.a;
        sjVar.b.dismiss(true);
        sjVar.F.a(user, z10, i10, j10);
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        Object O;
        sj sjVar = this.a;
        f2.p0 adapter = sjVar.s.getAdapter();
        oj ojVar = sjVar.B;
        if (adapter == ojVar) {
            O = ojVar.E(i10);
        } else {
            lj ljVar = sjVar.A;
            O = ljVar.O(ljVar.S(i10), ljVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        sjVar.K((rj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.ij
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
    }
}
