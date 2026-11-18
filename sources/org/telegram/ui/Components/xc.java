package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xc(yc ycVar, boolean z10, int i7) {
        this.a = i7;
        this.b = ycVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                yc ycVar = this.b;
                if (!z10) {
                    ycVar.Z0.setVisibility(8);
                    break;
                } else {
                    ycVar.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                yc ycVar2 = this.b;
                if (!z11) {
                    ycVar2.V0.setVisibility(8);
                    break;
                } else {
                    ycVar2.getClass();
                    break;
                }
        }
    }
}
