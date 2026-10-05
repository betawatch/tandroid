package org.telegram.messenger;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
