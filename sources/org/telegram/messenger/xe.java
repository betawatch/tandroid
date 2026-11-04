package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ye b;

    public /* synthetic */ xe(ye yeVar, int i3) {
        this.a = i3;
        this.b = yeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ye yeVar = this.b;
                yeVar.d();
                g0.h3(new xe(yeVar, 1));
                break;
            default:
                ye yeVar2 = this.b;
                yeVar2.X = false;
                ArrayList arrayList = yeVar2.Y;
                yeVar2.Y = null;
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        ((Runnable) arrayList.get(i3)).run();
                    }
                    break;
                }
                break;
        }
    }
}
