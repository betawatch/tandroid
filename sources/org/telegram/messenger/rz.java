package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class rz {
    public final String c;
    public int d;
    public final /* synthetic */ sz e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public rz(sz szVar, String str) {
        this.e = szVar;
        this.c = str;
        szVar.a++;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c);
        sb2.append(": ");
        sb2.append(this.b < 0 ? "not done" : a1.g.r(new StringBuilder(), this.b - this.a, "ms"));
        return sb2.toString();
    }
}
