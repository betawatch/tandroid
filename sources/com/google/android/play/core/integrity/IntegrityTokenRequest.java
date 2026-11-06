package com.google.android.play.core.integrity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class IntegrityTokenRequest {

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j3);

        public abstract Builder setNonce(String str);
    }

    public static Builder builder() {
        return new am();
    }

    public abstract Long cloudProjectNumber();

    public abstract String nonce();
}
