package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class es implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;

    public /* synthetic */ es(fs fsVar, int i10) {
        this.a = i10;
        this.b = fsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fs fsVar = this.b;
                fsVar.c = false;
                fsVar.b.run();
                ArrayList arrayList = fsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - fsVar.f > 3600000) {
                    arrayList.clear();
                    fsVar.e = false;
                    fsVar.g = null;
                    fsVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
