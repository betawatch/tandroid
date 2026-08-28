package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zi implements ok0, fj {
    public final /* synthetic */ pj a;

    public /* synthetic */ zi(pj pjVar) {
        this.a = pjVar;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        Object O;
        pj pjVar = this.a;
        f2.r0 adapter = pjVar.s.getAdapter();
        lj ljVar = pjVar.B;
        if (adapter == ljVar) {
            O = ljVar.E(i9);
        } else {
            ij ijVar = pjVar.A;
            O = ijVar.O(ijVar.S(i9), ijVar.Q(i9));
        }
        if (O == null) {
            return false;
        }
        pjVar.K((oj) view, O);
        return true;
    }

    @Override // org.telegram.ui.Components.fj
    public void b(TLRPC.User user, boolean z10, int i9, long j10) {
        pj pjVar = this.a;
        pjVar.b.dismiss(true);
        pjVar.F.b(user, z10, i9, j10);
    }

    @Override // org.telegram.ui.Components.fj
    public /* synthetic */ void c(ArrayList arrayList, String str, boolean z10, int i9, long j10, boolean z11) {
    }
}
