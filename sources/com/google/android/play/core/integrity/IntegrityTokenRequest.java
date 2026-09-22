package com.google.android.play.core.integrity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class IntegrityTokenRequest {

    /* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
