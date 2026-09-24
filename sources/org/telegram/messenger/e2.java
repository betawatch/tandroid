package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ e2(Utilities.Callback callback, ArrayList arrayList, int i10) {
        this.a = i10;
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
