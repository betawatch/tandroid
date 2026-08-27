package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ y2(int i10, int[] iArr, org.telegram.ui.a30 a30Var) {
        this.b = i10;
        this.c = iArr;
        this.d = a30Var;
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

    public /* synthetic */ y2(int[] iArr, Runnable runnable, int i10) {
        this.c = iArr;
        this.b = i10;
        this.d = runnable;
    }
}
