package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ df(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.messenger.ij ijVar;
        org.telegram.messenger.ij ijVar2;
        switch (this.a) {
            case 0:
                cn cnVar = this.b;
                org.telegram.messenger.ij ijVar3 = cnVar.t5;
                if (ijVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(ijVar3.R0)) {
                    new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(cnVar.getParentActivity()), cnVar.za).k(false).j();
                }
                return true;
            case 1:
                return cn.H0(this.b);
            default:
                cn cnVar2 = this.b;
                int i7 = cnVar2.Qb;
                if (i7 == 1 && (ijVar2 = cnVar2.F5) != null) {
                    cnVar2.l(ijVar2.e1(), 0, true, 0, true, 0);
                    return true;
                }
                if (cnVar2.v5 == null || i7 != 2 || (ijVar = cnVar2.D5) == null) {
                    return false;
                }
                cnVar2.l(ijVar.e1(), 0, true, 0, true, 0);
                return true;
        }
    }
}
