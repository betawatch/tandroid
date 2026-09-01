package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v10 b;

    public /* synthetic */ p80(v10 v10Var, int i10) {
        this.a = i10;
        this.b = v10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        v10 v10Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.y1;
                try {
                    v10Var.run();
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.y1;
                try {
                    v10Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.y1;
                try {
                    v10Var.run();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
