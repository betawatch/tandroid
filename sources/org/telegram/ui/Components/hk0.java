package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class hk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ hk0(qk0 qk0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = qk0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qk0 qk0Var = this.b;
                NotificationCenter.getInstance(qk0Var.b).doOnIdle(new hk0(qk0Var, this.c, 1));
                break;
            default:
                qk0.a(this.b, this.c);
                break;
        }
    }
}
