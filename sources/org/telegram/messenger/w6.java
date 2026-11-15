package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class w6 {
    public final int a;
    public final long b;

    public w6(long j3, int i7, long j10) {
        this.a = i7;
        this.b = j10;
    }

    public final int hashCode() {
        long j3 = this.b;
        return (int) (j3 ^ (j3 >>> 32));
    }
}
