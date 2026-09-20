package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
