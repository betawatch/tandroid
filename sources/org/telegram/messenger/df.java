package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
