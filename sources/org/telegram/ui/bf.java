package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ bf(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        org.telegram.messenger.gj gjVar;
        org.telegram.messenger.gj gjVar2;
        switch (this.a) {
            case 0:
                an anVar = this.b;
                org.telegram.messenger.gj gjVar3 = anVar.u5;
                if (gjVar3 == null) {
                    return false;
                }
                if (org.telegram.messenger.g0.g(gjVar3.T0)) {
                    new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(anVar.getParentActivity()), anVar.Aa).k(false).j();
                }
                return true;
            case 1:
                return an.H0(this.b);
            default:
                an anVar2 = this.b;
                int i7 = anVar2.Rb;
                if (i7 == 1 && (gjVar2 = anVar2.G5) != null) {
                    anVar2.l(gjVar2.e1(), 0, true, 0, true, 0);
                    return true;
                }
                if (anVar2.w5 == null || i7 != 2 || (gjVar = anVar2.E5) == null) {
                    return false;
                }
                anVar2.l(gjVar.e1(), 0, true, 0, true, 0);
                return true;
        }
    }
}
