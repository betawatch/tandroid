package org.telegram.messenger;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class tz {
    public final String c;
    public int d;
    public final /* synthetic */ uz e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public tz(uz uzVar, String str) {
        this.e = uzVar;
        this.c = str;
        uzVar.a++;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c);
        sb2.append(": ");
        sb2.append(this.b < 0 ? "not done" : a8.p0.r(new StringBuilder(), this.b - this.a, "ms"));
        return sb2.toString();
    }
}
