package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class fw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hw b;

    public /* synthetic */ fw(hw hwVar, int i10) {
        this.a = i10;
        this.b = hwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(false);
                break;
            case 1:
                this.b.o = false;
                break;
            case 2:
                hw hwVar = this.b;
                hwVar.o = false;
                hwVar.l = false;
                break;
            case 3:
                this.b.l();
                break;
            default:
                hw hwVar2 = this.b;
                if (!hwVar2.o) {
                    hwVar2.o = true;
                    ArrayList arrayList = new ArrayList(hwVar2.j);
                    is a02 = is.a0(hwVar2.a);
                    a02.a.c(new lg(hwVar2, a02, arrayList, 24));
                    break;
                }
                break;
        }
    }
}
