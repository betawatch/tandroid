package com.google.android.gms.common.api;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        int i3 = status.a;
        String str = status.b;
        str = str == null ? "" : str;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 2 + String.valueOf(str).length());
        sb2.append(i3);
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
