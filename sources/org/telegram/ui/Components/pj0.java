package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yj0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ pj0(yj0 yj0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = yj0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yj0 yj0Var = this.b;
                NotificationCenter.getInstance(yj0Var.b).doOnIdle(new pj0(yj0Var, this.c, 1));
                break;
            default:
                yj0.a(this.b, this.c);
                break;
        }
    }
}
