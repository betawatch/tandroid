package org.telegram.messenger;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class BetaUpdate {
    public final String changelog;
    public final String version;
    public final int versionCode;

    public BetaUpdate(String str, int i10, String str2) {
        this.version = str;
        this.versionCode = i10;
        this.changelog = str2;
    }

    public boolean higherThan(BetaUpdate betaUpdate) {
        if (betaUpdate != null) {
            return SharedConfig.versionBiggerOrEqual(this.version, betaUpdate.version) && this.versionCode > betaUpdate.versionCode;
        }
        return true;
    }
}
