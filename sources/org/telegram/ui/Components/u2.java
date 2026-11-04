package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ u2(int i3, int[] iArr, org.telegram.ui.ly lyVar) {
        this.b = i3;
        this.c = iArr;
        this.d = lyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Runnable runnable = this.d;
        int[] iArr = this.c;
        int i10 = this.b;
        switch (i3) {
            case 0:
                iArr[0] = i10;
                runnable.run();
                break;
            default:
                String str = LaunchActivity.E1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u2(int[] iArr, int i3, Runnable runnable) {
        this.c = iArr;
        this.b = i3;
        this.d = runnable;
    }
}
