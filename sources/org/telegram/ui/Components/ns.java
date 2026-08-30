package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ns implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ os b;

    public /* synthetic */ ns(os osVar, int i10) {
        this.a = i10;
        this.b = osVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                os osVar = this.b;
                osVar.c = false;
                osVar.b.run();
                ArrayList arrayList = osVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - osVar.f > 3600000) {
                    arrayList.clear();
                    osVar.e = false;
                    osVar.g = null;
                    osVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
