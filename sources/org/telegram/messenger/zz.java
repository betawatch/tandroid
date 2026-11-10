package org.telegram.messenger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
