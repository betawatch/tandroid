package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ gj0(pj0 pj0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = pj0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pj0 pj0Var = this.b;
                NotificationCenter.getInstance(pj0Var.b).doOnIdle(new gj0(pj0Var, this.c, 1));
                break;
            default:
                pj0.a(this.b, this.c);
                break;
        }
    }
}
