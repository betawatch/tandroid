package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt b;

    public /* synthetic */ ct(dt dtVar, int i10) {
        this.a = i10;
        this.b = dtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dt dtVar = this.b;
                dtVar.c = false;
                dtVar.b.run();
                ArrayList arrayList = dtVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - dtVar.f > 3600000) {
                    arrayList.clear();
                    dtVar.e = false;
                    dtVar.g = null;
                    dtVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
