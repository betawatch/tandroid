package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
