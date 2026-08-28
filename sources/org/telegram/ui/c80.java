package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x20 b;

    public /* synthetic */ c80(x20 x20Var, int i9) {
        this.a = i9;
        this.b = x20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        x20 x20Var = this.b;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                try {
                    x20Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.x1;
                try {
                    x20Var.run();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.x1;
                try {
                    x20Var.run();
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
        }
    }
}
