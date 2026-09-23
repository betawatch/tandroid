package org.telegram.messenger;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
