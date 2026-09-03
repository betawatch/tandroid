package j7;

import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class o8 {
    public static String a(String str) {
        if (BuildConfig.BETA_URL.equals(str) || "".equals(str)) {
            return null;
        }
        return str;
    }
}
