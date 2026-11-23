package org.telegram.messenger;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
