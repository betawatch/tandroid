package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class zi implements ij0, dj {
    public final /* synthetic */ mj a;

    public /* synthetic */ zi(mj mjVar) {
        this.a = mjVar;
    }

    @Override // org.telegram.ui.Components.dj
    public void a(TLRPC.User user, boolean z10, int i7, long j3) {
        mj mjVar = this.a;
        mjVar.b.a(true);
        mjVar.K.a(user, z10, i7, j3);
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        Object O;
        mj mjVar = this.a;
        v4.h0 adapter = mjVar.s.getAdapter();
        ij ijVar = mjVar.G;
        if (adapter == ijVar) {
            O = ijVar.E(i7);
        } else {
            gj gjVar = mjVar.F;
            O = gjVar.O(gjVar.S(i7), gjVar.Q(i7));
        }
        if (O == null) {
            return false;
        }
        mjVar.Q((lj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.dj
    public /* synthetic */ void c(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
    }
}
