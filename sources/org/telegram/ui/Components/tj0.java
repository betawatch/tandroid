package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ck0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ tj0(ck0 ck0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = ck0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ck0 ck0Var = this.b;
                NotificationCenter.getInstance(ck0Var.b).doOnIdle(new tj0(ck0Var, this.c, 1));
                break;
            default:
                ck0.a(this.b, this.c);
                break;
        }
    }
}
