package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ej b;

    public /* synthetic */ cj(ej ejVar, int i7) {
        this.a = i7;
        this.b = ejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ej ejVar = this.b;
                if (ejVar.f != null) {
                    ejVar.w = org.telegram.messenger.k5.i(new StringBuilder("+"), ejVar.f.phone, pf.b.c());
                    ejVar.s = ejVar.f;
                    org.telegram.messenger.g0.h3(new cj(ejVar, 1));
                    break;
                }
                break;
            default:
                ej ejVar2 = this.b;
                ejVar2.c.l(ejVar2.w, false);
                break;
        }
    }
}
