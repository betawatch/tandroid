package com.google.android.gms.common.api;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class f extends Exception {

    @Deprecated
    protected final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Status status) {
        super(r4.toString());
        int i7 = status.a;
        String str = status.b;
        str = str == null ? "" : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 2 + String.valueOf(str).length());
        sb2.append(i7);
        sb2.append(": ");
        sb2.append(str);
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.a;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.b;
    }
}
