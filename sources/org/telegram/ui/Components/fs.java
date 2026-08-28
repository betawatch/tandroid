package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gs b;

    public /* synthetic */ fs(gs gsVar, int i9) {
        this.a = i9;
        this.b = gsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gs gsVar = this.b;
                gsVar.c = false;
                gsVar.b.run();
                ArrayList arrayList = gsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - gsVar.f > 3600000) {
                    arrayList.clear();
                    gsVar.e = false;
                    gsVar.g = null;
                    gsVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
