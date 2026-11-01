package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ni0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ ni0(wi0 wi0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = wi0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wi0 wi0Var = this.b;
                org.telegram.messenger.at.f(wi0Var.b).d(new ni0(wi0Var, this.c, 1));
                break;
            default:
                wi0.a(this.b, this.c);
                break;
        }
    }
}
