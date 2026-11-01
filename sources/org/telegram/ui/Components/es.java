package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class es implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs b;

    public /* synthetic */ es(fs fsVar, int i10) {
        this.a = i10;
        this.b = fsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fs fsVar = this.b;
                fsVar.c = false;
                fsVar.b.run();
                ArrayList arrayList = fsVar.h;
                if (arrayList.isEmpty() || System.currentTimeMillis() - fsVar.f > 3600000) {
                    arrayList.clear();
                    fsVar.e = false;
                    fsVar.g = null;
                    fsVar.a();
                    break;
                }
                break;
            default:
                this.b.i = false;
                break;
        }
    }
}
