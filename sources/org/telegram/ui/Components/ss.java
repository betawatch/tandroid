package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ss implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts b;

    public /* synthetic */ ss(ts tsVar, int i10) {
        this.a = i10;
        this.b = tsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ts tsVar = this.b;
                tsVar.c = false;
                tsVar.b.run();
                ArrayList arrayList = tsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - tsVar.f > 3600000) {
                    arrayList.clear();
                    tsVar.e = false;
                    tsVar.g = null;
                    tsVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
