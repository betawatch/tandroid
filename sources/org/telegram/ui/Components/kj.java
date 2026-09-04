package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj implements bl0, pj {
    public final /* synthetic */ yj a;

    public /* synthetic */ kj(yj yjVar) {
        this.a = yjVar;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        Object O;
        yj yjVar = this.a;
        s4.h0 adapter = yjVar.s.getAdapter();
        uj ujVar = yjVar.F;
        if (adapter == ujVar) {
            O = ujVar.E(i10);
        } else {
            sj sjVar = yjVar.E;
            O = sjVar.O(sjVar.S(i10), sjVar.Q(i10));
        }
        if (O == null) {
            return false;
        }
        yjVar.L((xj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.pj
    public void b(TLRPC.User user, boolean z10, int i10, long j3) {
        yj yjVar = this.a;
        yjVar.b.dismiss(true);
        yjVar.J.b(user, z10, i10, j3);
    }

    @Override // org.telegram.ui.Components.pj
    public /* synthetic */ void c(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
