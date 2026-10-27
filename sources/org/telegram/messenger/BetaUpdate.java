package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
