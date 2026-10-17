package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs b;

    public /* synthetic */ ys(zs zsVar, int i10) {
        this.a = i10;
        this.b = zsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zs zsVar = this.b;
                zsVar.c = false;
                zsVar.b.run();
                ArrayList arrayList = zsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - zsVar.f > 3600000) {
                    arrayList.clear();
                    zsVar.e = false;
                    zsVar.g = null;
                    zsVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
