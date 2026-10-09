package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt b;

    public /* synthetic */ ft(gt gtVar, int i10) {
        this.a = i10;
        this.b = gtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gt gtVar = this.b;
                gtVar.c = false;
                gtVar.b.run();
                ArrayList arrayList = gtVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - gtVar.f > 3600000) {
                    arrayList.clear();
                    gtVar.e = false;
                    gtVar.g = null;
                    gtVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
