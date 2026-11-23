package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ef implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ff b;

    public /* synthetic */ ef(ff ffVar, int i7) {
        this.a = i7;
        this.b = ffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ff ffVar = this.b;
                ffVar.d();
                g0.g3(new ef(ffVar, 1));
                break;
            default:
                ff ffVar2 = this.b;
                ffVar2.X = false;
                ArrayList arrayList = ffVar2.Y;
                ffVar2.Y = null;
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
