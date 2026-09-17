package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ d2(Utilities.Callback callback, ArrayList arrayList, int i10) {
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
