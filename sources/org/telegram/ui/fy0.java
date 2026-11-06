package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.video.a b;
    public final /* synthetic */ org.telegram.ui.Components.hc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ di.i0 e;

    public /* synthetic */ fy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.hc hcVar, Context context, di.i0 i0Var, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = hcVar;
        this.d = context;
        this.e = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        di.i0 i0Var = this.e;
        Context context = this.d;
        org.telegram.ui.Components.hc hcVar = this.c;
        org.telegram.messenger.video.a aVar = this.b;
        int i10 = 2;
        switch (i7) {
            case 0:
                aVar.run();
                hcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new bu(context, i10), i0Var)).j();
                break;
            case 1:
                aVar.run();
                hcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new bu(context, 5), i0Var)).j();
                break;
            default:
                aVar.run();
                hcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new bu(context, 6), i0Var)).j();
                break;
        }
    }
}
