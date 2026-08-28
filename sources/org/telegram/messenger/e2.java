package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ e2(Utilities.Callback callback, ArrayList arrayList, int i9) {
        this.a = i9;
        this.b = callback;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run(this.c);
                break;
            case 1:
                this.b.run(this.c);
                break;
            case 2:
                MediaDataController.lambda$loadStickers$92(this.b, this.c);
                break;
            default:
                this.b.run(this.c);
                break;
        }
    }
}
