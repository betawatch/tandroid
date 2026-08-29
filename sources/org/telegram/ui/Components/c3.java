package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ c3(int i10, int[] iArr, org.telegram.ui.x60 x60Var) {
        this.b = i10;
        this.c = iArr;
        this.d = x60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Runnable runnable = this.d;
        int[] iArr = this.c;
        int i11 = this.b;
        switch (i10) {
            case 0:
                iArr[0] = i11;
                runnable.run();
                break;
            default:
                Pattern pattern = LaunchActivity.x1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c3(int[] iArr, Runnable runnable, int i10) {
        this.c = iArr;
        this.b = i10;
        this.d = runnable;
    }
}
