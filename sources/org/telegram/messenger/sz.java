package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class sz {
    public final String c;
    public int d;
    public final /* synthetic */ tz e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public sz(tz tzVar, String str) {
        this.e = tzVar;
        this.c = str;
        tzVar.a++;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c);
        sb2.append(": ");
        sb2.append(this.b < 0 ? "not done" : a8.p0.r(new StringBuilder(), this.b - this.a, "ms"));
        return sb2.toString();
    }
}
