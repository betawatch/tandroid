package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class ps implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qs b;

    public /* synthetic */ ps(qs qsVar, int i10) {
        this.a = i10;
        this.b = qsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qs qsVar = this.b;
                qsVar.c = false;
                qsVar.b.run();
                ArrayList arrayList = qsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - qsVar.f > 3600000) {
                    arrayList.clear();
                    qsVar.e = false;
                    qsVar.g = null;
                    qsVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
