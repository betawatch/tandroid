package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur b;

    public /* synthetic */ tr(ur urVar, int i7) {
        this.a = i7;
        this.b = urVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ur urVar = this.b;
                urVar.c = false;
                urVar.b.run();
                ArrayList arrayList = urVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - urVar.f > 3600000) {
                    arrayList.clear();
                    urVar.e = false;
                    urVar.g = null;
                    urVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
