package org.telegram.ui.ActionBar;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6 b;

    public /* synthetic */ l6(m6 m6Var, int i7) {
        this.a = i7;
        this.b = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        m6 m6Var = this.b;
        switch (i7) {
            case 0:
                m6Var.s();
                break;
            default:
                ks.e().k(ks.w4, m6Var, Boolean.TRUE, null, -1);
                break;
        }
    }
}
