package g7;

import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class k7 {
    public static String a(String str) {
        if (BuildConfig.BETA_URL.equals(str) || "".equals(str)) {
            return null;
        }
        return str;
    }
}
