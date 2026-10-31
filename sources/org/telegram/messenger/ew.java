package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gw b;

    public /* synthetic */ ew(gw gwVar, int i10) {
        this.a = i10;
        this.b = gwVar;
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
                gw gwVar = this.b;
                gwVar.o = false;
                gwVar.l = false;
                break;
            case 3:
                this.b.l();
                break;
            default:
                gw gwVar2 = this.b;
                if (!gwVar2.o) {
                    gwVar2.o = true;
                    ArrayList arrayList = new ArrayList(gwVar2.j);
                    hs a02 = hs.a0(gwVar2.a);
                    a02.a.c(new kg(gwVar2, a02, arrayList, 24));
                    break;
                }
                break;
        }
    }
}
