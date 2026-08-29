package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x60 b;

    public /* synthetic */ f80(x60 x60Var, int i10) {
        this.a = i10;
        this.b = x60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        x60 x60Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                try {
                    x60Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.x1;
                try {
                    x60Var.run();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.x1;
                try {
                    x60Var.run();
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
        }
    }
}
