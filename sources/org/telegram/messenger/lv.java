package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class lv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nv b;

    public /* synthetic */ lv(nv nvVar, int i3) {
        this.a = i3;
        this.b = nvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(false);
                break;
            case 1:
                this.b.o = false;
                break;
            case 2:
                nv nvVar = this.b;
                nvVar.o = false;
                nvVar.l = false;
                break;
            case 3:
                this.b.l();
                break;
            default:
                nv nvVar2 = this.b;
                if (!nvVar2.o) {
                    nvVar2.o = true;
                    ArrayList arrayList = new ArrayList(nvVar2.j);
                    qr a02 = qr.a0(nvVar2.a);
                    a02.a.c(new dg(nvVar2, a02, arrayList, 24));
                    break;
                }
                break;
        }
    }
}
