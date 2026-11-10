package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.video.a b;
    public final /* synthetic */ org.telegram.ui.Components.gc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ di.i0 e;

    public /* synthetic */ jy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.gc gcVar, Context context, di.i0 i0Var, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = gcVar;
        this.d = context;
        this.e = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        di.i0 i0Var = this.e;
        Context context = this.d;
        org.telegram.ui.Components.gc gcVar = this.c;
        org.telegram.messenger.video.a aVar = this.b;
        int i10 = 2;
        switch (i7) {
            case 0:
                aVar.run();
                gcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new eu(context, i10), i0Var)).j();
                break;
            case 1:
                aVar.run();
                gcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new eu(context, 5), i0Var)).j();
                break;
            default:
                aVar.run();
                gcVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new eu(context, 6), i0Var)).j();
                break;
        }
    }
}
