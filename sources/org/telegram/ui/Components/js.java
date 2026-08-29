package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class js implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ks b;

    public /* synthetic */ js(ks ksVar, int i10) {
        this.a = i10;
        this.b = ksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ks ksVar = this.b;
                ksVar.c = false;
                ksVar.b.run();
                ArrayList arrayList = ksVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - ksVar.f > 3600000) {
                    arrayList.clear();
                    ksVar.e = false;
                    ksVar.g = null;
                    ksVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
