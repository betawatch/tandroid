package org.telegram.ui.ActionBar;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k6 b;

    public /* synthetic */ j6(k6 k6Var, int i7) {
        this.a = i7;
        this.b = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        k6 k6Var = this.b;
        switch (i7) {
            case 0:
                k6Var.s();
                break;
            default:
                qs.e().k(qs.t4, k6Var, Boolean.TRUE, null, -1);
                break;
        }
    }
}
