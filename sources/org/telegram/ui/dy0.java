package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class dy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.video.a b;
    public final /* synthetic */ org.telegram.ui.Components.cc c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ fi.i0 e;

    public /* synthetic */ dy0(org.telegram.messenger.video.a aVar, org.telegram.ui.Components.cc ccVar, Context context, fi.i0 i0Var, int i7) {
        this.a = i7;
        this.b = aVar;
        this.c = ccVar;
        this.d = context;
        this.e = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        fi.i0 i0Var = this.e;
        Context context = this.d;
        org.telegram.ui.Components.cc ccVar = this.c;
        org.telegram.messenger.video.a aVar = this.b;
        int i10 = 2;
        switch (i7) {
            case 0:
                aVar.run();
                ccVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new du(context, i10), i0Var)).j();
                break;
            case 1:
                aVar.run();
                ccVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new du(context, 5), i0Var)).j();
                break;
            default:
                aVar.run();
                ccVar.c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new du(context, 6), i0Var)).j();
                break;
        }
    }
}
