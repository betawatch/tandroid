package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
