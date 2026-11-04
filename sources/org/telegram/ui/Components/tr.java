package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;

    public /* synthetic */ tr(ur urVar, int i3) {
        this.a = i3;
        this.b = urVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ur urVar = this.b;
                urVar.c = false;
                urVar.b.run();
                ArrayList arrayList = urVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - urVar.f > 3600000) {
                    arrayList.clear();
                    urVar.e = false;
                    urVar.g = null;
                    urVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
