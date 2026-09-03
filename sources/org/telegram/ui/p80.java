package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;

    public /* synthetic */ p80(z10 z10Var, int i10) {
        this.a = i10;
        this.b = z10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        z10 z10Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.y1;
                try {
                    z10Var.run();
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.y1;
                try {
                    z10Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.y1;
                try {
                    z10Var.run();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
