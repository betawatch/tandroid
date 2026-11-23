package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
