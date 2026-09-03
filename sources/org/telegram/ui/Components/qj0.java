package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
