package androidx.car.app;

import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class HandshakeInfo {
    private final int mHostCarAppApiLevel;
    private final String mHostPackageName;

    public HandshakeInfo(String str, int i10) {
        this.mHostPackageName = str;
        this.mHostCarAppApiLevel = i10;
    }

    public int getHostCarAppApiLevel() {
        return this.mHostCarAppApiLevel;
    }

    public String getHostPackageName() {
        String str = this.mHostPackageName;
        Objects.requireNonNull(str);
        return str;
    }

    private HandshakeInfo() {
        this.mHostPackageName = null;
        this.mHostCarAppApiLevel = 0;
    }
}
