package org.telegram.ui.Components.voip;

import di.n4;
import org.telegram.ui.Components.qh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;
    public final /* synthetic */ qh0 c;

    public /* synthetic */ e1(n4 n4Var, qh0 qh0Var, int i7) {
        this.a = i7;
        this.b = n4Var;
        this.c = qh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new e1(this.b, this.c, 1));
                break;
            default:
                this.b.removeView(this.c);
                break;
        }
    }
}
