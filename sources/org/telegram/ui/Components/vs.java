package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws b;

    public /* synthetic */ vs(ws wsVar, int i10) {
        this.a = i10;
        this.b = wsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ws wsVar = this.b;
                wsVar.c = false;
                wsVar.b.run();
                ArrayList arrayList = wsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - wsVar.f > 3600000) {
                    arrayList.clear();
                    wsVar.e = false;
                    wsVar.g = null;
                    wsVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
