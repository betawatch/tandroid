package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ wc(xc xcVar, boolean z10, int i10) {
        this.a = i10;
        this.b = xcVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                xc xcVar = this.b;
                if (!z10) {
                    xcVar.V0.setVisibility(8);
                    break;
                } else {
                    xcVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                xc xcVar2 = this.b;
                if (!z11) {
                    xcVar2.R0.setVisibility(8);
                    break;
                } else {
                    xcVar2.getClass();
                    break;
                }
        }
    }
}
