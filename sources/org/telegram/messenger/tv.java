package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class tv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vv b;

    public /* synthetic */ tv(vv vvVar, int i7) {
        this.a = i7;
        this.b = vvVar;
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
                vv vvVar = this.b;
                vvVar.o = false;
                vvVar.l = false;
                break;
            case 3:
                this.b.l();
                break;
            default:
                vv vvVar2 = this.b;
                if (!vvVar2.o) {
                    vvVar2.o = true;
                    ArrayList arrayList = new ArrayList(vvVar2.j);
                    yr a02 = yr.a0(vvVar2.a);
                    a02.a.c(new lg(vvVar2, a02, arrayList, 24));
                    break;
                }
                break;
        }
    }
}
