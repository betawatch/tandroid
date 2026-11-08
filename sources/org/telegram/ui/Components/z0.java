package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 d;

    public /* synthetic */ z0(u4 u4Var, org.telegram.ui.ActionBar.u1 u1Var, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.a = i7;
        this.b = u4Var;
        this.c = u1Var;
        this.d = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new z0(this.b, this.c, this.d, 1));
                break;
            default:
                v4.b0(this.b, this.c, this.d);
                break;
        }
    }
}
