package org.telegram.messenger;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public class wz {
    public final String c;
    public int d;
    public final /* synthetic */ xz e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public wz(xz xzVar, String str) {
        this.e = xzVar;
        this.c = str;
        xzVar.a++;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c);
        sb2.append(": ");
        sb2.append(this.b < 0 ? "not done" : a8.p0.r(new StringBuilder(), this.b - this.a, "ms"));
        return sb2.toString();
    }
}
