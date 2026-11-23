package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        switch (this.a) {
            case 0:
                bn bnVar = this.b;
                org.telegram.messenger.gj gjVar3 = bnVar.v5;
                if (gjVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(gjVar3.T0)) {
                    new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.Ba).k(false).j();
                }
                return true;
            case 1:
                return bn.H0(this.b);
            default:
                bn bnVar2 = this.b;
                int i7 = bnVar2.Sb;
                if (i7 == 1 && (gjVar2 = bnVar2.H5) != null) {
                    bnVar2.l(gjVar2.e1(), 0, true, 0, true, 0);
                    return true;
                }
                if (bnVar2.x5 == null || i7 != 2 || (gjVar = bnVar2.F5) == null) {
                    return false;
                }
                bnVar2.l(gjVar.e1(), 0, true, 0, true, 0);
                return true;
        }
    }
}
