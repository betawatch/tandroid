package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;
/* compiled from: HianalyticsExist.java */
/* loaded from: classes.dex */
public class c {
    public static final Object a = new Object();
    public static boolean b = false;
    public static boolean c = false;

    public static boolean a() {
        synchronized (a) {
            if (!b) {
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                } catch (ClassNotFoundException unused) {
                    HMSLog.i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");
                }
                b = true;
                HMSLog.i("HianalyticsExist", "hianalytics exist: " + c);
            }
        }
        return c;
    }
}
