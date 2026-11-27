package androidx.car.app;

import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class HandshakeInfo {
    private final int mHostCarAppApiLevel;
    private final String mHostPackageName;

    private HandshakeInfo() {
        this.mHostPackageName = null;
        this.mHostCarAppApiLevel = 0;
    }

    public int getHostCarAppApiLevel() {
        return this.mHostCarAppApiLevel;
    }

    public String getHostPackageName() {
        String str = this.mHostPackageName;
        Objects.requireNonNull(str);
        return str;
    }

    public HandshakeInfo(String str, int i) {
        this.mHostPackageName = str;
        this.mHostCarAppApiLevel = i;
    }
}
