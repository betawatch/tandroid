package org.telegram.messenger;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class zz {
    public final String c;
    public int d;
    public final /* synthetic */ a00 e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public zz(a00 a00Var, String str) {
        this.e = a00Var;
        this.c = str;
        a00Var.a++;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c);
        sb2.append(": ");
        sb2.append(this.b < 0 ? "not done" : a8.p0.r(new StringBuilder(), this.b - this.a, "ms"));
        return sb2.toString();
    }
}
