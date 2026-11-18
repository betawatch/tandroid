package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj implements qj0, kj {
    public final /* synthetic */ tj a;

    public /* synthetic */ gj(tj tjVar) {
        this.a = tjVar;
    }

    @Override // org.telegram.ui.Components.kj
    public void a(TLRPC.User user, boolean z10, int i7, long j3) {
        tj tjVar = this.a;
        tjVar.b.a(true);
        tjVar.K.a(user, z10, i7, j3);
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        Object O;
        tj tjVar = this.a;
        v4.i0 adapter = tjVar.s.getAdapter();
        pj pjVar = tjVar.G;
        if (adapter == pjVar) {
            O = pjVar.E(i7);
        } else {
            nj njVar = tjVar.F;
            O = njVar.O(njVar.S(i7), njVar.Q(i7));
        }
        if (O == null) {
            return false;
        }
        tjVar.Q((sj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.kj
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
    }
}
