package org.telegram.messenger;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
