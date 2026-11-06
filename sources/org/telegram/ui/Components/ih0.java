package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rh0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ ih0(rh0 rh0Var, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = rh0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rh0 rh0Var = this.b;
                org.telegram.messenger.qs.f(rh0Var.b).d(new ih0(rh0Var, this.c, 1));
                break;
            default:
                rh0.a(this.b, this.c);
                break;
        }
    }
}
