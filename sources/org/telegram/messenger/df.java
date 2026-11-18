package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class df implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ef b;

    public /* synthetic */ df(ef efVar, int i7) {
        this.a = i7;
        this.b = efVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ef efVar = this.b;
                efVar.d();
                g0.g3(new df(efVar, 1));
                break;
            default:
                ef efVar2 = this.b;
                efVar2.X = false;
                ArrayList arrayList = efVar2.Y;
                efVar2.Y = null;
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
