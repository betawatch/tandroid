package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ int c;

    public /* synthetic */ n70(LaunchActivity launchActivity, int i3, int i10) {
        this.a = i10;
        this.b = launchActivity;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File z10;
        int i3 = this.a;
        int i10 = this.c;
        LaunchActivity launchActivity = this.b;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                ConnectionsManager.getInstance(launchActivity.P).cancelRequest(i10, true);
                break;
            default:
                String str2 = LaunchActivity.E1;
                if (org.telegram.messenger.h10.i(launchActivity.P).p()) {
                    try {
                        SharedPreferences e12 = org.telegram.messenger.hp.e1();
                        int i11 = 2;
                        if ((((i10 == 2 || i10 == 1) && Math.abs(launchActivity.z1 - System.currentTimeMillis()) > 240000) || Math.abs(e12.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (z10 = org.telegram.messenger.w7.z(4)) != null) {
                            StatFs statFs = new StatFs(z10.getAbsolutePath());
                            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                            if (i10 > 0 || availableBlocksLong < 52428800) {
                                if (i10 > 0) {
                                    launchActivity.z1 = System.currentTimeMillis();
                                }
                                e12.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                                org.telegram.messenger.g0.h3(new m60(launchActivity, i11));
                                break;
                            }
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
        }
    }
}
