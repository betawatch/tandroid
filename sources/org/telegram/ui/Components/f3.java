package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ f3(int i10, int[] iArr, org.telegram.ui.d20 d20Var) {
        this.b = i10;
        this.c = iArr;
        this.d = d20Var;
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

    public /* synthetic */ f3(int[] iArr, Runnable runnable, int i10) {
        this.c = iArr;
        this.b = i10;
        this.d = runnable;
    }
}
