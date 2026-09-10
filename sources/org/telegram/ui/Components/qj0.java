package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class qj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zj0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ qj0(zj0 zj0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = zj0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zj0 zj0Var = this.b;
                NotificationCenter.getInstance(zj0Var.b).doOnIdle(new qj0(zj0Var, this.c, 1));
                break;
            default:
                zj0.a(this.b, this.c);
                break;
        }
    }
}
