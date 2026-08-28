package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ y2(int i9, int[] iArr, org.telegram.ui.x20 x20Var) {
        this.b = i9;
        this.c = iArr;
        this.d = x20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        Runnable runnable = this.d;
        int[] iArr = this.c;
        int i10 = this.b;
        switch (i9) {
            case 0:
                iArr[0] = i10;
                runnable.run();
                break;
            default:
                Pattern pattern = LaunchActivity.x1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ y2(int[] iArr, Runnable runnable, int i9) {
        this.c = iArr;
        this.b = i9;
        this.d = runnable;
    }
}
