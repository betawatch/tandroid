package org.telegram.messenger;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
