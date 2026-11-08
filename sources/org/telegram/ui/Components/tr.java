package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
