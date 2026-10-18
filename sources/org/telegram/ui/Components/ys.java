package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs b;

    public /* synthetic */ ys(zs zsVar, int i10) {
        this.a = i10;
        this.b = zsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zs zsVar = this.b;
                zsVar.c = false;
                zsVar.b.run();
                ArrayList arrayList = zsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - zsVar.f > 3600000) {
                    arrayList.clear();
                    zsVar.e = false;
                    zsVar.g = null;
                    zsVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
