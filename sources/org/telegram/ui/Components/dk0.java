package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mk0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ dk0(mk0 mk0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = mk0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mk0 mk0Var = this.b;
                NotificationCenter.getInstance(mk0Var.b).doOnIdle(new dk0(mk0Var, this.c, 1));
                break;
            default:
                mk0.a(this.b, this.c);
                break;
        }
    }
}
