package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
