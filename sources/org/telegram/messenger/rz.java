package org.telegram.messenger;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        sb2.append(this.b < 0 ? "not done" : a8.p0.r(new StringBuilder(), this.b - this.a, "ms"));
        return sb2.toString();
    }
}
