package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
