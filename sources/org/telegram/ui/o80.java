package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g00 b;

    public /* synthetic */ o80(g00 g00Var, int i10) {
        this.a = i10;
        this.b = g00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        g00 g00Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.y1;
                try {
                    g00Var.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.y1;
                try {
                    g00Var.run();
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.y1;
                try {
                    g00Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
