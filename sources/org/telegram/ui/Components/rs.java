package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ss b;

    public /* synthetic */ rs(ss ssVar, int i10) {
        this.a = i10;
        this.b = ssVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ss ssVar = this.b;
                ssVar.c = false;
                ssVar.b.run();
                ArrayList arrayList = ssVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - ssVar.f > 3600000) {
                    arrayList.clear();
                    ssVar.e = false;
                    ssVar.g = null;
                    ssVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
