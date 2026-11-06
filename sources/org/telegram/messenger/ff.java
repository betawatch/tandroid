package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class ff implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gf b;

    public /* synthetic */ ff(gf gfVar, int i7) {
        this.a = i7;
        this.b = gfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gf gfVar = this.b;
                gfVar.d();
                g0.h3(new ff(gfVar, 1));
                break;
            default:
                gf gfVar2 = this.b;
                gfVar2.X = false;
                ArrayList arrayList = gfVar2.Y;
                gfVar2.Y = null;
                if (arrayList != null) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((Runnable) arrayList.get(i7)).run();
                    }
                    break;
                }
                break;
        }
    }
}
