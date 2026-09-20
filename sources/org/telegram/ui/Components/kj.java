package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj implements ll0, pj {
    public final /* synthetic */ yj a;

    public /* synthetic */ kj(yj yjVar) {
        this.a = yjVar;
    }

    @Override // org.telegram.ui.Components.pj
    public void a(TLRPC.User user, boolean z10, int i10, long j3) {
        yj yjVar = this.a;
        yjVar.b.dismiss(true);
        yjVar.J.a(user, z10, i10, j3);
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
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
    public /* synthetic */ void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
    }
}
