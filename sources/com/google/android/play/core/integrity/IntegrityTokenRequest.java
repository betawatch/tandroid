package com.google.android.play.core.integrity;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class IntegrityTokenRequest {

    /* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
