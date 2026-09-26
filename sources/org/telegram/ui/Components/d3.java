package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ d3(int i10, int[] iArr, org.telegram.ui.n80 n80Var) {
        this.b = i10;
        this.c = iArr;
        this.d = n80Var;
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
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d3(int[] iArr, Runnable runnable, int i10) {
        this.c = iArr;
        this.b = i10;
        this.d = runnable;
    }
}
