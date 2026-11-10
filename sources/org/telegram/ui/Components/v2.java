package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ v2(int i7, int[] iArr, org.telegram.ui.f10 f10Var) {
        this.b = i7;
        this.c = iArr;
        this.d = f10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Runnable runnable = this.d;
        int[] iArr = this.c;
        int i10 = this.b;
        switch (i7) {
            case 0:
                iArr[0] = i10;
                runnable.run();
                break;
            default:
                String str = LaunchActivity.B1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v2(int[] iArr, int i7, Runnable runnable) {
        this.c = iArr;
        this.b = i7;
        this.d = runnable;
    }
}
