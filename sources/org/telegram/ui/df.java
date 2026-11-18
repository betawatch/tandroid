package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ df(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.messenger.fj fjVar;
        org.telegram.messenger.fj fjVar2;
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                org.telegram.messenger.fj fjVar3 = bnVar.v5;
                if (fjVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(fjVar3.T0)) {
                    new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.Ba).k(false).j();
                }
                return true;
            case 1:
                return bn.H0(this.b);
            default:
                bn bnVar2 = this.b;
                int i7 = bnVar2.Sb;
                if (i7 == 1 && (fjVar2 = bnVar2.H5) != null) {
                    bnVar2.l(fjVar2.e1(), 0, true, 0, true, 0);
                    return true;
                }
                if (bnVar2.x5 == null || i7 != 2 || (fjVar = bnVar2.F5) == null) {
                    return false;
                }
                bnVar2.l(fjVar.e1(), 0, true, 0, true, 0);
                return true;
        }
    }
}
