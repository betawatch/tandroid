package org.telegram.messenger;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
