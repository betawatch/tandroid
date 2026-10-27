package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bt b;

    public /* synthetic */ at(bt btVar, int i10) {
        this.a = i10;
        this.b = btVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bt btVar = this.b;
                btVar.c = false;
                btVar.b.run();
                ArrayList arrayList = btVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - btVar.f > 3600000) {
                    arrayList.clear();
                    btVar.e = false;
                    btVar.g = null;
                    btVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
