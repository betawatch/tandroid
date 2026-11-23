package org.telegram.ui.ActionBar;

import org.telegram.messenger.ls;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class k6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ k6(l6 l6Var, int i7) {
        this.a = i7;
        this.b = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        l6 l6Var = this.b;
        switch (i7) {
            case 0:
                l6Var.s();
                break;
            default:
                ls.e().k(ls.w4, l6Var, Boolean.TRUE, null, -1);
                break;
        }
    }
}
