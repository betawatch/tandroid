package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a30 b;

    public /* synthetic */ g80(a30 a30Var, int i10) {
        this.a = i10;
        this.b = a30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a30 a30Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                try {
                    a30Var.run();
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.x1;
                try {
                    a30Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.x1;
                try {
                    a30Var.run();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
