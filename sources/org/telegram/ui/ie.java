package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ org.telegram.ui.Components.nk0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ ie(wm wmVar, org.telegram.ui.Components.nk0 nk0Var, String str, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = nk0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.fc a02;
        int i3;
        int i10 = this.a;
        String str = this.d;
        org.telegram.ui.Components.nk0 nk0Var = this.c;
        wm wmVar = this.b;
        switch (i10) {
            case 0:
                nk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.fc.a0(wmVar);
                i3 = 2131746343;
                break;
            case 1:
                nk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.fc.a0(wmVar);
                i3 = 2131743211;
                break;
            case 2:
                nk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.fc.a0(wmVar);
                i3 = 2131752553;
                break;
            default:
                nk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                a02 = org.telegram.ui.Components.fc.a0(wmVar);
                i3 = 2131743675;
                break;
        }
        org.telegram.messenger.camera.q.r(null, i3, a02);
    }
}
