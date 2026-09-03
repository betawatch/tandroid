package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w10 b;

    public /* synthetic */ q80(w10 w10Var, int i10) {
        this.a = i10;
        this.b = w10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        w10 w10Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.y1;
                try {
                    w10Var.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.y1;
                try {
                    w10Var.run();
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.y1;
                try {
                    w10Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
