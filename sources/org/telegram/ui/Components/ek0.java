package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nk0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ ek0(nk0 nk0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = nk0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nk0 nk0Var = this.b;
                NotificationCenter.getInstance(nk0Var.b).doOnIdle(new ek0(nk0Var, this.c, 1));
                break;
            default:
                nk0.a(this.b, this.c);
                break;
        }
    }
}
